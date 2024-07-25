package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9306 extends class_1094 {
   private final Screen field_47531;
   private ITextComponent field_47530;
   private ITextComponent field_47529;

   public class_9306(class_3900 var1, Screen var2) {
      this.field_47531 = var2;
      this.method_42964(var1);
   }

   public class_9306(ITextComponent var1, Screen var2) {
      this.field_47531 = var2;
      this.method_42963(var1);
   }

   public class_9306(ITextComponent var1, ITextComponent var2, Screen var3) {
      this.field_47531 = var3;
      this.method_42965(var1, var2);
   }

   private void method_42964(class_3900 var1) {
      if (var1.field_18957 != -1) {
         this.field_47530 = new StringTextComponent("Realms (" + var1.field_18957 + "):");
         String var4 = "mco.errorMessage." + var1.field_18957;
         this.field_47529 = (ITextComponent)(!class_6956.method_31804(var4)
            ? ITextComponent.func_244388_a(var1.field_18959)
            : new TranslationTextComponent(var4));
      } else {
         this.field_47530 = new StringTextComponent("An error occurred (" + var1.field_18958 + "):");
         this.field_47529 = new StringTextComponent(var1.field_18960);
      }
   }

   private void method_42963(ITextComponent var1) {
      this.field_47530 = new StringTextComponent("An error occurred: ");
      this.field_47529 = var1;
   }

   private void method_42965(ITextComponent var1, ITextComponent var2) {
      this.field_47530 = var1;
      this.field_47529 = var2;
   }

   @Override
   public void method_1163() {
      class_7567.method_34410(this.field_47530.getString() + ": " + this.field_47529.getString());
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 - 52, 200, 20, new StringTextComponent("Ok"), var1 -> this.field_943.method_8609(this.field_47531)
         )
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_47530, this.field_941 / 2, 80, 16777215);
      method_9788(var1, this.field_948, this.field_47529, this.field_941 / 2, 100, 16711680);
      super.method_6767(var1, var2, var3, var4);
   }
}
