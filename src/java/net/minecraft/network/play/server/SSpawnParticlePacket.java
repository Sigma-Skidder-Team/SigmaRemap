package net.minecraft.network.play.server;

import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.registry.Registry;

import java.io.IOException;

public class SSpawnParticlePacket implements Packet<IClientPlayNetHandler> {
   private double xCoord;
   private double yCoord;
   private double zCoord;
   private float xOffset;
   private float yOffset;
   private float zOffset;
   private float particleSpeed;
   private int particleCount;
   private boolean longDistance;
   private IParticleData particle;

   public SSpawnParticlePacket() {
   }

   public <T extends IParticleData> SSpawnParticlePacket(
      T var1, boolean var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13
   ) {
      this.particle = var1;
      this.longDistance = var2;
      this.xCoord = var3;
      this.yCoord = var5;
      this.zCoord = var7;
      this.xOffset = var9;
      this.yOffset = var10;
      this.zOffset = var11;
      this.particleSpeed = var12;
      this.particleCount = var13;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      ParticleType<?> particletype = Registry.PARTICLE_TYPE.getByValue(buf.readInt());
      if (particletype == null) {
         particletype = ParticleTypes.BARRIER;
      }

      this.longDistance = buf.readBoolean();
      this.xCoord = buf.readDouble();
      this.yCoord = buf.readDouble();
      this.zCoord = buf.readDouble();
      this.xOffset = buf.readFloat();
      this.yOffset = buf.readFloat();
      this.zOffset = buf.readFloat();
      this.particleSpeed = buf.readFloat();
      this.particleCount = buf.readInt();
      this.particle = this.readParticle(buf, particletype);
   }

   private <T extends IParticleData> T readParticle(PacketBuffer var1, ParticleType<T> var2) {
      return (T)var2.getDeserializer().read(var2, var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(Registry.PARTICLE_TYPE.getId(this.particle.getType()));
      var1.writeBoolean(this.longDistance);
      var1.writeDouble(this.xCoord);
      var1.writeDouble(this.yCoord);
      var1.writeDouble(this.zCoord);
      var1.writeFloat(this.xOffset);
      var1.writeFloat(this.yOffset);
      var1.writeFloat(this.zOffset);
      var1.writeFloat(this.particleSpeed);
      var1.writeInt(this.particleCount);
      this.particle.write(var1);
   }

   public boolean getLongDistanceGirlfriend() {
      return this.longDistance;
   }

   public double getX() {
      return this.xCoord;
   }

   public double getY() {
      return this.yCoord;
   }

   public double getZ() {
      return this.zCoord;
   }

   public float getXOffset() {
      return this.xOffset;
   }

   public float getYOffset() {
      return this.yOffset;
   }

   public float getZOffset() {
      return this.zOffset;
   }

   public float getParticleSpeed() {
      return this.particleSpeed;
   }

   public int getParticleCount() {
      return this.particleCount;
   }

   public IParticleData getParticle() {
      return this.particle;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleParticles(this);
   }
}
