package mapped;

public class Class8093 extends Class8092 {
   private static String[] field34819;
   private final int field34820;

   public Class8093(Class1006 var1, int var2) {
      super(var1);
      this.field34820 = var2;
   }

   @Override
   public void method28037() {
      if (!this.field34815) {
         if (this.field34812.method4230().method21664()) {
            this.field34812.field5032 = this.method28049(this.field34812.field5032, 0.0F, 5.0F);
         }

         this.field34812.field4967 = this.method28049(this.field34812.field4967, this.field34812.field4965, this.field34813);
      } else {
         this.field34815 = false;
         this.field34812.field4967 = this.method28049(this.field34812.field4967, this.method28048() + 20.0F, this.field34813);
         this.field34812.field5032 = this.method28049(this.field34812.field5032, this.method28047() + 10.0F, this.field34814);
      }

      float var3 = Class9679.method37792(this.field34812.field4967 - this.field34812.field4965);
      if (!(var3 < (float)(-this.field34820))) {
         if (var3 > (float)this.field34820) {
            this.field34812.field4965 += 4.0F;
         }
      } else {
         this.field34812.field4965 -= 4.0F;
      }
   }
}
