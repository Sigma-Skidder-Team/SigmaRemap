package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShapePart;

import java.util.BitSet;

public final class Class7937 extends VoxelShapePart {
   private static String[] field34028;
   private final BitSet field34029;
   private int field34030;
   private int field34031;
   private int field34032;
   private int field34033;
   private int field34034;
   private int field34035;

   public Class7937(int var1, int var2, int var3) {
      this(var1, var2, var3, var1, var2, var3, 0, 0, 0);
   }

   public Class7937(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3);
      this.field34029 = new BitSet(var1 * var2 * var3);
      this.field34030 = var4;
      this.field34031 = var5;
      this.field34032 = var6;
      this.field34033 = var7;
      this.field34034 = var8;
      this.field34035 = var9;
   }

   public Class7937(VoxelShapePart var1) {
      super(var1.field34037, var1.field34038, var1.field34039);
      if (!(var1 instanceof Class7937)) {
         this.field34029 = new BitSet(this.field34037 * this.field34038 * this.field34039);

         for (int var4 = 0; var4 < this.field34037; var4++) {
            for (int var5 = 0; var5 < this.field34038; var5++) {
               for (int var6 = 0; var6 < this.field34039; var6++) {
                  if (var1.method26717(var4, var5, var6)) {
                     this.field34029.set(this.method26716(var4, var5, var6));
                  }
               }
            }
         }
      } else {
         this.field34029 = (BitSet)((Class7937)var1).field34029.clone();
      }

      this.field34030 = var1.method26720(Direction.Axis.X);
      this.field34031 = var1.method26720(Direction.Axis.Y);
      this.field34032 = var1.method26720(Direction.Axis.Z);
      this.field34033 = var1.method26721(Direction.Axis.X);
      this.field34034 = var1.method26721(Direction.Axis.Y);
      this.field34035 = var1.method26721(Direction.Axis.Z);
   }

   public int method26716(int var1, int var2, int var3) {
      return (var1 * this.field34038 + var2) * this.field34039 + var3;
   }

   @Override
   public boolean method26717(int var1, int var2, int var3) {
      return this.field34029.get(this.method26716(var1, var2, var3));
   }

   @Override
   public void method26718(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.field34029.set(this.method26716(var1, var2, var3), var5);
      if (var4 && var5) {
         this.field34030 = Math.min(this.field34030, var1);
         this.field34031 = Math.min(this.field34031, var2);
         this.field34032 = Math.min(this.field34032, var3);
         this.field34033 = Math.max(this.field34033, var1 + 1);
         this.field34034 = Math.max(this.field34034, var2 + 1);
         this.field34035 = Math.max(this.field34035, var3 + 1);
      }
   }

   @Override
   public boolean method26719() {
      return this.field34029.isEmpty();
   }

   @Override
   public int method26720(Direction.Axis var1) {
      return var1.method327(this.field34030, this.field34031, this.field34032);
   }

   @Override
   public int method26721(Direction.Axis var1) {
      return var1.method327(this.field34033, this.field34034, this.field34035);
   }

   @Override
   public boolean method26722(int var1, int var2, int var3, int var4) {
      if (var3 < 0 || var4 < 0 || var1 < 0) {
         return false;
      } else {
         return var3 < this.field34037 && var4 < this.field34038 && var2 <= this.field34039
            ? this.field34029.nextClearBit(this.method26716(var3, var4, var1)) >= this.method26716(var3, var4, var2)
            : false;
      }
   }

   @Override
   public void method26723(int var1, int var2, int var3, int var4, boolean var5) {
      this.field34029.set(this.method26716(var3, var4, var1), this.method26716(var3, var4, var2), var5);
   }

   public static Class7937 method26724(VoxelShapePart var0, VoxelShapePart var1, Class56 var2, Class56 var3, Class56 var4, IBooleanFunction var5) {
      Class7937 var8 = new Class7937(var2.method194().size() - 1, var3.method194().size() - 1, var4.method194().size() - 1);
      int[] var9 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      var2.method192((var7, var8x, var9x) -> {
         boolean[] var12 = new boolean[]{false};
         boolean var13 = var3.method192((var10, var11, var12x) -> {
            boolean[] var15 = new boolean[]{false};
            boolean var16 = var4.method192((var12xx, var13x, var14) -> {
               boolean var17 = var5.method36569(var0.method26729(var7, var10, var12xx), var1.method26729(var8x, var11, var13x));
               if (var17) {
                  var8.field34029.set(var8.method26716(var9x, var12x, var14));
                  var9[2] = Math.min(var9[2], var14);
                  var9[5] = Math.max(var9[5], var14);
                  var15[0] = true;
               }

               return true;
            });
            if (var15[0]) {
               var9[1] = Math.min(var9[1], var12x);
               var9[4] = Math.max(var9[4], var12x);
               var12[0] = true;
            }

            return var16;
         });
         if (var12[0]) {
            var9[0] = Math.min(var9[0], var9x);
            var9[3] = Math.max(var9[3], var9x);
         }

         return var13;
      });
      var8.field34030 = var9[0];
      var8.field34031 = var9[1];
      var8.field34032 = var9[2];
      var8.field34033 = var9[3] + 1;
      var8.field34034 = var9[4] + 1;
      var8.field34035 = var9[5] + 1;
      return var8;
   }
}
