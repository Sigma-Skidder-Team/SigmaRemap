package remapped;

public class class_6277 {
   public static void main(String[] var0) throws Exception {
      class_1935[] var3 = class_1935.values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         class_1935 var5 = var3[var4];
         method_28614("******** " + var5 + " ***********");
         method_28615(var5, false);
      }
   }

   private static void method_28615(class_1935 var0, boolean var1) {
      class_9299.field_47437 = var1;
      double var4;
      double var6;
      switch (var0) {
         case field_9889:
         case field_9894:
            var4 = (double)(-class_9299.field_47442);
            var6 = (double)class_9299.field_47442;
            break;
         case field_9890:
         case field_9893:
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
         switch (var0) {
            case field_9889:
               var12 = (float)Math.sin(var10);
               var13 = class_9299.method_42818((float)var10);
               break;
            case field_9894:
               var12 = (float)Math.cos(var10);
               var13 = class_9299.method_42840((float)var10);
               break;
            case field_9890:
               var12 = (float)Math.asin(var10);
               var13 = class_1750.method_7794((float)var10);
               break;
            case field_9893:
               var12 = (float)Math.acos(var10);
               var13 = class_1750.method_7796((float)var10);
               break;
            default:
               return;
         }

         method_28614(String.format("%.2f, Math: %f, Helper: %f, diff: %f", var10, var12, var13, Math.abs(var12 - var13)));
      }
   }

   public static void method_28614(String var0) {
      System.out.println(var0);
   }
}
