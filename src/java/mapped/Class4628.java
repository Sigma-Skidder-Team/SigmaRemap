package mapped;

public class Class4628 extends Class4626 {
   public final Class6211 field22152;

   public Class4628(Class6211 var1) {
      this.field22152 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      String var4 = this.field22152.method19165((Class7256)var1).toString().replaceAll("_", "");
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
                     return Class6211.method19154(this.field22152, var5, var4, 10);
                  }

                  String[] var8 = var4.split(":");
                  byte var9 = 1;
                  int var10 = 0;
                  int var11 = 0;

                  for (int var12 = var8.length; var11 < var12; var11++) {
                     var10 = (int)((long)var10 + Long.parseLong(var8[var12 - var11 - 1]) * (long)var9);
                     var9 *= 60;
                  }

                  return Class6211.method19154(this.field22152, var5, String.valueOf(var10), 10);
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

         return Class6211.method19154(this.field22152, var5, var4, var7);
      }
   }
}
