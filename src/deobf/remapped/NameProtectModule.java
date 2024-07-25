package remapped;

import java.util.List;
import net.minecraft.util.text.StringTextComponent;

public class NameProtectModule extends Module {
   public NameProtectModule() {
      super(Category.RENDER, "NameProtect", "Useful for recording/streaming");
      this.addSetting(new HippieModeValue("Username", "The name which your username is replaced with", "Me"));
   }

   @EventListen
   public void method_43855(class_4981 var1) {
      if (this.method_42015()) {
         var1.method_22940(var1.method_22941().replaceAll(mc.method_8502().method_5366(), this.getStringValueByName("Username")));
      }
   }

   @EventListen
   public void method_43854(class_139 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_1625) {
            class_1625 var5 = (class_1625)var4;
            if (var5.method_7241() == class_9120.field_46678) {
               String var6 = var5.method_7240();
               if (var6.contains(mc.method_8502().method_5366())) {
                  var6 = var6.replaceAll(mc.method_8502().method_5366(), this.getStringValueByName("Username"));
                  var1.method_556(new class_1625(var5.method_7241(), var5.method_7243(), var6, var5.method_7238()));
               }
            }
         }

         if (var4 instanceof class_5182) {
            class_5182 var10 = (class_5182)var4;
         }

         if (var4 instanceof class_7867) {
            class_7867 var11 = (class_7867)var4;
            List var15 = var11.method_35609();

            for (int var7 = 0; var7 < var15.size(); var7++) {
               class_5902 var8 = (class_5902)var15.get(var7);
               if (var8.method_27001() != null) {
                  String var9 = var8.method_27001().getString();
                  if (var9.contains(mc.method_8502().method_5366())) {
                     var9 = var9.replaceAll(mc.method_8502().method_5366(), this.getStringValueByName("Username"));
                     var8.field_29961 = new StringTextComponent(var9);
                  }
               }
            }

            var11.field_40274 = var15;
         }

         if (var4 instanceof class_9889) {
            class_9889 var12 = (class_9889)var4;
            if (var12.method_45562() == null) {
               return;
            }

            String var16 = var12.method_45562().getString();
            if (var16.contains(mc.method_8502().method_5366())) {
               var16 = var16.replaceAll(mc.method_8502().method_5366(), this.getStringValueByName("Username"));
               StringTextComponent var20 = new StringTextComponent(var16);
               var12.field_50151 = var20;
            }
         }

         if (var4 instanceof class_3299) {
            class_3299 var13 = (class_3299)var4;
            if (var13.method_15124() == null) {
               return;
            }

            String var18 = var13.method_15124().getString();
            if (var18.contains(mc.method_8502().method_5366())) {
               var18 = var18.replaceAll(mc.method_8502().method_5366(), this.getStringValueByName("Username"));
               StringTextComponent var21 = new StringTextComponent(var18);
               var1.method_556(new class_3299(var13.method_15125(), var21, var13.method_15123(), var13.method_15121(), var13.method_15127()));
            }
         }
      }
   }
}
