package mapped;

public class Class6839 extends Class6829 {
   private static String[] field29706;
   public final Class1100 field29727;

   public Class6839(Class1100 var1, Class1100 var2) {
      super(var2);
      this.field29727 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29714 == Class2335.field15967) {
         Vector3d var3 = new Vector3d(
            this.field29708 - this.field29727.getPosX(), this.field29709 - this.field29727.getPosY(), this.field29710 - this.field29727.getPosZ()
         );
         double var4 = var3.method11348();
         if (!(var4 < this.field29727.getBoundingBox().method19675())) {
            this.field29727.method3434(this.field29727.method3433().method11338(var3.method11344(this.field29711 * 0.05 / var4)));
            if (this.field29727.method4232() != null) {
               double var6 = this.field29727.method4232().getPosX() - this.field29727.getPosX();
               double var8 = this.field29727.method4232().getPosZ() - this.field29727.getPosZ();
               this.field29727.rotationYaw = -((float) MathHelper.method37814(var6, var8)) * (180.0F / (float)Math.PI);
               this.field29727.field4965 = this.field29727.rotationYaw;
            } else {
               Vector3d var10 = this.field29727.method3433();
               this.field29727.rotationYaw = -((float) MathHelper.method37814(var10.field18048, var10.field18050)) * (180.0F / (float)Math.PI);
               this.field29727.field4965 = this.field29727.rotationYaw;
            }
         } else {
            this.field29714 = Class2335.field15966;
            this.field29727.method3434(this.field29727.method3433().method11344(0.5));
         }
      }
   }
}
