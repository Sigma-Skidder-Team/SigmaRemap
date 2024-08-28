package mapped;

import java.io.IOException;

public class Class5478 extends Class5476 {
   private static String[] field24332;

   public Class5478() {
      this.field24329 = true;
      this.field24330 = true;
   }

   public Class5478(int var1, short var2, short var3, short var4, byte var5, byte var6, boolean var7) {
      super(var1);
      this.field24323 = var2;
      this.field24324 = var3;
      this.field24325 = var4;
      this.field24326 = var5;
      this.field24327 = var6;
      this.field24328 = var7;
      this.field24329 = true;
      this.field24330 = true;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      super.method17175(var1);
      this.field24323 = var1.readShort();
      this.field24324 = var1.readShort();
      this.field24325 = var1.readShort();
      this.field24326 = var1.readByte();
      this.field24327 = var1.readByte();
      this.field24328 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      super.writePacketData(var1);
      var1.writeShort(this.field24323);
      var1.writeShort(this.field24324);
      var1.writeShort(this.field24325);
      var1.writeByte(this.field24326);
      var1.writeByte(this.field24327);
      var1.writeBoolean(this.field24328);
   }
}
