package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class class_5338<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends class_121 {
   private static String[] field_27224;
   private final class_5019<T1> field_27226;
   private final class_5019<T2> field_27223;
   private final class_5019<T3> field_27225;

   private class_5338(class_5019<T1> var1, class_5019<T2> var2, class_5019<T3> var3) {
      this.field_27226 = var1;
      this.field_27223 = var2;
      this.field_27225 = var3;
   }

   @Override
   public List<class_5019<?>> method_354() {
      return ImmutableList.of(this.field_27226, this.field_27223, this.field_27225);
   }

   public class_5338<T1, T2, T3> method_24326(T1 var1, T2 var2, T3 var3, List<class_265> var4) {
      class_7727 var7 = class_7727.method_34971(
         this.field_27226.method_23113((T1)var1), this.field_27223.method_23113((T2)var2), this.field_27225.method_23113((T3)var3)
      );
      this.method_356(var7, var4);
      return this;
   }

   public class_5338<T1, T2, T3> method_24325(T1 var1, T2 var2, T3 var3, class_265 var4) {
      return this.method_24326((T1)var1, (T2)var2, (T3)var3, Collections.<class_265>singletonList(var4));
   }

   public class_121 method_24327(class_5815<T1, T2, T3, class_265> var1) {
      this.field_27226
         .method_23105()
         .forEach(
            var2 -> this.field_27223
                  .method_23105()
                  .forEach(
                     var3 -> this.field_27225
                           .method_23105()
                           .forEach(var4 -> this.method_24325((T1)var2, (T2)var3, (T3)var4, (class_265)var1.method_26327(var2, var3, var4)))
                  )
         );
      return this;
   }
}
