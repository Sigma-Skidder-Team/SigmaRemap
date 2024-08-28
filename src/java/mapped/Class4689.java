package mapped;

import java.util.function.Consumer;

public abstract class Class4689 extends Class4688 {
   public final Class4688[] field22273;
   private final Class4693 field22274;

   public Class4689(Class4688[] var1, Class122[] var2) {
      super(var2);
      this.field22273 = var1;
      this.field22274 = this.method14710(var1);
   }

   @Override
   public void method14703(Class8478 var1) {
      super.method14703(var1);
      if (this.field22273.length == 0) {
         var1.method29955("Empty children list");
      }

      for (int var4 = 0; var4 < this.field22273.length; var4++) {
         this.field22273[var4].method14703(var1.method29956(".entry[" + var4 + "]"));
      }
   }

   public abstract Class4693 method14710(Class4693[] var1);

   @Override
   public final boolean method14697(Class7812 var1, Consumer<Class6549> var2) {
      return this.method14709(var1) ? this.field22274.method14697(var1, var2) : false;
   }

   public static <T extends Class4689> Class4934<T> method14711(Class8732<T> var0) {
      return new Class4935(var0);
   }
}
