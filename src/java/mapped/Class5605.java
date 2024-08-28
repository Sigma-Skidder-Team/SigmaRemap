package mapped;

import java.io.IOException;

public class Class5605 extends Class5603 {
   private static String[] field24877;

   public Class5605() {
      this.field24884 = true;
   }

   public Class5605(double var1, double var3, double var5, boolean var7) {
      this.field24878 = var1;
      this.field24879 = var3;
      this.field24880 = var5;
      this.field24883 = var7;
      this.field24884 = true;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24878 = var1.readDouble();
      this.field24879 = var1.readDouble();
      this.field24880 = var1.readDouble();
      super.method17175(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.field24878);
      var1.writeDouble(this.field24879);
      var1.writeDouble(this.field24880);
      super.writePacketData(var1);
   }
}
