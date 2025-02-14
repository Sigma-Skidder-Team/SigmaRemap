package net.minecraft.network.play.server;

import net.minecraft.util.math.MathHelper;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SEntityVelocityPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24799;
   public int entityID;
   public int motionX;
   public int motionY;
   public int motionZ;

   public SEntityVelocityPacket() {
   }

   public SEntityVelocityPacket(Entity var1) {
      this(var1.getEntityId(), var1.getMotion());
   }

   public SEntityVelocityPacket(int var1, Vector3d var2) {
      this.entityID = var1;
      double var5 = 3.9;
      double var7 = MathHelper.clamp(var2.x, -3.9, 3.9);
      double var9 = MathHelper.clamp(var2.y, -3.9, 3.9);
      double var11 = MathHelper.clamp(var2.z, -3.9, 3.9);
      this.motionX = (int)(var7 * 8000.0);
      this.motionY = (int)(var9 * 8000.0);
      this.motionZ = (int)(var11 * 8000.0);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.entityID = var1.readVarInt();
      this.motionX = var1.readShort();
      this.motionY = var1.readShort();
      this.motionZ = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.entityID);
      var1.writeShort(this.motionX);
      var1.writeShort(this.motionY);
      var1.writeShort(this.motionZ);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityVelocity(this);
   }

   public int getEntityID() {
      return this.entityID;
   }

   public int getMotionX() {
      return this.motionX;
   }

   public int getMotionY() {
      return this.motionY;
   }

   public int getMotionZ() {
      return this.motionZ;
   }
}
