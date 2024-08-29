package mapped;

public final class Class6221 extends Class6218 {
   private static String[] field27718;

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      BlockPos var6 = var1.method11323().method8349(var5);
      ServerWorld var7 = var1.method11326();
      ArmorStandEntity var8 = new ArmorStandEntity(var7, (double)var6.getX() + 0.5, (double)var6.getY(), (double)var6.getZ() + 0.5);
      EntityType.method33204(var7, (PlayerEntity)null, var8, var2.method32142());
      var8.rotationYaw = var5.method551();
      var7.method6916(var8);
      var2.method32182(1);
      return var2;
   }
}
