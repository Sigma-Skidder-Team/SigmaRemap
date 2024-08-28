package mapped;

import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7244 implements Class7243 {
   private static final Logger field31096 = LogManager.getLogger();
   private final int field31097;
   private int field31098;
   private long field31099;
   private long field31100 = Long.MAX_VALUE;

   public Class7244(int var1) {
      int var4 = var1 * 2 + 1;
      this.field31097 = var4 * var4;
   }

   @Override
   public void method22736(Class7481 var1) {
      this.field31100 = Util.milliTime();
      this.field31099 = this.field31100;
   }

   @Override
   public void method22737(Class7481 var1, Class9176 var2) {
      if (var2 == Class9176.field42145) {
         this.field31098++;
      }

      int var5 = this.method22741();
      if (Util.milliTime() > this.field31100) {
         this.field31100 += 500L;
         field31096.info(new TranslationTextComponent("menu.preparingSpawn", MathHelper.method37775(var5, 0, 100)).getString());
      }
   }

   @Override
   public void method22738() {
      field31096.info("Time elapsed: {} ms", Util.milliTime() - this.field31099);
      this.field31100 = Long.MAX_VALUE;
   }

   public int method22741() {
      return MathHelper.method37767((float)this.field31098 * 100.0F / (float)this.field31097);
   }
}
