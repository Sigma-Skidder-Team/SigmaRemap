package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class4162 extends Class4147 {
   private static final String[] field20419 = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "dark_oak"};
   private static final Map<Byte, Integer> field20420 = new HashMap<Byte, Integer>();
   private static final Set<Integer> field20421 = new HashSet<Integer>();

   private static void method12880(Set<String> var0, String var1) {
      for (String var7 : field20419) {
         var0.add("minecraft:" + var7 + var1);
      }
   }

   public static Class8097 method12881() {
      HashSet var2 = new HashSet();
      var2.add("minecraft:tnt");
      var2.add("minecraft:vine");
      var2.add("minecraft:bookshelf");
      var2.add("minecraft:hay_block");
      var2.add("minecraft:deadbush");
      method12880(var2, "_slab");
      method12880(var2, "_log");
      method12880(var2, "_planks");
      method12880(var2, "_leaves");
      method12880(var2, "_fence");
      method12880(var2, "_fence_gate");
      method12880(var2, "_stairs");
      Class4162 var3 = new Class4162();
      return var2x -> {
         String var5 = var2x.method37757();
         if (var5.contains("_wool") || var5.contains("_carpet") || var2.contains(var5)) {
            field20421.add(var2x.method37758());
         } else if (var5.equals("minecraft:fire")) {
            int var6 = var2x.method37758();
            field20420.put(method12882(var2x), var6);
            Class9322.field43276.put(var6, var3);
         }
      };
   }

   private static byte method12882(Class9678 var0) {
      byte var3 = 0;
      if (var0.method37761("east").equals("true")) {
         var3 = (byte)(var3 | 1);
      }

      if (var0.method37761("north").equals("true")) {
         var3 = (byte)(var3 | 2);
      }

      if (var0.method37761("south").equals("true")) {
         var3 = (byte)(var3 | 4);
      }

      if (var0.method37761("up").equals("true")) {
         var3 = (byte)(var3 | 8);
      }

      if (var0.method37761("west").equals("true")) {
         var3 = (byte)(var3 | 16);
      }

      return var3;
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      byte var6 = 0;
      if (field20421.contains(this.method12840(var1, var2.method37961(Class1983.field12946)))) {
         var6 = (byte)(var6 | 1);
      }

      if (field20421.contains(this.method12840(var1, var2.method37961(Class1983.field12944)))) {
         var6 = (byte)(var6 | 2);
      }

      if (field20421.contains(this.method12840(var1, var2.method37961(Class1983.field12945)))) {
         var6 = (byte)(var6 | 4);
      }

      if (field20421.contains(this.method12840(var1, var2.method37961(Class1983.field12948)))) {
         var6 = (byte)(var6 | 8);
      }

      if (field20421.contains(this.method12840(var1, var2.method37961(Class1983.field12947)))) {
         var6 = (byte)(var6 | 16);
      }

      return field20420.get(var6);
   }
}
