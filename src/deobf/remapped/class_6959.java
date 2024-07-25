package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class class_6959<E extends MobEntity, T> extends class_5920<E> {
   private static String[] field_35770;
   private final Predicate<E> field_35766;
   private final class_6044<? extends T> field_35769;
   private final class_6044<T> field_35767;
   private final class_4376 field_35768;

   public class_6959(Predicate<E> var1, class_6044<? extends T> var2, class_6044<T> var3, class_4376 var4) {
      super(ImmutableMap.of(var2, class_561.field_3320, var3, class_561.field_3318));
      this.field_35766 = var1;
      this.field_35769 = var2;
      this.field_35767 = var3;
      this.field_35768 = var4;
   }

   public boolean method_31810(class_6331 var1, E var2) {
      return this.field_35766.test((E)var2);
   }

   public void method_31809(class_6331 var1, E var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.method_5107(this.field_35767, (T)var7.method_5138(this.field_35769).get(), (long)this.field_35768.method_20387(var1.field_33033));
   }
}
