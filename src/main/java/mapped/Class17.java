package mapped;

import java.util.IdentityHashMap;

public class Class17 extends IdentityHashMap<Object, Class7255> {
   private static String[] field28;
   private static final long field29 = -5576159264232131854L;
   public final Class4498 field30;

   public Class17(Class4498 var1) {
      this.field30 = var1;
   }

   public Class7255 put(Object var1, Class7255 var2) {
      return super.put(var1, new Class7257(var2));
   }
}
