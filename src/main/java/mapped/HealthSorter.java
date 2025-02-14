package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class HealthSorter implements Comparator<TimedEntity> {
   private static String[] field19569;
   public final InteractAutoBlock field19570;

   public HealthSorter(InteractAutoBlock var1) {
      this.field19570 = var1;
   }

   public int compare(TimedEntity var1, TimedEntity var2) {
      Entity var5 = var1.getEntity();
      Entity var6 = var2.getEntity();
      float var7 = ((LivingEntity)var5).getHealth();
      float var8 = ((LivingEntity)var6).getHealth();
      if (!(var7 - var8 < 0.0F)) {
         if (var7 - var8 != 0.0F) {
            return 1;
         } else {
            float var9 = this.field19570.mc.player.getDistance(var5);
            float var10 = this.field19570.mc.player.getDistance(var6);
            if (!(var9 - var10 < 0.0F)) {
               return var9 - var10 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
