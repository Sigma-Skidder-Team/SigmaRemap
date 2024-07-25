package remapped;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_8877 {
   private static final Map<Integer, class_5531> field_45378 = new HashMap<Integer, class_5531>();

   private static void method_40848(Integer var0, String var1) {
      class_5531 var4 = new class_5531("");
      var4.<class_887>method_25122(new class_887(var1));
      field_45378.put(var0, var4);
   }

   private static void method_40849(List<Integer> var0, String var1) {
      for (int var5 : var0) {
         method_40848(var5, var1);
      }
   }

   public static boolean method_40846(int var0) {
      return field_45378.containsKey(var0);
   }

   public static class_5531 method_40847(int var0, int var1, int var2, int var3) {
      class_5531 var6 = field_45378.get(var3);
      if (var6 == null) {
         return null;
      } else {
         class_5531 var7 = var6.clone();
         var7.<class_5232>method_25122(new class_5232("x", var0));
         var7.<class_5232>method_25122(new class_5232("y", var1));
         var7.<class_5232>method_25122(new class_5232("z", var2));
         return var7;
      }
   }

   static {
      method_40849(Arrays.<Integer>asList(61, 62), "Furnace");
      method_40849(Arrays.<Integer>asList(54, 146), "Chest");
      method_40848(130, "EnderChest");
      method_40848(84, "RecordPlayer");
      method_40848(23, "Trap");
      method_40848(158, "Dropper");
      method_40849(Arrays.<Integer>asList(63, 68), "Sign");
      method_40848(52, "MobSpawner");
      method_40848(25, "Music");
      method_40849(Arrays.<Integer>asList(33, 34, 29, 36), "Piston");
      method_40848(117, "Cauldron");
      method_40848(116, "EnchantTable");
      method_40849(Arrays.<Integer>asList(119, 120), "Airportal");
      method_40848(138, "Beacon");
      method_40848(144, "Skull");
      method_40849(Arrays.<Integer>asList(178, 151), "DLDetector");
      method_40848(154, "Hopper");
      method_40849(Arrays.<Integer>asList(149, 150), "Comparator");
      method_40848(140, "FlowerPot");
      method_40849(Arrays.<Integer>asList(176, 177), "Banner");
      method_40848(209, "EndGateway");
      method_40848(137, "Control");
   }
}
