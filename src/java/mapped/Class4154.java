package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

import java.util.HashSet;

public class Class4154 extends Class4147 {
   private static final Int2IntMap field20405 = new Int2IntOpenHashMap();

   public static Class8097 method12857() {
      HashSet var2 = new HashSet();
      var2.add("minecraft:rose_bush");
      var2.add("minecraft:sunflower");
      var2.add("minecraft:peony");
      var2.add("minecraft:tall_grass");
      var2.add("minecraft:large_fern");
      var2.add("minecraft:lilac");
      Class4154 var3 = new Class4154();
      return var2x -> {
         if (var2.contains(var2x.method37757())) {
            Class9322.field43276.put(var2x.method37758(), var3);
            if (var2x.method37761("half").equals("lower")) {
               var2x.method37760("half", "upper");
               field20405.put(var2x.method37758(), var2x.method37759());
            }
         }
      };
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      int var6 = this.method12840(var1, var2.method37961(Class1983.field12949));
      int var7 = field20405.get(var6);
      if (var7 != 0) {
         int var8 = this.method12840(var1, var2.method37961(Class1983.field12948));
         if (!ViaVersion3.method27612().setFlowerStemWhenBlockAbove()) {
            if (!field20405.containsKey(var8)) {
               return var7;
            }
         } else if (var8 == 0) {
            return var7;
         }
      }

      return var3;
   }
}
