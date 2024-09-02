package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CMoveVehiclePacket implements Packet<IServerPlayNetHandler> {
    private double x;
   private double y;
   private double z;
   private float yaw;
   private float pitch;

   public CMoveVehiclePacket() {
   }

   public CMoveVehiclePacket(Entity var1) {
      this.x = var1.getPosX();
      this.y = var1.getPosY();
      this.z = var1.getPosZ();
      this.yaw = var1.rotationYaw;
      this.pitch = var1.rotationPitch;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.x = var1.readDouble();
      this.y = var1.readDouble();
      this.z = var1.readDouble();
      this.yaw = var1.readFloat();
      this.pitch = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.x);
      var1.writeDouble(this.y);
      var1.writeDouble(this.z);
      var1.writeFloat(this.yaw);
      var1.writeFloat(this.pitch);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processVehicleMove(this);
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getZ() {
      return this.z;
   }

   public float getYaw() {
      return this.yaw;
   }

   public float getPitch() {
      return this.pitch;
   }
}
