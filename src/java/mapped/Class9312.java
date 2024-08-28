package mapped;

public class Class9312 {
   private static String[] field43241;
   private final int field43242;
   private final Class9312[] field43243 = new Class9312[6];
   private final boolean[] field43244 = new boolean[6];
   private boolean field43245;
   private boolean field43246;
   private int field43247;

   public Class9312(int var1) {
      this.field43242 = var1;
   }

   public void method35186(Direction var1, Class9312 var2) {
      this.field43243[var1.method533()] = var2;
      var2.field43243[var1.method536().method533()] = this;
   }

   public void method35187() {
      for (int var3 = 0; var3 < 6; var3++) {
         this.field43244[var3] = this.field43243[var3] != null;
      }
   }

   public boolean method35188(int var1) {
      if (!this.field43246) {
         this.field43247 = var1;

         for (int var4 = 0; var4 < 6; var4++) {
            if (this.field43243[var4] != null && this.field43244[var4] && this.field43243[var4].field43247 != var1 && this.field43243[var4].method35188(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public boolean method35189() {
      return this.field43242 >= 75;
   }

   public int method35190() {
      int var3 = 0;

      for (int var4 = 0; var4 < 6; var4++) {
         if (this.field43244[var4]) {
            var3++;
         }
      }

      return var3;
   }

   // $VF: synthetic method
   public static Class9312[] method35191(Class9312 var0) {
      return var0.field43243;
   }

   // $VF: synthetic method
   public static int method35192(Class9312 var0) {
      return var0.field43242;
   }

   // $VF: synthetic method
   public static boolean[] method35193(Class9312 var0) {
      return var0.field43244;
   }

   // $VF: synthetic method
   public static boolean method35194(Class9312 var0, boolean var1) {
      return var0.field43245 = var1;
   }

   // $VF: synthetic method
   public static boolean method35195(Class9312 var0) {
      return var0.field43245;
   }

   // $VF: synthetic method
   public static boolean method35196(Class9312 var0, boolean var1) {
      return var0.field43246 = var1;
   }
}
