package remapped;

public class class_7603 extends class_7934 {
   private static String[] field_38715;
   private final class_1459 field_38714;
   private final class_704 field_38716;
   private int field_38717;
   private final class_233 field_38713;

   public class_7603(class_704 var1, class_233 var2, class_1459 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field_38716 = var1;
      this.field_38713 = var2;
      this.field_38714 = var3;
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method_35899(int var1) {
      if (this.method_35884()) {
         this.field_38717 = this.field_38717 + Math.min(var1, this.method_35898().method_27997());
      }

      return super.method_35899(var1);
   }

   @Override
   public void method_35894(ItemStack var1, int var2) {
      this.field_38717 += var2;
      this.method_35893(var1);
   }

   @Override
   public void method_35893(ItemStack var1) {
      var1.method_27964(this.field_38716.field_41768, this.field_38716, this.field_38717);
      this.field_38717 = 0;
   }

   @Override
   public ItemStack method_35892(class_704 var1, ItemStack var2) {
      this.method_35893(var2);
      class_8014 var5 = this.field_38714.method_6755();
      if (var5 != null) {
         ItemStack var6 = this.field_38714.method_31498(0);
         ItemStack var7 = this.field_38714.method_31498(1);
         if (var5.method_36375(var6, var7) || var5.method_36375(var7, var6)) {
            this.field_38713.method_981(var5);
            var1.method_3209(class_6234.field_31873);
            this.field_38714.method_31503(0, var6);
            this.field_38714.method_31503(1, var7);
         }

         this.field_38713.method_984(this.field_38713.method_973() + var5.method_36363());
      }

      return var2;
   }
}
