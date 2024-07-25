package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_2409 extends class_5920<class_4612> {
   private static String[] field_11991;

   public class_2409() {
      super(
         ImmutableMap.of(
            class_6044.field_30875,
            class_561.field_3320,
            class_6044.field_30889,
            class_561.field_3318,
            class_6044.field_30874,
            class_561.field_3319,
            class_6044.field_30861,
            class_561.field_3319
         )
      );
   }

   public boolean method_10962(class_6331 var1, class_4612 var2) {
      return var1.method_43360().nextInt(10) == 0 && this.method_10960(var2);
   }

   public void method_10953(class_6331 var1, class_4612 var2, long var3) {
      class_5834 var7 = this.method_10952(var2);
      if (var7 == null) {
         Optional var8 = this.method_10954(var2);
         if (!var8.isPresent()) {
            this.method_10955(var2).ifPresent(var1x -> method_10951(var2, var1x));
         } else {
            method_10951(var2, (class_5834)var8.get());
         }
      } else {
         this.method_10963(var1, var2, var7);
      }
   }

   private void method_10963(class_6331 var1, class_4612 var2, class_5834 var3) {
      for (int var6 = 0; var6 < 10; var6++) {
         class_1343 var7 = class_3425.method_15834(var2, 20, 8);
         if (var7 != null && var1.method_28994(new class_1331(var7))) {
            var2.method_26525().method_5105(class_6044.field_30889, new class_6651(var7, 0.6F, 0));
            return;
         }
      }
   }

   private static void method_10951(class_4612 var0, class_5834 var1) {
      class_1150 var4 = var0.method_26525();
      var4.method_5105(class_6044.field_30861, var1);
      var4.method_5105(class_6044.field_30874, new class_4843(var1, true));
      var4.method_5105(class_6044.field_30889, new class_6651(new class_4843(var1, false), 0.6F, 1));
   }

   private Optional<class_5834> method_10955(class_4612 var1) {
      return this.method_10961(var1).stream().findAny();
   }

   private Optional<class_5834> method_10954(class_4612 var1) {
      Map var4 = this.method_10958(var1);
      return var4.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter(var0 -> (Integer)var0.getValue() > 0 && (Integer)var0.getValue() <= 5)
         .<class_5834>map(Entry::getKey)
         .findFirst();
   }

   private Map<class_5834, Integer> method_10958(class_4612 var1) {
      HashMap var4 = Maps.newHashMap();
      this.method_10961(var1).stream().filter(this::method_10959).forEach(var2 -> {
         Integer var5 = var4.compute(this.method_10957(var2), (var0, var1xx) -> var1xx != null ? var1xx + 1 : 1);
      });
      return var4;
   }

   private List<class_5834> method_10961(class_4612 var1) {
      return var1.method_26525().<List<class_5834>>method_5138(class_6044.field_30875).get();
   }

   private class_5834 method_10957(class_5834 var1) {
      return var1.method_26525().<class_5834>method_5138(class_6044.field_30861).get();
   }

   @Nullable
   private class_5834 method_10952(class_5834 var1) {
      return var1.method_26525()
         .<List<class_5834>>method_5138(class_6044.field_30875)
         .get()
         .stream()
         .filter(var2 -> this.method_10956(var1, var2))
         .findAny()
         .orElse((class_5834)null);
   }

   private boolean method_10959(class_5834 var1) {
      return var1.method_26525().<class_5834>method_5138(class_6044.field_30861).isPresent();
   }

   private boolean method_10956(class_5834 var1, class_5834 var2) {
      return var2.method_26525().<class_5834>method_5138(class_6044.field_30861).filter(var1x -> var1x == var1).isPresent();
   }

   private boolean method_10960(class_4612 var1) {
      return var1.method_26525().method_5117(class_6044.field_30875);
   }
}
