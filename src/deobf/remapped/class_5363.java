package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class class_5363<T extends class_5363<T>> implements class_1925, class_3042<T> {
   private final List<class_7279> field_27364 = Lists.newArrayList();

   public T method_24477(class_5704 var1) {
      this.field_27364.add(var1.method_25791());
      return this.method_24476();
   }

   public final T method_24478() {
      return this.method_24476();
   }

   public abstract T method_24476();

   public class_7279[] method_24475() {
      return this.field_27364.<class_7279>toArray(new class_7279[0]);
   }
}
