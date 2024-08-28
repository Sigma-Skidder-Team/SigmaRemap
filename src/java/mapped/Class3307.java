package mapped;

public class Class3307 extends Class3257 {
   private static String[] field18814;

   public Class3307(Class5643 var1) {
      super(var1);
   }

   @Override
   public ItemStack method11709(ItemStack var1, World var2, Class880 var3) {
      super.method11709(var1, var2, var3);
      if (var3 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var6 = (ServerPlayerEntity)var3;
         CriteriaTriggers.field44490.method15174(var6, var1);
         var6.method2913(Class8876.field40098.method172(this));
      }

      if (!var2.field9020) {
         var3.method3040(Class8254.field35485);
      }

      if (!var1.method32105()) {
         if (var3 instanceof PlayerEntity && !((PlayerEntity)var3).field4919.field29609) {
            ItemStack var8 = new ItemStack(Class8514.field37972);
            PlayerEntity var7 = (PlayerEntity)var3;
            if (!var7.field4902.method4045(var8)) {
               var7.method2882(var8, false);
            }
         }

         return var1;
      } else {
         return new ItemStack(Class8514.field37972);
      }
   }

   @Override
   public int method11728(ItemStack var1) {
      return 40;
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13708;
   }

   @Override
   public Class9455 method11746() {
      return Class6067.field26666;
   }

   @Override
   public Class9455 method11747() {
      return Class6067.field26666;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      return Class8482.method29977(var1, var2, var3);
   }
}
