package remapped;

public class class_4835 extends Module {
   public class_4835() {
      super(class_5664.field_28716, "Minemen", "Speed for AGC");
   }

   @class_9148
   @class_315
   public void method_22255(class_7767 var1) {
      if (mcInstance.field_9632.field_41726) {
         double var4 = 0.3399 + (double)class_8865.method_40770() * 0.06;
         if (mcInstance.field_9632.field_41697 % 3 == 0) {
            var4 = 0.679 + (double)class_8865.method_40770() * 0.12;
         }

         class_8865.method_40777(var1, var4);
      }
   }
}
