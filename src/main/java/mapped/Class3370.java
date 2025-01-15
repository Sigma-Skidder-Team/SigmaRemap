// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.util.InDevelopment;

@InDevelopment
public class Class3370 extends Class3167
{
    public Class3370() {
        super(Class8013.field32988, "PacketEssentials", "Ignores all types of junk cosmetic packets to improve fps");
    }
    
    @Class6753
    private void method10718(final Class5723 class5723) {
        if (this.method9906()) {
            if (!(class5723.method16998() instanceof Class4339)) {
                if (!(class5723.method16998() instanceof Class4276)) {
                    if (!(class5723.method16998() instanceof Class4278)) {
                        if (!(class5723.method16998() instanceof Class4301)) {
                            if (!(class5723.method16998() instanceof Class4400)) {
                                if (class5723.method16998() instanceof Class4268) {
                                    class5723.method16961(true);
                                }
                            }
                            else {
                                class5723.method16961(true);
                            }
                        }
                        else {
                            class5723.method16961(true);
                        }
                    }
                    else {
                        final Class4278 class5724 = (Class4278)class5723.method16998();
                        class5723.method16961(true);
                    }
                }
                else if (((Class4276)class5723.method16998()).method12831() == 1) {
                    class5723.method16961(true);
                }
            }
            else {
                final Class4339 class5725 = (Class4339)class5723.method16998();
                if (class5725.method13033() == Class7499.field28958) {
                    class5723.method16961(true);
                }
                if (class5725.method13033() == Class7499.field28987) {
                    class5723.method16961(true);
                }
            }
        }
    }
}
