package remapped;

public enum class_257 implements class_5325 {
   field_905;

   @Override
   public int method_24282(class_2431 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!class_7930.method_35854(var6)
         || class_7930.method_35854(var5) && class_7930.method_35854(var4) && class_7930.method_35854(var2) && class_7930.method_35854(var3)) {
         if (!class_7930.method_35854(var6)
            && (class_7930.method_35854(var5) || class_7930.method_35854(var2) || class_7930.method_35854(var4) || class_7930.method_35854(var3))
            && var1.method_11082(5) == 0) {
            if (class_7930.method_35854(var5)) {
               return var6 != 4 ? var5 : 4;
            }

            if (class_7930.method_35854(var2)) {
               return var6 != 4 ? var2 : 4;
            }

            if (class_7930.method_35854(var4)) {
               return var6 != 4 ? var4 : 4;
            }

            if (class_7930.method_35854(var3)) {
               return var6 != 4 ? var3 : 4;
            }
         }

         return var6;
      } else {
         int var9 = 1;
         int var10 = 1;
         if (!class_7930.method_35854(var5) && var1.method_11082(var9++) == 0) {
            var10 = var5;
         }

         if (!class_7930.method_35854(var4) && var1.method_11082(var9++) == 0) {
            var10 = var4;
         }

         if (!class_7930.method_35854(var2) && var1.method_11082(var9++) == 0) {
            var10 = var2;
         }

         if (!class_7930.method_35854(var3) && var1.method_11082(var9++) == 0) {
            var10 = var3;
         }

         if (var1.method_11082(3) != 0) {
            return var10 != 4 ? var6 : 4;
         } else {
            return var10;
         }
      }
   }
}
