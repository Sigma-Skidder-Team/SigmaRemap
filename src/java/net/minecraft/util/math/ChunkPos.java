package net.minecraft.util.math;

import org.jetbrains.annotations.Nullable;

import java.util.Spliterators;
import java.util.function.Consumer;
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

   public long asLong() {
      return asLong(this.x, this.z);
   }

   public static long asLong(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public static int getX(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public static int getZ(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   public int hashCode() {
      if (this.cachedHashCode != 0)
      {
         return this.cachedHashCode;
      }
      else
      {
         int i = 1664525 * this.x + 1013904223;
         int j = 1664525 * (this.z ^ -559038737) + 1013904223;
         this.cachedHashCode = i ^ j;
         return this.cachedHashCode;
      }
   }

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

   public BlockPos asBlockPos() {
      return new BlockPos(this.getX(), 0, this.getZ());
   }

   public int method24365(ChunkPos var1) {
      return Math.max(Math.abs(this.x - var1.x), Math.abs(this.z - var1.z));
   }

   public static Stream<ChunkPos> method24366(ChunkPos var0, int var1) {
      return getAllInBox(new ChunkPos(var0.x - var1, var0.z - var1), new ChunkPos(var0.x + var1, var0.z + var1));
   }

   public static Stream<ChunkPos> getAllInBox(ChunkPos start, ChunkPos end) {
      int i = Math.abs(start.x - end.x) + 1;
      int j = Math.abs(start.z - end.z) + 1;
      int k = start.x >= end.x ? -1 : 1;
      int l = start.z >= end.z ? -1 : 1;
      return StreamSupport.stream(new Spliterators.AbstractSpliterator<ChunkPos>((long)(i * j), 64)
      {
         @Nullable
         private ChunkPos current;
         public boolean tryAdvance(Consumer<? super ChunkPos > p_tryAdvance_1_)
         {
            if (this.current == null)
            {
               this.current = start;
            }
            else
            {
               int i1 = this.current.x;
               int j1 = this.current.z;

               if (i1 == end.x)
               {
                  if (j1 == end.z)
                  {
                     return false;
                  }

                  this.current = new ChunkPos(start.x, j1 + l);
               }
               else
               {
                  this.current = new ChunkPos(i1 + k, j1);
               }
            }

            p_tryAdvance_1_.accept(this.current);
            return true;
         }
      }, false);
   }
}
