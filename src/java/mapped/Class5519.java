package mapped;

import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class Class5519 implements Packet<IServerPlayNetHandler> {
   private static String[] field24484;
   private BlockPos field24485;
   private String[] field24486;

   public Class5519() {
   }

   public Class5519(BlockPos var1, String var2, String var3, String var4, String var5) {
      this.field24485 = var1;
      this.field24486 = new String[]{var2, var3, var4, var5};
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24485 = var1.method35707();
      this.field24486 = new String[4];

      for (int var4 = 0; var4 < 4; var4++) {
         this.field24486[var4] = var1.method35728(384);
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24485);

      for (int var4 = 0; var4 < 4; var4++) {
         var1.method35729(this.field24486[var4]);
      }
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15629(this);
   }

   public BlockPos method17351() {
      return this.field24485;
   }

   public String[] method17352() {
      return this.field24486;
   }
}
