package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_9007 extends class_5875 {
   private final long field_46097;
   private final int field_46098;
   private final Runnable field_46096;

   public class_9007(long var1, int var3, Runnable var4) {
      this.field_46097 = var1;
      this.field_46098 = var3;
      this.field_46096 = var4;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();
      this.method_26756(new TranslationTextComponent("mco.minigame.world.slot.screen.title"));

      for (int var4 = 0; var4 < 25; var4++) {
         try {
            if (this.method_26759()) {
               return;
            }

            if (var3.method_806(this.field_46097, this.field_46098)) {
               this.field_46096.run();
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

            field_29831.error("Couldn't switch world!");
            this.method_38114(var7.toString());
         }
      }
   }
}
