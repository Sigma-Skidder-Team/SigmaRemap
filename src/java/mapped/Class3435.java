package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class3435 extends Class3433 {
   private static String[] field19201;
   public static final Class8551 field19202 = Class8820.field39688;
   public static final VoxelShape field19203 = Block.method11539(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   public static final VoxelShape field19204 = Block.method11539(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19205 = Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   public static final VoxelShape field19206 = Block.method11539(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19207 = Block.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final VoxelShape field19208 = Block.method11539(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean field19209;

   public Class3435(boolean var1, AbstractBlock var2) {
      super(var2);
      this.method11578(this.field18612.method35393().method23465(field19198, Direction.NORTH).method23465(field19202, Boolean.valueOf(false)));
      this.field19209 = var1;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      if (var1.<Boolean>method23463(field19202)) {
         switch (Class7273.field31199[var1.<Direction>method23463(field19198).ordinal()]) {
            case 1:
               return field19208;
            case 2:
            default:
               return field19207;
            case 3:
               return field19206;
            case 4:
               return field19205;
            case 5:
               return field19204;
            case 6:
               return field19203;
         }
      } else {
         return VoxelShapes.method27426();
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (!var1.isRemote) {
         this.method12102(var1, var2, var3);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         this.method12102(var2, var3, var1);
      }
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.method23448(var1.getBlock()) && !var2.isRemote && var2.getTileEntity(var3) == null) {
         this.method12102(var2, var3, var1);
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field19198, var1.method18348().method536()).method23465(field19202, Boolean.valueOf(false));
   }

   private void method12102(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>method23463(field19198);
      boolean var7 = this.method12103(var1, var2, var6);
      if (var7 && !var3.<Boolean>method23463(field19202)) {
         if (new Class9196(var1, var2, var6, true).method34464()) {
            var1.method6787(var2, this, 0, var6.getIndex());
         }
      } else if (!var7 && var3.<Boolean>method23463(field19202)) {
         BlockPos var8 = var2.method8350(var6, 2);
         BlockState var9 = var1.getBlockState(var8);
         byte var10 = 1;
         if (var9.method23448(Blocks.MOVING_PISTON) && var9.<Direction>method23463(field19198) == var6) {
            TileEntity var11 = var1.getTileEntity(var8);
            if (var11 instanceof Class955) {
               Class955 var12 = (Class955)var11;
               if (var12.method3846() && (var12.method3849(0.0F) < 0.5F || var1.method6783() == var12.method3867() || ((ServerWorld)var1).method6901())) {
                  var10 = 2;
               }
            }
         }

         var1.method6787(var2, this, var10, var6.getIndex());
      }
   }

   private boolean method12103(World var1, BlockPos var2, Direction var3) {
      for (Direction var9 : Direction.values()) {
         if (var9 != var3 && var1.method6778(var2.method8349(var9), var9)) {
            return true;
         }
      }

      if (!var1.method6778(var2, Direction.DOWN)) {
         BlockPos var11 = var2.up();

         for (Direction var10 : Direction.values()) {
            if (var10 != Direction.DOWN && var1.method6778(var11.method8349(var10), var10)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      Direction var8 = var1.<Direction>method23463(field19198);
      if (!var2.isRemote) {
         boolean var9 = this.method12103(var2, var3, var8);
         if (var9 && (var4 == 1 || var4 == 2)) {
            var2.setBlockState(var3, var1.method23465(field19202, Boolean.valueOf(true)), 2);
            return false;
         }

         if (!var9 && var4 == 0) {
            return false;
         }
      }

      if (var4 != 0) {
         if (var4 == 1 || var4 == 2) {
            TileEntity var16 = var2.getTileEntity(var3.method8349(var8));
            if (var16 instanceof Class955) {
               ((Class955)var16).method3865();
            }

            BlockState var10 = Blocks.MOVING_PISTON
               .method11579()
               .method23465(Class3356.field18896, var8)
               .method23465(Class3356.field18897, !this.field19209 ? Class180.field638 : Class180.field639);
            var2.setBlockState(var3, var10, 20);
            var2.method6761(var3, Class3356.method11929(this.method11579().method23465(field19198, Direction.byIndex(var5 & 7)), var8, false, true));
            var2.func_230547_a_(var3, var10.getBlock());
            var10.method23424(var2, var3, 2);
            if (!this.field19209) {
               var2.removeBlock(var3.method8349(var8), false);
            } else {
               BlockPos var11 = var3.method8336(var8.method539() * 2, var8.method540() * 2, var8.method541() * 2);
               BlockState var12 = var2.getBlockState(var11);
               boolean var13 = false;
               if (var12.method23448(Blocks.MOVING_PISTON)) {
                  TileEntity var14 = var2.getTileEntity(var11);
                  if (var14 instanceof Class955) {
                     Class955 var15 = (Class955)var14;
                     if (var15.method3847() == var8 && var15.method3846()) {
                        var15.method3865();
                        var13 = true;
                     }
                  }
               }

               if (!var13) {
                  if (var4 == 1
                     && !var12.isAir()
                     && method12104(var12, var2, var11, var8.method536(), false, var8)
                     && (var12.method23408() == Class2315.field15862 || var12.method23448(Blocks.PISTON) || var12.method23448(Blocks.STICKY_PISTON))) {
                     this.method12105(var2, var3, var8, false);
                  } else {
                     var2.removeBlock(var3.method8349(var8), false);
                  }
               }
            }

            var2.method6742((PlayerEntity)null, var3, Sounds.field26949, Class2266.field14732, 0.5F, var2.rand.nextFloat() * 0.15F + 0.6F);
         }
      } else {
         if (!this.method12105(var2, var3, var8, true)) {
            return false;
         }

         var2.setBlockState(var3, var1.method23465(field19202, Boolean.valueOf(true)), 67);
         var2.method6742((PlayerEntity)null, var3, Sounds.field26950, Class2266.field14732, 0.5F, var2.rand.nextFloat() * 0.25F + 0.6F);
      }

      return true;
   }

   public static boolean method12104(BlockState var0, World var1, BlockPos var2, Direction var3, boolean var4, Direction var5) {
      if (var2.getY() < 0 || var2.getY() > var1.method7034() - 1 || !var1.method6810().method24523(var2)) {
         return false;
      } else if (var0.isAir()) {
         return true;
      } else if (var0.method23448(Blocks.field36527) || var0.method23448(Blocks.field37123) || var0.method23448(Blocks.field37124)) {
         return false;
      } else if (var3 == Direction.DOWN && var2.getY() == 0) {
         return false;
      } else if (var3 == Direction.field673 && var2.getY() == var1.method7034() - 1) {
         return false;
      } else {
         if (!var0.method23448(Blocks.PISTON) && !var0.method23448(Blocks.STICKY_PISTON)) {
            if (var0.method23405(var1, var2) == -1.0F) {
               return false;
            }

            switch (Class7273.field31200[var0.method23408().ordinal()]) {
               case 1:
                  return false;
               case 2:
                  return var4;
               case 3:
                  return var3 == var5;
            }
         } else if (var0.<Boolean>method23463(field19202)) {
            return false;
         }

         return !var0.getBlock().isTileEntityProvider();
      }
   }

   private boolean method12105(World var1, BlockPos var2, Direction var3, boolean var4) {
      BlockPos var7 = var2.method8349(var3);
      if (!var4 && var1.getBlockState(var7).method23448(Blocks.PISTON_HEAD)) {
         var1.setBlockState(var7, Blocks.AIR.method11579(), 20);
      }

      Class9196 var8 = new Class9196(var1, var2, var3, var4);
      if (!var8.method34464()) {
         return false;
      } else {
         Map<BlockPos, BlockState> var9 = Maps.newHashMap();
         List<BlockPos> var10 = var8.method34470();
         ArrayList var11 = Lists.newArrayList();

         for (int var12 = 0; var12 < var10.size(); var12++) {
            BlockPos var13 = var10.get(var12);
            BlockState var14 = var1.getBlockState(var13);
            var11.add(var14);
            var9.put(var13, var14);
         }

         List var21 = var8.method34471();
         BlockState[] var22 = new BlockState[var10.size() + var21.size()];
         Direction var23 = !var4 ? var3.method536() : var3;
         int var15 = 0;

         for (int var16 = var21.size() - 1; var16 >= 0; var16--) {
            BlockPos var17 = (BlockPos)var21.get(var16);
            BlockState var18 = var1.getBlockState(var17);
            TileEntity var19 = !var18.getBlock().isTileEntityProvider() ? null : var1.getTileEntity(var17);
            method11555(var18, var1, var17, var19);
            var1.setBlockState(var17, Blocks.AIR.method11579(), 18);
            var22[var15++] = var18;
         }

         for (int var25 = var10.size() - 1; var25 >= 0; var25--) {
            BlockPos var28 = (BlockPos)var10.get(var25);
            BlockState var35 = var1.getBlockState(var28);
            var28 = var28.method8349(var23);
            var9.remove(var28);
            var1.setBlockState(var28, Blocks.MOVING_PISTON.method11579().method23465(field19198, var3), 68);
            var1.method6761(var28, Class3356.method11929((BlockState)var11.get(var25), var3, var4, false));
            var22[var15++] = var35;
         }

         if (var4) {
            Class180 var26 = !this.field19209 ? Class180.field638 : Class180.field639;
            BlockState var30 = Blocks.PISTON_HEAD.method11579().method23465(Class3436.field19198, var3).method23465(Class3436.field19211, var26);
            BlockState var36 = Blocks.MOVING_PISTON
               .method11579()
               .method23465(Class3356.field18896, var3)
               .method23465(Class3356.field18897, !this.field19209 ? Class180.field638 : Class180.field639);
            var9.remove(var7);
            var1.setBlockState(var7, var36, 68);
            var1.method6761(var7, Class3356.method11929(var30, var3, true, true));
         }

         BlockState var27 = Blocks.AIR.method11579();

         for (BlockPos var37 : var9.keySet()) {
            var1.setBlockState(var37, var27, 82);
         }

         for (Entry var38 : var9.entrySet()) {
            BlockPos var40 = (BlockPos)var38.getKey();
            BlockState var20 = (BlockState)var38.getValue();
            var20.method23426(var1, var40, 2);
            var27.method23424(var1, var40, 2);
            var27.method23426(var1, var40, 2);
         }

         var15 = 0;

         for (int var33 = var21.size() - 1; var33 >= 0; var33--) {
            BlockState var39 = var22[var15++];
            BlockPos var41 = (BlockPos)var21.get(var33);
            var39.method23426(var1, var41, 2);
            var1.notifyNeighborsOfStateChange(var41, var39.getBlock());
         }

         for (int var34 = var10.size() - 1; var34 >= 0; var34--) {
            var1.notifyNeighborsOfStateChange((BlockPos)var10.get(var34), var22[var15++].getBlock());
         }

         if (var4) {
            var1.notifyNeighborsOfStateChange(var7, Blocks.PISTON_HEAD);
         }

         return true;
      }
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field19198, var2.method252(var1.<Direction>method23463(field19198)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19198)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19198, field19202);
   }

   @Override
   public boolean method11534(BlockState var1) {
      return var1.<Boolean>method23463(field19202);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
