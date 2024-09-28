package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

public final class Class6410 extends VoxelShape {
   private static String[] field28038;

   public Class6410(Class7938 var1) {
      super(var1);
   }

   @Override
   public DoubleList method19511(Direction.Axis var1) {
      return new Class53(this.field28033.method26732(var1));
   }

   @Override
   public int method19523(Direction.Axis var1, double var2) {
      int var6 = this.field28033.method26732(var1);
      return MathHelper.method37775(MathHelper.floor(var2 * (double)var6), -1, var6);
   }
}
