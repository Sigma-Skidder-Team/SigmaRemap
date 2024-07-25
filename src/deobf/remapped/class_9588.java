package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_9588 extends class_266 {
   private class_416 field_48766 = class_416.field_1766;
   private final Runnable field_48765;

   public class_9588(Runnable var1) {
      super(new TranslationTextComponent("datapackFailure.title"));
      this.field_48765 = var1;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_48766 = class_416.method_2075(this.field_948, this.method_1168(), this.field_941 - 50);
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155,
            this.field_940 / 6 + 96,
            150,
            20,
            new TranslationTextComponent("datapackFailure.safeMode"),
            var1 -> this.field_48765.run()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 155 + 160,
            this.field_940 / 6 + 96,
            150,
            20,
            new TranslationTextComponent("gui.toTitle"),
            var1 -> this.field_943.method_8609((class_266)null)
         )
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_48766.method_2067(var1, this.field_941 / 2, 70);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1178() {
      return false;
   }
}
