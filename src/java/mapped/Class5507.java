package mapped;

import java.io.IOException;

public class Class5507 implements Packet<Class5116> {
   private static String[] field24446;
   private float field24447;
   private int field24448;
   private int field24449;

   public Class5507() {
   }

   public Class5507(float var1, int var2, int var3) {
      this.field24447 = var1;
      this.field24448 = var2;
      this.field24449 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24447 = var1.readFloat();
      this.field24449 = var1.method35714();
      this.field24448 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeFloat(this.field24447);
      var1.writeVarInt(this.field24449);
      var1.writeVarInt(this.field24448);
   }

   public void method17180(Class5116 var1) {
      var1.method15741(this);
   }

   public float method17321() {
      return this.field24447;
   }

   public int method17322() {
      return this.field24448;
   }

   public int method17323() {
      return this.field24449;
   }
}
