package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CJigsawBlockGeneratePacket implements IPacket<IServerPlayNetHandler> {
    private BlockPos field_240841_a_;
   private int field_240842_b_;
   private boolean field_240843_c_;

   public CJigsawBlockGeneratePacket() {
   }

   public CJigsawBlockGeneratePacket(BlockPos var1, int var2, boolean var3) {
      this.field_240841_a_ = var1;
      this.field_240842_b_ = var2;
      this.field_240843_c_ = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field_240841_a_ = var1.readBlockPos();
      this.field_240842_b_ = var1.readVarInt();
      this.field_240843_c_ = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.field_240841_a_);
      var1.writeVarInt(this.field_240842_b_);
      var1.writeBoolean(this.field_240843_c_);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_230549_a_(this);
   }

   public BlockPos func_240844_b_() {
      return this.field_240841_a_;
   }

   public int func_240845_c_() {
      return this.field_240842_b_;
   }

   public boolean func_240846_d_() {
      return this.field_240843_c_;
   }
}
