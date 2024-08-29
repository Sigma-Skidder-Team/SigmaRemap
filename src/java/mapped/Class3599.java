package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3599 implements Comparator<Class8012> {
   private static String[] field19551;
   public final Class9528 field19552;

   public Class3599(Class9528 var1) {
      this.field19552 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      Object var7 = KillAura.field23949 != null && KillAura.field23949.method27397() != null
         ? KillAura.field23949.method27397()
         : this.field19552.field44347.player;
      float var8 = ((Entity)var7).method3275(var5);
      float var9 = ((Entity)var7).method3275(var6);
      if (!(var8 - var9 < 0.0F)) {
         return var8 - var9 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
