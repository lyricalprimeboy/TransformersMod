package fiskfille.tf.helper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import fiskfille.tf.item.TFItems;
import fiskfille.tf.item.armor.ITransformerArmor;
import fiskfille.tf.transformer.base.Transformer;

public class TFHelper
{
	public static boolean isPlayerCloudtrap(EntityPlayer player)
	{
		return hasGotFullArmor(player) && player.getCurrentArmor(3).getItem() == TFItems.cloudtrapHelmet && player.getCurrentArmor(2).getItem() == TFItems.cloudtrapChestplate && player.getCurrentArmor(1).getItem() == TFItems.cloudtrapLeggings && player.getCurrentArmor(0).getItem() == TFItems.cloudtrapBoots;
	}
	
	public static boolean isPlayerSkystrike(EntityPlayer player)
	{
		return hasGotFullArmor(player) && player.getCurrentArmor(3).getItem() == TFItems.skystrikeHelmet && player.getCurrentArmor(2).getItem() == TFItems.skystrikeChestplate && player.getCurrentArmor(1).getItem() == TFItems.skystrikeLeggings && player.getCurrentArmor(0).getItem() == TFItems.skystrikeBoots;
	}
	
	public static boolean isPlayerPurge(EntityPlayer player)
	{
		return hasGotFullArmor(player) && player.getCurrentArmor(3).getItem() == TFItems.purgeHelmet && player.getCurrentArmor(2).getItem() == TFItems.purgeChestplate && player.getCurrentArmor(1).getItem() == TFItems.purgeLeggings && player.getCurrentArmor(0).getItem() == TFItems.purgeBoots;
	}
	
	public static boolean isPlayerVurp(EntityPlayer player)
	{
		return hasGotFullArmor(player) && player.getCurrentArmor(3).getItem() == TFItems.vurpHelmet && player.getCurrentArmor(2).getItem() == TFItems.vurpChestplate && player.getCurrentArmor(1).getItem() == TFItems.vurpLeggings && player.getCurrentArmor(0).getItem() == TFItems.vurpBoots;
	}
	
	public static boolean isPlayerSubwoofer(EntityPlayer player)
	{
		return hasGotFullArmor(player) && player.getCurrentArmor(3).getItem() == TFItems.subwooferHelmet && player.getCurrentArmor(2).getItem() == TFItems.subwooferChestplate && player.getCurrentArmor(1).getItem() == TFItems.subwooferLeggings && player.getCurrentArmor(0).getItem() == TFItems.subwooferBoots;
	}

	public static boolean hasGotFullArmor(EntityPlayer player)
	{
		return player != null ? player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null : false;
	}
	
	public static boolean isTransformerArmor(EntityPlayer player, Item item)
	{
		return item instanceof ITransformerArmor;
	}
	
	public static boolean isPlayerTransformer(EntityPlayer player) 
	{
		if (hasGotFullArmor(player))
		{
			Item helmet = player.getCurrentArmor(3).getItem();
			Item chestplate = player.getCurrentArmor(2).getItem();
			Item legs = player.getCurrentArmor(1).getItem();
			Item boots = player.getCurrentArmor(0).getItem();
			
			boolean transformerArmour = helmet instanceof ITransformerArmor && chestplate instanceof ITransformerArmor && legs instanceof ITransformerArmor && boots instanceof ITransformerArmor;
			
			return transformerArmour && helmet.getClass() == chestplate.getClass() && helmet.getClass() == legs.getClass() && helmet.getClass() == boots.getClass();
		}
	
		return false;
	}

	public static Transformer getTransformer(EntityPlayer player)
	{
		return isPlayerTransformer(player) ? ((ITransformerArmor)(player.getCurrentArmor(3).getItem())).getTransformer() : null;
	}
}