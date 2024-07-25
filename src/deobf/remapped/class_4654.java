package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.HashSet;
import java.util.Set;

public class class_4654 extends class_111 {
   private static final Set<Integer> field_22707 = new HashSet<Integer>();
   private static final Int2IntMap field_22704 = new Int2IntOpenHashMap(1296);
   private static final Int2IntMap field_22706 = new Int2IntOpenHashMap(1296);

   public static class_3590 method_21523() {
      class_4654 var2 = new class_4654();
      String var3 = "minecraft:redstone_wire";
      return var1 -> {
         if ("minecraft:redstone_wire".equals(var1.method_42779())) {
            field_22707.add(var1.method_42777());
            class_7943.field_40656.put(var1.method_42777(), var2);
            field_22704.put(method_21524(var1), var1.method_42777());
            field_22706.put(var1.method_42777(), Integer.parseInt(var1.method_42778("power")));
         }
      };
   }

   private static short method_21524(class_9297 var0) {
      short var3 = 0;
      var3 = (short)(var3 | method_21522(var0.method_42778("east")));
      var3 = (short)(var3 | method_21522(var0.method_42778("north")) << 2);
      var3 = (short)(var3 | method_21522(var0.method_42778("south")) << 4);
      var3 = (short)(var3 | method_21522(var0.method_42778("west")) << 6);
      return (short)(var3 | Integer.parseInt(var0.method_42778("power")) << 8);
   }

   private static int method_21522(String var0) {
      switch (var0) {
         case "none":
            return 0;
         case "side":
            return 1;
         case "up":
            return 2;
         default:
            return 0;
      }
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      short var6 = 0;
      var6 = (short)(var6 | this.method_21525(var1, var2, class_2391.field_11927));
      var6 = (short)(var6 | this.method_21525(var1, var2, class_2391.field_11921) << 2);
      var6 = (short)(var6 | this.method_21525(var1, var2, class_2391.field_11930) << 4);
      var6 = (short)(var6 | this.method_21525(var1, var2, class_2391.field_11928) << 6);
      var6 = (short)(var6 | field_22706.get(var3) << 8);
      return field_22704.getOrDefault(var6, var3);
   }

   private int method_21525(class_1455 var1, class_9371 var2, class_2391 var3) {
      class_9371 var6 = var2.method_43341(var3);
      int var7 = this.method_338(var1, var6);
      if (!this.method_21526(var3, var7)) {
         int var8 = this.method_338(var1, var6.method_43341(class_2391.field_11924));
         if (field_22707.contains(var8) && !class_7943.field_40657.contains(this.method_338(var1, var2.method_43341(class_2391.field_11924)))) {
            return 2;
         } else {
            int var9 = this.method_338(var1, var6.method_43341(class_2391.field_11922));
            return field_22707.contains(var9) && !class_7943.field_40657.contains(this.method_338(var1, var6)) ? 1 : 0;
         }
      } else {
         return 1;
      }
   }

   private boolean method_21526(class_2391 var1, int var2) {
      class_6772 var5 = (class_6772)class_7943.field_40654.get(var2);
      return var5 != null && var5.method_31081("redstoneConnections", var1.method_10900(), false);
   }
}
