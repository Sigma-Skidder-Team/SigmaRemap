package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;

public class class_3669 extends class_5920<class_5467> {
   private static String[] field_17886;
   private final class_6629<? extends class_5467> field_17883;
   private final float field_17885;
   private long field_17884;

   public class_3669(class_6629<? extends class_5467> var1, float var2) {
      super(
         ImmutableMap.of(
            class_6044.field_30901,
            class_561.field_3320,
            class_6044.field_30892,
            class_561.field_3318,
            class_6044.field_30889,
            class_561.field_3319,
            class_6044.field_30874,
            class_561.field_3319
         ),
         325
      );
      this.field_17883 = var1;
      this.field_17885 = var2;
   }

   public boolean method_17025(class_6331 var1, class_5467 var2) {
      return var2.method_24875() && this.method_17026(var2).isPresent();
   }

   public void method_17020(class_6331 var1, class_5467 var2, long var3) {
      class_5467 var7 = this.method_17026(var2).get();
      var2.method_26525().method_5105(class_6044.field_30892, var7);
      var7.method_26525().method_5105(class_6044.field_30892, var2);
      class_1225.method_5443(var2, var7, this.field_17885);
      int var8 = 275 + var2.method_26594().nextInt(50);
      this.field_17884 = var3 + (long)var8;
   }

   public boolean method_17024(class_6331 var1, class_5467 var2, long var3) {
      if (!this.method_17023(var2)) {
         return false;
      } else {
         class_5467 var7 = this.method_17022(var2);
         return var7.method_37330() && var2.method_24873(var7) && class_1225.method_5453(var2.method_26525(), var7) && var3 <= this.field_17884;
      }
   }

   public void method_17019(class_6331 var1, class_5467 var2, long var3) {
      class_5467 var7 = this.method_17022(var2);
      class_1225.method_5443(var2, var7, this.field_17885);
      if (var2.method_37124(var7, 3.0) && var3 >= this.field_17884) {
         var2.method_24874(var1, var7);
         var2.method_26525().method_5127(class_6044.field_30892);
         var7.method_26525().method_5127(class_6044.field_30892);
      }
   }

   public void method_17021(class_6331 var1, class_5467 var2, long var3) {
      var2.method_26525().method_5127(class_6044.field_30892);
      var2.method_26525().method_5127(class_6044.field_30889);
      var2.method_26525().method_5127(class_6044.field_30874);
      this.field_17884 = 0L;
   }

   private class_5467 method_17022(class_5467 var1) {
      return (class_5467)var1.method_26525().<class_1899>method_5138(class_6044.field_30892).get();
   }

   private boolean method_17023(class_5467 var1) {
      class_1150 var4 = var1.method_26525();
      return var4.method_5117(class_6044.field_30892) && var4.<class_1899>method_5138(class_6044.field_30892).get().method_37387() == this.field_17883;
   }

   private Optional<? extends class_5467> method_17026(class_5467 var1) {
      return var1.method_26525()
         .<List<class_5834>>method_5138(class_6044.field_30901)
         .get()
         .stream()
         .filter(var1x -> var1x.method_37387() == this.field_17883)
         .<class_5467>map(var0 -> (class_5467)var0)
         .filter(var1::method_24873)
         .findFirst();
   }
}
