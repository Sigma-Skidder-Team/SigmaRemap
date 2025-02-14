package net.minecraft.util.math;

import mapped.RayTraceResult;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3d;

public class BlockRayTraceResult extends RayTraceResult {
   private static String[] field39317;
   private final Direction field39318;
   private final BlockPos field39319;
   private final boolean field39320;
   private final boolean field39321;

   public static BlockRayTraceResult createMiss(Vector3d var0, Direction var1, BlockPos var2) {
      return new BlockRayTraceResult(true, var0, var1, var2, false);
   }

   public BlockRayTraceResult(Vector3d var1, Direction var2, BlockPos var3, boolean var4) {
      this(false, var1, var2, var3, var4);
   }

   private BlockRayTraceResult(boolean var1, Vector3d var2, Direction var3, BlockPos var4, boolean var5) {
      super(var2);
      this.field39320 = var1;
      this.field39318 = var3;
      this.field39319 = var4;
      this.field39321 = var5;
   }

   public BlockRayTraceResult method31421(Direction var1) {
      return new BlockRayTraceResult(this.field39320, this.vec, var1, this.field39319, this.field39321);
   }

   public BlockRayTraceResult method31422(BlockPos var1) {
      return new BlockRayTraceResult(this.field39320, this.vec, this.field39318, var1, this.field39321);
   }

   public BlockPos getPos() {
      return this.field39319;
   }

   public Direction getFace() {
      return this.field39318;
   }

   @Override
   public Type getType() {
      return !this.field39320 ? Type.BLOCK : Type.MISS;
   }

   public boolean isInside() {
      return this.field39321;
   }
}
