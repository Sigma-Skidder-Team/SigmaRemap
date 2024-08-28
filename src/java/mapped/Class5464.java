package mapped;

import java.io.IOException;

public class Class5464 implements Packet<Class5116> {
   private static String[] field24258;
   private int field24259;
   private byte field24260;

   public Class5464() {
   }

   public Class5464(Entity var1, byte var2) {
      this.field24259 = var1.method3205();
      this.field24260 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24259 = var1.readInt();
      this.field24260 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(this.field24259);
      var1.writeByte(this.field24260);
   }

   public void method17180(Class5116 var1) {
      var1.method15717(this);
   }

   public Entity method17178(Class1655 var1) {
      return var1.method6774(this.field24259);
   }

   public byte method17179() {
      return this.field24260;
   }
}
