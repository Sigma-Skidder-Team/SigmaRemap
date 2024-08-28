package mapped;

import java.util.function.Predicate;

public class Class168 implements Predicate<Class880> {
   private static String[] field542;
   public final Class1095 field543;

   public Class168(Class1095 var1) {
      this.field543 = var1;
   }

   public boolean test(Class880 var1) {
      if (var1 instanceof Class1095) {
         return false;
      } else if (var1 instanceof Class1089 || var1 instanceof Class1094 || var1 instanceof Class1009) {
         return true;
      } else if (var1 instanceof Class1013) {
         return !((Class1013)var1).method4393();
      } else if (!(var1 instanceof PlayerEntity) || !var1.method2800() && !((PlayerEntity)var1).method2801()) {
         return Class1095.method5163(this.field543, var1.method3375()) ? false : !var1.method3176() && !var1.method3334();
      } else {
         return false;
      }
   }
}
