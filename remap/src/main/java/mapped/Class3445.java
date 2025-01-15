// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3445 extends Class3446
{
    private static String[] field16267;
    private final Class795 field16268;
    private Class513 field16269;
    private boolean field16270;
    
    public Class3445(final Class795 field16268) {
        this.field16268 = field16268;
    }
    
    @Override
    public boolean method11013() {
        final Class513 class513 = (Class513)this.field16268.method4488();
        boolean b = false;
        Label_0057: {
            if (class513 != null) {
                if (!class513.isSpectator()) {
                    if (!class513.field3025.field27302) {
                        if (!class513.method1706()) {
                            b = true;
                            break Label_0057;
                        }
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        if (!this.field16268.method4483()) {
            if (b2) {
                if (this.field16268.method4493()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11014() {
        return !this.field16270;
    }
    
    @Override
    public void method11015() {
        this.field16269 = (Class513)this.field16268.method4488();
        this.field16270 = false;
    }
    
    @Override
    public void method11016() {
        if (!this.field16270) {
            if (!this.field16268.method4483()) {
                if (!this.field16268.method4205()) {
                    if (this.field16268.getBoundingBox().method18502(this.field16269.getBoundingBox())) {
                        this.field16270 = this.field16268.method4492(this.field16269);
                    }
                }
            }
        }
    }
}
