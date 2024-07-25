package remapped;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class class_6979 extends Vector3i {
   private static String[] field_35842;

   private class_6979(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public static class_6979 method_31893(int var0, int var1, int var2) {
      return new class_6979(var0, var1, var2);
   }

   public static class_6979 method_31921(BlockPos var0) {
      return new class_6979(method_31915(var0.getX()), method_31915(var0.method_12165()), method_31915(var0.method_12185()));
   }

   public static class_6979 method_31922(class_2034 var0, int var1) {
      return new class_6979(var0.field_10328, var1, var0.field_10327);
   }

   public static class_6979 method_31923(Entity var0) {
      return new class_6979(
         method_31915(MathHelper.floor(var0.getPosX())),
         method_31915(MathHelper.floor(var0.method_37309())),
         method_31915(MathHelper.floor(var0.getPosZ()))
      );
   }

   public static class_6979 method_31920(long var0) {
      return new class_6979(method_31895(var0), method_31929(var0), method_31916(var0));
   }

   public static long method_31928(long var0, Direction var2) {
      return method_31927(var0, var2.method_1041(), var2.method_1054(), var2.method_1034());
   }

   public static long method_31927(long var0, int var2, int var3, int var4) {
      return method_31926(method_31895(var0) + var2, method_31929(var0) + var3, method_31916(var0) + var4);
   }

   public static int method_31915(int var0) {
      return var0 >> 4;
   }

   public static int method_31913(int var0) {
      return var0 & 15;
   }

   public static short method_31909(BlockPos var0) {
      int var3 = method_31913(var0.getX());
      int var4 = method_31913(var0.method_12165());
      int var5 = method_31913(var0.method_12185());
      return (short)(var3 << 8 | var5 << 4 | var4 << 0);
   }

   public static int method_31912(short var0) {
      return var0 >>> 8 & 15;
   }

   public static int method_31890(short var0) {
      return var0 >>> 0 & 15;
   }

   public static int method_31911(short var0) {
      return var0 >>> 4 & 15;
   }

   public int method_31896(short var1) {
      return this.method_31898() + method_31912(var1);
   }

   public int method_31897(short var1) {
      return this.method_31924() + method_31890(var1);
   }

   public int method_31907(short var1) {
      return this.method_31901() + method_31911(var1);
   }

   public BlockPos method_31904(short var1) {
      return new BlockPos(this.method_31896(var1), this.method_31897(var1), this.method_31907(var1));
   }

   public static int method_31908(int var0) {
      return var0 << 4;
   }

   public static int method_31895(long var0) {
      return (int)(var0 << 0 >> 42);
   }

   public static int method_31929(long var0) {
      return (int)(var0 << 44 >> 44);
   }

   public static int method_31916(long var0) {
      return (int)(var0 << 22 >> 42);
   }

   public int method_31930() {
      return this.getX();
   }

   public int method_31918() {
      return this.method_12165();
   }

   public int method_31900() {
      return this.method_12185();
   }

   public int method_31898() {
      return this.method_31930() << 4;
   }

   public int method_31924() {
      return this.method_31918() << 4;
   }

   public int method_31901() {
      return this.method_31900() << 4;
   }

   public int method_31894() {
      return (this.method_31930() << 4) + 15;
   }

   public int method_31914() {
      return (this.method_31918() << 4) + 15;
   }

   public int method_31919() {
      return (this.method_31900() << 4) + 15;
   }

   public static long method_31903(long var0) {
      return method_31926(method_31915(BlockPos.method_6080(var0)), method_31915(BlockPos.method_6067(var0)), method_31915(BlockPos.method_6092(var0)));
   }

   public static long method_31910(long var0) {
      return var0 & -1048576L;
   }

   public BlockPos method_31899() {
      return new BlockPos(method_31908(this.method_31930()), method_31908(this.method_31918()), method_31908(this.method_31900()));
   }

   public BlockPos method_31892() {
      byte var3 = 8;
      return this.method_31899().method_6104(8, 8, 8);
   }

   public class_2034 method_31917() {
      return new class_2034(this.method_31930(), this.method_31900());
   }

   public static long method_31926(int var0, int var1, int var2) {
      long var5 = 0L;
      var5 |= ((long)var0 & 4194303L) << 42;
      var5 |= ((long)var1 & 1048575L) << 0;
      return var5 | ((long)var2 & 4194303L) << 20;
   }

   public long method_31925() {
      return method_31926(this.method_31930(), this.method_31918(), this.method_31900());
   }

   public Stream<BlockPos> method_31902() {
      return BlockPos.method_6083(
         this.method_31898(), this.method_31924(), this.method_31901(), this.method_31894(), this.method_31914(), this.method_31919()
      );
   }

   public static Stream<class_6979> method_31906(class_6979 var0, int var1) {
      int var4 = var0.method_31930();
      int var5 = var0.method_31918();
      int var6 = var0.method_31900();
      return method_31905(var4 - var1, var5 - var1, var6 - var1, var4 + var1, var5 + var1, var6 + var1);
   }

   public static Stream<class_6979> method_31891(class_2034 var0, int var1) {
      int var4 = var0.field_10328;
      int var5 = var0.field_10327;
      return method_31905(var4 - var1, 0, var5 - var1, var4 + var1, 15, var5 + var1);
   }

   public static Stream<class_6979> method_31905(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.<class_6979>stream(
         new class_5044((long)((var3 - var0 + 1) * (var4 - var1 + 1) * (var5 - var2 + 1)), 64, var0, var1, var2, var3, var4, var5), false
      );
   }
}
