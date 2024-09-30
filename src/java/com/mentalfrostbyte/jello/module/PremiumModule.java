package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;

public class PremiumModule extends Module {
   public PremiumModule(String var1, String var2, ModuleCategory var3) {
      super(var3, var1, var2);
   }

   @Override
   public boolean isEnabled() {
      return Client.getInstance().getNetworkManager().isPremium() && super.isEnabled();
   }

   @Override
   public void setState(boolean enabled) {
      if (Client.getInstance().getNetworkManager().isPremium()) {
         super.setState(enabled);
      } else {
         if (this.enabled != enabled) {
            Client.getInstance().getNotificationManager().send(new Notification("Premium", this.getName() + " Not yet available for free version"));
            Client.getInstance().getSoundManager().play("error");
         }
      }
   }

   @Override
   public void setEnabledBasic(boolean enabled) {
      if (Client.getInstance().getNetworkManager().isPremium()) {
         super.setEnabledBasic(enabled);
      } else {
         if (this.enabled != enabled && enabled) {
            Client.getInstance().getNotificationManager().send(new Notification("Premium", this.getName() + " Not yet available for free version"));
            Client.getInstance().getSoundManager().play("error");
         }
      }
   }

   @Override
   public void setEnabled(boolean newEnabled) {
      if (Client.getInstance().getNetworkManager().isPremium()) {
         super.setEnabled(newEnabled);
      } else {
         if (this.isEnabled() != newEnabled) {
            Client.getInstance().getNotificationManager().send(new Notification("Premium", this.getName() + " Not yet available for free version"));
            Client.getInstance().getSoundManager().play("error");
         }
      }
   }
}
