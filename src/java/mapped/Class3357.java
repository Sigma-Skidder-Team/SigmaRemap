package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Random;

public class Class3357 extends Class3241 {
   private static String[] field18898;
   public static final Class8553 field18899 = Class3433.field19198;
   public static final Class8551 field18900 = Class8820.field39708;
   private static final Map<Item, Class6226> field18901 = Util.make(
      new Object2ObjectOpenHashMap(), var0 -> var0.defaultReturnValue(new Class6218())
   );

   public static void method11931(Class3303 var0, Class6226 var1) {
      field18901.put(var0.method11581(), var1);
   }

   public Class3357(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18899, Direction.NORTH).method23465(field18900, Boolean.valueOf(false)));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof Class971) {
            var4.method2766((Class971)var9);
            if (!(var9 instanceof Class972)) {
               var4.method2911(Class8876.field40151);
            } else {
               var4.method2911(Class8876.field40149);
            }
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   public void method11932(ServerWorld var1, BlockPos var2) {
      Class2957 var5 = new Class2957(var1, var2);
      Class971 var6 = var5.<Class971>method11325();
      int var7 = var6.method4022();
      if (var7 >= 0) {
         ItemStack var8 = var6.method3618(var7);
         Class6226 var9 = this.method11933(var8);
         if (var9 != Class6226.field27722) {
            var6.method3621(var7, var9.method19196(var5, var8));
         }
      } else {
         var1.playEvent(1001, var2, 0);
      }
   }

   public Class6226 method11933(ItemStack var1) {
      return field18901.get(var1.getItem());
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3) || var2.method6780(var3.up());
      boolean var10 = var1.<Boolean>method23463(field18900);
      if (var9 && !var10) {
         var2.method6860().method20726(var3, this, 4);
         var2.setBlockState(var3, var1.method23465(field18900, Boolean.valueOf(true)), 4);
      } else if (!var9 && var10) {
         var2.setBlockState(var3, var1.method23465(field18900, Boolean.valueOf(false)), 4);
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.method11932(var2, var3);
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class971();
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18899, var1.method18348().method536());
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class971) {
            ((Class971)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.method23448(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class971) {
            Class7236.method22721(var2, var3, (Class971)var8);
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   public static Class2955 method11934(Class2956 var0) {
      Direction var3 = var0.method11324().<Direction>method23463(field18899);
      double var4 = var0.method11320() + 0.7 * (double)var3.method539();
      double var6 = var0.method11321() + 0.7 * (double)var3.method540();
      double var8 = var0.method11322() + 0.7 * (double)var3.method541();
      return new Class2959(var4, var6, var8);
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Class5812.method18151(var2.getTileEntity(var3));
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18899, var2.method252(var1.<Direction>method23463(field18899)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18899)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18899, field18900);
   }
}
