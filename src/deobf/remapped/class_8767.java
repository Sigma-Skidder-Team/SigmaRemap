package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_8767 extends class_4232 {
   private class_266 field_44887;
   private class_8881 field_44888;
   private class_6809 field_44886 = new class_6809(this, new class_3403());

   public class_8767(class_266 var1, class_8881 var2) {
      super(new StringTextComponent(class_6956.method_31803("of.options.otherTitle")));
      this.field_44887 = var1;
      this.field_44888 = var2;
   }

   @Override
   public void method_1163() {
      this.field_20540.clear();
      class_5819 var3 = new class_5819(this.field_943.method_8552());
      class_1013[] var4 = new class_1013[]{
         class_1013.field_5312,
         class_1013.field_5196,
         class_1013.field_5190,
         class_1013.field_5200,
         class_1013.field_5296,
         class_1013.field_5242,
         class_1013.field_5246,
         class_1013.field_5205,
         class_1013.field_5248,
         class_1013.field_5313,
         var3,
         null
      };

      for (int var5 = 0; var5 < var4.length; var5++) {
         class_1013 var6 = var4[var5];
         int var7 = this.field_941 / 2 - 155 + var5 % 2 * 160;
         int var8 = this.field_940 / 6 + 21 * (var5 / 2) - 12;
         class_7114 var9 = this.<class_7114>method_1186(var6.method_4482(this.field_943.field_9577, var7, var8, 150));
         if (var6 == var3) {
            var9.method_32688(310);
            var5++;
         }
      }

      this.<class_5932>method_1186(
         new class_5932(210, this.field_941 / 2 - 100, this.field_940 / 6 + 168 + 11 - 44, class_6956.method_31803("of.options.other.reset"))
      );
      this.<class_5932>method_1186(new class_5932(200, this.field_941 / 2 - 100, this.field_940 / 6 + 168 + 11, class_6956.method_31803("gui.done")));
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         if (var4.field_36675) {
            if (var4.field_30159 == 200) {
               this.field_943.field_9577.method_40873();
               this.field_943.method_8552().method_43160();
               this.field_943.method_8609(this.field_44887);
            }

            if (var4.field_30159 == 210) {
               this.field_943.field_9577.method_40873();
               String var5 = class_6956.method_31803("of.message.other.reset");
               class_9640 var6 = new class_9640(this::method_40286, new StringTextComponent(var5), new StringTextComponent(""));
               this.field_943.method_8609(var6);
            }
         }
      }
   }

   @Override
   public void method_1162() {
      this.field_943.field_9577.method_40873();
      this.field_943.method_8552().method_43160();
      super.method_1162();
   }

   public void method_40286(boolean var1) {
      if (var1) {
         this.field_943.field_9577.method_40866();
      }

      this.field_943.method_8609(this);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_20538, this.field_947, this.field_941 / 2, 15, 16777215);
      super.method_6767(var1, var2, var3, var4);
      this.field_44886.method_31255(var1, var2, var3, this.field_20540);
   }
}
