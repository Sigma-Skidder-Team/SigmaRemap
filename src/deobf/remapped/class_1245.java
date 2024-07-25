package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_1245 extends Thread {
   public class_1245(class_7039 var1, String var2) {
      super(var2);
      this.field_6860 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         class_2529 var4 = var3.method_778();
         if (var4 == class_2529.field_12537) {
            class_7039.field_36337 = new class_4531(class_7039.method_32291(this.field_6860), true);
            class_7039.method_32241(this.field_6860).execute(() -> class_7039.method_32216(this.field_6860).method_8609(class_7039.field_36337));
            return;
         }

         if (var4 == class_2529.field_12533) {
            class_7039.field_36337 = new class_4531(class_7039.method_32291(this.field_6860), false);
            class_7039.method_32280(this.field_6860).execute(() -> class_7039.method_32319(this.field_6860).method_8609(class_7039.field_36337));
            return;
         }

         class_7039.method_32330(this.field_6860);
      } catch (class_3900 var5) {
         class_7039.method_32275(false);
         class_7039.method_32312().error("Couldn't connect to realms", var5);
         if (var5.field_18958 == 401) {
            class_7039.field_36337 = new class_9306(
               new TranslationTextComponent("mco.error.invalid.session.title"),
               new TranslationTextComponent("mco.error.invalid.session.message"),
               class_7039.method_32291(this.field_6860)
            );
            class_7039.method_32318(this.field_6860).execute(() -> class_7039.method_32298(this.field_6860).method_8609(class_7039.field_36337));
         } else {
            class_7039.method_32265(this.field_6860)
               .execute(() -> class_7039.method_32214(this.field_6860).method_8609(new class_9306(var5, class_7039.method_32291(this.field_6860))));
         }
      }
   }
}
