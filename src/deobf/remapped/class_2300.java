package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Function;

public class class_2300<T> extends class_5920<class_4612> {
   private static String[] field_11489;
   private final class_6044<T> field_11487;
   private final float field_11488;
   private final int field_11485;
   private final Function<T, class_1343> field_11486;

   public class_2300(class_6044<T> var1, float var2, int var3, boolean var4, Function<T, class_1343> var5) {
      super(ImmutableMap.of(class_6044.field_30889, !var4 ? class_561.field_3318 : class_561.field_3319, var1, class_561.field_3320));
      this.field_11487 = var1;
      this.field_11488 = var2;
      this.field_11485 = var3;
      this.field_11486 = var5;
   }

   public static class_2300<class_1331> method_10574(class_6044<class_1331> var0, float var1, int var2, boolean var3) {
      return new class_2300<class_1331>(var0, var1, var2, var3, class_1343::method_6200);
   }

   public static class_2300<? extends class_8145> method_10577(class_6044<? extends class_8145> var0, float var1, int var2, boolean var3) {
      return new class_2300(var0, var1, var2, var3, class_8145::method_37245);
   }

   public boolean method_10579(class_6331 var1, class_4612 var2) {
      return !this.method_10580(var2) ? var2.method_37245().method_6222(this.method_10576(var2), (double)this.field_11485) : false;
   }

   private class_1343 method_10576(class_4612 var1) {
      return this.field_11486.apply(var1.method_26525().<T>method_5138(this.field_11487).get());
   }

   private boolean method_10580(class_4612 var1) {
      if (var1.method_26525().method_5117(class_6044.field_30889)) {
         class_6651 var4 = var1.method_26525().<class_6651>method_5138(class_6044.field_30889).get();
         if (var4.method_30559() == this.field_11488) {
            class_1343 var5 = var4.method_30562().method_35464().method_6194(var1.method_37245());
            class_1343 var6 = this.method_10576(var1).method_6194(var1.method_37245());
            return var5.method_6206(var6) < 0.0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_10575(class_6331 var1, class_4612 var2, long var3) {
      method_10578(var2, this.method_10576(var2), this.field_11488);
   }

   private static void method_10578(class_4612 var0, class_1343 var1, float var2) {
      for (int var5 = 0; var5 < 10; var5++) {
         class_1343 var6 = class_3425.method_15836(var0, 16, 7, var1);
         if (var6 != null) {
            var0.method_26525().method_5105(class_6044.field_30889, new class_6651(var6, var2, 0));
            return;
         }
      }
   }
}
