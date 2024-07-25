package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_2093 implements class_5704 {
   private static String[] field_10514;
   private final List<class_7279> field_10513 = Lists.newArrayList();

   public class_2093(class_5704... var1) {
      for (class_5704 var7 : var1) {
         this.field_10513.add(var7.method_25791());
      }
   }

   @Override
   public class_2093 method_25790(class_5704 var1) {
      this.field_10513.add(var1.method_25791());
      return this;
   }

   @Override
   public class_7279 method_25791() {
      return new class_3514(this.field_10513.<class_7279>toArray(new class_7279[0]), null);
   }
}
