package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class class_491<S extends class_3757> implements class_3606<S, Int2IntFunction> {
   private static String[] field_3064;

   public Int2IntFunction method_2395(S var1, S var2) {
      return var2x -> {
         if (!class_5052.method_23276()) {
            int var5 = WorldRenderer.method_20002(var1.method_17402(), var1.method_17399());
            int var6 = WorldRenderer.method_20002(var2.method_17402(), var2.method_17399());
            int var7 = class_5778.method_26134(var5);
            int var8 = class_5778.method_26134(var6);
            int var9 = class_5778.method_26131(var5);
            int var10 = class_5778.method_26131(var6);
            return class_5778.method_26127(Math.max(var7, var8), Math.max(var9, var10));
         } else {
            return class_5778.field_29187;
         }
      };
   }

   public Int2IntFunction method_2394(S var1) {
      return var0 -> var0;
   }

   public Int2IntFunction method_2396() {
      return var0 -> var0;
   }
}
