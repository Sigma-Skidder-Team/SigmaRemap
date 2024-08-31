package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import javax.annotation.Nullable;

public class Class9435 {
   private static String[] field43776;
   private final World field43777;
   private final BlockPos field43778;
   private final Class3429 field43779;
   private BlockState field43780;
   private final boolean field43781;
   private final List<BlockPos> field43782 = Lists.newArrayList();

   public Class9435(World var1, BlockPos var2, BlockState var3) {
      this.field43777 = var1;
      this.field43778 = var2;
      this.field43780 = var3;
      this.field43779 = (Class3429)var3.getBlock();
      Class96 var6 = var3.<Class96>method23463(this.field43779.method12093());
      this.field43781 = this.field43779.method12088();
      this.method36234(var6);
   }

   public List<BlockPos> method36233() {
      return this.field43782;
   }

   private void method36234(Class96 var1) {
      this.field43782.clear();
      switch (Class7964.field34253[var1.ordinal()]) {
         case 1:
            this.field43782.add(this.field43778.north());
            this.field43782.add(this.field43778.south());
            break;
         case 2:
            this.field43782.add(this.field43778.west());
            this.field43782.add(this.field43778.east());
            break;
         case 3:
            this.field43782.add(this.field43778.west());
            this.field43782.add(this.field43778.east().up());
            break;
         case 4:
            this.field43782.add(this.field43778.west().up());
            this.field43782.add(this.field43778.east());
            break;
         case 5:
            this.field43782.add(this.field43778.north().up());
            this.field43782.add(this.field43778.south());
            break;
         case 6:
            this.field43782.add(this.field43778.north());
            this.field43782.add(this.field43778.south().up());
            break;
         case 7:
            this.field43782.add(this.field43778.east());
            this.field43782.add(this.field43778.south());
            break;
         case 8:
            this.field43782.add(this.field43778.west());
            this.field43782.add(this.field43778.south());
            break;
         case 9:
            this.field43782.add(this.field43778.west());
            this.field43782.add(this.field43778.north());
            break;
         case 10:
            this.field43782.add(this.field43778.east());
            this.field43782.add(this.field43778.north());
      }
   }

   private void method36235() {
      for (int var3 = 0; var3 < this.field43782.size(); var3++) {
         Class9435 var4 = this.method36237(this.field43782.get(var3));
         if (var4 != null && var4.method36238(this)) {
            this.field43782.set(var3, var4.field43778);
         } else {
            this.field43782.remove(var3--);
         }
      }
   }

   private boolean method36236(BlockPos var1) {
      return Class3429.method12086(this.field43777, var1)
         || Class3429.method12086(this.field43777, var1.up())
         || Class3429.method12086(this.field43777, var1.down());
   }

   @Nullable
   private Class9435 method36237(BlockPos var1) {
      BlockState var4 = this.field43777.getBlockState(var1);
      if (!Class3429.method12087(var4)) {
         BlockPos var5 = var1.up();
         var4 = this.field43777.getBlockState(var5);
         if (!Class3429.method12087(var4)) {
            var5 = var1.down();
            var4 = this.field43777.getBlockState(var5);
            return !Class3429.method12087(var4) ? null : new Class9435(this.field43777, var5, var4);
         } else {
            return new Class9435(this.field43777, var5, var4);
         }
      } else {
         return new Class9435(this.field43777, var1, var4);
      }
   }

   private boolean method36238(Class9435 var1) {
      return this.method36239(var1.field43778);
   }

   private boolean method36239(BlockPos var1) {
      for (int var4 = 0; var4 < this.field43782.size(); var4++) {
         BlockPos var5 = this.field43782.get(var4);
         if (var5.getX() == var1.getX() && var5.getZ() == var1.getZ()) {
            return true;
         }
      }

      return false;
   }

   public int method36240() {
      int var3 = 0;

      for (Direction var5 : Class76.field161) {
         if (this.method36236(this.field43778.method8349(var5))) {
            var3++;
         }
      }

      return var3;
   }

   private boolean method36241(Class9435 var1) {
      return this.method36238(var1) || this.field43782.size() != 2;
   }

   private void method36242(Class9435 var1) {
      this.field43782.add(var1.field43778);
      BlockPos var4 = this.field43778.north();
      BlockPos var5 = this.field43778.south();
      BlockPos var6 = this.field43778.west();
      BlockPos var7 = this.field43778.east();
      boolean var8 = this.method36239(var4);
      boolean var9 = this.method36239(var5);
      boolean var10 = this.method36239(var6);
      boolean var11 = this.method36239(var7);
      Class96 var12 = null;
      if (var8 || var9) {
         var12 = Class96.field247;
      }

      if (var10 || var11) {
         var12 = Class96.field248;
      }

      if (!this.field43781) {
         if (var9 && var11 && !var8 && !var10) {
            var12 = Class96.field253;
         }

         if (var9 && var10 && !var8 && !var11) {
            var12 = Class96.field254;
         }

         if (var8 && var10 && !var9 && !var11) {
            var12 = Class96.field255;
         }

         if (var8 && var11 && !var9 && !var10) {
            var12 = Class96.field256;
         }
      }

      if (var12 == Class96.field247) {
         if (Class3429.method12086(this.field43777, var4.up())) {
            var12 = Class96.field251;
         }

         if (Class3429.method12086(this.field43777, var5.up())) {
            var12 = Class96.field252;
         }
      }

      if (var12 == Class96.field248) {
         if (Class3429.method12086(this.field43777, var7.up())) {
            var12 = Class96.field249;
         }

         if (Class3429.method12086(this.field43777, var6.up())) {
            var12 = Class96.field250;
         }
      }

      if (var12 == null) {
         var12 = Class96.field247;
      }

      this.field43780 = this.field43780.method23465(this.field43779.method12093(), var12);
      this.field43777.setBlockState(this.field43778, this.field43780, 3);
   }

   private boolean method36243(BlockPos var1) {
      Class9435 var4 = this.method36237(var1);
      if (var4 != null) {
         var4.method36235();
         return var4.method36241(this);
      } else {
         return false;
      }
   }

   public Class9435 method36244(boolean var1, boolean var2, Class96 var3) {
      BlockPos var6 = this.field43778.north();
      BlockPos var7 = this.field43778.south();
      BlockPos var8 = this.field43778.west();
      BlockPos var9 = this.field43778.east();
      boolean var10 = this.method36243(var6);
      boolean var11 = this.method36243(var7);
      boolean var12 = this.method36243(var8);
      boolean var13 = this.method36243(var9);
      Class96 var14 = null;
      boolean var15 = var10 || var11;
      boolean var16 = var12 || var13;
      if (var15 && !var16) {
         var14 = Class96.field247;
      }

      if (var16 && !var15) {
         var14 = Class96.field248;
      }

      boolean var17 = var11 && var13;
      boolean var18 = var11 && var12;
      boolean var19 = var10 && var13;
      boolean var20 = var10 && var12;
      if (!this.field43781) {
         if (var17 && !var10 && !var12) {
            var14 = Class96.field253;
         }

         if (var18 && !var10 && !var13) {
            var14 = Class96.field254;
         }

         if (var20 && !var11 && !var13) {
            var14 = Class96.field255;
         }

         if (var19 && !var11 && !var12) {
            var14 = Class96.field256;
         }
      }

      if (var14 == null) {
         if (var15 && var16) {
            var14 = var3;
         } else if (!var15) {
            if (var16) {
               var14 = Class96.field248;
            }
         } else {
            var14 = Class96.field247;
         }

         if (!this.field43781) {
            if (!var1) {
               if (var20) {
                  var14 = Class96.field255;
               }

               if (var19) {
                  var14 = Class96.field256;
               }

               if (var18) {
                  var14 = Class96.field254;
               }

               if (var17) {
                  var14 = Class96.field253;
               }
            } else {
               if (var17) {
                  var14 = Class96.field253;
               }

               if (var18) {
                  var14 = Class96.field254;
               }

               if (var19) {
                  var14 = Class96.field256;
               }

               if (var20) {
                  var14 = Class96.field255;
               }
            }
         }
      }

      if (var14 == Class96.field247) {
         if (Class3429.method12086(this.field43777, var6.up())) {
            var14 = Class96.field251;
         }

         if (Class3429.method12086(this.field43777, var7.up())) {
            var14 = Class96.field252;
         }
      }

      if (var14 == Class96.field248) {
         if (Class3429.method12086(this.field43777, var9.up())) {
            var14 = Class96.field249;
         }

         if (Class3429.method12086(this.field43777, var8.up())) {
            var14 = Class96.field250;
         }
      }

      if (var14 == null) {
         var14 = var3;
      }

      this.method36234(var14);
      this.field43780 = this.field43780.method23465(this.field43779.method12093(), var14);
      if (var2 || this.field43777.getBlockState(this.field43778) != this.field43780) {
         this.field43777.setBlockState(this.field43778, this.field43780, 3);

         for (int var21 = 0; var21 < this.field43782.size(); var21++) {
            Class9435 var22 = this.method36237(this.field43782.get(var21));
            if (var22 != null) {
               var22.method36235();
               if (var22.method36241(this)) {
                  var22.method36242(this);
               }
            }
         }
      }

      return this;
   }

   public BlockState method36245() {
      return this.field43780;
   }
}
