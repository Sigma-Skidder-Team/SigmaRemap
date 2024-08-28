package mapped;

import java.util.EnumSet;

public class Class2759 extends Class2595 {
   private static String[] field17313;
   private final Class1026 field17314;
   private final float field17315;
   public final Class8522 field17316;
   public final Class1026 field17317;

   public Class2759(Class1026 var1, Class1025 var2, float var3) {
      this.field17317 = var1;
      this.field17316 = new Class8522().method30203(8.0).method30207().method30204().method30205().method30206().method30208();
      this.field17314 = var2;
      this.field17315 = var3 * var3;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      Class880 var3 = this.field17314.method3014();
      return this.field17314.method4551() == null
         && this.field17314.method4579()
         && this.field17314.method4232() != null
         && !this.field17314.method4307()
         && (var3 == null || var3.method3204() != Class8992.field41111);
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field17314.method4230().method21666();

      for (Class1026 var4 : this.field17314
         .field5024
         .<Class1026>method7195(Class1026.class, this.field17316, this.field17314, this.field17314.method3389().method19663(8.0, 8.0, 8.0))) {
         var4.method4233(this.field17314.method4232());
      }
   }

   @Override
   public void method10807() {
      super.method10807();
      Class880 var3 = this.field17314.method4232();
      if (var3 != null) {
         for (Class1026 var5 : this.field17314
            .field5024
            .<Class1026>method7195(Class1026.class, this.field17316, this.field17314, this.field17314.method3389().method19663(8.0, 8.0, 8.0))) {
            var5.method4233(var3);
            var5.method4304(true);
         }

         this.field17314.method4304(true);
      }
   }

   @Override
   public void method10805() {
      Class880 var3 = this.field17314.method4232();
      if (var3 != null) {
         if (!(this.field17314.method3277(var3) > (double)this.field17315)) {
            this.field17314.method4304(true);
         } else {
            this.field17314.method4227().method28040(var3, 30.0F, 30.0F);
            if (Class1026.method4564(this.field17314).nextInt(50) == 0) {
               this.field17314.method4237();
            }
         }

         super.method10805();
      }
   }
}
