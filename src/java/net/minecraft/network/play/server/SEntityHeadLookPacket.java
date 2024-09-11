package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SEntityHeadLookPacket implements Packet<IClientPlayNetHandler> {
    private int entityId;
   private byte yaw;

   public SEntityHeadLookPacket() {
   }

   public SEntityHeadLookPacket(Entity var1, byte var2) {
      this.entityId = var1.getEntityId();
      this.yaw = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.entityId = var1.readVarInt();
      this.yaw = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.entityId);
      var1.writeByte(this.yaw);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityHeadLook(this);
   }

   public Entity getEntity(World var1) {
      return var1.getEntityByID(this.entityId);
   }

   public byte getYaw() {
      return this.yaw;
   }
}
