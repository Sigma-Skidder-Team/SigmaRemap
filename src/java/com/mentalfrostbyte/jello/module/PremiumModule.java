package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;

public class PremiumModule extends Module {
   public PremiumModule(String var1, String var2, ModuleCategory var3) {
      super(var3, var1, var2);
   }

   @Override
   public boolean method15996() {
      return Client.getInstance().getNetworkManager().isPremium() && super.method15996();
   }

   @Override
   public void setState(boolean enabled) {
      if (Client.getInstance().getNetworkManager().isPremium()) {
         super.setState(enabled);
      } else {
         if (this.enabled != enabled) {
            Client.getInstance().getNotificationManager().post(new Notification("Premium", this.method15991() + " Not yet available for free version"));
            Client.getInstance().getSoundManager().play("error");
         }
      }
   }

   @Override
   public void method15998(boolean var1) {
      if (Client.getInstance().getNetworkManager().isPremium()) {
         super.method15998(var1);
      } else {
         if (this.enabled != var1 && var1) {
            Client.getInstance().getNotificationManager().post(new Notification("Premium", this.method15991() + " Not yet available for free version"));
            Client.getInstance().getSoundManager().play("error");
         }
      }
   }

   @Override
   public void method15999(boolean var1) {
      if (Client.getInstance().getNetworkManager().isPremium()) {
         super.method15999(var1);
      } else {
         if (this.method15996() != var1) {
            Client.getInstance().getNotificationManager().post(new Notification("Premium", this.method15991() + " Not yet available for free version"));
            Client.getInstance().getSoundManager().play("error");
         }
      }
   }
}
