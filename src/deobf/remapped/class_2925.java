package remapped;

import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2925 implements class_1870 {
   private static final Logger field_14255 = LogManager.getLogger();
   private final int field_14256;
   private int field_14257;
   private long field_14254;
   private long field_14259 = Long.MAX_VALUE;

   public class_2925(int var1) {
      int var4 = var1 * 2 + 1;
      this.field_14256 = var4 * var4;
   }

   @Override
   public void method_8296(class_2034 var1) {
      this.field_14259 = Util.getMeasuringTimeMs();
      this.field_14254 = this.field_14259;
   }

   @Override
   public void method_8297(class_2034 var1, class_7335 var2) {
      if (var2 == class_7335.field_37514) {
         this.field_14257++;
      }

      int var5 = this.method_13378();
      if (Util.getMeasuringTimeMs() > this.field_14259) {
         this.field_14259 += 500L;
         field_14255.info(new TranslationTextComponent("menu.preparingSpawn", MathHelper.clamp(var5, 0, 100)).getString());
      }
   }

   @Override
   public void method_8298() {
      field_14255.info("Time elapsed: {} ms", Util.getMeasuringTimeMs() - this.field_14254);
      this.field_14259 = Long.MAX_VALUE;
   }

   public int method_13378() {
      return MathHelper.floor((float)this.field_14257 * 100.0F / (float)this.field_14256);
   }
}
