package mapped;

import java.util.function.Consumer;

public class Class7557 {
   private static String[] field32408;
   private final Class6505<?> field32409;

   public Class7557(Class6505<?> var1) {
      this.field32409 = var1;
   }

   public static Class7557 method24734(Class6505<?> var0) {
      return new Class7557(var0);
   }

   public void method24735(Consumer<Class4664> var1, String var2) {
      var1.accept(new Class4668(this, var2));
   }

   // $VF: synthetic method
   public static Class6505 method24736(Class7557 var0) {
      return var0.field32409;
   }
}
