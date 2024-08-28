package mapped;

import java.io.IOException;

public class Class5542 implements Packet<Class5116> {
   private static String[] field24600;
   private int field24601;
   private short field24602;
   private boolean field24603;

   public Class5542() {
   }

   public Class5542(int var1, short var2, boolean var3) {
      this.field24601 = var1;
      this.field24602 = var2;
      this.field24603 = var3;
   }

   public void method17180(Class5116 var1) {
      var1.method15709(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24601 = var1.readUnsignedByte();
      this.field24602 = var1.readShort();
      this.field24603 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24601);
      var1.writeShort(this.field24602);
      var1.writeBoolean(this.field24603);
   }

   public int method17421() {
      return this.field24601;
   }

   public short method17422() {
      return this.field24602;
   }

   public boolean method17423() {
      return this.field24603;
   }
}
