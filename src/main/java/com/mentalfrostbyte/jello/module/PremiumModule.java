package com.mentalfrostbyte.jello.module;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.notification.Notification;

public class PremiumModule extends Module {

    public PremiumModule(ModuleCategory category, String name, String description) {
        super(category, name, description);
    }

    @Override
    public boolean isEnabled() {
        return Client.getInstance().networkManager.isPremium() && super.isEnabled();
    }

    @Override
    public void setState(boolean enabled) {
        if (Client.getInstance().networkManager.isPremium()) {
            super.setState(enabled);
        } else {
            if (this.enabled != enabled) {
                Client.getInstance().notificationManager
                        .send(new Notification("Premium", this.getName() + " Not yet available for free version"));
                Client.getInstance().soundManager.play("error");
            }
        }
    }

    @Override
    public void setEnabledBasic(boolean enabled) {
        if (Client.getInstance().networkManager.isPremium()) {
            super.setEnabledBasic(enabled);
        } else {
            if (this.enabled != enabled && enabled) {
                Client.getInstance().notificationManager
                        .send(new Notification("Premium", this.getName() + " Not yet available for free version"));
                Client.getInstance().soundManager.play("error");
            }
        }
    }

    @Override
    public void setEnabled(boolean newEnabled) {
        if (Client.getInstance().networkManager.isPremium()) {
            super.setEnabled(newEnabled);
        } else {
            if (this.isEnabled() != newEnabled) {
                Client.getInstance().notificationManager
                        .send(new Notification("Premium", this.getName() + " Not yet available for free version"));
                Client.getInstance().soundManager.play("error");
            }
        }
    }
}
