package mapped;

public interface Class3207 extends Class3405, Class3449 {
   @Override
   default boolean method11531(Class1665 var1, BlockPos var2, BlockState var3, Class7631 var4) {
      return !var3.<Boolean>method23463(Class8820.field39710) && var4 == Class9479.field44066;
   }

   @Override
   default boolean method11532(Class1660 var1, BlockPos var2, BlockState var3, Class7379 var4) {
      if (!var3.<Boolean>method23463(Class8820.field39710) && var4.method23472() == Class9479.field44066) {
         if (!var1.method6714()) {
            var1.method6725(var2, var3.method23465(Class8820.field39710, Boolean.valueOf(true)), 3);
            var1.method6861().method20726(var2, var4.method23472(), var4.method23472().method25057(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default Class7631 method11533(Class1660 var1, BlockPos var2, BlockState var3) {
      if (!var3.<Boolean>method23463(Class8820.field39710)) {
         return Class9479.field44064;
      } else {
         var1.method6725(var2, var3.method23465(Class8820.field39710, Boolean.valueOf(false)), 3);
         return Class9479.field44066;
      }
   }
}
