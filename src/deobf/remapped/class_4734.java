package remapped;

import javax.annotation.Nullable;

public class class_4734 {
   private static String[] field_22942;
   private final class_704 field_22940;
   private final class_2584 field_22941;
   private final class_9529 field_22944;
   private final World field_22939;
   private final class_6098 field_22943;

   public class_4734(class_704 var1, class_2584 var2, class_9529 var3) {
      this(var1.field_41768, var1, var2, var1.method_26617(var2), var3);
   }

   public class_4734(World var1, class_704 var2, class_2584 var3, class_6098 var4, class_9529 var5) {
      this.field_22940 = var2;
      this.field_22941 = var3;
      this.field_22944 = var5;
      this.field_22943 = var4;
      this.field_22939 = var1;
   }

   public final class_9529 method_21864() {
      return this.field_22944;
   }

   public class_1331 method_21858() {
      return this.field_22944.method_43955();
   }

   public Direction method_21857() {
      return this.field_22944.method_43956();
   }

   public class_1343 method_21865() {
      return this.field_22944.method_33993();
   }

   public boolean method_21866() {
      return this.field_22944.method_43953();
   }

   public class_6098 method_21867() {
      return this.field_22943;
   }

   @Nullable
   public class_704 method_21868() {
      return this.field_22940;
   }

   public class_2584 method_21860() {
      return this.field_22941;
   }

   public World method_21862() {
      return this.field_22939;
   }

   public Direction method_21863() {
      return this.field_22940 != null ? this.field_22940.method_37365() : Direction.field_818;
   }

   public boolean method_21859() {
      return this.field_22940 != null && this.field_22940.method_3236();
   }

   public float method_21861() {
      return this.field_22940 != null ? this.field_22940.field_41701 : 0.0F;
   }
}