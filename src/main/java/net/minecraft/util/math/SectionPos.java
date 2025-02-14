package net.minecraft.util.math;

import mapped.CubeCoordinateIterator;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3i;

import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SectionPos extends Vector3i {

   private SectionPos(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public static SectionPos of(int var0, int var1, int var2) {
      return new SectionPos(var0, var1, var2);
   }

   public static SectionPos from(BlockPos var0) {
      return new SectionPos(toChunk(var0.getX()), toChunk(var0.getY()), toChunk(var0.getZ()));
   }

   public static SectionPos from(ChunkPos var0, int var1) {
      return new SectionPos(var0.x, var1, var0.z);
   }

   public static SectionPos method8392(Entity var0) {
      return new SectionPos(
         toChunk(MathHelper.floor(var0.getPosX())),
         toChunk(MathHelper.floor(var0.getPosY())),
         toChunk(MathHelper.floor(var0.getPosZ()))
      );
   }

   public static SectionPos from(long var0) {
      return new SectionPos(extractX(var0), extractY(var0), extractZ(var0));
   }

   public static long withOffset(long var0, Direction var2) {
      return withOffset(var0, var2.getXOffset(), var2.getYOffset(), var2.getZOffset());
   }

   public static long withOffset(long var0, int var2, int var3, int var4) {
      return asLong(extractX(var0) + var2, extractY(var0) + var3, extractZ(var0) + var4);
   }

   public static int toChunk(int var0) {
      return var0 >> 4;
   }

   public static int mask(int var0) {
      return var0 & 15;
   }

   public static short toRelativeOffset(BlockPos var0) {
      int var3 = mask(var0.getX());
      int var4 = mask(var0.getY());
      int var5 = mask(var0.getZ());
      return (short)(var3 << 8 | var5 << 4 | var4 << 0);
   }

   public static int func_243641_a(short var0) {
      return var0 >>> 8 & 15;
   }

   public static int func_243642_b(short var0) {
      return var0 >>> 0 & 15;
   }

   public static int func_243643_c(short var0) {
      return var0 >>> 4 & 15;
   }

   public int func_243644_d(short var1) {
      return this.getWorldStartX() + func_243641_a(var1);
   }

   public int func_243645_e(short var1) {
      return this.getWorldStartY() + func_243642_b(var1);
   }

   public int func_243646_f(short var1) {
      return this.getWorldStartZ() + func_243643_c(var1);
   }

   public BlockPos func_243647_g(short var1) {
      return new BlockPos(this.func_243644_d(var1), this.func_243645_e(var1), this.func_243646_f(var1));
   }

   public static int toWorld(int var0) {
      return var0 << 4;
   }

   public static int extractX(long var0) {
      return (int)(var0 << 0 >> 42);
   }

   public static int extractY(long var0) {
      return (int)(var0 << 44 >> 44);
   }

   public static int extractZ(long var0) {
      return (int)(var0 << 22 >> 42);
   }

   public int getSectionX() {
      return this.getX();
   }

   public int getSectionY() {
      return this.getY();
   }

   public int getSectionZ() {
      return this.getZ();
   }

   public int getWorldStartX() {
      return this.getSectionX() << 4;
   }

   public int getWorldStartY() {
      return this.getSectionY() << 4;
   }

   public int getWorldStartZ() {
      return this.getSectionZ() << 4;
   }

   public int getWorldEndX() {
      return (this.getSectionX() << 4) + 15;
   }

   public int getWorldEndY() {
      return (this.getSectionY() << 4) + 15;
   }

   public int getWorldEndZ() {
      return (this.getSectionZ() << 4) + 15;
   }

   public static long worldToSection(long var0) {
      return asLong(toChunk(BlockPos.unpackX(var0)), toChunk(BlockPos.unpackY(var0)), toChunk(BlockPos.unpackZ(var0)));
   }

   public static long toSectionColumnPos(long var0) {
      return var0 & -1048576L;
   }

   public BlockPos asBlockPos() {
      return new BlockPos(toWorld(this.getSectionX()), toWorld(this.getSectionY()), toWorld(this.getSectionZ()));
   }

   public BlockPos getCenter() {
      return this.asBlockPos().add(8, 8, 8);
   }

   public ChunkPos asChunkPos() {
      return new ChunkPos(this.getSectionX(), this.getSectionZ());
   }

   public static long asLong(int var0, int var1, int var2) {
      long var5 = 0L;
      var5 = var5 | ((long)var0 & 4194303L) << 42;
      var5 = var5 | ((long)var1 & 1048575L) << 0;
      return var5 | ((long)var2 & 4194303L) << 20;
   }

   public long asLong() {
      return asLong(this.getSectionX(), this.getSectionY(), this.getSectionZ());
   }

   public Stream<BlockPos> allBlocksWithin()
   {
      return BlockPos.getAllInBox(this.getWorldStartX(), this.getWorldStartY(), this.getWorldStartZ(), this.getWorldEndX(), this.getWorldEndY(), this.getWorldEndZ());
   }

   public static Stream<SectionPos> getAllInBox(SectionPos center, int radius)
   {
      int i = center.getSectionX();
      int j = center.getSectionY();
      int k = center.getSectionZ();
      return getAllInBox(i - radius, j - radius, k - radius, i + radius, j + radius, k + radius);
   }

   public static Stream<SectionPos> func_229421_b_(ChunkPos p_229421_0_, int p_229421_1_)
   {
      int i = p_229421_0_.x;
      int j = p_229421_0_.z;
      return getAllInBox(i - p_229421_1_, 0, j - p_229421_1_, i + p_229421_1_, 15, j + p_229421_1_);
   }

   public static Stream<SectionPos> getAllInBox(final int p_218168_0_, final int p_218168_1_, final int p_218168_2_, final int p_218168_3_, final int p_218168_4_, final int p_218168_5_)
   {
      return StreamSupport.stream(new Spliterators.AbstractSpliterator<SectionPos>((long)((p_218168_3_ - p_218168_0_ + 1) * (p_218168_4_ - p_218168_1_ + 1) * (p_218168_5_ - p_218168_2_ + 1)), 64)
      {
         final CubeCoordinateIterator field_218394_a = new CubeCoordinateIterator(p_218168_0_, p_218168_1_, p_218168_2_, p_218168_3_, p_218168_4_, p_218168_5_);
         public boolean tryAdvance(Consumer<? super SectionPos > p_tryAdvance_1_)
         {
            if (this.field_218394_a.hasNext())
            {
               p_tryAdvance_1_.accept(new SectionPos(this.field_218394_a.getX(), this.field_218394_a.getY(), this.field_218394_a.getZ()));
               return true;
            }
            else
            {
               return false;
            }
         }
      }, false);
   }
}
