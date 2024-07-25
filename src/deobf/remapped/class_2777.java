package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2777 implements class_7394 {
   private static final ITextComponent field_13565 = new TranslationTextComponent("multiplayer.status.request_handled");
   private final class_341 field_13564;
   private final class_5121 field_13566;
   private boolean field_13563;

   public class_2777(class_341 var1, class_5121 var2) {
      this.field_13564 = var1;
      this.field_13566 = var2;
   }

   public void 뗴낛葫骰室㢸(ITextComponent var1) {
   }

   public class_5121 퉧䣓塱躚㢸挐() {
      return this.field_13566;
   }

   public void 婯ꈍ岋筕醧驋(class_3079 var1) {
      if (!this.field_13563) {
         this.field_13563 = true;
         this.field_13566.method_23485(new class_1184(this.field_13564.method_1629()));
      } else {
         this.field_13566.method_23482(field_13565);
      }
   }

   public void 㨳汌顸ኞ늦筕(class_1369 var1) {
      this.field_13566.method_23485(new class_8334(var1.method_6339()));
      this.field_13566.method_23482(field_13565);
   }
}
