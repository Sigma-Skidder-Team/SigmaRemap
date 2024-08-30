package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3607 implements Comparator<Class8012> {
   private static String[] field19571;
   public final InteractAutoBlock field19572;

   public Class3607(InteractAutoBlock var1) {
      this.field19572 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      float var7 = this.field19572.field44347.player.method3275(var5);
      float var8 = this.field19572.field44347.player.method3275(var6);
      if (!(var7 - var8 < 0.0F)) {
         return var7 - var8 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
