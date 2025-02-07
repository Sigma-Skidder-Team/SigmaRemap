// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.text.ITextComponent;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.UUID;
import java.util.List;

public class AntiVanish extends Module
{
    private List<UUID> field15919;
    private int field15920;
    
    public AntiVanish() {
        super(Category.WORLD, "AntiVanish", "Detects if there are vanished players");
        this.field15919 = new CopyOnWriteArrayList<UUID>();
        this.field15920 = -3200;
    }
    
    @EventListener
    private void method10512(final UpdateWalkingEvent updateWalkingEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (updateWalkingEvent.method17046() && AntiVanish.mc.method5282() != null) {
            if (!this.field15919.isEmpty()) {
                if (this.field15920 > 3200) {
                    this.field15919.clear();
                    Client.getInstance().getNotificationManager().send(new Notification("Vanished Cleared", "Vanish List has been Cleared.", 5500));
                    this.field15920 = -3200;
                }
                else {
                    ++this.field15920;
                }
            }
            if (this.field15919 != null) {
                try {
                    for (final UUID uuid : this.field15919) {
                        final Class9081 method17371 = AntiVanish.mc.method5269().method17371(uuid);
                        final ITextComponent class5745 = (method17371 == null) ? null : method17371.method32732();
                        if (method17371 != null && this.field15919.contains(uuid)) {
                            if (class5745 == null) {
                                Client.getInstance().getNotificationManager().send(new Notification("Vanished Warning", "A player is vanished !!" + method17371.method32732().getUnformattedComponentText(), 5500));
                            }
                            else {
                                Client.getInstance().getNotificationManager().send(new Notification("Vanish Warning", method17371.method32732().getString() + " is no longer Vanished.", 5500));
                            }
                        }
                        this.field15919.remove(uuid);
                    }
                }
                catch (final Exception ex) {
                    Client.getInstance().getNotificationManager().send(new Notification("Vanished Error", "Something bad happened.", 5500));
                }
            }
        }
    }
    
    @EventListener
    private void method10513(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (AntiVanish.mc.method5269() != null) {
                if (class5723.method16998() instanceof Class4330) {
                    final Class4330 class5724 = (Class4330)class5723.method16998();
                    if (class5724.method13002() == Class2156.field12805) {
                        for (final Class4646 class5725 : class5724.method13001()) {
                            if (AntiVanish.mc.method5269().method17371(class5725.method13869().getId()) != null) {
                                continue;
                            }
                            if (this.method10514(class5725.method13869().getId())) {
                                continue;
                            }
                            System.out.println(class5725.method13869().getId());
                            Client.getInstance().getNotificationManager().send(new Notification("Vanished Warning", "A player is vanished ! ", 5500));
                            this.field15920 = -3200;
                        }
                    }
                }
            }
        }
    }
    
    private boolean method10514(final UUID uuid) {
        if (!this.field15919.contains(uuid)) {
            this.field15919.add(uuid);
            return false;
        }
        return true;
    }
}
