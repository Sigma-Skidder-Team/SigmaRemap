package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CHandshakePacket implements Packet<Class5105> {
   private int field24725;
   private String field24726;
   private int field24727;
   private ProtocolType field24728;

   public CHandshakePacket() {
   }

   public CHandshakePacket(String var1, int var2, ProtocolType var3) {
      this.field24725 = SharedConstants.getVersion().getProtocolVersion();
      this.field24726 = var1;
      this.field24727 = var2;
      this.field24728 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24725 = var1.method35714();
      this.field24726 = var1.method35728(255);
      this.field24727 = var1.readUnsignedShort();
      this.field24728 = ProtocolType.method8105(var1.method35714());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24725);
      var1.method35729(this.field24726);
      var1.writeShort(this.field24727);
      var1.writeVarInt(this.field24728.method8104());
   }

   public void method17180(Class5105 var1) {
      var1.method15595(this);
   }

   public ProtocolType method17508() {
      return this.field24728;
   }

   public int method17509() {
      return this.field24725;
   }
}
