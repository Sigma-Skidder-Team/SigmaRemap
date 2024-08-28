package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8587 extends NetworkManager {
   private static final Logger field38661 = LogManager.getLogger();
   private static final ITextComponent field38662 = new TranslationTextComponent("disconnect.exceeded_packet_rate");
   private final int field38663;

   public Class8587(int var1) {
      super(Class1975.SERVERBOUND);
      this.field38663 = var1;
   }

   @Override
   public void method30699() {
      super.method30699();
      float var3 = this.method30714();
      if (var3 > (float)this.field38663) {
         field38661.warn("Player exceeded rate-limit (sent {} packets per second)", var3);
         this.method30694(new Class5530(field38662), var1 -> this.method30701(field38662));
         this.method30711();
      }
   }
}
