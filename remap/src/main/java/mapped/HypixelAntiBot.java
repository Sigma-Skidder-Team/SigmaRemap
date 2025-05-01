// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.HashMap;

public class HypixelAntiBot extends AntiBotBase
{
    public HashMap<Entity, Boolean> field32020;
    
    public HypixelAntiBot() {
        super("Hypixel", "Detects bots on Hypixel based on entity names", Class304.field1770);
        this.field32020 = new HashMap<Entity, Boolean>();
    }
    
    @Override
    public boolean isBot(final Entity class399) {
        final String method8461 = class399.getDisplayName().getFormattedText();
        final String s = (class399.getCustomName() != null) ? class399.getCustomName().getFormattedText() : null;
        final String method8462 = class399.getName().getFormattedText();
        if (class399.method1823()) {
            if (!method8461.startsWith("§c")) {
                if (method8461.endsWith("§r")) {
                    if (s == null || s.equals(method8462)) {
                        final double abs = Math.abs(class399.posX - HypixelAntiBot.field32015.player.posX);
                        final double abs2 = Math.abs(class399.posY - HypixelAntiBot.field32015.player.posY);
                        final double abs3 = Math.abs(class399.posZ - HypixelAntiBot.field32015.player.posZ);
                        final double sqrt = Math.sqrt(abs * abs + abs3 * abs3);
                        if (abs2 < 13.0) {
                            if (abs2 > 10.0) {
                                if (sqrt < 3.0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!method8461.startsWith("§") && method8461.endsWith("§r")) {
            return true;
        }
        if (class399.method1823()) {
            if (method8462.equals(method8461)) {
                if (s.equals(method8462 + "§r")) {
                    return true;
                }
            }
        }
        if (s != null) {
            if (!s.equalsIgnoreCase("")) {
                if (method8461.toLowerCase().contains("§c")) {
                    if (method8461.toLowerCase().contains("§r")) {
                        return true;
                    }
                }
            }
        }
        if (!method8461.contains("§8[NPC]")) {
            if (!method8461.contains("§c")) {
                if (s != null) {
                    return !s.equalsIgnoreCase("");
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public boolean isNotBot(final Entity class399) {
        return true;
    }
}
