package remapped;

public enum class_2872 implements class_5891 {
   field_14072,
   field_14071;

   private class_2872() {
   }

   @Override
   public int method_34239(int var1) {
      return var1 >> 1;
   }

   @Override
   public int method_34240(int var1) {
      return var1 >> 1;
   }

   @Override
   public int method_26950(class_1167<?> var1, class_2997 var2, int var3, int var4) {
      int var7 = var2.method_13700(this.method_34239(var3), this.method_34240(var4));
      var1.method_5189((long)(var3 >> 1 << 1), (long)(var4 >> 1 << 1));
      int var8 = var3 & 1;
      int var9 = var4 & 1;
      if (var8 == 0 && var9 == 0) {
         return var7;
      } else {
         int var10 = var2.method_13700(this.method_34239(var3), this.method_34240(var4 + 1));
         int var11 = var1.method_5190(var7, var10);
         if (var8 == 0 && var9 == 1) {
            return var11;
         } else {
            int var12 = var2.method_13700(this.method_34239(var3 + 1), this.method_34240(var4));
            int var13 = var1.method_5190(var7, var12);
            if (var8 == 1 && var9 == 0) {
               return var13;
            } else {
               int var14 = var2.method_13700(this.method_34239(var3 + 1), this.method_34240(var4 + 1));
               return this.method_13194(var1, var7, var12, var10, var14);
            }
         }
      }
   }

   public int method_13194(class_1167<?> var1, int var2, int var3, int var4, int var5) {
      if (var3 == var4 && var4 == var5) {
         return var3;
      } else if (var2 == var3 && var2 == var4) {
         return var2;
      } else if (var2 == var3 && var2 == var5) {
         return var2;
      } else if (var2 == var4 && var2 == var5) {
         return var2;
      } else if (var2 == var3 && var4 != var5) {
         return var2;
      } else if (var2 == var4 && var3 != var5) {
         return var2;
      } else if (var2 == var5 && var3 != var4) {
         return var2;
      } else if (var3 == var4 && var2 != var5) {
         return var3;
      } else if (var3 == var5 && var2 != var4) {
         return var3;
      } else {
         return var4 == var5 && var2 != var3 ? var4 : var1.method_5191(var2, var3, var4, var5);
      }
   }
}
