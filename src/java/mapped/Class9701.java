package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class Class9701 {
   private Entity field45345 = null;
   private double field45346 = 0.0;
   private double field45347 = -2.1474836E9F;
   private double field45348 = -2.1474836E9F;
   private double field45349 = -2.1474836E9F;
   private int field45350 = 0;
   private long field45351 = 0L;
   private Set<BlockPos> field45352 = new HashSet<BlockPos>();
   private Mutable field45353 = new Mutable();

   public Class9701(Entity var1) {
      this.field45345 = var1;
      this.field45346 = (double)var1.method3393();
   }

   public void method38008(WorldRenderer var1) {
      if (Class7944.method26971()) {
         long var4 = System.currentTimeMillis();
         if (var4 < this.field45351 + 500L) {
            return;
         }

         this.field45351 = var4;
      }

      double var39 = this.field45345.getPosX() - 0.5;
      double var6 = this.field45345.getPosY() - 0.5 + this.field45346;
      double var8 = this.field45345.getPosZ() - 0.5;
      int var10 = Class9446.method36319(this.field45345);
      double var11 = var39 - this.field45347;
      double var13 = var6 - this.field45348;
      double var15 = var8 - this.field45349;
      double var17 = 0.1;
      if (!(Math.abs(var11) <= var17) || !(Math.abs(var13) <= var17) || !(Math.abs(var15) <= var17) || this.field45350 != var10) {
         this.field45347 = var39;
         this.field45348 = var6;
         this.field45349 = var8;
         this.field45350 = var10;
         HashSet var19 = new HashSet();
         if (var10 > 0) {
            Direction var20 = (MathHelper.floor(var39) & 15) < 8 ? Direction.WEST : Direction.EAST;
            Direction var21 = (MathHelper.floor(var6) & 15) < 8 ? Direction.DOWN : Direction.field673;
            Direction var22 = (MathHelper.floor(var8) & 15) < 8 ? Direction.NORTH : Direction.SOUTH;
            BlockPos var23 = new BlockPos(var39, var6, var8);
            Class8066 var24 = var1.method929(var23);
            BlockPos var25 = this.method38009(var24, var23, var20);
            Class8066 var26 = var1.method929(var25);
            BlockPos var27 = this.method38009(var24, var23, var22);
            Class8066 var28 = var1.method929(var27);
            BlockPos var29 = this.method38009(var26, var25, var22);
            Class8066 var30 = var1.method929(var29);
            BlockPos var31 = this.method38009(var24, var23, var21);
            Class8066 var32 = var1.method929(var31);
            BlockPos var33 = this.method38009(var32, var31, var20);
            Class8066 var34 = var1.method929(var33);
            BlockPos var35 = this.method38009(var32, var31, var22);
            Class8066 var36 = var1.method929(var35);
            BlockPos var37 = this.method38009(var34, var33, var22);
            Class8066 var38 = var1.method929(var37);
            this.method38010(var24, this.field45352, var19);
            this.method38010(var26, this.field45352, var19);
            this.method38010(var28, this.field45352, var19);
            this.method38010(var30, this.field45352, var19);
            this.method38010(var32, this.field45352, var19);
            this.method38010(var34, this.field45352, var19);
            this.method38010(var36, this.field45352, var19);
            this.method38010(var38, this.field45352, var19);
         }

         this.method38011(var1);
         this.field45352 = var19;
      }
   }

   private BlockPos method38009(Class8066 var1, BlockPos var2, Direction var3) {
      return var1 == null ? var2.method8350(var3, 16) : var1.method27723(var3);
   }

   private void method38010(Class8066 var1, Set<BlockPos> var2, Set<BlockPos> var3) {
      if (var1 != null) {
         Class7457 var6 = var1.method27715();
         if (var6 != null && !var6.method24109()) {
            var1.method27719(false);
         }

         BlockPos var7 = var1.method27718().method8353();
         if (var2 != null) {
            var2.remove(var7);
         }

         if (var3 != null) {
            var3.add(var7);
         }
      }
   }

   public void method38011(WorldRenderer var1) {
      for (BlockPos var5 : this.field45352) {
         Class8066 var6 = var1.method929(var5);
         this.method38010(var6, (Set<BlockPos>)null, (Set<BlockPos>)null);
      }
   }

   public Entity method38012() {
      return this.field45345;
   }

   public double method38013() {
      return this.field45347;
   }

   public double method38014() {
      return this.field45348;
   }

   public double method38015() {
      return this.field45349;
   }

   public int method38016() {
      return this.field45350;
   }

   public double method38017() {
      return this.field45346;
   }

   @Override
   public String toString() {
      return "Entity: " + this.field45345 + ", offsetY: " + this.field45346;
   }
}
