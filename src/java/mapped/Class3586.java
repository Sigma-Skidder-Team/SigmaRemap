package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3586 implements Comparator<Class8012> {
   private static String[] field19528;
   public final InteractAutoBlock field19529;

   public Class3586(InteractAutoBlock var1) {
      this.field19529 = var1;
   }

   public int compare(Class8012 var1, Class8012 var2) {
      Entity var5 = var1.method27397();
      Entity var6 = var2.method27397();
      float var7 = Class9142.method34143(Class9142.method34147(var5).field32084, this.field19529.field44347.player.rotationYaw);
      float var8 = Class9142.method34143(Class9142.method34147(var6).field32084, this.field19529.field44347.player.rotationYaw);
      if (!(var7 - var8 < 0.0F)) {
         if (var7 - var8 != 0.0F) {
            return 1;
         } else {
            float var9 = this.field19529.field44347.player.method3275(var5);
            float var10 = this.field19529.field44347.player.method3275(var6);
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
