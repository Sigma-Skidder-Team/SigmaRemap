package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class Class6055 extends Class6036 {
   private static String[] field26239;
   private final Set<Integer> field26277 = Sets.newConcurrentHashSet();

   public Class6055(Class7161 var1) {
      super(var1, Class1868.field10270);
   }

   @Override
   public void method18665(int var1) {
      super.method18665(var1);
      if (this.method18741(var1)) {
         this.method18742(var1);
      }
   }

   public void method18740(int var1) {
      this.field26277.add(var1);
   }

   public boolean method18741(int var1) {
      return this.field26277.contains(var1);
   }

   public void method18742(int var1) {
      this.field26277.remove(var1);
   }
}
