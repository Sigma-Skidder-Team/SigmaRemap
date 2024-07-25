package remapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class class_8640 extends class_111 {
   private static final Map<class_7794<Integer, Boolean>, Integer> field_44288 = new HashMap<class_7794<Integer, Boolean>, Integer>();
   private static final Set<Integer> field_44289 = new HashSet<Integer>();

   public static class_3590 method_39644() {
      HashSet var2 = new HashSet();
      var2.add("minecraft:grass_block");
      var2.add("minecraft:podzol");
      var2.add("minecraft:mycelium");
      class_8640 var3 = new class_8640();
      return var2x -> {
         if (var2.contains(var2x.method_42779())) {
            class_7943.field_40656.put(var2x.method_42777(), var3);
            var2x.method_42782("snowy", "true");
            field_44288.put(new class_7794<Integer, Boolean>(var2x.method_42777(), true), var2x.method_42775());
            var2x.method_42782("snowy", "false");
            field_44288.put(new class_7794<Integer, Boolean>(var2x.method_42777(), false), var2x.method_42775());
         }

         if (var2x.method_42779().equals("minecraft:snow") || var2x.method_42779().equals("minecraft:snow_block")) {
            class_7943.field_40656.put(var2x.method_42777(), var3);
            field_44289.add(var2x.method_42777());
         }
      };
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      int var6 = this.method_338(var1, var2.method_43341(class_2391.field_11924));
      Integer var7 = field_44288.get(new class_7794<Integer, Boolean>(var3, field_44289.contains(var6)));
      return var7 == null ? var3 : var7;
   }
}
