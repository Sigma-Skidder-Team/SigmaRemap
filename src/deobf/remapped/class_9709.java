package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_9709 extends class_3261 {
   private static String[] field_49368;
   private final Set<Integer> field_49367 = Sets.newConcurrentHashSet();

   public class_9709(class_1455 var1) {
      super(var1, class_6548.field_33336);
   }

   @Override
   public void method_14877(int var1) {
      super.method_14877(var1);
      if (this.method_44848(var1)) {
         this.method_44847(var1);
      }
   }

   public void method_44849(int var1) {
      this.field_49367.add(var1);
   }

   public boolean method_44848(int var1) {
      return this.field_49367.contains(var1);
   }

   public void method_44847(int var1) {
      this.field_49367.remove(var1);
   }
}
