package mapped;

public final class Class6236 extends Class6230 {
   private static String[] field27718;
   private final Class6218 field27730 = new Class6218();

   private ItemStack method19208(Class2956 var1, ItemStack var2, ItemStack var3) {
      var2.method32182(1);
      if (!var2.method32105()) {
         if (var1.<Class971>method11325().method4023(var3.copy()) < 0) {
            this.field27730.method19196(var1, var3.copy());
         }

         return var2;
      } else {
         return var3.copy();
      }
   }

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      this.method19204(false);
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      Class7380 var7 = var5.method6738(var6);
      if (var7.method23447(Class7645.field32794, var0 -> var0.method23462(Class3366.field18936)) && var7.<Integer>method23463(Class3366.field18936) >= 5) {
         ((Class3366)var7.method23383()).method11946(var5, var7, var6, (PlayerEntity)null, Class2084.field13572);
         this.method19204(true);
         return this.method19208(var1, var2, new ItemStack(Class8514.field38177));
      } else if (!var5.method6739(var6).method23486(Class8953.field40469)) {
         return super.method19192(var1, var2);
      } else {
         this.method19204(true);
         return this.method19208(var1, var2, Class9741.method38187(new ItemStack(Class8514.field37971), Class8137.field34977));
      }
   }
}
