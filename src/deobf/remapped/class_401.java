package remapped;

import java.util.Comparator;

public class class_401 implements Comparator<Entity> {
   private static String[] field_1674;

   public class_401(AutoCrystalModule var1) {
      this.field_1673 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = AutoCrystalModule.method_44025().field_9632.method_37175(var1);
      float var6 = AutoCrystalModule.method_44013().field_9632.method_37175(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
