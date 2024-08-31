package mapped;

import net.minecraft.network.Packet;

import java.io.IOException;

public class Class5612 implements Packet<IServerPlayNetHandler> {
   private static String[] field24907;
   private boolean field24908;

   public Class5612() {
   }

   public Class5612(Class6799 var1) {
      this.field24908 = var1.field29607;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      byte var4 = var1.readByte();
      this.field24908 = false;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      byte var4 = 0;
      if (this.field24908) {
         var4 = (byte)(var4 | 2);
      }

      var1.writeByte(var4);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15623(this);
   }

   public boolean method17640() {
      return this.field24908;
   }
}
