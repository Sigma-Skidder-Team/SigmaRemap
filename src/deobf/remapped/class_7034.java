package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class class_7034<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
   extends class_121 {
   private static String[] field_36219;
   private final class_5019<T1> field_36218;
   private final class_5019<T2> field_36214;
   private final class_5019<T3> field_36215;
   private final class_5019<T4> field_36216;
   private final class_5019<T5> field_36217;

   private class_7034(class_5019<T1> var1, class_5019<T2> var2, class_5019<T3> var3, class_5019<T4> var4, class_5019<T5> var5) {
      this.field_36218 = var1;
      this.field_36214 = var2;
      this.field_36215 = var3;
      this.field_36216 = var4;
      this.field_36217 = var5;
   }

   @Override
   public List<class_5019<?>> method_354() {
      return ImmutableList.of(this.field_36218, this.field_36214, this.field_36215, this.field_36216, this.field_36217);
   }

   public class_7034<T1, T2, T3, T4, T5> method_32086(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, List<class_265> var6) {
      class_7727 var9 = class_7727.method_34971(
         this.field_36218.method_23113((T1)var1),
         this.field_36214.method_23113((T2)var2),
         this.field_36215.method_23113((T3)var3),
         this.field_36216.method_23113((T4)var4),
         this.field_36217.method_23113((T5)var5)
      );
      this.method_356(var9, var6);
      return this;
   }

   public class_7034<T1, T2, T3, T4, T5> method_32087(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, class_265 var6) {
      return this.method_32086((T1)var1, (T2)var2, (T3)var3, (T4)var4, (T5)var5, Collections.<class_265>singletonList(var6));
   }
}
