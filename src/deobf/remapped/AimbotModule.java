package remapped;

import java.util.Iterator;
import java.util.List;

public class AimbotModule extends SecondModule {
   public AimbotModule() {
      super(Category.COMBAT, "Aimbot", "Automatically aim at players", new BasicAimbot(), new SmoothAimbot(), new CAndCAimbot());
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
         if (var7 != client.thePlayer) {
            if (!SigmaMainClass.getInstance().method_3307().method_14460(var7)) {
               if (var7 instanceof LivingEntity) {
                  if (((LivingEntity)var7).method_26551() != 0.0F) {
                     if (!(client.thePlayer.method_37175(var7) > var1)) {
                        if (client.thePlayer.method_26608((LivingEntity)var7)) {
                           if (!(var7 instanceof class_9399)) {
                              if (!this.getBooleanValueByName("Players") && var7 instanceof PlayerEntity) {
                                 var6.remove();
                              } else if (var7 instanceof PlayerEntity && SigmaMainClass.getInstance().method_3331().method_20495(var7)) {
                                 var6.remove();
                              } else if (!this.getBooleanValueByName("Invisible") && var7.method_37109()) {
                                 var6.remove();
                              } else if (!this.getBooleanValueByName("Animals/Monsters") && !(var7 instanceof PlayerEntity)) {
                                 var6.remove();
                              } else if (client.thePlayer.getRidingEntity() != null && client.thePlayer.getRidingEntity().equals(var7)) {
                                 var6.remove();
                              } else if (!var7.method_37367()) {
                                 if (var7 instanceof PlayerEntity
                                    && class_5876.method_26760((PlayerEntity)var7)
                                    && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TeamsModule.class).method_42015()) {
                                    var6.remove();
                                 } else if (var5 == null || client.thePlayer.method_37175(var7) < client.thePlayer.method_37175(var5)) {
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
