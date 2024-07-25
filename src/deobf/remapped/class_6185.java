package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_6185 extends class_1094 {
   private final ITextComponent field_31607;
   private final ITextComponent field_31604;
   private class_416 field_31606 = class_416.field_1766;
   private final class_266 field_31605;
   private int field_31608;

   public class_6185(class_266 var1, ITextComponent var2, ITextComponent var3) {
      this.field_31605 = var1;
      this.field_31607 = var2;
      this.field_31604 = var3;
   }

   @Override
   public void method_1163() {
      MinecraftClient var3 = MinecraftClient.method_8510();
      var3.method_8509(false);
      var3.method_8606().method_25058();
      class_7567.method_34410(this.field_31607.getString() + ": " + this.field_31604.getString());
      this.field_31606 = class_416.method_2075(this.field_948, this.field_31604, this.field_941 - 50);
      this.field_31608 = this.field_31606.method_2072() * 9;
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 2 + this.field_31608 / 2 + 9, 200, 20, class_1402.field_7632, var2 -> var3.method_8609(this.field_31605)
         )
      );
   }

   @Override
   public void method_1156() {
      MinecraftClient.method_8510().method_8609(this.field_31605);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_31607, this.field_941 / 2, this.field_940 / 2 - this.field_31608 / 2 - 18, 11184810);
      this.field_31606.method_2067(var1, this.field_941 / 2, this.field_940 / 2 - this.field_31608 / 2);
      super.method_6767(var1, var2, var3, var4);
   }
}
