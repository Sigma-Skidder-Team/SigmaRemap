package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapePart;

public class Class6407 extends VoxelShape {
   private static String[] field28029;
   private final VoxelShape field28030;
   private final Direction.Axis field28031;
   private static final DoubleList field28032 = new Class53(1);

   public Class6407(VoxelShape var1, Direction.Axis var2, int var3) {
      super(method19510(var1.voxels, var2, var3));
      this.field28030 = var1;
      this.field28031 = var2;
   }

   private static VoxelShapePart method19510(VoxelShapePart var0, Direction.Axis var1, int var2) {
      return new Class7939(
         var0,
         var1.method327(var2, 0, 0),
         var1.method327(0, var2, 0),
         var1.method327(0, 0, var2),
         var1.method327(var2 + 1, var0.field34037, var0.field34037),
         var1.method327(var0.field34038, var2 + 1, var0.field34038),
         var1.method327(var0.field34039, var0.field34039, var2 + 1)
      );
   }

   @Override
   public DoubleList method19511(Direction.Axis var1) {
      return var1 != this.field28031 ? this.field28030.method19511(var1) : field28032;
   }
}
