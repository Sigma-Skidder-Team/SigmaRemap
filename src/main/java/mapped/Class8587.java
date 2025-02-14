package mapped;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketDirection;
import net.minecraft.network.play.server.SDisconnectPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8587 extends NetworkManager {
   private static final Logger field38661 = LogManager.getLogger();
   private static final ITextComponent field38662 = new TranslationTextComponent("disconnect.exceeded_packet_rate");
   private final int field38663;

   public Class8587(int var1) {
      super(PacketDirection.SERVERBOUND);
      this.field38663 = var1;
   }

   @Override
   public void func_241877_b() {
      super.func_241877_b();
      float var3 = this.getPacketsReceived();
      if (var3 > (float)this.field38663) {
         field38661.warn("Player exceeded rate-limit (sent {} packets per second)", var3);
         this.sendPacket(new SDisconnectPacket(field38662), var1 -> this.closeChannel(field38662));
         this.disableAutoRead();
      }
   }
}
