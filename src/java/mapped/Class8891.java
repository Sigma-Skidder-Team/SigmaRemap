package mapped;

public class Class8891 {
   public static void main(String[] var0) throws Exception {
      Class2334[] var3 = Class2334.values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Class2334 var5 = var3[var4];
         method32360("******** " + var5 + " ***********");
         method32359(var5, false);
      }
   }

   private static void method32359(Class2334 var0, boolean var1) {
      Class9679.field45216 = var1;
      double var4;
      double var6;
      switch (Class8364.field35918[var0.ordinal()]) {
         case 1:
         case 2:
            var4 = (double)(-Class9679.field45210);
            var6 = (double)Class9679.field45210;
            break;
         case 3:
         case 4:
            var4 = -1.0;
            var6 = 1.0;
            break;
         default:
            return;
      }

      byte var8 = 10;

      for (int var9 = 0; var9 <= var8; var9++) {
         double var10 = var4 + (double)var9 * (var6 - var4) / (double)var8;
         float var12;
         float var13;
         switch (Class8364.field35918[var0.ordinal()]) {
            case 1:
               var12 = (float)Math.sin(var10);
               var13 = Class9679.method37763((float)var10);
               break;
            case 2:
               var12 = (float)Math.cos(var10);
               var13 = Class9679.method37764((float)var10);
               break;
            case 3:
               var12 = (float)Math.asin(var10);
               var13 = Class7317.method23165((float)var10);
               break;
            case 4:
               var12 = (float)Math.acos(var10);
               var13 = Class7317.method23166((float)var10);
               break;
            default:
               return;
         }

         method32360(String.format("%.2f, Math: %f, Helper: %f, diff: %f", var10, var12, var13, Math.abs(var12 - var13)));
      }
   }

   public static void method32360(String var0) {
      System.out.println(var0);
   }
}
