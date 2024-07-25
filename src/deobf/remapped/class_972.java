package remapped;

public class class_972 {
   private static String[] field_4972;
   private final class_1343 field_4969;
   private final class_1343 field_4970;
   private final class_3132 field_4973;
   private final class_9583 field_4971;
   private final class_214 field_4974;

   public class_972(class_1343 var1, class_1343 var2, class_3132 var3, class_9583 var4, Entity var5) {
      this.field_4969 = var1;
      this.field_4970 = var2;
      this.field_4973 = var3;
      this.field_4971 = var4;
      this.field_4974 = class_214.method_926(var5);
   }

   public class_1343 method_4256() {
      return this.field_4970;
   }

   public class_1343 method_4255() {
      return this.field_4969;
   }

   public class_4190 method_4257(class_2522 var1, class_6163 var2, BlockPos var3) {
      return this.field_4973.method_33289(var1, var2, var3, this.field_4974);
   }

   public class_4190 method_4258(class_4774 var1, class_6163 var2, BlockPos var3) {
      return !this.field_4971.method_44270(var1) ? class_3370.method_15536() : var1.method_21994(var2, var3);
   }
}
