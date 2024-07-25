package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class class_7550<T extends class_7550<T>> extends class_3516<T> implements class_5481<T> {
   public int field_38500 = 1;
   public int field_38501 = 0;
   private final List<class_2913> field_38499 = Lists.newArrayList();

   public T method_34360(class_1925 var1) {
      this.field_38499.add(var1.method_8947());
      return this.method_16197();
   }

   public class_2913[] method_34358() {
      return this.field_38499.<class_2913>toArray(new class_2913[0]);
   }

   public T method_34357(int var1) {
      this.field_38500 = var1;
      return this.method_16197();
   }

   public T method_34359(int var1) {
      this.field_38501 = var1;
      return this.method_16197();
   }
}
