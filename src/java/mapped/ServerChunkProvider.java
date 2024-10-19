package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
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
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ChunkManager;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.server.TicketType;
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
   private static final List<ChunkStatus> field9272 = ChunkStatus.method34292();
   private final Class9307 ticketManager;
   private final ChunkGenerator field9274;
   private final ServerWorld field9275;
   private final Thread field9276;
   private final Class195 field9277;
   private final Class320 field9278;
   public final ChunkManager field9279;
   private final DimensionSavedDataManager field9280;
   private long field9281;
   private boolean field9282 = true;
   private boolean field9283 = true;
   private final long[] field9284 = new long[4];
   private final ChunkStatus[] field9285 = new ChunkStatus[4];
   private final IChunk[] field9286 = new IChunk[4];
   private Class7307 field9287;

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
      this.field9275 = var1;
      this.field9278 = new Class320(this, var1);
      this.field9274 = var6;
      this.field9276 = Thread.currentThread();
      File var13 = var2.method7992(var1.getDimensionKey());
      File var14 = new File(var13, "data");
      var14.mkdirs();
      this.field9280 = new DimensionSavedDataManager(var14, var3);
      this.field9279 = new ChunkManager(var1, var2, var3, var4, var5, this.field9278, this, this.getChunkGenerator(), var9, var10, var7, var8);
      this.field9277 = this.field9279.method6537();
      this.ticketManager = this.field9279.method6566();
      this.method7357();
   }

   public Class195 getLightManager() {
      return this.field9277;
   }

   @Nullable
   private Class8641 method7354(long var1) {
      return this.field9279.method6539(var1);
   }

   public int getLoadedChunksCount() {
      return this.field9279.method6560();
   }

   private void method7356(long var1, IChunk var3, ChunkStatus var4) {
      for (int var7 = 3; var7 > 0; var7--) {
         this.field9284[var7] = this.field9284[var7 - 1];
         this.field9285[var7] = this.field9285[var7 - 1];
         this.field9286[var7] = this.field9286[var7 - 1];
      }

      this.field9284[0] = var1;
      this.field9285[0] = var4;
      this.field9286[0] = var3;
   }

   @Nullable
   @Override
   public IChunk getChunk(int var1, int var2, ChunkStatus var3, boolean var4) {
      if (Thread.currentThread() != this.field9276) {
         return CompletableFuture.<IChunk>supplyAsync(() -> this.getChunk(var1, var2, var3, var4), this.field9278).join();
      } else {
         IProfiler var7 = this.field9275.getProfiler();
         var7.func_230035_c_("getChunk");
         long var8 = ChunkPos.asLong(var1, var2);

         for (int var10 = 0; var10 < 4; var10++) {
            if (var8 == this.field9284[var10] && var3 == this.field9285[var10]) {
               IChunk var11 = this.field9286[var10];
               if (var11 != null || !var4) {
                  return var11;
               }
            }
         }

         var7.func_230035_c_("getChunkCacheMiss");
         CompletableFuture var12 = this.method7359(var1, var2, var3, var4);
         this.field9278.driveUntil(var12::isDone);
         IChunk var13 = (IChunk)((Either)var12.join()).map(var0 -> var0, var1x -> {
            if (!var4) {
               return null;
            } else {
               throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("Chunk not there when requested: " + var1x));
            }
         });
         this.method7356(var8, var13, var3);
         return var13;
      }
   }

   @Nullable
   @Override
   public Chunk method7343(int var1, int var2) {
      if (Thread.currentThread() == this.field9276) {
         this.field9275.getProfiler().func_230035_c_("getChunkNow");
         long var5 = ChunkPos.asLong(var1, var2);

         for (int var7 = 0; var7 < 4; var7++) {
            if (var5 == this.field9284[var7] && this.field9285[var7] == ChunkStatus.FULL) {
               IChunk var8 = this.field9286[var7];
               return !(var8 instanceof Chunk) ? null : (Chunk)var8;
            }
         }

         Class8641 var10 = this.method7354(var5);
         if (var10 != null) {
            Either var11 = var10.method31039(ChunkStatus.FULL).getNow((Either<IChunk, Class7022>)null);
            if (var11 != null) {
               IChunk var9 = (IChunk)var11.left().orElse((IChunk)null);
               if (var9 != null) {
                  this.method7356(var5, var9, ChunkStatus.FULL);
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

   private void method7357() {
      Arrays.fill(this.field9284, ChunkPos.SENTINEL);
      Arrays.fill(this.field9285, null);
      Arrays.fill(this.field9286, null);
   }

   public CompletableFuture<Either<IChunk, Class7022>> method7358(int var1, int var2, ChunkStatus var3, boolean var4) {
      boolean var7 = Thread.currentThread() == this.field9276;
      CompletableFuture var8;
      if (!var7) {
         var8 = CompletableFuture.<CompletableFuture<Either<IChunk, Class7022>>>supplyAsync(() -> this.method7359(var1, var2, var3, var4), this.field9278)
            .<Either<IChunk, Class7022>>thenCompose(var0 -> (CompletionStage<Either<IChunk, Class7022>>)var0);
      } else {
         var8 = this.method7359(var1, var2, var3, var4);
         this.field9278.driveUntil(var8::isDone);
      }

      return var8;
   }

   private CompletableFuture<Either<IChunk, Class7022>> method7359(int var1, int var2, ChunkStatus var3, boolean var4) {
      ChunkPos var7 = new ChunkPos(var1, var2);
      long var8 = var7.asLong();
      int var10 = 33 + ChunkStatus.method34296(var3);
      Class8641 var11 = this.method7354(var8);
      if (var4) {
         this.ticketManager.registerWithLevel(TicketType.UNKNOWN, var7, var10, var7);
         if (this.method7360(var11, var10)) {
            IProfiler var12 = this.field9275.getProfiler();
            var12.startSection("chunkLoad");
            this.method7363();
            var11 = this.method7354(var8);
            var12.endSection();
            if (this.method7360(var11, var10)) {
               throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return !this.method7360(var11, var10) ? var11.method31053(var3, this.field9279) : Class8641.field38894;
   }

   private boolean method7360(Class8641 var1, int var2) {
      return var1 == null || var1.method31057() > var2;
   }

   @Override
   public boolean chunkExists(int var1, int var2) {
      Class8641 var5 = this.method7354(new ChunkPos(var1, var2).asLong());
      int var6 = 33 + ChunkStatus.method34296(ChunkStatus.FULL);
      return !this.method7360(var5, var6);
   }

   @Override
   public IBlockReader getChunkForLight(int var1, int var2) {
      long var5 = ChunkPos.asLong(var1, var2);
      Class8641 var7 = this.method7354(var5);
      if (var7 != null) {
         int var8 = field9272.size() - 1;

         while (true) {
            ChunkStatus var9 = field9272.get(var8);
            Optional var10 = var7.method31038(var9).getNow(Class8641.field38893).left();
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
      return this.field9275;
   }

   public boolean method7362() {
      return this.field9278.method1302();
   }

   private boolean method7363() {
      boolean var3 = this.ticketManager.method35125(this.field9279);
      boolean var4 = this.field9279.method6549();
      if (!var3 && !var4) {
         return false;
      } else {
         this.method7357();
         return true;
      }
   }

   @Override
   public boolean isChunkLoaded(Entity var1) {
      long var4 = ChunkPos.asLong(MathHelper.floor(var1.getPosX()) >> 4, MathHelper.floor(var1.getPosZ()) >> 4);
      return this.method7364(var4, Class8641::method31041);
   }

   @Override
   public boolean isChunkLoaded(ChunkPos var1) {
      return this.method7364(var1.asLong(), Class8641::method31041);
   }

   @Override
   public boolean canTick(BlockPos var1) {
      long var4 = ChunkPos.asLong(var1.getX() >> 4, var1.getZ() >> 4);
      return this.method7364(var4, Class8641::method31040);
   }

   private boolean method7364(long var1, Function<Class8641, CompletableFuture<Either<Chunk, Class7022>>> var3) {
      Class8641 var6 = this.method7354(var1);
      if (var6 != null) {
         Either<Chunk, Class7022> var7 = var3.apply(var6).getNow(Class8641.field38895);
         return var7.left().isPresent();
      } else {
         return false;
      }
   }

   public void method7365(boolean var1) {
      this.method7363();
      this.field9279.method6545(var1);
   }

   @Override
   public void close() throws IOException {
      this.method7365(true);
      this.field9277.close();
      this.field9279.close();
   }

   public void method7366(BooleanSupplier var1) {
      this.field9275.getProfiler().startSection("purge");
      this.ticketManager.method35123();
      this.method7363();
      this.field9275.getProfiler().endStartSection("chunks");
      this.method7367();
      this.field9275.getProfiler().endStartSection("unload");
      this.field9279.method6546(var1);
      this.field9275.getProfiler().endSection();
      this.method7357();
   }

   private void method7367() {
      long var3 = this.field9275.getGameTime();
      long var5 = var3 - this.field9281;
      this.field9281 = var3;
      Class6612 var7 = this.field9275.getWorldInfo();
      boolean var8 = this.field9275.isDebug();
      boolean var9 = this.field9275.getGameRules().getBoolean(GameRules.field24226);
      if (!var8) {
         this.field9275.getProfiler().startSection("pollingChunks");
         int var10 = this.field9275.getGameRules().method17136(GameRules.field24235);
         boolean var11 = var7.getGameTime() % 400L == 0L;
         this.field9275.getProfiler().startSection("naturalSpawnCount");
         int var12 = this.ticketManager.method35138();
         Class7307 var13 = Class8170.method28415(var12, this.field9275.method6965(), this::method7368);
         this.field9287 = var13;
         this.field9275.getProfiler().endSection();
         List<Class8641> var14 = Lists.newArrayList(this.field9279.method6567());
         Collections.shuffle(var14);
         var14.forEach(var7x -> {
            Optional<Chunk> var10x = var7x.method31040().getNow(Class8641.field38895).left();
            if (var10x.isPresent()) {
               this.field9275.getProfiler().startSection("broadcast");
               var7x.method31049(var10x.get());
               this.field9275.getProfiler().endSection();
               Optional<Chunk> var11x = var7x.method31041().getNow(Class8641.field38895).left();
               if (var11x.isPresent()) {
                  Chunk var12x = var11x.get();
                  ChunkPos var13x = var7x.method31056();
                  if (!this.field9279.method6571(var13x)) {
                     var12x.setInhabitedTime(var12x.getInhabitedTime() + var5);
                     if (var9 && (this.field9282 || this.field9283) && this.field9275.getWorldBorder().method24524(var12x.getPos())) {
                        Class8170.method28417(this.field9275, var12x, var13, this.field9283, this.field9282, var11);
                     }

                     this.field9275.method6899(var12x, var10);
                  }
               }
            }
         });
         this.field9275.getProfiler().startSection("customSpawners");
         if (var9) {
            this.field9275.method6897(this.field9282, this.field9283);
         }

         this.field9275.getProfiler().endSection();
         this.field9275.getProfiler().endSection();
      }

      this.field9279.method6579();
   }

   private void method7368(long var1, Consumer<Chunk> var3) {
      Class8641 var6 = this.method7354(var1);
      if (var6 != null) {
         var6.method31042().getNow(Class8641.field38895).left().ifPresent(var3);
      }
   }

   @Override
   public String makeString() {
      return "ServerChunkCache: " + this.method7371();
   }

   @VisibleForTesting
   public int method7369() {
      return this.field9278.method1630();
   }

   public ChunkGenerator getChunkGenerator() {
      return this.field9274;
   }

   public int method7371() {
      return this.field9279.method6565();
   }

   public void method7372(BlockPos var1) {
      int var4 = var1.getX() >> 4;
      int var5 = var1.getZ() >> 4;
      Class8641 var6 = this.method7354(ChunkPos.asLong(var4, var5));
      if (var6 != null) {
         var6.method31047(var1);
      }
   }

   @Override
   public void markLightChanged(LightType var1, SectionPos var2) {
      this.field9278.execute(() -> {
         Class8641 var5 = this.method7354(var2.method8423().asLong());
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
      this.field9279.method6575(var1);
   }

   public void method7377(Entity var1) {
      this.field9279.method6578(var1);
   }

   public void method7378(Entity var1) {
      this.field9279.method6577(var1);
   }

   public void sendToAllTracking(Entity var1, IPacket<?> var2) {
      this.field9279.method6581(var1, var2);
   }

   public void sendToTrackingAndSelf(Entity var1, IPacket<?> var2) {
      this.field9279.method6580(var1, var2);
   }

   public void method7381(int var1) {
      this.field9279.method6563(var1);
   }

   @Override
   public void method7349(boolean var1, boolean var2) {
      this.field9282 = var1;
      this.field9283 = var2;
   }

   public String method7382(ChunkPos var1) {
      return this.field9279.method6541(var1);
   }

   public DimensionSavedDataManager getSavedData() {
      return this.field9280;
   }

   public Class1653 method7384() {
      return this.field9279.method6583();
   }

   @Nullable
   public Class7307 method7385() {
      return this.field9287;
   }

   // $VF: synthetic method
   public static Thread method7394(ServerChunkProvider var0) {
      return var0.field9276;
   }

   // $VF: synthetic method
   public static ServerWorld method7395(ServerChunkProvider var0) {
      return var0.field9275;
   }

   // $VF: synthetic method
   public static boolean method7396(ServerChunkProvider var0) {
      return var0.method7363();
   }

   // $VF: synthetic method
   public static Class195 method7397(ServerChunkProvider var0) {
      return var0.field9277;
   }
}
