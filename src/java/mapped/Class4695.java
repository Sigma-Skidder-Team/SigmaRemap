package mapped;

import java.util.function.Consumer;

public class Class4695 extends Class4686 {
   private static String[] field22280;
   private final Class3257 field22281;

   public Class4695(Class3257 var1, int var2, int var3, Class122[] var4, Class127[] var5) {
      super(var2, var3, var4, var5);
      this.field22281 = var1;
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39240;
   }

   @Override
   public void method14695(Consumer<Class8848> var1, Class7812 var2) {
      var1.accept(new Class8848(this.field22281));
   }

   public static Class5872<?> method14724(Class3303 var0) {
      return method14704((var1, var2, var3, var4) -> new Class4695(var0.method11581(), var1, var2, var3, var4));
   }

   // $VF: synthetic method
   public static Class3257 method14726(Class4695 var0) {
      return var0.field22281;
   }
}
