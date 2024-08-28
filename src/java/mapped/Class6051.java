package mapped;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class Class6051 extends Class6037 {
   private static String[] field26239;
   private final Set<Long> field26275 = Sets.newConcurrentHashSet();
   private final Set<Long> field26276 = Sets.newConcurrentHashSet();

   public Class6051(Class7161 var1) {
      super(var1);
   }

   public static long method18736(int var0, int var1) {
      return ((long)var0 << 32) + (long)var1 - -2147483648L;
   }

   public List<Object> method18737(Object var1) throws Exception {
      return Class8042.method27614().method34424().<Class5419>method31084(Class5419.class).method17013(var1, this);
   }

   public Set<Long> method18738() {
      return this.field26275;
   }

   public Set<Long> method18739() {
      return this.field26276;
   }
}
