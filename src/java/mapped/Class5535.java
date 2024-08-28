package mapped;

import java.io.IOException;

public class Class5535 implements Packet<Class5116> {
   private static String[] field24574;
   private Class2197 field24575;
   private boolean field24576;

   public Class5535() {
   }

   public Class5535(Class2197 var1, boolean var2) {
      this.field24575 = var1;
      this.field24576 = var2;
   }

   public void method17180(Class5116 var1) {
      var1.method15756(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24575 = Class2197.method8907(var1.readUnsignedByte());
      this.field24576 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24575.method8905());
      var1.writeBoolean(this.field24576);
   }

   public boolean method17399() {
      return this.field24576;
   }

   public Class2197 method17400() {
      return this.field24575;
   }
}
