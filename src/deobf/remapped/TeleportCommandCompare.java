package remapped;

import java.util.Comparator;

public class TeleportCommandCompare implements Comparator<Entity> {
   private static String[] field_21519;

   public TeleportCommandCompare(TeleportCommand var1) {
      this.field_21518 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = TeleportCommand.method_18510().field_9632.method_37175(var1);
      float var6 = TeleportCommand.method_18511().field_9632.method_37175(var2);
      return (int)(var5 - var6);
   }
}
