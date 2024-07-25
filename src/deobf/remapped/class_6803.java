package remapped;

public class class_6803 extends Module {
   public class_6803() {
      super(class_5664.field_28718, "Timer", "Speeds up the world's timer");
      this.addSetting(new FloatSetting<Float>("Timer", "Timer value", 0.1F, Float.class, 0.1F, 10.0F, 0.1F));
   }

   @class_9148
   private void method_31152(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.field_9616.field_32603 = this.method_42002("Timer");
      }
   }

   @Override
   public void method_42020() {
      mcInstance.field_9616.field_32603 = 1.0F;
   }
}
