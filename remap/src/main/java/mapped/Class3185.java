// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Iterator;

public class Class3185 extends Class3167
{
    public Class3185() {
        super(Class8013.field32984, "Vanilla", "Draws a line arround players");
    }
    
    @Class6753
    public void method9992(final Class5743 class5743) {
        if (this.method9906()) {
            for (final Entity class5744 : Class3185.field15514.world.method6806()) {
                if (!Class9463.method35173().method35191().method31751(class5744)) {
                    final boolean b = Class6430.method19174(class5744) == Class2068.field11839 && this.method9914().method9883("Show Players");
                    final boolean b2 = Class6430.method19174(class5744) == Class2068.field11838 && this.method9914().method9883("Show Mobs");
                    final boolean b3 = Class6430.method19174(class5744) == Class2068.field11840 && this.method9914().method9883("Show Passives");
                    final boolean b4 = !class5744.method1823() || this.method9914().method9883("Show Invisibles");
                    Label_0222: {
                        if (!b2) {
                            if (!b) {
                                if (!b3) {
                                    break Label_0222;
                                }
                            }
                        }
                        if (b4) {
                            if (class5744 != Class3185.field15514.player) {
                                class5744.method1822(true);
                                continue;
                            }
                        }
                    }
                    class5744.method1822(false);
                }
            }
        }
    }
    
    @Override
    public void method9897() {
        final Iterator<Entity> iterator = Class3185.field15514.world.method6806().iterator();
        while (iterator.hasNext()) {
            iterator.next().method1822(false);
        }
    }
}
