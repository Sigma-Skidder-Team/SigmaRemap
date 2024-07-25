package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_6497 implements class_3608 {
   private Map<String, class_3999> field_33083 = new HashMap<String, class_3999>();

   public class_6497(Map<String, class_3999> var1) {
      this.method_29623();

      for (String var5 : var1.keySet()) {
         class_3999 var6 = (class_3999)var1.get(var5);
         this.method_29626(var5, var6);
      }
   }

   private void method_29623() {
      class_4487[] var3 = class_4487.values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         class_4487 var5 = var3[var4];
         this.method_29624(this.field_33083, var5);
      }

      class_7340[] var11 = class_7340.values();

      for (int var12 = 0; var12 < var11.length; var12++) {
         class_7340 var6 = var11[var12];
         this.field_33083.put(var6.method_33470(), var6);
      }

      for (Identifier var15 : class_5630.method_25515()) {
         String var7 = var15.method_21456().trim();
         var7 = "BIOME_" + var7.toUpperCase().replace(' ', '_');
         int var8 = class_5630.method_25521(var15);
         class_4570 var9 = new class_4570((float)var8);
         this.method_29626(var7, var9);
      }

      class_8862[] var14 = class_8862.values();

      for (int var16 = 0; var16 < var14.length; var16++) {
         class_8862 var19 = var14[var16];
         String var21 = "CAT_" + var19.method_21049().toUpperCase();
         class_4570 var23 = new class_4570((float)var16);
         this.method_29626(var21, var23);
      }

      class_6750[] var17 = class_6750.values();

      for (int var20 = 0; var20 < var17.length; var20++) {
         class_6750 var22 = var17[var20];
         String var24 = "PPT_" + var22.method_21049().toUpperCase();
         class_4570 var10 = new class_4570((float)var20);
         this.method_29626(var24, var10);
      }
   }

   private void method_29624(Map<String, class_3999> var1, class_4487 var2) {
      String[] var5 = var2.method_20837();
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            String[] var8 = var2.method_20838();
            if (var8 != null) {
               for (int var9 = 0; var9 < var8.length; var9++) {
                  String var10 = var8[var9];
                  var1.put(var2.method_20843() + "." + var7 + "." + var10, new class_1813(var2, var6, var9));
               }
            } else {
               var1.put(var2.method_20843() + "." + var7, new class_1813(var2, var6));
            }
         }
      } else {
         var1.put(var2.method_20843(), new class_1813(var2));
      }
   }

   public boolean method_29626(String var1, class_3999 var2) {
      if (!this.field_33083.containsKey(var1)) {
         this.field_33083.put(var1, var2);
         return true;
      } else {
         class_1910.method_8669("Expression already defined: " + var1);
         return false;
      }
   }

   @Override
   public class_3999 method_16829(String var1) {
      return this.field_33083.get(var1);
   }

   public boolean method_29627(String var1) {
      return this.field_33083.containsKey(var1);
   }
}
