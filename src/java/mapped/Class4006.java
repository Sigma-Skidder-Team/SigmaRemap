package mapped;

public class Class4006 extends Class3758 {
   private static String[] field20318;
   public final Class6904 field20319;

   public Class4006(Class6904 var1) {
      this.field20319 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22546);
      this.method12733(var1 -> {
         Class6036 var4 = var1.method30580().<Class6036>method22438(Class6904.method21111(this.field20319));

         for (int var8 : var1.<int[]>method30555(Class4750.field22546, 0)) {
            var4.method18665(var8);
         }
      });
   }
}
