package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class3222 extends Block {
   private static String[] field18646;
   public static final Class8552<Class98> field18647 = Class8820.field39731;
   public static final Class8552<Class98> field18648 = Class8820.field39730;
   public static final Class8552<Class98> field18649 = Class8820.field39732;
   public static final Class8552<Class98> field18650 = Class8820.field39733;
   public static final Class8554 field18651 = Class8820.field39759;
   public static final Map<Direction, Class8552<Class98>> field18652 = Maps.newEnumMap(
      ImmutableMap.of(Direction.NORTH, field18647, Direction.EAST, field18648, Direction.SOUTH, field18649, Direction.WEST, field18650)
   );
   private static final VoxelShape field18653 = Block.method11539(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<Direction, VoxelShape> field18654 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.method11539(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         Direction.SOUTH,
         Block.method11539(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         Direction.EAST,
         Block.method11539(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         Direction.WEST,
         Block.method11539(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<Direction, VoxelShape> field18655 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         VoxelShapes.method27431(field18654.get(Direction.NORTH), Block.method11539(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         Direction.SOUTH,
         VoxelShapes.method27431(field18654.get(Direction.SOUTH), Block.method11539(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         Direction.EAST,
         VoxelShapes.method27431(field18654.get(Direction.EAST), Block.method11539(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         Direction.WEST,
         VoxelShapes.method27431(field18654.get(Direction.WEST), Block.method11539(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private final Map<BlockState, VoxelShape> field18656 = Maps.newHashMap();
   private static final Vector3f[] field18657 = new Vector3f[16];
   private final BlockState field18658;
   private boolean field18659 = true;

   public Class3222(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18647, Class98.field267)
            .method23465(field18648, Class98.field267)
            .method23465(field18649, Class98.field267)
            .method23465(field18650, Class98.field267)
            .method23465(field18651, Integer.valueOf(0))
      );
      this.field18658 = this.method11579()
         .method23465(field18647, Class98.field266)
         .method23465(field18648, Class98.field266)
         .method23465(field18649, Class98.field266)
         .method23465(field18650, Class98.field266);
      UnmodifiableIterator var4 = this.getStateContainer().getValidStates().iterator();

      while (var4.hasNext()) {
         BlockState var5 = (BlockState)var4.next();
         if (var5.<Integer>method23463(field18651) == 0) {
            this.field18656.put(var5, this.method11613(var5));
         }
      }
   }

   private VoxelShape method11613(BlockState var1) {
      VoxelShape var4 = field18653;

      for (Direction var6 : Class76.field161) {
         Class98 var7 = var1.<Class98>method23463(field18652.get(var6));
         if (var7 != Class98.field266) {
            if (var7 == Class98.field265) {
               var4 = VoxelShapes.method27431(var4, field18655.get(var6));
            }
         } else {
            var4 = VoxelShapes.method27431(var4, field18654.get(var6));
         }
      }

      return var4;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return this.field18656.get(var1.method23465(field18651, Integer.valueOf(0)));
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11614(var1.method18360(), this.field18658, var1.method18345());
   }

   private BlockState method11614(Class1665 var1, BlockState var2, BlockPos var3) {
      boolean var6 = method11617(var2);
      var2 = this.method11615(var1, this.method11579().method23465(field18651, var2.<Integer>method23463(field18651)), var3);
      if (var6 && method11617(var2)) {
         return var2;
      } else {
         boolean var7 = var2.<Class98>method23463(field18647).method279();
         boolean var8 = var2.<Class98>method23463(field18649).method279();
         boolean var9 = var2.<Class98>method23463(field18648).method279();
         boolean var10 = var2.<Class98>method23463(field18650).method279();
         boolean var11 = !var7 && !var8;
         boolean var12 = !var9 && !var10;
         if (!var10 && var11) {
            var2 = var2.method23465(field18650, Class98.field266);
         }

         if (!var9 && var11) {
            var2 = var2.method23465(field18648, Class98.field266);
         }

         if (!var7 && var12) {
            var2 = var2.method23465(field18647, Class98.field266);
         }

         if (!var8 && var12) {
            var2 = var2.method23465(field18649, Class98.field266);
         }

         return var2;
      }
   }

   private BlockState method11615(Class1665 var1, BlockState var2, BlockPos var3) {
      boolean var6 = !var1.getBlockState(var3.up()).method23400(var1, var3);

      for (Direction var8 : Class76.field161) {
         if (!var2.<Class98>method23463(field18652.get(var8)).method279()) {
            Class98 var9 = this.method11620(var1, var3, var8, var6);
            var2 = var2.method23465(field18652.get(var8), var9);
         }
      }

      return var2;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.DOWN) {
         if (var2 == Direction.field673) {
            return this.method11614(var4, var1, var5);
         } else {
            Class98 var9 = this.method11619(var4, var5, var2);
            return var9.method279() == var1.<Class98>method23463(field18652.get(var2)).method279() && !method11616(var1)
               ? var1.method23465(field18652.get(var2), var9)
               : this.method11614(
                  var4, this.field18658.method23465(field18651, var1.<Integer>method23463(field18651)).method23465(field18652.get(var2), var9), var5
               );
         }
      } else {
         return var1;
      }
   }

   private static boolean method11616(BlockState var0) {
      return var0.<Class98>method23463(field18647).method279()
         && var0.<Class98>method23463(field18649).method279()
         && var0.<Class98>method23463(field18648).method279()
         && var0.<Class98>method23463(field18650).method279();
   }

   private static boolean method11617(BlockState var0) {
      return !var0.<Class98>method23463(field18647).method279()
         && !var0.<Class98>method23463(field18649).method279()
         && !var0.<Class98>method23463(field18648).method279()
         && !var0.<Class98>method23463(field18650).method279();
   }

   @Override
   public void method11618(BlockState var1, Class1660 var2, BlockPos var3, int var4, int var5) {
      Mutable var8 = new Mutable();

      for (Direction var10 : Class76.field161) {
         Class98 var11 = var1.<Class98>method23463(field18652.get(var10));
         if (var11 != Class98.field267 && !var2.getBlockState(var8.method8377(var3, var10)).method23448(this)) {
            var8.method8379(Direction.DOWN);
            BlockState var12 = var2.getBlockState(var8);
            if (!var12.method23448(Blocks.field36895)) {
               BlockPos var13 = var8.method8349(var10.method536());
               BlockState var14 = var12.method23439(var10.method536(), var2.getBlockState(var13), var2, var8, var13);
               method11544(var12, var14, var2, var8, var4, var5);
            }

            var8.method8377(var3, var10).method8379(Direction.field673);
            BlockState var16 = var2.getBlockState(var8);
            if (!var16.method23448(Blocks.field36895)) {
               BlockPos var17 = var8.method8349(var10.method536());
               BlockState var15 = var16.method23439(var10.method536(), var2.getBlockState(var17), var2, var8, var17);
               method11544(var16, var15, var2, var8, var4, var5);
            }
         }
      }
   }

   private Class98 method11619(Class1665 var1, BlockPos var2, Direction var3) {
      return this.method11620(var1, var2, var3, !var1.getBlockState(var2.up()).method23400(var1, var2));
   }

   private Class98 method11620(Class1665 var1, BlockPos var2, Direction var3, boolean var4) {
      BlockPos var7 = var2.method8349(var3);
      BlockState var8 = var1.getBlockState(var7);
      if (var4) {
         boolean var9 = this.method11621(var1, var7, var8);
         if (var9 && method11627(var1.getBlockState(var7.up()))) {
            if (!var8.method23454(var1, var7, var3.method536())) {
               return Class98.field266;
            }

            return Class98.field265;
         }
      }

      return !method11628(var8, var3) && (var8.method23400(var1, var7) || !method11627(var1.getBlockState(var7.down())))
         ? Class98.field267
         : Class98.field266;
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      BlockState var7 = var2.getBlockState(var6);
      return this.method11621(var2, var6, var7);
   }

   private boolean method11621(Class1665 var1, BlockPos var2, BlockState var3) {
      return var3.method23454(var1, var2, Direction.field673) || var3.method23448(Blocks.field36723);
   }

   private void method11622(World var1, BlockPos var2, BlockState var3) {
      int var6 = this.method11623(var1, var2);
      if (var3.<Integer>method23463(field18651) != var6) {
         if (var1.getBlockState(var2) == var3) {
            var1.setBlockState(var2, var3.method23465(field18651, Integer.valueOf(var6)), 2);
         }

         Set<BlockPos> var7 = Sets.newHashSet();
         var7.add(var2);

         for (Direction var11 : Direction.values()) {
            var7.add(var2.method8349(var11));
         }

         for (BlockPos var13 : var7) {
            var1.notifyNeighborsOfStateChange(var13, this);
         }
      }
   }

   private int method11623(World var1, BlockPos var2) {
      this.field18659 = false;
      int var5 = var1.method6781(var2);
      this.field18659 = true;
      int var6 = 0;
      if (var5 < 15) {
         for (Direction var8 : Class76.field161) {
            BlockPos var9 = var2.method8349(var8);
            BlockState var10 = var1.getBlockState(var9);
            var6 = Math.max(var6, this.method11624(var10));
            BlockPos var11 = var2.up();
            if (var10.method23400(var1, var9) && !var1.getBlockState(var11).method23400(var1, var11)) {
               var6 = Math.max(var6, this.method11624(var1.getBlockState(var9.up())));
            } else if (!var10.method23400(var1, var9)) {
               var6 = Math.max(var6, this.method11624(var1.getBlockState(var9.down())));
            }
         }
      }

      return Math.max(var5, var6 - 1);
   }

   private int method11624(BlockState var1) {
      return !var1.method23448(this) ? 0 : var1.<Integer>method23463(field18651);
   }

   private void method11625(World var1, BlockPos var2) {
      if (var1.getBlockState(var2).method23448(this)) {
         var1.notifyNeighborsOfStateChange(var2, this);

         for (Direction var8 : Direction.values()) {
            var1.notifyNeighborsOfStateChange(var2.method8349(var8), this);
         }
      }
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.method23448(var1.getBlock()) && !var2.isRemote) {
         this.method11622(var2, var3, var1);

         for (Direction var9 : Class76.field162) {
            var2.notifyNeighborsOfStateChange(var3.method8349(var9), this);
         }

         this.method11626(var2, var3);
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.getBlock())) {
         super.method11513(var1, var2, var3, var4, var5);
         if (!var2.isRemote) {
            for (Direction var11 : Direction.values()) {
               var2.notifyNeighborsOfStateChange(var3.method8349(var11), this);
            }

            this.method11622(var2, var3, var1);
            this.method11626(var2, var3);
         }
      }
   }

   private void method11626(World var1, BlockPos var2) {
      for (Direction var6 : Class76.field161) {
         this.method11625(var1, var2.method8349(var6));
      }

      for (Direction var9 : Class76.field161) {
         BlockPos var7 = var2.method8349(var9);
         if (!var1.getBlockState(var7).method23400(var1, var7)) {
            this.method11625(var1, var7.down());
         } else {
            this.method11625(var1, var7.up());
         }
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         if (!var1.method23443(var2, var3)) {
            method11554(var1, var2, var3);
            var2.removeBlock(var3, false);
         } else {
            this.method11622(var2, var3, var1);
         }
      }
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return this.field18659 ? var1.method23402(var2, var3, var4) : 0;
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      if (this.field18659 && var4 != Direction.DOWN) {
         int var7 = var1.<Integer>method23463(field18651);
         if (var7 == 0) {
            return 0;
         } else {
            return var4 != Direction.field673 && !this.method11614(var2, var1, var3).<Class98>method23463(field18652.get(var4.method536())).method279()
               ? 0
               : var7;
         }
      } else {
         return 0;
      }
   }

   public static boolean method11627(BlockState var0) {
      return method11628(var0, (Direction)null);
   }

   public static boolean method11628(BlockState var0, Direction var1) {
      if (var0.method23448(Blocks.REDSTONE_WIRE)) {
         return true;
      } else if (!var0.method23448(Blocks.field36592)) {
         return var0.method23448(Blocks.field36895) ? var1 == var0.<Direction>method23463(Class3434.field19198) : var0.method23401() && var1 != null;
      } else {
         Direction var4 = var0.<Direction>method23463(Class3248.field18484);
         return var4 == var1 || var4.method536() == var1;
      }
   }

   @Override
   public boolean method11516(BlockState var1) {
      return this.field18659;
   }

   public static int method11629(int var0) {
      Vector3f var3 = field18657[var0];
      return MathHelper.method37805(var3.method25269(), var3.method25270(), var3.method25271());
   }

   private void method11630(World var1, Random var2, BlockPos var3, Vector3f var4, Direction var5, Direction var6, float var7, float var8) {
      float var11 = var8 - var7;
      if (!(var2.nextFloat() >= 0.2F * var11)) {
         float var12 = 0.4375F;
         float var13 = var7 + var11 * var2.nextFloat();
         double var14 = 0.5 + (double)(0.4375F * (float)var5.method539()) + (double)(var13 * (float)var6.method539());
         double var16 = 0.5 + (double)(0.4375F * (float)var5.method540()) + (double)(var13 * (float)var6.method540());
         double var18 = 0.5 + (double)(0.4375F * (float)var5.method541()) + (double)(var13 * (float)var6.method541());
         var1.method6746(
            new Class7437(var4.method25269(), var4.method25270(), var4.method25271(), 1.0F),
            (double)var3.getX() + var14,
            (double)var3.getY() + var16,
            (double)var3.getZ() + var18,
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method23463(field18651);
      if (var7 != 0) {
         for (Direction var9 : Class76.field161) {
            Class98 var10 = var1.<Class98>method23463(field18652.get(var9));
            switch (Class7339.field31442[var10.ordinal()]) {
               case 1:
                  this.method11630(var2, var4, var3, field18657[var7], var9, Direction.field673, -0.5F, 0.5F);
               case 2:
                  this.method11630(var2, var4, var3, field18657[var7], Direction.DOWN, var9, 0.0F, 0.5F);
                  break;
               case 3:
               default:
                  this.method11630(var2, var4, var3, field18657[var7], Direction.DOWN, var9, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      switch (Class7339.field31443[var2.ordinal()]) {
         case 1:
            return var1.method23465(field18647, var1.<Class98>method23463(field18649))
               .method23465(field18648, var1.<Class98>method23463(field18650))
               .method23465(field18649, var1.<Class98>method23463(field18647))
               .method23465(field18650, var1.<Class98>method23463(field18648));
         case 2:
            return var1.method23465(field18647, var1.<Class98>method23463(field18648))
               .method23465(field18648, var1.<Class98>method23463(field18649))
               .method23465(field18649, var1.<Class98>method23463(field18650))
               .method23465(field18650, var1.<Class98>method23463(field18647));
         case 3:
            return var1.method23465(field18647, var1.<Class98>method23463(field18650))
               .method23465(field18648, var1.<Class98>method23463(field18647))
               .method23465(field18649, var1.<Class98>method23463(field18648))
               .method23465(field18650, var1.<Class98>method23463(field18649));
         default:
            return var1;
      }
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      switch (Class7339.field31444[var2.ordinal()]) {
         case 1:
            return var1.method23465(field18647, var1.<Class98>method23463(field18649)).method23465(field18649, var1.<Class98>method23463(field18647));
         case 2:
            return var1.method23465(field18648, var1.<Class98>method23463(field18650)).method23465(field18650, var1.<Class98>method23463(field18648));
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18647, field18648, field18649, field18650, field18651);
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var4.abilities.field29610) {
         return ActionResultType.field14820;
      } else {
         if (method11616(var1) || method11617(var1)) {
            BlockState var9 = !method11616(var1) ? this.field18658 : this.method11579();
            var9 = var9.method23465(field18651, var1.<Integer>method23463(field18651));
            var9 = this.method11614(var2, var9, var3);
            if (var9 != var1) {
               var2.setBlockState(var3, var9, 3);
               this.method11631(var2, var3, var1, var9);
               return ActionResultType.field14818;
            }
         }

         return ActionResultType.field14820;
      }
   }

   private void method11631(World var1, BlockPos var2, BlockState var3, BlockState var4) {
      for (Direction var8 : Class76.field161) {
         BlockPos var9 = var2.method8349(var8);
         if (var3.<Class98>method23463(field18652.get(var8)).method279() != var4.<Class98>method23463(field18652.get(var8)).method279()
            && var1.getBlockState(var9).method23400(var1, var9)) {
            var1.notifyNeighborsOfStateExcept(var9, var4.getBlock(), var8.method536());
         }
      }
   }

   static {
      for (int var2 = 0; var2 <= 15; var2++) {
         float var3 = (float)var2 / 15.0F;
         float var4 = var3 * 0.6F + (!(var3 > 0.0F) ? 0.3F : 0.4F);
         float var5 = MathHelper.method37777(var3 * var3 * 0.7F - 0.5F, 0.0F, 1.0F);
         float var6 = MathHelper.method37777(var3 * var3 * 0.6F - 0.7F, 0.0F, 1.0F);
         field18657[var2] = new Vector3f(var4, var5, var6);
      }
   }
}
