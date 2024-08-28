package mapped;

public class Class1213 extends Class1210 {
   private static String[] field6525;
   private Class6679 field6526 = null;

   public Class1213(int var1, int var2, int var3, int var4, int var5, Class6679 var6, String var7) {
      super(var1, var2, var3, var4, var5, var7);
      this.field6526 = var6;
   }

   @Override
   public boolean method5735(int var1) {
      return !(this.field6526 instanceof Class6681) ? true : var1 == 0;
   }

   public Class6679 method5769() {
      return this.field6526;
   }

   public void method5770() {
   }

   public boolean method5771() {
      return true;
   }
}
