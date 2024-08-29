package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class5469 implements Packet<Class5116> {
   private static String[] field24272;
   private int field24273;
   private int field24274;

   public Class5469() {
   }

   public Class5469(Entity var1, int var2) {
      this.field24273 = var1.method3205();
      this.field24274 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24273 = var1.method35714();
      this.field24274 = var1.readUnsignedByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24273);
      var1.writeByte(this.field24274);
   }

   public void method17180(Class5116 var1) {
      var1.method15698(this);
   }

   public int method17192() {
      return this.field24273;
   }

   public int method17193() {
      return this.field24274;
   }
}
