package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

public class Class6606 implements ISpawnWorldInfo {
   private static String[] field29048;
   private final boolean field29049;
   private final Class5462 field29050;
   private final boolean field29051;
   private int field29052;
   private int field29053;
   private int field29054;
   private float field29055;
   private long field29056;
   private long field29057;
   private boolean field29058;
   private Difficulty field29059;
   private boolean field29060;

   public Class6606(Difficulty var1, boolean var2, boolean var3) {
      this.field29059 = var1;
      this.field29049 = var2;
      this.field29051 = var3;
      this.field29050 = new Class5462();
   }

   @Override
   public int method20029() {
      return this.field29052;
   }

   @Override
   public int method20030() {
      return this.field29053;
   }

   @Override
   public int method20031() {
      return this.field29054;
   }

   @Override
   public float method20032() {
      return this.field29055;
   }

   @Override
   public long method20033() {
      return this.field29056;
   }

   @Override
   public long method20034() {
      return this.field29057;
   }

   @Override
   public void method20035(int var1) {
      this.field29052 = var1;
   }

   @Override
   public void method20036(int var1) {
      this.field29053 = var1;
   }

   @Override
   public void method20037(int var1) {
      this.field29054 = var1;
   }

   @Override
   public void method20038(float var1) {
      this.field29055 = var1;
   }

   public void method20039(long var1) {
      this.field29056 = var1;
   }

   public void method20040(long var1) {
      this.field29057 = var1;
   }

   @Override
   public void method20041(BlockPos var1, float var2) {
      this.field29052 = var1.getX();
      this.field29053 = var1.getY();
      this.field29054 = var1.getZ();
      this.field29055 = var2;
   }

   @Override
   public boolean method20042() {
      return false;
   }

   @Override
   public boolean method20043() {
      return this.field29058;
   }

   @Override
   public void method20044(boolean var1) {
      this.field29058 = var1;
   }

   @Override
   public boolean isHardcore() {
      return this.field29049;
   }

   @Override
   public Class5462 method20046() {
      return this.field29050;
   }

   @Override
   public Difficulty method20047() {
      return this.field29059;
   }

   @Override
   public boolean method20048() {
      return this.field29060;
   }

   @Override
   public void method20049(CrashReportCategory var1) {
      ISpawnWorldInfo.super.method20049(var1);
   }

   public void method20050(Difficulty var1) {
      Reflector.field42855.method20229(var1, this.field29059);
      this.field29059 = var1;
   }

   public void method20051(boolean var1) {
      this.field29060 = var1;
   }

   public double method20052() {
      return !this.field29051 ? 63.0 : 0.0;
   }

   public double method20053() {
      return !this.field29051 ? 0.03125 : 1.0;
   }
}
