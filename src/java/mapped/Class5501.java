package mapped;

import java.io.IOException;

public class Class5501 implements Packet<Class5116> {
   private static String[] field24423;
   private int field24424;
   private int field24425;
   private Class8848 field24426 = Class8848.field39973;

   public Class5501() {
   }

   public Class5501(int var1, int var2, Class8848 var3) {
      this.field24424 = var1;
      this.field24425 = var2;
      this.field24426 = var3.method32126();
   }

   public void method17180(Class5116 var1) {
      var1.method15714(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24424 = var1.readByte();
      this.field24425 = var1.readShort();
      this.field24426 = var1.method35726();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24424);
      var1.writeShort(this.field24425);
      var1.method35724(this.field24426);
   }

   public int method17303() {
      return this.field24424;
   }

   public int method17304() {
      return this.field24425;
   }

   public Class8848 method17305() {
      return this.field24426;
   }
}
