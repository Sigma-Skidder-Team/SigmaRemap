package remapped;

import com.mentalfrostbyte.jello.mods.util.InDevelopment;

@InDevelopment
public class class_5492 extends class_9128 {
   public class_5492() {
      super(class_5664.field_28711, "PacketEssentials", "Ignores all types of junk cosmetic packets to improve fps");
   }

   @class_9148
   private void method_24957(class_139 var1) {
      if (this.method_42015()) {
         if (!(var1.method_557() instanceof class_6589)) {
            if (!(var1.method_557() instanceof class_4228)) {
               if (!(var1.method_557() instanceof class_662)) {
                  if (!(var1.method_557() instanceof class_9889)) {
                     if (!(var1.method_557() instanceof class_3263)) {
                        if (var1.method_557() instanceof class_8163) {
                           var1.method_29715(true);
                        }
                     } else {
                        var1.method_29715(true);
                     }
                  } else {
                     var1.method_29715(true);
                  }
               } else {
                  class_662 var4 = (class_662)var1.method_557();
                  var1.method_29715(true);
               }
            } else {
               class_4228 var5 = (class_4228)var1.method_557();
               if (var5.method_19692() == 1) {
                  var1.method_29715(true);
               }
            }
         } else {
            class_6589 var6 = (class_6589)var1.method_557();
            if (var6.method_30334() == class_6629.field_34289) {
               var1.method_29715(true);
            }

            if (var6.method_30334() == class_6629.field_34294) {
               var1.method_29715(true);
            }
         }
      }
   }
}
