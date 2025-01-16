// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class AACAntiKnockBack extends Module
{
    public static int field15956;
    public float field15957;
    public float field15958;
    
    public AACAntiKnockBack() {
        super(Category.COMBAT, "AAC", "Places block underneath");
        this.addSetting(new NumberSetting("Strengh", "Boost strengh", 0.7f, Float.class, 0.0f, 1.0f, 0.01f));
        AACAntiKnockBack.field15956 = 20;
    }
    
    @Override
    public void onDisable() {
        AACAntiKnockBack.field15956 = 20;
    }
    
    @EventListener
    private void method10593(final Class5717 class5717) {
        if (!this.method9906() || AACAntiKnockBack.mc.player == null) {
            return;
        }
        if (!this.method10595()) {
            if (AACAntiKnockBack.field15956 < 7) {
                ++AACAntiKnockBack.field15956;
                if (AACAntiKnockBack.field15956 > 1) {
                    final float n = Class7482.method23143()[1];
                    final float n2 = Class7482.method23143()[2];
                    final float n3 = Class7482.method23143()[0];
                    final double cos = Math.cos(Math.toRadians(n3));
                    final double sin = Math.sin(Math.toRadians(n3));
                    final double n4 = (7 - AACAntiKnockBack.field15956) * this.getNumberSettingValueByName("Strengh") * 0.04 * this.field15958 * 0.2;
                    final double y = (n * cos + n2 * sin) * n4;
                    final double x = (n * sin - n2 * cos) * n4;
                    if (Class8845.method30918(this.field15957, (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f) > 100.0f && Class6430.method19114()) {
                        class5717.method16973(class5717.method16972() + y);
                        class5717.method16977(class5717.method16976() + x);
                    }
                    else {
                        class5717.method16973(class5717.method16972() * 0.8);
                        class5717.method16977(class5717.method16976() * 0.8);
                    }
                    Class6430.method19154(class5717.method16972());
                    Class6430.method19156(class5717.method16976());
                }
            }
            return;
        }
        if (AACAntiKnockBack.field15956 == 0) {
            if (!AACAntiKnockBack.mc.player.onGround) {
                if (AACAntiKnockBack.mc.player.field2938 > 0) {
                    if (AACAntiKnockBack.mc.player.fallDistance < 2.0f) {
                        AACAntiKnockBack.mc.player.method1738(0.0, -1.0, 0.0);
                        Class6430.method19155(AACAntiKnockBack.mc.player.getMotion().getY());
                        AACAntiKnockBack.mc.player.onGround = true;
                        AACAntiKnockBack.field15956 = 20;
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10594(final Class5723 class5723) {
        if (this.method9906() && AACAntiKnockBack.mc.player != null) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4273) {
                if (this.method10595()) {
                    AACAntiKnockBack.field15956 = 0;
                    return;
                }
                final Class4273 class5724 = (Class4273)method16998;
                if (class5724.method12822() == AACAntiKnockBack.mc.player.getEntityId()) {
                    if (class5724.field19165 != 0 || class5724.field19167 != 0) {
                        this.field15958 = (float)(Math.sqrt(class5724.field19165 * class5724.field19165 + class5724.field19167 * class5724.field19167) / 1000.0);
                        this.field15957 = (float)(Math.atan2(class5724.field19165 / 1000, class5724.field19167 / 1000) * 180.0 / 3.141592653589793) - 90.0f;
                        AACAntiKnockBack.field15956 = 0;
                    }
                }
            }
            if (class5723.method16998() instanceof Class4394) {
                final Class4394 class5725 = (Class4394)method16998;
            }
        }
    }
    
    public boolean method10595() {
        return this.getNumberSettingValueByName("Strengh") == 0.0f;
    }
}
