package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Iterator;

public class Class4558 implements Iterator<BlockPos> {
   private Class4545 field21985;
   private Class2001 field21986 = new Class2001(0, 0, 0);
   private int field21987 = 0;
   private int field21988;
   private int field21989;
   private int field21990;
   private static final int field21991 = 0;
   private static final int field21992 = 1;
   private static final int field21993 = 2;

   public Class4558(BlockPos var1, BlockPos var2, int var3, int var4) {
      boolean var7 = var1.getX() > var2.getX();
      boolean var8 = var1.getY() > var2.getY();
      boolean var9 = var1.getZ() > var2.getZ();
      var1 = this.method14498(var1, var7, var8, var9);
      var2 = this.method14498(var2, var7, var8, var9);
      this.field21988 = !var7 ? 1 : -1;
      this.field21989 = !var8 ? 1 : -1;
      this.field21990 = !var9 ? 1 : -1;
      Vector3d var10 = new Vector3d(
         (double)(var2.getX() - var1.getX()), (double)(var2.getY() - var1.getY()), (double)(var2.getZ() - var1.getZ())
      );
      Vector3d var11 = var10.method11333();
      Vector3d var12 = new Vector3d(1.0, 0.0, 0.0);
      double var13 = var11.dotProduct(var12);
      double var15 = Math.abs(var13);
      Vector3d var17 = new Vector3d(0.0, 1.0, 0.0);
      double var18 = var11.dotProduct(var17);
      double var20 = Math.abs(var18);
      Vector3d var22 = new Vector3d(0.0, 0.0, 1.0);
      double var23 = var11.dotProduct(var22);
      double var25 = Math.abs(var23);
      if (var25 >= var20 && var25 >= var15) {
         this.field21987 = 2;
         BlockPos var37 = new BlockPos(var1.getZ(), var1.getY() - var3, var1.getX() - var4);
         BlockPos var39 = new BlockPos(var2.getZ(), var1.getY() + var3 + 1, var1.getX() + var4 + 1);
         int var41 = var2.getZ() - var1.getZ();
         double var43 = (double)(var2.getY() - var1.getY()) / (1.0 * (double)var41);
         double var45 = (double)(var2.getX() - var1.getX()) / (1.0 * (double)var41);
         this.field21985 = new Class4545(var37, var39, var43, var45);
      } else if (var20 >= var15 && var20 >= var25) {
         this.field21987 = 1;
         BlockPos var36 = new BlockPos(var1.getY(), var1.getX() - var3, var1.getZ() - var4);
         BlockPos var38 = new BlockPos(var2.getY(), var1.getX() + var3 + 1, var1.getZ() + var4 + 1);
         int var40 = var2.getY() - var1.getY();
         double var42 = (double)(var2.getX() - var1.getX()) / (1.0 * (double)var40);
         double var44 = (double)(var2.getZ() - var1.getZ()) / (1.0 * (double)var40);
         this.field21985 = new Class4545(var36, var38, var42, var44);
      } else {
         this.field21987 = 0;
         BlockPos var27 = new BlockPos(var1.getX(), var1.getY() - var3, var1.getZ() - var4);
         BlockPos var28 = new BlockPos(var2.getX(), var1.getY() + var3 + 1, var1.getZ() + var4 + 1);
         int var29 = var2.getX() - var1.getX();
         double var30 = (double)(var2.getY() - var1.getY()) / (1.0 * (double)var29);
         double var32 = (double)(var2.getZ() - var1.getZ()) / (1.0 * (double)var29);
         this.field21985 = new Class4545(var27, var28, var30, var32);
      }
   }

   private BlockPos method14498(BlockPos var1, boolean var2, boolean var3, boolean var4) {
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
      return this.field21985.hasNext();
   }

   public BlockPos next() {
      BlockPos var3 = this.field21985.next();
      switch (this.field21987) {
         case 0:
            this.field21986.method8384(var3.getX() * this.field21988, var3.getY() * this.field21989, var3.getZ() * this.field21990);
            return this.field21986;
         case 1:
            this.field21986.method8384(var3.getY() * this.field21988, var3.getX() * this.field21989, var3.getZ() * this.field21990);
            return this.field21986;
         case 2:
            this.field21986.method8384(var3.getZ() * this.field21988, var3.getY() * this.field21989, var3.getX() * this.field21990);
            return this.field21986;
         default:
            this.field21986.method8384(var3.getX() * this.field21988, var3.getY() * this.field21989, var3.getZ() * this.field21990);
            return this.field21986;
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not supported");
   }

   public static void main(String[] var0) {
      BlockPos var3 = new BlockPos(10, 20, 30);
      BlockPos var4 = new BlockPos(30, 40, 20);
      Class4558 var5 = new Class4558(var3, var4, 1, 1);

      while (var5.hasNext()) {
         BlockPos var6 = var5.next();
         System.out.println("" + var6);
      }
   }
}
