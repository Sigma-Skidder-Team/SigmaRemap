package mapped;

import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public final class Class3576 implements Comparator<Entity> {
   private static String[] field19516;

   public int compare(Entity var1, Entity var2) {
      float var5 = BlockUtil.method34586().player.method3275(var1);
      float var6 = BlockUtil.method34586().player.method3275(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
