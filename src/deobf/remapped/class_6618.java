package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_6618 extends class_3516<class_6618> {
   private static String[] field_34186;
   private final List<class_3765> field_34185 = Lists.newArrayList();

   public class_6618(class_3516<?>... var1) {
      for (class_3516 var7 : var1) {
         this.field_34185.add(var7.method_16194());
      }
   }

   public class_6618 method_30432() {
      return this;
   }

   @Override
   public class_6618 method_16199(class_3516<?> var1) {
      this.field_34185.add(var1.method_16194());
      return this;
   }

   @Override
   public class_3765 method_16194() {
      return new class_4108(this.field_34185.<class_3765>toArray(new class_3765[0]), this.method_16195());
   }
}
