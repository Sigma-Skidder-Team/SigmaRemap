package mapped;

import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5587 implements IPacket<Class5114> {
   private static String[] field24791;
   private long field24792;

   public Class5587() {
   }

   public Class5587(long var1) {
      this.field24792 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24792 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24792);
   }

   public void processPacket(Class5114 var1) {
      var1.method15690(this);
   }

   public long method17560() {
      return this.field24792;
   }
}
