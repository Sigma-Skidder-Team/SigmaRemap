package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPlayerPacket;

import java.io.IOException;

public class Class5604 extends CPlayerPacket {
   private static String[] field24877;

   public Class5604() {
      this.field24884 = true;
      this.field24885 = true;
   }

   public Class5604(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.field24878 = var1;
      this.field24879 = var3;
      this.field24880 = var5;
      this.field24881 = var7;
      this.field24882 = var8;
      this.field24883 = var9;
      this.field24885 = true;
      this.field24884 = true;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24878 = var1.readDouble();
      this.field24879 = var1.readDouble();
      this.field24880 = var1.readDouble();
      this.field24881 = var1.readFloat();
      this.field24882 = var1.readFloat();
      super.readPacketData(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.field24878);
      var1.writeDouble(this.field24879);
      var1.writeDouble(this.field24880);
      var1.writeFloat(this.field24881);
      var1.writeFloat(this.field24882);
      super.writePacketData(var1);
   }
}
