package mapped;

public enum Class1832 implements Class1833, Class1827 {
   field9836;

   private static final Class1832[] field9837 = new Class1832[]{field9836};

   @Override
   public int method8083(Class6661 var1, Class7899 var2, Class7899 var3, int var4, int var5) {
      int var8 = var2.method26471(this.method8075(var4), this.method8076(var5));
      int var9 = var3.method26471(this.method8075(var4), this.method8076(var5));
      if (!Class9320.method35218(var8)) {
         return var8;
      } else {
         for (int var12 = -8; var12 <= 8; var12 += 4) {
            for (int var13 = -8; var13 <= 8; var13 += 4) {
               int var14 = var2.method26471(this.method8075(var4 + var12), this.method8076(var5 + var13));
               if (!Class9320.method35218(var14)) {
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
