package mapped;

import java.util.EnumSet;

public abstract class Class2595 {
   private final EnumSet<Class2240> field16815 = EnumSet.<Class2240>noneOf(Class2240.class);

   public abstract boolean method10803();

   public boolean method10806() {
      return this.method10803();
   }

   public boolean method10808() {
      return true;
   }

   public void startExecuting() {
   }

   public void method10807() {
   }

   public void method10805() {
   }

   public void method10809(EnumSet<Class2240> var1) {
      this.field16815.clear();
      this.field16815.addAll(var1);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<Class2240> method10810() {
      return this.field16815;
   }
}
