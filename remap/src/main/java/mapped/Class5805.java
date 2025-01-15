// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class5805 implements Class5804
{
    private final Class394 field23833;
    private final Class3641 field23834;
    
    public Class5805(final Class394 field23833, final Class3641 field23834) {
        this.field23833 = field23833;
        this.field23834 = field23834;
    }
    
    @Override
    public void method17403(final Class4398 class4398) {
        switch (Class7596.field30121[class4398.method13235().ordinal()]) {
            case 1: {
                this.field23834.method11171(Class2208.field13457);
                if (class4398.method13236() > Class9528.method35579().getProtocolVersion()) {
                    final Class2259 class4399 = new Class2259("multiplayer.disconnect.outdated_server", new Object[] { Class9528.method35579().getName() });
                    this.field23834.method11174(new Class4277(class4399));
                    this.field23834.method11181(class4399);
                    break;
                }
                if (class4398.method13236() < Class9528.method35579().getProtocolVersion()) {
                    final Class2259 class4400 = new Class2259("multiplayer.disconnect.outdated_client", new Object[] { Class9528.method35579().getName() });
                    this.field23834.method11174(new Class4277(class4400));
                    this.field23834.method11181(class4400);
                    break;
                }
                this.field23834.method11173(new Class5803(this.field23833, this.field23834));
                break;
            }
            case 2: {
                this.field23834.method11171(Class2208.field13456);
                this.field23834.method11173(new Class5810(this.field23833, this.field23834));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + class4398.method13235());
            }
        }
    }
    
    @Override
    public void method17291(final ITextComponent class2250) {
    }
    
    @Override
    public Class3641 method17369() {
        return this.field23834;
    }
}
