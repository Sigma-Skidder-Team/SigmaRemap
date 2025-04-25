// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc.gameplays;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.misc.GamePlay;
import com.mentalfrostbyte.jello.mods.impl.render.NameProtect;
import mapped.*;
import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class HypixelGamePlay extends Module
{
    private GamePlay field15682;
    
    public HypixelGamePlay() {
        super(Category.MISC, "Hypixel", "Gameplay for Hypixel");
    }
    
    @Override
    public void initialize() {
        this.field15682 = (GamePlay)this.method9914();
    }
    
    @EventListener
    private void method10161(final Class5723 class5723) {
        if (HypixelGamePlay.mc.player == null) {
            return;
        }
        final IPacket method16998 = class5723.method16998();
        if (method16998 instanceof Class4378) {
            final Class4378 class5724 = (Class4378)method16998;
            final String replaceAll = class5724.method13164().getUnformattedComponentText().replaceAll("§.", "");
            final String method16999 = class5724.method13164().getFormattedText();
            if (class5724.method13166() != Class285.field1573 && class5724.method13166() != Class285.field1572) {
                return;
            }
            String s = HypixelGamePlay.mc.player.getName().getFormattedText().toLowerCase();
            if (Client.getInstance().moduleManager().getModuleByClass(NameProtect.class).isEnabled()) {
                s = Client.getInstance().moduleManager().getModuleByClass(NameProtect.class).getStringSettingValueByName("Username").toLowerCase();
            }
            if (this.field15682.method9883("AutoL")) {
                final String[] array = { "MULTI ", "PENTA ", "QUADRA ", "TRIPLE ", "DOUBLE ", "" };
                boolean b = false;
                for (int i = 0; i < 6; ++i) {
                    if (method16999.startsWith("§a§l" + array[i] + "KILL! ")) {
                        b = true;
                    }
                }
                if (b) {
                    final String[] split = replaceAll.split(" ");
                    if (split.length > 3) {
                        this.field15682.method10296(split[3]);
                    }
                }
                if (replaceAll.toLowerCase().contains("was killed by " + s) || replaceAll.toLowerCase().contains("was thrown into the void by " + s + ".") || replaceAll.toLowerCase().contains("was thrown off a cliff by " + s + ".") || replaceAll.toLowerCase().contains("be sent to davy jones' locker by " + s + ".")) {
                    final Class6516 method17000 = HypixelGamePlay.mc.world.method6782();
                    Class9290 method17001 = null;
                    final Class6749 method17002 = method17000.method19651(HypixelGamePlay.mc.player.method1867());
                    if (method17002 != null) {
                        final int method17003 = method17002.getColor().getColorIndex();
                        if (method17003 >= 0) {
                            method17001 = method17000.method19644(3 + method17003);
                        }
                    }
                    final Collection<Class7628> method17004 = method17000.method19637((method17001 != null) ? method17001 : method17000.method19644(1));
                    int int1 = -1;
                Label_0730:
                    for (final Class7628 class5725 : method17004) {
                        final String replaceAll2 = Class6749.method20549(method17000.method19651(class5725.method23973()), new StringTextComponent(class5725.method23973())).getString().replaceAll("§t", "");
                        final Iterator iterator2 = new ArrayList(Arrays.asList("players left", "joueurs restants", "spieler verbleibend")).iterator();
                        while (iterator2.hasNext()) {
                            if (replaceAll2.toLowerCase().contains((String)iterator2.next() + ":")) {
                                final String[] split2 = replaceAll2.split(" ");
                                if (split2.length > 2) {
                                    try {
                                        int1 = Integer.parseInt(split2[2]);
                                    }
                                    catch (final NumberFormatException ex) {}
                                    break Label_0730;
                                }
                                continue;
                            }
                        }
                    }
                    if (int1 > 2) {
                        this.field15682.method10296(replaceAll);
                    }
                }
            }
            if (method16999.contains("§r§eWant to play again?§r§b§l Click here! §r") || replaceAll.contains("coins! (Win)")) {
                if (this.field15682.method9883("Auto Join")) {
                    final Iterator<ITextComponent> iterator3 = class5724.method13164().iterator();
                    while (iterator3.hasNext()) {
                        final Class9485 method17005 = iterator3.next().getStyle().method30410();
                        if (method17005 != null && method17005.method35309() == Class2075.field11973) {
                            this.field15682.method10294(new Class7674(method17005.method35310(), (long)this.field15682.getNumberSettingValueByName("Auto Join delay") * 1000L));
                        }
                    }
                }
                if (this.field15682.method9883("AutoGG")) {
                    this.field15682.method10295();
                }
            }
        }
    }
}
