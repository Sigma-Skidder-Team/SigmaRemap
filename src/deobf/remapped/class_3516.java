package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class class_3516<T extends class_3516<T>> implements class_3042<T> {
   private final List<class_7279> field_17235 = Lists.newArrayList();

   public abstract T method_16197();

   public T method_16196(class_5704 var1) {
      this.field_17235.add(var1.method_25791());
      return this.method_16197();
   }

   public final T method_16198() {
      return this.method_16197();
   }

   public class_7279[] method_16195() {
      return this.field_17235.<class_7279>toArray(new class_7279[0]);
   }

   public class_6618 method_16199(class_3516<?> var1) {
      return new class_6618(this, var1);
   }

   public abstract class_3765 method_16194();
}
