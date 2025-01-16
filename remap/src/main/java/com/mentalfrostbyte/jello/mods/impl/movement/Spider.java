// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.movement.spiders.VanillaSpider;
import com.mentalfrostbyte.jello.mods.impl.movement.spiders.SpartanSpider;
import net.minecraft.util.math.AxisAlignedBB;

public class Spider extends ModuleWithSettings
{
    public Spider() {
        super(Category.MOVEMENT, "Spider", "Climp walls like spiders", new Module[] { new VanillaSpider(), new SpartanSpider() });
    }
    
    public int method10264() {
        final AxisAlignedBB class6221 = new AxisAlignedBB(Spider.mc.player.posX - 0.29, Spider.mc.player.posY + 1.9, Spider.mc.player.posZ + 0.29, Spider.mc.player.posX + 0.29, Spider.mc.player.posY, Spider.mc.player.posZ - 0.29);
        if (Spider.mc.world.method6981(Spider.mc.player, class6221.offset(0.3000001, 0.0, 0.0)).count() != 0L) {
            return 1;
        }
        if (Spider.mc.world.method6981(Spider.mc.player, class6221.offset(-0.3000001, 0.0, 0.0)).count() != 0L) {
            return 2;
        }
        if (Spider.mc.world.method6981(Spider.mc.player, class6221.offset(0.0, 0.0, 0.3000001)).count() != 0L) {
            return 3;
        }
        if (Spider.mc.world.method6981(Spider.mc.player, class6221.offset(0.0, 0.0, -0.3000001)).count() == 0L) {
            return 0;
        }
        return 4;
    }
}
