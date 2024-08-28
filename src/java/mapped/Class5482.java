package mapped;

import java.io.IOException;

public class Class5482 implements Packet<IServerPlayNetHandler> {
   private static String[] field24343;
   private int field24344;

   public Class5482() {
   }

   public Class5482(int var1) {
      this.field24344 = var1;
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15618(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24344 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24344);
   }
}
