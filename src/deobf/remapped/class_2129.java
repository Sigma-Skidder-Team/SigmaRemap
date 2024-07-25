package remapped;

public class class_2129 extends class_4657 implements class_372 {
   private static String[] field_10654;
   private final class_2522 field_10656;
   private final class_9379 field_10658;
   private final class_1331 field_10655;
   private boolean field_10657;

   public class_2129(class_2522 var1, class_9379 var2, class_1331 var3) {
      super(1);
      this.field_10656 = var1;
      this.field_10658 = var2;
      this.field_10655 = var3;
   }

   @Override
   public int method_31506() {
      return 1;
   }

   @Override
   public int[] method_1832(Direction var1) {
      return var1 != Direction.field_817 ? new int[0] : new int[]{0};
   }

   @Override
   public boolean method_1834(int var1, ItemStack var2, Direction var3) {
      return !this.field_10657 && var3 == Direction.field_817 && class_7689.field_39051.containsKey(var2.method_27960());
   }

   @Override
   public boolean method_1833(int var1, ItemStack var2, Direction var3) {
      return false;
   }

   @Override
   public void method_17407() {
      ItemStack var3 = this.method_31498(0);
      if (!var3.method_28022()) {
         this.field_10657 = true;
         class_2522 var4 = class_7689.method_34841(this.field_10656, this.field_10658, this.field_10655, var3);
         this.field_10658.method_43364(1500, this.field_10655, var4 == this.field_10656 ? 0 : 1);
         this.method_31507(0);
      }
   }
}
