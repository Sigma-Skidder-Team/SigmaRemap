package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_3831 extends Screen {
   private static String[] field_18718;
   private final ITextComponent field_18719;

   public class_3831(ITextComponent var1, ITextComponent var2) {
      super(var1);
      this.field_18719 = var2;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, 140, 200, 20, class_1402.field_7633, var1 -> this.field_943.method_8609((Screen)null))
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_9772(var1, 0, 0, this.field_941, this.field_940, -12574688, -11530224);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 90, 16777215);
      method_9788(var1, this.field_948, this.field_18719, this.field_941 / 2, 110, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1178() {
      return false;
   }
}
