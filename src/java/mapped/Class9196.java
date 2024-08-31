package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class Class9196 {
   private static String[] field42236;
   private final World field42237;
   private final BlockPos field42238;
   private final boolean field42239;
   private final BlockPos field42240;
   private final Direction field42241;
   private final List<BlockPos> field42242 = Lists.newArrayList();
   private final List<BlockPos> field42243 = Lists.newArrayList();
   private final Direction field42244;

   public Class9196(World var1, BlockPos var2, Direction var3, boolean var4) {
      this.field42237 = var1;
      this.field42238 = var2;
      this.field42244 = var3;
      this.field42239 = var4;
      if (!var4) {
         this.field42241 = var3.method536();
         this.field42240 = var2.method8350(var3, 2);
      } else {
         this.field42241 = var3;
         this.field42240 = var2.method8349(var3);
      }
   }

   public boolean method34464() {
      this.field42242.clear();
      this.field42243.clear();
      BlockState var3 = this.field42237.getBlockState(this.field42240);
      if (Class3435.method12104(var3, this.field42237, this.field42240, this.field42241, false, this.field42244)) {
         if (this.method34467(this.field42240, this.field42241)) {
            for (int var4 = 0; var4 < this.field42242.size(); var4++) {
               BlockPos var5 = this.field42242.get(var4);
               if (method34465(this.field42237.getBlockState(var5).getBlock()) && !this.method34469(var5)) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else if (this.field42239 && var3.method23408() == Class2315.field15863) {
         this.field42243.add(this.field42240);
         return true;
      } else {
         return false;
      }
   }

   private static boolean method34465(Block var0) {
      return var0 == Blocks.field36764 || var0 == Blocks.field37119;
   }

   private static boolean method34466(Block var0, Block var1) {
      if (var0 == Blocks.field37119 && var1 == Blocks.field36764) {
         return false;
      } else {
         return var0 == Blocks.field36764 && var1 == Blocks.field37119 ? false : method34465(var0) || method34465(var1);
      }
   }

   private boolean method34467(BlockPos var1, Direction var2) {
      BlockState var5 = this.field42237.getBlockState(var1);
      Block var6 = var5.getBlock();
      if (var5.isAir()) {
         return true;
      } else if (!Class3435.method12104(var5, this.field42237, var1, this.field42241, false, var2)) {
         return true;
      } else if (var1.equals(this.field42238)) {
         return true;
      } else if (this.field42242.contains(var1)) {
         return true;
      } else {
         int var7 = 1;
         if (var7 + this.field42242.size() > 12) {
            return false;
         } else {
            while (method34465(var6)) {
               BlockPos var8 = var1.method8350(this.field42241.method536(), var7);
               Block var9 = var6;
               var5 = this.field42237.getBlockState(var8);
               var6 = var5.getBlock();
               if (var5.isAir()
                  || !method34466(var9, var6)
                  || !Class3435.method12104(var5, this.field42237, var8, this.field42241, false, this.field42241.method536())
                  || var8.equals(this.field42238)) {
                  break;
               }

               if (++var7 + this.field42242.size() > 12) {
                  return false;
               }
            }

            int var16 = 0;

            for (int var17 = var7 - 1; var17 >= 0; var17--) {
               this.field42242.add(var1.method8350(this.field42241.method536(), var17));
               var16++;
            }

            int var18 = 1;

            while (true) {
               BlockPos var10 = var1.method8350(this.field42241, var18);
               int var11 = this.field42242.indexOf(var10);
               if (var11 > -1) {
                  this.method34468(var16, var11);

                  for (int var12 = 0; var12 <= var11 + var16; var12++) {
                     BlockPos var13 = this.field42242.get(var12);
                     if (method34465(this.field42237.getBlockState(var13).getBlock()) && !this.method34469(var13)) {
                        return false;
                     }
                  }

                  return true;
               }

               var5 = this.field42237.getBlockState(var10);
               if (var5.isAir()) {
                  return true;
               }

               if (!Class3435.method12104(var5, this.field42237, var10, this.field42241, true, this.field42241) || var10.equals(this.field42238)) {
                  return false;
               }

               if (var5.method23408() == Class2315.field15863) {
                  this.field42243.add(var10);
                  return true;
               }

               if (this.field42242.size() >= 12) {
                  return false;
               }

               this.field42242.add(var10);
               var16++;
               var18++;
            }
         }
      }
   }

   private void method34468(int var1, int var2) {
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      var5.addAll(this.field42242.subList(0, var2));
      var6.addAll(this.field42242.subList(this.field42242.size() - var1, this.field42242.size()));
      var7.addAll(this.field42242.subList(var2, this.field42242.size() - var1));
      this.field42242.clear();
      this.field42242.addAll(var5);
      this.field42242.addAll(var6);
      this.field42242.addAll(var7);
   }

   private boolean method34469(BlockPos var1) {
      BlockState var4 = this.field42237.getBlockState(var1);

      for (Direction var8 : Direction.values()) {
         if (var8.method544() != this.field42241.method544()) {
            BlockPos var9 = var1.method8349(var8);
            BlockState var10 = this.field42237.getBlockState(var9);
            if (method34466(var10.getBlock(), var4.getBlock()) && !this.method34467(var9, var8)) {
               return false;
            }
         }
      }

      return true;
   }

   public List<BlockPos> method34470() {
      return this.field42242;
   }

   public List<BlockPos> method34471() {
      return this.field42243;
   }
}
