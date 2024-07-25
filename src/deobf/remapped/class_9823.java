package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class class_9823<T1 extends Comparable<T1>> extends class_121 {
   private static String[] field_49772;
   private final class_5019<T1> field_49773;

   private class_9823(class_5019<T1> var1) {
      this.field_49773 = var1;
   }

   @Override
   public List<class_5019<?>> method_354() {
      return ImmutableList.of(this.field_49773);
   }

   public class_9823<T1> method_45274(T1 var1, List<class_265> var2) {
      class_7727 var5 = class_7727.method_34971(this.field_49773.method_23113((T1)var1));
      this.method_356(var5, var2);
      return this;
   }

   public class_9823<T1> method_45275(T1 var1, class_265 var2) {
      return this.method_45274((T1)var1, Collections.<class_265>singletonList(var2));
   }

   public class_121 method_45276(Function<T1, class_265> var1) {
      this.field_49773.method_23105().forEach(var2 -> this.method_45275((T1)var2, (class_265)var1.apply(var2)));
      return this;
   }
}
