package mapped;

import javax.annotation.Nullable;

public class Class1102 extends Class1101 {
   private static String[] field6058;

   public Class1102(Class8992<? extends Class1102> var1, World var2) {
      super(var1, var2);
   }

   public static Class7037 method5291() {
      return Class1101.method5288().method21849(Class9173.field42105, 12.0);
   }

   @Override
   public boolean method3114(Entity var1) {
      if (!super.method3114(var1)) {
         return false;
      } else {
         if (var1 instanceof Class880) {
            byte var4 = 0;
            if (this.field5024.method6997() != Class2197.field14353) {
               if (this.field5024.method6997() == Class2197.field14354) {
                  var4 = 15;
               }
            } else {
               var4 = 7;
            }

            if (var4 > 0) {
               ((Class880)var1).method3035(new Class2023(Class8254.field35485, var4 * 20, 0));
            }
         }

         return true;
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      return var4;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.45F;
   }
}