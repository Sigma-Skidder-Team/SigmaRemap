package remapped;

public enum class_4255 implements class_3743, class_1109 {
   field_20626;

   @Override
   public int method_17352(class_2431 var1, class_2997 var2, class_2997 var3, int var4, int var5) {
      int var8 = var2.method_13700(this.method_34239(var4), this.method_34240(var5));
      int var9 = var3.method_13700(this.method_34239(var4), this.method_34240(var5));
      if (class_7930.method_35851(var8)) {
         return var8;
      } else if (var9 != 7) {
         return var8;
      } else if (var8 == 12) {
         return 11;
      } else {
         return var8 != 14 && var8 != 15 ? var9 & 0xFF : 15;
      }
   }
}
