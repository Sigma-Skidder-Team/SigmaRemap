package mapped;

public class Class3374 extends Class3373 {
   private static String[] field18969;
   public static final Class8554 field18970 = Class8820.field39763;

   public Class3374(AbstractBlock var1, Class9673 var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18970, Integer.valueOf(0)).method23465(field18966, Boolean.valueOf(false)));
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return var2.method6738(var3.method8313()).method23384().method31086();
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7379 var4 = var1.method18360().method6739(var1.method18345());
      return this.method11579()
         .method23465(field18970, Integer.valueOf(MathHelper.method37769((double)((180.0F + var1.method18352()) * 16.0F / 360.0F) + 0.5) & 15))
         .method23465(field18966, Boolean.valueOf(var4.method23472() == Class9479.field44066));
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field672 && !this.method11492(var1, var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18970, Integer.valueOf(var2.method253(var1.<Integer>method23463(field18970), 16)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23465(field18970, Integer.valueOf(var2.method8748(var1.<Integer>method23463(field18970), 16)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18970, field18966);
   }
}
