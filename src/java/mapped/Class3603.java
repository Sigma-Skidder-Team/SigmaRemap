package mapped;

import java.util.Comparator;

public class Class3603 implements Comparator<Entity> {
   private static String[] field19564;
   public final Class5254 field19565;

   public Class3603(Class5254 var1) {
      this.field19565 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = Class5254.method16403().field1339.method3275(var1);
      float var6 = Class5254.method16404().field1339.method3275(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
