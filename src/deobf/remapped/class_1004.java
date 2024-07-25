package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_1004 extends class_5363<class_1004> {
   private static String[] field_5171;
   private final Set<class_4382> field_5170 = Sets.newHashSet();

   public class_1004 method_4353() {
      return this;
   }

   public class_1004 method_4354(class_4382 var1) {
      this.field_5170.add(var1);
      return this;
   }

   @Override
   public class_2913 method_8947() {
      return new class_2104(this.method_24475(), this.field_5170, null);
   }
}
