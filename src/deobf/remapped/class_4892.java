package remapped;

import java.util.Arrays;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_4892 extends class_4855<class_1942> {
   private static String[] field_24311;
   private final class_8590 field_24312;
   private int field_24310;

   public class_4892(class_8590 var1, MinecraftClient var2) {
      super(var2, var1.field_941 + 45, var1.field_940, 43, var1.field_940 - 32, 20);
      this.field_24312 = var1;
      class_5916[] var5 = (class_5916[])ArrayUtils.clone(var2.gameOptions.field_45395);
      Arrays.sort(var5);
      String var6 = null;

      for (class_5916 var10 : var5) {
         String var11 = var10.method_27054();
         if (!var11.equals(var6)) {
            var6 = var11;
            this.method_36202(new class_5629(this, new TranslationTextComponent(var11)));
         }

         TranslationTextComponent var12 = new TranslationTextComponent(var10.method_27055());
         int var13 = var2.textRenderer.method_45379(var12);
         if (var13 > this.field_24310) {
            this.field_24310 = var13;
         }

         this.method_36202(new class_6036(this, var10, var12, null));
      }
   }

   @Override
   public int method_36191() {
      return super.method_36191() + 15;
   }

   @Override
   public int method_36195() {
      return super.method_36195() + 32;
   }
}
