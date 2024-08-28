package mapped;

import java.io.IOException;

public class Class5479 extends Class5476 {
   private static String[] field24333;

   public Class5479() {
      this.field24329 = true;
   }

   public Class5479(int var1, byte var2, byte var3, boolean var4) {
      super(var1);
      this.field24326 = var2;
      this.field24327 = var3;
      this.field24329 = true;
      this.field24328 = var4;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      super.method17175(var1);
      this.field24326 = var1.readByte();
      this.field24327 = var1.readByte();
      this.field24328 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      super.writePacketData(var1);
      var1.writeByte(this.field24326);
      var1.writeByte(this.field24327);
      var1.writeBoolean(this.field24328);
   }
}
