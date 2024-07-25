package remapped;

public enum class_2646 implements class_7126 {
   field_13031;

   @Override
   public int method_32737(class_2431 var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = method_11957(var6);
      return var9 == method_11957(var5) && var9 == method_11957(var2) && var9 == method_11957(var3) && var9 == method_11957(var4) ? -1 : 7;
   }

   private static int method_11957(int var0) {
      return var0 < 2 ? var0 : 2 + (var0 & 1);
   }
}
