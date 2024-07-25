package remapped;

public class class_3482 {
   private static String[] field_17074;
   private final class_8137 field_17075;
   private final int field_17073;
   private final int field_17071;

   public class_3482(class_7590 var1, class_8137 var2, int var3, int var4) {
      this.field_17072 = var1;
      this.field_17075 = var2;
      this.field_17073 = var3;
      this.field_17071 = var4;
   }

   public int method_15981() {
      return this.field_17073;
   }

   public int method_15979() {
      return this.field_17071;
   }

   public ItemStack method_15980() {
      ItemStack[] var3 = this.field_17075.method_37020();
      return var3[MathHelper.floor(class_7590.method_34488(this.field_17072) / 30.0F) % var3.length];
   }
}
