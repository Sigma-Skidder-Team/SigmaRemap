package mapped;

public final class Class4009 extends Class3758 {
   private static String[] field20322;
   public final ViaVersion7 field20323;

   public Class4009(ViaVersion7 var1) {
      this.field20323 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         Class8173 var4 = var1.<Class8173>method30559(new Class4751());
         var1.method30560(new Class4770(), var4);

         for (int var5 = 0; var5 < 16; var5++) {
            Class8225 var6 = var4.method28446()[var5];
            if (var6 != null) {
               for (int var7 = 0; var7 < var6.method28631(); var7++) {
                  int var8 = var6.method28632(var7);
                  var6.method28633(var7, field20323.method19376().method18528(var8));
               }
            }
         }
      });
   }
}
