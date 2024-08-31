package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class Class5527 implements Packet<IServerPlayNetHandler> {
   public static final ResourceLocation field24523 = new ResourceLocation("brand");
   private ResourceLocation field24524;
   private PacketBuffer field24525;

   public Class5527() {
   }

   public Class5527(ResourceLocation var1, PacketBuffer var2) {
      this.field24524 = var1;
      this.field24525 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24524 = var1.readResourceLocation();
      int var4 = var1.readableBytes();
      if (var4 >= 0 && var4 <= 32767) {
         this.field24525 = new PacketBuffer(var1.readBytes(var4));
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeResourceLocation(this.field24524);
      var1.writeBytes(this.field24525);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.method15619(this);
      if (this.field24525 != null) {
         this.field24525.release();
      }
   }
}
