package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_5495 extends class_5875 {
   private final long field_27985;
   private final int field_27984;
   private final class_266 field_27988;
   private final String field_27987;

   public class_5495(long var1, int var3, String var4, class_266 var5) {
      this.field_27985 = var1;
      this.field_27984 = var3;
      this.field_27988 = var5;
      this.field_27987 = var4;
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.download.preparing"));
      class_176 var3 = class_176.method_777();
      int var4 = 0;

      while (var4 < 25) {
         try {
            if (this.method_26759()) {
               return;
            }

            class_8105 var5 = var3.method_784(this.field_27985, this.field_27984);
            method_26757(1);
            if (this.method_26759()) {
               return;
            }

            method_26755(new class_9043(this.field_27988, var5, this.field_27987, var0 -> {
            }));
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

            field_29831.error("Couldn't download world data");
            method_26755(new class_9306(var7, this.field_27988));
            return;
         } catch (Exception var8) {
            if (this.method_26759()) {
               return;
            }

            field_29831.error("Couldn't download world data", var8);
            this.method_38114(var8.getLocalizedMessage());
            return;
         }
      }
   }
}
