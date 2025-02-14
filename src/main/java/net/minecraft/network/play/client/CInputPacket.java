package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CInputPacket implements IPacket<IServerPlayNetHandler> {
   private float strafeSpeed;
   private float forwardSpeed;
   private boolean jumping;
   private boolean sneaking;

   public CInputPacket() {
   }

   public CInputPacket(float var1, float var2, boolean var3, boolean var4) {
      this.strafeSpeed = var1;
      this.forwardSpeed = var2;
      this.jumping = var3;
      this.sneaking = var4;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.strafeSpeed = buf.readFloat();
      this.forwardSpeed = buf.readFloat();
      byte b0 = buf.readByte();
      this.jumping = (b0 & 1) > 0;
      this.sneaking = (b0 & 2) > 0;
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeFloat(this.strafeSpeed);
      buf.writeFloat(this.forwardSpeed);
      byte b0 = 0;

      if (this.jumping)
      {
         b0 = (byte)(b0 | 1);
      }

      if (this.sneaking)
      {
         b0 = (byte)(b0 | 2);
      }

      buf.writeByte(b0);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processInput(this);
   }

   public float getStrafeSpeed() {
      return this.strafeSpeed;
   }

   public float getForwardSpeed() {
      return this.forwardSpeed;
   }

   public boolean isJumping() {
      return this.jumping;
   }

   public boolean isSneaking() {
      return this.sneaking;
   }
}
