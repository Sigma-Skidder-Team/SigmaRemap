package mapped;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class9572 {
   private static final Map<Integer, Class72> field44568 = new HashMap<Integer, Class72>();

   private static void method37135(Integer var0, String var1) {
      Class72 var4 = new Class72("");
      var4.<Class71>method236(new Class71(var1));
      field44568.put(var0, var4);
   }

   private static void method37136(List<Integer> var0, String var1) {
      for (int var5 : var0) {
         method37135(var5, var1);
      }
   }

   public static boolean method37137(int var0) {
      return field44568.containsKey(var0);
   }

   public static Class72 method37138(int var0, int var1, int var2, int var3) {
      Class72 var6 = field44568.get(var3);
      if (var6 == null) {
         return null;
      } else {
         Class72 var7 = var6.clone();
         var7.<Class66>method236(new Class66("x", var0));
         var7.<Class66>method236(new Class66("y", var1));
         var7.<Class66>method236(new Class66("z", var2));
         return var7;
      }
   }

   static {
      method37136(Arrays.<Integer>asList(61, 62), "Furnace");
      method37136(Arrays.<Integer>asList(54, 146), "Chest");
      method37135(130, "EnderChest");
      method37135(84, "RecordPlayer");
      method37135(23, "Trap");
      method37135(158, "Dropper");
      method37136(Arrays.<Integer>asList(63, 68), "Sign");
      method37135(52, "MobSpawner");
      method37135(25, "Music");
      method37136(Arrays.<Integer>asList(33, 34, 29, 36), "Piston");
      method37135(117, "Cauldron");
      method37135(116, "EnchantTable");
      method37136(Arrays.<Integer>asList(119, 120), "Airportal");
      method37135(138, "Beacon");
      method37135(144, "Skull");
      method37136(Arrays.<Integer>asList(178, 151), "DLDetector");
      method37135(154, "Hopper");
      method37136(Arrays.<Integer>asList(149, 150), "Comparator");
      method37135(140, "FlowerPot");
      method37136(Arrays.<Integer>asList(176, 177), "Banner");
      method37135(209, "EndGateway");
      method37135(137, "Control");
   }
}
