package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2238 extends class_1094 {
   private final class_1542 field_11148;
   private final ITextComponent field_11149;
   private final ITextComponent field_11151;
   public final BooleanConsumer field_11153;
   private final boolean field_11150;

   public class_2238(BooleanConsumer var1, class_1542 var2, ITextComponent var3, ITextComponent var4, boolean var5) {
      this.field_11153 = var1;
      this.field_11148 = var2;
      this.field_11149 = var3;
      this.field_11151 = var4;
      this.field_11150 = var5;
   }

   @Override
   public void method_1163() {
      class_7567.method_34408(this.field_11148.field_8152, this.field_11149.getString(), this.field_11151.getString());
      if (!this.field_11150) {
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 50, method_4819(8), 100, 20, new TranslationTextComponent("mco.gui.ok"), var1 -> this.field_11153.accept(true))
         );
      } else {
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 105, method_4819(8), 100, 20, class_1402.field_7626, var1 -> this.field_11153.accept(true))
         );
         this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 + 5, method_4819(8), 100, 20, class_1402.field_7628, var1 -> this.field_11153.accept(false))
         );
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_11153.accept(false);
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9787(var1, this.field_948, this.field_11148.field_8152, this.field_941 / 2, method_4819(2), this.field_11148.field_8154);
      method_9788(var1, this.field_948, this.field_11149, this.field_941 / 2, method_4819(4), 16777215);
      method_9788(var1, this.field_948, this.field_11151, this.field_941 / 2, method_4819(6), 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
