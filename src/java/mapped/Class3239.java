package mapped;

public class Class3239 extends Class3238 {
   private static String[] field18689;
   private final Class6408[] field18690;

   public Class3239(AbstractBlock var1) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18680, Boolean.valueOf(false))
            .method23465(field18681, Boolean.valueOf(false))
            .method23465(field18682, Boolean.valueOf(false))
            .method23465(field18683, Boolean.valueOf(false))
            .method23465(field18684, Boolean.valueOf(false))
      );
      this.field18690 = this.method11639(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public Class6408 method11503(Class7380 var1, Class1665 var2, BlockPos var3) {
      return this.field18690[this.method11641(var1)];
   }

   @Override
   public Class6408 method11635(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.method11483(var1, var2, var3, var4);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   public boolean method11644(Class7380 var1, boolean var2, Direction var3) {
      Block var6 = var1.method23383();
      boolean var7 = this.method11645(var6);
      boolean var8 = var6 instanceof Class3199 && Class3199.method11507(var1, var3);
      return !method11545(var6) && var2 || var7 || var8;
   }

   private boolean method11645(Block var1) {
      return var1.method11540(Class7645.field32771) && var1.method11540(Class7645.field32743) == this.method11579().method23446(Class7645.field32743);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (!var2.field9020) {
         return Class3329.method11880(var4, var2, var3);
      } else {
         ItemStack var9 = var4.method3094(var5);
         return var9.method32107() != Class8514.field38087 ? Class2274.field14820 : Class2274.field14818;
      }
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7379 var6 = var1.method18360().method6739(var1.method18345());
      BlockPos var7 = var5.method8341();
      BlockPos var8 = var5.method8347();
      BlockPos var9 = var5.method8343();
      BlockPos var10 = var5.method8345();
      Class7380 var11 = var4.method6738(var7);
      Class7380 var12 = var4.method6738(var8);
      Class7380 var13 = var4.method6738(var9);
      Class7380 var14 = var4.method6738(var10);
      return super.method11495(var1)
         .method23465(field18680, Boolean.valueOf(this.method11644(var11, var11.method23454(var4, var7, Direction.SOUTH), Direction.SOUTH)))
         .method23465(field18681, Boolean.valueOf(this.method11644(var12, var12.method23454(var4, var8, Direction.WEST), Direction.WEST)))
         .method23465(field18682, Boolean.valueOf(this.method11644(var13, var13.method23454(var4, var9, Direction.NORTH), Direction.NORTH)))
         .method23465(field18683, Boolean.valueOf(this.method11644(var14, var14.method23454(var4, var10, Direction.EAST), Direction.EAST)))
         .method23465(field18684, Boolean.valueOf(var6.method23472() == Class9479.field44066));
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18684)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var2.method544().method326() != Class76.field161
         ? super.method11491(var1, var2, var3, var4, var5, var6)
         : var1.method23465(field18685.get(var2), Boolean.valueOf(this.method11644(var3, var3.method23454(var4, var6, var2.method536()), var2.method536())));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18680, field18681, field18683, field18682, field18684);
   }
}
