package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6036 extends class_1942 {
   private final class_5916 field_30824;
   private final ITextComponent field_30825;
   private final class_9521 field_30823;
   private final class_9521 field_30827;

   private class_6036(class_4892 var1, class_5916 var2, ITextComponent var3) {
      this.field_30822 = var1;
      this.field_30824 = var2;
      this.field_30825 = var3;
      this.field_30823 = new class_3130(this, 0, 0, 75, 20, var3, var2x -> class_4892.method_22429(this.field_30822).field_44013 = var2, var1, var2, var3);
      this.field_30827 = new class_325(this, 0, 0, 50, 20, new TranslationTextComponent("controls.reset"), var2x -> {
         this.field_30822.field_40883.field_9577.method_40863(var2, var2.method_27053());
         class_5916.method_27067();
      }, var1, var3);
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      boolean var13 = class_4892.method_22429(this.field_30822).field_44013 == this.field_30824;
      this.field_30822
         .field_40883
         .field_9668
         .method_45378(var1, this.field_30825, (float)(var4 + 90 - class_4892.method_22430(this.field_30822)), (float)(var3 + var6 / 2 - 4), 16777215);
      this.field_30827.field_36670 = var4 + 190;
      this.field_30827.field_36674 = var3;
      this.field_30827.field_36675 = !this.field_30824.method_27066();
      this.field_30827.method_6767(var1, var7, var8, var10);
      this.field_30823.field_36670 = var4 + 105;
      this.field_30823.field_36674 = var3;
      this.field_30823.method_32687(this.field_30824.method_27061());
      boolean var14 = false;
      if (!this.field_30824.method_27073()) {
         for (class_5916 var18 : this.field_30822.field_40883.field_9577.field_45395) {
            if (var18 != this.field_30824 && this.field_30824.method_27058(var18)) {
               var14 = true;
               break;
            }
         }
      }

      if (!var13) {
         if (var14) {
            this.field_30823.method_32687(this.field_30823.method_32685().deepCopy().mergeStyle(TextFormatting.RED));
         }
      } else {
         this.field_30823
            .method_32687(
               new StringTextComponent("> ")
                  .append(this.field_30823.method_32685().deepCopy().mergeStyle(TextFormatting.YELLOW))
                  .appendString(" <")
                  .mergeStyle(TextFormatting.YELLOW)
            );
      }

      this.field_30823.method_6767(var1, var7, var8, var10);
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return ImmutableList.of(this.field_30823, this.field_30827);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      return !this.field_30823.method_26940(var1, var3, var5) ? this.field_30827.method_26940(var1, var3, var5) : true;
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      return this.field_30823.method_26941(var1, var3, var5) || this.field_30827.method_26941(var1, var3, var5);
   }
}
