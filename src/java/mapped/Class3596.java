package mapped;

import java.util.Comparator;

public class Class3596 implements Comparator<Entity> {
   private static String[] field19545;
   public final TP field19546;

   public Class3596(TP var1) {
      this.field19546 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = TP.method18340().player.method3275(var1);
      float var6 = TP.method18341().player.method3275(var2);
      return (int)(var5 - var6);
   }
}
