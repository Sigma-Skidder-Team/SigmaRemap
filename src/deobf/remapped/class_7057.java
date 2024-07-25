package remapped;

public class class_7057 extends class_9128 {
   public class_7057() {
      super(class_5664.field_28711, "NickNameDetector", "Detect if a player has a custom name");
   }

   @class_9148
   private void method_32448(class_5596 var1) {
      if (this.method_42015()) {
         for (class_8145 var5 : class_314.method_1435()) {
            if (!class_727.method_3328().method_3331().method_20495(var5) && var5.field_41697 > 30 && var5.method_45507()) {
               class_314.method_1443(var5.method_45509().getUnformattedComponentText() + " might have a custom nametag");
            }
         }
      }
   }
}
