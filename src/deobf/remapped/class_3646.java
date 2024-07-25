package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_3646 extends class_4232 {
   private Screen field_17781;
   private class_8881 field_17780;
   private static class_1013[] field_17777 = new class_1013[]{
      class_1013.field_5223,
      class_1013.field_5238,
      class_1013.field_5255,
      class_1013.field_5235,
      class_1013.field_5280,
      class_1013.field_5308,
      class_1013.field_5316,
      class_1013.field_5274,
      class_1013.field_5218
   };
   private class_6809 field_17779 = new class_6809(this, new class_3403());

   public class_3646(Screen var1, class_8881 var2) {
      super(new StringTextComponent(class_6956.method_31803("of.options.performanceTitle")));
      this.field_17781 = var1;
      this.field_17780 = var2;
   }

   @Override
   public void method_1163() {
      this.field_20540.clear();

      for (int var3 = 0; var3 < field_17777.length; var3++) {
         class_1013 var4 = field_17777[var3];
         int var5 = this.field_941 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field_940 / 6 + 21 * (var3 / 2) - 12;
         this.<class_7114>method_1186(var4.method_4482(this.field_943.field_9577, var5, var6, 150));
      }

      this.<class_5932>method_1186(new class_5932(200, this.field_941 / 2 - 100, this.field_940 / 6 + 168 + 11, class_6956.method_31803("gui.done")));
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         if (var4.field_36675 && var4.field_30159 == 200) {
            this.field_943.field_9577.method_40873();
            this.field_943.method_8609(this.field_17781);
         }
      }
   }

   @Override
   public void method_1162() {
      this.field_943.field_9577.method_40873();
      super.method_1162();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_20538, this.field_947, this.field_941 / 2, 15, 16777215);
      super.method_6767(var1, var2, var3, var4);
      this.field_17779.method_31255(var1, var2, var3, this.field_20540);
   }
}
