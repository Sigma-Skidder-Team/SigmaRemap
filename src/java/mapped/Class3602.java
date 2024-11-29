package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.impl.gui.jello.ActiveMods;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;

import java.util.Comparator;

public class Class3602 implements Comparator<Module> {
   private static String[] field19562;
   public final ActiveMods field19563;

   public Class3602(ActiveMods var1) {
      this.field19563 = var1;
   }

   public int compare(Module var1, Module var2) {
      int var5 = ResourceRegistry.JelloLightFont20.getStringWidth(var1.getName());
      int var6 = ResourceRegistry.JelloLightFont20.getStringWidth(var2.getName());
      if (var5 <= var6) {
         return var5 != var6 ? 1 : 0;
      } else {
         return -1;
      }
   }
}
