package mapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class Class4686 extends Class4688 {
   public final int field22265;
   public final int field22266;
   public final Class127[] field22267;
   private final BiFunction<ItemStack, Class7812, ItemStack> field22268;
   private final Class6549 field22269 = new Class6550(this);

   public Class4686(int var1, int var2, Class122[] var3, Class127[] var4) {
      super(var3);
      this.field22265 = var1;
      this.field22266 = var2;
      this.field22267 = var4;
      this.field22268 = Class8585.method30686(var4);
   }

   @Override
   public void method14703(Class8478 var1) {
      super.method14703(var1);

      for (int var4 = 0; var4 < this.field22267.length; var4++) {
         this.field22267[var4].method367(var1.method29956(".functions[" + var4 + "]"));
      }
   }

   public abstract void method14695(Consumer<ItemStack> var1, Class7812 var2);

   @Override
   public boolean method14697(Class7812 var1, Consumer<Class6549> var2) {
      if (!this.method14709(var1)) {
         return false;
      } else {
         var2.accept(this.field22269);
         return true;
      }
   }

   public static Class5872<?> method14704(Class9353 var0) {
      return new Class5887(var0);
   }

   // $VF: synthetic method
   public static BiFunction method14705(Class4686 var0) {
      return var0.field22268;
   }
}
