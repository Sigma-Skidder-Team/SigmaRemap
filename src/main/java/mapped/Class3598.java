package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.impl.gui.classic.ActiveMods;

import java.util.Comparator;

public class Class3598 implements Comparator<Module> {
   private static String[] field19549;
   public final ActiveMods field19550;

   public Class3598(ActiveMods var1) {
      this.field19550 = var1;
   }

   public int compare(Module var1, Module var2) {
      if (ActiveMods.method16860(this.field19550, var1) <= ActiveMods.method16860(this.field19550, var2)) {
         return ActiveMods.method16860(this.field19550, var1) >= ActiveMods.method16860(this.field19550, var2)
            ? var1.getSuffix().compareTo(var2.getSuffix())
            : 1;
      } else {
         return -1;
      }
   }
}
