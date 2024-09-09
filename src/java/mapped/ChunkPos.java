package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ChunkPos {
   public static final long field32173 = method24353(1875016, 1875016);
   public int field32174;
   public int field32175;
   private int field32176 = 0;

   public ChunkPos(int var1, int var2) {
      this.field32174 = var1;
      this.field32175 = var2;
   }

   public ChunkPos(BlockPos var1) {
      this.field32174 = var1.getX() >> 4;
      this.field32175 = var1.getZ() >> 4;
   }

   public ChunkPos(long var1) {
      this.field32174 = (int)var1;
      this.field32175 = (int)(var1 >> 32);
   }

   public long method24352() {
      return method24353(this.field32174, this.field32175);
   }

   public static long method24353(int var0, int var1) {
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
      if (this.field32176 == 0) {
         int var3 = 1664525 * this.field32174 + 1013904223;
         int var4 = 1664525 * (this.field32175 ^ -559038737) + 1013904223;
         this.field32176 = var3 ^ var4;
         return this.field32176;
      } else {
         return this.field32176;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof ChunkPos)) {
            return false;
         } else {
            ChunkPos var4 = (ChunkPos)var1;
            return this.field32174 == var4.field32174 && this.field32175 == var4.field32175;
         }
      } else {
         return true;
      }
   }

   public int method24356() {
      return this.field32174 << 4;
   }

   public int method24357() {
      return this.field32175 << 4;
   }

   public int method24358() {
      return (this.field32174 << 4) + 15;
   }

   public int method24359() {
      return (this.field32175 << 4) + 15;
   }

   public int method24360() {
      return this.field32174 >> 5;
   }

   public int method24361() {
      return this.field32175 >> 5;
   }

   public int method24362() {
      return this.field32174 & 31;
   }

   public int method24363() {
      return this.field32175 & 31;
   }

   @Override
   public String toString() {
      return "[" + this.field32174 + ", " + this.field32175 + "]";
   }

   public BlockPos method24364() {
      return new BlockPos(this.method24356(), 0, this.method24357());
   }

   public int method24365(ChunkPos var1) {
      return Math.max(Math.abs(this.field32174 - var1.field32174), Math.abs(this.field32175 - var1.field32175));
   }

   public static Stream<ChunkPos> method24366(ChunkPos var0, int var1) {
      return method24367(new ChunkPos(var0.field32174 - var1, var0.field32175 - var1), new ChunkPos(var0.field32174 + var1, var0.field32175 + var1));
   }

   public static Stream<ChunkPos> method24367(ChunkPos var0, ChunkPos var1) {
      int var4 = Math.abs(var0.field32174 - var1.field32174) + 1;
      int var5 = Math.abs(var0.field32175 - var1.field32175) + 1;
      int var6 = var0.field32174 >= var1.field32174 ? -1 : 1;
      int var7 = var0.field32175 >= var1.field32175 ? -1 : 1;
      return StreamSupport.<ChunkPos>stream(new Class8182((long)(var4 * var5), 64, var0, var1, var7, var6), false);
   }
}
