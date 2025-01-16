// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc.gameplays;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.misc.GamePlay;
import mapped.*;
import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;

public class JartexGamePlay extends Module
{
    private GamePlay field15759;
    
    public JartexGamePlay() {
        super(Category.MISC, "Jartex", "Gameplay for Jartex network");
    }
    
    @Override
    public void method9917() {
        this.field15759 = (GamePlay)this.method9914();
    }
    
    @EventListener
    private void method10300(final Class5723 class5723) {
        if (this.method9906() && JartexGamePlay.mc.player != null) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4378) {
                final Class4378 class5724 = (Class4378)method16998;
                final String string = class5724.method13164().getString();
                final String lowerCase = JartexGamePlay.mc.player.getName().getFormattedText().toLowerCase();
                final String method16999 = class5724.method13164().getFormattedText();
                Label_0100: {
                    if (this.field15759.method9883("AutoL")) {
                        if (!method16999.toLowerCase().contains("§r§7 has been killed by §r§a§l" + lowerCase)) {
                            if (!method16999.toLowerCase().contains("§r§7 was shot by §r§a§l" + lowerCase)) {
                                if (!string.toLowerCase().contains("§r§7 was killed with dynamite by §r§a§l" + lowerCase)) {
                                    break Label_0100;
                                }
                            }
                        }
                        this.field15759.method10296(string);
                    }
                }
                if (method16999.contains("§e§lPlay Again? §r§7Click here!§r")) {
                    if (this.field15759.method9883("AutoGG")) {
                        this.field15759.method10295();
                    }
                    if (this.field15759.method9883("Auto Join")) {
                        final Iterator<ITextComponent> iterator = class5724.method13164().iterator();
                        while (iterator.hasNext()) {
                            final Class9485 method17000 = iterator.next().getStyle().method30410();
                            if (method17000 != null && method17000.method35309() == Class2075.field11973) {
                                this.field15759.method10294(new Class7674(method17000.method35310(), (long)this.field15759.getNumberSettingValueByName("Auto Join delay") * 1000L));
                                Client.method35173().method35197().method25776(new Class6224("Auto Join", "Joining a new game in 3 seconds.", (int)(this.field15759.getNumberSettingValueByName("Auto Join delay") - 1.0f) * 1000));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
