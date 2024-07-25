package remapped;

public abstract class class_764 extends class_4314 {
   private final class_9077 field_4128;

   public class_764(class_9077 var1, class_3073 var2) {
      super(var2);
      this.field_4128 = var1;
   }

   @Override
   public boolean method_29278() {
      return true;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_8837(this.field_4128);
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_8837) {
            ((class_8837)var8).method_40654(var5.method_28008());
         }
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      class_3757 var6 = var1.method_28260(var2);
      return !(var6 instanceof class_8837) ? super.method_29276(var1, var2, var3) : ((class_8837)var6).method_40662(var3);
   }

   public class_9077 method_3443() {
      return this.field_4128;
   }
}
