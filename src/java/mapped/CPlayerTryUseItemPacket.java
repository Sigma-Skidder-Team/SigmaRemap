package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPlayerTryUseItemPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24660;
   private Hand field24661;

   public CPlayerTryUseItemPacket() {
   }

   public CPlayerTryUseItemPacket(Hand var1) {
      this.field24661 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24661 = var1.<Hand>method35712(Hand.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24661);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processTryUseItem(this);
   }

   public Hand method17472() {
      return this.field24661;
   }
}
