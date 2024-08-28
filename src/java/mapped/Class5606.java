package mapped;

import java.io.IOException;

public class Class5606 extends Class5603 {
   private static String[] field24877;

   public Class5606() {
      this.field24885 = true;
   }

   public Class5606(float var1, float var2, boolean var3) {
      this.field24881 = var1;
      this.field24882 = var2;
      this.field24883 = var3;
      this.field24885 = true;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24881 = var1.readFloat();
      this.field24882 = var1.readFloat();
      super.method17175(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeFloat(this.field24881);
      var1.writeFloat(this.field24882);
      super.writePacketData(var1);
   }
}
