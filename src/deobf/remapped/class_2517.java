package remapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;

public class class_2517 extends class_1094 {
   private static String[] field_12476;
   public BooleanConsumer field_12475;
   private final ITextComponent field_12477;
   private final ITextComponent field_12478;
   private int field_12474;

   public class_2517(BooleanConsumer var1, ITextComponent var2, ITextComponent var3) {
      this.field_12475 = var1;
      this.field_12477 = var2;
      this.field_12478 = var3;
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 105, method_4819(9), 100, 20, class_1402.field_7626, var1 -> this.field_12475.accept(true))
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 5, method_4819(9), 100, 20, class_1402.field_7628, var1 -> this.field_12475.accept(false))
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_12477, this.field_941 / 2, method_4819(3), 16777215);
      method_9788(var1, this.field_948, this.field_12478, this.field_941 / 2, method_4819(5), 16777215);
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public void method_5312() {
      super.method_5312();
      if (--this.field_12474 == 0) {
         for (class_7114 var4 : this.field_950) {
            var4.field_36675 = true;
         }
      }
   }
}
