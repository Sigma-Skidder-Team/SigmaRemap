package mapped;

public class Class947 extends TileEntity implements Class946 {
   private ItemStack field5332 = ItemStack.EMPTY;

   public Class947() {
      super(Class4387.field21425);
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      if (var2.method119("RecordItem", 10)) {
         this.method3804(ItemStack.method32104(var2.getCompound("RecordItem")));
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.method3803().isEmpty()) {
         var1.put("RecordItem", this.method3803().method32112(new CompoundNBT()));
      }

      return var1;
   }

   public ItemStack method3803() {
      return this.field5332;
   }

   public void method3804(ItemStack var1) {
      this.field5332 = var1;
      this.method3622();
   }

   @Override
   public void method3625() {
      this.method3804(ItemStack.EMPTY);
   }
}
