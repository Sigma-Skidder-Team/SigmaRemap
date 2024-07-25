package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_422 extends class_4482 {
   public static List<class_3590> method_2093() {
      ArrayList var2 = new ArrayList(18);
      var2.add(new class_422("paneConnections").method_20812("minecraft:white_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:orange_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:magenta_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:light_blue_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:yellow_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:lime_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:pink_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:gray_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:light_gray_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:cyan_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:purple_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:blue_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:brown_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:green_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:red_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:black_stained_glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:glass_pane"));
      var2.add(new class_422("paneConnections").method_20812("minecraft:iron_bars"));
      return var2;
   }

   public class_422(String var1) {
      super(var1);
   }

   @Override
   public byte method_20810(class_1455 var1, class_9371 var2, int var3) {
      byte var6 = super.method_20810(var1, var2, var3);
      if (var6 != 0) {
         return var6;
      } else {
         class_3790 var7 = var1.method_6744();
         return var7.method_17597() <= 47 && var7.method_17597() != -1 ? 15 : var6;
      }
   }
}
