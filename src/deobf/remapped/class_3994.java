package remapped;

import net.minecraft.util.text.ITextComponent;

public final class class_3994 implements class_1215 {
   private long field_19409 = Util.getMeasuringTimeMs();

   public void 樽鱀ၝ藸鶲轐(ITextComponent var1) {
   }

   public void 䈔瀳㼜뎫蒕阢(ITextComponent var1) {
   }

   public void 堧ꦱ좯钘蒕콗(int var1) {
      if (Util.getMeasuringTimeMs() - this.field_19409 >= 1000L) {
         this.field_19409 = Util.getMeasuringTimeMs();
         class_341.method_1750().info("Converting... {}%", var1);
      }
   }

   public void 鶊꿩蚳蛊ኞ䢿() {
   }

   public void 䈔㼜粤㕠汌셴(ITextComponent var1) {
   }
}
