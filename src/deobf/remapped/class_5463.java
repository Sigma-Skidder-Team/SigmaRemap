package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5463 extends class_4785<class_5463> {
   private static String[] field_27825;
   private final class_6676<Identifier> field_27822;
   private final ITextComponent field_27824;

   private class_5463(class_6676<Identifier> var1, class_6676 var2) {
      this.field_27823 = var1;
      this.field_27822 = var2;
      this.field_27824 = new TranslationTextComponent(class_3231.method_14811(var2));
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_2089.method_9771(var1, this.field_27823.field_43571.field_948, this.field_27824, var4 + 2, var3 + 1, var2 % 2 != 0 ? 9474192 : 16777215);
      String var13 = this.field_27822.method_30627(class_3231.method_14804(this.field_27823.field_43571).method_19276(this.field_27822));
      class_2089.method_9770(
         var1,
         this.field_27823.field_43571.field_948,
         var13,
         var4 + 2 + 213 - this.field_27823.field_43571.field_948.method_45395(var13),
         var3 + 1,
         var2 % 2 != 0 ? 9474192 : 16777215
      );
   }
}
