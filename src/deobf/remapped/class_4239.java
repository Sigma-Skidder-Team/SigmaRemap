package remapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class class_4239 extends class_111 {
   private static final Map<Integer, class_2500> field_20574 = new HashMap<Integer, class_2500>();
   private static final Map<Byte, Integer> field_20573 = new HashMap<Byte, Integer>();
   private static final Map<Integer, class_2391> field_20571 = new HashMap<Integer, class_2391>();

   public static class_3590 method_19775() {
      class_4239 var2 = new class_4239();
      return var1 -> {
         if (!var1.method_42779().equals("minecraft:tripwire_hook")) {
            if (var1.method_42779().equals("minecraft:tripwire")) {
               class_2500 var4 = new class_2500(
                  var1.method_42778("attached").equals("true"), var1.method_42778("disarmed").equals("true"), var1.method_42778("powered").equals("true"), null
               );
               field_20574.put(var1.method_42777(), var4);
               field_20573.put(method_19776(var1), var1.method_42777());
               class_7943.field_40656.put(var1.method_42777(), var2);
            }
         } else {
            field_20571.put(var1.method_42777(), class_2391.valueOf(var1.method_42778("facing").toUpperCase(Locale.ROOT)));
         }
      };
   }

   private static byte method_19776(class_9297 var0) {
      byte var3 = 0;
      if (var0.method_42778("attached").equals("true")) {
         var3 = (byte)(var3 | 1);
      }

      if (var0.method_42778("disarmed").equals("true")) {
         var3 = (byte)(var3 | 2);
      }

      if (var0.method_42778("powered").equals("true")) {
         var3 = (byte)(var3 | 4);
      }

      if (var0.method_42778("east").equals("true")) {
         var3 = (byte)(var3 | 8);
      }

      if (var0.method_42778("north").equals("true")) {
         var3 = (byte)(var3 | 16);
      }

      if (var0.method_42778("south").equals("true")) {
         var3 = (byte)(var3 | 32);
      }

      if (var0.method_42778("west").equals("true")) {
         var3 = (byte)(var3 | 64);
      }

      return var3;
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      class_2500 var6 = field_20574.get(var3);
      if (var6 != null) {
         byte var7 = 0;
         if (var6.method_11417()) {
            var7 = (byte)(var7 | 1);
         }

         if (var6.method_11416()) {
            var7 = (byte)(var7 | 2);
         }

         if (var6.method_11415()) {
            var7 = (byte)(var7 | 4);
         }

         int var8 = this.method_338(var1, var2.method_43341(class_2391.field_11927));
         int var9 = this.method_338(var1, var2.method_43341(class_2391.field_11921));
         int var10 = this.method_338(var1, var2.method_43341(class_2391.field_11930));
         int var11 = this.method_338(var1, var2.method_43341(class_2391.field_11928));
         if (field_20574.containsKey(var8) || field_20571.get(var8) == class_2391.field_11928) {
            var7 = (byte)(var7 | 8);
         }

         if (field_20574.containsKey(var9) || field_20571.get(var9) == class_2391.field_11930) {
            var7 = (byte)(var7 | 16);
         }

         if (field_20574.containsKey(var10) || field_20571.get(var10) == class_2391.field_11921) {
            var7 = (byte)(var7 | 32);
         }

         if (field_20574.containsKey(var11) || field_20571.get(var11) == class_2391.field_11927) {
            var7 = (byte)(var7 | 64);
         }

         Integer var12 = field_20573.get(var7);
         return var12 != null ? var12 : var3;
      } else {
         return var3;
      }
   }
}
