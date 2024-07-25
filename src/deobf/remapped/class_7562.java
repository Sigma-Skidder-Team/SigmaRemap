package remapped;

import java.util.regex.Pattern;

public class class_7562 implements class_5964 {
   private static final Pattern field_38535 = Pattern.compile(" ");
   private static final Pattern field_38536 = Pattern.compile(",");
   private final String field_38534;

   public class_7562(String var1) {
      if (var1 != null) {
         this.field_38534 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public boolean method_27239(String var1) {
      String var4 = field_38535.matcher(var1).replaceAll("");
      String[] var5 = field_38536.split(var4);

      for (String var9 : var5) {
         if (this.field_38534.equals(var9)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public String method_27241() {
      return this.field_38534;
   }

   @Override
   public class_5964 method_27240() {
      return new class_7562(this.method_27241());
   }

   @Override
   public String toString() {
      return this.method_27241();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_7562 var4 = (class_7562)var1;
            return this.field_38534.equals(var4.field_38534);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_38534.hashCode();
   }
}
