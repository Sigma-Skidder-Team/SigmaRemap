package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4531 extends class_1094 {
   private static final ITextComponent field_22112 = new TranslationTextComponent("mco.client.outdated.title");
   private static final ITextComponent[] field_22108 = new ITextComponent[]{
      new TranslationTextComponent("mco.client.outdated.msg.line1"), new TranslationTextComponent("mco.client.outdated.msg.line2")
   };
   private static final ITextComponent field_22109 = new TranslationTextComponent("mco.client.incompatible.title");
   private static final ITextComponent[] field_22110 = new ITextComponent[]{
      new TranslationTextComponent("mco.client.incompatible.msg.line1"),
      new TranslationTextComponent("mco.client.incompatible.msg.line2"),
      new TranslationTextComponent("mco.client.incompatible.msg.line3")
   };
   private final Screen field_22106;
   private final boolean field_22107;

   public class_4531(Screen var1, boolean var2) {
      this.field_22106 = var1;
      this.field_22107 = var2;
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, method_4819(12), 200, 20, class_1402.field_7632, var1 -> this.field_943.method_8609(this.field_22106))
      );
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      ITextComponent var7;
      ITextComponent[] var8;
      if (!this.field_22107) {
         var7 = field_22112;
         var8 = field_22108;
      } else {
         var7 = field_22109;
         var8 = field_22110;
      }

      method_9788(var1, this.field_948, var7, this.field_941 / 2, method_4819(3), 16711680);

      for (int var9 = 0; var9 < var8.length; var9++) {
         method_9788(var1, this.field_948, var8[var9], this.field_941 / 2, method_4819(5) + var9 * 12, 16777215);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 257 && var1 != 335 && var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_22106);
         return true;
      }
   }
}
