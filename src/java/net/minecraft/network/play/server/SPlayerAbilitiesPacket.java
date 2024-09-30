package net.minecraft.network.play.server;

import net.minecraft.network.play.client.PlayerAbilities;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SPlayerAbilitiesPacket implements IPacket<IClientPlayNetHandler> {
   private boolean invulnerable;
   private boolean flying;
   private boolean allowFlying;
   private boolean creativeMode;
   private float flySpeed;
   private float walkSpeed;

   public SPlayerAbilitiesPacket() {
   }

   public SPlayerAbilitiesPacket(PlayerAbilities var1) {
      this.invulnerable = var1.disableDamage;
      this.flying = var1.isFlying;
      this.allowFlying = var1.allowFlying;
      this.creativeMode = var1.isCreativeMode;
      this.flySpeed = var1.getFlySpeed();
      this.walkSpeed = var1.getWalkSpeed();
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
        byte b0 = buf.readByte();
        this.invulnerable = (b0 & 1) != 0;
        this.flying = (b0 & 2) != 0;
        this.allowFlying = (b0 & 4) != 0;
        this.creativeMode = (b0 & 8) != 0;
        this.flySpeed = buf.readFloat();
        this.walkSpeed = buf.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      byte b0 = 0;
      if (this.invulnerable) {
         b0 = (byte)(b0 | 1);
      }

      if (this.flying) {
         b0 = (byte)(b0 | 2);
      }

      if (this.allowFlying) {
         b0 = (byte)(b0 | 4);
      }

      if (this.creativeMode) {
         b0 = (byte)(b0 | 8);
      }

      buf.writeByte(b0);
      buf.writeFloat(this.flySpeed);
      buf.writeFloat(this.walkSpeed);
   }

   public void processPacket(IClientPlayNetHandler vahandlerr1) {
      vahandlerr1.handlePlayerAbilities(this);
   }

   public boolean isInvulnerable() {
      return this.invulnerable;
   }

   public boolean isFlying() {
      return this.flying;
   }

   public boolean isAllowFlying() {
      return this.allowFlying;
   }

   public boolean isCreativeMode() {
      return this.creativeMode;
   }

   public float getFlySpeed() {
      return this.flySpeed;
   }

   public float getWalkSpeed() {
      return this.walkSpeed;
   }
}
