package mapped;

import java.util.LinkedHashSet;
import java.util.Set;

public final class Class8743 {
   private static String[] field39421;
   private final Set<Class7723> field39422 = new LinkedHashSet<Class7723>();

   public synchronized void method31544(Class7723 var1) {
      this.field39422.add(var1);
   }

   public synchronized void method31545(Class7723 var1) {
      this.field39422.remove(var1);
   }

   public synchronized boolean method31546(Class7723 var1) {
      return this.field39422.contains(var1);
   }
}
