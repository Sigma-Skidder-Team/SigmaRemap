package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_9396 {
   private Entity field_48018 = null;
   private double field_48010 = 0.0;
   private double field_48016 = -2.1474836E9F;
   private double field_48015 = -2.1474836E9F;
   private double field_48012 = -2.1474836E9F;
   private int field_48011 = 0;
   private long field_48017 = 0L;
   private Set<BlockPos> field_48013 = new HashSet<BlockPos>();
   private class_2921 field_48014 = new class_2921();

   public class_9396(Entity var1) {
      this.field_48018 = var1;
      this.field_48010 = (double)var1.method_37277();
   }

   public void method_43470(WorldRenderer var1) {
      if (Config.method_14278()) {
         long var4 = System.currentTimeMillis();
         if (var4 < this.field_48017 + 500L) {
            return;
         }

         this.field_48017 = var4;
      }

      double var39 = this.field_48018.getPosX() - 0.5;
      double var6 = this.field_48018.method_37309() - 0.5 + this.field_48010;
      double var8 = this.field_48018.getPosZ() - 0.5;
      int var10 = class_8421.method_38772(this.field_48018);
      double var11 = var39 - this.field_48016;
      double var13 = var6 - this.field_48015;
      double var15 = var8 - this.field_48012;
      double var17 = 0.1;
      if (!(Math.abs(var11) <= var17) || !(Math.abs(var13) <= var17) || !(Math.abs(var15) <= var17) || this.field_48011 != var10) {
         this.field_48016 = var39;
         this.field_48015 = var6;
         this.field_48012 = var8;
         this.field_48011 = var10;
         HashSet var19 = new HashSet();
         if (var10 > 0) {
            Direction var20 = (MathHelper.floor(var39) & 15) < 8 ? Direction.field_809 : Direction.field_804;
            Direction var21 = (MathHelper.floor(var6) & 15) < 8 ? Direction.field_802 : Direction.field_817;
            Direction var22 = (MathHelper.floor(var8) & 15) < 8 ? Direction.field_818 : Direction.field_800;
            BlockPos var23 = new BlockPos(var39, var6, var8);
            class_3511 var24 = var1.method_20068(var23);
            BlockPos var25 = this.method_43477(var24, var23, var20);
            class_3511 var26 = var1.method_20068(var25);
            BlockPos var27 = this.method_43477(var24, var23, var22);
            class_3511 var28 = var1.method_20068(var27);
            BlockPos var29 = this.method_43477(var26, var25, var22);
            class_3511 var30 = var1.method_20068(var29);
            BlockPos var31 = this.method_43477(var24, var23, var21);
            class_3511 var32 = var1.method_20068(var31);
            BlockPos var33 = this.method_43477(var32, var31, var20);
            class_3511 var34 = var1.method_20068(var33);
            BlockPos var35 = this.method_43477(var32, var31, var22);
            class_3511 var36 = var1.method_20068(var35);
            BlockPos var37 = this.method_43477(var34, var33, var22);
            class_3511 var38 = var1.method_20068(var37);
            this.method_43469(var24, this.field_48013, var19);
            this.method_43469(var26, this.field_48013, var19);
            this.method_43469(var28, this.field_48013, var19);
            this.method_43469(var30, this.field_48013, var19);
            this.method_43469(var32, this.field_48013, var19);
            this.method_43469(var34, this.field_48013, var19);
            this.method_43469(var36, this.field_48013, var19);
            this.method_43469(var38, this.field_48013, var19);
         }

         this.method_43473(var1);
         this.field_48013 = var19;
      }
   }

   private BlockPos method_43477(class_3511 var1, BlockPos var2, Direction var3) {
      return var1 == null ? var2.method_6099(var3, 16) : var1.method_16143(var3);
   }

   private void method_43469(class_3511 var1, Set<BlockPos> var2, Set<BlockPos> var3) {
      if (var1 != null) {
         class_8845 var6 = var1.method_16150();
         if (var6 != null && !var6.method_40691()) {
            var1.method_16169(false);
         }

         BlockPos var7 = var1.method_16189().method_6072();
         if (var2 != null) {
            var2.remove(var7);
         }

         if (var3 != null) {
            var3.add(var7);
         }
      }
   }

   public void method_43473(WorldRenderer var1) {
      for (BlockPos var5 : this.field_48013) {
         class_3511 var6 = var1.method_20068(var5);
         this.method_43469(var6, (Set<BlockPos>)null, (Set<BlockPos>)null);
      }
   }

   public Entity method_43471() {
      return this.field_48018;
   }

   public double method_43472() {
      return this.field_48016;
   }

   public double method_43475() {
      return this.field_48015;
   }

   public double method_43468() {
      return this.field_48012;
   }

   public int method_43476() {
      return this.field_48011;
   }

   public double method_43474() {
      return this.field_48010;
   }

   @Override
   public String toString() {
      return "Entity: " + this.field_48018 + ", offsetY: " + this.field_48010;
   }
}
