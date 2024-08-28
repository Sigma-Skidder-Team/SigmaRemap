package mapped;

import java.io.IOException;

public class Class5486 implements Packet<Class5110> {
   private static String[] field24356;
   private int field24357;
   private BlockPos field24358;

   public Class5486() {
   }

   public Class5486(int var1, BlockPos var2) {
      this.field24357 = var1;
      this.field24358 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24357 = var1.method35714();
      this.field24358 = var1.method35707();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24357);
      var1.method35708(this.field24358);
   }

   public void method17180(Class5110 var1) {
      var1.method15650(this);
   }

   public int method17254() {
      return this.field24357;
   }

   public BlockPos method17255() {
      return this.field24358;
   }
}
