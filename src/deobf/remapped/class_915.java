package remapped;

public class class_915 extends class_4575 {
   public class_915(class_3229 var1) {
      this.field_4693 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      String var4 = this.field_4693.method_42421((class_8437)var1).toString().replaceAll("_", "");
      byte var5 = 1;
      char var6 = var4.charAt(0);
      if (var6 != '-') {
         if (var6 == '+') {
            var4 = var4.substring(1);
         }
      } else {
         var5 = -1;
         var4 = var4.substring(1);
      }

      byte var7 = 10;
      if ("0".equals(var4)) {
         return 0;
      } else {
         if (!var4.startsWith("0b")) {
            if (!var4.startsWith("0x")) {
               if (!var4.startsWith("0")) {
                  if (var4.indexOf(58) == -1) {
                     return class_3229.method_14791(this.field_4693, var5, var4, 10);
                  }

                  String[] var8 = var4.split(":");
                  byte var9 = 1;
                  int var10 = 0;
                  int var11 = 0;

                  for (int var12 = var8.length; var11 < var12; var11++) {
                     var10 = (int)((long)var10 + Long.parseLong(var8[var12 - var11 - 1]) * (long)var9);
                     var9 *= 60;
                  }

                  return class_3229.method_14791(this.field_4693, var5, String.valueOf(var10), 10);
               }

               var4 = var4.substring(1);
               var7 = 8;
            } else {
               var4 = var4.substring(2);
               var7 = 16;
            }
         } else {
            var4 = var4.substring(2);
            var7 = 2;
         }

         return class_3229.method_14791(this.field_4693, var5, var4, var7);
      }
   }
}
