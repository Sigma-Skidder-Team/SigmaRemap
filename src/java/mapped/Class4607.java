package mapped;

public class Class4607 extends Class4566 {
   private static String[] field22114;

   public Class4607(Class1656 var1, double var2, double var4, double var6) {
      super(var1, var2, var4 - 0.125, var6);
      this.field22058 = 0.4F;
      this.field22059 = 0.4F;
      this.field22060 = 0.7F;
      this.method14519(0.01F, 0.01F);
      this.field22035 = this.field22035 * (this.field22054.nextFloat() * 0.6F + 0.2F);
      this.field22056 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.field22049 = false;
   }

   public Class4607(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125, var6, var8, var10, var12);
      this.method14519(0.01F, 0.01F);
      this.field22035 = this.field22035 * (this.field22054.nextFloat() * 0.6F + 0.6F);
      this.field22056 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.field22049 = false;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      if (this.field22056-- > 0) {
         this.method14511(this.field22044, this.field22045, this.field22046);
      } else {
         this.method14518();
      }
   }
}
