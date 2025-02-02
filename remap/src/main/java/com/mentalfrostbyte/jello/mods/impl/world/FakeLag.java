// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

import java.util.Iterator;
import java.util.ArrayList;

public class FakeLag extends Module
{
    private ArrayList<IPacket<?>> field15553;
    private Class7617 field15554;
    private boolean field15555;
    
    public FakeLag() {
        super(Category.WORLD, "FakeLag", "Other players will see you lagging !");
        this.field15553 = new ArrayList<IPacket<?>>();
        this.field15554 = new Class7617();
        this.addSetting(new NumberSetting("Lag duration", "The lags duration", 0.3f, Float.class, 0.1f, 2.0f, 0.01f));
        this.addSetting(new NumberSetting("Delay", "The lags cooldown", 0.4f, Float.class, 0.1f, 2.0f, 0.01f));
        this.addSetting(new BooleanSetting("Combat", "Delay combat packets", true));
        this.addSetting(new BooleanSetting("Blocks", "Delay blocks packets", true));
        this.addSetting(new BooleanSetting("Ping", "Delay ping packets", true));
        this.field15554.method23932();
    }
    
    @Override
    public void onEnable() {
        this.field15553.clear();
        this.field15555 = false;
        this.field15554.method23934();
    }
    
    @Override
    public void onDisable() {
        final Iterator<IPacket<?>> iterator = this.field15553.iterator();
        while (iterator.hasNext()) {
            FakeLag.mc.method5269().getNetworkManager().method11176(iterator.next());
        }
    }
    
    @EventListener
    private void method9970(final Class5732 class5732) {
        if (this.isEnabled()) {
            this.field15553.clear();
            this.field15555 = false;
            this.field15554.method23934();
        }
    }
    
    @EventListener
    private void method9971(final Class5721 class5721) {
        if (this.isEnabled() && FakeLag.mc.method5269() != null) {
            if (!this.field15555) {
                if (this.field15554.method23935() > this.getNumberSettingValueByName("Delay") * 1000.0f) {
                    this.field15555 = true;
                    this.field15554.method23934();
                }
            }
            else if (this.field15554.method23935() <= this.getNumberSettingValueByName("Lag duration") * 1000.0f) {
                if (!(class5721.method16990() instanceof Class4353)) {
                    if (!(class5721.method16990() instanceof Class4303) && !(class5721.method16990() instanceof Class4255)) {
                        if (!(class5721.method16990() instanceof Class4381) && !(class5721.method16990() instanceof Class4380)) {
                            if (!(class5721.method16990() instanceof Class4307)) {
                                if (!(class5721.method16990() instanceof Class4399)) {
                                    if (!(class5721.method16990() instanceof Class4329)) {
                                        return;
                                    }
                                }
                            }
                            if (!this.method9883("Blocks")) {
                                return;
                            }
                        }
                        else if (!this.method9883("Combat")) {
                            return;
                        }
                    }
                    else if (!this.method9883("Ping")) {
                        return;
                    }
                }
                this.field15553.add(class5721.method16990());
                class5721.setCancelled(true);
            }
            else {
                this.field15555 = false;
                this.field15554.method23934();
                final Iterator<IPacket<?>> iterator = this.field15553.iterator();
                while (iterator.hasNext()) {
                    FakeLag.mc.method5269().getNetworkManager().method11176(iterator.next());
                }
                this.field15553.clear();
            }
        }
    }
}
