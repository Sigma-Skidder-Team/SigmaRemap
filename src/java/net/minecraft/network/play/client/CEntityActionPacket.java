package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CEntityActionPacket implements Packet<IServerPlayNetHandler> {
    private int entityID;
   private Action action;
   private int auxData;

   public CEntityActionPacket() {
   }

   public CEntityActionPacket(Entity entityIn, Action actionIn) {
      this(entityIn, actionIn, 0);
   }

   public CEntityActionPacket(Entity entityIn, Action actionIn, int auxDataIn) {
      this.entityID = entityIn.getEntityId();
      this.action = actionIn;
      this.auxData = auxDataIn;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.entityID = buf.readVarInt();
      this.action = buf.readEnumValue(Action.class);
      this.auxData = buf.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeVarInt(this.entityID);
      buf.writeEnumValue(this.action);
      buf.writeVarInt(this.auxData);
   }

   public void processPacket(IServerPlayNetHandler handler) {
      handler.processEntityAction(this);
   }

   public Action getAction() {
      return this.action;
   }

   public int getAuxData() {
      return this.auxData;
   }

   public enum Action {
      PRESS_SHIFT_KEY,
      RELEASE_SHIFT_KEY,
      STOP_SLEEPING,
      START_SPRINTING,
      STOP_SPRINTING,
      START_RIDING_JUMP,
      STOP_RIDING_JUMP,
      OPEN_INVENTORY,
      START_FALL_FLYING;
   }
}
