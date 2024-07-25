package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class class_4741<E extends class_5834, T extends class_5834> extends class_5920<E> {
   private static String[] field_22972;
   private final int field_22969;
   private final float field_22968;
   private final EntityType<? extends T> field_22973;
   private final int field_22970;
   private final Predicate<T> field_22967;
   private final Predicate<E> field_22971;
   private final class_6044<T> field_22966;

   public class_4741(EntityType<? extends T> var1, int var2, Predicate<E> var3, Predicate<T> var4, class_6044<T> var5, float var6, int var7) {
      super(
         ImmutableMap.of(
            class_6044.field_30874, class_561.field_3319, class_6044.field_30889, class_561.field_3318, class_6044.field_30901, class_561.field_3320
         )
      );
      this.field_22973 = var1;
      this.field_22968 = var6;
      this.field_22970 = var2 * var2;
      this.field_22969 = var7;
      this.field_22967 = var4;
      this.field_22971 = var3;
      this.field_22966 = var5;
   }

   public static <T extends class_5834> class_4741<class_5834, T> method_21905(EntityType<? extends T> var0, int var1, class_6044<T> var2, float var3, int var4) {
      return new class_4741<class_5834, T>(var0, var1, var0x -> true, var0x -> true, var2, var3, var4);
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      return this.field_22971.test((E)var2) && this.method_21907((E)var2);
   }

   private boolean method_21907(E var1) {
      List var4 = var1.method_26525().<List<class_5834>>method_5138(class_6044.field_30901).get();
      return var4.stream().anyMatch(this::method_21906);
   }

   private boolean method_21906(class_5834 var1) {
      return this.field_22973.equals(var1.method_37387()) && this.field_22967.test((T)var1);
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.<List<class_5834>>method_5138(class_6044.field_30901)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(var1xx -> this.field_22973.equals(var1xx.method_37387()))
                  .<class_5834>map(var0 -> (class_5834)var0)
                  .filter(var2xx -> var2xx.method_37275(var2) <= (double)this.field_22970)
                  .filter(this.field_22967)
                  .findFirst()
                  .ifPresent(var2xx -> {
                     var7.method_5105(this.field_22966, (T)var2xx);
                     var7.method_5105(class_6044.field_30874, new class_4843(var2xx, true));
                     var7.method_5105(class_6044.field_30889, new class_6651(new class_4843(var2xx, false), this.field_22968, this.field_22969));
                  })
         );
   }
}
