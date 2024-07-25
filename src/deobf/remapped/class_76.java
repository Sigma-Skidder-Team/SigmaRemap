package remapped;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class_76 extends LinkedHashMap {
   private static String[] field_121;

   public class_76(class_1948 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.field_120 = var1;
   }

   @Override
   public boolean removeEldestEntry(Entry var1) {
      class_1948.method_8998(this.field_120, (class_9319)var1.getValue());
      class_1948.method_9003(this.field_120, class_1948.method_9005(this.field_120).field_47595);
      return false;
   }
}
