package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7262 extends class_266 {
   private final class_266 field_37207;
   public final class_3201 field_37203;
   private final ITextComponent field_37208;
   private final boolean field_37205;
   private class_416 field_37202 = class_416.field_1766;
   private class_8387 field_37204;

   public class_7262(class_266 var1, class_3201 var2, ITextComponent var3, ITextComponent var4, boolean var5) {
      super(var3);
      this.field_37207 = var1;
      this.field_37203 = var2;
      this.field_37208 = var4;
      this.field_37205 = var5;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_37202 = class_416.method_2075(this.field_948, this.field_37208, this.field_941 - 50);
      int var3 = (this.field_37202.method_2072() + 1) * 9;
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            100 + var3,
            150,
            20,
            new TranslationTextComponent("selectWorld.backupJoinConfirmButton"),
            var1 -> this.field_37203.method_14737(true, this.field_37204.method_38643())
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155 + 160,
            100 + var3,
            150,
            20,
            new TranslationTextComponent("selectWorld.backupJoinSkipButton"),
            var1 -> this.field_37203.method_14737(false, this.field_37204.method_38643())
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 155 + 80, 124 + var3, 150, 20, class_1402.field_7633, var1 -> this.field_943.method_8609(this.field_37207))
      );
      this.field_37204 = new class_8387(this.field_941 / 2 - 155 + 80, 76 + var3, 150, 20, new TranslationTextComponent("selectWorld.backupEraseCache"), false);
      if (this.field_37205) {
         this.<class_8387>method_1186(this.field_37204);
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 50, 16777215);
      this.field_37202.method_2067(var1, this.field_941 / 2, 70);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_37207);
         return true;
      }
   }
}
