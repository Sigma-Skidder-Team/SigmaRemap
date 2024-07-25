package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7152 extends Screen implements class_1215 {
   private ITextComponent field_36839;
   private ITextComponent field_36836;
   private int field_36835;
   private boolean field_36840;
   private class_1433 field_36838 = class_5609.method_25460();

   public class_7152() {
      super(class_7542.field_38486);
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   public void 樽鱀ၝ藸鶲轐(ITextComponent var1) {
      this.䈔瀳㼜뎫蒕阢(var1);
   }

   public void 䈔瀳㼜뎫蒕阢(ITextComponent var1) {
      this.field_36839 = var1;
      this.䈔㼜粤㕠汌셴(new TranslationTextComponent("progress.working"));
   }

   public void 䈔㼜粤㕠汌셴(ITextComponent var1) {
      this.field_36836 = var1;
      this.堧ꦱ좯钘蒕콗(0);
   }

   public void 堧ꦱ좯钘蒕콗(int var1) {
      this.field_36835 = var1;
   }

   public void 鶊꿩蚳蛊ኞ䢿() {
      this.field_36840 = true;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (!this.field_36840) {
         if (this.field_36838 != null && this.field_943.field_9601 == null) {
            this.field_36838.method_6579(this.field_941, this.field_940);
         } else {
            this.method_1183(var1);
         }

         if (this.field_36835 > 0) {
            if (this.field_36839 != null) {
               method_9788(var1, this.field_948, this.field_36839, this.field_941 / 2, 70, 16777215);
            }

            if (this.field_36836 != null && this.field_36835 != 0) {
               method_9788(
                  var1,
                  this.field_948,
                  new StringTextComponent("").append(this.field_36836).appendString(" " + this.field_36835 + "%"),
                  this.field_941 / 2,
                  90,
                  16777215
               );
            }
         }

         super.method_6767(var1, var2, var3, var4);
      } else if (!this.field_943.method_8534()) {
         this.field_943.method_8609((Screen)null);
      }
   }
}
