package mapped;

import java.util.function.Predicate;

public class Class2711<T extends Class880> extends Class2709<T> {
   private static String[] field17187;
   private boolean field17198 = true;

   public Class2711(Class1026 var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<Class880> var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method10925(boolean var1) {
      this.field17198 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17198 && super.method10803();
   }
}
