package mapped;

import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class Class5491 implements Packet<Class5116> {
   private static String[] field24379;
   private BlockPos field24380;

   public Class5491() {
   }

   public Class5491(BlockPos var1) {
      this.field24380 = var1;
   }

   public void method17180(Class5116 var1) {
      var1.method15702(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24380 = var1.method35707();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24380);
   }

   public BlockPos method17271() {
      return this.field24380;
   }
}
