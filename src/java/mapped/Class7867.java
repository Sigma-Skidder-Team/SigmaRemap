package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class7867 {
   private static final Map<String, String> field33680 = new HashMap<String, String>();

   private static void method26361(String var0, String var1) {
      field33680.put("minecraft:" + var0, "minecraft:" + var1);
   }

   public static String method26362(String var0) {
      String var3 = field33680.get(var0);
      if (var3 == null) {
         var3 = field33680.get("minecraft:" + var0);
         return var3 == null ? var0 : var3;
      } else {
         return var3;
      }
   }

   static {
      method26361("commandblock_minecart", "command_block_minecart");
      method26361("ender_crystal", "end_crystal");
      method26361("evocation_fangs", "evoker_fangs");
      method26361("evocation_illager", "evoker");
      method26361("eye_of_ender_signal", "eye_of_ender");
      method26361("fireworks_rocket", "firework_rocket");
      method26361("illusion_illager", "illusioner");
      method26361("snowman", "snow_golem");
      method26361("villager_golem", "iron_golem");
      method26361("vindication_illager", "vindicator");
      method26361("xp_bottle", "experience_bottle");
      method26361("xp_orb", "experience_orb");
   }
}
