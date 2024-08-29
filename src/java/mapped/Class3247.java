package mapped;

import java.util.Random;

public abstract class Class3247 extends Class3198 {
   public static final Class6408 field18707 = Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final Class8551 field18708 = Class8820.field39704;

   public Class3247(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18707;
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return method11547(var2, var3.method8313());
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!this.method11667(var2, var3, var1)) {
         boolean var7 = var1.<Boolean>method23463(field18708);
         boolean var8 = this.method11661(var2, var3, var1);
         if (var7 && !var8) {
            var2.method6725(var3, var1.method23465(field18708, Boolean.valueOf(false)), 2);
         } else if (!var7) {
            var2.method6725(var3, var1.method23465(field18708, Boolean.valueOf(true)), 2);
            if (!var8) {
               var2.method6860().method20719(var3, this, this.method11658(var1), Class2199.field14368);
            }
         }
      }
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.method23402(var2, var3, var4);
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      if (var1.<Boolean>method23463(field18708)) {
         return var1.method23463(field18484) != var4 ? 0 : this.method11659(var2, var3, var1);
      } else {
         return 0;
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var1.method23443(var2, var3)) {
         TileEntity var9 = !this.isTileEntityProvider() ? null : var2.getTileEntity(var3);
         method11555(var1, var2, var3, var9);
         var2.method6728(var3, false);

         for (Direction var13 : Direction.values()) {
            var2.method6733(var3.method8349(var13), this);
         }
      } else {
         this.method11664(var2, var3, var1);
      }
   }

   public void method11664(World var1, BlockPos var2, BlockState var3) {
      if (!this.method11667(var1, var2, var3)) {
         boolean var6 = var3.<Boolean>method23463(field18708);
         boolean var7 = this.method11661(var1, var2, var3);
         if (var6 != var7 && !var1.method6860().method20720(var2, this)) {
            Class2199 var8 = Class2199.field14369;
            if (!this.method11673(var1, var2, var3)) {
               if (var6) {
                  var8 = Class2199.field14368;
               }
            } else {
               var8 = Class2199.field14367;
            }

            var1.method6860().method20719(var2, this, this.method11658(var3), var8);
         }
      }
   }

   public boolean method11667(Class1662 var1, BlockPos var2, BlockState var3) {
      return false;
   }

   public boolean method11661(World var1, BlockPos var2, BlockState var3) {
      return this.method11662(var1, var2, var3) > 0;
   }

   public int method11662(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>method23463(field18484);
      BlockPos var7 = var2.method8349(var6);
      int var8 = var1.method6779(var7, var6);
      if (var8 < 15) {
         BlockState var9 = var1.getBlockState(var7);
         return Math.max(var8, !var9.method23448(Blocks.REDSTONE_WIRE) ? 0 : var9.<Integer>method23463(Class3222.field18651));
      } else {
         return var8;
      }
   }

   public int method11668(Class1662 var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>method23463(field18484);
      Direction var7 = var6.method537();
      Direction var8 = var6.method538();
      return Math.max(this.method11669(var1, var2.method8349(var7), var7), this.method11669(var1, var2.method8349(var8), var8));
   }

   public int method11669(Class1662 var1, BlockPos var2, Direction var3) {
      BlockState var6 = var1.getBlockState(var2);
      if (!this.method11671(var6)) {
         return 0;
      } else if (!var6.method23448(Blocks.field36721)) {
         return !var6.method23448(Blocks.REDSTONE_WIRE) ? var1.method7010(var2, var3) : var6.<Integer>method23463(Class3222.field18651);
      } else {
         return 15;
      }
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18484, var1.method18350().method536());
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
      if (this.method11661(var1, var2, var3)) {
         var1.method6860().method20726(var2, this, 1);
      }
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      this.method11670(var2, var3, var1);
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.getBlock())) {
         super.method11513(var1, var2, var3, var4, var5);
         this.method11670(var2, var3, var1);
      }
   }

   public void method11670(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>method23463(field18484);
      BlockPos var7 = var2.method8349(var6.method536());
      var1.method6735(var7, this, var2);
      var1.method6734(var7, this, var6);
   }

   public boolean method11671(BlockState var1) {
      return var1.method23401();
   }

   public int method11659(Class1665 var1, BlockPos var2, BlockState var3) {
      return 15;
   }

   public static boolean method11672(BlockState var0) {
      return var0.getBlock() instanceof Class3247;
   }

   public boolean method11673(Class1665 var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>method23463(field18484).method536();
      BlockState var7 = var1.getBlockState(var2.method8349(var6));
      return method11672(var7) && var7.<Direction>method23463(field18484) != var6;
   }

   public abstract int method11658(BlockState var1);
}
