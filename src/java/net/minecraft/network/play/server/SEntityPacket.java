package net.minecraft.network.play.server;

import mapped.MathHelper;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SEntityPacket implements Packet<IClientPlayNetHandler> {
   public int entityId;
   public short posX;
   public short posY;
   public short posZ;
   public byte yaw;
   public byte pitch;
   public boolean onGround;
   public boolean rotating;
   public boolean isMovePacket;

   public static long method17229(double var0) {
      return MathHelper.method37770(var0 * 4096.0);
   }

   public static double method17230(long var0) {
      return (double)var0 / 4096.0;
   }

   public Vector3d method17231(Vector3d var1) {
      double var4 = this.posX != 0 ? method17230(method17229(var1.x) + (long)this.posX) : var1.x;
      double var6 = this.posY != 0 ? method17230(method17229(var1.y) + (long)this.posY) : var1.y;
      double var8 = this.posZ != 0 ? method17230(method17229(var1.z) + (long)this.posZ) : var1.z;
      return new Vector3d(var4, var6, var8);
   }

   public static Vector3d method17232(long var0, long var2, long var4) {
      return new Vector3d((double)var0, (double)var2, (double)var4).method11344(2.4414062E-4F);
   }

   public SEntityPacket() {
   }

   public SEntityPacket(int var1) {
      this.entityId = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.entityId = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.entityId);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityMovement(this);
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   @Nullable
   public Entity getEntity(World var1) {
      return var1.getEntityByID(this.entityId);
   }

   public byte getYaw() {
      return this.yaw;
   }

   public byte getPitch() {
      return this.pitch;
   }

   public boolean isRotating() {
      return this.rotating;
   }

   public boolean func_229745_h_() {
      return this.isMovePacket;
   }

   public boolean getOnGround() {
      return this.onGround;
   }

   public static class LookPacket extends SEntityPacket {

       public LookPacket() {
         this.rotating = true;
      }

      public LookPacket(int var1, byte var2, byte var3, boolean var4) {
         super(var1);
         this.yaw = var2;
         this.pitch = var3;
         this.rotating = true;
         this.onGround = var4;
      }

      @Override
      public void readPacketData(PacketBuffer var1) throws IOException {
         super.readPacketData(var1);
         this.yaw = var1.readByte();
         this.pitch = var1.readByte();
         this.onGround = var1.readBoolean();
      }

      @Override
      public void writePacketData(PacketBuffer var1) throws IOException {
         super.writePacketData(var1);
         var1.writeByte(this.yaw);
         var1.writeByte(this.pitch);
         var1.writeBoolean(this.onGround);
      }
   }

   public static class MovePacket extends SEntityPacket {

       public MovePacket() {
         this.rotating = true;
         this.isMovePacket = true;
      }

      public MovePacket(int var1, short var2, short var3, short var4, byte var5, byte var6, boolean var7) {
         super(var1);
         this.posX = var2;
         this.posY = var3;
         this.posZ = var4;
         this.yaw = var5;
         this.pitch = var6;
         this.onGround = var7;
         this.rotating = true;
         this.isMovePacket = true;
      }

      @Override
      public void readPacketData(PacketBuffer var1) throws IOException {
         super.readPacketData(var1);
         this.posX = var1.readShort();
         this.posY = var1.readShort();
         this.posZ = var1.readShort();
         this.yaw = var1.readByte();
         this.pitch = var1.readByte();
         this.onGround = var1.readBoolean();
      }

      @Override
      public void writePacketData(PacketBuffer var1) throws IOException {
         super.writePacketData(var1);
         var1.writeShort(this.posX);
         var1.writeShort(this.posY);
         var1.writeShort(this.posZ);
         var1.writeByte(this.yaw);
         var1.writeByte(this.pitch);
         var1.writeBoolean(this.onGround);
      }
   }

   public static class RelativeMovePacket extends SEntityPacket {

       public RelativeMovePacket() {
         this.isMovePacket = true;
      }

      public RelativeMovePacket(int var1, short var2, short var3, short var4, boolean var5) {
         super(var1);
         this.posX = var2;
         this.posY = var3;
         this.posZ = var4;
         this.onGround = var5;
         this.isMovePacket = true;
      }

      @Override
      public void readPacketData(PacketBuffer var1) throws IOException {
         super.readPacketData(var1);
         this.posX = var1.readShort();
         this.posY = var1.readShort();
         this.posZ = var1.readShort();
         this.onGround = var1.readBoolean();
      }

      @Override
      public void writePacketData(PacketBuffer var1) throws IOException {
         super.writePacketData(var1);
         var1.writeShort(this.posX);
         var1.writeShort(this.posY);
         var1.writeShort(this.posZ);
         var1.writeBoolean(this.onGround);
      }
   }
}
