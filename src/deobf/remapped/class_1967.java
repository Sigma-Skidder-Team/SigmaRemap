package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;

public class class_1967 extends class_741 {
   public class_1967(class_6414 var1, class_6414 var2, class_317 var3) {
      super(var1, var2, var3);
      Validate.isInstanceOf(class_764.class, var1);
      Validate.isInstanceOf(class_764.class, var2);
   }

   public static void method_9064(class_6098 var0, List<ITextComponent> var1) {
      class_5734 var4 = var0.method_28021("BlockEntityTag");
      if (var4 != null && var4.method_25938("Patterns")) {
         class_3416 var5 = var4.method_25927("Patterns", 10);

         for (int var6 = 0; var6 < var5.size() && var6 < 6; var6++) {
            class_5734 var7 = var5.method_15764(var6);
            class_9077 var8 = class_9077.method_41789(var7.method_25947("Color"));
            class_8427 var9 = class_8427.method_38788(var7.method_25965("Pattern"));
            if (var9 != null) {
               var1.add(
                  new TranslationTextComponent("block.minecraft.banner." + var9.method_38785() + '.' + var8.method_41796()).mergeStyle(TextFormatting.GRAY)
               );
            }
         }
      }
   }

   public class_9077 method_9065() {
      return ((class_764)this.method_28392()).method_3443();
   }

   @Override
   public void method_11218(class_6098 var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      method_9064(var1, var3);
   }
}
