package mapped;

public class Class4620 extends Class4566 {
   private static String[] field22134;
   private final Class8975 field22135;

   public Class4620(Class1656 var1, double var2, double var4, double var6, double var8, Class8975 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field22135 = var10;
      this.field22056 = 4;
      float var13 = this.field22054.nextFloat() * 0.6F + 0.4F;
      this.field22058 = var13;
      this.field22059 = var13;
      this.field22060 = var13;
      this.field22035 = 1.0F - (float)var8 * 0.5F;
      this.method14508(var10);
   }

   @Override
   public int method14499(float var1) {
      return 15728880;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22055++ < this.field22056) {
         this.method14508(this.field22135);
      } else {
         this.method14518();
      }
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29737;
   }
}
