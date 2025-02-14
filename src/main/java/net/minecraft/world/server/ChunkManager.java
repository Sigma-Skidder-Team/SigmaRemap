package net.minecraft.world.server;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import mapped.*;
import net.minecraft.crash.ReportedException;
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.chunk.storage.ChunkSerializer;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.storage.DimensionSavedDataManager;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChunkManager extends Class1648 implements Class1650 {
   private static final Logger field8950 = LogManager.getLogger();
   public static final int MAX_LOADED_LEVEL = 33 + ChunkStatus.maxDistance();
   private final Long2ObjectLinkedOpenHashMap<ChunkHolder> field8952 = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<ChunkHolder> field8953 = this.field8952.clone();
   private final Long2ObjectLinkedOpenHashMap<ChunkHolder> field8954 = new Long2ObjectLinkedOpenHashMap();
   private final LongSet field8955 = new LongOpenHashSet();
   private final ServerWorld world;
   private final ServerWorldLightManager lightManager;
   private final Class318<Runnable> field8958;
   private final ChunkGenerator field8959;
   private final Supplier<DimensionSavedDataManager> field8960;
   private final PointOfInterestManager pointOfInterestManager;
   private final LongSet field8962 = new LongOpenHashSet();
   private boolean field8963;
   private final ChunkTaskPriorityQueueSorter field8964;
   private final Class321<ChunkTaskPriorityQueueSorter.FunctionEntry<Runnable>> field8965;
   private final Class321<ChunkTaskPriorityQueueSorter.FunctionEntry<Runnable>> field_219265_s;
   private final IChunkStatusListener iChunkStatusListener;
   private final Class9306 field8968;
   private final AtomicInteger field_219268_v = new AtomicInteger();
   private final TemplateManager templateManager;
   private final File field8971;
   private final Class6858 field8972 = new Class6858();
   private final Int2ObjectMap<Class8998> field8973 = new Int2ObjectOpenHashMap();
   private final Long2ByteMap field8974 = new Long2ByteOpenHashMap();
   private final Queue<Runnable> field8975 = Queues.newConcurrentLinkedQueue();
   private int field8976;

   public ChunkManager(
      ServerWorld var1,
      SaveFormat.LevelSave var2,
      DataFixer var3,
      TemplateManager var4,
      Executor var5,
      Class318<Runnable> var6,
      IChunkLightProvider var7,
      ChunkGenerator var8,
      IChunkStatusListener var9,
      Supplier<DimensionSavedDataManager> var10,
      int var11,
      boolean var12
   ) {
      super(new File(var2.method7992(var1.getDimensionKey()), "region"), var3, var12);
      this.templateManager = var4;
      this.field8971 = var2.method7992(var1.getDimensionKey());
      this.world = var1;
      this.field8959 = var8;
      this.field8958 = var6;
      DelegatedTaskExecutor var15 = DelegatedTaskExecutor.method1650(var5, "worldgen");
      Class321 var16 = Class321.method1648("main", var6::enqueue);
      this.iChunkStatusListener = var9;
      DelegatedTaskExecutor var17 = DelegatedTaskExecutor.method1650(var5, "light");
      this.field8964 = new ChunkTaskPriorityQueueSorter(ImmutableList.of(var15, var16, var17), var5, Integer.MAX_VALUE);
      this.field8965 = this.field8964.<Runnable>method7963(var15, false);
      this.field_219265_s = this.field8964.<Runnable>method7963(var16, false);
      this.lightManager = new ServerWorldLightManager(var7, this, this.world.getDimensionType().hasSkyLight(), var17, this.field8964.<Runnable>method7963(var17, false));
      this.field8968 = new Class9306(this, var5, var6);
      this.field8960 = var10;
      this.pointOfInterestManager = new PointOfInterestManager(new File(this.field8971, "poi"), var3, var12);
      this.method6563(var11);
   }

   private static double method6534(ChunkPos var0, Entity var1) {
      double var4 = (double)(var0.x * 16 + 8);
      double var6 = (double)(var0.z * 16 + 8);
      double var8 = var4 - var1.getPosX();
      double var10 = var6 - var1.getPosZ();
      return var8 * var8 + var10 * var10;
   }

   private static int method6535(ChunkPos var0, ServerPlayerEntity var1, boolean var2) {
      int var5;
      int var6;
      if (!var2) {
         var5 = MathHelper.floor(var1.getPosX() / 16.0);
         var6 = MathHelper.floor(var1.getPosZ() / 16.0);
      } else {
         SectionPos var7 = var1.method2832();
         var5 = var7.getSectionX();
         var6 = var7.getSectionZ();
      }

      return method6536(var0, var5, var6);
   }

   private static int method6536(ChunkPos var0, int var1, int var2) {
      int var5 = var0.x - var1;
      int var6 = var0.z - var2;
      return Math.max(Math.abs(var5), Math.abs(var6));
   }

   public ServerWorldLightManager getLightManager() {
      return this.lightManager;
   }

   @Nullable
   public ChunkHolder func_219220_a(long var1) {
      return (ChunkHolder)this.field8952.get(var1);
   }

   @Nullable
   public ChunkHolder method6539(long var1) {
      return (ChunkHolder)this.field8953.get(var1);
   }

   public IntSupplier method6540(long var1) {
      return () -> {
         ChunkHolder var5 = this.method6539(var1);
         return var5 != null ? Math.min(var5.func_219281_j(), Class8572.field38532 - 1) : Class8572.field38532 - 1;
      };
   }

   public String method6541(ChunkPos var1) {
      ChunkHolder var4 = this.method6539(var1.asLong());
      if (var4 != null) {
         String var5 = var4.method31057() + "\n";
         ChunkStatus var6 = var4.method31044();
         IChunk var7 = var4.method31045();
         if (var6 != null) {
            var5 = var5 + "St: §" + var6.ordinal() + var6 + '§' + "r\n";
         }

         if (var7 != null) {
            var5 = var5 + "Ch: §" + var7.getStatus().ordinal() + var7.getStatus() + '§' + "r\n";
         }

         ChunkHolderLocationType var8 = var4.method31055();
         var5 = var5 + "§" + var8.ordinal() + var8;
         return var5 + '§' + "r";
      } else {
         return "null";
      }
   }

   private CompletableFuture<Either<List<IChunk>, ChunkHolder.IChunkLoadingError>> func_219236_a(ChunkPos pos, int p_219236_2_, IntFunction<ChunkStatus> p_219236_3_) {
      List<CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>>> list = Lists.newArrayList();
      int i = pos.x;
      int j = pos.z;

      for (int k = -p_219236_2_; k <= p_219236_2_; k++) {
         for (int l = -p_219236_2_; l <= p_219236_2_; l++) {
            int i1 = Math.max(Math.abs(l), Math.abs(k));
            final ChunkPos chunkpos = new ChunkPos(i + l, j + k);
            long j1 = chunkpos.asLong();
            ChunkHolder chunkholder = this.func_219220_a(j1);
            if (chunkholder == null)
            {
               return CompletableFuture.completedFuture(Either.right(new ChunkHolder.IChunkLoadingError()
               {
                  public String toString()
                  {
                     return "Unloaded " + chunkpos.toString();
                  }
               }));
            }

            ChunkStatus chunkstatus = p_219236_3_.apply(i1);
            CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> completablefuture = chunkholder.func_219276_a(chunkstatus, this);
            list.add(completablefuture);
         }
      }

      CompletableFuture<List<Either<IChunk, ChunkHolder.IChunkLoadingError>>> completablefuture1 = Util.gather(list);

      return completablefuture1.thenApply((p_lambda$func_219236_a$1_4_) ->
      {
         List<IChunk> list1 = Lists.newArrayList();
         int k1 = 0;

         for (final Either<IChunk, ChunkHolder.IChunkLoadingError> either : p_lambda$func_219236_a$1_4_) {
            Optional<IChunk> optional = either.left();

            if (!optional.isPresent())
            {
               final int l1 = k1;
               return Either.right(new ChunkHolder.IChunkLoadingError()
               {
                  public String toString()
                  {
                     return "Unloaded " + new ChunkPos(i + l1 % (p_219236_2_ * 2 + 1), j + l1 / (p_219236_2_ * 2 + 1)) + " " + either.right().get().toString();
                  }
               });
            }

            list1.add(optional.get());
            ++k1;
         }

         return Either.left(list1);
      });
   }

   public CompletableFuture<Either<Chunk, ChunkHolder.IChunkLoadingError>> func_219188_b(ChunkPos var1) {
      return this.func_219236_a(var1, 2, var0 -> ChunkStatus.FULL)
         .thenApplyAsync(var0 -> var0.mapLeft(var0x -> (Chunk)var0x.get(var0x.size() / 2)), this.field8958);
   }

   @Nullable
   private ChunkHolder method6544(long var1, int var3, ChunkHolder var4, int var5) {
      if (var5 > MAX_LOADED_LEVEL && var3 > MAX_LOADED_LEVEL) {
         return var4;
      } else {
         if (var4 != null) {
            var4.method31060(var3);
         }

         if (var4 != null) {
            if (var3 <= MAX_LOADED_LEVEL) {
               this.field8962.remove(var1);
            } else {
               this.field8962.add(var1);
            }
         }

         if (var3 <= MAX_LOADED_LEVEL && var4 == null) {
            var4 = (ChunkHolder)this.field8954.remove(var1);
            if (var4 == null) {
               var4 = new ChunkHolder(new ChunkPos(var1), var3, this.lightManager, this.field8964, this);
            } else {
               var4.method31060(var3);
            }

            this.field8952.put(var1, var4);
            this.field8963 = true;
         }

         return var4;
      }
   }

   @Override
   public void close() throws IOException {
      try {
         this.field8964.close();
         this.pointOfInterestManager.close();
      } finally {
         super.close();
      }
   }

   public void method6545(boolean var1) {
      if (!var1) {
         this.field8953.values().stream().filter(ChunkHolder::method31064).forEach(var1x -> {
            IChunk var4x = var1x.method31046().getNow((IChunk)null);
            if (var4x instanceof Class1673 || var4x instanceof Chunk) {
               this.chunkSave(var4x);
               var1x.method31065();
            }
         });
      } else {
         List<ChunkHolder> var4 = this.field8953.values().stream().filter(ChunkHolder::method31064).peek(ChunkHolder::method31065).collect(Collectors.toList());
         MutableBoolean var5 = new MutableBoolean();

         do {
            var5.setFalse();
            var4.stream().map(var1x -> {
               CompletableFuture var4x;
               do {
                  var4x = var1x.method31046();
                  this.field8958.driveUntil(var4x::isDone);
               } while (var4x != var1x.method31046());

               return (IChunk)var4x.join();
            }).filter(var0 -> var0 instanceof Class1673 || var0 instanceof Chunk).filter(this::chunkSave).forEach(var1x -> var5.setTrue());
         } while (var5.isTrue());

         this.method6547(() -> true);
         this.method6533();
         field8950.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.field8971.getName());
      }
   }

   public void method6546(BooleanSupplier var1) {
      IProfiler var4 = this.world.getProfiler();
      var4.startSection("poi");
      this.pointOfInterestManager.tick(var1);
      var4.endStartSection("chunk_unload");
      if (!this.world.method6819()) {
         this.method6547(var1);
      }

      var4.endSection();
   }

   private void method6547(BooleanSupplier var1) {
      LongIterator var4 = this.field8962.iterator();

      for (int var5 = 0; var4.hasNext() && (var1.getAsBoolean() || var5 < 200 || this.field8962.size() > 2000); var4.remove()) {
         long var6 = var4.nextLong();
         ChunkHolder var8 = (ChunkHolder)this.field8952.remove(var6);
         if (var8 != null) {
            this.field8954.put(var6, var8);
            this.field8963 = true;
            var5++;
            this.method6548(var6, var8);
         }
      }

      Runnable var9;
      while ((var1.getAsBoolean() || this.field8975.size() > 2000) && (var9 = this.field8975.poll()) != null) {
         var9.run();
      }
   }

   private void method6548(long var1, ChunkHolder var3) {
      CompletableFuture<IChunk> var6 = var3.method31046();
      var6.thenAcceptAsync(var5 -> {
         CompletableFuture<IChunk> var8 = var3.method31046();
         if (var8 == var6) {
            if (this.field8954.remove(var1, var3) && var5 != null) {
               if (var5 instanceof Chunk) {
                  ((Chunk)var5).setLoaded(false);
                  if (Reflector.ChunkEvent_Unload_Constructor.exists()) {
                     Reflector.postForgeBusEvent(Reflector.ChunkEvent_Unload_Constructor, var5);
                  }
               }

               this.chunkSave(var5);
               if (this.field8955.remove(var1) && var5 instanceof Chunk) {
                  Chunk var9 = (Chunk)var5;
                  this.world.method6929(var9);
               }

               this.lightManager.method603(var5.getPos());
               this.lightManager.method611();
               this.iChunkStatusListener.statusChanged(var5.getPos(), (ChunkStatus)null);
            }
         } else {
            this.method6548(var1, var3);
         }
      }, this.field8975::add).whenComplete((var1x, var2) -> {
         if (var2 != null) {
            field8950.error("Failed to save chunk " + var3.getPosition(), var2);
         }
      });
   }

   public boolean method6549() {
      if (this.field8963) {
         this.field8953 = this.field8952.clone();
         this.field8963 = false;
         return true;
      } else {
         return false;
      }
   }

   public CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> func_219244_a(ChunkHolder var1, ChunkStatus var2) {
      ChunkPos var5 = var1.getPosition();
      if (var2 != ChunkStatus.EMPTY) {
         CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> var6 = var1.func_219276_a(var2.method34299(), this);
         return var6.<Either<IChunk, ChunkHolder.IChunkLoadingError>>thenComposeAsync(var4 -> {
            Optional var7 = var4.left();
            if (var7.isPresent()) {
               if (var2 == ChunkStatus.LIGHT) {
                  this.field8968.registerWithLevel(TicketType.LIGHT, var5, 33 + ChunkStatus.getDistance(ChunkStatus.FEATURES), var5);
               }

               IChunk var8 = (IChunk)var7.get();
               if (!var8.getStatus().isAtLeast(var2)) {
                  return this.chunkGenerate(var1, var2);
               } else {
                  CompletableFuture varcompletablefuture19;
                  if (var2 != ChunkStatus.LIGHT) {
                     varcompletablefuture19 = var2.doLoadingWork(this.world, this.templateManager, this.lightManager, var2xx -> this.method6557(var1), var8);
                  } else {
                     varcompletablefuture19 = this.chunkGenerate(var1, var2);
                  }

                  this.iChunkStatusListener.statusChanged(var5, var2);
                  return varcompletablefuture19;
               }
            } else {
               return CompletableFuture.<Either<IChunk, ChunkHolder.IChunkLoadingError>>completedFuture((Either<IChunk, ChunkHolder.IChunkLoadingError>)var4);
            }
         }, this.field8958);
      } else {
         return this.method6551(var5);
      }
   }

   private CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> method6551(ChunkPos var1) {
      return CompletableFuture.<Either<IChunk, ChunkHolder.IChunkLoadingError>>supplyAsync(() -> {
         try {
            this.world.getProfiler().func_230035_c_("chunkLoad");
            CompoundNBT var4 = this.loadChunkData(var1);
            if (var4 != null) {
               boolean var9 = var4.contains("Level", 10) && var4.getCompound("Level").contains("Status", 8);
               if (var9) {
                  ChunkPrimer var6 = ChunkSerializer.read(this.world, this.templateManager, this.pointOfInterestManager, var1, var4);
                  var6.setLastSaveTime(this.world.getGameTime());
                  this.func_241088_a_(var1, var6.getStatus().method34303());
                  return Either.left(var6);
               }

               field8950.error("Chunk file at {} is missing level data, skipping", var1);
            }
         } catch (ReportedException var7) {
            Throwable var5 = var7.getCause();
            if (!(var5 instanceof IOException)) {
               this.func_241089_g_(var1);
               throw var7;
            }

            field8950.error("Couldn't load chunk {}", var1, var5);
         } catch (Exception var8) {
            field8950.error("Couldn't load chunk {}", var1, var8);
         }

         this.func_241089_g_(var1);
         return Either.left(new ChunkPrimer(var1, UpgradeData.field40388));
      }, this.field8958);
   }

   private void func_241089_g_(ChunkPos var1) {
      this.field8974.put(var1.asLong(), (byte)-1);
   }

   private byte func_241088_a_(ChunkPos var1, Class2076 var2) {
      return this.field8974.put(var1.asLong(), (byte)(var2 != Class2076.field13524 ? 1 : -1));
   }

   private CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> chunkGenerate(ChunkHolder var1, ChunkStatus var2) {
      ChunkPos var5 = var1.getPosition();
      CompletableFuture<Either<List<IChunk>, ChunkHolder.IChunkLoadingError>> var6 = this.func_219236_a(var5, var2.method34302(), var2x -> this.method6556(var2, var2x));
      this.world.getProfiler().method22509(() -> "chunkGenerate " + var2.method34298());
      return var6.thenComposeAsync(
         var4 -> (CompletionStage<Either<IChunk, ChunkHolder.IChunkLoadingError>>)var4.map(
               var4x -> {
                  try {
                     CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> var7 = var2.method34300(
                        this.world, this.field8959, this.templateManager, this.lightManager, var2xxx -> this.method6557(var1), var4x
                     );
                     this.iChunkStatusListener.statusChanged(var5, var2);
                     return var7;
                  } catch (Exception var10) {
                     CrashReport var8 = CrashReport.makeCrashReport(var10, "Exception generating new chunk");
                     CrashReportCategory var9 = var8.makeCategory("Chunk to be generated");
                     var9.addDetail("Location", String.format("%d,%d", var5.x, var5.z));
                     var9.addDetail("Position hash", ChunkPos.asLong(var5.x, var5.z));
                     var9.addDetail("Generator", this.field8959);
                     throw new ReportedException(var8);
                  }
               },
               var2xx -> {
                  this.method6555(var5);
                  return CompletableFuture.<Either>completedFuture(Either.right(var2xx));
               }
            ),
         var2x -> this.field8965.enqueue(ChunkTaskPriorityQueueSorter.func_219081_a(var1, var2x))
      );
   }

   public void method6555(ChunkPos var1) {
      this.field8958
         .enqueue(
            Util.namedRunnable(
               () -> this.field8968.releaseWithLevel(TicketType.LIGHT, var1, 33 + ChunkStatus.getDistance(ChunkStatus.FEATURES), var1),
               () -> "release light ticket " + var1
            )
         );
   }

   private ChunkStatus method6556(ChunkStatus var1, int var2) {
      ChunkStatus var5;
      if (var2 != 0) {
         var5 = ChunkStatus.method34294(ChunkStatus.getDistance(var1) + var2);
      } else {
         var5 = var1.method34299();
      }

      return var5;
   }

   private CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> method6557(ChunkHolder var1) {
      CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> var4 = var1.method31038(ChunkStatus.FULL.method34299());
      return var4.thenApplyAsync(var2 -> {
         ChunkStatus var5 = ChunkHolder.getChunkStatusFromLevel(var1.method31057());
         return var5.isAtLeast(ChunkStatus.FULL) ? var2.mapLeft(var2x -> {
            ChunkPos var5x = var1.getPosition();
            Chunk var6;
            if (!(var2x instanceof Class1673)) {
               var6 = new Chunk(this.world, (ChunkPrimer)var2x);
               var1.method31066(new Class1673(var6));
            } else {
               var6 = ((Class1673)var2x).method7127();
            }

            var6.method7153(() -> ChunkHolder.getLocationTypeFromLevel(var1.method31057()));
            var6.method7136();
            if (this.field8955.add(var5x.asLong())) {
               var6.setLoaded(true);
               this.world.method6752(var6.getTileEntityMap().values());
              List<Entity> var7 = null;
               Class51<Entity>[] var8 = var6.method7146();

                for (Class51<Entity> entities : var8) {
                    for (Entity var12 : entities) {
                        if (!(var12 instanceof PlayerEntity) && !this.world.method6925(var12)) {
                            if (var7 != null) {
                                var7.add(var12);
                            } else {
                                var7 = Lists.newArrayList(var12);
                            }
                        }
                    }
                }

               if (var7 != null) {
                  var7.forEach(var6::removeEntity);
               }

               if (Reflector.ChunkEvent_Load_Constructor.exists()) {
                  Reflector.postForgeBusEvent(Reflector.ChunkEvent_Load_Constructor, var6);
               }
            }

            return var6;
         }) : ChunkHolder.field38893;
      }, var2 -> this.field_219265_s.enqueue(ChunkTaskPriorityQueueSorter.func_219069_a(var2, var1.getPosition().asLong(), var1::method31057)));
   }

   public CompletableFuture<Either<Chunk, ChunkHolder.IChunkLoadingError>> func_219179_a(ChunkHolder var1) {
      ChunkPos var4 = var1.getPosition();
      CompletableFuture<Either<List<IChunk>, ChunkHolder.IChunkLoadingError>> completablefuture = this.func_219236_a(var4, 1, var0 -> ChunkStatus.FULL);
      CompletableFuture<Either<Chunk, ChunkHolder.IChunkLoadingError>> completablefuture1 = completablefuture.thenApplyAsync(var0 -> var0.flatMap(p_lambda$null$29_0_ -> {
            System.out.println("wow");
            Chunk var3 = (Chunk)p_lambda$null$29_0_.get(p_lambda$null$29_0_.size() / 2);
            var3.postProcess();
            return Either.left(var3);
         }), var2 -> this.field_219265_s.enqueue(ChunkTaskPriorityQueueSorter.func_219081_a(var1, var2)));
      completablefuture1.thenAcceptAsync(var2 -> var2.mapLeft(var2x -> {
         System.out.println("incrementing loaded chunk count: " + this.field_219268_v.get() + "+1");
            this.field_219268_v.getAndIncrement();
            IPacket<?>[] ipacket = new IPacket[2];
            this.getTrackingPlayers(var4, false).forEach(var3 -> this.sendChunkData(var3, ipacket, var2x));
            return Either.left(var2x);
         }), var2 -> this.field_219265_s.enqueue(ChunkTaskPriorityQueueSorter.func_219081_a(var1, var2)));
      return completablefuture1;
   }

   public CompletableFuture<Either<Chunk, ChunkHolder.IChunkLoadingError>> method6559(ChunkHolder var1) {
      return var1.func_219276_a(ChunkStatus.FULL, this).<Either<Chunk, ChunkHolder.IChunkLoadingError>>thenApplyAsync(var0 -> var0.mapLeft(var0x -> {
            Chunk var3 = (Chunk)var0x;
            var3.method7150();
            return var3;
         }), var2 -> this.field_219265_s.enqueue(ChunkTaskPriorityQueueSorter.func_219081_a(var1, var2)));
   }

   public int func_219174_c() {
      return this.field_219268_v.get();
   }

   private boolean chunkSave(IChunk var1) {
      this.pointOfInterestManager.saveIfDirty(var1.getPos());
      if (!var1.isModified()) {
         return false;
      } else {
         var1.setLastSaveTime(this.world.getGameTime());
         var1.setModified(false);
         ChunkPos var4 = var1.getPos();

         try {
            ChunkStatus var5 = var1.getStatus();
            if (var5.method34303() != Class2076.field13525) {
               if (this.func_241090_h_(var4)) {
                  return false;
               }

               if (var5 == ChunkStatus.EMPTY && var1.getStructureStarts().values().stream().noneMatch(StructureStart::method17117)) {
                  return false;
               }
            }

            this.world.getProfiler().func_230035_c_("chunkSave");
            CompoundNBT var6 = ChunkSerializer.method38088(this.world, var1);
            if (Reflector.field42773.exists()) {
               World var7 = (World) Reflector.call(var1, Reflector.field42908);
               Reflector.postForgeBusEvent(Reflector.field42773, var1, var7 != null ? var7 : this.world, var6);
            }

            this.method6532(var4, var6);
            this.func_241088_a_(var4, var5.method34303());
            return true;
         } catch (Exception var8) {
            field8950.error("Failed to save chunk {},{}", var4.x, var4.z, var8);
            return false;
         }
      }
   }

   private boolean func_241090_h_(ChunkPos var1) {
      byte b0 = this.field8974.get(var1.asLong());
      if (b0 != 0) {
         return b0 == 1;
      } else {
         CompoundNBT compoundnbt;
         try {
            compoundnbt = this.loadChunkData(var1);
            if (compoundnbt == null) {
               this.func_241089_g_(var1);
               return false;
            }
         } catch (Exception var7) {
            field8950.error("Failed to read chunk {}", var1, var7);
            this.func_241089_g_(var1);
            return false;
         }

         Class2076 var6 = ChunkSerializer.getChunkStatus(compoundnbt);
         return this.func_241088_a_(var1, var6) == 1;
      }
   }

   public void method6563(int var1) {
      int var4 = MathHelper.clamp(var1 + 1, 3, 64);
      if (var4 != this.field8976) {
         int var5 = this.field8976;
         this.field8976 = var4;
         this.field8968.method35137(this.field8976);
         ObjectIterator var6 = this.field8952.values().iterator();

         while (var6.hasNext()) {
            ChunkHolder var7 = (ChunkHolder)var6.next();
            ChunkPos var8 = var7.getPosition();
            IPacket[] var9 = new IPacket[2];
            this.getTrackingPlayers(var8, false).forEach(var4x -> {
               int var7x = method6535(var8, var4x, true);
               boolean var8x = var7x <= var5;
               boolean var9x = var7x <= this.field8976;
               this.method6564(var4x, var8, var9, var8x, var9x);
            });
         }
      }
   }

   public void method6564(ServerPlayerEntity var1, ChunkPos var2, IPacket<?>[] var3, boolean var4, boolean var5) {
      if (var1.world == this.world) {
         if (Reflector.field42845.exists()) {
            Reflector.field42845.call(var4, var5, var1, var2, this.world);
         }

         if (var5 && !var4) {
            ChunkHolder var8 = this.method6539(var2.asLong());
            if (var8 != null) {
               Chunk var9 = var8.method31043();
               if (var9 != null) {
                  this.sendChunkData(var1, var3, var9);
               }

               DebugPacketSender.method23612(this.world, var2);
            }
         }

         if (!var5 && var4) {
            var1.method2831(var2);
         }
      }
   }

   public int method6565() {
      return this.field8953.size();
   }

   public Class9306 getTicketManager() {
      return this.field8968;
   }

   public Iterable<ChunkHolder> method6567() {
      return Iterables.unmodifiableIterable(this.field8953.values());
   }

   public void method6568(Writer var1) throws IOException {
      Class9101 var4 = Class9101.method33937()
         .method37003("x")
         .method37003("z")
         .method37003("level")
         .method37003("in_memory")
         .method37003("status")
         .method37003("full_status")
         .method37003("accessible_ready")
         .method37003("ticking_ready")
         .method37003("entity_ticking_ready")
         .method37003("ticket")
         .method37003("spawning")
         .method37003("entity_count")
         .method37003("block_entity_count")
         .method37004(var1);

       for (Entry<ChunkHolder> var6 : this.field8953.long2ObjectEntrySet()) {
           ChunkPos var7 = new ChunkPos(var6.getLongKey());
           ChunkHolder var8 = var6.getValue();
           Optional<IChunk> var9 = Optional.ofNullable(var8.method31045());
           Optional<Chunk> var10 = var9.flatMap(var0 -> !(var0 instanceof Chunk) ? Optional.empty() : Optional.of((Chunk) var0));
           var4.method33938(
                   var7.x,
                   var7.z,
                   var8.method31057(),
                   var9.isPresent(),
                   var9.map(IChunk::getStatus).orElse(null),
                   var10.map(Chunk::getLocationType).orElse(null),
                   method6569(var8.method31042()),
                   method6569(var8.method31040()),
                   method6569(var8.method31041()),
                   this.field8968.method35136(var6.getLongKey()),
                   !this.method6571(var7),
                   var10.<Integer>map(var0 -> Stream.<Class51<Entity>>of(var0.method7146()).mapToInt(Class51::size).sum()).orElse(0),
                   var10.<Integer>map(var0 -> var0.getTileEntityMap().size()).orElse(0)
           );
       }
   }

   private static String method6569(CompletableFuture<Either<Chunk, ChunkHolder.IChunkLoadingError>> var0) {
      try {
         Either var3 = (Either)var0.getNow((Either)null);
         return var3 != null ? (String)var3.map(var0x -> "done", var0x -> "unloaded") : "not completed";
      } catch (CompletionException var4) {
         return "failed " + var4.getCause().getMessage();
      } catch (CancellationException var5) {
         return "cancelled";
      }
   }

   @Nullable
   private CompoundNBT loadChunkData(ChunkPos var1) throws IOException {
      CompoundNBT var4 = this.method6531(var1);
      return var4 != null ? this.method6529(this.world.getDimensionKey(), this.field8960, var4) : null;
   }

   public boolean method6571(ChunkPos var1) {
      long var4 = var1.asLong();
      return this.field8968.method35139(var4)
         ? this.field8972.method20896(var4).noneMatch(var1x -> !var1x.isSpectator() && method6534(var1, var1x) < 16384.0)
         : true;
   }

   private boolean method6572(ServerPlayerEntity var1) {
      return var1.isSpectator() && !this.world.getGameRules().getBoolean(GameRules.field24238);
   }

   public void method6573(ServerPlayerEntity var1, boolean var2) {
      boolean var5 = this.method6572(var1);
      boolean var6 = this.field8972.method20901(var1);
      int var7 = MathHelper.floor(var1.getPosX()) >> 4;
      int var8 = MathHelper.floor(var1.getPosZ()) >> 4;
      if (!var2) {
         SectionPos var9 = var1.method2832();
         this.field8972.method20898(var9.asChunkPos().asLong(), var1);
         if (!var6) {
            this.field8968.method35135(var9, var1);
         }
      } else {
         this.field8972.method20897(ChunkPos.asLong(var7, var8), var1, var5);
         this.method6574(var1);
         if (!var5) {
            this.field8968.method35134(SectionPos.method8392(var1), var1);
         }
      }

      for (int var12 = var7 - this.field8976; var12 <= var7 + this.field8976; var12++) {
         for (int var10 = var8 - this.field8976; var10 <= var8 + this.field8976; var10++) {
            ChunkPos var11 = new ChunkPos(var12, var10);
            this.method6564(var1, var11, new IPacket[2], !var2, var2);
         }
      }
   }

   private SectionPos method6574(ServerPlayerEntity var1) {
      SectionPos var4 = SectionPos.method8392(var1);
      var1.method2833(var4);
      var1.connection.sendPacket(new SUpdateChunkPositionPacket(var4.getSectionX(), var4.getSectionZ()));
      return var4;
   }

   public void method6575(ServerPlayerEntity var1) {
      ObjectIterator var4 = this.field8973.values().iterator();

      while (var4.hasNext()) {
         Class8998 var5 = (Class8998)var4.next();
         if (Class8998.method33247(var5) != var1) {
            var5.method33243(var1);
         } else {
            var5.method33246(this.world.getPlayers());
         }
      }

      int var26 = MathHelper.floor(var1.getPosX()) >> 4;
      int var27 = MathHelper.floor(var1.getPosZ()) >> 4;
      SectionPos var6 = var1.method2832();
      SectionPos var7 = SectionPos.method8392(var1);
      long var8 = var6.asChunkPos().asLong();
      long var10 = var7.asChunkPos().asLong();
      boolean var12 = this.field8972.method20902(var1);
      boolean var13 = this.method6572(var1);
      boolean var14 = var6.asLong() != var7.asLong();
      if (var14 || var12 != var13) {
         this.method6574(var1);
         if (!var12) {
            this.field8968.method35135(var6, var1);
         }

         if (!var13) {
            this.field8968.method35134(var7, var1);
         }

         if (!var12 && var13) {
            this.field8972.method20899(var1);
         }

         if (var12 && !var13) {
            this.field8972.method20900(var1);
         }

         if (var8 != var10) {
            this.field8972.method20903(var8, var10, var1);
         }
      }

      int var15 = var6.getSectionX();
      int var16 = var6.getSectionZ();
      if (Math.abs(var15 - var26) <= this.field8976 * 2 && Math.abs(var16 - var27) <= this.field8976 * 2) {
         int var29 = Math.min(var26, var15) - this.field8976;
         int var31 = Math.min(var27, var16) - this.field8976;
         int var33 = Math.max(var26, var15) + this.field8976;
         int var35 = Math.max(var27, var16) + this.field8976;

         for (int var37 = var29; var37 <= var33; var37++) {
            for (int var22 = var31; var22 <= var35; var22++) {
               ChunkPos var23 = new ChunkPos(var37, var22);
               boolean var24 = method6536(var23, var15, var16) <= this.field8976;
               boolean var25 = method6536(var23, var26, var27) <= this.field8976;
               this.method6564(var1, var23, new IPacket[2], var24, var25);
            }
         }
      } else {
         for (int var17 = var15 - this.field8976; var17 <= var15 + this.field8976; var17++) {
            for (int var18 = var16 - this.field8976; var18 <= var16 + this.field8976; var18++) {
               ChunkPos var19 = new ChunkPos(var17, var18);
               boolean var20 = true;
               boolean var21 = false;
               this.method6564(var1, var19, new IPacket[2], true, false);
            }
         }

         for (int var28 = var26 - this.field8976; var28 <= var26 + this.field8976; var28++) {
            for (int var30 = var27 - this.field8976; var30 <= var27 + this.field8976; var30++) {
               ChunkPos var32 = new ChunkPos(var28, var30);
               boolean var34 = false;
               boolean var36 = true;
               this.method6564(var1, var32, new IPacket[2], false, true);
            }
         }
      }
   }

   @Override
   public Stream<ServerPlayerEntity> getTrackingPlayers(ChunkPos var1, boolean var2) {
      return this.field8972.method20896(var1.asLong()).filter(var3 -> {
         int var6 = method6535(var1, var3, true);
         return var6 > this.field8976 ? false : !var2 || var6 == this.field8976;
      });
   }

   public void method6577(Entity var1) {
      if (!(var1 instanceof EnderDragonPartEntity)) {
         EntityType var4 = var1.getType();
         int var5 = var4.method33225() * 16;
         int var6 = var4.method33226();
         if (this.field8973.containsKey(var1.getEntityId())) {
            throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("Entity is already tracked!"));
         }

         Class8998 var7 = new Class8998(this, var1, var5, var6, var4.method33227());
         this.field8973.put(var1.getEntityId(), var7);
         var7.method33246(this.world.getPlayers());
         if (var1 instanceof ServerPlayerEntity) {
            ServerPlayerEntity var8 = (ServerPlayerEntity)var1;
            this.method6573(var8, true);
            ObjectIterator var9 = this.field8973.values().iterator();

            while (var9.hasNext()) {
               Class8998 var10 = (Class8998)var9.next();
               if (Class8998.method33247(var10) != var8) {
                  var10.method33243(var8);
               }
            }
         }
      }
   }

   public void method6578(Entity var1) {
      if (var1 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var4 = (ServerPlayerEntity)var1;
         this.method6573(var4, false);
         ObjectIterator var5 = this.field8973.values().iterator();

         while (var5.hasNext()) {
            Class8998 var6 = (Class8998)var5.next();
            var6.method33242(var4);
         }
      }

      Class8998 var7 = (Class8998)this.field8973.remove(var1.getEntityId());
      if (var7 != null) {
         var7.method33241();
      }
   }

   public void method6579() {
      ArrayList var3 = Lists.newArrayList();
      List var4 = this.world.getPlayers();
      ObjectIterator var5 = this.field8973.values().iterator();

      while (var5.hasNext()) {
         Class8998 var6 = (Class8998)var5.next();
         SectionPos var7 = Class8998.method33248(var6);
         SectionPos var8 = SectionPos.method8392(Class8998.method33247(var6));
         if (!Objects.equals(var7, var8)) {
            var6.method33246(var4);
            Entity var9 = Class8998.method33247(var6);
            if (var9 instanceof ServerPlayerEntity) {
               var3.add((ServerPlayerEntity)var9);
            }

            Class8998.method33249(var6, var8);
         }

         Class8998.method33250(var6).method34969();
      }

      if (!var3.isEmpty()) {
         var5 = this.field8973.values().iterator();

         while (var5.hasNext()) {
            Class8998 var11 = (Class8998)var5.next();
            var11.method33246(var3);
         }
      }
   }

   public void method6580(Entity var1, IPacket<?> var2) {
      Class8998 var5 = (Class8998)this.field8973.get(var1.getEntityId());
      if (var5 != null) {
         var5.method33239(var2);
      }
   }

   public void method6581(Entity var1, IPacket<?> var2) {
      Class8998 var5 = (Class8998)this.field8973.get(var1.getEntityId());
      if (var5 != null) {
         var5.method33240(var2);
      }
   }

   private void sendChunkData(ServerPlayerEntity var1, IPacket<?>[] var2, Chunk var3) {
      if (var2[0] == null) {
         var2[0] = new SChunkDataPacket(var3, 65535);
         var2[1] = new SUpdateLightPacket(var3.getPos(), this.lightManager, true);
      }

      var1.method2830(var3.getPos(), var2[0], var2[1]);
      DebugPacketSender.method23612(this.world, var3.getPos());
      List<Entity> var6 = Lists.newArrayList();
      List<Entity> var7 = Lists.newArrayList();

       for (Class8998 var9 : this.field8973.values()) {
           Entity var10 = Class8998.method33247(var9);
           if (var10 != var1 && var10.chunkCoordX == var3.getPos().x && var10.chunkCoordZ == var3.getPos().z) {
               var9.method33243(var1);
               if (var10 instanceof MobEntity && ((MobEntity) var10).method4297() != null) {
                   var6.add(var10);
               }

               if (!var10.getPassengers().isEmpty()) {
                   var7.add(var10);
               }
           }
       }

      if (!var6.isEmpty()) {
         for (Entity var13 : var6) {
            var1.connection.sendPacket(new SMountEntityPacket(var13, ((MobEntity)var13).method4297()));
         }
      }

      if (!var7.isEmpty()) {
         for (Entity var14 : var7) {
            var1.connection.sendPacket(new SSetPassengersPacket(var14));
         }
      }
   }

   public PointOfInterestManager getPointOfInterestManager() {
      return this.pointOfInterestManager;
   }

   public CompletableFuture<Void> method6584(Chunk var1) {
      return this.field8958.method1634(() -> var1.method7151(this.world));
   }

   // $VF: synthetic method
   public static ServerWorld method6633(ChunkManager var0) {
      return var0.world;
   }

   // $VF: synthetic method
   public static int method6634(ChunkManager var0) {
      return var0.field8976;
   }

   // $VF: synthetic method
   public static int method6635(ChunkPos var0, ServerPlayerEntity var1, boolean var2) {
      return method6535(var0, var1, var2);
   }

   // $VF: synthetic method
   public static LongSet method6636(ChunkManager var0) {
      return var0.field8962;
   }

   // $VF: synthetic method
   public static ChunkHolder method6637(ChunkManager var0, long var1, int var3, ChunkHolder var4, int var5) {
      return var0.method6544(var1, var3, var4, var5);
   }
}
