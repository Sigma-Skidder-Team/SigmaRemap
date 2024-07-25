package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_971 extends class_3259 {
   public class_971(Screen var1, GameOptions var2) {
      super(var1, var2, new TranslationTextComponent("options.sounds.title"));
   }

   @Override
   public void method_1163() {
      int var3 = 0;
      this.<class_7612>method_1186(
         new class_7612(this.field_943, this.field_941 / 2 - 155 + var3 % 2 * 160, this.field_940 / 6 - 12 + 24 * (var3 >> 1), class_562.field_3326, 310)
      );
      var3 += 2;

      for (class_562 var7 : class_562.values()) {
         if (var7 != class_562.field_3326) {
            this.<class_7612>method_1186(
               new class_7612(this.field_943, this.field_941 / 2 - 155 + var3 % 2 * 160, this.field_940 / 6 - 12 + 24 * (var3 >> 1), var7, 150)
            );
            var3++;
         }
      }

      int var10 = this.field_941 / 2 - 75;
      int var11 = this.field_940 / 6 - 12;
      this.<class_2116>method_1186(
         new class_2116(var10, var11 + 24 * (++var3 >> 1), 150, 20, class_1013.field_5291, class_1013.field_5291.method_22128(this.field_16164), var1 -> {
            class_1013.field_5291.method_22127(this.field_943.gameOptions);
            var1.method_32687(class_1013.field_5291.method_22128(this.field_943.gameOptions));
            this.field_943.gameOptions.method_40873();
         })
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 6 + 168, 200, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(this.field_16162)
         )
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 15, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
