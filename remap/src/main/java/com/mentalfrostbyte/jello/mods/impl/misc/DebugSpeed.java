// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class5743;
import mapped.ColorUtils;
import mapped.EventListener;
import net.minecraft.util.math.Vec3d;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.io.FileWriter;

public class DebugSpeed extends Module
{
    public FileWriter field15618;
    public int field15619;
    public Vec3d field15620;
    
    public DebugSpeed() {
        super(Category.MISC, "DebugSpeed", "");
        this.field15619 = 1;
    }
    
    @EventListener
    public void method10042(final Class5743 class5743) {
        if (this.isEnabled()) {
            final Vec3d field15620 = new Vec3d(DebugSpeed.mc.player.posX, 0.0, DebugSpeed.mc.player.posZ);
            if (DebugSpeed.mc.player.onGround) {
                if (this.field15620 != null) {
                    final double d = field15620.distanceTo(this.field15620) / this.field15619 * DebugSpeed.mc.timer.timerSpeed;
                    final boolean b = Client.getInstance().getTickManager().method29228() > 1 && DebugSpeed.mc.player.field2985 == 0;
                    float floatValue = new BigDecimal(d / (b ? 0.280616 : 0.312948)).setScale(4, RoundingMode.DOWN).floatValue();
                    if (floatValue <= 9.0E-4) {
                        floatValue = 0.0f;
                    }
                    if (floatValue == 0.0f) {
                        return;
                    }
                    String s;
                    for (s = Float.toString(floatValue); s.length() < 6; s += "0") {}
                    ColorUtils.method19106(Client.getInstance().getCommandManager().method32671() + "(" + s + "x faster " + (b ? "walking" : "jumping") + ")  Speed: " + d);
                }
            }
            int field15621;
            if (!DebugSpeed.mc.player.onGround) {
                this.field15619 = (field15621 = this.field15619) + 1;
            }
            else {
                field15621 = 1;
            }
            this.field15619 = field15621;
            this.field15620 = field15620;
        }
    }
}
