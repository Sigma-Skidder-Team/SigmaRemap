package mapped;

public class Class8205 implements Class8202 {
   private static String[] field35238;
   public final Class948 field35239;

   public Class8205(Class948 var1) {
      this.field35239 = var1;
   }

   @Override
   public int method28505(int var1) {
      return var1 != 0 ? 0 : Class948.method3818(this.field35239);
   }

   @Override
   public void method28506(int var1, int var2) {
      if (var1 == 0) {
         Class948.method3819(this.field35239, var2);
      }
   }

   @Override
   public int method28507() {
      return 1;
   }
}
