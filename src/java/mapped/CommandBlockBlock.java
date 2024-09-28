package mapped;

import java.util.Random;

import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommandBlockBlock extends Class3241 {
   private static final Logger field18892 = LogManager.getLogger();
   public static final DirectionProperty field18893 = Class3433.field19198;
   public static final BooleanProperty field18894 = BlockStateProperties.field39684;

   public CommandBlockBlock(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field18893, Direction.NORTH).with(field18894, Boolean.valueOf(false)));
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      CommandBlockTileEntity var4 = new CommandBlockTileEntity();
      var4.method4013(this == Blocks.field36888);
      return var4;
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof CommandBlockTileEntity) {
            CommandBlockTileEntity var10 = (CommandBlockTileEntity)var9;
            boolean var11 = var2.method6780(var3);
            boolean var12 = var10.isPowered();
            var10.method4010(var11);
            if (!var12 && !var10.isAuto() && var10.method4020() != CommandBlockTileEntity.Mode.field13323 && var11) {
               var10.method4017();
               var2.method6860().method20726(var3, this, 1);
            }
         }
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      TileEntity var7 = var2.getTileEntity(var3);
      if (var7 instanceof CommandBlockTileEntity) {
         CommandBlockTileEntity var8 = (CommandBlockTileEntity)var7;
         CommandBlockLogic var9 = var8.method4009();
         boolean var10 = !Class9001.method33256(var9.method3563());
         CommandBlockTileEntity.Mode var11 = var8.method4020();
         boolean var12 = var8.isConditionMet();
         if (var11 != CommandBlockTileEntity.Mode.field13324) {
            if (var11 == CommandBlockTileEntity.Mode.field13325) {
               if (!var12) {
                  if (var8.method4021()) {
                     var9.method3558(0);
                  }
               } else {
                  this.method11927(var1, var2, var3, var9, var10);
               }
            }
         } else {
            var8.method4017();
            if (!var12) {
               if (var8.method4021()) {
                  var9.method3558(0);
               }
            } else {
               this.method11927(var1, var2, var3, var9, var10);
            }

            if (var8.isPowered() || var8.isAuto()) {
               var2.method6860().method20726(var3, this, 1);
            }
         }

         var2.updateComparatorOutputLevel(var3, this);
      }
   }

   private void method11927(BlockState var1, World var2, BlockPos var3, CommandBlockLogic var4, boolean var5) {
      if (!var5) {
         var4.method3558(0);
      } else {
         var4.method3564(var2);
      }

      method11928(var2, var3, var1.<Direction>get(field18893));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      TileEntity var9 = var2.getTileEntity(var3);
      if (var9 instanceof CommandBlockTileEntity && var4.canUseCommandBlock()) {
         var4.method2770((CommandBlockTileEntity)var9);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      return !(var6 instanceof CommandBlockTileEntity) ? 0 : ((CommandBlockTileEntity)var6).method4009().method3557();
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      TileEntity var8 = var1.getTileEntity(var2);
      if (var8 instanceof CommandBlockTileEntity) {
         CommandBlockTileEntity var9 = (CommandBlockTileEntity)var8;
         CommandBlockLogic var10 = var9.method4009();
         if (var5.method32152()) {
            var10.method3566(var5.method32149());
         }

         if (!var1.isRemote) {
            if (var5.method32145("BlockEntityTag") == null) {
               var10.method3570(var1.getGameRules().getBoolean(Class5462.field24236));
               var9.method4013(this == Blocks.field36888);
            }

            if (var9.method4020() == CommandBlockTileEntity.Mode.field13323) {
               boolean var11 = var1.method6780(var2);
               var9.method4010(var11);
            }
         }
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18893, var2.rotate(var1.<Direction>get(field18893)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18893)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18893, field18894);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().with(field18893, var1.method18348().getOpposite());
   }

   private static void method11928(World var0, BlockPos var1, Direction var2) {
      BlockPos.Mutable var5 = var1.method8354();
      Class5462 var6 = var0.getGameRules();
      int var7 = var6.method17136(Class5462.field24244);

      while (var7-- > 0) {
         var5.method8379(var2);
         BlockState var8 = var0.getBlockState(var5);
         Block var9 = var8.getBlock();
         if (!var8.isIn(Blocks.field36888)) {
            break;
         }

         TileEntity var10 = var0.getTileEntity(var5);
         if (!(var10 instanceof CommandBlockTileEntity)) {
            break;
         }

         CommandBlockTileEntity var11 = (CommandBlockTileEntity)var10;
         if (var11.method4020() != CommandBlockTileEntity.Mode.field13323) {
            break;
         }

         if (var11.isPowered() || var11.isAuto()) {
            CommandBlockLogic var12 = var11.method4009();
            if (!var11.method4017()) {
               if (var11.method4021()) {
                  var12.method3558(0);
               }
            } else {
               if (!var12.method3564(var0)) {
                  break;
               }

               var0.updateComparatorOutputLevel(var5, var9);
            }
         }

         var2 = var8.<Direction>get(field18893);
      }

      if (var7 <= 0) {
         int var13 = Math.max(var6.method17136(Class5462.field24244), 0);
         field18892.warn("Command Block chain tried to execute more than {} steps!", var13);
      }
   }
}
