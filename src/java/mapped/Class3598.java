package mapped;

import com.mentalfrostbyte.jello.module.Module;

import java.util.Comparator;

public class Class3598 implements Comparator<Module> {
   private static String[] field19549;
   public final Class5359 field19550;

   public Class3598(Class5359 var1) {
      this.field19550 = var1;
   }

   public int compare(Module var1, Module var2) {
      if (Class5359.method16860(this.field19550, var1) <= Class5359.method16860(this.field19550, var2)) {
         return Class5359.method16860(this.field19550, var1) >= Class5359.method16860(this.field19550, var2)
            ? var1.getSuffix().compareTo(var2.getSuffix())
            : 1;
      } else {
         return -1;
      }
   }
}
