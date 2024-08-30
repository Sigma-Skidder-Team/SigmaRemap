package mapped;

import java.util.EnumSet;

public class Class2776 extends Class2595 {
   private static String[] field17366;
   private final Class1048 field17367;
   private final double field17368;
   private PlayerEntity field17369;

   public Class2776(Class1048 var1, double var2) {
      this.field17367 = var1;
      this.field17368 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      this.field17369 = this.field17367.world.method7188(Class1048.method4790(), this.field17367);
      return this.field17369 == null ? false : this.field17369.method2951() && this.field17367.method4232() != this.field17369;
   }

   @Override
   public boolean method10806() {
      return this.field17369 != null && this.field17369.method2951() && this.field17367.getDistanceSq(this.field17369) < 256.0;
   }

   @Override
   public void method10804() {
      this.field17369.method3035(new Class2023(Effects.DOLPHINS_GRACE, 100));
   }

   @Override
   public void method10807() {
      this.field17369 = null;
      this.field17367.method4230().method21666();
   }

   @Override
   public void method10805() {
      this.field17367.method4227().method28040(this.field17369, (float)(this.field17367.method4260() + 20), (float)this.field17367.method4259());
      if (!(this.field17367.getDistanceSq(this.field17369) < 6.25)) {
         this.field17367.method4230().method21655(this.field17369, this.field17368);
      } else {
         this.field17367.method4230().method21666();
      }

      if (this.field17369.method2951() && this.field17369.world.rand.nextInt(6) == 0) {
         this.field17369.method3035(new Class2023(Effects.DOLPHINS_GRACE, 100));
      }
   }
}
