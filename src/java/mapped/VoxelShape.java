package mapped;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class VoxelShape {
   public final Class7938 field28033;
   private VoxelShape[] field28034;

   public VoxelShape(Class7938 var1) {
      this.field28033 = var1;
   }

   public double method19512(Direction var1) {
      int var4 = this.field28033.method26720(var1);
      return var4 < this.field28033.method26732(var1) ? this.method19515(var1, var4) : Double.POSITIVE_INFINITY;
   }

   public double method19513(Direction var1) {
      int var4 = this.field28033.method26721(var1);
      return var4 > 0 ? this.method19515(var1, var4) : Double.NEGATIVE_INFINITY;
   }

   public AxisAlignedBB method19514() {
      if (!this.method19516()) {
         return new AxisAlignedBB(
            this.method19512(Direction.field413),
            this.method19512(Direction.field414),
            this.method19512(Direction.field415),
            this.method19513(Direction.field413),
            this.method19513(Direction.field414),
            this.method19513(Direction.field415)
         );
      } else {
         throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("No bounds for empty shape."));
      }
   }

   public double method19515(Direction var1, int var2) {
      return this.method19511(var1).getDouble(var2);
   }

   public abstract DoubleList method19511(Direction var1);

   public boolean method19516() {
      return this.field28033.method26719();
   }

   public VoxelShape withOffset(double var1, double var3, double var5) {
      return (VoxelShape)(!this.method19516()
         ? new Class6409(
            this.field28033,
            new Class54(this.method19511(Direction.field413), var1),
            new Class54(this.method19511(Direction.field414), var3),
            new Class54(this.method19511(Direction.field415), var5)
         )
         : VoxelShapes.method27425());
   }

   public VoxelShape method19518() {
      VoxelShape[] var3 = new VoxelShape[]{VoxelShapes.method27425()};
      this.method19520(
         (var1, var3x, var5, var7, var9, var11) -> var3[0] = VoxelShapes.method27434(
               var3[0], VoxelShapes.create(var1, var3x, var5, var7, var9, var11), IBooleanFunction.field44051
            )
      );
      return var3[0];
   }

   public void method19519(Class6807 var1) {
      this.field28033
         .method26736(
            (var2, var3, var4, var5, var6, var7) -> var1.method20739(
                  this.method19515(Direction.field413, var2),
                  this.method19515(Direction.field414, var3),
                  this.method19515(Direction.field415, var4),
                  this.method19515(Direction.field413, var5),
                  this.method19515(Direction.field414, var6),
                  this.method19515(Direction.field415, var7)
               ),
            true
         );
   }

   public void method19520(Class6807 var1) {
      DoubleList var4 = this.method19511(Direction.field413);
      DoubleList var5 = this.method19511(Direction.field414);
      DoubleList var6 = this.method19511(Direction.field415);
      this.field28033
         .method26739(
            (var4x, var5x, var6x, var7, var8, var9) -> var1.method20739(
                  var4.getDouble(var4x), var5.getDouble(var5x), var6.getDouble(var6x), var4.getDouble(var7), var5.getDouble(var8), var6.getDouble(var9)
               ),
            true
         );
   }

   public List<AxisAlignedBB> method19521() {
      ArrayList var3 = Lists.newArrayList();
      this.method19520((var1, var3x, var5, var7, var9, var11) -> var3.add(new AxisAlignedBB(var1, var3x, var5, var7, var9, var11)));
      return var3;
   }

   public double method19522(Direction var1, double var2, double var4) {
      Direction var8 = Class2321.field15905.method9099(var1);
      Direction var9 = Class2321.field15906.method9099(var1);
      int var10 = this.method19523(var8, var2);
      int var11 = this.method19523(var9, var4);
      int var12 = this.field28033.method26731(var1, var10, var11);
      return var12 > 0 ? this.method19515(var1, var12) : Double.NEGATIVE_INFINITY;
   }

   public int method19523(Direction var1, double var2) {
      return MathHelper.method37820(0, this.field28033.method26732(var1) + 1, var4 -> {
         if (var4 >= 0) {
            return var4 <= this.field28033.method26732(var1) ? var2 < this.method19515(var1, var4) : true;
         } else {
            return false;
         }
      }) - 1;
   }

   public boolean method19524(double var1, double var3, double var5) {
      return this.field28033
         .method26729(this.method19523(Direction.field413, var1), this.method19523(Direction.field414, var3), this.method19523(Direction.field415, var5));
   }

   @Nullable
   public BlockRayTraceResult method19525(Vector3d var1, Vector3d var2, BlockPos var3) {
      if (!this.method19516()) {
         Vector3d var6 = var2.method11336(var1);
         if (!(var6.lengthSquared() < 1.0E-7)) {
            Vector3d var7 = var1.add(var6.scale(0.001));
            return !this.method19524(
                  var7.x - (double)var3.getX(), var7.y - (double)var3.getY(), var7.z - (double)var3.getZ()
               )
               ? AxisAlignedBB.method19681(this.method19521(), var1, var2, var3)
               : new BlockRayTraceResult(var7, net.minecraft.util.Direction.method553(var6.x, var6.y, var6.z).method536(), var3, true);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public VoxelShape method19526(net.minecraft.util.Direction var1) {
      if (!this.method19516() && this != VoxelShapes.method27426()) {
         if (this.field28034 == null) {
            this.field28034 = new VoxelShape[6];
         } else {
            VoxelShape var4 = this.field28034[var1.ordinal()];
            if (var4 != null) {
               return var4;
            }
         }

         VoxelShape var5 = this.method19527(var1);
         this.field28034[var1.ordinal()] = var5;
         return var5;
      } else {
         return this;
      }
   }

   private VoxelShape method19527(net.minecraft.util.Direction var1) {
      Direction var4 = var1.getAxis();
      Class1892 var5 = var1.getAxisDirection();
      DoubleList var6 = this.method19511(var4);
      if (var6.size() == 2 && DoubleMath.fuzzyEquals(var6.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals(var6.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         int var7 = this.method19523(var4, var5 != Class1892.field11092 ? 1.0E-7 : 0.9999999);
         return new Class6407(this, var4, var7);
      }
   }

   public double method19528(Direction var1, AxisAlignedBB var2, double var3) {
      return this.method19529(Class2321.method9101(var1, Direction.field413), var2, var3);
   }

   public double method19529(Class2321 var1, AxisAlignedBB var2, double var3) {
      if (!this.method19516()) {
         if (Math.abs(var3) < 1.0E-7) {
            return 0.0;
         } else {
            Class2321 var7 = var1.method9100();
            Direction var8 = var7.method9099(Direction.field413);
            Direction var9 = var7.method9099(Direction.field414);
            Direction var10 = var7.method9099(Direction.field415);
            double var11 = var2.method19659(var8);
            double var13 = var2.method19658(var8);
            int var15 = this.method19523(var8, var13 + 1.0E-7);
            int var16 = this.method19523(var8, var11 - 1.0E-7);
            int var17 = Math.max(0, this.method19523(var9, var2.method19658(var9) + 1.0E-7));
            int var18 = Math.min(this.field28033.method26732(var9), this.method19523(var9, var2.method19659(var9) - 1.0E-7) + 1);
            int var19 = Math.max(0, this.method19523(var10, var2.method19658(var10) + 1.0E-7));
            int var20 = Math.min(this.field28033.method26732(var10), this.method19523(var10, var2.method19659(var10) - 1.0E-7) + 1);
            int var21 = this.field28033.method26732(var8);
            if (!(var3 > 0.0)) {
               if (var3 < 0.0) {
                  for (int var22 = var15 - 1; var22 >= 0; var22--) {
                     for (int var23 = var17; var23 < var18; var23++) {
                        for (int var24 = var19; var24 < var20; var24++) {
                           if (this.field28033.method26728(var7, var22, var23, var24)) {
                              double var25 = this.method19515(var8, var22 + 1) - var13;
                              if (var25 <= 1.0E-7) {
                                 var3 = Math.max(var3, var25);
                              }

                              return var3;
                           }
                        }
                     }
                  }
               }
            } else {
               for (int var27 = var16 + 1; var27 < var21; var27++) {
                  for (int var28 = var17; var28 < var18; var28++) {
                     for (int var29 = var19; var29 < var20; var29++) {
                        if (this.field28033.method26728(var7, var27, var28, var29)) {
                           double var30 = this.method19515(var8, var27) - var11;
                           if (var30 >= -1.0E-7) {
                              var3 = Math.min(var3, var30);
                           }

                           return var3;
                        }
                     }
                  }
               }
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @Override
   public String toString() {
      return !this.method19516() ? "VoxelShape[" + this.method19514() + "]" : "EMPTY";
   }
}
