package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Class4640 extends Class4639 {
   private static String[] field22166;
   public final Class6212 field22167;

   public Class4640(Class6212 var1) {
      super(var1);
      this.field22167 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Object var4 = super.method14587(var1);
      return var4 instanceof Class4640 && !(var4 instanceof ConcurrentSkipListMap) ? new ConcurrentSkipListMap((Map)var4) : var4;
   }
}
