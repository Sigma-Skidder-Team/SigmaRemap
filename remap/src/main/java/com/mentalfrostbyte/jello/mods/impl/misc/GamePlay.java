// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.misc.gameplays.*;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import com.mentalfrostbyte.jello.settings.impl.TextInputSetting;
import mapped.*;

import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.ArrayList;

public class GamePlay extends ModuleWithSettings
{
    private ArrayList<String> field15753;
    private ArrayList<String> field15754;
    private Class7674 field15755;
    private Class7617 field15756;
    private int field15757;
    
    public GamePlay() {
        super(Category.MISC, "GamePlay", "Manage your gameplay experience just for you.", new Module[] { new HypixelGamePlay(), new CubecraftGamePlay(), new MineplexGamePlay(), new FuncraftGamePlay(), new JartexGamePlay() });
        this.field15753 = new ArrayList<String>();
        this.field15754 = new ArrayList<String>();
        this.addSetting(new BooleanSetting("AutoL", "Automatically says L when you kill a player", true));
        this.addSetting(new StringSetting("AutoL Mode", "AutoL Mode", 0, new String[] { "Basic", "Sigmeme", "Penshen" }).method15195(class4997 -> this.field15753.clear()));
        this.addSetting(new TextInputSetting("First character", "The characters your sentences will start with.", ""));
        this.addSetting(new BooleanSetting("AutoGG", "Automatically say gg at the end of the game", true));
        this.addSetting(new BooleanSetting("Auto Join", "Automatically joins another game", true));
        this.addSetting(new NumberSetting("Auto Join delay", "Seconds before joining a new game", 4.0f, Float.class, 1.0f, 10.0f, 1.0f));
        this.field15756 = new Class7617();
    }
    
    @Override
    public void onEnable() {
        if (!this.field15756.method23937()) {
            this.field15756.method23932();
        }
        this.field15755 = null;
        this.field15753.clear();
        this.field15754.clear();
    }
    
    @Override
    public void onDisable() {
        this.field15756.method23934();
        this.field15756.method23933();
        this.field15755 = null;
    }
    
    @EventListener
    private void method10293(final Class5743 class5743) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field15755 != null) {
            if (GamePlay.mc.currentScreen instanceof ChatScreen) {
                this.method10294(null);
                Client.getInstance().method35197().method25776(new Class6224("Auto Join", "Auto join was canceled.", 2500));
            }
            else if (this.field15755.method24358()) {
                ColorUtils.method19107(this.field15755.method24360());
                this.method10294(null);
            }
            else if ((int)(this.field15755.method24359() / 1000L) + 1 < this.field15757) {
                this.field15757 = (int)(this.field15755.method24359() / 1000L) + 1;
                Client.getInstance().method35197().method25776(new Class6224("Auto Join", "Joining a new game in " + this.field15757 + " second" + ((this.field15757 > 1) ? "s" : "") + ".", 2000));
            }
        }
        if (!this.field15756.method23937()) {
            this.field15756.method23932();
        }
        if (!this.field15754.isEmpty()) {
            final String method9887 = this.getStringSettingValueByName("Type");
            try {
                if (GamePlay.mc.player.ticksExisted <= 3) {
                    this.field15754.clear();
                }
                long n = 3200L;
                if (!method9887.equalsIgnoreCase("Hypixel")) {
                    n = 0L;
                }
                if (method9887.equalsIgnoreCase("Mineplex")) {
                    n = 300L;
                }
                if (method9887.equalsIgnoreCase("Funcraft")) {
                    n = 1000L;
                }
                if (method9887.equalsIgnoreCase("Jartex")) {
                    n = 3200L;
                }
                if (this.field15756.method23935() > n && !this.field15754.isEmpty()) {
                    this.field15756.method23934();
                    ColorUtils.method19107(this.field15754.get(0));
                    this.field15754.remove(0);
                }
            }
            catch (final ConcurrentModificationException ex) {}
        }
    }
    
    public void method10294(final Class7674 field15755) {
        this.field15755 = field15755;
        if (field15755 != null) {
            this.field15757 = (int)(field15755.method24359() / 1000L) + 1;
        }
    }
    
    public void method10295() {
        this.field15754.add("gg");
    }
    
    public void method10296(final String s) {
        final String[] split = s.split(" ");
        String str = split[0];
        if (this.getStringSettingValueByName("Type").equals("Mineplex") || this.getStringSettingValueByName("Type").equals("Funcraft")) {
            str = split[1];
        }
        final String method9887 = this.getStringSettingValueByName("AutoL Mode");
        switch (method9887) {
            case "Basic": {
                this.field15754.add(this.getStringSettingValueByName("First character") + "L " + str);
                break;
            }
            case "Sigmeme": {
                if (this.field15753.isEmpty()) {
                    Collections.shuffle(this.field15753 = new ArrayList<String>(Class9564.field41152));
                }
                String replaceAll = this.field15753.get(0);
                if (this.getStringSettingValueByName("Type").equals("Cubecraft")) {
                    replaceAll = replaceAll.replaceAll("sigma", "ＳＩＧＭＡ").replaceAll("Sigma", "ＳＩＧＭＡ");
                }
                this.field15754.add(this.getStringSettingValueByName("First character") + replaceAll);
                this.field15753.remove(0);
                break;
            }
            case "Penshen": {
                if (this.field15753.isEmpty()) {
                    Collections.shuffle(this.field15753 = Class9564.field41153);
                }
                String replaceAll2 = this.field15753.get(0);
                if (this.getStringSettingValueByName("Type").equals("Cubecraft")) {
                    replaceAll2 = replaceAll2.replaceAll("sigma", "ＳＩＧＭＡ").replaceAll("Sigma", "ＳＩＧＭＡ");
                }
                this.field15754.add(this.getStringSettingValueByName("First character") + replaceAll2);
                this.field15753.remove(0);
                break;
            }
        }
    }
}
