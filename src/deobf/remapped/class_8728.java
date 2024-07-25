package remapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

public class class_8728 {
   private static String[] field_44727;
   private long field_44728;
   private long field_44729;
   private final Map<String, class_8728> field_44726 = Maps.newHashMap();

   private class_8728() {
   }

   public void method_40083(Iterator<String> var1, long var2) {
      this.field_44729 += var2;
      if (var1.hasNext()) {
         this.field_44726.computeIfAbsent((String)var1.next(), var0 -> new class_8728()).method_40083(var1, var2);
      } else {
         this.field_44728 += var2;
      }
   }
}
