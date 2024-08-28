package mapped;

public class Class6089 extends Class6069 {
   private static String[] field27333;

   public Class6089(Class1937 var1, Class2106... var2) {
      super(var1, Class2242.field14671, var2);
   }

   @Override
   public int method18807(int var1) {
      return var1 * 10;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 15;
   }

   @Override
   public boolean method18824() {
      return true;
   }

   @Override
   public int method18809() {
      return 2;
   }

   public static void method18829(Class880 var0, Class1655 var1, BlockPos var2, int var3) {
      if (var0.method3226()) {
         Class7380 var6 = Blocks.field36889.method11579();
         float var7 = (float)Math.min(16, 2 + var3);
         Mutable var8 = new Mutable();

         for (BlockPos var10 : BlockPos.method8359(var2.method8335((double)(-var7), -1.0, (double)(-var7)), var2.method8335((double)var7, -1.0, (double)var7))) {
            if (var10.method8317(var0.method3431(), (double)var7)) {
               var8.method8372(var10.method8304(), var10.getY() + 1, var10.method8306());
               Class7380 var11 = var1.method6738(var8);
               if (var11.method23393()) {
                  Class7380 var12 = var1.method6738(var10);
                  if (var12.method23384() == Class8649.field38941
                     && var12.<Integer>method23463(Class3404.field19079) == 0
                     && var6.method23443(var1, var10)
                     && var1.method7049(var6, var10, Class4832.method14947())) {
                     var1.method6730(var10, var6);
                     var1.method6860().method20726(var10, Blocks.field36889, Class9679.method37782(var0.method3013(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method18817(Class6069 var1) {
      return super.method18817(var1) && var1 != Class8122.field34904;
   }
}
