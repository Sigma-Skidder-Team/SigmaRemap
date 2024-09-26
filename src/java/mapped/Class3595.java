package mapped;

import com.mentalfrostbyte.jello.module.impl.combat.InfiniteAura;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3595 implements Comparator<TimedEntity> {
   private static String[] field19543;
   public final InfiniteAura field19544;

   public Class3595(InfiniteAura var1) {
      this.field19544 = var1;
   }

   public int compare(TimedEntity var1, TimedEntity var2) {
      Entity var5 = var1.getEntity();
      Entity var6 = var2.getEntity();
      float var7 = InfiniteAura.method16778().player.getDistance(var5);
      float var8 = InfiniteAura.method16779().player.getDistance(var6);
      if (!(var7 - var8 < 0.0F)) {
         return var7 - var8 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
