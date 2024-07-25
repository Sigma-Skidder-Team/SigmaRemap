package remapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class class_5897 extends class_111 {
   private static final String[] field_29942 = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "dark_oak"};
   private static final Map<Byte, Integer> field_29943 = new HashMap<Byte, Integer>();
   private static final Set<Integer> field_29944 = new HashSet<Integer>();

   private static void method_26965(Set<String> var0, String var1) {
      for (String var7 : field_29942) {
         var0.add("minecraft:" + var7 + var1);
      }
   }

   public static class_3590 method_26964() {
      HashSet var2 = new HashSet();
      var2.add("minecraft:tnt");
      var2.add("minecraft:vine");
      var2.add("minecraft:bookshelf");
      var2.add("minecraft:hay_block");
      var2.add("minecraft:deadbush");
      method_26965(var2, "_slab");
      method_26965(var2, "_log");
      method_26965(var2, "_planks");
      method_26965(var2, "_leaves");
      method_26965(var2, "_fence");
      method_26965(var2, "_fence_gate");
      method_26965(var2, "_stairs");
      class_5897 var3 = new class_5897();
      return var2x -> {
         String var5 = var2x.method_42779();
         if (var5.contains("_wool") || var5.contains("_carpet") || var2.contains(var5)) {
            field_29944.add(var2x.method_42777());
         } else if (var5.equals("minecraft:fire")) {
            int var6 = var2x.method_42777();
            field_29943.put(method_26966(var2x), var6);
            class_7943.field_40656.put(var6, var3);
         }
      };
   }

   private static byte method_26966(class_9297 var0) {
      byte var3 = 0;
      if (var0.method_42778("east").equals("true")) {
         var3 = (byte)(var3 | 1);
      }

      if (var0.method_42778("north").equals("true")) {
         var3 = (byte)(var3 | 2);
      }

      if (var0.method_42778("south").equals("true")) {
         var3 = (byte)(var3 | 4);
      }

      if (var0.method_42778("up").equals("true")) {
         var3 = (byte)(var3 | 8);
      }

      if (var0.method_42778("west").equals("true")) {
         var3 = (byte)(var3 | 16);
      }

      return var3;
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      byte var6 = 0;
      if (field_29944.contains(this.method_338(var1, var2.method_43341(class_2391.field_11927)))) {
         var6 = (byte)(var6 | 1);
      }

      if (field_29944.contains(this.method_338(var1, var2.method_43341(class_2391.field_11921)))) {
         var6 = (byte)(var6 | 2);
      }

      if (field_29944.contains(this.method_338(var1, var2.method_43341(class_2391.field_11930)))) {
         var6 = (byte)(var6 | 4);
      }

      if (field_29944.contains(this.method_338(var1, var2.method_43341(class_2391.field_11924)))) {
         var6 = (byte)(var6 | 8);
      }

      if (field_29944.contains(this.method_338(var1, var2.method_43341(class_2391.field_11928)))) {
         var6 = (byte)(var6 | 16);
      }

      return field_29943.get(var6);
   }
}
