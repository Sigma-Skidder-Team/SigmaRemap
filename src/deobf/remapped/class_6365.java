package remapped;

public class class_6365 extends class_8116 {
   private static String[] field_32542;

   public class_6365(class_7454 var1) {
      this.field_32541 = var1;
   }

   @Override
   public void method_36930(String var1) {
      super.method_36930(var1);
      this.field_32541.method_17407();
   }

   @Override
   public class_6331 method_36934() {
      return (class_6331)this.field_32541.field_18364;
   }

   @Override
   public void method_36932() {
      class_2522 var3 = this.field_32541.field_18364.method_28262(this.field_32541.field_18358);
      this.method_36934().method_29572(this.field_32541.field_18358, var3, var3, 3);
   }

   @Override
   public Vector3d method_36923() {
      return Vector3d.method_6216(this.field_32541.field_18358);
   }

   @Override
   public class_9155 method_36929() {
      return new class_9155(
         this,
         Vector3d.method_6216(this.field_32541.field_18358),
         class_4895.field_24322,
         this.method_36934(),
         2,
         this.method_36931().getString(),
         this.method_36931(),
         this.method_36934().method_29522(),
         (Entity)null
      );
   }
}
