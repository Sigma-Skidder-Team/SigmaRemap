package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
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

public class Class1649 extends Class1648 implements Class1650 {
   private static final Logger field8950 = LogManager.getLogger();
   public static final int field8951 = 33 + ChunkStatus.method34295();
   private final Long2ObjectLinkedOpenHashMap<Class8641> field8952 = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<Class8641> field8953 = this.field8952.clone();
   private final Long2ObjectLinkedOpenHashMap<Class8641> field8954 = new Long2ObjectLinkedOpenHashMap();
   private final LongSet field8955 = new LongOpenHashSet();
   private final ServerWorld field8956;
   private final Class195 field8957;
   private final Class318<Runnable> field8958;
   private final ChunkGenerator field8959;
   private final Supplier<Class8250> field8960;
   private final Class1653 field8961;
   private final LongSet field8962 = new LongOpenHashSet();
   private boolean field8963;
   private final Class1812 field8964;
   private final Class321<Class6875<Runnable>> field8965;
   private final Class321<Class6875<Runnable>> field8966;
   private final Class7243 field8967;
   private final Class9306 field8968;
   private final AtomicInteger field8969 = new AtomicInteger();
   private final Class8761 field8970;
   private final File field8971;
   private final Class6858 field8972 = new Class6858();
   private final Int2ObjectMap<Class8998> field8973 = new Int2ObjectOpenHashMap();
   private final Long2ByteMap field8974 = new Long2ByteOpenHashMap();
   private final Queue<Runnable> field8975 = Queues.newConcurrentLinkedQueue();
   private int field8976;

   public Class1649(
      ServerWorld var1,
      SaveFormat.LevelSave var2,
      DataFixer var3,
      Class8761 var4,
      Executor var5,
      Class318<Runnable> var6,
      Class1704 var7,
      ChunkGenerator var8,
      Class7243 var9,
      Supplier<Class8250> var10,
      int var11,
      boolean var12
   ) {
      super(new File(var2.method7992(var1.getDimensionKey()), "region"), var3, var12);
      this.field8970 = var4;
      this.field8971 = var2.method7992(var1.getDimensionKey());
      this.field8956 = var1;
      this.field8959 = var8;
      this.field8958 = var6;
      Class322 var15 = Class322.method1650(var5, "worldgen");
      Class321 var16 = Class321.method1648("main", var6::method1641);
      this.field8967 = var9;
      Class322 var17 = Class322.method1650(var5, "light");
      this.field8964 = new Class1812(ImmutableList.of(var15, var16, var17), var5, Integer.MAX_VALUE);
      this.field8965 = this.field8964.<Runnable>method7963(var15, false);
      this.field8966 = this.field8964.<Runnable>method7963(var16, false);
      this.field8957 = new Class195(var7, this, this.field8956.method6812().hasSkyLight(), var17, this.field8964.<Runnable>method7963(var17, false));
      this.field8968 = new Class9306(this, var5, var6);
      this.field8960 = var10;
      this.field8961 = new Class1653(new File(this.field8971, "poi"), var3, var12);
      this.method6563(var11);
   }

   private static double method6534(Class7481 var0, Entity var1) {
      double var4 = (double)(var0.field32174 * 16 + 8);
      double var6 = (double)(var0.field32175 * 16 + 8);
      double var8 = var4 - var1.getPosX();
      double var10 = var6 - var1.getPosZ();
      return var8 * var8 + var10 * var10;
   }

   private static int method6535(Class7481 var0, ServerPlayerEntity var1, boolean var2) {
      int var5;
      int var6;
      if (!var2) {
         var5 = MathHelper.floor(var1.getPosX() / 16.0);
         var6 = MathHelper.floor(var1.getPosZ() / 16.0);
      } else {
         Class2002 var7 = var1.method2832();
         var5 = var7.method8410();
         var6 = var7.method8412();
      }

      return method6536(var0, var5, var6);
   }

   private static int method6536(Class7481 var0, int var1, int var2) {
      int var5 = var0.field32174 - var1;
      int var6 = var0.field32175 - var2;
      return Math.max(Math.abs(var5), Math.abs(var6));
   }

   public Class195 method6537() {
      return this.field8957;
   }

   @Nullable
   public Class8641 method6538(long var1) {
      return (Class8641)this.field8952.get(var1);
   }

   @Nullable
   public Class8641 method6539(long var1) {
      return (Class8641)this.field8953.get(var1);
   }

   public IntSupplier method6540(long var1) {
      return () -> {
         Class8641 var5 = this.method6539(var1);
         return var5 != null ? Math.min(var5.method31058(), Class8572.field38532 - 1) : Class8572.field38532 - 1;
      };
   }

   public String method6541(Class7481 var1) {
      Class8641 var4 = this.method6539(var1.method24352());
      if (var4 != null) {
         String var5 = var4.method31057() + "\n";
         ChunkStatus var6 = var4.method31044();
         IChunk var7 = var4.method31045();
         if (var6 != null) {
            var5 = var5 + "St: §" + var6.method34297() + var6 + '§' + "r\n";
         }

         if (var7 != null) {
            var5 = var5 + "Ch: §" + var7.method7080().method34297() + var7.method7080() + '§' + "r\n";
         }

         ChunkHolderLocationType var8 = var4.method31055();
         var5 = var5 + "§" + var8.ordinal() + var8;
         return var5 + '§' + "r";
      } else {
         return "null";
      }
   }

   private CompletableFuture<Either<List<IChunk>, Class7022>> method6542(Class7481 var1, int var2, IntFunction<ChunkStatus> var3) {
      List<CompletableFuture<Either<IChunk, Class7022>>> var6 = Lists.newArrayList();
      int var7 = var1.field32174;
      int var8 = var1.field32175;

      for (int var9 = -var2; var9 <= var2; var9++) {
         for (int var10 = -var2; var10 <= var2; var10++) {
            int var11 = Math.max(Math.abs(var10), Math.abs(var9));
            Class7481 var12 = new Class7481(var7 + var10, var8 + var9);
            long var13 = var12.method24352();
            Class8641 var15 = this.method6538(var13);
            if (var15 == null) {
               return CompletableFuture.completedFuture(Either.right(new Class7021(this, var12)));
            }

            ChunkStatus var16 = var3.apply(var11);
            CompletableFuture<Either<IChunk, Class7022>> var17 = var15.method31053(var16, this);
            var6.add(var17);
         }
      }

      CompletableFuture<List<Either<IChunk, Class7022>>> var18 = Util.gather(var6);

      return var18.thenApply(var4 -> {
         List var7x = Lists.newArrayList();
         int var8x = 0;

         for (Either var10x : var4) {
            Optional var11x = var10x.left();
            if (!var11x.isPresent()) {
               return Either.right(new Class7025(this, var7, var8x, var2, var8, var10x));
            }

            var7x.add(var11x.get());
            var8x++;
         }

         return Either.left(var7x);
      });
   }

   public CompletableFuture<Either<Chunk, Class7022>> method6543(Class7481 var1) {
      return this.method6542(var1, 2, var0 -> ChunkStatus.FULL)
         .<Either<Chunk, Class7022>>thenApplyAsync(var0 -> var0.mapLeft(var0x -> (Chunk)var0x.get(var0x.size() / 2)), this.field8958);
   }

   @Nullable
   private Class8641 method6544(long var1, int var3, Class8641 var4, int var5) {
      if (var5 > field8951 && var3 > field8951) {
         return var4;
      } else {
         if (var4 != null) {
            var4.method31060(var3);
         }

         if (var4 != null) {
            if (var3 <= field8951) {
               this.field8962.remove(var1);
            } else {
               this.field8962.add(var1);
            }
         }

         if (var3 <= field8951 && var4 == null) {
            var4 = (Class8641)this.field8954.remove(var1);
            if (var4 == null) {
               var4 = new Class8641(new Class7481(var1), var3, this.field8957, this.field8964, this);
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
         this.field8961.close();
      } finally {
         super.close();
      }
   }

   public void method6545(boolean var1) {
      if (!var1) {
         this.field8953.values().stream().filter(Class8641::method31064).forEach(var1x -> {
            IChunk var4x = var1x.method31046().getNow((IChunk)null);
            if (var4x instanceof Class1673 || var4x instanceof Chunk) {
               this.method6561(var4x);
               var1x.method31065();
            }
         });
      } else {
         List<Class8641> var4 = this.field8953.values().stream().filter(Class8641::method31064).peek(Class8641::method31065).collect(Collectors.toList());
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
            }).filter(var0 -> var0 instanceof Class1673 || var0 instanceof Chunk).filter(this::method6561).forEach(var1x -> var5.setTrue());
         } while (var5.isTrue());

         this.method6547(() -> true);
         this.method6533();
         field8950.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.field8971.getName());
      }
   }

   public void method6546(BooleanSupplier var1) {
      IProfiler var4 = this.field8956.getProfiler();
      var4.startSection("poi");
      this.field8961.method6641(var1);
      var4.endStartSection("chunk_unload");
      if (!this.field8956.method6819()) {
         this.method6547(var1);
      }

      var4.endSection();
   }

   private void method6547(BooleanSupplier var1) {
      LongIterator var4 = this.field8962.iterator();

      for (int var5 = 0; var4.hasNext() && (var1.getAsBoolean() || var5 < 200 || this.field8962.size() > 2000); var4.remove()) {
         long var6 = var4.nextLong();
         Class8641 var8 = (Class8641)this.field8952.remove(var6);
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

   private void method6548(long var1, Class8641 var3) {
      CompletableFuture<IChunk> var6 = var3.method31046();
      var6.thenAcceptAsync(var5 -> {
         CompletableFuture<IChunk> var8 = var3.method31046();
         if (var8 == var6) {
            if (this.field8954.remove(var1, var3) && var5 != null) {
               if (var5 instanceof Chunk) {
                  ((Chunk)var5).method7143(false);
                  if (Class9299.field42777.method20241()) {
                     Class9299.method35085(Class9299.field42777, var5);
                  }
               }

               this.method6561(var5);
               if (this.field8955.remove(var1) && var5 instanceof Chunk) {
                  Chunk var9 = (Chunk)var5;
                  this.field8956.method6929(var9);
               }

               this.field8957.method603(var5.method7072());
               this.field8957.method611();
               this.field8967.method22737(var5.method7072(), (ChunkStatus)null);
            }
         } else {
            this.method6548(var1, var3);
         }
      }, this.field8975::add).whenComplete((var1x, var2) -> {
         if (var2 != null) {
            field8950.error("Failed to save chunk " + var3.method31056(), var2);
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

   public CompletableFuture<Either<IChunk, Class7022>> method6550(Class8641 var1, ChunkStatus var2) {
      Class7481 var5 = var1.method31056();
      if (var2 != ChunkStatus.field42133) {
         CompletableFuture<Either<IChunk, Class7022>> var6 = var1.method31053(var2.method34299(), this);
         return var6.<Either<IChunk, Class7022>>thenComposeAsync(var4 -> {
            Optional var7 = var4.left();
            if (var7.isPresent()) {
               if (var2 == ChunkStatus.field42142) {
                  this.field8968.method35128(Class8561.field38484, var5, 33 + ChunkStatus.method34296(ChunkStatus.field42141), var5);
               }

               IChunk var8 = (IChunk)var7.get();
               if (!var8.method7080().method34306(var2)) {
                  return this.method6554(var1, var2);
               } else {
                  CompletableFuture var9;
                  if (var2 != ChunkStatus.field42142) {
                     var9 = var2.method34301(this.field8956, this.field8970, this.field8957, var2xx -> this.method6557(var1), var8);
                  } else {
                     var9 = this.method6554(var1, var2);
                  }

                  this.field8967.method22737(var5, var2);
                  return var9;
               }
            } else {
               return CompletableFuture.<Either<IChunk, Class7022>>completedFuture((Either<IChunk, Class7022>)var4);
            }
         }, this.field8958);
      } else {
         return this.method6551(var5);
      }
   }

   private CompletableFuture<Either<IChunk, Class7022>> method6551(Class7481 var1) {
      return CompletableFuture.<Either<IChunk, Class7022>>supplyAsync(() -> {
         try {
            this.field8956.getProfiler().func_230035_c_("chunkLoad");
            CompoundNBT var4 = this.method6570(var1);
            if (var4 != null) {
               boolean var9 = var4.method119("Level", 10) && var4.getCompound("Level").method119("Status", 8);
               if (var9) {
                  Class1672 var6 = Class9725.method38087(this.field8956, this.field8970, this.field8961, var1, var4);
                  var6.method7073(this.field8956.method6783());
                  this.method6553(var1, var6.method7080().method34303());
                  return Either.left(var6);
               }

               field8950.error("Chunk file at {} is missing level data, skipping", var1);
            }
         } catch (ReportedException var7) {
            Throwable var5 = var7.getCause();
            if (!(var5 instanceof IOException)) {
               this.method6552(var1);
               throw var7;
            }

            field8950.error("Couldn't load chunk {}", var1, var5);
         } catch (Exception var8) {
            field8950.error("Couldn't load chunk {}", var1, var8);
         }

         this.method6552(var1);
         return Either.left(new Class1672(var1, Class8922.field40388));
      }, this.field8958);
   }

   private void method6552(Class7481 var1) {
      this.field8974.put(var1.method24352(), (byte)-1);
   }

   private byte method6553(Class7481 var1, Class2076 var2) {
      return this.field8974.put(var1.method24352(), (byte)(var2 != Class2076.field13524 ? 1 : -1));
   }

   private CompletableFuture<Either<IChunk, Class7022>> method6554(Class8641 var1, ChunkStatus var2) {
      Class7481 var5 = var1.method31056();
      CompletableFuture<Either<List<IChunk>, Class7022>> var6 = this.method6542(var5, var2.method34302(), var2x -> this.method6556(var2, var2x));
      this.field8956.getProfiler().method22509(() -> "chunkGenerate " + var2.method34298());
      return var6.thenComposeAsync(
         var4 -> (CompletionStage<Either<IChunk, Class7022>>)var4.map(
               var4x -> {
                  try {
                     CompletableFuture<Either<IChunk, Class7022>> var7 = var2.method34300(
                        this.field8956, this.field8959, this.field8970, this.field8957, var2xxx -> this.method6557(var1), var4x
                     );
                     this.field8967.method22737(var5, var2);
                     return var7;
                  } catch (Exception var10) {
                     CrashReport var8 = CrashReport.makeCrashReport(var10, "Exception generating new chunk");
                     CrashReportCategory var9 = var8.makeCategory("Chunk to be generated");
                     var9.addDetail("Location", String.format("%d,%d", var5.field32174, var5.field32175));
                     var9.addDetail("Position hash", Class7481.method24353(var5.field32174, var5.field32175));
                     var9.addDetail("Generator", this.field8959);
                     throw new ReportedException(var8);
                  }
               },
               var2xx -> {
                  this.method6555(var5);
                  return CompletableFuture.<Either>completedFuture(Either.right(var2xx));
               }
            ),
         var2x -> this.field8965.method1641(Class1812.method7961(var1, var2x))
      );
   }

   public void method6555(Class7481 var1) {
      this.field8958
         .method1641(
            Util.method38515(
               () -> this.field8968.method35129(Class8561.field38484, var1, 33 + ChunkStatus.method34296(ChunkStatus.field42141), var1),
               () -> "release light ticket " + var1
            )
         );
   }

   private ChunkStatus method6556(ChunkStatus var1, int var2) {
      ChunkStatus var5;
      if (var2 != 0) {
         var5 = ChunkStatus.method34294(ChunkStatus.method34296(var1) + var2);
      } else {
         var5 = var1.method34299();
      }

      return var5;
   }

   private CompletableFuture<Either<IChunk, Class7022>> method6557(Class8641 var1) {
      CompletableFuture<Either<IChunk, Class7022>> var4 = var1.method31038(ChunkStatus.FULL.method34299());
      return var4.thenApplyAsync(var2 -> {
         ChunkStatus var5 = Class8641.method31062(var1.method31057());
         return var5.method34306(ChunkStatus.FULL) ? var2.mapLeft(var2x -> {
            Class7481 var5x = var1.method31056();
            Chunk var6;
            if (!(var2x instanceof Class1673)) {
               var6 = new Chunk(this.field8956, (Class1672)var2x);
               var1.method31066(new Class1673(var6));
            } else {
               var6 = ((Class1673)var2x).method7127();
            }

            var6.method7153(() -> Class8641.method31063(var1.method31057()));
            var6.method7136();
            if (this.field8955.add(var5x.method24352())) {
               var6.method7143(true);
               this.field8956.method6752(var6.method7145().values());
              List<Entity> var7 = null;
               Class51<Entity>[] var8 = var6.method7146();
               int var9 = var8.length;

               for (int var10 = 0; var10 < var9; var10++) {
                  for (Entity var12 : var8[var10]) {
                     if (!(var12 instanceof PlayerEntity) && !this.field8956.method6925(var12)) {
                        if (var7 != null) {
                           var7.add(var12);
                        } else {
                           var7 = Lists.newArrayList(var12);
                        }
                     }
                  }
               }

               if (var7 != null) {
                  var7.forEach(var6::method7132);
               }

               if (Class9299.field42775.method20241()) {
                  Class9299.method35085(Class9299.field42775, var6);
               }
            }

            return var6;
         }) : Class8641.field38893;
      }, var2 -> this.field8966.method1641(Class1812.method7960(var2, var1.method31056().method24352(), var1::method31057)));
   }

   public CompletableFuture<Either<Chunk, Class7022>> method6558(Class8641 var1) {
      Class7481 var4 = var1.method31056();
      CompletableFuture<Either<List<IChunk>, Class7022>> var5 = this.method6542(var4, 1, var0 -> ChunkStatus.FULL);
      CompletableFuture<Either<Chunk, Class7022>> var6 = var5.thenApplyAsync(var0 -> var0.flatMap(var0x -> {
            Chunk var3 = (Chunk)var0x.get(var0x.size() / 2);
            var3.method7148();
            return Either.left(var3);
         }), var2 -> this.field8966.method1641(Class1812.method7961(var1, var2)));
      var6.thenAcceptAsync(var2 -> var2.mapLeft(var2x -> {
            this.field8969.getAndIncrement();
            Packet[] var5x = new Packet[2];
            this.method6576(var4, false).forEach(var3 -> this.method6582(var3, var5x, var2x));
            return Either.left(var2x);
         }), var2 -> this.field8966.method1641(Class1812.method7961(var1, var2)));
      return var6;
   }

   public CompletableFuture<Either<Chunk, Class7022>> method6559(Class8641 var1) {
      return var1.method31053(ChunkStatus.FULL, this).<Either<Chunk, Class7022>>thenApplyAsync(var0 -> var0.mapLeft(var0x -> {
            Chunk var3 = (Chunk)var0x;
            var3.method7150();
            return var3;
         }), var2 -> this.field8966.method1641(Class1812.method7961(var1, var2)));
   }

   public int method6560() {
      return this.field8969.get();
   }

   private boolean method6561(IChunk var1) {
      this.field8961.method6654(var1.method7072());
      if (!var1.method7079()) {
         return false;
      } else {
         var1.method7073(this.field8956.method6783());
         var1.method7078(false);
         Class7481 var4 = var1.method7072();

         try {
            ChunkStatus var5 = var1.method7080();
            if (var5.method34303() != Class2076.field13525) {
               if (this.method6562(var4)) {
                  return false;
               }

               if (var5 == ChunkStatus.field42133 && var1.method7074().values().stream().noneMatch(Class5444::method17117)) {
                  return false;
               }
            }

            this.field8956.getProfiler().func_230035_c_("chunkSave");
            CompoundNBT var6 = Class9725.method38088(this.field8956, var1);
            if (Class9299.field42773.method20241()) {
               World var7 = (World)Class9299.method35070(var1, Class9299.field42908);
               Class9299.method35085(Class9299.field42773, var1, var7 != null ? var7 : this.field8956, var6);
            }

            this.method6532(var4, var6);
            this.method6553(var4, var5.method34303());
            return true;
         } catch (Exception var8) {
            field8950.error("Failed to save chunk {},{}", var4.field32174, var4.field32175, var8);
            return false;
         }
      }
   }

   private boolean method6562(Class7481 var1) {
      byte var4 = this.field8974.get(var1.method24352());
      if (var4 != 0) {
         return var4 == 1;
      } else {
         CompoundNBT var5;
         try {
            var5 = this.method6570(var1);
            if (var5 == null) {
               this.method6552(var1);
               return false;
            }
         } catch (Exception var7) {
            field8950.error("Failed to read chunk {}", var1, var7);
            this.method6552(var1);
            return false;
         }

         Class2076 var6 = Class9725.method38089(var5);
         return this.method6553(var1, var6) == 1;
      }
   }

   public void method6563(int var1) {
      int var4 = MathHelper.method37775(var1 + 1, 3, 64);
      if (var4 != this.field8976) {
         int var5 = this.field8976;
         this.field8976 = var4;
         this.field8968.method35137(this.field8976);
         ObjectIterator var6 = this.field8952.values().iterator();

         while (var6.hasNext()) {
            Class8641 var7 = (Class8641)var6.next();
            Class7481 var8 = var7.method31056();
            Packet[] var9 = new Packet[2];
            this.method6576(var8, false).forEach(var4x -> {
               int var7x = method6535(var8, var4x, true);
               boolean var8x = var7x <= var5;
               boolean var9x = var7x <= this.field8976;
               this.method6564(var4x, var8, var9, var8x, var9x);
            });
         }
      }
   }

   public void method6564(ServerPlayerEntity var1, Class7481 var2, Packet<?>[] var3, boolean var4, boolean var5) {
      if (var1.world == this.field8956) {
         if (Class9299.field42845.method20214()) {
            Class9299.field42845.method20217(var4, var5, var1, var2, this.field8956);
         }

         if (var5 && !var4) {
            Class8641 var8 = this.method6539(var2.method24352());
            if (var8 != null) {
               Chunk var9 = var8.method31043();
               if (var9 != null) {
                  this.method6582(var1, var3, var9);
               }

               Class7393.method23612(this.field8956, var2);
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

   public Class9306 method6566() {
      return this.field8968;
   }

   public Iterable<Class8641> method6567() {
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

       for (Entry<Class8641> var6 : this.field8953.long2ObjectEntrySet()) {
           Class7481 var7 = new Class7481(var6.getLongKey());
           Class8641 var8 = var6.getValue();
           Optional<IChunk> var9 = Optional.ofNullable(var8.method31045());
           Optional<Chunk> var10 = var9.flatMap(var0 -> !(var0 instanceof Chunk) ? Optional.empty() : Optional.of((Chunk) var0));
           var4.method33938(
                   var7.field32174,
                   var7.field32175,
                   var8.method31057(),
                   var9.isPresent(),
                   var9.map(IChunk::method7080).orElse(null),
                   var10.map(Chunk::getLocationType).orElse(null),
                   method6569(var8.method31042()),
                   method6569(var8.method31040()),
                   method6569(var8.method31041()),
                   this.field8968.method35136(var6.getLongKey()),
                   !this.method6571(var7),
                   var10.<Integer>map(var0 -> Stream.<Class51<Entity>>of(var0.method7146()).mapToInt(Class51::size).sum()).orElse(0),
                   var10.<Integer>map(var0 -> var0.method7145().size()).orElse(0)
           );
       }
   }

   private static String method6569(CompletableFuture<Either<Chunk, Class7022>> var0) {
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
   private CompoundNBT method6570(Class7481 var1) throws IOException {
      CompoundNBT var4 = this.method6531(var1);
      return var4 != null ? this.method6529(this.field8956.getDimensionKey(), this.field8960, var4) : null;
   }

   public boolean method6571(Class7481 var1) {
      long var4 = var1.method24352();
      return this.field8968.method35139(var4)
         ? this.field8972.method20896(var4).noneMatch(var1x -> !var1x.isSpectator() && method6534(var1, var1x) < 16384.0)
         : true;
   }

   private boolean method6572(ServerPlayerEntity var1) {
      return var1.isSpectator() && !this.field8956.method6789().method17135(Class5462.field24238);
   }

   public void method6573(ServerPlayerEntity var1, boolean var2) {
      boolean var5 = this.method6572(var1);
      boolean var6 = this.field8972.method20901(var1);
      int var7 = MathHelper.floor(var1.getPosX()) >> 4;
      int var8 = MathHelper.floor(var1.getPosZ()) >> 4;
      if (!var2) {
         Class2002 var9 = var1.method2832();
         this.field8972.method20898(var9.method8423().method24352(), var1);
         if (!var6) {
            this.field8968.method35135(var9, var1);
         }
      } else {
         this.field8972.method20897(Class7481.method24353(var7, var8), var1, var5);
         this.method6574(var1);
         if (!var5) {
            this.field8968.method35134(Class2002.method8392(var1), var1);
         }
      }

      for (int var12 = var7 - this.field8976; var12 <= var7 + this.field8976; var12++) {
         for (int var10 = var8 - this.field8976; var10 <= var8 + this.field8976; var10++) {
            Class7481 var11 = new Class7481(var12, var10);
            this.method6564(var1, var11, new Packet[2], !var2, var2);
         }
      }
   }

   private Class2002 method6574(ServerPlayerEntity var1) {
      Class2002 var4 = Class2002.method8392(var1);
      var1.method2833(var4);
      var1.field4855.sendPacket(new Class5579(var4.method8410(), var4.method8412()));
      return var4;
   }

   public void method6575(ServerPlayerEntity var1) {
      ObjectIterator var4 = this.field8973.values().iterator();

      while (var4.hasNext()) {
         Class8998 var5 = (Class8998)var4.next();
         if (Class8998.method33247(var5) != var1) {
            var5.method33243(var1);
         } else {
            var5.method33246(this.field8956.method6870());
         }
      }

      int var26 = MathHelper.floor(var1.getPosX()) >> 4;
      int var27 = MathHelper.floor(var1.getPosZ()) >> 4;
      Class2002 var6 = var1.method2832();
      Class2002 var7 = Class2002.method8392(var1);
      long var8 = var6.method8423().method24352();
      long var10 = var7.method8423().method24352();
      boolean var12 = this.field8972.method20902(var1);
      boolean var13 = this.method6572(var1);
      boolean var14 = var6.method8425() != var7.method8425();
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

      int var15 = var6.method8410();
      int var16 = var6.method8412();
      if (Math.abs(var15 - var26) <= this.field8976 * 2 && Math.abs(var16 - var27) <= this.field8976 * 2) {
         int var29 = Math.min(var26, var15) - this.field8976;
         int var31 = Math.min(var27, var16) - this.field8976;
         int var33 = Math.max(var26, var15) + this.field8976;
         int var35 = Math.max(var27, var16) + this.field8976;

         for (int var37 = var29; var37 <= var33; var37++) {
            for (int var22 = var31; var22 <= var35; var22++) {
               Class7481 var23 = new Class7481(var37, var22);
               boolean var24 = method6536(var23, var15, var16) <= this.field8976;
               boolean var25 = method6536(var23, var26, var27) <= this.field8976;
               this.method6564(var1, var23, new Packet[2], var24, var25);
            }
         }
      } else {
         for (int var17 = var15 - this.field8976; var17 <= var15 + this.field8976; var17++) {
            for (int var18 = var16 - this.field8976; var18 <= var16 + this.field8976; var18++) {
               Class7481 var19 = new Class7481(var17, var18);
               boolean var20 = true;
               boolean var21 = false;
               this.method6564(var1, var19, new Packet[2], true, false);
            }
         }

         for (int var28 = var26 - this.field8976; var28 <= var26 + this.field8976; var28++) {
            for (int var30 = var27 - this.field8976; var30 <= var27 + this.field8976; var30++) {
               Class7481 var32 = new Class7481(var28, var30);
               boolean var34 = false;
               boolean var36 = true;
               this.method6564(var1, var32, new Packet[2], false, true);
            }
         }
      }
   }

   @Override
   public Stream<ServerPlayerEntity> method6576(Class7481 var1, boolean var2) {
      return this.field8972.method20896(var1.method24352()).filter(var3 -> {
         int var6 = method6535(var1, var3, true);
         return var6 > this.field8976 ? false : !var2 || var6 == this.field8976;
      });
   }

   public void method6577(Entity var1) {
      if (!(var1 instanceof Class908)) {
         EntityType var4 = var1.getType();
         int var5 = var4.method33225() * 16;
         int var6 = var4.method33226();
         if (this.field8973.containsKey(var1.method3205())) {
            throw (IllegalStateException) Util.method38516(new IllegalStateException("Entity is already tracked!"));
         }

         Class8998 var7 = new Class8998(this, var1, var5, var6, var4.method33227());
         this.field8973.put(var1.method3205(), var7);
         var7.method33246(this.field8956.method6870());
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

      Class8998 var7 = (Class8998)this.field8973.remove(var1.method3205());
      if (var7 != null) {
         var7.method33241();
      }
   }

   public void method6579() {
      ArrayList var3 = Lists.newArrayList();
      List var4 = this.field8956.method6870();
      ObjectIterator var5 = this.field8973.values().iterator();

      while (var5.hasNext()) {
         Class8998 var6 = (Class8998)var5.next();
         Class2002 var7 = Class8998.method33248(var6);
         Class2002 var8 = Class2002.method8392(Class8998.method33247(var6));
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

   public void method6580(Entity var1, Packet<?> var2) {
      Class8998 var5 = (Class8998)this.field8973.get(var1.method3205());
      if (var5 != null) {
         var5.method33239(var2);
      }
   }

   public void method6581(Entity var1, Packet<?> var2) {
      Class8998 var5 = (Class8998)this.field8973.get(var1.method3205());
      if (var5 != null) {
         var5.method33240(var2);
      }
   }

   private void method6582(ServerPlayerEntity var1, Packet<?>[] var2, Chunk var3) {
      if (var2[0] == null) {
         var2[0] = new Class5526(var3, 65535);
         var2[1] = new Class5523(var3.method7072(), this.field8957, true);
      }

      var1.method2830(var3.method7072(), var2[0], var2[1]);
      Class7393.method23612(this.field8956, var3.method7072());
      List<Entity> var6 = Lists.newArrayList();
      List<Entity> var7 = Lists.newArrayList();

       for (Class8998 var9 : this.field8973.values()) {
           Entity var10 = Class8998.method33247(var9);
           if (var10 != var1 && var10.chunkCoordX == var3.method7072().field32174 && var10.chunkCoordZ == var3.method7072().field32175) {
               var9.method33243(var1);
               if (var10 instanceof Class1006 && ((Class1006) var10).method4297() != null) {
                   var6.add(var10);
               }

               if (!var10.method3408().isEmpty()) {
                   var7.add(var10);
               }
           }
       }

      if (!var6.isEmpty()) {
         for (Entity var13 : var6) {
            var1.field4855.sendPacket(new Class5593(var13, ((Class1006)var13).method4297()));
         }
      }

      if (!var7.isEmpty()) {
         for (Entity var14 : var7) {
            var1.field4855.sendPacket(new Class5485(var14));
         }
      }
   }

   public Class1653 method6583() {
      return this.field8961;
   }

   public CompletableFuture<Void> method6584(Chunk var1) {
      return this.field8958.method1634(() -> var1.method7151(this.field8956));
   }

   // $VF: synthetic method
   public static ServerWorld method6633(Class1649 var0) {
      return var0.field8956;
   }

   // $VF: synthetic method
   public static int method6634(Class1649 var0) {
      return var0.field8976;
   }

   // $VF: synthetic method
   public static int method6635(Class7481 var0, ServerPlayerEntity var1, boolean var2) {
      return method6535(var0, var1, var2);
   }

   // $VF: synthetic method
   public static LongSet method6636(Class1649 var0) {
      return var0.field8962;
   }

   // $VF: synthetic method
   public static Class8641 method6637(Class1649 var0, long var1, int var3, Class8641 var4, int var5) {
      return var0.method6544(var1, var3, var4, var5);
   }
}
