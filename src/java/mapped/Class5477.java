package mapped;

import net.minecraft.network.play.server.SEntityPacket;

import java.io.IOException;

public class Class5477 extends SEntityPacket {
   private static String[] field24331;

   public Class5477() {
      this.field24330 = true;
   }

   public Class5477(int var1, short var2, short var3, short var4, boolean var5) {
      super(var1);
      this.field24323 = var2;
      this.field24324 = var3;
      this.field24325 = var4;
      this.field24328 = var5;
      this.field24330 = true;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      super.method17175(var1);
      this.field24323 = var1.readShort();
      this.field24324 = var1.readShort();
      this.field24325 = var1.readShort();
      this.field24328 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      super.writePacketData(var1);
      var1.writeShort(this.field24323);
      var1.writeShort(this.field24324);
      var1.writeShort(this.field24325);
      var1.writeBoolean(this.field24328);
   }
}
