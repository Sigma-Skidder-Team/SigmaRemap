package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4718 extends class_7680 implements class_4378<class_6360> {
   private final class_6360 field_22892;
   private final class_117 field_22890 = new class_7406(this);

   public class_4718(class_6360 var1, class_7051 var2, ITextComponent var3) {
      this.field_22892 = var1;
   }

   public class_6360 method_21819() {
      return this.field_22892;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_22892.method_18888(this.field_22890);
   }

   @Override
   public void method_1156() {
      this.field_943.thePlayer.method_3207();
      super.method_1156();
   }

   @Override
   public void method_1162() {
      super.method_1162();
      this.field_22892.method_18880(this.field_22890);
   }

   @Override
   public void method_34807() {
      if (!this.field_943.thePlayer.method_3181()) {
         super.method_34807();
      } else {
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 100, 196, 98, 20, class_1402.field_7625, var1 -> this.field_943.method_8609((Screen)null))
         );
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 + 2, 196, 98, 20, new TranslationTextComponent("lectern.take_book"), var1 -> this.method_21817(3))
         );
      }
   }

   @Override
   public void method_34806() {
      this.method_21817(1);
   }

   @Override
   public void method_34802() {
      this.method_21817(2);
   }

   @Override
   public boolean method_34808(int var1) {
      if (var1 == this.field_22892.method_29136()) {
         return false;
      } else {
         this.method_21817(100 + var1);
         return true;
      }
   }

   private void method_21817(int var1) {
      this.field_943.playerController.method_42154(this.field_22892.field_19925, var1);
   }

   @Override
   public boolean method_1161() {
      return false;
   }

   private void method_21820() {
      ItemStack var3 = this.field_22892.method_29135();
      this.method_34809(class_8668.method_39736(var3));
   }

   private void method_21822() {
      this.method_34804(this.field_22892.method_29136());
   }
}
