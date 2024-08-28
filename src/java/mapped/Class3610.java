package mapped;

import java.util.Comparator;

public class Class3610 implements Comparator<Entity> {
   private static String[] field19577;
   public final Class5282 field19578;

   public Class3610(Class5282 var1) {
      this.field19578 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      return !(Class5282.method16572().field1339.method3275(var1) > Class5282.method16573().field1339.method3275(var2)) ? -1 : 1;
   }
}
