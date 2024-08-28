package mapped;

import javax.annotation.Nullable;

public abstract class Class1178<E extends Class1178<E>> extends Class1154<E> implements Class1151 {
   private Class1152 field6373;
   private boolean field6374;

   @Override
   public boolean method5531() {
      return this.field6374;
   }

   @Override
   public void method5532(boolean var1) {
      this.field6374 = var1;
   }

   @Override
   public void method5534(Class1152 var1) {
      this.field6373 = var1;
   }

   @Nullable
   @Override
   public Class1152 method5533() {
      return this.field6373;
   }
}
