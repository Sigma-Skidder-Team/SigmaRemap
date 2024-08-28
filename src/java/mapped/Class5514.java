package mapped;

import java.io.IOException;

public class Class5514 implements Packet<Class5110> {
   private static String[] field24464;
   private int field24465;
   private Class8848 field24466 = Class8848.field39973;

   public Class5514() {
   }

   public Class5514(int var1, Class8848 var2) {
      this.field24465 = var1;
      this.field24466 = var2.method32126();
   }

   public void method17180(Class5110 var1) {
      var1.method15628(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24465 = var1.readShort();
      this.field24466 = var1.method35726();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeShort(this.field24465);
      var1.method35724(this.field24466);
   }

   public int method17336() {
      return this.field24465;
   }

   public Class8848 method17337() {
      return this.field24466;
   }
}
