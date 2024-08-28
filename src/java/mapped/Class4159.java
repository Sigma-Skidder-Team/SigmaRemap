package mapped;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

public class Class4159 extends Class4147 {
   private static final Map<Integer, Class8049> field20412 = new HashMap<Integer, Class8049>();
   private static final Map<Short, Integer> field20413 = new HashMap<Short, Integer>();

   public static Class8097 method12865() {
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
      Class4159 var3 = new Class4159();
      return var2x -> {
         int var5 = var2.indexOf(var2x.method37757());
         if (var5 != -1) {
            if (!var2x.method37761("waterlogged").equals("true")) {
               String var6 = var2x.method37761("shape");
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

               Class8049 var9 = new Class8049(
                  var2x.method37761("half").equals("bottom"), var8, (byte)var5, Class1983.valueOf(var2x.method37761("facing").toUpperCase(Locale.ROOT))
               );
               field20412.put(var2x.method37758(), var9);
               field20413.put(method12866(var9), var2x.method37758());
               Class9322.field43276.put(var2x.method37758(), var3);
            }
         }
      };
   }

   private static short method12866(Class8049 var0) {
      short var3 = 0;
      if (var0.method27644()) {
         var3 = (short)(var3 | 1);
      }

      var3 = (short)(var3 | var0.method27645() << 1);
      var3 = (short)(var3 | var0.method27646() << 4);
      return (short)(var3 | var0.method27647().ordinal() << 9);
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      Class8049 var6 = field20412.get(var3);
      if (var6 != null) {
         short var7 = 0;
         if (var6.method27644()) {
            var7 = (short)(var7 | 1);
         }

         var7 = (short)(var7 | this.method12867(var1, var2, var6) << 1);
         var7 = (short)(var7 | var6.method27646() << 4);
         var7 = (short)(var7 | var6.method27647().ordinal() << 9);
         Integer var8 = field20413.get(var7);
         return var8 != null ? var8 : var3;
      } else {
         return var3;
      }
   }

   private int method12867(Class7161 var1, Class9695 var2, Class8049 var3) {
      Class1983 var6 = var3.method27647();
      Class8049 var7 = field20412.get(this.method12840(var1, var2.method37961(var6)));
      if (var7 != null && var7.method27644() == var3.method27644()) {
         Class1983 var8 = var7.method27647();
         if (var6.method8269() != var8.method8269() && this.method12868(var1, var3, var2, var8.method8265())) {
            return var8 != this.method12869(var6) ? 4 : 3;
         }
      }

      var7 = field20412.get(this.method12840(var1, var2.method37961(var6.method8265())));
      if (var7 != null && var7.method27644() == var3.method27644()) {
         Class1983 var10 = var7.method27647();
         if (var6.method8269() != var10.method8269() && this.method12868(var1, var3, var2, var10)) {
            return var10 != this.method12869(var6) ? 2 : 1;
         }
      }

      return 0;
   }

   private boolean method12868(Class7161 var1, Class8049 var2, Class9695 var3, Class1983 var4) {
      Class8049 var7 = field20412.get(this.method12840(var1, var3.method37961(var4)));
      return var7 == null || var7.method27647() != var2.method27647() || var7.method27644() != var2.method27644();
   }

   private Class1983 method12869(Class1983 var1) {
      switch (Class8155.field35099[var1.ordinal()]) {
         case 1:
            return Class1983.field12947;
         case 2:
            return Class1983.field12946;
         case 3:
            return Class1983.field12944;
         case 4:
            return Class1983.field12945;
         default:
            return var1;
      }
   }
}
