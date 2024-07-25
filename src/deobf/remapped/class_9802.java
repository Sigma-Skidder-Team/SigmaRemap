package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9802 extends class_3259 {
   public class_9802(Screen var1, GameOptions var2) {
      super(var1, var2, new TranslationTextComponent("options.skinCustomisation.title"));
   }

   @Override
   public void method_1163() {
      int var3 = 0;

      for (class_7742 var7 : class_7742.values()) {
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 155 + var3 % 2 * 160, this.field_940 / 6 + 24 * (var3 >> 1), 150, 20, this.method_45216(var7), var2 -> {
               this.field_16164.method_40864(var7);
               var2.method_32687(this.method_45216(var7));
            })
         );
         var3++;
      }

      this.<class_2116>method_1186(
         new class_2116(
            this.field_941 / 2 - 155 + var3 % 2 * 160,
            this.field_940 / 6 + 24 * (var3 >> 1),
            150,
            20,
            class_1013.field_5264,
            class_1013.field_5264.method_18454(this.field_16164),
            var1 -> {
               class_1013.field_5264.method_18455(this.field_16164, 1);
               this.field_16164.method_40873();
               var1.method_32687(class_1013.field_5264.method_18454(this.field_16164));
               this.field_16164.method_40870();
            }
         )
      );
      if (++var3 % 2 == 1) {
         var3++;
      }

      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 6 + 24 * (var3 >> 1),
            200,
            20,
            class_3458.method_15904("of.options.skinCustomisation.ofCape"),
            var1 -> this.field_943.method_8609(new class_5224(this))
         )
      );
      var3 += 2;
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 6 + 24 * (var3 >> 1),
            200,
            20,
            class_1402.field_7625,
            var1 -> this.field_943.method_8609(this.field_16162)
         )
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }

   private ITextComponent method_45216(class_7742 var1) {
      return class_1402.method_6480(var1.method_35040(), this.field_16164.method_40883().contains(var1));
   }
}
