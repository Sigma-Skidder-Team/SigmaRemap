package net.minecraft.network.play.server;

import java.io.IOException;

import mapped.Block;
import mapped.CPlayerDiggingPacket;
import mapped.PacketBuffer;
import net.minecraft.block.BlockState;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SPlayerDiggingPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24783;
   private static final Logger field24784 = LogManager.getLogger();
   private BlockPos field24785;
   private BlockState field24786;
   public CPlayerDiggingPacket.Action field24787;
   private boolean field24788;

   public SPlayerDiggingPacket() {
   }

   public SPlayerDiggingPacket(BlockPos var1, BlockState var2, CPlayerDiggingPacket.Action var3, boolean var4, String var5) {
      this.field24785 = var1.method8353();
      this.field24786 = var2;
      this.field24787 = var3;
      this.field24788 = var4;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24785 = var1.method35707();
      this.field24786 = Block.field18610.method9172(var1.method35714());
      this.field24787 = var1.<CPlayerDiggingPacket.Action>method35712(CPlayerDiggingPacket.Action.class);
      this.field24788 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24785);
      var1.writeVarInt(Block.getStateId(this.field24786));
      var1.method35713(this.field24787);
      var1.writeBoolean(this.field24788);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleAcknowledgePlayerDigging(this);
   }

   public BlockState method17556() {
      return this.field24786;
   }

   public BlockPos method17557() {
      return this.field24785;
   }

   public boolean method17558() {
      return this.field24788;
   }

   public CPlayerDiggingPacket.Action method17559() {
      return this.field24787;
   }
}
