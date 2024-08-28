package mapped;

import java.io.IOException;

public class Class5593 implements Packet<Class5116> {
   private static String[] field24814;
   private int field24815;
   private int field24816;

   public Class5593() {
   }

   public Class5593(Entity var1, Entity var2) {
      this.field24815 = var1.method3205();
      this.field24816 = var2 == null ? 0 : var2.method3205();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24815 = var1.readInt();
      this.field24816 = var1.readInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(this.field24815);
      var1.writeInt(this.field24816);
   }

   public void method17180(Class5116 var1) {
      var1.method15718(this);
   }

   public int method17577() {
      return this.field24815;
   }

   public int method17578() {
      return this.field24816;
   }
}
