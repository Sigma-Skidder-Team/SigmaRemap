package remapped;

import java.util.Random;

public class AutoClickerModule extends Module {
   private int field_34164;

   public AutoClickerModule() {
      super(Category.COMBAT, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
   }

   @class_9148
   private void method_30401(class_5596 var1) {
      if (this.method_42015()) {
         this.field_34164++;
         Random var4 = new Random();
         byte var5 = 2;
         byte var6 = 4;
         int var7 = var4.nextInt(var6 - var5) + var5;
         if (mcInstance.field_9577.field_45530.method_27060() && this.field_34164 >= var7) {
            mcInstance.field_9632.method_26597(class_2584.field_12791);
            this.field_34164 = 0;
            if (class_314.method_1458(mcInstance.field_9632.field_41701, mcInstance.field_9632.field_41755, 4.6F, 0.0) != null) {
               mcInstance.method_8614()
                  .method_4813(
                     new class_3398(
                        class_314.method_1458(mcInstance.field_9632.field_41701, mcInstance.field_9632.field_41755, 4.6F, 0.0),
                        mcInstance.field_9632.method_37252()
                     )
                  );
               mcInstance.field_9632.method_26597(class_2584.field_12791);
            }
         }
      }
   }
}
