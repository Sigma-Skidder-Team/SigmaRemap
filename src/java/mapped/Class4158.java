package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class4158 extends Class4147 {
   private static final Map<Class9284<Integer, Boolean>, Integer> field20410 = new HashMap<Class9284<Integer, Boolean>, Integer>();
   private static final Set<Integer> field20411 = new HashSet<Integer>();

   public static Class8097 method12863() {
      HashSet var2 = new HashSet();
      var2.add("minecraft:grass_block");
      var2.add("minecraft:podzol");
      var2.add("minecraft:mycelium");
      Class4158 var3 = new Class4158();
      return var2x -> {
         if (var2.contains(var2x.method37757())) {
            Class9322.field43276.put(var2x.method37758(), var3);
            var2x.method37760("snowy", "true");
            field20410.put(new Class9284<Integer, Boolean>(var2x.method37758(), true), var2x.method37759());
            var2x.method37760("snowy", "false");
            field20410.put(new Class9284<Integer, Boolean>(var2x.method37758(), false), var2x.method37759());
         }

         if (var2x.method37757().equals("minecraft:snow") || var2x.method37757().equals("minecraft:snow_block")) {
            Class9322.field43276.put(var2x.method37758(), var3);
            field20411.add(var2x.method37758());
         }
      };
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      int var6 = this.method12840(var1, var2.method37961(Class1983.field12948));
      Integer var7 = field20410.get(new Class9284<Integer, Boolean>(var3, field20411.contains(var6)));
      return var7 == null ? var3 : var7;
   }
}
