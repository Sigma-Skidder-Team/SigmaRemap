package remapped;

import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7174 extends class_2451 {
   private final class_8427 field_36906;

   public class_7174(class_8427 var1, class_317 var2) {
      super(var2);
      this.field_36906 = var1;
   }

   public class_8427 method_32877() {
      return this.field_36906;
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      var3.add(this.method_32878().mergeStyle(TextFormatting.GRAY));
   }

   public IFormattableTextComponent method_32878() {
      return new TranslationTextComponent(this.method_11216() + ".desc");
   }
}
