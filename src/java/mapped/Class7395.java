package mapped;

public class Class7395 {
   private static String[] field31656;
   private final Class1006 field31657;
   private int field31658;
   private float field31659;

   public Class7395(Class1006 var1) {
      this.field31657 = var1;
   }

   public void method23626() {
      if (!this.method23631()) {
         if (this.method23630()) {
            if (!(Math.abs(this.field31657.field4967 - this.field31659) > 15.0F)) {
               this.field31658++;
               if (this.field31658 > 10) {
                  this.method23629();
               }
            } else {
               this.field31658 = 0;
               this.field31659 = this.field31657.field4967;
               this.method23627();
            }
         }
      } else {
         this.field31657.field4965 = this.field31657.field5031;
         this.method23628();
         this.field31659 = this.field31657.field4967;
         this.field31658 = 0;
      }
   }

   private void method23627() {
      this.field31657.field4965 = MathHelper.method37796(this.field31657.field4965, this.field31657.field4967, (float)this.field31657.method4260());
   }

   private void method23628() {
      this.field31657.field4967 = MathHelper.method37796(this.field31657.field4967, this.field31657.field4965, (float)this.field31657.method4260());
   }

   private void method23629() {
      int var3 = this.field31658 - 10;
      float var4 = MathHelper.method37777((float)var3 / 10.0F, 0.0F, 1.0F);
      float var5 = (float)this.field31657.method4260() * (1.0F - var4);
      this.field31657.field4965 = MathHelper.method37796(this.field31657.field4965, this.field31657.field4967, var5);
   }

   private boolean method23630() {
      return this.field31657.method3408().isEmpty() || !(this.field31657.method3408().get(0) instanceof Class1006);
   }

   private boolean method23631() {
      double var3 = this.field31657.getPosX() - this.field31657.field5025;
      double var5 = this.field31657.getPosZ() - this.field31657.field5027;
      return var3 * var3 + var5 * var5 > 2.5000003E-7F;
   }
}
