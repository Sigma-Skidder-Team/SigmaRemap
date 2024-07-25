package remapped;

import java.util.Iterator;
import java.util.List;

public class class_2329 extends SecondModule {
   public class_2329() {
      super(Category.COMBAT, "Aimbot", "Automatically aim at players", new class_1631(), new class_5641(), new class_5263());
      this.addSetting(new BooleanSetting("Players", "Aim at players", true));
      this.addSetting(new BooleanSetting("Animals/Monsters", "Aim at animals and monsters", false));
      this.addSetting(new BooleanSetting("Invisible", "Aim at invisible entites", true));
   }

   public Entity method_10678(float var1) {
      List var4 = class_314.method_1440();
      Entity var5 = null;
      Iterator var6 = var4.iterator();

      while (var6.hasNext()) {
         Entity var7 = (Entity)var6.next();
         if (var7 != mcInstance.field_9632) {
            if (!SigmaMainClass.method_3328().method_3307().method_14460(var7)) {
               if (var7 instanceof class_5834) {
                  if (((class_5834)var7).method_26551() != 0.0F) {
                     if (!(mcInstance.field_9632.method_37175(var7) > var1)) {
                        if (mcInstance.field_9632.method_26608((class_5834)var7)) {
                           if (!(var7 instanceof class_9399)) {
                              if (!this.getBooleanValueByName("Players") && var7 instanceof class_704) {
                                 var6.remove();
                              } else if (var7 instanceof class_704 && SigmaMainClass.method_3328().method_3331().method_20495(var7)) {
                                 var6.remove();
                              } else if (!this.getBooleanValueByName("Invisible") && var7.method_37109()) {
                                 var6.remove();
                              } else if (!this.getBooleanValueByName("Animals/Monsters") && !(var7 instanceof class_704)) {
                                 var6.remove();
                              } else if (mcInstance.field_9632.method_37243() != null && mcInstance.field_9632.method_37243().equals(var7)) {
                                 var6.remove();
                              } else if (!var7.method_37367()) {
                                 if (var7 instanceof class_704
                                    && class_5876.method_26760((class_704)var7)
                                    && SigmaMainClass.method_3328().getModuleManager().method_847(class_3595.class).method_42015()) {
                                    var6.remove();
                                 } else if (var5 == null || mcInstance.field_9632.method_37175(var7) < mcInstance.field_9632.method_37175(var5)) {
                                    var5 = var7;
                                 }
                              } else {
                                 var6.remove();
                              }
                           } else {
                              var6.remove();
                           }
                        } else {
                           var6.remove();
                        }
                     } else {
                        var6.remove();
                     }
                  } else {
                     var6.remove();
                  }
               } else {
                  var6.remove();
               }
            } else {
               var6.remove();
            }
         } else {
            var6.remove();
         }
      }

      return var5;
   }
}
