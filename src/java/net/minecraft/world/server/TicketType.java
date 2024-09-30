package net.minecraft.world.server;

import mapped.Class2341;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.vector.Vector3i;

import java.util.Comparator;

public class TicketType<T> {
   private final String field38477;
   private final Comparator<T> field38478;
   private final long field38479;
   public static final TicketType<Class2341> field38480 = method30544("start", (var0, var1) -> 0);
   public static final TicketType<Class2341> field38481 = method30544("dragon", (var0, var1) -> 0);
   public static final TicketType<ChunkPos> field38482 = method30544("player", Comparator.<ChunkPos>comparingLong(ChunkPos::asLong));
   public static final TicketType<ChunkPos> FORCED = method30544("forced", Comparator.<ChunkPos>comparingLong(ChunkPos::asLong));
   public static final TicketType<ChunkPos> field38484 = method30544("light", Comparator.<ChunkPos>comparingLong(ChunkPos::asLong));
   public static final TicketType<BlockPos> field38485 = method30545("portal", Vector3i::compareTo, 300);
   public static final TicketType<Integer> field38486 = method30545("post_teleport", Integer::compareTo, 5);
   public static final TicketType<ChunkPos> field38487 = method30545("unknown", Comparator.<ChunkPos>comparingLong(ChunkPos::asLong), 1);

   public static <T> TicketType<T> method30544(String var0, Comparator<T> var1) {
      return new TicketType<T>(var0, var1, 0L);
   }

   public static <T> TicketType<T> method30545(String var0, Comparator<T> var1, int var2) {
      return new TicketType<T>(var0, var1, (long)var2);
   }

   public TicketType(String var1, Comparator<T> var2, long var3) {
      this.field38477 = var1;
      this.field38478 = var2;
      this.field38479 = var3;
   }

   @Override
   public String toString() {
      return this.field38477;
   }

   public Comparator<T> method30546() {
      return this.field38478;
   }

   public long method30547() {
      return this.field38479;
   }
}
