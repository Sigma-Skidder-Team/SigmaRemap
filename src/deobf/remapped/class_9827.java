package remapped;

import com.google.common.collect.ImmutableMap;

public class class_9827 extends class_5920<class_7666> {
   private static String[] field_49784;
   public final class_4466 field_49783;

   public class_9827(class_4466 var1) {
      super(ImmutableMap.of(class_6044.field_30883, class_561.field_3320, class_6044.field_30907, class_561.field_3320));
      this.field_49783 = var1;
   }

   public void method_45307(class_6331 var1, class_7666 var2, long var3) {
      class_8150 var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30883).get();
      var1.method_28969()
         .method_6870(var7.method_37409())
         .ifPresent(var3x -> class_1225.method_5455(var2, var3xx -> this.method_45308(var7, var3x, var3xx)).reduce(var2, class_9827::method_45309));
   }

   private static class_7666 method_45309(class_7666 var0, class_7666 var1) {
      class_7666 var4;
      class_7666 var5;
      if (var0.method_973() <= var1.method_973()) {
         var4 = var1;
         var5 = var0;
      } else {
         var4 = var0;
         var5 = var1;
      }

      var5.method_26525().method_5127(class_6044.field_30883);
      return var4;
   }

   private boolean method_45308(class_8150 var1, class_236 var2, class_7666 var3) {
      return this.method_45310(var3)
         && var1.equals(var3.method_26525().<class_8150>method_5138(class_6044.field_30883).get())
         && this.method_45311(var2, var3.method_15891().method_13910());
   }

   private boolean method_45311(class_236 var1, class_4466 var2) {
      return var2.method_20723().method_1007().test(var1);
   }

   private boolean method_45310(class_7666 var1) {
      return var1.method_26525().<class_8150>method_5138(class_6044.field_30883).isPresent();
   }
}
