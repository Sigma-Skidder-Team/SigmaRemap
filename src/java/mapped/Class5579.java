package mapped;

import java.io.IOException;

public class Class5579 implements Packet<Class5116> {
   private static String[] field24744;
   private int field24745;
   private int field24746;

   public Class5579() {
   }

   public Class5579(int var1, int var2) {
      this.field24745 = var1;
      this.field24746 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24745 = var1.method35714();
      this.field24746 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24745);
      var1.writeVarInt(this.field24746);
   }

   public void method17180(Class5116 var1) {
      var1.method15779(this);
   }

   public int method17522() {
      return this.field24745;
   }

   public int method17523() {
      return this.field24746;
   }
}
