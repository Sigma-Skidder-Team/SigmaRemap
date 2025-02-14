package mapped;

import com.mentalfrostbyte.jello.module.impl.combat.KillAura;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class PrevRangeSorter implements Comparator<TimedEntity> {
   private static String[] field19551;
   public final InteractAutoBlock field19552;

   public PrevRangeSorter(InteractAutoBlock var1) {
      this.field19552 = var1;
   }

   public int compare(TimedEntity var1, TimedEntity var2) {
      Entity var5 = var1.getEntity();
      Entity var6 = var2.getEntity();
      Object var7 = KillAura.timedEntityIdk != null && KillAura.timedEntityIdk.getEntity() != null
         ? KillAura.timedEntityIdk.getEntity()
         : this.field19552.mc.player;
      float var8 = ((Entity)var7).getDistance(var5);
      float var9 = ((Entity)var7).getDistance(var6);
      if (!(var8 - var9 < 0.0F)) {
         return var8 - var9 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
