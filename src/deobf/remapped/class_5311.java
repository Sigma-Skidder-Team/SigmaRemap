package remapped;

public class class_5311 extends class_3599 {
   private static String[] field_27110;
   private final class_4612 field_27111;

   public class_5311(class_4612 var1) {
      this.field_27111 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_27111.world.method_29602()
         && this.field_27111.method_26520(class_6943.field_35704).method_28022()
         && class_3613.method_16840(this.field_27111);
   }

   @Override
   public void method_16796() {
      ((class_8985)this.field_27111.method_26927()).method_41201(true);
   }

   @Override
   public void method_16793() {
      if (class_3613.method_16840(this.field_27111)) {
         ((class_8985)this.field_27111.method_26927()).method_41201(false);
      }
   }
}
