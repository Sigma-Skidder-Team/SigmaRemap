package remapped;

public class class_9190 extends class_8715 {
   private static String[] field_47007;
   private final class_2340 field_47008;
   public boolean field_47009;

   private class_9190(ClientWorld var1, double var2, double var4, double var6, class_2340 var8) {
      super(var1, var2, var4, var6);
      this.method_44955(0.01F, 0.01F);
      this.field_49477 = 0.06F;
      this.field_47008 = var8;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public int method_44952(float var1) {
      return !this.field_47009 ? super.method_44952(var1) : 240;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      this.method_42358();
      if (!this.field_49464) {
         this.field_49486 = this.field_49486 - (double)this.field_49477;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.method_42359();
         if (!this.field_49464) {
            this.field_49481 *= 0.98F;
            this.field_49486 *= 0.98F;
            this.field_49471 *= 0.98F;
            BlockPos var3 = new BlockPos(this.field_49462, this.field_49473, this.field_49465);
            class_4774 var4 = this.field_49469.method_28258(var3);
            if (var4.method_22005() == this.field_47008 && this.field_49473 < (double)((float)var3.method_12165() + var4.method_22008(this.field_49469, var3))) {
               this.method_44948();
            }
         }
      }
   }

   public void method_42358() {
      if (this.field_49476-- <= 0) {
         this.method_44948();
      }
   }

   public void method_42359() {
   }
}
