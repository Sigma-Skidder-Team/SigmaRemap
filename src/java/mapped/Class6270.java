package mapped;

import java.util.Map;

public class Class6270 implements Class6267 {
   private Map<String, String> field27751 = null;

   public Class6270(Map<String, String> var1) {
      this.field27751 = var1;
   }

   @Override
   public Class1878 method19230(String var1) {
      String var4 = "defined_";
      if (var1.startsWith(var4)) {
         String var7 = var1.substring(var4.length());
         return !this.field27751.containsKey(var7)
            ? new Class1891(Class2133.field13968, (Class1878[])null)
            : new Class1891(Class2133.field13967, (Class1878[])null);
      } else {
         while (this.field27751.containsKey(var1)) {
            String var5 = this.field27751.get(var1);
            if (var5 == null || var5.equals(var1)) {
               break;
            }

            var1 = var5;
         }

         int var6 = Class7944.method26899(var1, Integer.MIN_VALUE);
         if (var6 != Integer.MIN_VALUE) {
            return new Class1888((float)var6);
         } else {
            Class7944.method26811("Unknown macro value: " + var1);
            return new Class1888(0.0F);
         }
      }
   }
}
