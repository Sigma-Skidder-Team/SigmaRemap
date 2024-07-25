package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_3364 {
   private static final String field_16584 = "_placeholder";
   private static final String field_16585 = "num";
   private static final Logger field_16586 = Logger.getLogger(class_3364.class.getName());

   public static class_2284 method_15411(class_3872 var0) {
      ArrayList var3 = new ArrayList();
      var0.field_18855 = (T)method_15412(var0.field_18855, var3);
      var0.field_18857 = var3.size();
      class_2284 var4 = new class_2284();
      var4.field_11411 = var0;
      var4.field_11412 = var3.<byte[]>toArray(new byte[var3.size()][]);
      return var4;
   }

   private static Object method_15412(Object var0, List<byte[]> var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         class_1293 var13 = new class_1293();

         try {
            var13.method_5823("_placeholder", true);
            var13.method_5818("num", var1.size());
         } catch (class_7584 var9) {
            field_16586.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable)var9);
            return null;
         }

         var1.add((byte[])var0);
         return var13;
      } else if (var0 instanceof class_1336) {
         class_1336 var12 = new class_1336();
         class_1336 var14 = (class_1336)var0;
         int var15 = var14.method_6142();

         for (int var16 = 0; var16 < var15; var16++) {
            try {
               var12.method_6154(var16, method_15412(var14.method_6130(var16), var1));
            } catch (class_7584 var10) {
               field_16586.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable)var10);
               return null;
            }
         }

         return var12;
      } else if (!(var0 instanceof class_1293)) {
         return var0;
      } else {
         class_1293 var4 = new class_1293();
         class_1293 var5 = (class_1293)var0;
         Iterator var6 = var5.method_5841();

         while (var6.hasNext()) {
            String var7 = (String)var6.next();

            try {
               var4.method_5820(var7, method_15412(var5.method_5805(var7), var1));
            } catch (class_7584 var11) {
               field_16586.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable)var11);
               return null;
            }
         }

         return var4;
      }
   }

   public static class_3872 method_15408(class_3872 var0, byte[][] var1) {
      var0.field_18855 = (T)method_15409(var0.field_18855, var1);
      var0.field_18857 = -1;
      return var0;
   }

   private static Object method_15409(Object var0, byte[][] var1) {
      if (var0 instanceof class_1336) {
         class_1336 var10 = (class_1336)var0;
         int var12 = var10.method_6142();

         for (int var13 = 0; var13 < var12; var13++) {
            try {
               var10.method_6154(var13, method_15409(var10.method_6130(var13), var1));
            } catch (class_7584 var8) {
               field_16586.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable)var8);
               return null;
            }
         }

         return var10;
      } else if (!(var0 instanceof class_1293)) {
         return var0;
      } else {
         class_1293 var4 = (class_1293)var0;
         if (var4.method_5867("_placeholder")) {
            int var11 = var4.method_5825("num", -1);
            return var11 >= 0 && var11 < var1.length ? var1[var11] : null;
         } else {
            Iterator var5 = var4.method_5841();

            while (var5.hasNext()) {
               String var6 = (String)var5.next();

               try {
                  var4.method_5820(var6, method_15409(var4.method_5805(var6), var1));
               } catch (class_7584 var9) {
                  field_16586.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable)var9);
                  return null;
               }
            }

            return var4;
         }
      }
   }
}
