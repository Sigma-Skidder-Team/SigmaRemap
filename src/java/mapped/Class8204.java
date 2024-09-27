package mapped;

public class Class8204 implements Class8202 {
   private static String[] field35236;
   public final Class924 field35237;

   public Class8204(Class924 var1) {
      this.field35237 = var1;
   }

   @Override
   public int method28505(int var1) {
      switch (var1) {
         case 0:
            return Class924.method3662(this.field35237);
         case 1:
            return Class924.method3663(this.field35237);
         case 2:
            return Class924.method3664(this.field35237);
         case 3:
            return Class924.method3665(this.field35237);
         default:
            return 0;
      }
   }

   @Override
   public void method28506(int var1, int var2) {
      switch (var1) {
         case 0:
            Class924.method3666(this.field35237, var2);
            break;
         case 1:
            Class924.method3667(this.field35237, var2);
            break;
         case 2:
            Class924.method3668(this.field35237, var2);
            break;
         case 3:
            Class924.method3669(this.field35237, var2);
      }
   }

   @Override
   public int size() {
      return 4;
   }
}
