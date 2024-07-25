package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2714 extends class_4785<class_2714> {
   private final class_6325 field_13268;
   private final ITextComponent field_13266;

   public class_2714(class_4213 var1, class_6325 var2) {
      this.field_13265 = var1;
      this.field_13268 = var2;
      Identifier var5 = class_9336.method_43106(var1.field_20465).method_39797(var2);
      String var6 = "biome." + var5.method_21461() + "." + var5.method_21456();
      if (!LanguageMap.getInstance().func_230506_b_(var6)) {
         this.field_13266 = new StringTextComponent(var5.toString());
      } else {
         this.field_13266 = new TranslationTextComponent(var6);
      }
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_2089.method_9771(var1, this.field_13265.field_20465.field_948, this.field_13266, var4 + 5, var3 + 2, 16777215);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.field_13265.method_19585(this);
         return true;
      }
   }
}
