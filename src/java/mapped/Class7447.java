package mapped;

public final class Class7447 implements Class7443 {
   private static String[] field32021;

   @Override
   public int method24053(BlockState var1, Class1663 var2, BlockPos var3) {
      Biome var6 = Class9680.method37851(var2, var3);
      return Class9680.method37901() != null && var6 == Class8708.field39312
         ? Class9680.method37901().method24070(var6, var3)
         : var6.method32510((double)var3.getX(), (double)var3.getZ());
   }

   @Override
   public boolean method24054() {
      return false;
   }
}
