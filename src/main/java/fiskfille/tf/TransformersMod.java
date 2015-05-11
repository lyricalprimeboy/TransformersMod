package fiskfille.tf;

import fiskfille.tf.common.achievement.TFAchievements;
import fiskfille.tf.common.block.TFBlocks;
import fiskfille.tf.common.entity.TFEntities;
import fiskfille.tf.common.event.TFEvents;
import fiskfille.tf.common.item.TFItems;
import fiskfille.tf.common.network.base.TFNetworkManager;
import fiskfille.tf.common.proxy.CommonProxy;
import fiskfille.tf.common.recipe.TFRecipes;
import fiskfille.tf.common.tab.CreativeTabTransformers;
import fiskfille.tf.common.worldgen.OreWorldGenerator;
import fiskfille.tf.config.TFConfig;
import fiskfille.tf.web.donator.Donators;
import fiskfille.tf.web.update.Update;
import fiskfille.tf.web.update.UpdateChecker;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Method;

@Mod(modid = TransformersMod.modid, name = "Transformers Mod", version = TransformersMod.version, guiFactory = "fiskfille.tf.client.gui.TFGuiFactory")
public class TransformersMod
{
    public static final String modid = "transformers";
    public static final String version = "0.5.0";
    @Mod.Instance(TransformersMod.modid)
    public static TransformersMod instance;
    public static Configuration configFile;
    @SidedProxy(clientSide = "fiskfille.tf.common.proxy.ClientProxy", serverSide = "fiskfille.tf.common.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static TFConfig config = new TFConfig();
    public static CreativeTabs tabTransformers = new CreativeTabTransformers();
    public static Method setSizeMethod;
    public static Update latestUpdate;
    public TFItems items = new TFItems();
    public TFBlocks blocks = new TFBlocks();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        TransformerManager.register();

        configFile = new Configuration(event.getSuggestedConfigurationFile());
        configFile.load();
        config.load(configFile);

        if (configFile.hasChanged())
        {
            configFile.save();
        }

        if (TFConfig.checkForUpdates)
        {
            UpdateChecker updateChecker = new UpdateChecker();
            updateChecker.handleUpdates();
            Donators.loadDonators();
        }

        items.register();
        blocks.register();

        TFAchievements.register();
        TFRecipes.registerRecipes();
        TFEntities.registerEntities();

        GameRegistry.registerWorldGenerator(new OreWorldGenerator(), 0);

        for (Method method : Entity.class.getDeclaredMethods())
        {
            Class<?>[] parameters = method.getParameterTypes();

            if (parameters.length == 2)
            {
                if (parameters[0] == float.class && parameters[1] == float.class)
                {
                    method.setAccessible(true);
                    setSizeMethod = method;
                    break;
                }
            }
        }

        TFEvents.registerEvents(event.getSide());
        TFNetworkManager.registerPackets();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenderInformation();
        proxy.registerKeyBinds();
        proxy.registerTickHandlers();
    }
}