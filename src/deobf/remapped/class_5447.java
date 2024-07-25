package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.HashSet;

public class class_5447 extends class_111 {
   private static final Int2IntMap field_27765 = new Int2IntOpenHashMap();

   public static class_3590 method_24830() {
      HashSet var2 = new HashSet();
      var2.add("minecraft:rose_bush");
      var2.add("minecraft:sunflower");
      var2.add("minecraft:peony");
      var2.add("minecraft:tall_grass");
      var2.add("minecraft:large_fern");
      var2.add("minecraft:lilac");
      class_5447 var3 = new class_5447();
      return var2x -> {
         if (var2.contains(var2x.method_42779())) {
            class_7943.field_40656.put(var2x.method_42777(), var3);
            if (var2x.method_42778("half").equals("lower")) {
               var2x.method_42782("half", "upper");
               field_27765.put(var2x.method_42777(), var2x.method_42775());
            }
         }
      };
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      int var6 = this.method_338(var1, var2.method_43341(class_2391.field_11922));
      int var7 = field_27765.get(var6);
      if (var7 != 0) {
         int var8 = this.method_338(var1, var2.method_43341(class_2391.field_11924));
         if (!class_3446.method_15884().method_25837()) {
            if (!field_27765.containsKey(var8)) {
               return var7;
            }
         } else if (var8 == 0) {
            return var7;
         }
      }

      return var3;
   }
}
