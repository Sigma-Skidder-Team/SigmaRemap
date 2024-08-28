package mapped;

import com.google.common.base.MoreObjects;
import java.util.List;

public class Class8548 {
   private static String[] field38430;
   private final Class7226 field38431;
   private final List<Class7222> field38432;
   private final int field38433;

   public Class8548(Class7226 var1, List<Class7222> var2, int var3) {
      this.field38431 = var1;
      this.field38432 = var2;
      this.field38433 = var3;
   }

   public Class7222 method30461(int var1) {
      return var1 >= 0 && var1 < this.field38432.size()
         ? (Class7222)MoreObjects.firstNonNull(this.field38432.get(var1), Class8036.field34536)
         : Class8036.field34536;
   }

   public int method30462() {
      return this.field38433;
   }
}
