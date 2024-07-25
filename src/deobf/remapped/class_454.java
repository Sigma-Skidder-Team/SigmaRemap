package remapped;

import java.util.Locale;

public class class_454 extends Identifier {
   private final String field_1888;

   public class_454(String[] var1) {
      super(var1);
      this.field_1888 = var1[2].toLowerCase(Locale.ROOT);
   }

   public class_454(String var1) {
      this(method_2183(var1));
   }

   public class_454(Identifier var1, String var2) {
      this(var1.toString(), var2);
   }

   public class_454(String var1, String var2) {
      this(method_2183(var1 + '#' + var2));
   }

   public static String[] method_2183(String var0) {
      String[] var3 = new String[]{null, var0, ""};
      int var4 = var0.indexOf(35);
      String var5 = var0;
      if (var4 >= 0) {
         var3[2] = var0.substring(var4 + 1, var0.length());
         if (var4 > 1) {
            var5 = var0.substring(0, var4);
         }
      }

      System.arraycopy(Identifier.method_21452(var5, ':'), 0, var3, 0, 2);
      return var3;
   }

   public String method_2184() {
      return this.field_1888;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_454 && super.equals(var1)) {
            class_454 var4 = (class_454)var1;
            return this.field_1888.equals(var4.field_1888);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.field_1888.hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + '#' + this.field_1888;
   }
}
