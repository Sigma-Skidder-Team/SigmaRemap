package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.impl.misc.Test;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3597 implements Comparator<Entity> {
   private static String[] field19547;
   public final Test field19548;

   public Class3597(Test var1) {
      this.field19548 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      return !(Module.mc.player.method3275(var1) > Module.mc.player.method3275(var2)) ? -1 : 1;
   }
}
