package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Class4644 extends Class4643 {
   private static String[] field22170;
   public final Class6212 field22171;

   public Class4644(Class6212 var1) {
      super(var1);
      this.field22171 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      Object var4 = super.method14587(var1);
      return var4 instanceof Class4640 && !(var4 instanceof ConcurrentSkipListMap) ? new ConcurrentSkipListMap((Map)var4) : var4;
   }
}
