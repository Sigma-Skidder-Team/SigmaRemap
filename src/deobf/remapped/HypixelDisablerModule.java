package remapped;

import java.util.ArrayList;
import java.util.List;

public class HypixelDisablerModule extends Module {
   private List<class_6310<?>> field_36206 = new ArrayList<class_6310<?>>();
   private boolean field_36207;
   private Timer field_36204 = new Timer();

   public HypixelDisablerModule() {
      super(Category.EXPLOIT, "Hypixel", "Disable watchdog.");
   }

   @Override
   public void method_42006() {
      if (!mcInstance.field_9632.field_41726) {
         this.field_36207 = false;
      } else {
         double var3 = mcInstance.field_9632.method_37302();
         double var5 = mcInstance.field_9632.method_37309();
         double var7 = mcInstance.field_9632.method_37156();
         this.field_36207 = false;
         mcInstance.method_8614().method_4813(new class_9515(var3, var5 + 0.2, var7, false));
         mcInstance.method_8614().method_4813(new class_9515(var3, var5 + 0.1, var7, false));
         this.field_36207 = true;
         this.field_36204.method_14773();
         this.field_36204.method_14776();
         if (!this.getBooleanValueByName("Instant")) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Wait 5s..."));
         } else {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Move where you want"));
         }
      }
   }

   @Override
   public void method_42020() {
      this.field_36204.method_14773();
      this.field_36204.method_14776();
      if (this.field_36207) {
         int var3 = this.field_36206.size();

         for (int var4 = 0; var4 < var3; var4++) {
            mcInstance.method_8614().method_4813(this.field_36206.get(var4));
         }

         SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Disabler canceled"));
      }

      this.field_36206.clear();
   }

   @EventListen
   public void method_32068(class_1393 var1) {
      if (mcInstance.field_9632 != null) {
         if (!this.field_36207 && mcInstance.field_9632.field_41726) {
            if (!this.getBooleanValueByName("Instant")) {
               SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Wait 5s..."));
            } else {
               SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Move where you want"));
            }

            this.field_36204.method_14773();
            this.field_36204.method_14776();
            this.field_36207 = true;
         }
      }
   }

   @EventListen
   public void method_32071(class_7767 var1) {
      if (mcInstance.field_9632 != null) {
         if (!this.getBooleanValueByName("Instant") && this.field_36207) {
            var1.method_35232(0.0);
            var1.method_35235(0.0);
            var1.method_35229(0.0);
         }

         if (this.field_36204.method_14772() > 10000L && this.field_36207) {
            this.field_36207 = false;
            int var4 = this.field_36206.size();

            for (int var5 = 0; var5 < var4; var5++) {
               mcInstance.method_8614().method_4813(this.field_36206.get(var5));
            }

            this.field_36206.clear();
            this.field_36204.method_14773();
            this.field_36204.method_14774();
            this.method_42017().method_41999();
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Disabler failed"));
         }
      }
   }

   @EventListen
   private void method_32070(class_2157 var1) {
      if (mcInstance.method_8614() != null) {
         if (this.field_36207) {
            if (var1.method_10047() instanceof class_2317
               || var1.method_10047() instanceof class_4609
               || var1.method_10047() instanceof class_3398
               || var1.method_10047() instanceof class_3195
               || var1.method_10047() instanceof class_1022) {
               if (this.getBooleanValueByName("Instant")) {
                  this.field_36206.add(var1.method_10047());
               }

               var1.method_29715(true);
            }
         }
      }
   }

   @EventListen
   public void method_32069(class_139 var1) {
      if (mcInstance.field_9632 != null && this.field_36207) {
         if (this.method_42015() || this.getBooleanValueByName("Instant")) {
            if (var1.method_557() instanceof class_509) {
               this.method_42017().method_41999();
               if (!this.getBooleanValueByName("Instant")) {
                  SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "You can do what you want for 5s"));
               } else {
                  class_509 var4 = (class_509)var1.method_557();
                  var1.method_29715(true);
                  mcInstance.method_8614()
                     .method_4813(new class_1514(var4.field_3139, var4.field_3144, var4.field_3141, var4.field_3143, var4.field_3140, false));
                  int var5 = this.field_36206.size();

                  for (int var6 = 0; var6 < var5; var6++) {
                     mcInstance.method_8614().method_4813(this.field_36206.get(var6));
                  }

                  this.field_36206.clear();
                  SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Hypixel disabler", "Successfully sent packets"));
               }

               this.field_36207 = false;
            }
         }
      }
   }
}
