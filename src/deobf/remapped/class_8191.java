package remapped;

public class class_8191 extends Module {
   public class_8191() {
      super(class_5664.field_28716, "Vanilla", "Vanilla speed");
      this.addSetting(new FloatSetting<Float>("Speed", "Speed value", 4.0F, Float.class, 1.0F, 10.0F, 0.1F));
   }

   @class_9148
   public void method_37520(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = class_8865.method_40775() * (double)this.method_42002("Speed");
         class_8865.method_40777(var1, var4);
      }
   }
}
