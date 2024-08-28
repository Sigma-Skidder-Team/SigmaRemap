package mapped;

import com.mentalfrostbyte.jello.module.Module;

import java.util.Comparator;

public class Class3597 implements Comparator<Entity> {
   private static String[] field19547;
   public final Class5281 field19548;

   public Class3597(Class5281 var1) {
      this.field19548 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      return !(Module.mc.field1339.method3275(var1) > Module.mc.field1339.method3275(var2)) ? -1 : 1;
   }
}
