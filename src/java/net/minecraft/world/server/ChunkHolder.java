package net.minecraft.world.server;

import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.util.Util;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SChangeBlockPacket;
import net.minecraft.network.play.server.SMultiBlockChangePacket;
import net.minecraft.network.play.server.SUpdateLightPacket;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.lighting.WorldLightManager;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;

public class ChunkHolder {
   private static String[] field38892;
   public static final Either<IChunk, IChunkLoadingError> field38893 = Either.right(IChunkLoadingError.UNLOADED);
   public static final CompletableFuture<Either<IChunk, IChunkLoadingError>> MISSING_CHUNK_FUTURE = CompletableFuture.<Either<IChunk, IChunkLoadingError>>completedFuture(field38893);
   public static final Either<Chunk, IChunkLoadingError> field38895 = Either.right(IChunkLoadingError.UNLOADED);
   private static final CompletableFuture<Either<Chunk, IChunkLoadingError>> field38896 = CompletableFuture.<Either<Chunk, IChunkLoadingError>>completedFuture(field38895);
   private static final List<ChunkStatus> field38897 = ChunkStatus.getAll();
   private static final ChunkHolderLocationType[] field38898 = ChunkHolderLocationType.values();
   private final AtomicReferenceArray<CompletableFuture<Either<IChunk, IChunkLoadingError>>> field_219312_g = new AtomicReferenceArray<CompletableFuture<Either<IChunk, IChunkLoadingError>>>(
      field38897.size()
   );
   private volatile CompletableFuture<Either<Chunk, IChunkLoadingError>> field38900 = field38896;
   private volatile CompletableFuture<Either<Chunk, IChunkLoadingError>> field38901 = field38896;
   private volatile CompletableFuture<Either<Chunk, IChunkLoadingError>> field38902 = field38896;
   private CompletableFuture<IChunk> field_219315_j = CompletableFuture.<IChunk>completedFuture((IChunk)null);
   private int field38904;
   private int chunkLevel;
   private int field38906;
   private final ChunkPos pos;
   private boolean field38908;
   private final ShortSet[] field38909 = new ShortSet[16];
   private int field38910;
   private int field38911;
   private final WorldLightManager field38912;
   private final IListener field38913;
   private final Class1650 field38914;
   private boolean field38915;
   private boolean field38916;

   public ChunkHolder(ChunkPos var1, int var2, WorldLightManager var3, IListener var4, Class1650 var5) {
      this.pos = var1;
      this.field38912 = var3;
      this.field38913 = var4;
      this.field38914 = var5;
      this.field38904 = ChunkManager.MAX_LOADED_LEVEL + 1;
      this.chunkLevel = this.field38904;
      this.field38906 = this.field38904;
      this.method31060(var2);
   }

   public CompletableFuture<Either<IChunk, IChunkLoadingError>> method31038(ChunkStatus var1) {
      CompletableFuture var4 = this.field_219312_g.get(var1.ordinal());
      return var4 != null ? var4 : MISSING_CHUNK_FUTURE;
   }

   public CompletableFuture<Either<IChunk, IChunkLoadingError>> method31039(ChunkStatus var1) {
      return !getChunkStatusFromLevel(this.chunkLevel).isAtLeast(var1) ? MISSING_CHUNK_FUTURE : this.method31038(var1);
   }

   public CompletableFuture<Either<Chunk, IChunkLoadingError>> method31040() {
      return this.field38901;
   }

   public CompletableFuture<Either<Chunk, IChunkLoadingError>> method31041() {
      return this.field38902;
   }

   public CompletableFuture<Either<Chunk, IChunkLoadingError>> method31042() {
      return this.field38900;
   }

   @Nullable
   public Chunk method31043() {
      CompletableFuture var3 = this.method31040();
      Either var4 = (Either)var3.getNow((Either)null);
      return var4 != null ? (Chunk)var4.left().orElse((Chunk)null) : null;
   }

   @Nullable
   public ChunkStatus method31044() {
      for (int var3 = field38897.size() - 1; var3 >= 0; var3--) {
         ChunkStatus var4 = field38897.get(var3);
         CompletableFuture<Either<IChunk, IChunkLoadingError>> var5 = this.method31038(var4);
         if (var5.getNow(field38893).left().isPresent()) {
            return var4;
         }
      }

      return null;
   }

   @Nullable
   public IChunk method31045() {
      for (int var3 = field38897.size() - 1; var3 >= 0; var3--) {
         ChunkStatus var4 = field38897.get(var3);
         CompletableFuture<Either<IChunk, IChunkLoadingError>> var5 = this.method31038(var4);
         if (!var5.isCompletedExceptionally()) {
            Optional var6 = var5.getNow(field38893).left();
            if (var6.isPresent()) {
               return (IChunk)var6.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<IChunk> method31046() {
      return this.field_219315_j;
   }

   public void method31047(BlockPos var1) {
      Chunk var4 = this.method31043();
      if (var4 != null) {
         byte var5 = (byte) SectionPos.toChunk(var1.getY());
         if (this.field38909[var5] == null) {
            this.field38908 = true;
            this.field38909[var5] = new ShortArraySet();
         }

         this.field38909[var5].add(SectionPos.method8398(var1));
      }
   }

   public void method31048(LightType var1, int var2) {
      Chunk var5 = this.method31043();
      if (var5 != null) {
         var5.setModified(true);
         if (var1 != LightType.SKY) {
            this.field38910 |= 1 << var2 - -1;
         } else {
            this.field38911 |= 1 << var2 - -1;
         }
      }
   }

   public void method31049(Chunk var1) {
      if (this.field38908 || this.field38911 != 0 || this.field38910 != 0) {
         World var4 = var1.method7144();
         int var5 = 0;

         for (int var6 = 0; var6 < this.field38909.length; var6++) {
            var5 += this.field38909[var6] == null ? 0 : this.field38909[var6].size();
         }

         this.field38916 |= var5 >= 64;
         if (this.field38911 != 0 || this.field38910 != 0) {
            this.method31052(new SUpdateLightPacket(var1.getPos(), this.field38912, this.field38911, this.field38910, true), !this.field38916);
            this.field38911 = 0;
            this.field38910 = 0;
         }

         for (int var11 = 0; var11 < this.field38909.length; var11++) {
            ShortSet var7 = this.field38909[var11];
            if (var7 != null) {
               SectionPos var8 = SectionPos.from(var1.getPos(), var11);
               if (var7.size() != 1) {
                  ChunkSection var9 = var1.getSections()[var8.getY()];
                  SMultiBlockChangePacket var10 = new SMultiBlockChangePacket(var8, var7, var9, this.field38916);
                  this.method31052(var10, false);
                  var10.method17461((var2, var3) -> this.method31050(var4, var2, var3));
               } else {
                  BlockPos var12 = var8.method8405(var7.iterator().nextShort());
                  BlockState var13 = var4.getBlockState(var12);
                  this.method31052(new SChangeBlockPacket(var12, var13), false);
                  this.method31050(var4, var12, var13);
               }

               this.field38909[var11] = null;
            }
         }

         this.field38908 = false;
      }
   }

   private void method31050(World var1, BlockPos var2, BlockState var3) {
      if (var3.getBlock().isTileEntityProvider()) {
         this.method31051(var1, var2);
      }
   }

   private void method31051(World var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      if (var5 != null) {
         SUpdateTileEntityPacket var6 = var5.method3776();
         if (var6 != null) {
            this.method31052(var6, false);
         }
      }
   }

   private void method31052(IPacket<?> var1, boolean var2) {
      this.field38914.getTrackingPlayers(this.pos, var2).forEach(var1x -> var1x.connection.sendPacket(var1));
   }

   public CompletableFuture<Either<IChunk, IChunkLoadingError>> func_219276_a(ChunkStatus p_219276_1_, ChunkManager p_219276_2_) {
      int i = p_219276_1_.ordinal();
      CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> completablefuture = this.field_219312_g.get(i);
      if (completablefuture != null) {
         Either<IChunk, ChunkHolder.IChunkLoadingError> either = completablefuture.getNow((Either<IChunk, ChunkHolder.IChunkLoadingError>)null);

         if (either == null || either.left().isPresent())
         {
            return completablefuture;
         }
      }

      if (getChunkStatusFromLevel(this.chunkLevel).isAtLeast(p_219276_1_))
      {
         CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> completablefuture1 = p_219276_2_.func_219244_a(this, p_219276_1_);
         this.chain(completablefuture1);
         this.field_219312_g.set(i, completablefuture1);
         return completablefuture1;
      }
      else
      {
         return completablefuture == null ? MISSING_CHUNK_FUTURE : completablefuture;
      }
   }

   private void chain(CompletableFuture<? extends Either<? extends IChunk, IChunkLoadingError>> var1) {
      this.field_219315_j = this.field_219315_j.<Either, IChunk>thenCombine(var1, (var0, var1x) -> (IChunk)var1x.map(var0x -> var0x, var1xx -> var0));
   }

   public ChunkHolderLocationType method31055() {
      return getLocationTypeFromLevel(this.chunkLevel);
   }

   public ChunkPos getPosition() {
      return this.pos;
   }

   public int method31057() {
      return this.chunkLevel;
   }

   public int func_219281_j() {
      return this.field38906;
   }

   private void method31059(int var1) {
      this.field38906 = var1;
   }

   public void method31060(int var1) {
      this.chunkLevel = var1;
   }

   public void method31061(ChunkManager var1) {
      ChunkStatus var4 = getChunkStatusFromLevel(this.field38904);
      ChunkStatus var5 = getChunkStatusFromLevel(this.chunkLevel);
      boolean var6 = this.field38904 <= ChunkManager.MAX_LOADED_LEVEL;
      boolean var7 = this.chunkLevel <= ChunkManager.MAX_LOADED_LEVEL;
      ChunkHolderLocationType var8 = getLocationTypeFromLevel(this.field38904);
      ChunkHolderLocationType var9 = getLocationTypeFromLevel(this.chunkLevel);
      if (var6) {
         Either<IChunk, ChunkHolder.IChunkLoadingError> either = Either.right(new ChunkHolder.IChunkLoadingError()
         {
            public String toString()
            {
               return "Unloaded ticket level " + ChunkHolder.this.pos.toString();
            }
         });

         for (int var11 = !var7 ? 0 : var5.ordinal() + 1; var11 <= var4.ordinal(); var11++) {
            CompletableFuture var12 = this.field_219312_g.get(var11);
            if (var12 == null) {
               this.field_219312_g.set(var11, CompletableFuture.<Either<IChunk, IChunkLoadingError>>completedFuture(either));
            } else {
               var12.complete(either);
            }
         }
      }

      boolean var16 = var8.isAtLeast(ChunkHolderLocationType.field167);
      boolean var17 = var9.isAtLeast(ChunkHolderLocationType.field167);
      this.field38915 |= var17;
      if (!var16 && var17) {
         this.field38900 = var1.method6559(this);
         this.chain(this.field38900);
      }

      if (var16 && !var17) {
         CompletableFuture<Either<Chunk, IChunkLoadingError>> var18 = this.field38900;
         this.field38900 = field38896;
         this.chain(var18.thenApply(var1x -> var1x.ifLeft(var1::method6584)));
      }

      boolean var19 = var8.isAtLeast(ChunkHolderLocationType.TICKING);
      boolean var13 = var9.isAtLeast(ChunkHolderLocationType.TICKING);
      if (!var19 && var13) {
         this.field38901 = var1.func_219179_a(this);
         this.chain(this.field38901);
      }

      if (var19 && !var13) {
         this.field38901.complete(field38895);
         this.field38901 = field38896;
      }

      boolean var14 = var8.isAtLeast(ChunkHolderLocationType.field169);
      boolean var15 = var9.isAtLeast(ChunkHolderLocationType.field169);
      if (!var14 && var15) {
         if (this.field38902 != field38896) {
            throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException());
         }

         this.field38902 = var1.func_219188_b(this.pos);
         this.chain(this.field38902);
      }

      if (var14 && !var15) {
         this.field38902.complete(field38895);
         this.field38902 = field38896;
      }

      this.field38913.method7965(this.pos, this::func_219281_j, this.chunkLevel, this::method31059);
      this.field38904 = this.chunkLevel;
   }

   public static ChunkStatus getChunkStatusFromLevel(int var0) {
      return var0 >= 33 ? ChunkStatus.method34294(var0 - 33) : ChunkStatus.FULL;
   }

   public static ChunkHolderLocationType getLocationTypeFromLevel(int var0) {
      return field38898[MathHelper.clamp(33 - var0 + 1, 0, field38898.length - 1)];
   }

   public boolean method31064() {
      return this.field38915;
   }

   public void method31065() {
      this.field38915 = getLocationTypeFromLevel(this.chunkLevel).isAtLeast(ChunkHolderLocationType.field167);
   }

   public void method31066(Class1673 var1) {
      for (int var4 = 0; var4 < this.field_219312_g.length(); var4++) {
         CompletableFuture<Either<IChunk, IChunkLoadingError>> var5 = this.field_219312_g.get(var4);
         if (var5 != null) {
            Optional<IChunk> var6 = var5.getNow(field38893).left();
            if (var6.isPresent() && var6.get() instanceof ChunkPrimer) {
               this.field_219312_g.set(var4, CompletableFuture.<Either<IChunk, IChunkLoadingError>>completedFuture(Either.left(var1)));
            }
         }
      }

      this.chain(CompletableFuture.completedFuture(Either.left(var1.method7127())));
   }

   public interface IChunkLoadingError
   {
      ChunkHolder.IChunkLoadingError UNLOADED = new ChunkHolder.IChunkLoadingError()
      {
         public String toString()
         {
            return "UNLOADED";
         }
      };
   }

   public static interface IListener {
      void method7965(ChunkPos var1, IntSupplier var2, int var3, IntConsumer var4);
   }
}
