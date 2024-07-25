package remapped;

import java.util.function.Predicate;

public class class_813 implements Predicate<class_2522> {
   private static String[] field_4320;
   private final class_6414 field_4321;

   public class_813(class_6414 var1) {
      this.field_4321 = var1;
   }

   public static class_813 method_3557(class_6414 var0) {
      return new class_813(var0);
   }

   public boolean test(class_2522 var1) {
      return var1 != null && var1.method_8350(this.field_4321);
   }
}
