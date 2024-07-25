package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class class_544<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends class_121 {
   private static String[] field_3267;
   private final class_5019<T1> field_3266;
   private final class_5019<T2> field_3264;
   private final class_5019<T3> field_3265;
   private final class_5019<T4> field_3263;

   private class_544(class_5019<T1> var1, class_5019<T2> var2, class_5019<T3> var3, class_5019<T4> var4) {
      this.field_3266 = var1;
      this.field_3264 = var2;
      this.field_3265 = var3;
      this.field_3263 = var4;
   }

   @Override
   public List<class_5019<?>> method_354() {
      return ImmutableList.of(this.field_3266, this.field_3264, this.field_3265, this.field_3263);
   }

   public class_544<T1, T2, T3, T4> method_2631(T1 var1, T2 var2, T3 var3, T4 var4, List<class_265> var5) {
      class_7727 var8 = class_7727.method_34971(
         this.field_3266.method_23113((T1)var1),
         this.field_3264.method_23113((T2)var2),
         this.field_3265.method_23113((T3)var3),
         this.field_3263.method_23113((T4)var4)
      );
      this.method_356(var8, var5);
      return this;
   }

   public class_544<T1, T2, T3, T4> method_2630(T1 var1, T2 var2, T3 var3, T4 var4, class_265 var5) {
      return this.method_2631((T1)var1, (T2)var2, (T3)var3, (T4)var4, Collections.<class_265>singletonList(var5));
   }
}
