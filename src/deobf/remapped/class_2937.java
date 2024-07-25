package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_2937 {
   private static final Map<String, String> field_14290 = new HashMap<String, String>();

   private static void method_13445(String var0, String var1) {
      field_14290.put("minecraft:" + var0, "minecraft:" + var1);
   }

   public static String method_13443(String var0) {
      String var3 = field_14290.get(var0);
      if (var3 == null) {
         var3 = field_14290.get("minecraft:" + var0);
         return var3 == null ? var0 : var3;
      } else {
         return var3;
      }
   }

   static {
      method_13445("commandblock_minecart", "command_block_minecart");
      method_13445("ender_crystal", "end_crystal");
      method_13445("evocation_fangs", "evoker_fangs");
      method_13445("evocation_illager", "evoker");
      method_13445("eye_of_ender_signal", "eye_of_ender");
      method_13445("fireworks_rocket", "firework_rocket");
      method_13445("illusion_illager", "illusioner");
      method_13445("snowman", "snow_golem");
      method_13445("villager_golem", "iron_golem");
      method_13445("vindication_illager", "vindicator");
      method_13445("xp_bottle", "experience_bottle");
      method_13445("xp_orb", "experience_orb");
   }
}
