package mapped;

public abstract class Class3359 extends Class3241 {
   private final Class112 field18904;

   public Class3359(Class112 var1, AbstractBlock var2) {
      super(var2);
      this.field18904 = var1;
   }

   @Override
   public boolean method11564() {
      return true;
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class958(this.field18904);
   }

   @Override
   public void method11563(World var1, BlockPos var2, Class7380 var3, Class880 var4, ItemStack var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class958) {
            ((Class958)var8).method3888(var5.method32149());
         }
      }
   }

   @Override
   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      Class944 var6 = var1.method6759(var2);
      return !(var6 instanceof Class958) ? super.method11569(var1, var2, var3) : ((Class958)var6).method3893(var3);
   }

   public Class112 method11936() {
      return this.field18904;
   }
}
