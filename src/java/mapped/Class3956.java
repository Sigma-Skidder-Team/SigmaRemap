package mapped;

public final class Class3956 extends Class3758 {
   private static String[] field20240;
   public final Class6356 field20241;

   public Class3956(Class6356 var1) {
      this.field20241 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         Class8173 var4 = var1.<Class8173>method30559(new Class4818());
         var1.method30560(new Class4751(), var4);
         var4.method28444(var4.method28442());

         for (int var5 = 0; var5 < 16; var5++) {
            Class8225 var6 = var4.method28446()[var5];
            if (var6 != null) {
               for (int var7 = 0; var7 < var6.method28631(); var7++) {
                  int var8 = var6.method28632(var7);
                  var6.method28633(var7, field20241.method19376().method18528(var8));
               }
            }
         }

         for (Class61 var13 : var4.method28449()) {
            Class65 var15 = (Class65)var13;
            int[] var9 = new int[256];
            Class8505.method30111(9, var9.length, var15.method205(), (var1x, var2) -> var9[var1x] = var2);
            var15.method219(Class8505.method30108(9, var9.length, var1x -> (long)var9[var1x]));
         }

         if (var4.method28451() != null) {
            for (Class72 var14 : var4.method28451()) {
               Class9239.method34751(var14);
            }
         }
      });
   }
}
