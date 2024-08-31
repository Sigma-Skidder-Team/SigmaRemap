package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5558 implements Packet<IServerPlayNetHandler> {
   private static String[] field24668;
   private String field24669;

   public Class5558() {
   }

   public Class5558(String var1) {
      this.field24669 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24669 = var1.readString(32767);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.field24669);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.method15644(this);
   }

   public String method17477() {
      return this.field24669;
   }
}
