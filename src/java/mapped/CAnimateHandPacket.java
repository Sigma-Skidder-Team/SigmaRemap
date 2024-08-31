package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CAnimateHandPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24459;
   private Hand field24460;

   public CAnimateHandPacket() {
   }

   public CAnimateHandPacket(Hand var1) {
      this.field24460 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24460 = var1.<Hand>method35712(Hand.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24460);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleAnimation(this);
   }

   public Hand getHand() {
      return this.field24460;
   }
}
