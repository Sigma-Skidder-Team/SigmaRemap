package mapped;

import java.util.Set;
import java.util.function.Predicate;

public class Class171 implements Predicate<Class9632> {
   private static String[] field551;
   private final BlockState field552;
   private final Set<Class8550<?>> field553;
   private final CompoundNBT field554;

   public Class171(BlockState var1, Set<Class8550<?>> var2, CompoundNBT var3) {
      this.field552 = var1;
      this.field553 = var2;
      this.field554 = var3;
   }

   public boolean test(Class9632 var1) {
      BlockState var4 = var1.method37548();
      if (!var4.method23448(this.field552.getBlock())) {
         return false;
      } else {
         for (Class8550 var6 : this.field553) {
            if (var4.method23463(var6) != this.field552.method23463(var6)) {
               return false;
            }
         }

         if (this.field554 == null) {
            return true;
         } else {
            TileEntity var7 = var1.method37549();
            return var7 != null && Class8354.method29280(this.field554, var7.write(new CompoundNBT()), true);
         }
      }
   }
}
