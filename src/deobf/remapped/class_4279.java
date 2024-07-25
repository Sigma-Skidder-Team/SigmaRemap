package remapped;

public class class_4279 implements class_7279 {
   private static String[] field_20720;
   private final Long field_20719;
   private final class_7986 field_20721;

   private class_4279(Long var1, class_7986 var2) {
      this.field_20719 = var1;
      this.field_20721 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26348;
   }

   public boolean test(class_2792 var1) {
      class_6331 var4 = var1.method_12694();
      long var5 = var4.method_29584();
      if (this.field_20719 != null) {
         var5 %= this.field_20719;
      }

      return this.field_20721.method_36241((int)var5);
   }
}
