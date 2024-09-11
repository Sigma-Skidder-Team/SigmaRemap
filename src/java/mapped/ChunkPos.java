package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ChunkPos {
   public static final long SENTINEL = asLong(1875016, 1875016);
   public int x;
   public int z;
   private int cachedHashCode = 0;

   public ChunkPos(int var1, int var2) {
      this.x = var1;
      this.z = var2;
   }

   public ChunkPos(BlockPos var1) {
      this.x = var1.getX() >> 4;
      this.z = var1.getZ() >> 4;
   }

   public ChunkPos(long var1) {
      this.x = (int)var1;
      this.z = (int)(var1 >> 32);
   }

   public long method24352() {
      return asLong(this.x, this.z);
   }

   public static long asLong(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public static int method24354(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public static int method24355(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   @Override
   public int hashCode() {
      if (this.cachedHashCode == 0) {
         int var3 = 1664525 * this.x + 1013904223;
         int var4 = 1664525 * (this.z ^ -559038737) + 1013904223;
         this.cachedHashCode = var3 ^ var4;
         return this.cachedHashCode;
      } else {
         return this.cachedHashCode;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof ChunkPos)) {
            return false;
         } else {
            ChunkPos var4 = (ChunkPos)var1;
            return this.x == var4.x && this.z == var4.z;
         }
      } else {
         return true;
      }
   }

   public int getX() {
      return this.x << 4;
   }

   public int getZ() {
      return this.z << 4;
   }

   public int method24358() {
      return (this.x << 4) + 15;
   }

   public int method24359() {
      return (this.z << 4) + 15;
   }

   public int method24360() {
      return this.x >> 5;
   }

   public int method24361() {
      return this.z >> 5;
   }

   public int method24362() {
      return this.x & 31;
   }

   public int method24363() {
      return this.z & 31;
   }

   @Override
   public String toString() {
      return "[" + this.x + ", " + this.z + "]";
   }

   public BlockPos method24364() {
      return new BlockPos(this.getX(), 0, this.getZ());
   }

   public int method24365(ChunkPos var1) {
      return Math.max(Math.abs(this.x - var1.x), Math.abs(this.z - var1.z));
   }

   public static Stream<ChunkPos> method24366(ChunkPos var0, int var1) {
      return method24367(new ChunkPos(var0.x - var1, var0.z - var1), new ChunkPos(var0.x + var1, var0.z + var1));
   }

   public static Stream<ChunkPos> method24367(ChunkPos var0, ChunkPos var1) {
      int var4 = Math.abs(var0.x - var1.x) + 1;
      int var5 = Math.abs(var0.z - var1.z) + 1;
      int var6 = var0.x >= var1.x ? -1 : 1;
      int var7 = var0.z >= var1.z ? -1 : 1;
      return StreamSupport.<ChunkPos>stream(new Class8182((long)(var4 * var5), 64, var0, var1, var7, var6), false);
   }
}
