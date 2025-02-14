package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPlayerPacket implements IPacket<IServerPlayNetHandler> {
   public double x;
   public double y;
   public double z;
   public float yaw;
   public float pitch;
   public boolean onGround;
   public boolean moving;
   public boolean rotating;

   public CPlayerPacket() {
   }

   public CPlayerPacket(boolean onGround) {
      this.onGround = onGround;
   }

   public void processPacket(IServerPlayNetHandler handler) {
      handler.processPlayer(this);
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.onGround = buf.readUnsignedByte() != 0;
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeByte(!this.onGround ? 0 : 1);
   }

   public double getX(double var1) {
      return !this.moving ? var1 : this.x;
   }

   public double getY(double var1) {
      return !this.moving ? var1 : this.y;
   }

   public double getZ(double var1) {
      return !this.moving ? var1 : this.z;
   }

   public float getYaw(float var1) {
      return !this.rotating ? var1 : this.yaw;
   }

   public float getPitch(float var1) {
      return !this.rotating ? var1 : this.pitch;
   }

   public boolean isOnGround() {
      return this.onGround;
   }

   public static class PositionRotationPacket extends CPlayerPacket {

       public PositionRotationPacket() {
         this.moving = true;
         this.rotating = true;
      }

      public PositionRotationPacket(double var1, double var3, double var5, float var7, float var8, boolean var9) {
         this.x = var1;
         this.y = var3;
         this.z = var5;
         this.yaw = var7;
         this.pitch = var8;
         this.onGround = var9;
         this.rotating = true;
         this.moving = true;
      }

      @Override
      public void readPacketData(PacketBuffer var1) throws IOException {
         this.x = var1.readDouble();
         this.y = var1.readDouble();
         this.z = var1.readDouble();
         this.yaw = var1.readFloat();
         this.pitch = var1.readFloat();
         super.readPacketData(var1);
      }

      @Override
      public void writePacketData(PacketBuffer var1) throws IOException {
         var1.writeDouble(this.x);
         var1.writeDouble(this.y);
         var1.writeDouble(this.z);
         var1.writeFloat(this.yaw);
         var1.writeFloat(this.pitch);
         super.writePacketData(var1);
      }
   }

   public static class RotationPacket extends CPlayerPacket {

       public RotationPacket() {
         this.rotating = true;
      }

      public RotationPacket(float var1, float var2, boolean var3) {
         this.yaw = var1;
         this.pitch = var2;
         this.onGround = var3;
         this.rotating = true;
      }

      @Override
      public void readPacketData(PacketBuffer var1) throws IOException {
         this.yaw = var1.readFloat();
         this.pitch = var1.readFloat();
         super.readPacketData(var1);
      }

      @Override
      public void writePacketData(PacketBuffer var1) throws IOException {
         var1.writeFloat(this.yaw);
         var1.writeFloat(this.pitch);
         super.writePacketData(var1);
      }
   }

   public static class PositionPacket extends CPlayerPacket {

       public PositionPacket() {
         this.moving = true;
      }

      public PositionPacket(double var1, double var3, double var5, boolean var7) {
         this.x = var1;
         this.y = var3;
         this.z = var5;
         this.onGround = var7;
         this.moving = true;
      }

      @Override
      public void readPacketData(PacketBuffer var1) throws IOException {
         this.x = var1.readDouble();
         this.y = var1.readDouble();
         this.z = var1.readDouble();
         super.readPacketData(var1);
      }

      @Override
      public void writePacketData(PacketBuffer var1) throws IOException {
         var1.writeDouble(this.x);
         var1.writeDouble(this.y);
         var1.writeDouble(this.z);
         super.writePacketData(var1);
      }
   }
}
