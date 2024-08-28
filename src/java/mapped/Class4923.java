package mapped;

public abstract class Class4923 {
   private int field22827;

   public static Class4923 method15236(Class8202 var0, int var1) {
      return new Class4922(var0, var1);
   }

   public static Class4923 method15237(int[] var0, int var1) {
      return new Class4925(var0, var1);
   }

   public static Class4923 method15238() {
      return new Class4924();
   }

   public abstract int method15234();

   public abstract void method15235(int var1);

   public boolean method15239() {
      int var3 = this.method15234();
      boolean var4 = var3 != this.field22827;
      this.field22827 = var3;
      return var4;
   }
}
