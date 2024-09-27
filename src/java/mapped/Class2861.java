package mapped;

public class Class2861<T extends Class1098> extends Class2860<T> {
   private static String[] field17731;
   private float field17732;
   private float field17733;
   private float field17734;

   public Class2861(float var1) {
      super(var1);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17732 = var1.method5264(var4);
      this.field17733 = var1.method5265(var4);
      this.field17734 = var1.method5266(var4);
      if (this.field17732 <= 0.0F) {
         this.field17728.rotateAngleX = 0.0F;
         this.field17728.field31037 = 0.0F;
         this.field17724.rotateAngleX = 0.0F;
         this.field17724.field31037 = 0.0F;
         this.field17725.rotateAngleX = 0.0F;
         this.field17725.field31037 = 0.0F;
         this.field17725.rotationPointX = -1.2F;
         this.field17722.rotateAngleX = 0.0F;
         this.field17723.rotateAngleX = 0.0F;
         this.field17723.field31037 = 0.0F;
         this.field17723.rotationPointX = -1.1F;
         this.field17723.rotationPointY = 18.0F;
      }

      super.method10997((T)var1, var2, var3, var4);
      if (var1.method4395()) {
         this.field17729.rotateAngleX = (float) (Math.PI / 4);
         this.field17729.rotationPointY += -4.0F;
         this.field17729.rotationPointZ += 5.0F;
         this.field17728.rotationPointY += -3.3F;
         this.field17728.rotationPointZ++;
         this.field17726.rotationPointY += 8.0F;
         this.field17726.rotationPointZ += -2.0F;
         this.field17727.rotationPointY += 2.0F;
         this.field17727.rotationPointZ += -0.8F;
         this.field17726.rotateAngleX = 1.7278761F;
         this.field17727.rotateAngleX = 2.670354F;
         this.field17724.rotateAngleX = (float) (-Math.PI / 20);
         this.field17724.rotationPointY = 16.1F;
         this.field17724.rotationPointZ = -7.0F;
         this.field17725.rotateAngleX = (float) (-Math.PI / 20);
         this.field17725.rotationPointY = 16.1F;
         this.field17725.rotationPointZ = -7.0F;
         this.field17722.rotateAngleX = (float) (-Math.PI / 2);
         this.field17722.rotationPointY = 21.0F;
         this.field17722.rotationPointZ = 1.0F;
         this.field17723.rotateAngleX = (float) (-Math.PI / 2);
         this.field17723.rotationPointY = 21.0F;
         this.field17723.rotationPointZ = 1.0F;
         this.field17730 = 3;
      }
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      if (this.field17732 > 0.0F) {
         this.field17728.field31037 = Class9530.method36832(this.field17728.field31037, -1.2707963F, this.field17732);
         this.field17728.rotateAngleY = Class9530.method36832(this.field17728.rotateAngleY, 1.2707963F, this.field17732);
         this.field17724.rotateAngleX = -1.2707963F;
         this.field17725.rotateAngleX = -0.47079635F;
         this.field17725.field31037 = -0.2F;
         this.field17725.rotationPointX = -0.2F;
         this.field17722.rotateAngleX = -0.4F;
         this.field17723.rotateAngleX = 0.5F;
         this.field17723.field31037 = -0.5F;
         this.field17723.rotationPointX = -0.3F;
         this.field17723.rotationPointY = 20.0F;
         this.field17726.rotateAngleX = Class9530.method36832(this.field17726.rotateAngleX, 0.8F, this.field17733);
         this.field17727.rotateAngleX = Class9530.method36832(this.field17727.rotateAngleX, -0.4F, this.field17733);
      }

      if (this.field17734 > 0.0F) {
         this.field17728.rotateAngleX = Class9530.method36832(this.field17728.rotateAngleX, -0.58177644F, this.field17734);
      }
   }
}
