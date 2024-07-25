package remapped;

public class VanillaShaderESPModule extends Module {
   public VanillaShaderESPModule() {
      super(Category.RENDER, "Vanilla", "Draws a line arround players");
   }

   @class_9148
   public void method_2176(class_5596 var1) {
      if (this.method_42015()) {
         for (Entity var5 : mcInstance.field_9601.method_736()) {
            if (!SigmaMainClass.method_3328().method_3331().method_20495(var5)) {
               boolean var6 = class_314.method_1426(var5) == class_9374.field_47922 && this.method_42017().method_42007("Show Players");
               boolean var7 = class_314.method_1426(var5) == class_9374.field_47924 && this.method_42017().method_42007("Show Mobs");
               boolean var8 = class_314.method_1426(var5) == class_9374.field_47923 && this.method_42017().method_42007("Show Passives");
               boolean var9 = !var5.method_37109() || this.method_42017().method_42007("Show Invisibles");
               if ((var7 || var6 || var8) && var9 && var5 != mcInstance.field_9632) {
                  var5.method_37200(true);
               } else {
                  var5.method_37200(false);
               }
            }
         }
      }
   }

   @Override
   public void method_42020() {
      for (Entity var4 : mcInstance.field_9601.method_736()) {
         var4.method_37200(false);
      }
   }
}
