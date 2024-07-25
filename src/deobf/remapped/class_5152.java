package remapped;

public class class_5152 extends Module {
   public class_5152() {
      super(class_5664.field_28716, "NoClip", "NoClip phase");
   }

   @class_9148
   private void method_23583(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @class_9148
   public void method_23582(class_5243 var1) {
      if (this.method_42015() && mcInstance.field_9601 != null) {
         if ((double)var1.method_23989().method_12165() >= mcInstance.field_9632.method_37309()) {
            var1.method_23986(class_3370.method_15536());
         }
      }
   }

   @class_9148
   public void method_23581(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.field_9632.field_29600 = 3;
         if (mcInstance.field_9632.field_41697 % 2 == 0) {
            if (mcInstance.field_9632.field_41726) {
               if (!mcInstance.field_9632.field_29654) {
                  if (mcInstance.field_9632.method_37252()) {
                     mcInstance.field_9632
                        .method_37256(mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309() - 1.0, mcInstance.field_9632.method_37156());
                  }
               } else {
                  mcInstance.field_9632
                     .method_37256(mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309() + 1.0, mcInstance.field_9632.method_37156());
               }
            }
         }
      }
   }
}
