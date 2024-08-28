package mapped;

import java.io.IOException;

public class Class5492 implements Packet<IServerPlayNetHandler> {
   private static String[] field24381;
   private BlockPos field24382;
   private Direction field24383;
   private Class2070 field24384;

   public Class5492() {
   }

   public Class5492(Class2070 var1, BlockPos var2, Direction var3) {
      this.field24384 = var1;
      this.field24382 = var2.method8353();
      this.field24383 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24384 = var1.<Class2070>method35712(Class2070.class);
      this.field24382 = var1.method35707();
      this.field24383 = Direction.method546(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24384);
      var1.method35708(this.field24382);
      var1.writeByte(this.field24383.method533());
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15624(this);
   }

   public BlockPos method17272() {
      return this.field24382;
   }

   public Direction method17273() {
      return this.field24383;
   }

   public Class2070 method17274() {
      return this.field24384;
   }
}
