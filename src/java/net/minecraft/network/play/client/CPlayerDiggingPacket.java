package net.minecraft.network.play.client;

import net.minecraft.util.Direction;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CPlayerDiggingPacket implements Packet<IServerPlayNetHandler> {
    private BlockPos position;
   private Direction facing;
   private Action action;

   public CPlayerDiggingPacket() {
   }

   public CPlayerDiggingPacket(Action var1, BlockPos var2, Direction var3) {
      this.action = var1;
      this.position = var2.toImmutable();
      this.facing = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.action = var1.readEnumValue(Action.class);
      this.position = var1.readBlockPos();
      this.facing = Direction.byIndex(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.action);
      var1.writeBlockPos(this.position);
      var1.writeByte(this.facing.getIndex());
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processPlayerDigging(this);
   }

   public BlockPos getPosition() {
      return this.position;
   }

   public Direction getFacing() {
      return this.facing;
   }

   public Action getAction() {
      return this.action;
   }

   public enum Action {
      START_DESTROY_BLOCK,
      ABORT_DESTROY_BLOCK,
      STOP_DESTROY_BLOCK,
      DROP_ALL_ITEMS,
      DROP_ITEM,
      RELEASE_USE_ITEM,
      SWAP_ITEM_WITH_OFFHAND;
   }
}
