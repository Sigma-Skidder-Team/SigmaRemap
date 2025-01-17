package net.minecraft.util.math;

import mapped.Class8180;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3i;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SectionPos extends Vector3i {
   private static String[] field13048;

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
      return new SectionPos(method8407(var0), method8408(var0), method8409(var0));
   }

   public static long method8394(long var0, Direction var2) {
      return method8395(var0, var2.getXOffset(), var2.getYOffset(), var2.getZOffset());
   }

   public static long method8395(long var0, int var2, int var3, int var4) {
      return asLong(method8407(var0) + var2, method8408(var0) + var3, method8409(var0) + var4);
   }

   public static int toChunk(int var0) {
      return var0 >> 4;
   }

   public static int mask(int var0) {
      return var0 & 15;
   }

   public static short method8398(BlockPos var0) {
      int var3 = mask(var0.getX());
      int var4 = mask(var0.getY());
      int var5 = mask(var0.getZ());
      return (short)(var3 << 8 | var5 << 4 | var4 << 0);
   }

   public static int method8399(short var0) {
      return var0 >>> 8 & 15;
   }

   public static int method8400(short var0) {
      return var0 >>> 0 & 15;
   }

   public static int method8401(short var0) {
      return var0 >>> 4 & 15;
   }

   public int method8402(short var1) {
      return this.method8413() + method8399(var1);
   }

   public int method8403(short var1) {
      return this.method8414() + method8400(var1);
   }

   public int method8404(short var1) {
      return this.method8415() + method8401(var1);
   }

   public BlockPos method8405(short var1) {
      return new BlockPos(this.method8402(var1), this.method8403(var1), this.method8404(var1));
   }

   public static int method8406(int var0) {
      return var0 << 4;
   }

   public static int method8407(long var0) {
      return (int)(var0 << 0 >> 42);
   }

   public static int method8408(long var0) {
      return (int)(var0 << 44 >> 44);
   }

   public static int method8409(long var0) {
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

   public int method8413() {
      return this.getSectionX() << 4;
   }

   public int method8414() {
      return this.getSectionY() << 4;
   }

   public int method8415() {
      return this.getSectionZ() << 4;
   }

   public int method8416() {
      return (this.getSectionX() << 4) + 15;
   }

   public int method8417() {
      return (this.getSectionY() << 4) + 15;
   }

   public int method8418() {
      return (this.getSectionZ() << 4) + 15;
   }

   public static long worldToSection(long var0) {
      return asLong(toChunk(BlockPos.unpackX(var0)), toChunk(BlockPos.unpackY(var0)), toChunk(BlockPos.unpackZ(var0)));
   }

   public static long toSectionColumnPos(long var0) {
      return var0 & -1048576L;
   }

   public BlockPos method8421() {
      return new BlockPos(method8406(this.getSectionX()), method8406(this.getSectionY()), method8406(this.getSectionZ()));
   }

   public BlockPos method8422() {
      return this.method8421().add(8, 8, 8);
   }

   public ChunkPos method8423() {
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

   public Stream<BlockPos> method8426() {
      return BlockPos.method8363(this.method8413(), this.method8414(), this.method8415(), this.method8416(), this.method8417(), this.method8418());
   }

   public static Stream<SectionPos> method8427(SectionPos var0, int var1) {
      int var4 = var0.getSectionX();
      int var5 = var0.getSectionY();
      int var6 = var0.getSectionZ();
      return method8429(var4 - var1, var5 - var1, var6 - var1, var4 + var1, var5 + var1, var6 + var1);
   }

   public static Stream<SectionPos> method8428(ChunkPos var0, int var1) {
      int var4 = var0.x;
      int var5 = var0.z;
      return method8429(var4 - var1, 0, var5 - var1, var4 + var1, 15, var5 + var1);
   }

   public static Stream<SectionPos> method8429(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.<SectionPos>stream(
         new Class8180((long)((var3 - var0 + 1) * (var4 - var1 + 1) * (var5 - var2 + 1)), 64, var0, var1, var2, var3, var4, var5), false
      );
   }

   // $VF: synthetic method
   public SectionPos(int var1, int var2, int var3, Class8180 var4) {
      this(var1, var2, var3);
   }
}
