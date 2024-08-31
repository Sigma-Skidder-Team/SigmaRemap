package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5600 implements Packet<IServerPlayNetHandler> {
   private static String[] field24852;
   private long field24853;

   public Class5600() {
   }

   public Class5600(long var1) {
      this.field24853 = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.method15621(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24853 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24853);
   }

   public long method17608() {
      return this.field24853;
   }
}
