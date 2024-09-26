package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class RangeSorter implements Comparator<TimedEntity> {
   private static String[] field19571;
   public final InteractAutoBlock field19572;

   public RangeSorter(InteractAutoBlock var1) {
      this.field19572 = var1;
   }

   public int compare(TimedEntity var1, TimedEntity var2) {
      Entity var5 = var1.getEntity();
      Entity var6 = var2.getEntity();
      float var7 = this.field19572.mc.player.getDistance(var5);
      float var8 = this.field19572.mc.player.getDistance(var6);
      if (!(var7 - var8 < 0.0F)) {
         return var7 - var8 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
