package remapped;

public class class_7311 extends class_6165 {
   private static String[] field_37388;
   private int field_37387;
   private int field_37386;

   public class_7311(SoundEvent var1) {
      super(var1, class_562.field_3325);
      this.field_5768 = true;
      this.field_5764 = 0;
      this.field_5766 = 1.0F;
      this.field_5769 = true;
   }

   @Override
   public void method_29511() {
      if (this.field_37386 < 0) {
         this.method_28267();
      }

      this.field_37386 = this.field_37386 + this.field_37387;
      this.field_5766 = MathHelper.clamp((float)this.field_37386 / 40.0F, 0.0F, 1.0F);
   }

   public void method_33354() {
      this.field_37386 = Math.min(this.field_37386, 40);
      this.field_37387 = -1;
   }

   public void method_33353() {
      this.field_37386 = Math.max(0, this.field_37386);
      this.field_37387 = 1;
   }
}
