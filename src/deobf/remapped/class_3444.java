package remapped;

public class class_3444 extends class_8116 {
   private static String[] field_16912;

   public class_3444(class_4648 var1) {
      this.field_16913 = var1;
   }

   @Override
   public class_6331 method_36934() {
      return (class_6331)this.field_16913.field_41768;
   }

   @Override
   public void method_36932() {
      this.field_16913.method_37372().method_36633(class_4648.method_21498(), this.method_36920());
      this.field_16913.method_37372().method_36633(class_4648.method_21500(), this.method_36928());
   }

   @Override
   public Vector3d method_36923() {
      return this.field_16913.method_37245();
   }

   public class_4648 method_15881() {
      return this.field_16913;
   }

   @Override
   public class_9155 method_36929() {
      return new class_9155(
         this,
         this.field_16913.method_37245(),
         this.field_16913.method_37366(),
         this.method_36934(),
         2,
         this.method_36931().getString(),
         this.field_16913.method_19839(),
         this.method_36934().method_29522(),
         this.field_16913
      );
   }
}
