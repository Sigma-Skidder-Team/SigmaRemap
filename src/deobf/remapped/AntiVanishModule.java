package remapped;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.util.text.ITextComponent;

public class AntiVanishModule extends Module {
   private List<UUID> field_43195 = new CopyOnWriteArrayList<UUID>();
   private int field_43197 = -3200;

   public AntiVanishModule() {
      super(Category.WORLD, "AntiVanish", "Detects if there are vanished players");
   }

   @EventListen
   private void method_38841(class_1393 var1) {
      if (this.method_42015()) {
         if (var1.method_6449() && mc.method_8530() != null) {
            if (!this.field_43195.isEmpty()) {
               if (this.field_43197 > 3200) {
                  this.field_43195.clear();
                  SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Vanished Cleared", "Vanish List has been Cleared.", 5500));
                  this.field_43197 = -3200;
               } else {
                  this.field_43197++;
               }
            }

            if (this.field_43195 != null) {
               try {
                  for (UUID var5 : this.field_43195) {
                     class_753 var6 = mc.method_8614().method_4800(var5);
                     ITextComponent var7 = var6 == null ? null : var6.method_3410();
                     if (var6 != null && this.field_43195.contains(var5)) {
                        if (var7 == null) {
                           SigmaMainClass.getInstance()
                              .getNotificationManager()
                              .pushNotification(
                                 new Notification("Vanished Warning", "A player is vanished !!" + var6.method_3410().getUnformattedComponentText(), 5500)
                              );
                        } else {
                           SigmaMainClass.getInstance()
                              .getNotificationManager()
                              .pushNotification(new Notification("Vanish Warning", var6.method_3410().getString() + " is no longer Vanished.", 5500));
                        }
                     }

                     this.field_43195.remove(var5);
                  }
               } catch (Exception var8) {
                  SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Vanished Error", "Something bad happened.", 5500));
               }
            }
         }
      }
   }

   @EventListen
   private void method_38842(PacketEvent var1) {
      if (this.method_42015()) {
         if (mc.method_8614() != null && var1.method_557() instanceof class_7867) {
            class_7867 var4 = (class_7867)var1.method_557();
            if (var4.method_35608() == class_2236.field_11141) {
               for (class_5902 var6 : var4.method_35609()) {
                  class_753 var7 = mc.method_8614().method_4800(var6.method_27005().getId());
                  if (var7 == null && !this.method_38840(var6.method_27005().getId())) {
                     System.out.println(var6.method_27005().getId());
                     SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Vanished Warning", "A player is vanished ! ", 5500));
                     this.field_43197 = -3200;
                  }
               }
            }
         }
      }
   }

   private boolean method_38840(UUID var1) {
      if (!this.field_43195.contains(var1)) {
         this.field_43195.add(var1);
         return false;
      } else {
         return true;
      }
   }
}
