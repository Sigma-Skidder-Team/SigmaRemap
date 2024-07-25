package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_1086 extends class_5766 {
   public class_1086() {
      super("");
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 - 40, 200, 20, new TranslationTextComponent("multiplayer.stopSleeping"), var1 -> this.method_4763()
         )
      );
   }

   @Override
   public void method_1156() {
      this.method_4763();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         if (var1 == 257 || var1 == 335) {
            String var6 = this.field_29142.method_8246().trim();
            if (!var6.isEmpty()) {
               this.method_1171(var6);
            }

            this.field_29142.method_8281("");
            this.field_943.field_9614.method_13991().method_18691();
            return true;
         }
      } else {
         this.method_4763();
      }

      return super.method_26946(var1, var2, var3);
   }

   private void method_4763() {
      ClientPlayNetHandler var3 = this.field_943.thePlayer.connection;
      var3.method_4813(new class_2317(this.field_943.thePlayer, class_4127.field_20102));
   }
}
