package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7644 extends class_5121 {
   private static final Logger field_38859 = LogManager.getLogger();
   private static final ITextComponent field_38858 = new TranslationTextComponent("disconnect.exceeded_packet_rate");
   private final int field_38860;

   public class_7644(int var1) {
      super(class_4739.field_22963);
      this.field_38860 = var1;
   }

   @Override
   public void method_23496() {
      super.method_23496();
      float var3 = this.method_23498();
      if (var3 > (float)this.field_38860) {
         field_38859.warn("Player exceeded rate-limit (sent {} packets per second)", var3);
         this.method_23486(new class_7957(field_38858), var1 -> this.method_23482(field_38858));
         this.method_23479();
      }
   }
}
