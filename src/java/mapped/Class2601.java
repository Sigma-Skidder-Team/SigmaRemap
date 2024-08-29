package mapped;

import java.util.EnumSet;

public class Class2601 extends Class2595 {
   private static String[] field16841;
   private final Class1108 field16842;

   public Class2601(Class1108 var1) {
      this.field16842 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return !this.field16842.isPassenger();
   }

   @Override
   public void method10805() {
      ((Class6841)this.field16842.method4228()).method20823(1.0);
   }
}
