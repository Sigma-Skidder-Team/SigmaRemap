package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_4991 extends class_5875 {
   private final long field_25833;
   private final class_2496 field_25836;
   private final class_2866 field_25834;

   public class_4991(long var1, class_2496 var3, class_2866 var4) {
      this.field_25833 = var1;
      this.field_25836 = var3;
      this.field_25834 = var4;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();
      this.method_26756(new TranslationTextComponent("mco.minigame.world.starting.screen.title"));

      for (int var4 = 0; var4 < 25; var4++) {
         try {
            if (this.method_26759()) {
               return;
            }

            if (var3.method_786(this.field_25833, this.field_25836.field_12412)) {
               method_26755(this.field_25834);
               break;
            }
         } catch (class_5954 var6) {
            if (this.method_26759()) {
               return;
            }

            method_26757(var6.field_30351);
         } catch (Exception var7) {
            if (this.method_26759()) {
               return;
            }

            field_29831.error("Couldn't start mini game!");
            this.method_38114(var7.toString());
         }
      }
   }
}
