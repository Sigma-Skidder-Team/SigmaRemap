package net.minecraft.network.play.server;

import mapped.Flags;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;
import java.util.Set;

public class SPlayerPositionLookPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24296;
   public double x;
   public double y;
   public double z;
   public float yaw;
   public float pitch;
   private Set<Flags> field24302;
   private int teleportID;

   public SPlayerPositionLookPacket() {
   }

   public SPlayerPositionLookPacket(double var1, double var3, double var5, float var7, float var8, Set<Flags> var9, int var10) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.yaw = var7;
      this.pitch = var8;
      this.field24302 = var9;
      this.teleportID = var10;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.x = var1.readDouble();
      this.y = var1.readDouble();
      this.z = var1.readDouble();
      this.yaw = var1.readFloat();
      this.pitch = var1.readFloat();
      this.field24302 = Flags.method8674(var1.readUnsignedByte());
      this.teleportID = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.x);
      var1.writeDouble(this.y);
      var1.writeDouble(this.z);
      var1.writeFloat(this.yaw);
      var1.writeFloat(this.pitch);
      var1.writeByte(Flags.method8675(this.field24302));
      var1.writeVarInt(this.teleportID);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handlePlayerPosLook(this);
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

   public int getTeleportI() {
      return this.teleportID;
   }

   public Set<Flags> getFlags() {
      return this.field24302;
   }
}
