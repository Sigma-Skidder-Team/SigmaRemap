package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

import java.util.HashSet;
import java.util.Set;

public class Class4160 extends Class4147 {
   private static final Set<Integer> field20414 = new HashSet<Integer>();
   private static final Int2IntMap field20415 = new Int2IntOpenHashMap(1296);
   private static final Int2IntMap field20416 = new Int2IntOpenHashMap(1296);

   public static Class8097 method12871() {
      Class4160 var2 = new Class4160();
      String var3 = "minecraft:redstone_wire";
      return var1 -> {
         if ("minecraft:redstone_wire".equals(var1.method37757())) {
            field20414.add(var1.method37758());
            Class9322.field43276.put(var1.method37758(), var2);
            field20415.put(method12872(var1), var1.method37758());
            field20416.put(var1.method37758(), Integer.parseInt(var1.method37761("power")));
         }
      };
   }

   private static short method12872(Class9678 var0) {
      short var3 = 0;
      var3 = (short)(var3 | method12873(var0.method37761("east")));
      var3 = (short)(var3 | method12873(var0.method37761("north")) << 2);
      var3 = (short)(var3 | method12873(var0.method37761("south")) << 4);
      var3 = (short)(var3 | method12873(var0.method37761("west")) << 6);
      return (short)(var3 | Integer.parseInt(var0.method37761("power")) << 8);
   }

   private static int method12873(String var0) {
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
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      short var6 = 0;
      var6 = (short)(var6 | this.method12874(var1, var2, Class1983.field12946));
      var6 = (short)(var6 | this.method12874(var1, var2, Class1983.field12944) << 2);
      var6 = (short)(var6 | this.method12874(var1, var2, Class1983.field12945) << 4);
      var6 = (short)(var6 | this.method12874(var1, var2, Class1983.field12947) << 6);
      var6 = (short)(var6 | field20416.get(var3) << 8);
      return field20415.getOrDefault(var6, var3);
   }

   private int method12874(Class7161 var1, Class9695 var2, Class1983 var3) {
      Class9695 var6 = var2.method37961(var3);
      int var7 = this.method12840(var1, var6);
      if (!this.method12875(var3, var7)) {
         int var8 = this.method12840(var1, var6.method37961(Class1983.field12948));
         if (field20414.contains(var8) && !Class9322.field43278.contains(this.method12840(var1, var2.method37961(Class1983.field12948)))) {
            return 2;
         } else {
            int var9 = this.method12840(var1, var6.method37961(Class1983.field12949));
            return field20414.contains(var9) && !Class9322.field43278.contains(this.method12840(var1, var6)) ? 1 : 0;
         }
      } else {
         return 1;
      }
   }

   private boolean method12875(Class1983 var1, int var2) {
      Class9039 var5 = (Class9039)Class9322.field43277.get(var2);
      return var5 != null && var5.method33538("redstoneConnections", var1.method8265(), false);
   }
}
