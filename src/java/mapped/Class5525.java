package mapped;

import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class Class5525 implements Packet<Class5116> {
   private static String[] field24511;
   private BlockPos field24512;
   private float field24513;

   public Class5525() {
   }

   public Class5525(BlockPos var1, float var2) {
      this.field24512 = var1;
      this.field24513 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24512 = var1.method35707();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24512);
   }

   public void method17180(Class5116 var1) {
      var1.method15745(this);
   }

   public BlockPos method17372() {
      return this.field24512;
   }

   public float method17373() {
      return this.field24513;
   }
}
