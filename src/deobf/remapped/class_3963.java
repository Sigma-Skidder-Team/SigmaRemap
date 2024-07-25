package remapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class class_3963 extends class_111 {
   private static final Map<Integer, class_2391> field_19194 = new HashMap<Integer, class_2391>();
   private static final Map<Byte, Integer> field_19196 = new HashMap<Byte, Integer>();
   private static final Set<Integer> field_19195 = new HashSet<Integer>();

   public static class_3590 method_18312() {
      class_3963 var2 = new class_3963();
      return var1 -> {
         if (var1.method_42779().equals("minecraft:chest") || var1.method_42779().equals("minecraft:trapped_chest")) {
            if (!var1.method_42778("waterlogged").equals("true")) {
               field_19194.put(var1.method_42777(), class_2391.valueOf(var1.method_42778("facing").toUpperCase(Locale.ROOT)));
               if (var1.method_42779().equalsIgnoreCase("minecraft:trapped_chest")) {
                  field_19195.add(var1.method_42777());
               }

               field_19196.put(method_18311(var1), var1.method_42777());
               class_7943.field_40656.put(var1.method_42777(), var2);
            }
         }
      };
   }

   private static Byte method_18311(class_9297 var0) {
      byte var3 = 0;
      String var4 = var0.method_42778("type");
      if (var4.equals("left")) {
         var3 = (byte)(var3 | 1);
      }

      if (var4.equals("right")) {
         var3 = (byte)(var3 | 2);
      }

      var3 = (byte)(var3 | class_2391.valueOf(var0.method_42778("facing").toUpperCase(Locale.ROOT)).ordinal() << 2);
      if (var0.method_42779().equals("minecraft:trapped_chest")) {
         var3 = (byte)(var3 | 16);
      }

      return var3;
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      class_2391 var6 = field_19194.get(var3);
      byte var7 = 0;
      var7 = (byte)(var7 | var6.ordinal() << 2);
      boolean var8 = field_19195.contains(var3);
      if (var8) {
         var7 = (byte)(var7 | 16);
      }

      int var9;
      if (field_19194.containsKey(var9 = this.method_338(var1, var2.method_43341(class_2391.field_11921))) && var8 == field_19195.contains(var9)) {
         var7 = (byte)(var7 | (var6 != class_2391.field_11928 ? 2 : 1));
      } else if (field_19194.containsKey(var9 = this.method_338(var1, var2.method_43341(class_2391.field_11930))) && var8 == field_19195.contains(var9)) {
         var7 = (byte)(var7 | (var6 != class_2391.field_11927 ? 2 : 1));
      } else if (field_19194.containsKey(var9 = this.method_338(var1, var2.method_43341(class_2391.field_11928))) && var8 == field_19195.contains(var9)) {
         var7 = (byte)(var7 | (var6 != class_2391.field_11921 ? 1 : 2));
      } else if (field_19194.containsKey(var9 = this.method_338(var1, var2.method_43341(class_2391.field_11927))) && var8 == field_19195.contains(var9)) {
         var7 = (byte)(var7 | (var6 != class_2391.field_11930 ? 1 : 2));
      }

      Integer var10 = field_19196.get(var7);
      return var10 != null ? var10 : var3;
   }
}
