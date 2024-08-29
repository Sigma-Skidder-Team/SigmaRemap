package mapped;

public class Class4603 extends Class4601 {
   private static String[] field22095;
   private boolean field22104;
   private boolean field22105;
   private final ParticleManager field22106;
   private float field22107;
   private float field22108;
   private float field22109;
   private boolean field22110;

   public Class4603(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, ParticleManager var14, Class8975 var15) {
      super(var1, var2, var4, var6, var15, -0.004F);
      this.field22044 = var8;
      this.field22045 = var10;
      this.field22046 = var12;
      this.field22106 = var14;
      this.field22035 *= 0.75F;
      this.field22056 = 48 + this.field22054.nextInt(12);
      this.method14508(var15);
   }

   public void method14538(boolean var1) {
      this.field22104 = var1;
   }

   public void method14539(boolean var1) {
      this.field22105 = var1;
   }

   @Override
   public void method14510(Class5422 var1, Class9624 var2, float var3) {
      if (!this.field22105 || this.field22055 < this.field22056 / 3 || (this.field22055 + this.field22056) / 3 % 2 == 0) {
         super.method14510(var1, var2, var3);
      }
   }

   @Override
   public void method14500() {
      super.method14500();
      if (this.field22104 && this.field22055 < this.field22056 / 2 && (this.field22055 + this.field22056) % 2 == 0) {
         Class4603 var3 = new Class4603(this.field22037, this.field22041, this.field22042, this.field22043, 0.0, 0.0, 0.0, this.field22106, this.field22096);
         var3.method14515(0.99F);
         var3.method14514(this.field22058, this.field22059, this.field22060);
         var3.field22055 = var3.field22056 / 2;
         if (this.field22110) {
            var3.field22110 = true;
            var3.field22107 = this.field22107;
            var3.field22108 = this.field22108;
            var3.field22109 = this.field22109;
         }

         var3.field22105 = this.field22105;
         this.field22106.method1199(var3);
      }
   }
}
