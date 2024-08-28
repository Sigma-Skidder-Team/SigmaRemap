package mapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Class8358 implements Class8356 {
   private static String[] field35903;
   private final Predicate<Class30> field35904;

   public Class8358(Class39 var1) {
      this.field35904 = Class8320.method29137(var1);
   }

   @Override
   public void method29291(Class30 var1, List<Class30> var2) {
      if (var1 instanceof Class39 && this.field35904.test(var1)) {
         var2.add(var1);
      }
   }

   @Override
   public void method29292(Class30 var1, Supplier<Class30> var2, List<Class30> var3) {
      this.method29291(var1, var3);
   }

   @Override
   public Class30 method29293() {
      return new Class39();
   }

   @Override
   public int method29294(Class30 var1, Supplier<Class30> var2) {
      return 0;
   }

   @Override
   public int method29295(Class30 var1) {
      return 0;
   }
}
