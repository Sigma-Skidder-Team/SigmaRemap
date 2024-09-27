package mapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class Class3348 extends Class3346<Class941> implements Class3207 {
   private static String[] field18864;
   public static final Class8553 field18865 = Class3198.field18484;
   public static final Class8552<Class111> field18866 = Class8820.field39765;
   public static final Class8551 field18867 = Class8820.field39710;
   public static final VoxelShape field18868 = Block.method11539(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   public static final VoxelShape field18869 = Block.method11539(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   public static final VoxelShape field18870 = Block.method11539(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   public static final VoxelShape field18871 = Block.method11539(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   public static final VoxelShape field18872 = Block.method11539(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final Class6139<Class941, Optional<IInventory>> field18873 = new Class6140();
   private static final Class6139<Class941, Optional<Class949>> field18874 = new Class6142();

   public Class3348(AbstractBlock var1, Supplier<TileEntityType<? extends Class941>> var2) {
      super(var1, var2);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18865, Direction.NORTH)
            .method23465(field18866, Class111.field379)
            .method23465(field18867, Boolean.valueOf(false))
      );
   }

   public static Class1895 method11907(BlockState var0) {
      Class111 var3 = var0.<Class111>method23463(field18866);
      if (var3 != Class111.field379) {
         return var3 != Class111.field381 ? Class1895.field11111 : Class1895.field11110;
      } else {
         return Class1895.field11109;
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18867)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      if (var3.isIn(this) && var2.getAxis().method324()) {
         Class111 var9 = var3.<Class111>method23463(field18866);
         if (var1.<Class111>method23463(field18866) == Class111.field379
            && var9 != Class111.field379
            && var1.<Direction>method23463(field18865) == var3.<Direction>method23463(field18865)
            && method11908(var3) == var2.method536()) {
            return var1.method23465(field18866, var9.method308());
         }
      } else if (method11908(var1) == var2) {
         return var1.method23465(field18866, Class111.field379);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      if (var1.<Class111>method23463(field18866) == Class111.field379) {
         return field18872;
      } else {
         switch (Class8810.field39644[method11908(var1).ordinal()]) {
            case 1:
            default:
               return field18868;
            case 2:
               return field18869;
            case 3:
               return field18870;
            case 4:
               return field18871;
         }
      }
   }

   public static Direction method11908(BlockState var0) {
      Direction var3 = var0.<Direction>method23463(field18865);
      return var0.method23463(field18866) != Class111.field380 ? var3.method538() : var3.method537();
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      Class111 var4 = Class111.field379;
      Direction var5 = var1.method18350().method536();
      FluidState var6 = var1.method18360().getFluidState(var1.method18345());
      boolean var7 = var1.method18351();
      Direction var8 = var1.method18354();
      if (var8.getAxis().method324() && var7) {
         Direction var9 = this.method11909(var1, var8.method536());
         if (var9 != null && var9.getAxis() != var8.getAxis()) {
            var5 = var9;
            var4 = var9.method538() != var8.method536() ? Class111.field380 : Class111.field381;
         }
      }

      if (var4 == Class111.field379 && !var7) {
         if (var5 != this.method11909(var1, var5.method537())) {
            if (var5 == this.method11909(var1, var5.method538())) {
               var4 = Class111.field381;
            }
         } else {
            var4 = Class111.field380;
         }
      }

      return this.method11579()
         .method23465(field18865, var5)
         .method23465(field18866, var4)
         .method23465(field18867, Boolean.valueOf(var6.method23472() == Class9479.field44066));
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field18867) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Nullable
   private Direction method11909(Class5909 var1, Direction var2) {
      BlockState var5 = var1.method18360().getBlockState(var1.method18345().method8349(var2));
      return var5.isIn(this) && var5.method23463(field18866) == Class111.field379 ? var5.<Direction>method23463(field18865) : null;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class941) {
            ((Class941)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof IInventory) {
            Class7236.method22721(var2, var3, (IInventory)var8);
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         Class949 var9 = this.method11528(var1, var2, var3);
         if (var9 != null) {
            var4.method2766(var9);
            var4.addStat(this.method11910());
            Class4388.method13832(var4, true);
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   public Class9007<ResourceLocation> method11910() {
      return Stats.field40104.method172(Stats.field40161);
   }

   @Nullable
   public static IInventory method11911(Class3348 var0, BlockState var1, World var2, BlockPos var3, boolean var4) {
      return var0.method11904(var1, var2, var3, var4).<Optional<IInventory>>method27292(field18873).orElse((IInventory)null);
   }

   @Override
   public Class7995<? extends Class941> method11904(BlockState var1, World var2, BlockPos var3, boolean var4) {
      BiPredicate<Class1660, BlockPos> var7;
      if (!var4) {
         var7 = Class3348::method11913;
      } else {
         var7 = (var0, var1x) -> false;
      }

      return Class9324.method35243(this.field18859.get(), Class3348::method11907, Class3348::method11908, field18865, var1, var2, var3, var7);
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return this.method11904(var1, var2, var3, false).<Optional<Class949>>method27292(field18874).orElse((Class949)null);
   }

   public static Class6139<Class941, Float2FloatFunction> method11912(Class942 var0) {
      return new Class6141(var0);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class941();
   }

   public static boolean method11913(Class1660 var0, BlockPos var1) {
      return method11914(var0, var1) || method11915(var0, var1);
   }

   private static boolean method11914(IBlockReader var0, BlockPos var1) {
      BlockPos var4 = var1.up();
      return var0.getBlockState(var4).method23400(var0, var4);
   }

   private static boolean method11915(Class1660 var0, BlockPos var1) {
      List<Class1098> var4 = var0.method7182(
         Class1098.class,
         new AxisAlignedBB(
            (double)var1.getX(),
            (double)(var1.getY() + 1),
            (double)var1.getZ(),
            (double)(var1.getX() + 1),
            (double)(var1.getY() + 2),
            (double)(var1.getZ() + 1)
         )
      );
      if (!var4.isEmpty()) {
         for (Class1098 var6 : var4) {
            if (var6.method4395()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstoneFromInventory(method11911(this, var1, var2, var3, false));
   }

   @Override
   public BlockState method11500(BlockState var1, Rotation var2) {
      return var1.method23465(field18865, var2.method252(var1.<Direction>method23463(field18865)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18865)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18865, field18866, field18867);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
