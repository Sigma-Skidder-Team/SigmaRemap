package remapped;

public class class_196 extends class_8715 {
   private static String[] field_656;

   public class_196(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_49481 *= 0.3F;
      this.field_49486 = Math.random() * 0.2F + 0.1F;
      this.field_49471 *= 0.3F;
      this.method_44955(0.01F, 0.01F);
      this.field_49477 = 0.06F;
      this.field_49476 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49476-- > 0) {
         this.field_49486 = this.field_49486 - (double)this.field_49477;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.98F;
         this.field_49486 *= 0.98F;
         this.field_49471 *= 0.98F;
         if (this.field_49482) {
            if (Math.random() < 0.5) {
               this.method_44948();
            }

            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }

         BlockPos var3 = new BlockPos(this.field_49462, this.field_49473, this.field_49465);
         double var4 = Math.max(
            this.field_49469
               .method_28262(var3)
               .method_8324(this.field_49469, var3)
               .method_19499(class_9249.field_47216, this.field_49462 - (double)var3.method_12173(), this.field_49465 - (double)var3.method_12185()),
            (double)this.field_49469.method_28258(var3).method_22008(this.field_49469, var3)
         );
         if (var4 > 0.0 && this.field_49473 < (double)var3.method_12165() + var4) {
            this.method_44948();
         }
      } else {
         this.method_44948();
      }
   }
}
