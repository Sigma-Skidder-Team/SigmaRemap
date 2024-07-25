package remapped;

public class MinemenSpeed extends Module {
   public MinemenSpeed() {
      super(Category.MOVEMENT, "Minemen", "Speed for AGC");
   }

   @EventListen
   @class_315
   public void method_22255(class_7767 var1) {
      if (client.thePlayer.field_41726) {
         double var4 = 0.3399 + (double)class_8865.method_40770() * 0.06;
         if (client.thePlayer.field_41697 % 3 == 0) {
            var4 = 0.679 + (double)class_8865.method_40770() * 0.12;
         }

         class_8865.method_40777(var1, var4);
      }
   }
}
