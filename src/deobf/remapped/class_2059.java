package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2059 implements class_8668 {
   private final List<String> field_10412;

   public class_2059(class_6098 var1) {
      this.field_10412 = method_9613(var1);
   }

   private static List<String> method_9613(class_6098 var0) {
      class_5734 var3 = var0.method_27990();
      return (List<String>)(var3 != null && class_1138.method_4990(var3)
         ? class_7680.method_34805(var3)
         : ImmutableList.of(ITextComponent$class_40.toJson(new TranslationTextComponent("book.invalid.tag").mergeStyle(TextFormatting.DARK_RED))));
   }

   @Override
   public int method_39737() {
      return this.field_10412.size();
   }

   @Override
   public ITextProperties method_39734(int var1) {
      String var4 = this.field_10412.get(var1);

      try {
         IFormattableTextComponent var5 = ITextComponent$class_40.func_240643_a_(var4);
         if (var5 != null) {
            return var5;
         }
      } catch (Exception var6) {
      }

      return ITextProperties.func_240652_a_(var4);
   }
}
