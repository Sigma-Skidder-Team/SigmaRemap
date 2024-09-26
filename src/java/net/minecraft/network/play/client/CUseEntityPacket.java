package net.minecraft.network.play.client;

import net.minecraft.util.Hand;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import javax.annotation.Nullable;

public class CUseEntityPacket implements IPacket<IServerPlayNetHandler> {
   private int entityId;
   private CUseEntityPacket.Action action;
   private Vector3d hitVec;
   private Hand hand;
   private boolean field_241791_e_;

   public CUseEntityPacket() {
   }

   public CUseEntityPacket(Entity entityIn, boolean p_i46877_2_)
   {
      this.entityId = entityIn.getEntityId();
      this.action = CUseEntityPacket.Action.ATTACK;
      this.field_241791_e_ = p_i46877_2_;
   }

   public CUseEntityPacket(Entity entityIn, Hand handIn, boolean p_i46878_3_)
   {
      this.entityId = entityIn.getEntityId();
      this.action = CUseEntityPacket.Action.INTERACT;
      this.hand = handIn;
      this.field_241791_e_ = p_i46878_3_;
   }

   public CUseEntityPacket(Entity entityIn, Hand handIn, Vector3d hitVecIn, boolean p_i47098_4_)
   {
      this.entityId = entityIn.getEntityId();
      this.action = CUseEntityPacket.Action.INTERACT_AT;
      this.hand = handIn;
      this.hitVec = hitVecIn;
      this.field_241791_e_ = p_i47098_4_;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.entityId = buf.readVarInt();
      this.action = buf.readEnumValue(CUseEntityPacket.Action.class);

      if (this.action == CUseEntityPacket.Action.INTERACT_AT)
      {
         this.hitVec = new Vector3d((double)buf.readFloat(), (double)buf.readFloat(), (double)buf.readFloat());
      }

      if (this.action == CUseEntityPacket.Action.INTERACT || this.action == CUseEntityPacket.Action.INTERACT_AT)
      {
         this.hand = buf.readEnumValue(Hand.class);
      }

      this.field_241791_e_ = buf.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeVarInt(this.entityId);
      buf.writeEnumValue(this.action);

      if (this.action == CUseEntityPacket.Action.INTERACT_AT)
      {
         buf.writeFloat((float)this.hitVec.x);
         buf.writeFloat((float)this.hitVec.y);
         buf.writeFloat((float)this.hitVec.z);
      }

      if (this.action == CUseEntityPacket.Action.INTERACT || this.action == CUseEntityPacket.Action.INTERACT_AT)
      {
         buf.writeEnumValue(this.hand);
      }

      buf.writeBoolean(this.field_241791_e_);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUseEntity(this);
   }

   @Nullable
   public Entity getEntityFromWorld(World var1) {
      return var1.getEntityByID(this.entityId);
   }

   public Action getAction() {
      return this.action;
   }

   @Nullable
   public Hand getHand() {
      return this.hand;
   }

   public Vector3d getHitVec() {
      return this.hitVec;
   }

   public boolean func_241792_e_() {
      return this.field_241791_e_;
   }

    public enum Action {
       INTERACT,
       ATTACK,
       INTERACT_AT;
    }
}
