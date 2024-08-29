package mapped;

public class Class136 extends Class128 {
   private static String[] field458;
   private final CompoundNBT field459;

   public Class136(ILootCondition[] var1, CompoundNBT var2) {
      super(var1);
      this.field459 = var2;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.SET_NBT;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      var1.getOrCreateTag().method140(this.field459);
      return var1;
   }

   public static Class5876<?> method399(CompoundNBT var0) {
      return method372(var1 -> new Class136(var1, var0));
   }

   // $VF: synthetic method
   public static CompoundNBT method401(Class136 var0) {
      return var0.field459;
   }
}
