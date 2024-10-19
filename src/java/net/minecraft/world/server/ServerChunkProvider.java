package net.minecraft.world.server;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import mapped.*;
import net.minecraft.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.storage.DimensionSavedDataManager;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ServerChunkProvider extends AbstractChunkProvider {
   private static final List<ChunkStatus> field_217239_c = ChunkStatus.getAll();
   private final TicketManager ticketManager;
   private final ChunkGenerator generator;
   private final ServerWorld world;
   private final Thread mainThread;
   private final ServerWorldLightManager lightManager;
   private final ChunkExecutor executor;
   public final ChunkManager chunkManager;
   private final DimensionSavedDataManager savedData;
   private long lastGameTime;
   private boolean spawnHostiles = true;
   private boolean spawnPassives = true;
   private final long[] recentPositions = new long[4];
   private final ChunkStatus[] recentStatuses = new ChunkStatus[4];
   private final IChunk[] recentChunks = new IChunk[4];
   private EntityDensityManager field_241097_p_;

   public ServerChunkProvider(
      ServerWorld var1,
      SaveFormat.LevelSave var2,
      DataFixer var3,
      TemplateManager var4,
      Executor var5,
      ChunkGenerator var6,
      int var7,
      boolean var8,
      IChunkStatusListener var9,
      Supplier<DimensionSavedDataManager> var10
   ) {
      this.world = var1;
      this.executor = new ChunkExecutor(this, var1);
      this.generator = var6;
      this.mainThread = Thread.currentThread();
      File file1 = var2.method7992(var1.getDimensionKey());
      File file2 = new File(file1, "data");
      file2.mkdirs();
      this.savedData = new DimensionSavedDataManager(file2, var3);
      this.chunkManager = new ChunkManager(var1, var2, var3, var4, var5, this.executor, this, this.getChunkGenerator(), var9, var10, var7, var8);
      this.lightManager = this.chunkManager.getLightManager();
      this.ticketManager = this.chunkManager.getTicketManager();
      this.invalidateCaches();
   }

   public ServerWorldLightManager getLightManager() {
      return this.lightManager;
   }

   @Nullable
   private ChunkHolder func_217213_a(long var1) {
      return this.chunkManager.method6539(var1);
   }

   public int getLoadedChunksCount() {
      return this.chunkManager.func_219174_c();
   }

   private void func_225315_a(long var1, IChunk var3, ChunkStatus var4) {
      for (int var7 = 3; var7 > 0; var7--) {
         this.recentPositions[var7] = this.recentPositions[var7 - 1];
         this.recentStatuses[var7] = this.recentStatuses[var7 - 1];
         this.recentChunks[var7] = this.recentChunks[var7 - 1];
      }

      this.recentPositions[0] = var1;
      this.recentStatuses[0] = var4;
      this.recentChunks[0] = var3;
   }

   @Nullable
   @Override
   public IChunk getChunk(int var1, int var2, ChunkStatus var3, boolean var4) {
      if (Thread.currentThread() != this.mainThread) {
         return CompletableFuture.<IChunk>supplyAsync(() -> this.getChunk(var1, var2, var3, var4), this.executor).join();
      } else {
         IProfiler var7 = this.world.getProfiler();
         var7.func_230035_c_("getChunk");
         long var8 = ChunkPos.asLong(var1, var2);

         for (int var10 = 0; var10 < 4; var10++) {
            if (var8 == this.recentPositions[var10] && var3 == this.recentStatuses[var10]) {
               IChunk var11 = this.recentChunks[var10];
               if (var11 != null || !var4) {
                  return var11;
               }
            }
         }

         var7.func_230035_c_("getChunkCacheMiss");
         CompletableFuture var12 = this.method7359(var1, var2, var3, var4);
         this.executor.driveUntil(var12::isDone);
         IChunk var13 = (IChunk)((Either)var12.join()).map(var0 -> var0, var1x -> {
            if (!var4) {
               return null;
            } else {
               throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("Chunk not there when requested: " + var1x));
            }
         });
         this.func_225315_a(var8, var13, var3);
         return var13;
      }
   }

   @Nullable
   @Override
   public Chunk method7343(int var1, int var2) {
      if (Thread.currentThread() == this.mainThread) {
         this.world.getProfiler().func_230035_c_("getChunkNow");
         long var5 = ChunkPos.asLong(var1, var2);

         for (int var7 = 0; var7 < 4; var7++) {
            if (var5 == this.recentPositions[var7] && this.recentStatuses[var7] == ChunkStatus.FULL) {
               IChunk var8 = this.recentChunks[var7];
               return !(var8 instanceof Chunk) ? null : (Chunk)var8;
            }
         }

         ChunkHolder var10 = this.func_217213_a(var5);
         if (var10 != null) {
            Either var11 = var10.method31039(ChunkStatus.FULL).getNow((Either<IChunk, ChunkHolder.IChunkLoadingError>)null);
            if (var11 != null) {
               IChunk var9 = (IChunk)var11.left().orElse((IChunk)null);
               if (var9 != null) {
                  this.func_225315_a(var5, var9, ChunkStatus.FULL);
                  if (var9 instanceof Chunk) {
                     return (Chunk)var9;
                  }
               }

               return null;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void invalidateCaches() {
      Arrays.fill(this.recentPositions, ChunkPos.SENTINEL);
      Arrays.fill(this.recentStatuses, null);
      Arrays.fill(this.recentChunks, null);
   }

   public CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> method7358(int var1, int var2, ChunkStatus var3, boolean var4) {
      boolean var7 = Thread.currentThread() == this.mainThread;
      CompletableFuture var8;
      if (!var7) {
         var8 = CompletableFuture.<CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>>>supplyAsync(() -> this.method7359(var1, var2, var3, var4), this.executor)
            .<Either<IChunk, ChunkHolder.IChunkLoadingError>>thenCompose(var0 -> (CompletionStage<Either<IChunk, ChunkHolder.IChunkLoadingError>>)var0);
      } else {
         var8 = this.method7359(var1, var2, var3, var4);
         this.executor.driveUntil(var8::isDone);
      }

      return var8;
   }

   private CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> method7359(int var1, int var2, ChunkStatus var3, boolean var4) {
      ChunkPos var7 = new ChunkPos(var1, var2);
      long var8 = var7.asLong();
      int var10 = 33 + ChunkStatus.method34296(var3);
      ChunkHolder var11 = this.func_217213_a(var8);
      if (var4) {
         this.ticketManager.registerWithLevel(TicketType.UNKNOWN, var7, var10, var7);
         if (this.method7360(var11, var10)) {
            IProfiler var12 = this.world.getProfiler();
            var12.startSection("chunkLoad");
            this.method7363();
            var11 = this.func_217213_a(var8);
            var12.endSection();
            if (this.method7360(var11, var10)) {
               throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return !this.method7360(var11, var10) ? var11.func_219276_a(var3, this.chunkManager) : ChunkHolder.MISSING_CHUNK_FUTURE;
   }

   private boolean method7360(ChunkHolder var1, int var2) {
      return var1 == null || var1.method31057() > var2;
   }

   @Override
   public boolean chunkExists(int var1, int var2) {
      ChunkHolder var5 = this.func_217213_a(new ChunkPos(var1, var2).asLong());
      int var6 = 33 + ChunkStatus.method34296(ChunkStatus.FULL);
      return !this.method7360(var5, var6);
   }

   @Override
   public IBlockReader getChunkForLight(int var1, int var2) {
      long var5 = ChunkPos.asLong(var1, var2);
      ChunkHolder var7 = this.func_217213_a(var5);
      if (var7 != null) {
         int var8 = field_217239_c.size() - 1;

         while (true) {
            ChunkStatus var9 = field_217239_c.get(var8);
            Optional var10 = var7.method31038(var9).getNow(ChunkHolder.field38893).left();
            if (var10.isPresent()) {
               return (IBlockReader)var10.get();
            }

            if (var9 == ChunkStatus.LIGHT.method34299()) {
               return null;
            }

            var8--;
         }
      } else {
         return null;
      }
   }

   public World getWorld() {
      return this.world;
   }

   public boolean method7362() {
      return this.executor.method1302();
   }

   private boolean method7363() {
      boolean var3 = this.ticketManager.method35125(this.chunkManager);
      boolean var4 = this.chunkManager.method6549();
      if (!var3 && !var4) {
         return false;
      } else {
         this.invalidateCaches();
         return true;
      }
   }

   @Override
   public boolean isChunkLoaded(Entity var1) {
      long var4 = ChunkPos.asLong(MathHelper.floor(var1.getPosX()) >> 4, MathHelper.floor(var1.getPosZ()) >> 4);
      return this.method7364(var4, ChunkHolder::method31041);
   }

   @Override
   public boolean isChunkLoaded(ChunkPos var1) {
      return this.method7364(var1.asLong(), ChunkHolder::method31041);
   }

   @Override
   public boolean canTick(BlockPos var1) {
      long var4 = ChunkPos.asLong(var1.getX() >> 4, var1.getZ() >> 4);
      return this.method7364(var4, ChunkHolder::method31040);
   }

   private boolean method7364(long var1, Function<ChunkHolder, CompletableFuture<Either<Chunk, ChunkHolder.IChunkLoadingError>>> var3) {
      ChunkHolder var6 = this.func_217213_a(var1);
      if (var6 != null) {
         Either<Chunk, ChunkHolder.IChunkLoadingError> var7 = var3.apply(var6).getNow(ChunkHolder.field38895);
         return var7.left().isPresent();
      } else {
         return false;
      }
   }

   public void method7365(boolean var1) {
      this.method7363();
      this.chunkManager.method6545(var1);
   }

   @Override
   public void close() throws IOException {
      this.method7365(true);
      this.lightManager.close();
      this.chunkManager.close();
   }

   public void method7366(BooleanSupplier var1) {
      this.world.getProfiler().startSection("purge");
      this.ticketManager.method35123();
      this.method7363();
      this.world.getProfiler().endStartSection("chunks");
      this.method7367();
      this.world.getProfiler().endStartSection("unload");
      this.chunkManager.method6546(var1);
      this.world.getProfiler().endSection();
      this.invalidateCaches();
   }

   private void method7367() {
      long var3 = this.world.getGameTime();
      long var5 = var3 - this.lastGameTime;
      this.lastGameTime = var3;
      Class6612 var7 = this.world.getWorldInfo();
      boolean var8 = this.world.isDebug();
      boolean var9 = this.world.getGameRules().getBoolean(GameRules.field24226);
      if (!var8) {
         this.world.getProfiler().startSection("pollingChunks");
         int var10 = this.world.getGameRules().method17136(GameRules.field24235);
         boolean var11 = var7.getGameTime() % 400L == 0L;
         this.world.getProfiler().startSection("naturalSpawnCount");
         int var12 = this.ticketManager.method35138();
         EntityDensityManager var13 = Class8170.method28415(var12, this.world.method6965(), this::method7368);
         this.field_241097_p_ = var13;
         this.world.getProfiler().endSection();
         List<ChunkHolder> var14 = Lists.newArrayList(this.chunkManager.method6567());
         Collections.shuffle(var14);
         var14.forEach(var7x -> {
            Optional<Chunk> var10x = var7x.method31040().getNow(ChunkHolder.field38895).left();
            if (var10x.isPresent()) {
               this.world.getProfiler().startSection("broadcast");
               var7x.method31049(var10x.get());
               this.world.getProfiler().endSection();
               Optional<Chunk> var11x = var7x.method31041().getNow(ChunkHolder.field38895).left();
               if (var11x.isPresent()) {
                  Chunk var12x = var11x.get();
                  ChunkPos var13x = var7x.getPosition();
                  if (!this.chunkManager.method6571(var13x)) {
                     var12x.setInhabitedTime(var12x.getInhabitedTime() + var5);
                     if (var9 && (this.spawnHostiles || this.spawnPassives) && this.world.getWorldBorder().method24524(var12x.getPos())) {
                        Class8170.method28417(this.world, var12x, var13, this.spawnPassives, this.spawnHostiles, var11);
                     }

                     this.world.method6899(var12x, var10);
                  }
               }
            }
         });
         this.world.getProfiler().startSection("customSpawners");
         if (var9) {
            this.world.method6897(this.spawnHostiles, this.spawnPassives);
         }

         this.world.getProfiler().endSection();
         this.world.getProfiler().endSection();
      }

      this.chunkManager.method6579();
   }

   private void method7368(long var1, Consumer<Chunk> var3) {
      ChunkHolder var6 = this.func_217213_a(var1);
      if (var6 != null) {
         var6.method31042().getNow(ChunkHolder.field38895).left().ifPresent(var3);
      }
   }

   @Override
   public String makeString() {
      return "ServerChunkCache: " + this.method7371();
   }

   @VisibleForTesting
   public int method7369() {
      return this.executor.method1630();
   }

   public ChunkGenerator getChunkGenerator() {
      return this.generator;
   }

   public int method7371() {
      return this.chunkManager.method6565();
   }

   public void method7372(BlockPos var1) {
      int var4 = var1.getX() >> 4;
      int var5 = var1.getZ() >> 4;
      ChunkHolder var6 = this.func_217213_a(ChunkPos.asLong(var4, var5));
      if (var6 != null) {
         var6.method31047(var1);
      }
   }

   @Override
   public void markLightChanged(LightType var1, SectionPos var2) {
      this.executor.execute(() -> {
         ChunkHolder var5 = this.func_217213_a(var2.method8423().asLong());
         if (var5 != null) {
            var5.method31048(var1, var2.getSectionY());
         }
      });
   }

   public <T> void registerTicket(TicketType<T> var1, ChunkPos var2, int var3, T var4) {
      this.ticketManager.release(var1, var2, var3, var4);
   }

   public <T> void releaseTicket(TicketType<T> var1, ChunkPos var2, int var3, T var4) {
      this.ticketManager.register(var1, var2, var3, var4);
   }

   public void forceChunk(ChunkPos var1, boolean var2) {
      this.ticketManager.forceChunk(var1, var2);
   }

   public void method7376(ServerPlayerEntity var1) {
      this.chunkManager.method6575(var1);
   }

   public void method7377(Entity var1) {
      this.chunkManager.method6578(var1);
   }

   public void method7378(Entity var1) {
      this.chunkManager.method6577(var1);
   }

   public void sendToAllTracking(Entity var1, IPacket<?> var2) {
      this.chunkManager.method6581(var1, var2);
   }

   public void sendToTrackingAndSelf(Entity var1, IPacket<?> var2) {
      this.chunkManager.method6580(var1, var2);
   }

   public void method7381(int var1) {
      this.chunkManager.method6563(var1);
   }

   @Override
   public void method7349(boolean var1, boolean var2) {
      this.spawnHostiles = var1;
      this.spawnPassives = var2;
   }

   public String method7382(ChunkPos var1) {
      return this.chunkManager.method6541(var1);
   }

   public DimensionSavedDataManager getSavedData() {
      return this.savedData;
   }

   public Class1653 method7384() {
      return this.chunkManager.method6583();
   }

   @Nullable
   public EntityDensityManager method7385() {
      return this.field_241097_p_;
   }

   // $VF: synthetic method
   public static Thread method7394(ServerChunkProvider var0) {
      return var0.mainThread;
   }

   // $VF: synthetic method
   public static ServerWorld method7395(ServerChunkProvider var0) {
      return var0.world;
   }

   // $VF: synthetic method
   public static boolean method7396(ServerChunkProvider var0) {
      return var0.method7363();
   }

   // $VF: synthetic method
   public static ServerWorldLightManager method7397(ServerChunkProvider var0) {
      return var0.lightManager;
   }

   public static final class ChunkExecutor extends Class318<Runnable> {
      public final ServerChunkProvider field1383;

      public ChunkExecutor(ServerChunkProvider var1, World var2) {
         super("Chunk source main thread executor for " + var2.getDimensionKey().getLocation());
         this.field1383 = var1;
      }

      @Override
      public Runnable wrapTask(Runnable var1) {
         return var1;
      }

      @Override
      public boolean canRun(Runnable var1) {
         return true;
      }

      @Override
      public boolean method1390() {
         return true;
      }

      @Override
      public Thread getExecutionThread() {
         return method7394(this.field1383);
      }

      @Override
      public void run(Runnable var1) {
         method7395(this.field1383).getProfiler().func_230035_c_("runTask");
         super.run(var1);
      }

      @Override
      public boolean method1302() {
         if (!method7396(this.field1383)) {
            method7397(this.field1383).method611();
            return super.method1302();
         } else {
            return true;
         }
      }
   }
}
