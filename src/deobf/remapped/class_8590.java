package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_8590 extends class_3259 {
   public class_5916 field_44013;
   public long field_44015;
   private class_4892 field_44017;
   private class_9521 field_44014;

   public class_8590(Screen var1, class_8881 var2) {
      super(var1, var2, new TranslationTextComponent("controls.title"));
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            18,
            150,
            20,
            new TranslationTextComponent("options.mouse_settings"),
            var1 -> this.field_943.method_8609(new class_3113(this, this.field_16164))
         )
      );
      this.<class_7114>method_1186(class_1013.field_5256.method_4482(this.field_16164, this.field_941 / 2 - 155 + 160, 18, 150));
      this.field_44017 = new class_4892(this, this.field_943);
      this.field_942.add(this.field_44017);
      this.field_44014 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155, this.field_940 - 29, 150, 20, new TranslationTextComponent("controls.resetAll"), var1 -> {
            for (class_5916 var7 : this.field_16164.field_45395) {
               var7.method_27057(var7.method_27053());
            }

            class_5916.method_27067();
         })
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155 + 160, this.field_940 - 29, 150, 20, class_1402.field_7625, var1 -> this.field_943.method_8609(this.field_16162)
         )
      );
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_44013 == null) {
         return super.method_26940(var1, var3, var5);
      } else {
         this.field_16164.method_40863(this.field_44013, class_8863.field_45320.method_40758(var5));
         this.field_44013 = null;
         class_5916.method_27067();
         return true;
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (this.field_44013 == null) {
         return super.method_26946(var1, var2, var3);
      } else {
         if (var1 != 256) {
            this.field_16164.method_40863(this.field_44013, class_9732.method_44940(var1, var2));
         } else {
            this.field_16164.method_40863(this.field_44013, class_9732.field_49455);
         }

         this.field_44013 = null;
         this.field_44015 = Util.getMeasuringTimeMs();
         class_5916.method_27067();
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_44017.method_6767(var1, var2, var3, var4);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 8, 16777215);
      boolean var7 = false;

      for (class_5916 var11 : this.field_16164.field_45395) {
         if (!var11.method_27066()) {
            var7 = true;
            break;
         }
      }

      this.field_44014.field_36675 = var7;
      super.method_6767(var1, var2, var3, var4);
   }
}
