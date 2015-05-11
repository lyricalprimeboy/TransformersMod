package fiskfille.tf.client.model.transformer.vehicle;

import fiskfille.tf.client.model.tools.MowzieModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelVurpVehicle extends ModelBaseVehicle
{
    public MowzieModelRenderer vehicleBase;
    public MowzieModelRenderer vehicleWaist1;
    public MowzieModelRenderer vehicleWaist2;
    public MowzieModelRenderer vehicleWaistConnector1;
    public MowzieModelRenderer vehicleTorsoconnector1;
    public MowzieModelRenderer vehicleUpperlegR1;
    public MowzieModelRenderer vehicleUpperlegL1;
    public MowzieModelRenderer vehicleRplate1;
    public MowzieModelRenderer vehicleLplate1;
    public MowzieModelRenderer vehicleRearplate;
    public MowzieModelRenderer vehicleUpperlegR2;
    public MowzieModelRenderer vehicleKneeR1;
    public MowzieModelRenderer vehicleLowerlegR1;
    public MowzieModelRenderer vehiclelowerlegR7;
    public MowzieModelRenderer vehicleLowerlegR4;
    public MowzieModelRenderer vehicleLowerlegR5;
    public MowzieModelRenderer vehicleWheelBackR;
    public MowzieModelRenderer vehicleupperlegL2;
    public MowzieModelRenderer vehiclekneeL2;
    public MowzieModelRenderer vehiclelowerlegL1;
    public MowzieModelRenderer vehiclelowerlegL7;
    public MowzieModelRenderer vehiclelowerlegL4;
    public MowzieModelRenderer vehiclelowerlegL5;
    public MowzieModelRenderer vehicleWheelBackL;
    public MowzieModelRenderer vehicletorsobase;
    public MowzieModelRenderer vehiclehood1;
    public MowzieModelRenderer vehiclefrontR1;
    public MowzieModelRenderer vehiclefrontL1;
    public MowzieModelRenderer vehiclebackplate1;
    public MowzieModelRenderer vehiclebackplate2;
    public MowzieModelRenderer vehicleWheelR;
    public MowzieModelRenderer vehicleWheelL;
    public MowzieModelRenderer vehiclearmbaseR1;
    public MowzieModelRenderer vehiclearmbaseL1;
    public MowzieModelRenderer vehiclewindow1;
    public MowzieModelRenderer vehiclebaseplate;
    public MowzieModelRenderer vehiclehood2;
    public MowzieModelRenderer vehiclehood3;
    public MowzieModelRenderer vehiclehood4;
    public MowzieModelRenderer vehiclefrontR2;
    public MowzieModelRenderer vehiclefrontL2;
    public MowzieModelRenderer vehicleupperarmR1;
    public MowzieModelRenderer vehicleshoulderL1;
    public MowzieModelRenderer vehiclelowerarmR1;
    public MowzieModelRenderer vehiclelowerarmR2;
    public MowzieModelRenderer vehicleUpperarmL1;
    public MowzieModelRenderer vehicleshoulderL1_1;
    public MowzieModelRenderer vehicleLowerarmL1;
    public MowzieModelRenderer vehicleLowerarmL2;
    public MowzieModelRenderer vehicleWindow2;
    public MowzieModelRenderer vehiclerear1;
    public MowzieModelRenderer vehicleRear2;

    public ModelVurpVehicle()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.vehiclebackplate2 = new MowzieModelRenderer(this, 51, 74);
        this.vehiclebackplate2.mirror = true;
        this.vehiclebackplate2.setRotationPoint(-2.3F, -1.8F, 1.8F);
        this.vehiclebackplate2.addBox(-3.0F, -2.0F, 0.0F, 3, 5, 1);
        this.setRotateAngle(vehiclebackplate2, 1.5882496193148399F, 0.017453292519943295F, -1.5707963267948966F);
        this.vehicleWaistConnector1 = new MowzieModelRenderer(this, 4, 64);
        this.vehicleWaistConnector1.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.vehicleWaistConnector1.addBox(-1.0F, -0.1F, -2.3F, 2, 3, 4);
        this.setRotateAngle(vehicleWaistConnector1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclewindow1 = new MowzieModelRenderer(this, 0, 7);
        this.vehiclewindow1.setRotationPoint(0.0F, -1.9F, -1.2F);
        this.vehiclewindow1.addBox(-2.5F, -0.2F, 0.0F, 5, 2, 3);
        this.setRotateAngle(vehiclewindow1, 0.33161255787892263F, 0.0F, 0.0F);
        this.vehicleLowerlegR1 = new MowzieModelRenderer(this, 0, 77);
        this.vehicleLowerlegR1.setRotationPoint(-0.8F, 2.0F, 1.5F);
        this.vehicleLowerlegR1.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 2);
        this.setRotateAngle(vehicleLowerlegR1, 3.141592653589793F, 0.0F, -0.017453292519943295F);
        this.vehiclelowerlegL1 = new MowzieModelRenderer(this, 0, 77);
        this.vehiclelowerlegL1.mirror = true;
        this.vehiclelowerlegL1.setRotationPoint(0.8F, 2.0F, 1.5F);
        this.vehiclelowerlegL1.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 2);
        this.setRotateAngle(vehiclelowerlegL1, 3.141592653589793F, 0.0F, 0.017453292519943295F);
        this.vehicleLowerarmL1 = new MowzieModelRenderer(this, 64, 65);
        this.vehicleLowerarmL1.setRotationPoint(0.0F, 3.3F, 0.4F);
        this.vehicleLowerarmL1.addBox(-1.1F, -0.2F, -1.6F, 2, 4, 3);
        this.setRotateAngle(vehicleLowerarmL1, -3.141592653589793F, 0.0F, 0.0F);
        this.vehiclefrontL2 = new MowzieModelRenderer(this, 48, 70);
        this.vehiclefrontL2.mirror = true;
        this.vehiclefrontL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclefrontL2.addBox(-0.5F, -2.0F, -3.7F, 2, 1, 3);
        this.setRotateAngle(vehiclefrontL2, 0.24434609527920614F, 0.0F, 0.017453292519943295F);
        this.vehicleWaist2 = new MowzieModelRenderer(this, 0, 64);
        this.vehicleWaist2.setRotationPoint(0.0F, 7.0F, 1.5F);
        this.vehicleWaist2.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1);
        this.setRotateAngle(vehicleWaist2, -1.5707963267948966F, 0.0F, -3.211405823669566F);
        this.vehicleupperarmR1 = new MowzieModelRenderer(this, 74, 60);
        this.vehicleupperarmR1.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.vehicleupperarmR1.addBox(0.0F, 0.8F, -0.5F, 1, 3, 1);
        this.setRotateAngle(vehicleupperarmR1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclehood3 = new MowzieModelRenderer(this, 47, 65);
        this.vehiclehood3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclehood3.addBox(-1.8F, -3.3F, -1.0F, 1, 4, 1);
        this.setRotateAngle(vehiclehood3, -0.005235987755982988F, 0.003490658503988659F, -0.22165681500327983F);
        this.vehicleTorsoconnector1 = new MowzieModelRenderer(this, 35, 60);
        this.vehicleTorsoconnector1.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.vehicleTorsoconnector1.addBox(-1.2F, -4.0F, -0.8F, 2, 4, 2);
        this.setRotateAngle(vehicleTorsoconnector1, 0.0F, 0.7853981633974483F, 0.0F);
        this.vehiclelowerlegL5 = new MowzieModelRenderer(this, 16, 75);
        this.vehiclelowerlegL5.mirror = true;
        this.vehiclelowerlegL5.setRotationPoint(1.4F, 0.0F, 0.0F);
        this.vehiclelowerlegL5.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1);
        this.setRotateAngle(vehiclelowerlegL5, -0.15707963267948966F, 0.06981317007977318F, 0.05235987755982988F);
        this.vehiclehood2 = new MowzieModelRenderer(this, 47, 65);
        this.vehiclehood2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclehood2.addBox(0.8F, -3.3F, -1.0F, 1, 4, 1);
        this.setRotateAngle(vehiclehood2, -0.005235987755982988F, 0.003490658503988659F, 0.22165681500327983F);
        this.vehicleLowerlegR5 = new MowzieModelRenderer(this, 16, 75);
        this.vehicleLowerlegR5.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.vehicleLowerlegR5.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
        this.setRotateAngle(vehicleLowerlegR5, -0.15707963267948966F, -0.06981317007977318F, -0.05235987755982988F);
        this.vehiclelowerlegL4 = new MowzieModelRenderer(this, 8, 83);
        this.vehiclelowerlegL4.setRotationPoint(-0.3F, 2.5F, 0.9F);
        this.vehiclelowerlegL4.addBox(-0.5F, -2.0F, -2.0F, 1, 3, 2);
        this.setRotateAngle(vehiclelowerlegL4, 0.15707963267948966F, -0.10471975511965977F, 0.08726646259971647F);
        this.vehiclehood4 = new MowzieModelRenderer(this, 51, 65);
        this.vehiclehood4.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.vehiclehood4.addBox(-1.5F, -0.7F, -1.4F, 3, 2, 1);
        this.setRotateAngle(vehiclehood4, 1.3526301702956054F, 0.0F, 0.0F);
        this.vehicleWindow2 = new MowzieModelRenderer(this, 0, 24);
        this.vehicleWindow2.setRotationPoint(0.0F, -0.2F, 3.0F);
        this.vehicleWindow2.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 2);
        this.setRotateAngle(vehicleWindow2, -0.20943951023931953F, 0.0F, 0.0F);
        this.vehiclelowerlegR7 = new MowzieModelRenderer(this, 14, 85);
        this.vehiclelowerlegR7.setRotationPoint(0.5F, 1.0F, 1.6F);
        this.vehiclelowerlegR7.addBox(-2.4F, -0.5F, -1.0F, 3, 2, 1);
        this.setRotateAngle(vehiclelowerlegR7, 0.6108652381980153F, -0.05235987755982988F, 0.0F);
        this.vehiclelowerarmR2 = new MowzieModelRenderer(this, 74, 68);
        this.vehiclelowerarmR2.setRotationPoint(-1.5F, 3.5F, 0.0F);
        this.vehiclelowerarmR2.addBox(0.0F, -3.0F, -1.9F, 1, 3, 2);
        this.setRotateAngle(vehiclelowerarmR2, 0.03490658503988659F, -0.2617993877991494F, -0.10122909661567112F);
        this.vehicleRplate1 = new MowzieModelRenderer(this, 0, 17);
        this.vehicleRplate1.setRotationPoint(0.0F, 0.4F, 0.3F);
        this.vehicleRplate1.addBox(-3.4F, -0.9F, -5.2F, 3, 1, 6);
        this.setRotateAngle(vehicleRplate1, 0.061086523819801536F, 0.05235987755982988F, -0.017453292519943295F);
        this.vehiclefrontL1 = new MowzieModelRenderer(this, 35, 77);
        this.vehiclefrontL1.mirror = true;
        this.vehiclefrontL1.setRotationPoint(1.8F, -0.1F, -0.9F);
        this.vehiclefrontL1.addBox(-0.5F, -1.0F, -4.0F, 2, 2, 3);
        this.vehiclebaseplate = new MowzieModelRenderer(this, 13, 0);
        this.vehiclebaseplate.setRotationPoint(-2.5F, 0.1F, -4.5F);
        this.vehiclebaseplate.addBox(0.0F, 0.0F, 0.0F, 5, 1, 13);
        this.vehiclebackplate1 = new MowzieModelRenderer(this, 51, 74);
        this.vehiclebackplate1.setRotationPoint(2.3F, -1.8F, 1.8F);
        this.vehiclebackplate1.addBox(0.0F, -2.0F, 0.0F, 3, 5, 1);
        this.setRotateAngle(vehiclebackplate1, 1.5882496193148399F, -0.017453292519943295F, 1.5707963267948966F);
        this.vehicleLplate1 = new MowzieModelRenderer(this, 0, 17);
        this.vehicleLplate1.mirror = true;
        this.vehicleLplate1.setRotationPoint(0.0F, 0.4F, 0.3F);
        this.vehicleLplate1.addBox(0.4F, -0.9F, -5.2F, 3, 1, 6);
        this.setRotateAngle(vehicleLplate1, 0.061086523819801536F, -0.05235987755982988F, 0.017453292519943295F);
        this.vehiclelowerarmR1 = new MowzieModelRenderer(this, 64, 65);
        this.vehiclelowerarmR1.mirror = true;
        this.vehiclelowerarmR1.setRotationPoint(1.0F, 3.3F, 0.4F);
        this.vehiclelowerarmR1.addBox(-0.9F, -0.2F, -1.6F, 2, 4, 3);
        this.setRotateAngle(vehiclelowerarmR1, -3.141592653589793F, 0.0F, 0.0F);
        this.vehiclerear1 = new MowzieModelRenderer(this, 0, 0);
        this.vehiclerear1.setRotationPoint(0.0F, 0.3F, 4.0F);
        this.vehiclerear1.addBox(-2.5F, 0.1F, 0.0F, 5, 2, 5);
        this.setRotateAngle(vehiclerear1, -0.3141592653589793F, 0.0F, 0.0F);
        this.vehiclearmbaseR1 = new MowzieModelRenderer(this, 64, 60);
        this.vehiclearmbaseR1.setRotationPoint(-1.0F, -0.4F, 1.0F);
        this.vehiclearmbaseR1.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 3);
        this.vehicleWaist1 = new MowzieModelRenderer(this, 0, 64);
        this.vehicleWaist1.mirror = true;
        this.vehicleWaist1.setRotationPoint(0.0F, 7.0F, 1.5F);
        this.vehicleWaist1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
        this.setRotateAngle(vehicleWaist1, -1.5707963267948966F, 0.0F, 3.211405823669566F);
        this.vehiclelowerlegL7 = new MowzieModelRenderer(this, 14, 85);
        this.vehiclelowerlegL7.mirror = true;
        this.vehiclelowerlegL7.setRotationPoint(-0.5F, 1.0F, 1.6F);
        this.vehiclelowerlegL7.addBox(-0.6F, -0.5F, -1.0F, 3, 2, 1);
        this.setRotateAngle(vehiclelowerlegL7, 0.6108652381980153F, 0.05235987755982988F, 0.0F);
        this.vehicleshoulderL1_1 = new MowzieModelRenderer(this, 78, 60);
        this.vehicleshoulderL1_1.mirror = true;
        this.vehicleshoulderL1_1.setRotationPoint(2.3F, 0.0F, -1.6F);
        this.vehicleshoulderL1_1.addBox(-1.0F, -1.4F, -1.5F, 1, 3, 3);
        this.setRotateAngle(vehicleshoulderL1_1, -0.019198621771937624F, 0.0F, 0.0F);
        this.vehicleshoulderL1 = new MowzieModelRenderer(this, 78, 60);
        this.vehicleshoulderL1.setRotationPoint(-2.3F, 0.0F, -1.6F);
        this.vehicleshoulderL1.addBox(0.0F, -1.4F, -1.5F, 1, 3, 3);
        this.setRotateAngle(vehicleshoulderL1, -0.019198621771937624F, 0.0F, 0.0F);
        this.vehiclefrontR1 = new MowzieModelRenderer(this, 35, 77);
        this.vehiclefrontR1.setRotationPoint(-1.8F, -0.1F, -0.9F);
        this.vehiclefrontR1.addBox(-1.5F, -1.0F, -4.0F, 2, 2, 3);
        this.vehicleUpperlegR2 = new MowzieModelRenderer(this, 6, 72);
        this.vehicleUpperlegR2.setRotationPoint(-2.0F, -0.5F, -0.5F);
        this.vehicleUpperlegR2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.setRotateAngle(vehicleUpperlegR2, 0.0F, 0.05235987755982988F, -0.03490658503988659F);
        this.vehicleupperlegL2 = new MowzieModelRenderer(this, 6, 72);
        this.vehicleupperlegL2.setRotationPoint(2.0F, -0.5F, -0.5F);
        this.vehicleupperlegL2.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1);
        this.setRotateAngle(vehicleupperlegL2, 0.0F, -0.05235987755982988F, 0.03490658503988659F);
        this.vehiclekneeL2 = new MowzieModelRenderer(this, 10, 71);
        this.vehiclekneeL2.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.vehiclekneeL2.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
        this.vehicleUpperlegR1 = new MowzieModelRenderer(this, 0, 71);
        this.vehicleUpperlegR1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.vehicleUpperlegR1.addBox(-1.0F, -1.0F, -1.0F, 1, 4, 2);
        this.setRotateAngle(vehicleUpperlegR1, -1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclefrontR2 = new MowzieModelRenderer(this, 48, 70);
        this.vehiclefrontR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclefrontR2.addBox(-1.5F, -2.0F, -3.7F, 2, 1, 3);
        this.setRotateAngle(vehiclefrontR2, 0.24434609527920614F, 0.0F, -0.017453292519943295F);
        this.vehicleKneeR1 = new MowzieModelRenderer(this, 10, 71);
        this.vehicleKneeR1.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.vehicleKneeR1.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
        this.vehicleUpperarmL1 = new MowzieModelRenderer(this, 74, 60);
        this.vehicleUpperarmL1.mirror = true;
        this.vehicleUpperarmL1.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.vehicleUpperarmL1.addBox(0.0F, 0.8F, -0.5F, 1, 3, 1);
        this.setRotateAngle(vehicleUpperarmL1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleLowerarmL2 = new MowzieModelRenderer(this, 74, 68);
        this.vehicleLowerarmL2.mirror = true;
        this.vehicleLowerarmL2.setRotationPoint(1.5F, 3.5F, 0.0F);
        this.vehicleLowerarmL2.addBox(-1.0F, -3.0F, -1.9F, 1, 3, 2);
        this.setRotateAngle(vehicleLowerarmL2, 0.03490658503988659F, 0.2617993877991494F, 0.10122909661567112F);
        this.vehicleLowerlegR4 = new MowzieModelRenderer(this, 8, 83);
        this.vehicleLowerlegR4.setRotationPoint(0.3F, 2.5F, 0.9F);
        this.vehicleLowerlegR4.addBox(-0.5F, -2.0F, -2.0F, 1, 3, 2);
        this.setRotateAngle(vehicleLowerlegR4, 0.15707963267948966F, 0.10471975511965977F, -0.08726646259971647F);
        this.vehicleUpperlegL1 = new MowzieModelRenderer(this, 0, 71);
        this.vehicleUpperlegL1.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.vehicleUpperlegL1.addBox(0.0F, -1.0F, -1.0F, 1, 4, 2);
        this.setRotateAngle(vehicleUpperlegL1, -1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleRear2 = new MowzieModelRenderer(this, 0, 27);
        this.vehicleRear2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.vehicleRear2.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 2);
        this.setRotateAngle(vehicleRear2, -0.19198621771937624F, 0.0F, 0.0F);
        this.vehicleRearplate = new MowzieModelRenderer(this, 0, 12);
        this.vehicleRearplate.setRotationPoint(0.0F, 0.6F, -1.1F);
        this.vehicleRearplate.addBox(-1.5F, -1.0F, -4.0F, 3, 1, 4);
        this.vehicleBase = new MowzieModelRenderer(this, 0, 60);
        this.vehicleBase.setRotationPoint(0.0F, 22.3F, 1.0F);
        this.vehicleBase.addBox(-2.0F, 0.0F, -1.0F, 4, 1, 3);
        this.setRotateAngle(vehicleBase, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclehood1 = new MowzieModelRenderer(this, 47, 60);
        this.vehiclehood1.setRotationPoint(0.0F, -0.5F, -3.8F);
        this.vehiclehood1.addBox(-1.5F, -3.0F, -1.0F, 3, 4, 1);
        this.setRotateAngle(vehiclehood1, -1.3439035240356336F, 0.0F, 0.0F);

        this.vehicleWheelBackR = new MowzieModelRenderer(this, 55, 68);
        this.vehicleWheelBackR.setRotationPoint(-1F, 3F, 2.2F);
        this.vehicleWheelBackR.addBox(-1.0F, -1.0F, -1.0F, 1, 2, 2);
        this.vehicleWheelBackL = new MowzieModelRenderer(this, 55, 68);
        this.vehicleWheelBackL.mirror = true;
        this.vehicleWheelBackL.setRotationPoint(1.0F, 3.0F, 2.3F);
        this.vehicleWheelBackL.addBox(0.0F, -1.0F, -1.0F, 1, 2, 2);
        this.vehicleWheelL = new MowzieModelRenderer(this, 55, 68);
        this.vehicleWheelL.mirror = true;
        this.vehicleWheelL.setRotationPoint(2.7F, 0.3F, -2.0F);
        this.vehicleWheelL.addBox(0.0F, -1.0F, -1.0F, 1, 2, 2);
        this.vehicleWheelR = new MowzieModelRenderer(this, 55, 68);
        this.vehicleWheelR.setRotationPoint(-2.7F, 0.3F, -2.0F);
        this.vehicleWheelR.addBox(-1.0F, -1.0F, -1.0F, 1, 2, 2);

        this.vehiclearmbaseL1 = new MowzieModelRenderer(this, 64, 60);
        this.vehiclearmbaseL1.mirror = true;
        this.vehiclearmbaseL1.setRotationPoint(1.0F, -0.4F, 1.0F);
        this.vehiclearmbaseL1.addBox(0.0F, -1.0F, -1.0F, 2, 2, 3);
        this.vehicletorsobase = new MowzieModelRenderer(this, 35, 66);
        this.vehicletorsobase.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.vehicletorsobase.addBox(-2.0F, -2.0F, -1.3F, 4, 3, 4);
        this.setRotateAngle(vehicletorsobase, -1.5707963267948966F, -0.7853981633974483F, 0.0F);

        this.vehicleWaistConnector1.addChild(this.vehicleRearplate);
        this.vehicletorsobase.addChild(this.vehiclehood1);
        this.vehiclelowerlegL1.addChild(this.vehicleWheelBackL);
        this.vehicletorsobase.addChild(this.vehicleWheelL);
        this.vehicletorsobase.addChild(this.vehiclearmbaseL1);
        this.vehicleTorsoconnector1.addChild(this.vehicletorsobase);
        this.vehicletorsobase.addChild(this.vehiclebackplate2);
        this.vehicleBase.addChild(this.vehicleWaistConnector1);
        this.vehicletorsobase.addChild(this.vehiclewindow1);
        this.vehicleKneeR1.addChild(this.vehicleLowerlegR1);
        this.vehiclekneeL2.addChild(this.vehiclelowerlegL1);
        this.vehicleUpperarmL1.addChild(this.vehicleLowerarmL1);
        this.vehicletorsobase.addChild(this.vehicleWheelR);
        this.vehiclefrontL1.addChild(this.vehiclefrontL2);
        this.vehicleBase.addChild(this.vehicleWaist2);
        this.vehiclearmbaseR1.addChild(this.vehicleupperarmR1);
        this.vehiclehood1.addChild(this.vehiclehood3);
        this.vehicleBase.addChild(this.vehicleTorsoconnector1);
        this.vehiclelowerlegL1.addChild(this.vehiclelowerlegL5);
        this.vehiclehood1.addChild(this.vehiclehood2);
        this.vehicleLowerlegR1.addChild(this.vehicleLowerlegR5);
        this.vehiclelowerlegL1.addChild(this.vehiclelowerlegL4);
        this.vehiclehood1.addChild(this.vehiclehood4);
        this.vehiclewindow1.addChild(this.vehicleWindow2);
        this.vehicleupperarmR1.addChild(this.vehiclelowerarmR1);
        this.vehicleKneeR1.addChild(this.vehiclelowerlegR7);
        this.vehiclelowerarmR1.addChild(this.vehiclelowerarmR2);
        this.vehicleWaistConnector1.addChild(this.vehicleRplate1);
        this.vehicletorsobase.addChild(this.vehiclefrontL1);
        this.vehicletorsobase.addChild(this.vehiclebaseplate);
        this.vehicletorsobase.addChild(this.vehiclebackplate1);
        this.vehicleWaistConnector1.addChild(this.vehicleLplate1);
        this.vehicleWindow2.addChild(this.vehiclerear1);
        this.vehicleBase.addChild(this.vehicleWaist1);
        this.vehicletorsobase.addChild(this.vehiclearmbaseR1);
        this.vehiclekneeL2.addChild(this.vehiclelowerlegL7);
        this.vehiclearmbaseL1.addChild(this.vehicleshoulderL1_1);
        this.vehiclearmbaseR1.addChild(this.vehicleshoulderL1);
        this.vehicletorsobase.addChild(this.vehiclefrontR1);
        this.vehicleUpperlegR1.addChild(this.vehicleUpperlegR2);
        this.vehicleUpperlegL1.addChild(this.vehicleupperlegL2);
        this.vehicleUpperlegL1.addChild(this.vehiclekneeL2);
        this.vehicleWaistConnector1.addChild(this.vehicleUpperlegR1);
        this.vehiclefrontR1.addChild(this.vehiclefrontR2);
        this.vehicleUpperlegR1.addChild(this.vehicleKneeR1);
        this.vehiclearmbaseL1.addChild(this.vehicleUpperarmL1);
        this.vehicleWaistConnector1.addChild(this.vehicleUpperlegL1);
        this.vehicleWindow2.addChild(this.vehicleRear2);
        this.vehicleLowerlegR1.addChild(this.vehicleLowerlegR4);
        this.vehicleLowerlegR1.addChild(this.vehicleWheelBackR);
        this.vehicleLowerarmL1.addChild(this.vehicleLowerarmL2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.vehicleBase.render(f5);
    }

    @Override
    public void render()
    {
        vehicleBase.render(0.0625F);

        float scale = 1.25F;
        vehicleWheelR.setScale(1, scale, scale);
        vehicleWheelL.setScale(1, scale, scale);
        vehicleWheelBackR.setScale(1, scale, scale);
        vehicleWheelBackL.setScale(1, scale, scale);
    }

    public void setRotateAngle(MowzieModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
