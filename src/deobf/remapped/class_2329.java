package remapped;

import java.util.Iterator;
import java.util.List;

public class class_2329 extends class_3620 {
   public class_2329() {
      super(class_5664.field_28714, "Aimbot", "Automatically aim at players", new class_1631(), new class_5641(), new class_5263());
      this.method_42010(new class_8563("Players", "Aim at players", true));
      this.method_42010(new class_8563("Animals/Monsters", "Aim at animals and monsters", false));
      this.method_42010(new class_8563("Invisible", "Aim at invisible entites", true));
   }

   public class_8145 method_10678(float var1) {
      List var4 = class_314.method_1440();
      class_8145 var5 = null;
      Iterator var6 = var4.iterator();

      while (var6.hasNext()) {
         class_8145 var7 = (class_8145)var6.next();
         if (var7 != field_46692.field_9632) {
            if (!class_727.method_3328().method_3307().method_14460(var7)) {
               if (var7 instanceof class_5834) {
                  if (((class_5834)var7).method_26551() != 0.0F) {
                     if (!(field_46692.field_9632.method_37175(var7) > var1)) {
                        if (field_46692.field_9632.method_26608((class_5834)var7)) {
                           if (!(var7 instanceof class_9399)) {
                              if (!this.method_42007("Players") && var7 instanceof class_704) {
                                 var6.remove();
                              } else if (var7 instanceof class_704 && class_727.method_3328().method_3331().method_20495(var7)) {
                                 var6.remove();
                              } else if (!this.method_42007("Invisible") && var7.method_37109()) {
                                 var6.remove();
                              } else if (!this.method_42007("Animals/Monsters") && !(var7 instanceof class_704)) {
                                 var6.remove();
                              } else if (field_46692.field_9632.method_37243() != null && field_46692.field_9632.method_37243().equals(var7)) {
                                 var6.remove();
                              } else if (!var7.method_37367()) {
                                 if (var7 instanceof class_704
                                    && class_5876.method_26760((class_704)var7)
                                    && class_727.method_3328().method_3298().method_847(class_3595.class).method_42015()) {
                                    var6.remove();
                                 } else if (var5 == null || field_46692.field_9632.method_37175(var7) < field_46692.field_9632.method_37175(var5)) {
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
