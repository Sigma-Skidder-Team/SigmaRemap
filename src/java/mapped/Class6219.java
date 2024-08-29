package mapped;

public final class Class6219 extends Class6218 {
   private static String[] field27718;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      Class1004 var7 = new Class1004(var5, (double)var6.getX() + 0.5, (double)var6.getY(), (double)var6.getZ() + 0.5, (Class880)null);
      var5.method6916(var7);
      var5.method6743((PlayerEntity)null, var7.getPosX(), var7.getPosY(), var7.getPosZ(), Sounds.field27146, Class2266.field14732, 1.0F, 1.0F);
      var2.method32182(1);
      return var2;
   }
}
