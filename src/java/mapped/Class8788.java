package mapped;

public class Class8788 {
   private static String[] field39523;
   private double field39524;
   private double field39525;
   private long field39526;

   private Class8788() {
   }

   private boolean method31718(long var1) {
      return this.field39526 != var1;
   }

   private void method31719(long var1, double var3) {
      this.field39526 = var1;
      double var7 = var3 - this.field39524;
      var7 = MathHelper.method37790(var7 + 0.5, 1.0) - 0.5;
      this.field39525 += var7 * 0.1;
      this.field39525 *= 0.8;
      this.field39524 = MathHelper.method37790(this.field39524 + this.field39525, 1.0);
   }

   // $VF: synthetic method
   public Class8788(Class8177 var1) {
      this();
   }

   // $VF: synthetic method
   public static boolean method31720(Class8788 var0, long var1) {
      return var0.method31718(var1);
   }

   // $VF: synthetic method
   public static void method31721(Class8788 var0, long var1, double var3) {
      var0.method31719(var1, var3);
   }

   // $VF: synthetic method
   public static double method31722(Class8788 var0) {
      return var0.field39524;
   }
}
