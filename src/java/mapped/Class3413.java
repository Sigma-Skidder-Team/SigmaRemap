package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3413 extends Block {
   private static String[] field19099;
   public static final IntegerProperty field19100 = BlockStateProperties.field39751;
   private static final VoxelShape field19101 = makeCuboidShape(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   public static final VoxelShape field19102 = VoxelShapes.combineAndSimplify(
      VoxelShapes.method27426(),
      VoxelShapes.method27432(
         makeCuboidShape(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), makeCuboidShape(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), makeCuboidShape(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), field19101
      ),
      IBooleanFunction.ONLY_FIRST
   );

   public Class3413(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19100, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19102;
   }

   @Override
   public VoxelShape method11938(BlockState var1, IBlockReader var2, BlockPos var3) {
      return field19101;
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      int var7 = var1.<Integer>get(field19100);
      float var8 = (float)var3.getY() + (6.0F + (float)(3 * var7)) / 16.0F;
      if (!var2.isRemote && var4.isBurning() && var7 > 0 && var4.getPosY() <= (double)var8) {
         var4.extinguish();
         this.method12051(var2, var3, var1, var7 - 1);
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      if (!var9.isEmpty()) {
         int var10 = var1.<Integer>get(field19100);
         Item var11 = var9.getItem();
         if (var11 != Items.WATER_BUCKET) {
            if (var11 != Items.BUCKET) {
               if (var11 != Items.field37972) {
                  if (var11 == Items.field37971 && Class9741.method38185(var9) == Class8137.field34977) {
                     if (var10 < 3 && !var2.isRemote) {
                        if (!var4.abilities.isCreativeMode) {
                           ItemStack var17 = new ItemStack(Items.field37972);
                           var4.method2911(Stats.field40143);
                           var4.setHeldItem(var5, var17);
                           if (var4 instanceof ServerPlayerEntity) {
                              ((ServerPlayerEntity)var4).method2771(var4.container);
                           }
                        }

                        var2.playSound((PlayerEntity)null, var3, SoundEvents.field26417, SoundCategory.field14732, 1.0F, 1.0F);
                        this.method12051(var2, var3, var1, var10 + 1);
                     }

                     return ActionResultType.method9002(var2.isRemote);
                  } else {
                     if (var10 > 0 && var11 instanceof Class3277) {
                        Class3277 var14 = (Class3277)var11;
                        if (var14.method11799(var9) && !var2.isRemote) {
                           var14.method11801(var9);
                           this.method12051(var2, var3, var1, var10 - 1);
                           var4.method2911(Stats.field40144);
                           return ActionResultType.SUCCESS;
                        }
                     }

                     if (var10 > 0 && var11 instanceof Class3301) {
                        if (BannerTileEntity.method3889(var9) > 0 && !var2.isRemote) {
                           ItemStack var16 = var9.copy();
                           var16.setCount(1);
                           BannerTileEntity.method3892(var16);
                           var4.method2911(Stats.field40145);
                           if (!var4.abilities.isCreativeMode) {
                              var9.shrink(1);
                              this.method12051(var2, var3, var1, var10 - 1);
                           }

                           if (!var9.isEmpty()) {
                              if (var4.inventory.method4045(var16)) {
                                 if (var4 instanceof ServerPlayerEntity) {
                                    ((ServerPlayerEntity)var4).method2771(var4.container);
                                 }
                              } else {
                                 var4.dropItem(var16, false);
                              }
                           } else {
                              var4.setHeldItem(var5, var16);
                           }
                        }

                        return ActionResultType.method9002(var2.isRemote);
                     } else if (var10 > 0 && var11 instanceof BlockItem) {
                        Block var15 = ((BlockItem)var11).method11845();
                        if (var15 instanceof Class3368 && !var2.isRemote()) {
                           ItemStack var13 = new ItemStack(Blocks.field36896, 1);
                           if (var9.method32141()) {
                              var13.setTag(var9.getTag().copy());
                           }

                           var4.setHeldItem(var5, var13);
                           this.method12051(var2, var3, var1, var10 - 1);
                           var4.method2911(Stats.field40146);
                           return ActionResultType.SUCCESS;
                        } else {
                           return ActionResultType.field14819;
                        }
                     } else {
                        return ActionResultType.field14820;
                     }
                  }
               } else {
                  if (var10 > 0 && !var2.isRemote) {
                     if (!var4.abilities.isCreativeMode) {
                        ItemStack var12 = Class9741.method38187(new ItemStack(Items.field37971), Class8137.field34977);
                        var4.method2911(Stats.field40143);
                        var9.shrink(1);
                        if (!var9.isEmpty()) {
                           if (var4.inventory.method4045(var12)) {
                              if (var4 instanceof ServerPlayerEntity) {
                                 ((ServerPlayerEntity)var4).method2771(var4.container);
                              }
                           } else {
                              var4.dropItem(var12, false);
                           }
                        } else {
                           var4.setHeldItem(var5, var12);
                        }
                     }

                     var2.playSound((PlayerEntity)null, var3, SoundEvents.field26418, SoundCategory.field14732, 1.0F, 1.0F);
                     this.method12051(var2, var3, var1, var10 - 1);
                  }

                  return ActionResultType.method9002(var2.isRemote);
               }
            } else {
               if (var10 == 3 && !var2.isRemote) {
                  if (!var4.abilities.isCreativeMode) {
                     var9.shrink(1);
                     if (!var9.isEmpty()) {
                        if (!var4.inventory.method4045(new ItemStack(Items.WATER_BUCKET))) {
                           var4.dropItem(new ItemStack(Items.WATER_BUCKET), false);
                        }
                     } else {
                        var4.setHeldItem(var5, new ItemStack(Items.WATER_BUCKET));
                     }
                  }

                  var4.method2911(Stats.field40143);
                  this.method12051(var2, var3, var1, 0);
                  var2.playSound((PlayerEntity)null, var3, SoundEvents.field26429, SoundCategory.field14732, 1.0F, 1.0F);
               }

               return ActionResultType.method9002(var2.isRemote);
            }
         } else {
            if (var10 < 3 && !var2.isRemote) {
               if (!var4.abilities.isCreativeMode) {
                  var4.setHeldItem(var5, new ItemStack(Items.BUCKET));
               }

               var4.method2911(Stats.field40142);
               this.method12051(var2, var3, var1, 3);
               var2.playSound((PlayerEntity)null, var3, SoundEvents.field26426, SoundCategory.field14732, 1.0F, 1.0F);
            }

            return ActionResultType.method9002(var2.isRemote);
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   public void method12051(World var1, BlockPos var2, BlockState var3, int var4) {
      var1.setBlockState(var2, var3.with(field19100, Integer.valueOf(MathHelper.clamp(var4, 0, 3))), 2);
      var1.updateComparatorOutputLevel(var2, this);
   }

   @Override
   public void method11575(World var1, BlockPos var2) {
      if (var1.rand.nextInt(20) == 1) {
         float var5 = var1.getBiome(var2).getTemperature(var2);
         if (!(var5 < 0.15F)) {
            BlockState var6 = var1.getBlockState(var2);
            if (var6.<Integer>get(field19100) < 3) {
               var1.setBlockState(var2, var6.method23459(field19100), 2);
            }
         }
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return var1.<Integer>get(field19100);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19100);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
