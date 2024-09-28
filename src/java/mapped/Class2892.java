package mapped;

public class Class2892 extends BipedModel<ArmorStandEntity> {
   private static String[] field17431;

   public Class2892(float var1) {
      this(var1, 64, 32);
   }

   public Class2892(float var1, int var2, int var3) {
      super(var1, 0.0F, var2, var3);
   }

   public void setRotationAngles(ArmorStandEntity var1, float var2, float var3, float var4, float var5, float var6) {
      this.bipedHead.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4211().method22013();
      this.bipedHead.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4211().method22014();
      this.bipedHead.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4211().method22015();
      this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
      this.bipedBody.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.bipedBody.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.bipedBody.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4212().method22015();
      this.bipedLeftArm.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4213().method22013();
      this.bipedLeftArm.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4213().method22014();
      this.bipedLeftArm.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4213().method22015();
      this.bipedRightArm.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4214().method22013();
      this.bipedRightArm.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4214().method22014();
      this.bipedRightArm.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4214().method22015();
      this.bipedLeftLeg.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4215().method22013();
      this.bipedLeftLeg.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4215().method22014();
      this.bipedLeftLeg.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4215().method22015();
      this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
      this.bipedRightLeg.rotateAngleX = (float) (Math.PI / 180.0) * var1.method4216().method22013();
      this.bipedRightLeg.rotateAngleY = (float) (Math.PI / 180.0) * var1.method4216().method22014();
      this.bipedRightLeg.rotateAngleZ = (float) (Math.PI / 180.0) * var1.method4216().method22015();
      this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
      this.bipedHeadwear.copyModelAngles(this.bipedHead);
   }
}
