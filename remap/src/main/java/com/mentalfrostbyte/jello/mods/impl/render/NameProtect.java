// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.TextInputSetting;
import mapped.*;

import java.util.List;

public class NameProtect extends Module
{
    public NameProtect() {
        super(Category.RENDER, "NameProtect", "Useful for recording/streaming");
        this.addSetting(new TextInputSetting("Username", "The name which your username is replaced with", "Me"));
    }
    
    @EventListener
    public void method10183(final Class5727 class5727) {
        if (this.isEnabled()) {
            class5727.method17002(class5727.method17001().replaceAll(NameProtect.mc.method5287().getUsername(), this.getStringSettingValueByName("Username")));
        }
    }
    
    @EventListener
    public void method10184(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (method16998 instanceof Class4377) {
                final Class4377 class5724 = (Class4377)method16998;
                if (class5724.method13163() == Class2142.field12614) {
                    final String method16999 = class5724.method13160();
                    if (method16999.contains(NameProtect.mc.method5287().getUsername())) {
                        eventReceivePacket.setPacket(new Class4377(class5724.method13163(), class5724.method13161(), method16999.replaceAll(NameProtect.mc.method5287().getUsername(), this.getStringSettingValueByName("Username")), class5724.method13162()));
                    }
                }
            }
            if (method16998 instanceof Class4378) {
                final Class4378 class5725 = (Class4378)method16998;
                final String method17000 = class5725.method13164().getFormattedText();
                if (method17000 != null) {
                    if (method17000.contains(NameProtect.mc.method5287().getUsername())) {
                        eventReceivePacket.setPacket(new Class4378(new StringTextComponent(method17000.replaceAll(NameProtect.mc.method5287().getUsername(), this.getStringSettingValueByName("Username"))), class5725.method13166()));
                    }
                }
            }
            if (method16998 instanceof Class4330) {
                final Class4330 class5726 = (Class4330)method16998;
                final List<Class4646> method17001 = class5726.method13001();
                for (int i = 0; i < method17001.size(); ++i) {
                    final Class4646 class5727 = method17001.get(i);
                    if (class5727.method13872() != null) {
                        final String method17002 = class5727.method13872().getFormattedText();
                        if (method17002.contains(NameProtect.mc.method5287().getUsername())) {
                            class5727.field20115 = new StringTextComponent(method17002.replaceAll(NameProtect.mc.method5287().getUsername(), this.getStringSettingValueByName("Username")));
                        }
                    }
                }
                class5726.field19388 = method17001;
            }
            if (method16998 instanceof Class4301) {
                final Class4301 class5728 = (Class4301)method16998;
                if (class5728.method12933() == null) {
                    return;
                }
                final String method17003 = class5728.method12933().getFormattedText();
                if (method17003.contains(NameProtect.mc.method5287().getUsername())) {
                    class5728.field19289 = new StringTextComponent(method17003.replaceAll(NameProtect.mc.method5287().getUsername(), this.getStringSettingValueByName("Username")));
                }
            }
            if (method16998 instanceof Class4352) {
                final Class4352 class5729 = (Class4352)method16998;
                if (class5729.method13074() == null) {
                    return;
                }
                final String method17004 = class5729.method13074().getFormattedText();
                if (method17004.contains(NameProtect.mc.method5287().getUsername())) {
                    eventReceivePacket.setPacket(new Class4352(class5729.method13073(), new StringTextComponent(method17004.replaceAll(NameProtect.mc.method5287().getUsername(), this.getStringSettingValueByName("Username"))), class5729.method13075(), class5729.method13076(), class5729.method13077()));
                }
            }
        }
    }
}
