package remapped;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

public class class_4222 extends class_111 {
   private static final Map<Integer, class_3468> field_20489 = new HashMap<Integer, class_3468>();
   private static final Map<Short, Integer> field_20491 = new HashMap<Short, Integer>();

   public static class_3590 method_19663() {
      LinkedList var2 = new LinkedList();
      var2.add("minecraft:oak_stairs");
      var2.add("minecraft:cobblestone_stairs");
      var2.add("minecraft:brick_stairs");
      var2.add("minecraft:stone_brick_stairs");
      var2.add("minecraft:nether_brick_stairs");
      var2.add("minecraft:sandstone_stairs");
      var2.add("minecraft:spruce_stairs");
      var2.add("minecraft:birch_stairs");
      var2.add("minecraft:jungle_stairs");
      var2.add("minecraft:quartz_stairs");
      var2.add("minecraft:acacia_stairs");
      var2.add("minecraft:dark_oak_stairs");
      var2.add("minecraft:red_sandstone_stairs");
      var2.add("minecraft:purpur_stairs");
      var2.add("minecraft:prismarine_stairs");
      var2.add("minecraft:prismarine_brick_stairs");
      var2.add("minecraft:dark_prismarine_stairs");
      class_4222 var3 = new class_4222();
      return var2x -> {
         int var5 = var2.indexOf(var2x.method_42779());
         if (var5 != -1) {
            if (!var2x.method_42778("waterlogged").equals("true")) {
               String var6 = var2x.method_42778("shape");
               byte var8;
               switch (var6) {
                  case "straight":
                     var8 = 0;
                     break;
                  case "inner_left":
                     var8 = 1;
                     break;
                  case "inner_right":
                     var8 = 2;
                     break;
                  case "outer_left":
                     var8 = 3;
                     break;
                  case "outer_right":
                     var8 = 4;
                     break;
                  default:
                     return;
               }

               class_3468 var9 = new class_3468(
                  var2x.method_42778("half").equals("bottom"),
                  var8,
                  (byte)var5,
                  class_2391.valueOf(var2x.method_42778("facing").toUpperCase(Locale.ROOT)),
                  null
               );
               field_20489.put(var2x.method_42777(), var9);
               field_20491.put(method_19667(var9), var2x.method_42777());
               class_7943.field_40656.put(var2x.method_42777(), var3);
            }
         }
      };
   }

   private static short method_19667(class_3468 var0) {
      short var3 = 0;
      if (var0.method_15943()) {
         var3 = (short)(var3 | 1);
      }

      var3 = (short)(var3 | var0.method_15945() << 1);
      var3 = (short)(var3 | var0.method_15946() << 4);
      return (short)(var3 | var0.method_15947().ordinal() << 9);
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      class_3468 var6 = field_20489.get(var3);
      if (var6 != null) {
         short var7 = 0;
         if (var6.method_15943()) {
            var7 = (short)(var7 | 1);
         }

         var7 = (short)(var7 | this.method_19666(var1, var2, var6) << 1);
         var7 = (short)(var7 | var6.method_15946() << 4);
         var7 = (short)(var7 | var6.method_15947().ordinal() << 9);
         Integer var8 = field_20491.get(var7);
         return var8 != null ? var8 : var3;
      } else {
         return var3;
      }
   }

   private int method_19666(class_1455 var1, class_9371 var2, class_3468 var3) {
      class_2391 var6 = var3.method_15947();
      class_3468 var7 = field_20489.get(this.method_338(var1, var2.method_43341(var6)));
      if (var7 != null && var7.method_15943() == var3.method_15943()) {
         class_2391 var8 = var7.method_15947();
         if (var6.method_10901() != var8.method_10901() && this.method_19664(var1, var3, var2, var8.method_10900())) {
            return var8 != this.method_19665(var6) ? 4 : 3;
         }
      }

      var7 = field_20489.get(this.method_338(var1, var2.method_43341(var6.method_10900())));
      if (var7 != null && var7.method_15943() == var3.method_15943()) {
         class_2391 var10 = var7.method_15947();
         if (var6.method_10901() != var10.method_10901() && this.method_19664(var1, var3, var2, var10)) {
            return var10 != this.method_19665(var6) ? 2 : 1;
         }
      }

      return 0;
   }

   private boolean method_19664(class_1455 var1, class_3468 var2, class_9371 var3, class_2391 var4) {
      class_3468 var7 = field_20489.get(this.method_338(var1, var3.method_43341(var4)));
      return var7 == null || var7.method_15947() != var2.method_15947() || var7.method_15943() != var2.method_15943();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class_2391 method_19665(class_2391 var1) {
      switch (var1) {
         case field_11921:
            return class_2391.field_11928;
         case field_11930:
            return class_2391.field_11927;
         case field_11927:
            return class_2391.field_11921;
         case field_11928:
            return class_2391.field_11930;
         default:
            return var1;
      }
   }
}
