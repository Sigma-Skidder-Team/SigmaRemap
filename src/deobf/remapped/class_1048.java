package remapped;

import java.util.function.Predicate;

public class class_1048 implements class_214 {
   private static String[] field_5756;
   public static final class_214 field_5758 = new class_3450(false, -Double.MAX_VALUE, class_4897.field_25302, var0 -> false);
   private final boolean field_5757;
   private final double field_5759;
   private final class_2451 field_5755;
   private final Predicate<class_2340> field_5754;

   public class_1048(boolean var1, double var2, class_2451 var4, Predicate<class_2340> var5) {
      this.field_5757 = var1;
      this.field_5759 = var2;
      this.field_5755 = var4;
      this.field_5754 = var5;
   }

   @Deprecated
   public class_1048(Entity var1) {
      this(
         var1.method_37283(),
         var1.method_37309(),
         !(var1 instanceof class_5834) ? class_4897.field_25302 : ((class_5834)var1).method_26446().method_27960(),
         !(var1 instanceof class_5834) ? var0 -> false : ((class_5834)var1)::method_26496
      );
   }

   @Override
   public boolean method_930(class_2451 var1) {
      return this.field_5755 == var1;
   }

   @Override
   public boolean method_929(class_4774 var1, class_3798 var2) {
      return this.field_5754.test(var2) && !var1.method_22005().method_10723(var2);
   }

   @Override
   public boolean method_925() {
      return this.field_5757;
   }

   @Override
   public boolean method_927(class_4190 var1, class_1331 var2, boolean var3) {
      return this.field_5759 > (double)var2.method_12165() + var1.method_19495(class_9249.field_47216) - 1.0E-5F;
   }
}
