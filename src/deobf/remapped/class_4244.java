package remapped;

public class class_4244 extends Module {
   public class_4244() {
      super(Category.COMBAT, "Legit", "Increase the knockback you give to players");
   }

   @class_9148
   private void method_19784(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.field_9577.field_45444.field_30024 = true;
         if (mcInstance.field_9632.field_29666 != 1) {
            if (mcInstance.field_9632.field_29666 == 0) {
               mcInstance.field_9577.field_45416.field_30024 = class_9732.method_44934(
                  MinecraftClient.getInstance().window.method_43181(), mcInstance.field_9577.field_45416.field_30027.field_17800
               );
            }
         } else {
            mcInstance.field_9577.field_45416.field_30024 = false;
         }
      }
   }
}
