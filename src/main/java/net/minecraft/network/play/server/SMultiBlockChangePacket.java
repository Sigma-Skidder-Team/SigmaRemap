package net.minecraft.network.play.server;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.chunk.ChunkSection;

import java.io.IOException;
import java.util.function.BiConsumer;

public class SMultiBlockChangePacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24641;
   public SectionPos field24642;
   public short[] field24643;
   public BlockState[] field24644;
   public boolean field24645;

   public SMultiBlockChangePacket() {
   }

   public SMultiBlockChangePacket(SectionPos var1, ShortSet var2, ChunkSection var3, boolean var4) {
      this.field24642 = var1;
      this.field24645 = var4;
      this.method17460(var2.size());
      int var7 = 0;

      for (ShortIterator var8 = var2.iterator(); var8.hasNext(); var7++) {
         short var9 = var8.next();
         this.field24643[var7] = var9;
         this.field24644[var7] = var3.getBlockState(SectionPos.func_243641_a(var9), SectionPos.func_243642_b(var9), SectionPos.func_243643_c(var9));
      }
   }

   private void method17460(int var1) {
      this.field24643 = new short[var1];
      this.field24644 = new BlockState[var1];
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24642 = SectionPos.from(var1.readLong());
      this.field24645 = var1.readBoolean();
      int var4 = var1.readVarInt();
      this.method17460(var4);

      for (int var5 = 0; var5 < this.field24643.length; var5++) {
         long var6 = var1.readVarLong();
         this.field24643[var5] = (short)((int)(var6 & 4095L));
         this.field24644[var5] = Block.BLOCK_STATE_IDS.getByValue((int)(var6 >>> 12));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24642.asLong());
      var1.writeBoolean(this.field24645);
      var1.writeVarInt(this.field24643.length);

      for (int var4 = 0; var4 < this.field24643.length; var4++) {
         var1.writeVarLong((long)(Block.getStateId(this.field24644[var4]) << 12 | this.field24643[var4]));
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleMultiBlockChange(this);
   }

   public void method17461(BiConsumer<BlockPos, BlockState> var1) {
      BlockPos.Mutable var4 = new BlockPos.Mutable();

      for (int var5 = 0; var5 < this.field24643.length; var5++) {
         short var6 = this.field24643[var5];
         var4.setPos(this.field24642.func_243644_d(var6), this.field24642.func_243645_e(var6), this.field24642.func_243646_f(var6));
         var1.accept(var4, this.field24644[var5]);
      }
   }

   public boolean method17462() {
      return this.field24645;
   }
}
