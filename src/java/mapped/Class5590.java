package mapped;

import java.io.IOException;

public class Class5590 implements Packet<Class5116> {
   private static String[] field24799;
   public int field24800;
   public int field24801;
   public int field24802;
   public int field24803;

   public Class5590() {
   }

   public Class5590(Entity var1) {
      this(var1.method3205(), var1.method3433());
   }

   public Class5590(int var1, Vector3d var2) {
      this.field24800 = var1;
      double var5 = 3.9;
      double var7 = MathHelper.method37778(var2.field18048, -3.9, 3.9);
      double var9 = MathHelper.method37778(var2.field18049, -3.9, 3.9);
      double var11 = MathHelper.method37778(var2.field18050, -3.9, 3.9);
      this.field24801 = (int)(var7 * 8000.0);
      this.field24802 = (int)(var9 * 8000.0);
      this.field24803 = (int)(var11 * 8000.0);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24800 = var1.method35714();
      this.field24801 = var1.readShort();
      this.field24802 = var1.readShort();
      this.field24803 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24800);
      var1.writeShort(this.field24801);
      var1.writeShort(this.field24802);
      var1.writeShort(this.field24803);
   }

   public void method17180(Class5116 var1) {
      var1.method15739(this);
   }

   public int method17565() {
      return this.field24800;
   }

   public int method17566() {
      return this.field24801;
   }

   public int method17567() {
      return this.field24802;
   }

   public int method17568() {
      return this.field24803;
   }
}
