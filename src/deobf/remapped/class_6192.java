package remapped;

public enum class_6192 implements class_7126 {
   field_31623;

   @Override
   public int method_32737(class_2431 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var9 = var3 == var5;
      boolean var10 = var2 == var4;
      if (var9 != var10) {
         return !var9 ? var2 : var5;
      } else if (!var9) {
         return var6;
      } else {
         return var1.method_11082(2) != 0 ? var2 : var5;
      }
   }
}
