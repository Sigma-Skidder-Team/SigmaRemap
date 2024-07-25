package remapped;

public enum class_3908 implements class_3743, class_1109 {
   field_18995;

   @Override
   public int method_17352(class_2431 var1, class_2997 var2, class_2997 var3, int var4, int var5) {
      int var8 = var2.method_13700(this.method_34239(var4), this.method_34240(var5));
      int var9 = var3.method_13700(this.method_34239(var4), this.method_34240(var5));
      if (!class_7930.method_35851(var8)) {
         return var8;
      } else {
         byte var10 = 8;
         byte var11 = 4;

         for (byte var12 = -8; var12 <= 8; var12 += 4) {
            for (byte var13 = -8; var13 <= 8; var13 += 4) {
               int var14 = var2.method_13700(this.method_34239(var4 + var12), this.method_34240(var5 + var13));
               if (!class_7930.method_35851(var14)) {
                  if (var9 == 44) {
                     return 45;
                  }

                  if (var9 == 10) {
                     return 46;
                  }
               }
            }
         }

         if (var8 == 24) {
            if (var9 == 45) {
               return 48;
            }

            if (var9 == 0) {
               return 24;
            }

            if (var9 == 46) {
               return 49;
            }

            if (var9 == 10) {
               return 50;
            }
         }

         return var9;
      }
   }
}
