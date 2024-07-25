package remapped;

import java.util.IdentityHashMap;

public class class_7563 extends IdentityHashMap<Object, class_1621> {
   private static String[] field_38539;
   private static final long field_38538 = -5576159264232131854L;

   public class_7563(class_150 var1) {
      this.field_38537 = var1;
   }

   public class_1621 put(Object var1, class_1621 var2) {
      return super.put(var1, new class_2158(var2));
   }
}
