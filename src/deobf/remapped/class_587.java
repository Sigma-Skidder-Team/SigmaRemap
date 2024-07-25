package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_587 extends class_4232 {
   private class_266 field_3406;
   private GameOptions field_3409;
   private static class_1013[] field_3408 = new class_1013[]{
      class_1013.field_5318,
      class_1013.field_5294,
      class_1013.field_5240,
      class_1013.field_5194,
      class_1013.field_5237,
      class_1013.field_5287,
      class_1013.field_5193,
      class_1013.field_5214,
      class_1013.field_5189,
      class_1013.field_5211,
      class_1013.field_5276,
      class_1013.field_5226,
      class_1013.field_5317,
      class_1013.field_5204,
      class_1013.field_5216,
      class_1013.field_5279,
      class_1013.field_5191,
      class_1013.field_5275
   };

   public class_587(class_266 var1, GameOptions var2) {
      super(new StringTextComponent(class_6956.method_31803("of.options.animationsTitle")));
      this.field_3406 = var1;
      this.field_3409 = var2;
   }

   @Override
   public void method_1163() {
      this.field_20540.clear();

      for (int var3 = 0; var3 < field_3408.length; var3++) {
         class_1013 var4 = field_3408[var3];
         int var5 = this.field_941 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field_940 / 6 + 21 * (var3 / 2) - 12;
         this.<class_7114>method_1186(var4.method_4482(this.field_943.field_9577, var5, var6, 150));
      }

      this.<class_5932>method_1186(
         new class_5932(210, this.field_941 / 2 - 155, this.field_940 / 6 + 168 + 11, 70, 20, class_3458.method_15912("of.options.animation.allOn"))
      );
      this.<class_5932>method_1186(
         new class_5932(211, this.field_941 / 2 - 155 + 80, this.field_940 / 6 + 168 + 11, 70, 20, class_3458.method_15912("of.options.animation.allOff"))
      );
      this.<class_4583>method_1186(new class_4583(200, this.field_941 / 2 + 5, this.field_940 / 6 + 168 + 11, class_6956.method_31803("gui.done")));
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         if (var4.field_36675) {
            if (var4.field_30159 == 200) {
               this.field_943.field_9577.method_40873();
               this.field_943.method_8609(this.field_3406);
            }

            if (var4.field_30159 == 210) {
               this.field_943.field_9577.method_40896(true);
            }

            if (var4.field_30159 == 211) {
               this.field_943.field_9577.method_40896(false);
            }

            this.field_943.method_32777();
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
      method_9788(var1, this.field_943.textRenderer, this.field_947, this.field_941 / 2, 15, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
