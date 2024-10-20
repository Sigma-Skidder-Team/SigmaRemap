package net.minecraft.world.server;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.ChunkTaskPriorityQueueSorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class TicketManager {
   private static final Logger field43204 = LogManager.getLogger();
   private static final int field43205 = 33 + ChunkStatus.getDistance(ChunkStatus.FULL) - 2;
   private final Long2ObjectMap<ObjectSet<ServerPlayerEntity>> field43206 = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<SortedArraySet<Ticket<?>>> field43207 = new Long2ObjectOpenHashMap();
   private final Class204 ticketTracker = new Class204(this);
   private final Class205 field43209 = new Class205(this, 8);
   private final Class206 field43210 = new Class206(this, 65);
   private final Set<ChunkHolder> field43211 = Sets.newHashSet();
   private final ChunkTaskPriorityQueueSorter field43212;
   private final Class321<ChunkTaskPriorityQueueSorter.FunctionEntry<Runnable>> field43213;
   private final Class321<ChunkTaskPriorityQueueSorter.RunnableEntry> field43214;
   private final LongSet field43215 = new LongOpenHashSet();
   private final Executor field43216;
   private long currentTime;

   public TicketManager(Executor var1, Executor var2) {
      Class321 var5 = Class321.<Runnable>method1648("player ticket throttler", var2::execute);
      ChunkTaskPriorityQueueSorter var6 = new ChunkTaskPriorityQueueSorter(ImmutableList.of(var5), var1, 4);
      this.field43212 = var6;
      this.field43213 = var6.<Runnable>method7963(var5, true);
      this.field43214 = var6.method7964(var5);
      this.field43216 = var2;
   }

   public void method35123() {
      this.currentTime++;
      ObjectIterator<Entry<SortedArraySet<Ticket<?>>>> var3 = this.field43207.long2ObjectEntrySet().fastIterator();

      while (var3.hasNext()) {
         Entry<SortedArraySet<Ticket<?>>> var4 = var3.next();
         if (var4.getValue().removeIf(var1 -> var1.method8487(this.currentTime))) {
            this.ticketTracker.updateSourceLevel(var4.getLongKey(), getLevel(var4.getValue()), false);
         }

         if (var4.getValue().isEmpty()) {
            var3.remove();
         }
      }
   }

   private static int getLevel(SortedArraySet<Ticket<?>> var0) {
      return var0.isEmpty() ? ChunkManager.MAX_LOADED_LEVEL + 1 : ((Ticket)var0.getSmallest()).getLevel();
   }

   public abstract boolean method35120(long var1);

   @Nullable
   public abstract ChunkHolder method35121(long var1);

   @Nullable
   public abstract ChunkHolder method35122(long var1, int var3, ChunkHolder var4, int var5);

   public boolean method35125(ChunkManager var1) {
      this.field43209.method684();
      this.field43210.method684();
      int var4 = Integer.MAX_VALUE - this.ticketTracker.method681(Integer.MAX_VALUE);
      boolean var5 = var4 != 0;
      if (!var5) {
      }

      if (!this.field43211.isEmpty()) {
         this.field43211.forEach(var1x -> var1x.method31061(var1));
         this.field43211.clear();
         return true;
      } else {
         if (!this.field43215.isEmpty()) {
            LongIterator var6 = this.field43215.iterator();

            while (var6.hasNext()) {
               long var7 = var6.nextLong();
               if (this.getTicketSet(var7).stream().anyMatch(var0 -> var0.method8484() == TicketType.PLAYER)) {
                  ChunkHolder var9 = var1.func_219220_a(var7);
                  if (var9 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture var10 = var9.method31041();
                  var10.thenAccept(var3 -> this.field43216.execute(() -> this.field43214.enqueue(ChunkTaskPriorityQueueSorter.method7962(() -> {
                        }, var7, false))));
               }
            }

            this.field43215.clear();
         }

         return var5;
      }
   }

   private void register(long var1, Ticket<?> var3) {
      SortedArraySet<Ticket<?>> var6 = this.getTicketSet(var1);
      int var7 = getLevel(var6);
      Ticket<?> var8 = var6.func_226175_a_(var3);
      var8.setTimestamp(this.currentTime);
      if (var3.getLevel() < var7) {
         this.ticketTracker.updateSourceLevel(var1, var3.getLevel(), true);
      }
   }

   private void release(long chunkPosIn, Ticket<?> ticketIn) {
      SortedArraySet < Ticket<? >>sortedarrayset = this.getTicketSet(chunkPosIn);

      if (sortedarrayset.isEmpty()) {
         this.field43207.remove(chunkPosIn);
      }

      this.ticketTracker.updateSourceLevel(chunkPosIn, getLevel(sortedarrayset), false);
   }

   public <T> void registerWithLevel(TicketType<T> var1, ChunkPos var2, int var3, T var4) {
      this.register(var2.asLong(), new Ticket(var1, var3, var4));
   }

   public <T> void releaseWithLevel(TicketType<T> var1, ChunkPos var2, int var3, T var4) {
      Ticket var7 = new Ticket(var1, var3, var4);
      this.release(var2.asLong(), var7);
   }

   public <T> void release(TicketType<T> var1, ChunkPos var2, int var3, T var4) {
      this.register(var2.asLong(), new Ticket(var1, 33 - var3, var4));
   }

   public <T> void register(TicketType<T> var1, ChunkPos var2, int var3, T var4) {
      Ticket var7 = new Ticket(var1, 33 - var3, var4);
      this.release(var2.asLong(), var7);
   }

   private SortedArraySet<Ticket<?>> getTicketSet(long var1) {
      return (SortedArraySet<Ticket<?>>)this.field43207.computeIfAbsent(var1, var0 -> SortedArraySet.newSet(4));
   }

   public void forceChunk(ChunkPos var1, boolean var2) {
      Ticket var5 = new Ticket<ChunkPos>(TicketType.FORCED, 31, var1);
      if (!var2) {
         this.release(var1.asLong(), var5);
      } else {
         this.register(var1.asLong(), var5);
      }
   }

   public void method35134(SectionPos var1, ServerPlayerEntity var2) {
      long var5 = var1.method8423().asLong();
      ((ObjectSet)this.field43206.computeIfAbsent(var5, var0 -> new ObjectOpenHashSet())).add(var2);
      this.field43209.updateSourceLevel(var5, 0, true);
      this.field43210.updateSourceLevel(var5, 0, true);
   }

   public void method35135(SectionPos var1, ServerPlayerEntity var2) {
      long var5 = var1.method8423().asLong();
      ObjectSet var7 = (ObjectSet)this.field43206.get(var5);
      var7.remove(var2);
      if (var7.isEmpty()) {
         this.field43206.remove(var5);
         this.field43209.updateSourceLevel(var5, Integer.MAX_VALUE, false);
         this.field43210.updateSourceLevel(var5, Integer.MAX_VALUE, false);
      }
   }

   public String method35136(long var1) {
      SortedArraySet var5 = (SortedArraySet)this.field43207.get(var1);
      String var6;
      if (var5 != null && !var5.isEmpty()) {
         var6 = ((Ticket)var5.getSmallest()).toString();
      } else {
         var6 = "no_ticket";
      }

      return var6;
   }

   public void method35137(int var1) {
      this.field43210.method685(var1);
   }

   public int method35138() {
      this.field43209.method684();
      return this.field43209.field762.size();
   }

   public boolean method35139(long var1) {
      this.field43209.method684();
      return this.field43209.field762.containsKey(var1);
   }

   public String method35140() {
      return this.field43212.method7970();
   }

   // $VF: synthetic method
   public static Long2ObjectOpenHashMap method35149(TicketManager var0) {
      return var0.field43207;
   }

   // $VF: synthetic method
   public static Set method35150(TicketManager var0) {
      return var0.field43211;
   }

   // $VF: synthetic method
   public static Long2ObjectMap method35151(TicketManager var0) {
      return var0.field43206;
   }

   // $VF: synthetic method
   public static int method35152() {
      return field43205;
   }

   // $VF: synthetic method
   public static Class321 method35153(TicketManager var0) {
      return var0.field43213;
   }

   // $VF: synthetic method
   public static Class321 method35154(TicketManager var0) {
      return var0.field43214;
   }

   // $VF: synthetic method
   public static ChunkTaskPriorityQueueSorter method35155(TicketManager var0) {
      return var0.field43212;
   }

   // $VF: synthetic method
   public static Executor method35156(TicketManager var0) {
      return var0.field43216;
   }

   // $VF: synthetic method
   public static void method35157(TicketManager var0, long var1, Ticket var3) {
      var0.release(var1, var3);
   }

   // $VF: synthetic method
   public static void method35158(TicketManager var0, long var1, Ticket var3) {
      var0.register(var1, var3);
   }

   // $VF: synthetic method
   public static LongSet method35159(TicketManager var0) {
      return var0.field43215;
   }
}
