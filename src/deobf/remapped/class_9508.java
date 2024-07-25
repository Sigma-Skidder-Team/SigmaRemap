package remapped;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

public class class_9508 extends class_111 {
   private static final Map<Integer, class_2561> field_48408 = new HashMap<Integer, class_2561>();
   private static final Map<Short, Integer> field_48410 = new HashMap<Short, Integer>();

   public static class_3590 method_43881() {
      LinkedList var2 = new LinkedList();
      var2.add("minecraft:oak_door");
      var2.add("minecraft:birch_door");
      var2.add("minecraft:jungle_door");
      var2.add("minecraft:dark_oak_door");
      var2.add("minecraft:acacia_door");
      var2.add("minecraft:spruce_door");
      var2.add("minecraft:iron_door");
      class_9508 var3 = new class_9508();
      return var2x -> {
         int var5 = var2.indexOf(var2x.method_42779());
         if (var5 != -1) {
            int var6 = var2x.method_42777();
            class_2561 var7 = new class_2561(
               var2x.method_42778("half").equals("lower"),
               var2x.method_42778("hinge").equals("right"),
               var2x.method_42778("powered").equals("true"),
               var2x.method_42778("open").equals("true"),
               class_2391.valueOf(var2x.method_42778("facing").toUpperCase(Locale.ROOT)),
               var5,
               null
            );
            field_48408.put(var6, var7);
            field_48410.put(method_43880(var7), var6);
            class_7943.field_40656.put(var6, var3);
         }
      };
   }

   private static short method_43880(class_2561 var0) {
      short var3 = 0;
      if (var0.method_11633()) {
         var3 = (short)(var3 | 1);
      }

      if (var0.method_11631()) {
         var3 = (short)(var3 | 2);
      }

      if (var0.method_11632()) {
         var3 = (short)(var3 | 4);
      }

      if (var0.method_11635()) {
         var3 = (short)(var3 | 8);
      }

      var3 = (short)(var3 | var0.method_11637().ordinal() << 4);
      return (short)(var3 | (var0.method_11634() & 7) << 6);
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      class_2561 var6 = field_48408.get(var3);
      if (var6 != null) {
         short var7 = 0;
         var7 = (short)(var7 | (var6.method_11634() & 7) << 6);
         if (!var6.method_11633()) {
            class_2561 var8 = field_48408.get(this.method_338(var1, var2.method_43341(class_2391.field_11922)));
            if (var8 == null) {
               return var3;
            }

            if (var8.method_11631()) {
               var7 = (short)(var7 | 2);
            }

            if (var6.method_11632()) {
               var7 = (short)(var7 | 4);
            }

            if (var6.method_11635()) {
               var7 = (short)(var7 | 8);
            }

            var7 = (short)(var7 | var8.method_11637().ordinal() << 4);
         } else {
            class_2561 var12 = field_48408.get(this.method_338(var1, var2.method_43341(class_2391.field_11924)));
            if (var12 == null) {
               return var3;
            }

            var7 = (short)(var7 | 1);
            if (var6.method_11631()) {
               var7 = (short)(var7 | 2);
            }

            if (var12.method_11632()) {
               var7 = (short)(var7 | 4);
            }

            if (var12.method_11635()) {
               var7 = (short)(var7 | 8);
            }

            var7 = (short)(var7 | var6.method_11637().ordinal() << 4);
         }

         Integer var13 = field_48410.get(var7);
         return var13 != null ? var13 : var3;
      } else {
         return var3;
      }
   }
}
