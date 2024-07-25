package remapped;

import java.util.Iterator;

public class class_4274 implements Iterator<BlockPos> {
   private class_739 field_20694;
   private class_523 field_20700 = new class_523(0, 0, 0);
   private int field_20697 = 0;
   private int field_20691;
   private int field_20696;
   private int field_20698;
   private static final int field_20693 = 0;
   private static final int field_20692 = 1;
   private static final int field_20695 = 2;

   public class_4274(BlockPos var1, BlockPos var2, int var3, int var4) {
      boolean var7 = var1.getX() > var2.getX();
      boolean var8 = var1.getY() > var2.getY();
      boolean var9 = var1.getZ() > var2.getZ();
      var1 = this.method_19875(var1, var7, var8, var9);
      var2 = this.method_19875(var2, var7, var8, var9);
      this.field_20691 = !var7 ? 1 : -1;
      this.field_20696 = !var8 ? 1 : -1;
      this.field_20698 = !var9 ? 1 : -1;
      class_1343 var10 = new class_1343(
         (double)(var2.getX() - var1.getX()),
         (double)(var2.getY() - var1.getY()),
         (double)(var2.getZ() - var1.getZ())
      );
      class_1343 var11 = var10.method_6213();
      class_1343 var12 = new class_1343(1.0, 0.0, 0.0);
      double var13 = var11.method_6206(var12);
      double var15 = Math.abs(var13);
      class_1343 var17 = new class_1343(0.0, 1.0, 0.0);
      double var18 = var11.method_6206(var17);
      double var20 = Math.abs(var18);
      class_1343 var22 = new class_1343(0.0, 0.0, 1.0);
      double var23 = var11.method_6206(var22);
      double var25 = Math.abs(var23);
      if (var25 >= var20 && var25 >= var15) {
         this.field_20697 = 2;
         BlockPos var37 = new BlockPos(var1.getZ(), var1.getY() - var3, var1.getX() - var4);
         BlockPos var39 = new BlockPos(var2.getZ(), var1.getY() + var3 + 1, var1.getX() + var4 + 1);
         int var41 = var2.getZ() - var1.getZ();
         double var43 = (double)(var2.getY() - var1.getY()) / (1.0 * (double)var41);
         double var45 = (double)(var2.getX() - var1.getX()) / (1.0 * (double)var41);
         this.field_20694 = new class_739(var37, var39, var43, var45);
      } else if (var20 >= var15 && var20 >= var25) {
         this.field_20697 = 1;
         BlockPos var36 = new BlockPos(var1.getY(), var1.getX() - var3, var1.getZ() - var4);
         BlockPos var38 = new BlockPos(var2.getY(), var1.getX() + var3 + 1, var1.getZ() + var4 + 1);
         int var40 = var2.getY() - var1.getY();
         double var42 = (double)(var2.getX() - var1.getX()) / (1.0 * (double)var40);
         double var44 = (double)(var2.getZ() - var1.getZ()) / (1.0 * (double)var40);
         this.field_20694 = new class_739(var36, var38, var42, var44);
      } else {
         this.field_20697 = 0;
         BlockPos var27 = new BlockPos(var1.getX(), var1.getY() - var3, var1.getZ() - var4);
         BlockPos var28 = new BlockPos(var2.getX(), var1.getY() + var3 + 1, var1.getZ() + var4 + 1);
         int var29 = var2.getX() - var1.getX();
         double var30 = (double)(var2.getY() - var1.getY()) / (1.0 * (double)var29);
         double var32 = (double)(var2.getZ() - var1.getZ()) / (1.0 * (double)var29);
         this.field_20694 = new class_739(var27, var28, var30, var32);
      }
   }

   private BlockPos method_19875(BlockPos var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         var1 = new BlockPos(-var1.getX(), var1.getY(), var1.getZ());
      }

      if (var3) {
         var1 = new BlockPos(var1.getX(), -var1.getY(), var1.getZ());
      }

      if (var4) {
         var1 = new BlockPos(var1.getX(), var1.getY(), -var1.getZ());
      }

      return var1;
   }

   @Override
   public boolean hasNext() {
      return this.field_20694.hasNext();
   }

   public BlockPos next() {
      BlockPos var3 = this.field_20694.next();
      switch (this.field_20697) {
         case 0:
            this.field_20700
               .method_2548(var3.getX() * this.field_20691, var3.getY() * this.field_20696, var3.getZ() * this.field_20698);
            return this.field_20700;
         case 1:
            this.field_20700
               .method_2548(var3.getY() * this.field_20691, var3.getX() * this.field_20696, var3.getZ() * this.field_20698);
            return this.field_20700;
         case 2:
            this.field_20700
               .method_2548(var3.getZ() * this.field_20691, var3.getY() * this.field_20696, var3.getX() * this.field_20698);
            return this.field_20700;
         default:
            this.field_20700
               .method_2548(var3.getX() * this.field_20691, var3.getY() * this.field_20696, var3.getZ() * this.field_20698);
            return this.field_20700;
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not supported");
   }

   public static void main(String[] var0) {
      BlockPos var3 = new BlockPos(10, 20, 30);
      BlockPos var4 = new BlockPos(30, 40, 20);
      class_4274 var5 = new class_4274(var3, var4, 1, 1);

      while (var5.hasNext()) {
         BlockPos var6 = var5.next();
         System.out.println("" + var6);
      }
   }
}
