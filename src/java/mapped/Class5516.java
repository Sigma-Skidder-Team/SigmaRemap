package mapped;

import java.io.IOException;

public class Class5516 implements Packet<Class5116> {
   private static String[] field24476;
   private int field24477;
   private byte field24478;

   public Class5516() {
   }

   public Class5516(Entity var1, byte var2) {
      this.field24477 = var1.method3205();
      this.field24478 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24477 = var1.method35714();
      this.field24478 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24477);
      var1.writeByte(this.field24478);
   }

   public void method17180(Class5116 var1) {
      var1.method15735(this);
   }

   public Entity method17346(Class1655 var1) {
      return var1.method6774(this.field24477);
   }

   public byte method17347() {
      return this.field24478;
   }
}
