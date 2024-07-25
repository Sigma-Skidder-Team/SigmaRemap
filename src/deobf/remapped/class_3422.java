package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_3422 extends class_5363<class_3422> {
   private static String[] field_16850;
   private final class_9397 field_16852;
   private final List<class_8995> field_16851 = Lists.newArrayList();

   private class_3422(class_9397 var1) {
      this.field_16852 = var1;
   }

   public class_3422 method_15819(String var1, String var2, class_7063 var3) {
      this.field_16851.add(new class_8995(var1, var2, var3, null));
      return this;
   }

   public class_3422 method_15820(String var1, String var2) {
      return this.method_15819(var1, var2, class_7063.field_36448);
   }

   public class_3422 method_15818() {
      return this;
   }

   @Override
   public class_2913 method_8947() {
      return new class_795(this.method_24475(), this.field_16852, this.field_16851, null);
   }
}
