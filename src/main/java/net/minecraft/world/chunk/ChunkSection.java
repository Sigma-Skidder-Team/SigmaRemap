package net.minecraft.world.chunk;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.PacketBuffer;
import net.optifine.ChunkDataOF;
import net.optifine.ChunkSectionDataOF;

import java.util.function.Predicate;

public class ChunkSection {
   private static String[] field30367;
   private static final Class7833<BlockState> field30368 = new Class7836<BlockState>(Block.BLOCK_STATE_IDS, Blocks.AIR.getDefaultState());
   private final int field30369;
   private short field30370;
   private short field30371;
   private short field30372;
   private final Class8556<BlockState> data;
   public static final ThreadLocal<ChunkDataOF> THREAD_CHUNK_DATA_OF = new ThreadLocal<ChunkDataOF>();

   public ChunkSection(int var1) {
      this(var1, (short)0, (short)0, (short)0);
   }

   public ChunkSection(int var1, short var2, short var3, short var4) {
      this.field30369 = var1;
      this.field30370 = var2;
      this.field30371 = var3;
      this.field30372 = var4;
      this.data = new Class8556<BlockState>(
         field30368, Block.BLOCK_STATE_IDS, NBTUtil::readBlockState, NBTUtil::writeBlockState, Blocks.AIR.getDefaultState()
      );
   }

   public BlockState getBlockState(int var1, int var2, int var3) {
      return this.data.get(var1, var2, var3);
   }

   public FluidState getFluidState(int var1, int var2, int var3) {
      return this.data.get(var1, var2, var3).getFluidState();
   }

   public void method21854() {
      this.data.lock();
   }

   public void method21855() {
      this.data.unlock();
   }

   public BlockState setBlockState(int var1, int var2, int var3, BlockState var4) {
      return this.setBlockState(var1, var2, var3, var4, true);
   }

   public BlockState setBlockState(int var1, int var2, int var3, BlockState var4, boolean var5) {
      BlockState var8;
      if (!var5) {
         var8 = this.data.method30495(var1, var2, var3, var4);
      } else {
         var8 = this.data.method30494(var1, var2, var3, var4);
      }

      FluidState var9 = var8.getFluidState();
      FluidState var10 = var4.getFluidState();
      if (!var8.isAir()) {
         this.field30370--;
         if (var8.method23450()) {
            this.field30371--;
         }
      }

      if (!var9.isEmpty()) {
         this.field30372--;
      }

      if (!var4.isAir()) {
         this.field30370++;
         if (var4.method23450()) {
            this.field30371++;
         }
      }

      if (!var10.isEmpty()) {
         this.field30372++;
      }

      return var8;
   }

   public boolean method21858() {
      return this.field30370 == 0;
   }

   public static boolean isEmpty(ChunkSection var0) {
      return var0 == Chunk.field9111 || var0.method21858();
   }

   public boolean method21860() {
      return this.method21861() || this.method21862();
   }

   public boolean method21861() {
      return this.field30371 > 0;
   }

   public boolean method21862() {
      return this.field30372 > 0;
   }

   public int getYLocation() {
      return this.field30369;
   }

   public void method21864() {
      ChunkDataOF var3 = THREAD_CHUNK_DATA_OF.get();
      if (var3 != null) {
         ChunkSectionDataOF[] var4 = var3.method32269();
         if (var4 != null) {
            int var5 = this.field30369 >> 4;
            if (var5 >= 0 && var5 < var4.length) {
               ChunkSectionDataOF var6 = var4[var5];
               if (var6 != null) {
                  this.field30370 = var6.getBlockRefCount();
                  this.field30371 = var6.getTickRefCount();
                  this.field30372 = var6.getFluidRefCount();
                  var4[var5] = null;
                  return;
               }
            }
         }
      }

      this.field30370 = 0;
      this.field30371 = 0;
      this.field30372 = 0;
      this.data.method30506((var1, var2) -> {
         FluidState var5x = var1.getFluidState();
         if (!var1.isAir()) {
            this.field30370 = (short)(this.field30370 + var2);
            if (var1.method23450()) {
               this.field30371 = (short)(this.field30371 + var2);
            }
         }

         if (!var5x.isEmpty()) {
            this.field30370 = (short)(this.field30370 + var2);
            if (var5x.method23481()) {
               this.field30372 = (short)(this.field30372 + var2);
            }
         }
      });
   }

   public Class8556<BlockState> method21865() {
      return this.data;
   }

   public void method21866(PacketBuffer var1) {
      this.field30370 = var1.readShort();
      this.data.method30500(var1);
   }

   public void method21867(PacketBuffer var1) {
      var1.writeShort(this.field30370);
      this.data.method30501(var1);
   }

   public int getSize() {
      return 2 + this.data.method30504();
   }

   public boolean isValidPOIState(Predicate<BlockState> var1) {
      return this.data.func_235963_a_(var1);
   }

   public short method21870() {
      return this.field30370;
   }

   public short method21871() {
      return this.field30371;
   }

   public short method21872() {
      return this.field30372;
   }
}
