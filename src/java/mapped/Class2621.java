package mapped;

import java.util.EnumSet;

public class Class2621 extends Class2595 {
   private static String[] field16907;
   private final Class1108 field16908;
   private float field16909;
   private int field16910;

   public Class2621(Class1108 var1) {
      this.field16908 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      return this.field16908.method4232() == null
         && (this.field16908.field5036 || this.field16908.method3250() || this.field16908.method3264() || this.field16908.method3033(Class8254.field35491))
         && this.field16908.method4228() instanceof Class6841;
   }

   @Override
   public void method10805() {
      if (--this.field16910 <= 0) {
         this.field16910 = 40 + this.field16908.method3013().nextInt(60);
         this.field16909 = (float)this.field16908.method3013().nextInt(360);
      }

      ((Class6841)this.field16908.method4228()).method20822(this.field16909, false);
   }
}
