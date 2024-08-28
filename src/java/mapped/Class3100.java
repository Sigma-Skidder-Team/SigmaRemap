package mapped;

public class Class3100 implements Class2982 {
   private static String[] field18288;
   public final Class3925 field18289;

   public Class3100(Class3925 var1) {
      this.field18289 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class8173 var4 = var1.<Class8173>method30559(new Class4772());
      var1.method30560(new Class4818(), var4);
      if (var4.method28442()) {
         int[] var5 = var4.method28447();
         int[] var6 = new int[1024];
         if (var5 != null) {
            for (int var7 = 0; var7 < 4; var7++) {
               for (int var8 = 0; var8 < 4; var8++) {
                  int var9 = (var8 << 2) + 2;
                  int var10 = (var7 << 2) + 2;
                  int var11 = var10 << 4 | var9;
                  var6[var7 << 2 | var8] = var5[var11];
               }
            }

            for (int var14 = 1; var14 < 64; var14++) {
               System.arraycopy(var6, 0, var6, var14 * 16, 16);
            }
         }

         var4.method28448(var6);
      }

      for (int var12 = 0; var12 < 16; var12++) {
         Class8225 var13 = var4.method28446()[var12];
         if (var13 != null) {
            for (int var15 = 0; var15 < var13.method28631(); var15++) {
               int var16 = var13.method28632(var15);
               int var17 = this.field18289.field20193.method19376().method18528(var16);
               var13.method28633(var15, var17);
            }
         }
      }
   }
}
