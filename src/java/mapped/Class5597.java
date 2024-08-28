package mapped;

import java.io.IOException;

public class Class5597 implements Packet<Class5110> {
   private static String[] field24840;
   private int field24841;
   private int field24842;

   public Class5597() {
   }

   public Class5597(int var1, int var2) {
      this.field24841 = var1;
      this.field24842 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24841 = var1.method35714();
      this.field24842 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24841);
      var1.writeVarInt(this.field24842);
   }

   public void method17180(Class5110 var1) {
      var1.method15645(this);
   }

   public int method17599() {
      return this.field24841;
   }

   public int method17600() {
      return this.field24842;
   }
}
