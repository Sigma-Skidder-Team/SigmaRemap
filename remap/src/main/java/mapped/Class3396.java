// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class3396 extends Class3167
{
    public Class3396() {
        super(Class8013.field32988, "NickNameDetector", "Detect if a player has a custom name");
    }
    
    @Class6753
    private void method10838(final Class5743 class5743) {
        if (this.method9906()) {
            for (final Entity class5744 : Class6430.method19108()) {
                if (Class9463.method35173().method35191().method31751(class5744)) {
                    continue;
                }
                if (class5744.field2424 <= 30) {
                    continue;
                }
                if (!class5744.hasCustomName()) {
                    continue;
                }
                Class6430.method19106(class5744.getName().method8459() + " might have a custom nametag");
            }
        }
    }
}
