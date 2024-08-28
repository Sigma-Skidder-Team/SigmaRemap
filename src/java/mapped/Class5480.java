package mapped;

import java.io.IOException;

public class Class5480 implements Packet<Class5116> {
   private static String[] field24334;
   private int field24335;
   private int field24336;
   private int field24337;

   public Class5480() {
   }

   public Class5480(int var1, int var2, int var3) {
      this.field24335 = var1;
      this.field24336 = var2;
      this.field24337 = var3;
   }

   public void method17180(Class5116 var1) {
      var1.method15713(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24335 = var1.readUnsignedByte();
      this.field24336 = var1.readShort();
      this.field24337 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24335);
      var1.writeShort(this.field24336);
      var1.writeShort(this.field24337);
   }

   public int method17239() {
      return this.field24335;
   }

   public int method17240() {
      return this.field24336;
   }

   public int method17241() {
      return this.field24337;
   }
}
