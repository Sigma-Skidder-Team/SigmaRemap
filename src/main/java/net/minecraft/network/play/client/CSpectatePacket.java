package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

public class CSpectatePacket implements IPacket<IServerPlayNetHandler> {
    private UUID id;

   public CSpectatePacket() {
   }

   public CSpectatePacket(UUID var1) {
      this.id = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.id = var1.readUniqueId();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeUniqueId(this.id);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleSpectate(this);
   }

   @Nullable
   public Entity getEntity(ServerWorld var1) {
      return var1.getEntityByUuid(this.id);
   }
}
