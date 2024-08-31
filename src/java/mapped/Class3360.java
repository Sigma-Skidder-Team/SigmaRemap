package mapped;

import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class Class3360 extends Class3359 {
   private static String[] field18905;
   public static final Class8554 field18906 = Class8820.field39763;
   private static final Map<Class112, Block> field18907 = Maps.newHashMap();
   private static final VoxelShape field18908 = Block.method11539(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public Class3360(Class112 var1, AbstractBlock var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18906, Integer.valueOf(0)));
      field18907.put(var1, this);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).method23384().method31086();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18908;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579()
         .method23465(field18906, Integer.valueOf(MathHelper.floor((double)((180.0F + var1.method18352()) * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18906, Integer.valueOf(var2.method253(var1.<Integer>method23463(field18906), 16)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23465(field18906, Integer.valueOf(var2.method8748(var1.<Integer>method23463(field18906), 16)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18906);
   }

   public static Block method11937(Class112 var0) {
      return field18907.getOrDefault(var0, Blocks.field36803);
   }
}
