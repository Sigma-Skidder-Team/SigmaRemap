package mapped;

public class Class3256 extends Class3257 implements Class3255 {
   private static String[] field18731;

   public Class3256(Class5643 var1) {
      super(var1);
      Class3357.method11931(this, Class3279.field18780);
   }

   public static boolean method11698(ItemStack var0) {
      return var0.method32117() < var0.method32119() - 1;
   }

   @Override
   public boolean method11699(ItemStack var1, ItemStack var2) {
      return var2.method32107() == Class8514.field38145;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      Class2106 var7 = Class1006.method4271(var6);
      ItemStack var8 = var2.method2943(var7);
      if (!var8.method32105()) {
         return Class6794.<ItemStack>method20699(var6);
      } else {
         var2.method2944(var7, var6.copy());
         var6.method32180(0);
         return Class6794.<ItemStack>method20700(var6, var1.method6714());
      }
   }
}