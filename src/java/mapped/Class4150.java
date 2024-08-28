package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class4150 extends Class4148 {
   public static List<Class8097> method12851() {
      ArrayList var2 = new ArrayList(18);
      var2.add(new Class4150("paneConnections").method12841("minecraft:white_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:orange_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:magenta_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:light_blue_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:yellow_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:lime_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:pink_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:gray_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:light_gray_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:cyan_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:purple_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:blue_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:brown_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:green_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:red_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:black_stained_glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:glass_pane"));
      var2.add(new Class4150("paneConnections").method12841("minecraft:iron_bars"));
      return var2;
   }

   public Class4150(String var1) {
      super(var1);
   }

   @Override
   public byte method12843(Class7161 var1, Class9695 var2, int var3) {
      byte var6 = super.method12843(var1, var2, var3);
      if (var6 != 0) {
         return var6;
      } else {
         Class6038 var7 = var1.method22465();
         return var7.method18677() <= 47 && var7.method18677() != -1 ? 15 : var6;
      }
   }
}
