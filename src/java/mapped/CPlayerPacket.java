package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPlayerPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24877;
   public double field24878;
   public double field24879;
   public double field24880;
   public float field24881;
   public float field24882;
   public boolean field24883;
   public boolean field24884;
   public boolean field24885;

   public CPlayerPacket() {
   }

   public CPlayerPacket(boolean var1) {
      this.field24883 = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processPlayer(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24883 = var1.readUnsignedByte() != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(!this.field24883 ? 0 : 1);
   }

   public double method17625(double var1) {
      return !this.field24884 ? var1 : this.field24878;
   }

   public double method17626(double var1) {
      return !this.field24884 ? var1 : this.field24879;
   }

   public double method17627(double var1) {
      return !this.field24884 ? var1 : this.field24880;
   }

   public float method17628(float var1) {
      return !this.field24885 ? var1 : this.field24881;
   }

   public float method17629(float var1) {
      return !this.field24885 ? var1 : this.field24882;
   }

   public boolean method17630() {
      return this.field24883;
   }
}
