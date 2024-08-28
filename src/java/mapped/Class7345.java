package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7345 {
   private static final Logger field31450 = LogManager.getLogger();
   private final Class7900 field31451;

   public Class7345(Class7962<Class7900> var1) {
      this.field31451 = (Class7900)var1.method27085();
   }

   public Class8907 method23287(Class2348<Class8907> var1, int var2, int var3) {
      int var6 = this.field31451.method26471(var2, var3);
      Class8705 var7 = Class8900.method32443(var6);
      if (var7 != null) {
         Class8907 var8 = (Class8907)var1.method9183(var7);
         if (var8 != null) {
            return var8;
         } else if (!Class9246.field42545) {
            field31450.warn("Unknown biome id: ", var6);
            return var1.method9183(Class8900.method32443(0));
         } else {
            throw (IllegalStateException) Util.method38516(new IllegalStateException("Unknown biome id: " + var6));
         }
      } else {
         throw new IllegalStateException("Unknown biome id emitted by layers: " + var6);
      }
   }
}
