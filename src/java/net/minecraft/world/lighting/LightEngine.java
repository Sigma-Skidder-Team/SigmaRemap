package net.minecraft.world.lighting;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunkLightProvider;
import net.minecraft.world.chunk.NibbleArray;
import org.apache.commons.lang3.mutable.MutableInt;

import javax.annotation.Nullable;
import java.util.Arrays;

public abstract class LightEngine<M extends LightDataMap<M>, S extends SectionLightStorage<M>> extends LevelBasedGraph implements IWorldLightListener {
   private static final Direction[] DIRECTIONS = Direction.values();
   public final IChunkLightProvider chunkProvider;
   public final LightType type;
   public final S storage;
   private boolean field_215629_e;
   public final BlockPos.Mutable scratchPos = new BlockPos.Mutable();
   private final long[] recentPositions = new long[2];
   private final IBlockReader[] recentChunks = new IBlockReader[2];

   public LightEngine(IChunkLightProvider var1, LightType var2, S var3) {
      super(16, 256, 8192);
      this.chunkProvider = var1;
      this.type = var2;
      this.storage = (S)var3;
      this.invalidateCaches();
   }

   public void scheduleUpdate(long worldPos) {
      this.storage.processAllLevelUpdates();
      if (this.storage.hasSection(SectionPos.worldToSection(worldPos))) {
         super.scheduleUpdate(worldPos);
      }
   }

   @Nullable
   private IBlockReader getChunkReader(int chunkX, int chunkZ) {
      long i = ChunkPos.asLong(chunkX, chunkZ);

      for (int j = 0; j < 2; j++) {
         if (i == this.recentPositions[j]) {
            return this.recentChunks[j];
         }
      }

      IBlockReader iblockreader = this.chunkProvider.getChunkForLight(chunkX, chunkZ);

      for (int k = 1; k > 0; k--) {
         this.recentPositions[k] = this.recentPositions[k - 1];
         this.recentChunks[k] = this.recentChunks[k - 1];
      }

      this.recentPositions[0] = i;
      this.recentChunks[0] = iblockreader;
      return iblockreader;
   }

   private void invalidateCaches() {
      Arrays.fill(this.recentPositions, ChunkPos.SENTINEL);
      Arrays.fill(this.recentChunks, null);
   }

   public BlockState getBlockAndOpacity(long pos, MutableInt opacityOut) {
      if (pos != Long.MAX_VALUE) {
         int var6 = SectionPos.toChunk(BlockPos.unpackX(pos));
         int var7 = SectionPos.toChunk(BlockPos.unpackZ(pos));
         IBlockReader var8 = this.getChunkReader(var6, var7);

         if (var8 == null) {
            if (opacityOut != null) {
               opacityOut.setValue(16);
            }

            return Blocks.BEDROCK.getDefaultState();
         } else {
            this.scratchPos.setPos(pos);
            BlockState iblockreader = var8.getBlockState(this.scratchPos);
            boolean var10 = iblockreader.isSolid() && iblockreader.isTransparent();
            if (opacityOut != null) {
               opacityOut.setValue(iblockreader.getOpacity(this.chunkProvider.getWorld(), this.scratchPos));
            }

            return !var10 ? Blocks.AIR.getDefaultState() : iblockreader;
         }
      } else {
         if (opacityOut != null) {
            opacityOut.setValue(0);
         }

         return Blocks.AIR.getDefaultState();
      }
   }

   public VoxelShape getVoxelShape(BlockState blockStateIn, long worldPos, Direction directionIn) {
      return blockStateIn.isSolid() ? blockStateIn.getFaceOcclusionShape(this.chunkProvider.getWorld(), this.scratchPos.setPos(worldPos), directionIn) : VoxelShapes.empty();
   }

   public static int func_215613_a(IBlockReader var0, BlockState var1, BlockPos var2, BlockState var3, BlockPos var4, Direction var5, int var6) {
      boolean var9 = var1.isSolid() && var1.isTransparent();
      boolean var10 = var3.isSolid() && var3.isTransparent();
      if (!var9 && !var10) {
         return var6;
      } else {
         VoxelShape var11 = !var9 ? VoxelShapes.empty() : var1.getRenderShapeTrue(var0, var2);
         VoxelShape var12 = !var10 ? VoxelShapes.empty() : var3.getRenderShapeTrue(var0, var4);
         return ! VoxelShapes.doAdjacentCubeSidesFillSquare(var11, var12, var5) ? var6 : 16;
      }
   }

   public boolean isRoot(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   public int computeLevel(long var1, long var3, int var5) {
      return 0;
   }

   public int getLevel(long var1) {
      return var1 != Long.MAX_VALUE ? 15 - this.storage.method703(var1) : 0;
   }

   public int getLevelFromArray(NibbleArray var1, long var2) {
      return 15
         - var1.get(
            SectionPos.mask(BlockPos.unpackX(var2)),
            SectionPos.mask(BlockPos.unpackY(var2)),
            SectionPos.mask(BlockPos.unpackZ(var2))
         );
   }

   public void setLevel(long sectionPosIn, int level) {
      this.storage.setLight(sectionPosIn, Math.min(15, 15 - level));
   }

   public int getEdgeLevel(long var1, long var3, int var5) {
      return 0;
   }

   public boolean func_215619_a() {
      return this.needsUpdate() || this.storage.needsUpdate() || this.storage.hasSectionsToUpdate();
   }

   public int tick(int toUpdateCount, boolean updateSkyLight, boolean updateBlockLight) {
      if (!this.field_215629_e) {
         if (this.storage.needsUpdate()) {
            toUpdateCount = this.storage.processUpdates(toUpdateCount);
            if (toUpdateCount == 0) {
               return toUpdateCount;
            }
         }

         this.storage.updateSections(this, updateSkyLight, updateBlockLight);
      }

      this.field_215629_e = true;
      if (this.needsUpdate()) {
         toUpdateCount = this.processUpdates(toUpdateCount);
         this.invalidateCaches();
         if (toUpdateCount == 0) {
            return toUpdateCount;
         }
      }

      this.field_215629_e = false;
      this.storage.updateAndNotify();
      return toUpdateCount;
   }

   public void method658(long var1, NibbleArray var3, boolean var4) {
      this.storage.method714(var1, var3, var4);
   }

   @Nullable
   @Override
   public NibbleArray method642(SectionPos var1) {
      return this.storage.method701(var1.asLong());
   }

   @Override
   public int method643(BlockPos var1) {
      return this.storage.method702(var1.toLong());
   }

   public String method659(long var1) {
      return "" + this.storage.getLevel(var1);
   }

   public void checkLight(BlockPos var1) {
      long var4 = var1.toLong();
      this.scheduleUpdate(var4);

      for (Direction var9 : DIRECTIONS) {
         this.scheduleUpdate(BlockPos.method8314(var4, var9));
      }
   }

   public void func_215623_a(BlockPos var1, int var2) {
   }

   @Override
   public void updateSectionStatus(SectionPos var1, boolean var2) {
      this.storage.updateSectionStatus(var1.asLong(), var2);
   }

   public void func_215620_a(ChunkPos var1, boolean var2) {
      long i = SectionPos.toSectionColumnPos(SectionPos.asLong(var1.x, 0, var1.z));
      this.storage.setColumnEnabled(i, var2);
   }

   public void retainChunkData(ChunkPos var1, boolean var2) {
      long i = SectionPos.toSectionColumnPos(SectionPos.asLong(var1.x, 0, var1.z));
      this.storage.retainChunkData(i, var2);
   }
}
