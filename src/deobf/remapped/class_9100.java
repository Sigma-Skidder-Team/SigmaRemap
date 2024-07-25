package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_9100 extends class_5363<class_9100> {
   private static String[] field_46608;
   private final List<class_3765> field_46609 = Lists.newArrayList();

   public class_9100 method_41942() {
      return this;
   }

   public class_9100 method_41943(class_3516<?> var1) {
      this.field_46609.add(var1.method_16194());
      return this;
   }

   @Override
   public class_2913 method_8947() {
      return new class_3148(this.method_24475(), this.field_46609, null);
   }
}
