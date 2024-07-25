package remapped;

import java.util.Comparator;

public final class class_469 implements Comparator<PlayerEntity> {
   private static String[] field_2935;

   public int compare(PlayerEntity var1, PlayerEntity var2) {
      float var5 = class_7494.method_34122().field_9632.method_37175(var1);
      float var6 = class_7494.method_34122().field_9632.method_37175(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? -1 : 0;
      } else {
         return 1;
      }
   }
}
