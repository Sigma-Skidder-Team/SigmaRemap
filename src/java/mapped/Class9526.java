package mapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

public class Class9526 {
   private static String[] field44340;
   private long field44341;
   private long field44342;
   private final Map<String, Class9526> field44343 = Maps.newHashMap();

   private Class9526() {
   }

   public void method36808(Iterator<String> var1, long var2) {
      this.field44342 += var2;
      if (var1.hasNext()) {
         this.field44343.computeIfAbsent((String)var1.next(), var0 -> new Class9526()).method36808(var1, var2);
      } else {
         this.field44341 += var2;
      }
   }

   // $VF: synthetic method
   public static long method36810(Class9526 var0) {
      return var0.field44342;
   }

   // $VF: synthetic method
   public static long method36811(Class9526 var0) {
      return var0.field44341;
   }

   // $VF: synthetic method
   public static Map<String, Class9526> method36812(Class9526 var0) {
      return var0.field44343;
   }

   // $VF: synthetic method
   public Class9526(Class6704 var1) {
      this();
   }
}
