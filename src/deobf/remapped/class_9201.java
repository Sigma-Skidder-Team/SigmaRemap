package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_9201 extends class_5875 {
   private final class_8960 field_47075;
   private final long field_47076;
   private final class_2866 field_47078;

   public class_9201(class_8960 var1, long var2, class_2866 var4) {
      this.field_47075 = var1;
      this.field_47076 = var2;
      this.field_47078 = var4;
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.backup.restoring"));
      class_176 var3 = class_176.method_777();
      int var4 = 0;

      while (var4 < 25) {
         try {
            if (this.method_26759()) {
               return;
            }

            var3.method_764(this.field_47076, this.field_47075.field_45902);
            method_26757(1);
            if (this.method_26759()) {
               return;
            }

            method_26755(this.field_47078.method_13136());
            return;
         } catch (class_5954 var6) {
            if (this.method_26759()) {
               return;
            }

            method_26757(var6.field_30351);
            var4++;
         } catch (class_3900 var7) {
            if (this.method_26759()) {
               return;
            }

            field_29831.error("Couldn't restore backup", var7);
            method_26755(new class_9306(var7, this.field_47078));
            return;
         } catch (Exception var8) {
            if (this.method_26759()) {
               return;
            }

            field_29831.error("Couldn't restore backup", var8);
            this.method_38114(var8.getLocalizedMessage());
            return;
         }
      }
   }
}
