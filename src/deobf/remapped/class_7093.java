package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_7093 extends class_5875 {
   private final class_7675 field_36594;
   private final class_2866 field_36592;

   public class_7093(class_7675 var1, class_2866 var2) {
      this.field_36594 = var1;
      this.field_36592 = var2;
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.configure.world.closing"));
      class_176 var3 = class_176.method_777();

      for (int var4 = 0; var4 < 25; var4++) {
         if (this.method_26759()) {
            return;
         }

         try {
            boolean var5 = var3.method_799(this.field_36594.field_39016);
            if (var5) {
               this.field_36592.method_13151();
               this.field_36594.field_39004 = class_6804.field_35064;
               method_26755(this.field_36592);
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

            field_29831.error("Failed to close server", var7);
            this.method_38114("Failed to close the server");
         }
      }
   }
}
