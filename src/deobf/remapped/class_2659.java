package remapped;

import java.util.Comparator;

public class class_2659 implements Comparator<Entity> {
   private static String[] field_13100;

   public class_2659(TestModule var1) {
      this.field_13099 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      return !(Module.client.thePlayer.method_37175(var1) > Module.client.thePlayer.method_37175(var2)) ? -1 : 1;
   }
}
