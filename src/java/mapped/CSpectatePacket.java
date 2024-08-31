package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

public class CSpectatePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24399;
   private UUID field24400;

   public CSpectatePacket() {
   }

   public CSpectatePacket(UUID var1) {
      this.field24400 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24400 = var1.method35717();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35716(this.field24400);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleSpectate(this);
   }

   @Nullable
   public Entity method17283(ServerWorld var1) {
      return var1.method6942(this.field24400);
   }
}
