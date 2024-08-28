package mapped;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

public class Class4161 extends Class4147 {
   private static final Map<Integer, Class7731> field20417 = new HashMap<Integer, Class7731>();
   private static final Map<Short, Integer> field20418 = new HashMap<Short, Integer>();

   public static Class8097 method12877() {
      LinkedList var2 = new LinkedList();
      var2.add("minecraft:oak_door");
      var2.add("minecraft:birch_door");
      var2.add("minecraft:jungle_door");
      var2.add("minecraft:dark_oak_door");
      var2.add("minecraft:acacia_door");
      var2.add("minecraft:spruce_door");
      var2.add("minecraft:iron_door");
      Class4161 var3 = new Class4161();
      return var2x -> {
         int var5 = var2.indexOf(var2x.method37757());
         if (var5 != -1) {
            int var6 = var2x.method37758();
            Class7731 var7 = new Class7731(
               var2x.method37761("half").equals("lower"),
               var2x.method37761("hinge").equals("right"),
               var2x.method37761("powered").equals("true"),
               var2x.method37761("open").equals("true"),
               Class1983.valueOf(var2x.method37761("facing").toUpperCase(Locale.ROOT)),
               var5
            );
            field20417.put(var6, var7);
            field20418.put(method12878(var7), var6);
            Class9322.field43276.put(var6, var3);
         }
      };
   }

   private static short method12878(Class7731 var0) {
      short var3 = 0;
      if (var0.method25584()) {
         var3 = (short)(var3 | 1);
      }

      if (var0.method25587()) {
         var3 = (short)(var3 | 2);
      }

      if (var0.method25586()) {
         var3 = (short)(var3 | 4);
      }

      if (var0.method25585()) {
         var3 = (short)(var3 | 8);
      }

      var3 = (short)(var3 | var0.method25588().ordinal() << 4);
      return (short)(var3 | (var0.method25589() & 7) << 6);
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      Class7731 var6 = field20417.get(var3);
      if (var6 != null) {
         short var7 = 0;
         var7 = (short)(var7 | (var6.method25589() & 7) << 6);
         if (!var6.method25584()) {
            Class7731 var8 = field20417.get(this.method12840(var1, var2.method37961(Class1983.field12949)));
            if (var8 == null) {
               return var3;
            }

            if (var8.method25587()) {
               var7 = (short)(var7 | 2);
            }

            if (var6.method25586()) {
               var7 = (short)(var7 | 4);
            }

            if (var6.method25585()) {
               var7 = (short)(var7 | 8);
            }

            var7 = (short)(var7 | var8.method25588().ordinal() << 4);
         } else {
            Class7731 var12 = field20417.get(this.method12840(var1, var2.method37961(Class1983.field12948)));
            if (var12 == null) {
               return var3;
            }

            var7 = (short)(var7 | 1);
            if (var6.method25587()) {
               var7 = (short)(var7 | 2);
            }

            if (var12.method25586()) {
               var7 = (short)(var7 | 4);
            }

            if (var12.method25585()) {
               var7 = (short)(var7 | 8);
            }

            var7 = (short)(var7 | var6.method25588().ordinal() << 4);
         }

         Integer var13 = field20418.get(var7);
         return var13 != null ? var13 : var3;
      } else {
         return var3;
      }
   }
}
