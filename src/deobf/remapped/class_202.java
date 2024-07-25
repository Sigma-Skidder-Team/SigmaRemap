package remapped;

import java.util.Comparator;

public class class_202 implements Comparator<Entity> {
   private static String[] field_675;

   public class_202(BowAimbotModule var1) {
      this.field_674 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      return !(BowAimbotModule.method_13449().field_9632.method_37175(var1) > BowAimbotModule.method_13452().field_9632.method_37175(var2)) ? -1 : 1;
   }
}
