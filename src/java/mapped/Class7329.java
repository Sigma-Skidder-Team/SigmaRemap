package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public interface Class7329 {
   Vector3d method23228(Class6619 var1);

   Vector2f method23229(Class6619 var1);

   default BlockPos method23230(Class6619 var1) {
      return new BlockPos(this.method23228(var1));
   }

   boolean method23231();

   boolean method23232();

   boolean method23233();
}
