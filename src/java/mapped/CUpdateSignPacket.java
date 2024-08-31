package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CUpdateSignPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24484;
   private BlockPos field24485;
   private String[] field24486;

   public CUpdateSignPacket() {
   }

   public CUpdateSignPacket(BlockPos var1, String var2, String var3, String var4, String var5) {
      this.field24485 = var1;
      this.field24486 = new String[]{var2, var3, var4, var5};
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24485 = var1.method35707();
      this.field24486 = new String[4];

      for (int var4 = 0; var4 < 4; var4++) {
         this.field24486[var4] = var1.readString(384);
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24485);

      for (int var4 = 0; var4 < 4; var4++) {
         var1.writeString(this.field24486[var4]);
      }
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUpdateSign(this);
   }

   public BlockPos method17351() {
      return this.field24485;
   }

   public String[] method17352() {
      return this.field24486;
   }
}
