package mapped;

import java.util.Comparator;

public class Class3592 implements Comparator<Entity> {
   private static String[] field19537;
   public final Class5282 field19538;

   public Class3592(Class5282 var1) {
      this.field19538 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = Class9142.method34143(Class9142.method34147(var1).field32084, Class5282.method16574().player.rotationYaw);
      float var6 = Class9142.method34143(Class9142.method34147(var2).field32084, Class5282.method16575().player.rotationYaw);
      if (!(var5 - var6 < 0.0F)) {
         if (var5 - var6 != 0.0F) {
            return 1;
         } else {
            float var7 = Class5282.method16576().player.method3275(var1);
            float var8 = Class5282.method16577().player.method3275(var2);
            if (!(var7 - var8 < 0.0F)) {
               return var7 - var8 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
