package remapped;

public abstract class class_3429 extends class_9506 implements class_3713 {
   private static final class_7821<ItemStack> field_16861 = class_8073.<ItemStack>method_36641(class_3429.class, class_2734.field_13357);

   public class_3429(EntityType<? extends class_3429> var1, World var2) {
      super(var1, var2);
   }

   public class_3429(EntityType<? extends class_3429> var1, double var2, double var4, double var6, World var8) {
      super(var1, var2, var4, var6, var8);
   }

   public class_3429(EntityType<? extends class_3429> var1, LivingEntity var2, World var3) {
      super(var1, var2, var3);
   }

   public void method_15852(ItemStack var1) {
      if (var1.method_27960() != this.method_15854() || var1.method_28002()) {
         this.method_37372().method_36633(field_16861, Util.<ItemStack>make(var1.method_27973(), var0 -> var0.method_28017(1)));
      }
   }

   public abstract class_2451 method_15854();

   public ItemStack method_15853() {
      return this.method_37372().<ItemStack>method_36640(field_16861);
   }

   @Override
   public ItemStack method_17246() {
      ItemStack var3 = this.method_15853();
      return !var3.method_28022() ? var3 : new ItemStack(this.method_15854());
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_16861, ItemStack.EMPTY);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      ItemStack var4 = this.method_15853();
      if (!var4.method_28022()) {
         var1.put("Item", var4.method_27998(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      ItemStack var4 = ItemStack.method_28015(var1.getCompound("Item"));
      this.method_15852(var4);
   }
}
