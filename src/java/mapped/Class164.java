package mapped;

import java.util.Set;
import java.util.function.Predicate;

public class Class164 implements Predicate<Class9632> {
   private final Class7380 field529;
   private final Set<Class8550<?>> field530;
   private final Class39 field531;

   public Class164(Class7380 var1, Set<Class8550<?>> var2, Class39 var3) {
      this.field529 = var1;
      this.field530 = var2;
      this.field531 = var3;
   }

   public Class7380 method495() {
      return this.field529;
   }

   public boolean test(Class9632 var1) {
      Class7380 var4 = var1.method37548();
      if (!var4.method23448(this.field529.method23383())) {
         return false;
      } else {
         for (Class8550 var6 : this.field530) {
            if (var4.method23463(var6) != this.field529.method23463(var6)) {
               return false;
            }
         }

         if (this.field531 == null) {
            return true;
         } else {
            Class944 var7 = var1.method37549();
            return var7 != null && Class8354.method29280(this.field531, var7.method3646(new Class39()), true);
         }
      }
   }

   public boolean method496(Class1657 var1, BlockPos var2, int var3) {
      Class7380 var6 = Block.method11542(this.field529, var1, var2);
      if (var6.method23393()) {
         var6 = this.field529;
      }

      if (var1.method6725(var2, var6, var3)) {
         if (this.field531 != null) {
            Class944 var7 = var1.method6759(var2);
            if (var7 != null) {
               Class39 var8 = this.field531.method79();
               var8.method102("x", var2.method8304());
               var8.method102("y", var2.getY());
               var8.method102("z", var2.method8306());
               var7.method3645(var6, var8);
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
