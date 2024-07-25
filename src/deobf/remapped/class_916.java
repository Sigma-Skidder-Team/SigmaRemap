package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_916 extends class_4037 implements class_6510 {
   private static final Logger field_4708 = LogManager.getLogger();
   public static final int field_4710 = 33 + class_7335.method_33454();
   private final Long2ObjectLinkedOpenHashMap<class_5344> field_4720 = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<class_5344> field_4700 = this.field_4720.clone();
   private final Long2ObjectLinkedOpenHashMap<class_5344> field_4718 = new Long2ObjectLinkedOpenHashMap();
   private final LongSet field_4711 = new LongOpenHashSet();
   private final class_6331 field_4703;
   private final class_2087 field_4713;
   private final class_7582<Runnable> field_4712;
   private final class_6541 field_4722;
   private final Supplier<class_4050> field_4695;
   private final class_1489 field_4706;
   private final LongSet field_4701 = new LongOpenHashSet();
   private boolean field_4721;
   private final class_6025 field_4702;
   private final class_8816<class_1069<Runnable>> field_4704;
   private final class_8816<class_1069<Runnable>> field_4707;
   private final class_1870 field_4698;
   private final class_7890 field_4714;
   private final AtomicInteger field_4697 = new AtomicInteger();
   private final class_5799 field_4719;
   private final File field_4709;
   private final class_1043 field_4705 = new class_1043();
   private final Int2ObjectMap<class_6650> field_4716 = new Int2ObjectOpenHashMap();
   private final Long2ByteMap field_4696 = new Long2ByteOpenHashMap();
   private final Queue<Runnable> field_4699 = Queues.newConcurrentLinkedQueue();
   private int field_4715;

   public class_916(
      class_6331 var1,
      class_3676 var2,
      DataFixer var3,
      class_5799 var4,
      Executor var5,
      class_7582<Runnable> var6,
      class_5002 var7,
      class_6541 var8,
      class_1870 var9,
      Supplier<class_4050> var10,
      int var11,
      boolean var12
   ) {
      super(new File(var2.method_17068(var1.method_29545()), "region"), var3, var12);
      this.field_4719 = var4;
      this.field_4709 = var2.method_17068(var1.method_29545());
      this.field_4703 = var1;
      this.field_4722 = var8;
      this.field_4712 = var6;
      class_2696 var15 = class_2696.method_12148(var5, "worldgen");
      class_8816 var16 = class_8816.method_40496("main", var6::method_34457);
      this.field_4698 = var9;
      class_2696 var17 = class_2696.method_12148(var5, "light");
      this.field_4702 = new class_6025(ImmutableList.of(var15, var16, var17), var5, Integer.MAX_VALUE);
      this.field_4704 = this.field_4702.<Runnable>method_27488(var15, false);
      this.field_4707 = this.field_4702.<Runnable>method_27488(var16, false);
      this.field_4713 = new class_2087(var7, this, this.field_4703.method_22572().method_40229(), var17, this.field_4702.<Runnable>method_27488(var17, false));
      this.field_4714 = new class_7890(this, var5, var6);
      this.field_4695 = var10;
      this.field_4706 = new class_1489(new File(this.field_4709, "poi"), var3, var12);
      this.method_3977(var11);
   }

   private static double method_3984(class_2034 var0, Entity var1) {
      double var4 = (double)(var0.field_10328 * 16 + 8);
      double var6 = (double)(var0.field_10327 * 16 + 8);
      double var8 = var4 - var1.getPosX();
      double var10 = var6 - var1.getPosZ();
      return var8 * var8 + var10 * var10;
   }

   private static int method_3979(class_2034 var0, class_9359 var1, boolean var2) {
      int var5;
      int var6;
      if (!var2) {
         var5 = class_9299.method_42847(var1.getPosX() / 16.0);
         var6 = class_9299.method_42847(var1.getPosZ() / 16.0);
      } else {
         class_6979 var7 = var1.method_43238();
         var5 = var7.method_31930();
         var6 = var7.method_31900();
      }

      return method_4022(var0, var5, var6);
   }

   private static int method_4022(class_2034 var0, int var1, int var2) {
      int var5 = var0.field_10328 - var1;
      int var6 = var0.field_10327 - var2;
      return Math.max(Math.abs(var5), Math.abs(var6));
   }

   public class_2087 method_4005() {
      return this.field_4713;
   }

   @Nullable
   public class_5344 method_3995(long var1) {
      return (class_5344)this.field_4720.get(var1);
   }

   @Nullable
   public class_5344 method_4023(long var1) {
      return (class_5344)this.field_4700.get(var1);
   }

   public IntSupplier method_4010(long var1) {
      return () -> {
         class_5344 var5 = this.method_4023(var1);
         return var5 != null ? Math.min(var5.method_24345(), class_5077.field_26218 - 1) : class_5077.field_26218 - 1;
      };
   }

   public String method_4001(class_2034 var1) {
      class_5344 var4 = this.method_4023(var1.method_9539());
      if (var4 != null) {
         String var5 = var4.method_24367() + "\n";
         class_7335 var6 = var4.method_24365();
         class_5990 var7 = var4.method_24351();
         if (var6 != null) {
            var5 = var5 + "St: §" + var6.method_33445() + var6 + '§' + "r\n";
         }

         if (var7 != null) {
            var5 = var5 + "Ch: §" + var7.method_27364().method_33445() + var7.method_27364() + '§' + "r\n";
         }

         class_7581 var8 = var4.method_24360();
         var5 = var5 + "§" + var8.ordinal() + var8;
         return var5 + '§' + "r";
      } else {
         return "null";
      }
   }

   private CompletableFuture<Either<List<class_5990>, class_1361>> method_4013(class_2034 var1, int var2, IntFunction<class_7335> var3) {
      ArrayList var6 = Lists.newArrayList();
      int var7 = var1.field_10328;
      int var8 = var1.field_10327;

      for (int var9 = -var2; var9 <= var2; var9++) {
         for (int var10 = -var2; var10 <= var2; var10++) {
            int var11 = Math.max(Math.abs(var10), Math.abs(var9));
            class_2034 var12 = new class_2034(var7 + var10, var8 + var9);
            long var13 = var12.method_9539();
            class_5344 var15 = this.method_3995(var13);
            if (var15 == null) {
               return CompletableFuture.<Either<List<class_5990>, class_1361>>completedFuture(Either.right(new class_1278(this, var12)));
            }

            class_7335 var16 = (class_7335)var3.apply(var11);
            CompletableFuture var17 = var15.method_24354(var16, this);
            var6.add(var17);
         }
      }

      CompletableFuture var18 = Util.method_44680(var6);
      return var18.<Either<List<class_5990>, class_1361>>thenApply(var4 -> {
         ArrayList var7x = Lists.newArrayList();
         int var8x = 0;

         for (Either var10x : var4) {
            Optional var11x = var10x.left();
            if (!var11x.isPresent()) {
               return Either.right(new class_4056(this, var7, var8x, var2, var8, var10x));
            }

            var7x.add(var11x.get());
            var8x++;
         }

         return Either.left(var7x);
      });
   }

   public CompletableFuture<Either<class_2654, class_1361>> method_3989(class_2034 var1) {
      return this.method_4013(var1, 2, var0 -> class_7335.field_37514)
         .<Either<class_2654, class_1361>>thenApplyAsync(var0 -> var0.mapLeft(var0x -> (class_2654)var0x.get(var0x.size() / 2)), this.field_4712);
   }

   @Nullable
   private class_5344 method_4016(long var1, int var3, class_5344 var4, int var5) {
      if (var5 > field_4710 && var3 > field_4710) {
         return var4;
      } else {
         if (var4 != null) {
            var4.method_24340(var3);
         }

         if (var4 != null) {
            if (var3 <= field_4710) {
               this.field_4701.remove(var1);
            } else {
               this.field_4701.add(var1);
            }
         }

         if (var3 <= field_4710 && var4 == null) {
            var4 = (class_5344)this.field_4718.remove(var1);
            if (var4 == null) {
               var4 = new class_5344(new class_2034(var1), var3, this.field_4713, this.field_4702, this);
            } else {
               var4.method_24340(var3);
            }

            this.field_4720.put(var1, var4);
            this.field_4721 = true;
         }

         return var4;
      }
   }

   @Override
   public void close() throws IOException {
      try {
         this.field_4702.close();
         this.field_4706.close();
      } finally {
         super.close();
      }
   }

   public void method_4007(boolean var1) {
      if (!var1) {
         this.field_4700.values().stream().filter(class_5344::method_24352).forEach(var1x -> {
            class_5990 var4x = var1x.method_24343().getNow((class_5990)null);
            if (var4x instanceof class_2711 || var4x instanceof class_2654) {
               this.method_3994(var4x);
               var1x.method_24366();
            }
         });
      } else {
         List var4 = this.field_4700.values().stream().filter(class_5344::method_24352).peek(class_5344::method_24366).collect(Collectors.toList());
         MutableBoolean var5 = new MutableBoolean();

         do {
            var5.setFalse();
            var4.stream().<class_5990>map(var1x -> {
               CompletableFuture var4x;
               do {
                  var4x = var1x.method_24343();
                  this.field_4712.method_34461(var4x::isDone);
               } while (var4x != var1x.method_24343());

               return (class_5990)var4x.join();
            }).filter(var0 -> var0 instanceof class_2711 || var0 instanceof class_2654).filter(this::method_3994).forEach(var1x -> var5.setTrue());
         } while (var5.isTrue());

         this.method_3985(() -> true);
         this.method_18570();
         field_4708.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.field_4709.getName());
      }
   }

   public void method_3997(BooleanSupplier var1) {
      class_3492 var4 = this.field_4703.method_29599();
      var4.startSection("poi");
      this.field_4706.method_45259(var1);
      var4.method_16050("chunk_unload");
      if (!this.field_4703.method_29590()) {
         this.method_3985(var1);
      }

      var4.endSection();
   }

   private void method_3985(BooleanSupplier var1) {
      LongIterator var4 = this.field_4701.iterator();

      for (int var5 = 0; var4.hasNext() && (var1.getAsBoolean() || var5 < 200 || this.field_4701.size() > 2000); var4.remove()) {
         long var6 = var4.nextLong();
         class_5344 var8 = (class_5344)this.field_4720.remove(var6);
         if (var8 != null) {
            this.field_4718.put(var6, var8);
            this.field_4721 = true;
            var5++;
            this.method_3981(var6, var8);
         }
      }

      Runnable var9;
      while ((var1.getAsBoolean() || this.field_4699.size() > 2000) && (var9 = this.field_4699.poll()) != null) {
         var9.run();
      }
   }

   private void method_3981(long var1, class_5344 var3) {
      CompletableFuture var6 = var3.method_24343();
      var6.thenAcceptAsync(var5 -> {
         CompletableFuture var8 = var3.method_24343();
         if (var8 == var6) {
            if (this.field_4718.remove(var1, var3) && var5 != null) {
               if (var5 instanceof class_2654) {
                  ((class_2654)var5).method_11981(false);
                  if (class_7860.field_40024.method_22501()) {
                     class_7860.method_35568(class_7860.field_40024, var5);
                  }
               }

               this.method_3994(var5);
               if (this.field_4711.remove(var1) && var5 instanceof class_2654) {
                  class_2654 var9 = (class_2654)var5;
                  this.field_4703.method_28962(var9);
               }

               this.field_4713.method_9759(var5.method_27352());
               this.field_4713.method_9760();
               this.field_4698.method_8297(var5.method_27352(), (class_7335)null);
            }
         } else {
            this.method_3981(var1, var3);
         }
      }, this.field_4699::add).whenComplete((var1x, var2) -> {
         if (var2 != null) {
            field_4708.error("Failed to save chunk " + var3.method_24368(), var2);
         }
      });
   }

   public boolean method_3993() {
      if (this.field_4721) {
         this.field_4700 = this.field_4720.clone();
         this.field_4721 = false;
         return true;
      } else {
         return false;
      }
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_4019(class_5344 var1, class_7335 var2) {
      class_2034 var5 = var1.method_24368();
      if (var2 != class_7335.field_37504) {
         CompletableFuture var6 = var1.method_24354(var2.method_33448(), this);
         return var6.<Either<class_5990, class_1361>>thenComposeAsync(var4 -> {
            Optional var7 = var4.left();
            if (var7.isPresent()) {
               if (var2 == class_7335.field_37512) {
                  this.field_4714.method_42699(class_5032.field_26026, var5, 33 + class_7335.method_33455(class_7335.field_37499), var5);
               }

               class_5990 var8 = (class_5990)var7.get();
               if (!var8.method_27364().method_33453(var2)) {
                  return this.method_4008(var1, var2);
               } else {
                  CompletableFuture var9;
                  if (var2 != class_7335.field_37512) {
                     var9 = var2.method_33443(this.field_4703, this.field_4719, this.field_4713, var2xx -> this.method_3980(var1), var8);
                  } else {
                     var9 = this.method_4008(var1, var2);
                  }

                  this.field_4698.method_8297(var5, var2);
                  return var9;
               }
            } else {
               return CompletableFuture.<Either<class_5990, class_1361>>completedFuture((Either<class_5990, class_1361>)var4);
            }
         }, this.field_4712);
      } else {
         return this.method_3986(var5);
      }
   }

   private CompletableFuture<Either<class_5990, class_1361>> method_3986(class_2034 var1) {
      return CompletableFuture.<Either<class_5990, class_1361>>supplyAsync(() -> {
         try {
            this.field_4703.method_29599().method_16055("chunkLoad");
            CompoundNBT var4 = this.method_4027(var1);
            if (var4 != null) {
               boolean var9 = var4.contains("Level", 10) && var4.getCompound("Level").contains("Status", 8);
               if (var9) {
                  class_7481 var6 = class_9477.method_43781(this.field_4703, this.field_4719, this.field_4706, var1, var4);
                  var6.method_27344(this.field_4703.method_29546());
                  this.method_4014(var1, var6.method_27364().method_33446());
                  return Either.left(var6);
               }

               field_4708.error("Chunk file at {} is missing level data, skipping", var1);
            }
         } catch (class_3297 var7) {
            Throwable var5 = var7.getCause();
            if (!(var5 instanceof IOException)) {
               this.method_3991(var1);
               throw var7;
            }

            field_4708.error("Couldn't load chunk {}", var1, var5);
         } catch (Exception var8) {
            field_4708.error("Couldn't load chunk {}", var1, var8);
         }

         this.method_3991(var1);
         return Either.left(new class_7481(var1, class_6397.field_32658));
      }, this.field_4712);
   }

   private void method_3991(class_2034 var1) {
      this.field_4696.put(var1.method_9539(), (byte)-1);
   }

   private byte method_4014(class_2034 var1, class_5592 var2) {
      return this.field_4696.put(var1.method_9539(), (byte)(var2 != class_5592.field_28386 ? 1 : -1));
   }

   private CompletableFuture<Either<class_5990, class_1361>> method_4008(class_5344 var1, class_7335 var2) {
      class_2034 var5 = var1.method_24368();
      CompletableFuture var6 = this.method_4013(var5, var2.method_33459(), var2x -> this.method_4004(var2, var2x));
      this.field_4703.method_29599().method_16053(() -> "chunkGenerate " + var2.method_33460());
      return var6.<Either<class_5990, class_1361>>thenComposeAsync(
         var4 -> (CompletionStage<Either<class_5990, class_1361>>)var4.map(
               var4x -> {
                  try {
                     CompletableFuture var7 = var2.method_33451(
                        this.field_4703, this.field_4722, this.field_4719, this.field_4713, var2xxx -> this.method_3980(var1), var4x
                     );
                     this.field_4698.method_8297(var5, var2);
                     return var7;
                  } catch (Exception var10) {
                     class_159 var8 = class_159.method_643(var10, "Exception generating new chunk");
                     class_6544 var9 = var8.method_639("Chunk to be generated");
                     var9.method_29850("Location", String.format("%d,%d", var5.field_10328, var5.field_10327));
                     var9.method_29850("Position hash", class_2034.method_9540(var5.field_10328, var5.field_10327));
                     var9.method_29850("Generator", this.field_4722);
                     throw new class_3297(var8);
                  }
               },
               var2xx -> {
                  this.method_4009(var5);
                  return CompletableFuture.<Either>completedFuture(Either.right(var2xx));
               }
            ),
         var2x -> this.field_4704.method_40495(class_6025.method_27493(var1, var2x))
      );
   }

   public void method_4009(class_2034 var1) {
      this.field_4712
         .method_34457(
            Util.method_44687(
               () -> this.field_4714.method_42687(class_5032.field_26026, var1, 33 + class_7335.method_33455(class_7335.field_37499), var1),
               () -> "release light ticket " + var1
            )
         );
   }

   private class_7335 method_4004(class_7335 var1, int var2) {
      class_7335 var5;
      if (var2 != 0) {
         var5 = class_7335.method_33444(class_7335.method_33455(var1) + var2);
      } else {
         var5 = var1.method_33448();
      }

      return var5;
   }

   private CompletableFuture<Either<class_5990, class_1361>> method_3980(class_5344 var1) {
      CompletableFuture var4 = var1.method_24347(class_7335.field_37514.method_33448());
      return var4.<Either<class_5990, class_1361>>thenApplyAsync(var2 -> {
         class_7335 var5 = class_5344.method_24363(var1.method_24367());
         return var5.method_33453(class_7335.field_37514) ? var2.mapLeft(var2x -> {
            class_2034 var5x = var1.method_24368();
            class_2654 var6;
            if (!(var2x instanceof class_2711)) {
               var6 = new class_2654(this.field_4703, (class_7481)var2x);
               var1.method_24356(new class_2711(var6));
            } else {
               var6 = ((class_2711)var2x).method_12212();
            }

            var6.method_11987(() -> class_5344.method_24358(var1.method_24367()));
            var6.method_12002();
            if (this.field_4711.add(var5x.method_9539())) {
               var6.method_11981(true);
               this.field_4703.method_29531(var6.method_12004().values());
               ArrayList var7 = null;
               class_4722[] var8 = var6.method_11979();
               int var9 = var8.length;

               for (int var10 = 0; var10 < var9; var10++) {
                  for (Entity var12 : var8[var10]) {
                     if (!(var12 instanceof PlayerEntity) && !this.field_4703.method_28953(var12)) {
                        if (var7 != null) {
                           var7.add(var12);
                        } else {
                           var7 = Lists.newArrayList(new Entity[]{var12});
                        }
                     }
                  }
               }

               if (var7 != null) {
                  var7.forEach(var6::method_11995);
               }

               if (class_7860.field_39925.method_22501()) {
                  class_7860.method_35568(class_7860.field_39925, var6);
               }
            }

            return var6;
         }) : class_5344.field_27249;
      }, var2 -> this.field_4707.method_40495(class_6025.method_27494(var2, var1.method_24368().method_9539(), var1::method_24367)));
   }

   public CompletableFuture<Either<class_2654, class_1361>> method_4000(class_5344 var1) {
      class_2034 var4 = var1.method_24368();
      CompletableFuture var5 = this.method_4013(var4, 1, var0 -> class_7335.field_37514);
      CompletableFuture var6 = var5.<Either>thenApplyAsync(var0 -> var0.flatMap(var0x -> {
            class_2654 var3 = (class_2654)var0x.get(var0x.size() / 2);
            var3.method_11986();
            return Either.left(var3);
         }), var2 -> this.field_4707.method_40495(class_6025.method_27493(var1, var2)));
      var6.thenAcceptAsync(var2 -> var2.mapLeft(var2x -> {
            this.field_4697.getAndIncrement();
            Packet[] var5x = new Packet[2];
            this.埙眓郝䕦騜霥(var4, false).forEach(var3 -> this.method_3982(var3, var5x, var2x));
            return Either.left(var2x);
         }), var2 -> this.field_4707.method_40495(class_6025.method_27493(var1, var2)));
      return var6;
   }

   public CompletableFuture<Either<class_2654, class_1361>> method_3978(class_5344 var1) {
      return var1.method_24354(class_7335.field_37514, this).<Either<class_2654, class_1361>>thenApplyAsync(var0 -> var0.mapLeft(var0x -> {
            class_2654 var3 = (class_2654)var0x;
            var3.method_11989();
            return var3;
         }), var2 -> this.field_4707.method_40495(class_6025.method_27493(var1, var2)));
   }

   public int method_3987() {
      return this.field_4697.get();
   }

   private boolean method_3994(class_5990 var1) {
      this.field_4706.method_45257(var1.method_27352());
      if (!var1.method_27358()) {
         return false;
      } else {
         var1.method_27344(this.field_4703.method_29546());
         var1.method_27361(false);
         class_2034 var4 = var1.method_27352();

         try {
            class_7335 var5 = var1.method_27364();
            if (var5.method_33446() != class_5592.field_28385) {
               if (this.method_3976(var4)) {
                  return false;
               }

               if (var5 == class_7335.field_37504 && var1.method_27363().values().stream().noneMatch(class_3200::method_14731)) {
                  return false;
               }
            }

            this.field_4703.method_29599().method_16055("chunkSave");
            CompoundNBT var6 = class_9477.method_43779(this.field_4703, var1);
            if (class_7860.field_39941.method_22501()) {
               World var7 = (World)class_7860.method_35555(var1, class_7860.field_40175);
               class_7860.method_35568(class_7860.field_39941, var1, var7 != null ? var7 : this.field_4703, var6);
            }

            this.method_18571(var4, var6);
            this.method_4014(var4, var5.method_33446());
            return true;
         } catch (Exception var8) {
            field_4708.error("Failed to save chunk {},{}", var4.field_10328, var4.field_10327, var8);
            return false;
         }
      }
   }

   private boolean method_3976(class_2034 var1) {
      byte var4 = this.field_4696.get(var1.method_9539());
      if (var4 != 0) {
         return var4 == 1;
      } else {
         CompoundNBT var5;
         try {
            var5 = this.method_4027(var1);
            if (var5 == null) {
               this.method_3991(var1);
               return false;
            }
         } catch (Exception var7) {
            field_4708.error("Failed to read chunk {}", var1, var7);
            this.method_3991(var1);
            return false;
         }

         class_5592 var6 = class_9477.method_43785(var5);
         return this.method_4014(var1, var6) == 1;
      }
   }

   public void method_3977(int var1) {
      int var4 = class_9299.method_42829(var1 + 1, 3, 64);
      if (var4 != this.field_4715) {
         int var5 = this.field_4715;
         this.field_4715 = var4;
         this.field_4714.method_42681(this.field_4715);
         ObjectIterator var6 = this.field_4720.values().iterator();

         while (var6.hasNext()) {
            class_5344 var7 = (class_5344)var6.next();
            class_2034 var8 = var7.method_24368();
            Packet[] var9 = new Packet[2];
            this.埙眓郝䕦騜霥(var8, false).forEach(var4x -> {
               int var7x = method_3979(var8, var4x, true);
               boolean var8x = var7x <= var5;
               boolean var9x = var7x <= this.field_4715;
               this.method_3975(var4x, var8, var9, var8x, var9x);
            });
         }
      }
   }

   public void method_3975(class_9359 var1, class_2034 var2, Packet<?>[] var3, boolean var4, boolean var5) {
      if (var1.world == this.field_4703) {
         if (class_7860.field_39857.method_3596()) {
            class_7860.field_39857.method_3582(var4, var5, var1, var2, this.field_4703);
         }

         if (var5 && !var4) {
            class_5344 var8 = this.method_4023(var2.method_9539());
            if (var8 != null) {
               class_2654 var9 = var8.method_24349();
               if (var9 != null) {
                  this.method_3982(var1, var3, var9);
               }

               class_1892.method_8446(this.field_4703, var2);
            }
         }

         if (!var5 && var4) {
            var1.method_43234(var2);
         }
      }
   }

   public int method_3992() {
      return this.field_4700.size();
   }

   public class_7890 method_3996() {
      return this.field_4714;
   }

   public Iterable<class_5344> method_3988() {
      return Iterables.unmodifiableIterable(this.field_4700.values());
   }

   public void method_3999(Writer var1) throws IOException {
      class_7012 var4 = class_7012.method_32026()
         .method_40500("x")
         .method_40500("z")
         .method_40500("level")
         .method_40500("in_memory")
         .method_40500("status")
         .method_40500("full_status")
         .method_40500("accessible_ready")
         .method_40500("ticking_ready")
         .method_40500("entity_ticking_ready")
         .method_40500("ticket")
         .method_40500("spawning")
         .method_40500("entity_count")
         .method_40500("block_entity_count")
         .method_40499(var1);
      ObjectBidirectionalIterator var5 = this.field_4700.long2ObjectEntrySet().iterator();

      while (var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         class_2034 var7 = new class_2034(var6.getLongKey());
         class_5344 var8 = (class_5344)var6.getValue();
         Optional var9 = Optional.<class_5990>ofNullable(var8.method_24351());
         Optional var10 = var9.flatMap(var0 -> !(var0 instanceof class_2654) ? Optional.empty() : Optional.<class_5990>of((class_2654)var0));
         var4.method_32024(
            var7.field_10328,
            var7.field_10327,
            var8.method_24367(),
            var9.isPresent(),
            var9.<class_7335>map(class_5990::method_27364).orElse((class_7335)null),
            var10.<class_7581>map(class_2654::method_11999).orElse((class_7581)null),
            method_3983(var8.method_24361()),
            method_3983(var8.method_24350()),
            method_3983(var8.method_24353()),
            this.field_4714.method_42701(var6.getLongKey()),
            !this.method_4018(var7),
            var10.<Integer>map(var0 -> Stream.<class_4722<Entity>>of(var0.method_11979()).mapToInt(class_4722::size).sum()).orElse(0),
            var10.<Integer>map(var0 -> var0.method_12004().size()).orElse(0)
         );
      }
   }

   private static String method_3983(CompletableFuture<Either<class_2654, class_1361>> var0) {
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
   private CompoundNBT method_4027(class_2034 var1) throws IOException {
      CompoundNBT var4 = this.method_18575(var1);
      return var4 != null ? this.method_18573(this.field_4703.method_29545(), this.field_4695, var4) : null;
   }

   public boolean method_4018(class_2034 var1) {
      long var4 = var1.method_9539();
      return this.field_4714.method_42692(var4)
         ? this.field_4705.method_4618(var4).noneMatch(var1x -> !var1x.method_37221() && method_3984(var1, var1x) < 16384.0)
         : true;
   }

   private boolean method_4015(class_9359 var1) {
      return var1.method_37221() && !this.field_4703.method_29537().method_1285(class_291.field_1059);
   }

   public void method_4012(class_9359 var1, boolean var2) {
      boolean var5 = this.method_4015(var1);
      boolean var6 = this.field_4705.method_4612(var1);
      int var7 = class_9299.method_42847(var1.getPosX()) >> 4;
      int var8 = class_9299.method_42847(var1.getPosZ()) >> 4;
      if (!var2) {
         class_6979 var9 = var1.method_43238();
         this.field_4705.method_4617(var9.method_31917().method_9539(), var1);
         if (!var6) {
            this.field_4714.method_42707(var9, var1);
         }
      } else {
         this.field_4705.method_4611(class_2034.method_9540(var7, var8), var1, var5);
         this.method_4006(var1);
         if (!var5) {
            this.field_4714.method_42686(class_6979.method_31923(var1), var1);
         }
      }

      for (int var12 = var7 - this.field_4715; var12 <= var7 + this.field_4715; var12++) {
         for (int var10 = var8 - this.field_4715; var10 <= var8 + this.field_4715; var10++) {
            class_2034 var11 = new class_2034(var12, var10);
            this.method_3975(var1, var11, new Packet[2], !var2, var2);
         }
      }
   }

   private class_6979 method_4006(class_9359 var1) {
      class_6979 var4 = class_6979.method_31923(var1);
      var1.method_43261(var4);
      var1.field_47794.method_4156(new class_8849(var4.method_31930(), var4.method_31900()));
      return var4;
   }

   public void method_4017(class_9359 var1) {
      ObjectIterator var4 = this.field_4716.values().iterator();

      while (var4.hasNext()) {
         class_6650 var5 = (class_6650)var4.next();
         if (class_6650.method_30547(var5) != var1) {
            var5.method_30550(var1);
         } else {
            var5.method_30549(this.field_4703.method_25873());
         }
      }

      int var26 = class_9299.method_42847(var1.getPosX()) >> 4;
      int var27 = class_9299.method_42847(var1.getPosZ()) >> 4;
      class_6979 var6 = var1.method_43238();
      class_6979 var7 = class_6979.method_31923(var1);
      long var8 = var6.method_31917().method_9539();
      long var10 = var7.method_31917().method_9539();
      boolean var12 = this.field_4705.method_4615(var1);
      boolean var13 = this.method_4015(var1);
      boolean var14 = var6.method_31925() != var7.method_31925();
      if (var14 || var12 != var13) {
         this.method_4006(var1);
         if (!var12) {
            this.field_4714.method_42707(var6, var1);
         }

         if (!var13) {
            this.field_4714.method_42686(var7, var1);
         }

         if (!var12 && var13) {
            this.field_4705.method_4610(var1);
         }

         if (var12 && !var13) {
            this.field_4705.method_4614(var1);
         }

         if (var8 != var10) {
            this.field_4705.method_4616(var8, var10, var1);
         }
      }

      int var15 = var6.method_31930();
      int var16 = var6.method_31900();
      if (Math.abs(var15 - var26) <= this.field_4715 * 2 && Math.abs(var16 - var27) <= this.field_4715 * 2) {
         int var29 = Math.min(var26, var15) - this.field_4715;
         int var31 = Math.min(var27, var16) - this.field_4715;
         int var33 = Math.max(var26, var15) + this.field_4715;
         int var35 = Math.max(var27, var16) + this.field_4715;

         for (int var37 = var29; var37 <= var33; var37++) {
            for (int var22 = var31; var22 <= var35; var22++) {
               class_2034 var23 = new class_2034(var37, var22);
               boolean var24 = method_4022(var23, var15, var16) <= this.field_4715;
               boolean var25 = method_4022(var23, var26, var27) <= this.field_4715;
               this.method_3975(var1, var23, new Packet[2], var24, var25);
            }
         }
      } else {
         for (int var17 = var15 - this.field_4715; var17 <= var15 + this.field_4715; var17++) {
            for (int var18 = var16 - this.field_4715; var18 <= var16 + this.field_4715; var18++) {
               class_2034 var19 = new class_2034(var17, var18);
               boolean var20 = true;
               boolean var21 = false;
               this.method_3975(var1, var19, new Packet[2], true, false);
            }
         }

         for (int var28 = var26 - this.field_4715; var28 <= var26 + this.field_4715; var28++) {
            for (int var30 = var27 - this.field_4715; var30 <= var27 + this.field_4715; var30++) {
               class_2034 var32 = new class_2034(var28, var30);
               boolean var34 = false;
               boolean var36 = true;
               this.method_3975(var1, var32, new Packet[2], false, true);
            }
         }
      }
   }

   public Stream<class_9359> 埙眓郝䕦騜霥(class_2034 var1, boolean var2) {
      return this.field_4705.method_4618(var1.method_9539()).filter(var3 -> {
         int var6 = method_3979(var1, var3, true);
         return var6 > this.field_4715 ? false : !var2 || var6 == this.field_4715;
      });
   }

   public void method_4021(Entity var1) {
      if (!(var1 instanceof class_5708)) {
         EntityType var4 = var1.method_37387();
         int var5 = var4.method_30462() * 16;
         int var6 = var4.method_30463();
         if (this.field_4716.containsKey(var1.method_37145())) {
            throw (IllegalStateException) Util.method_44658(new IllegalStateException("Entity is already tracked!"));
         }

         class_6650 var7 = new class_6650(this, var1, var5, var6, var4.method_30477());
         this.field_4716.put(var1.method_37145(), var7);
         var7.method_30549(this.field_4703.method_25873());
         if (var1 instanceof class_9359) {
            class_9359 var8 = (class_9359)var1;
            this.method_4012(var8, true);
            ObjectIterator var9 = this.field_4716.values().iterator();

            while (var9.hasNext()) {
               class_6650 var10 = (class_6650)var9.next();
               if (class_6650.method_30547(var10) != var8) {
                  var10.method_30550(var8);
               }
            }
         }
      }
   }

   public void method_3990(Entity var1) {
      if (var1 instanceof class_9359) {
         class_9359 var4 = (class_9359)var1;
         this.method_4012(var4, false);
         ObjectIterator var5 = this.field_4716.values().iterator();

         while (var5.hasNext()) {
            class_6650 var6 = (class_6650)var5.next();
            var6.method_30558(var4);
         }
      }

      class_6650 var7 = (class_6650)this.field_4716.remove(var1.method_37145());
      if (var7 != null) {
         var7.method_30553();
      }
   }

   public void method_4011() {
      ArrayList var3 = Lists.newArrayList();
      List var4 = this.field_4703.method_25873();
      ObjectIterator var5 = this.field_4716.values().iterator();

      while (var5.hasNext()) {
         class_6650 var6 = (class_6650)var5.next();
         class_6979 var7 = class_6650.method_30557(var6);
         class_6979 var8 = class_6979.method_31923(class_6650.method_30547(var6));
         if (!Objects.equals(var7, var8)) {
            var6.method_30549(var4);
            Entity var9 = class_6650.method_30547(var6);
            if (var9 instanceof class_9359) {
               var3.add((class_9359)var9);
            }

            class_6650.method_30555(var6, var8);
         }

         class_6650.method_30554(var6).method_35259();
      }

      if (!var3.isEmpty()) {
         var5 = this.field_4716.values().iterator();

         while (var5.hasNext()) {
            class_6650 var11 = (class_6650)var5.next();
            var11.method_30549(var3);
         }
      }
   }

   public void method_3973(Entity var1, Packet<?> var2) {
      class_6650 var5 = (class_6650)this.field_4716.get(var1.method_37145());
      if (var5 != null) {
         var5.method_30548(var2);
      }
   }

   public void method_3974(Entity var1, Packet<?> var2) {
      class_6650 var5 = (class_6650)this.field_4716.get(var1.method_37145());
      if (var5 != null) {
         var5.method_30551(var2);
      }
   }

   private void method_3982(class_9359 var1, Packet<?>[] var2, class_2654 var3) {
      if (var2[0] == null) {
         var2[0] = new class_4808(var3, 65535);
         var2[1] = new class_4234(var3.method_27352(), this.field_4713, true);
      }

      var1.method_43285(var3.method_27352(), var2[0], var2[1]);
      class_1892.method_8446(this.field_4703, var3.method_27352());
      ArrayList var6 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      ObjectIterator var8 = this.field_4716.values().iterator();

      while (var8.hasNext()) {
         class_6650 var9 = (class_6650)var8.next();
         Entity var10 = class_6650.method_30547(var9);
         if (var10 != var1 && var10.field_41742 == var3.method_27352().field_10328 && var10.field_41714 == var3.method_27352().field_10327) {
            var9.method_30550(var1);
            if (var10 instanceof MobEntity && ((MobEntity)var10).method_26922() != null) {
               var6.add(var10);
            }

            if (!var10.method_37114().isEmpty()) {
               var7.add(var10);
            }
         }
      }

      if (!var6.isEmpty()) {
         for (Entity var13 : var6) {
            var1.field_47794.method_4156(new class_2708(var13, ((MobEntity)var13).method_26922()));
         }
      }

      if (!var7.isEmpty()) {
         for (Entity var14 : var7) {
            var1.field_47794.method_4156(new class_4597(var14));
         }
      }
   }

   public class_1489 method_4002() {
      return this.field_4706;
   }

   public CompletableFuture<Void> method_4024(class_2654 var1) {
      return this.field_4712.method_34455(() -> var1.method_11993(this.field_4703));
   }
}
