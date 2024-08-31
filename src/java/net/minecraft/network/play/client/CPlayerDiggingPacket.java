package net.minecraft.network.play.client;

import mapped.Direction;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CPlayerDiggingPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24381;
   private BlockPos field24382;
   private Direction field24383;
   private Action field24384;

   public CPlayerDiggingPacket() {
   }

   public CPlayerDiggingPacket(Action var1, BlockPos var2, Direction var3) {
      this.field24384 = var1;
      this.field24382 = var2.method8353();
      this.field24383 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24384 = var1.<Action>method35712(Action.class);
      this.field24382 = var1.method35707();
      this.field24383 = Direction.method546(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24384);
      var1.method35708(this.field24382);
      var1.writeByte(this.field24383.method533());
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processPlayerDigging(this);
   }

   public BlockPos method17272() {
      return this.field24382;
   }

   public Direction method17273() {
      return this.field24383;
   }

   public Action method17274() {
      return this.field24384;
   }

   public enum Action {
      field13484,
      field13485,
      field13486,
      field13487,
      field13488,
      field13489,
      SWAP_ITEM_WITH_OFFHAND;

      private static final Action[] field13491 = new Action[]{field13484, field13485, field13486, field13487, field13488, field13489, SWAP_ITEM_WITH_OFFHAND};
   }
}
