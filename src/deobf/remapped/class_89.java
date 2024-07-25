package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class class_89<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends class_121 {
   private static String[] field_169;
   private final class_5019<T1> field_168;
   private final class_5019<T2> field_170;

   private class_89(class_5019<T1> var1, class_5019<T2> var2) {
      this.field_168 = var1;
      this.field_170 = var2;
   }

   @Override
   public List<class_5019<?>> method_354() {
      return ImmutableList.of(this.field_168, this.field_170);
   }

   public class_89<T1, T2> method_229(T1 var1, T2 var2, List<class_265> var3) {
      class_7727 var6 = class_7727.method_34971(this.field_168.method_23113((T1)var1), this.field_170.method_23113((T2)var2));
      this.method_356(var6, var3);
      return this;
   }

   public class_89<T1, T2> method_231(T1 var1, T2 var2, class_265 var3) {
      return this.method_229((T1)var1, (T2)var2, Collections.<class_265>singletonList(var3));
   }

   public class_121 method_232(BiFunction<T1, T2, class_265> var1) {
      this.field_168
         .method_23105()
         .forEach(var2 -> this.field_170.method_23105().forEach(var3 -> this.method_231((T1)var2, (T2)var3, (class_265)var1.apply(var2, var3))));
      return this;
   }

   public class_121 method_230(BiFunction<T1, T2, List<class_265>> var1) {
      this.field_168
         .method_23105()
         .forEach(var2 -> this.field_170.method_23105().forEach(var3 -> this.method_229((T1)var2, (T2)var3, (List<class_265>)var1.apply(var2, var3))));
      return this;
   }
}
