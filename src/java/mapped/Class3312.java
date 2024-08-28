package mapped;

public class Class3312 extends Class3257 {
   private static String[] field18821;
   private final Class8992<? extends Class995> field18822;

   public Class3312(Class8992<? extends Class995> var1, Class5643 var2) {
      super(var2);
      this.field18822 = var1;
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      BlockPos var4 = var1.method18345();
      Direction var5 = var1.method18354();
      BlockPos var6 = var4.method8349(var5);
      PlayerEntity var7 = var1.method18358();
      ItemStack var8 = var1.method18357();
      if (var7 != null && !this.method11857(var7, var5, var8, var6)) {
         return Class2274.field14821;
      } else {
         Class1655 var9 = var1.method18360();
         Object var10;
         if (this.field18822 != Class8992.field41060) {
            if (this.field18822 != Class8992.field41043) {
               return Class2274.method9002(var9.field9020);
            }

            var10 = new Class997(var9, var6, var5);
         } else {
            var10 = new Class998(var9, var6, var5);
         }

         Class39 var11 = var8.method32142();
         if (var11 != null) {
            Class8992.method33204(var9, var7, (Entity)var10, var11);
         }

         if (!((Class995)var10).method4080()) {
            return Class2274.field14819;
         } else {
            if (!var9.field9020) {
               ((Class995)var10).method4084();
               var9.method6916((Entity)var10);
            }

            var8.method32182(1);
            return Class2274.method9002(var9.field9020);
         }
      }
   }

   public boolean method11857(PlayerEntity var1, Direction var2, ItemStack var3, BlockPos var4) {
      return !var2.method544().method323() && var1.method2936(var4, var2, var3);
   }
}
