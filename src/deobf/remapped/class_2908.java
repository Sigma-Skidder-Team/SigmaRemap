package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_2908 extends class_4232 {
   private Screen field_14185;
   private class_8881 field_14184;
   private static class_1013[] field_14186 = new class_1013[]{
      class_1013.field_5284,
      class_1013.field_5297,
      class_1013.field_5310,
      class_1013.field_5293,
      class_1013.field_5247,
      class_1013.field_5283,
      class_1013.field_5210,
      class_1013.field_5209,
      class_1013.field_5217,
      class_1013.field_5261,
      class_1013.field_5212,
      class_1013.field_5206,
      class_1013.field_5253,
      class_1013.field_5249,
      class_1013.field_5302,
      class_1013.field_5315,
      class_1013.field_5259,
      class_1013.field_5224
   };
   private class_6809 field_14182 = new class_6809(this, new class_3403());

   public class_2908(Screen var1, class_8881 var2) {
      super(new StringTextComponent(class_6956.method_31803("of.options.qualityTitle")));
      this.field_14185 = var1;
      this.field_14184 = var2;
   }

   @Override
   public void method_1163() {
      this.field_20540.clear();

      for (int var3 = 0; var3 < field_14186.length; var3++) {
         class_1013 var4 = field_14186[var3];
         int var5 = this.field_941 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field_940 / 6 + 21 * (var3 / 2) - 12;
         class_7114 var7 = this.<class_7114>method_1186(var4.method_4482(this.field_943.field_9577, var5, var6, 150));
         if (var4 == class_1013.field_5310 || var4 == class_1013.field_5293) {
            var7.field_36675 = false;
         }
      }

      this.<class_5932>method_1186(new class_5932(200, this.field_941 / 2 - 100, this.field_940 / 6 + 168 + 11, class_6956.method_31803("gui.done")));
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         if (var4.field_36675 && var4.field_30159 == 200) {
            this.field_943.field_9577.method_40873();
            this.field_943.method_8609(this.field_14185);
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
      this.field_14182.method_31255(var1, var2, var3, this.field_20540);
   }
}
