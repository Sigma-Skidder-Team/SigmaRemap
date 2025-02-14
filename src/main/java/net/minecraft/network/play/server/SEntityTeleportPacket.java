package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SEntityTeleportPacket implements IPacket<IClientPlayNetHandler> {
    private int entityId;
   private double posX;
   private double posY;
   private double posZ;
   private byte yaw;
   private byte pitch;
   private boolean onGround;

   public SEntityTeleportPacket() {
   }

   public SEntityTeleportPacket(Entity var1) {
      this.entityId = var1.getEntityId();
      this.posX = var1.getPosX();
      this.posY = var1.getPosY();
      this.posZ = var1.getPosZ();
      this.yaw = (byte)((int)(var1.rotationYaw * 256.0F / 360.0F));
      this.pitch = (byte)((int)(var1.rotationPitch * 256.0F / 360.0F));
      this.onGround = var1.isOnGround();
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.entityId = var1.readVarInt();
      this.posX = var1.readDouble();
      this.posY = var1.readDouble();
      this.posZ = var1.readDouble();
      this.yaw = var1.readByte();
      this.pitch = var1.readByte();
      this.onGround = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.entityId);
      var1.writeDouble(this.posX);
      var1.writeDouble(this.posY);
      var1.writeDouble(this.posZ);
      var1.writeByte(this.yaw);
      var1.writeByte(this.pitch);
      var1.writeBoolean(this.onGround);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityTeleport(this);
   }

   public int getEntityId() {
      return this.entityId;
   }

   public double getX() {
      return this.posX;
   }

   public double getY() {
      return this.posY;
   }

   public double getZ() {
      return this.posZ;
   }

   public byte getYaw() {
      return this.yaw;
   }

   public byte getPitch() {
      return this.pitch;
   }

   public boolean isOnGround() {
      return this.onGround;
   }
}
