package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class Class3375 extends Class3373 {
   private static String[] field18971;
   public static final Class8553 field18972 = Class3198.field18484;
   private static final Map<Direction, VoxelShape> field18973 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.method11539(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         Direction.SOUTH,
         Block.method11539(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         Direction.EAST,
         Block.method11539(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         Direction.WEST,
         Block.method11539(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public Class3375(AbstractBlock var1, Class9673 var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18972, Direction.NORTH).method23465(field18966, Boolean.valueOf(false)));
   }

   @Override
   public String method11566() {
      return this.method11581().getTranslationKey();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field18973.get(var1.<Direction>method23463(field18972));
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return var2.getBlockState(var3.method8349(var1.<Direction>method23463(field18972).method536())).method23384().method31086();
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = this.method11579();
      Class7379 var5 = var1.method18360().method6739(var1.method18345());
      World var6 = var1.method18360();
      BlockPos var7 = var1.method18345();
      Direction[] var8 = var1.method18349();

      for (Direction var12 : var8) {
         if (var12.method544().method324()) {
            Direction var13 = var12.method536();
            var4 = var4.method23465(field18972, var13);
            if (var4.method23443(var6, var7)) {
               return var4.method23465(field18966, Boolean.valueOf(var5.method23472() == Class9479.field44066));
            }
         }
      }

      return null;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2.method536() == var1.method23463(field18972) && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18972, var2.method252(var1.<Direction>method23463(field18972)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18972)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18972, field18966);
   }
}
