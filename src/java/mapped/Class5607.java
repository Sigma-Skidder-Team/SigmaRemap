package mapped;

import java.io.IOException;

public class Class5607 implements Packet<Class5116> {
   private static String[] field24886;
   private BlockPos field24887;
   private Class7380 field24888;

   public Class5607() {
   }

   public Class5607(BlockPos var1, Class7380 var2) {
      this.field24887 = var1;
      this.field24888 = var2;
   }

   public Class5607(Class1665 var1, BlockPos var2) {
      this(var2, var1.method6738(var2));
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24887 = var1.method35707();
      this.field24888 = Block.field18610.method9172(var1.method35714());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24887);
      var1.writeVarInt(Block.method11535(this.field24888));
   }

   public void method17180(Class5116 var1) {
      var1.method15705(this);
   }

   public Class7380 method17631() {
      return this.field24888;
   }

   public BlockPos method17632() {
      return this.field24887;
   }
}
