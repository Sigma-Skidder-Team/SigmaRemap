package mapped;

import java.util.Comparator;

public final class Class3583 implements Comparator<PlayerEntity> {
   private static String[] field19525;

   public int compare(PlayerEntity var1, PlayerEntity var2) {
      float var5 = Class9217.method34586().player.method3275(var1);
      float var6 = Class9217.method34586().player.method3275(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? -1 : 0;
      } else {
         return 1;
      }
   }
}
