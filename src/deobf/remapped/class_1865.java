package remapped;

public class class_1865 extends class_4657 implements class_372 {
   private static String[] field_9464;
   private final class_2522 field_9467;
   private final class_9379 field_9468;
   private final BlockPos field_9466;
   private boolean field_9465;

   public class_1865(class_2522 var1, class_9379 var2, BlockPos var3, ItemStack var4) {
      super(var4);
      this.field_9467 = var1;
      this.field_9468 = var2;
      this.field_9466 = var3;
   }

   @Override
   public int method_31506() {
      return 1;
   }

   @Override
   public int[] method_1832(Direction var1) {
      return var1 != Direction.field_802 ? new int[0] : new int[]{0};
   }

   @Override
   public boolean method_1834(int var1, ItemStack var2, Direction var3) {
      return false;
   }

   @Override
   public boolean method_1833(int var1, ItemStack var2, Direction var3) {
      return !this.field_9465 && var3 == Direction.field_802 && var2.method_27960() == class_4897.field_24640;
   }

   @Override
   public void method_17407() {
      class_7689.method_34843(this.field_9467, this.field_9468, this.field_9466);
      this.field_9465 = true;
   }
}
