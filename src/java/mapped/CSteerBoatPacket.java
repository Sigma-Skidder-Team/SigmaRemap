package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CSteerBoatPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24589;
   private boolean field24590;
   private boolean field24591;

   public CSteerBoatPacket() {
   }

   public CSteerBoatPacket(boolean var1, boolean var2) {
      this.field24590 = var1;
      this.field24591 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24590 = var1.readBoolean();
      this.field24591 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.field24590);
      var1.writeBoolean(this.field24591);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processSteerBoat(this);
   }

   public boolean method17414() {
      return this.field24590;
   }

   public boolean method17415() {
      return this.field24591;
   }
}
