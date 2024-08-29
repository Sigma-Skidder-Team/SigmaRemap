package mapped;

public class Class3306 extends Item {
   private static String[] field18813;

   public Class3306(Class5643 var1) {
      super(var1);
   }

   @Override
   public ItemStack method11709(ItemStack var1, World var2, Class880 var3) {
      ItemStack var6 = super.method11709(var1, var2, var3);
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.isCreativeMode ? var6 : new ItemStack(Items.field37836);
   }
}
