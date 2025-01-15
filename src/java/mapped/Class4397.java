// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4397 implements Class4252<Class5813>
{
    private static String[] field19692;
    private Class2125 field19693;
    private Class1932 field19694;
    private boolean field19695;
    private boolean field19696;
    private boolean field19697;
    private boolean field19698;
    private boolean field19699;
    private boolean field19700;
    private boolean field19701;
    private boolean field19702;
    
    public Class4397() {
    }
    
    public Class4397(final Class3662<?> class3662) {
        this.field19693 = Class2125.field12397;
        this.field19694 = class3662.method11298();
    }
    
    public Class4397(final boolean field19695, final boolean field19696, final boolean field19697, final boolean field19698, final boolean b, final boolean b2) {
        this.field19693 = Class2125.field12398;
        this.field19695 = field19695;
        this.field19696 = field19696;
        this.field19697 = field19697;
        this.field19698 = field19698;
        this.field19699 = b;
        this.field19700 = b2;
        this.field19701 = b;
        this.field19702 = b2;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19693 = class8654.method29499(Class2125.class);
        if (this.field19693 != Class2125.field12397) {
            if (this.field19693 == Class2125.field12398) {
                this.field19695 = class8654.readBoolean();
                this.field19696 = class8654.readBoolean();
                this.field19697 = class8654.readBoolean();
                this.field19698 = class8654.readBoolean();
                this.field19699 = class8654.readBoolean();
                this.field19700 = class8654.readBoolean();
                this.field19701 = class8654.readBoolean();
                this.field19702 = class8654.readBoolean();
            }
        }
        else {
            this.field19694 = class8654.method29516();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19693);
        if (this.field19693 != Class2125.field12397) {
            if (this.field19693 == Class2125.field12398) {
                class8654.writeBoolean(this.field19695);
                class8654.writeBoolean(this.field19696);
                class8654.writeBoolean(this.field19697);
                class8654.writeBoolean(this.field19698);
                class8654.writeBoolean(this.field19699);
                class8654.writeBoolean(this.field19700);
                class8654.writeBoolean(this.field19701);
                class8654.writeBoolean(this.field19702);
            }
        }
        else {
            class8654.method29517(this.field19694);
        }
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17444(this);
    }
    
    public Class2125 method13224() {
        return this.field19693;
    }
    
    public Class1932 method13225() {
        return this.field19694;
    }
    
    public boolean method13226() {
        return this.field19695;
    }
    
    public boolean method13227() {
        return this.field19696;
    }
    
    public boolean method13228() {
        return this.field19697;
    }
    
    public boolean method13229() {
        return this.field19698;
    }
    
    public boolean method13230() {
        return this.field19699;
    }
    
    public boolean method13231() {
        return this.field19700;
    }
    
    public boolean method13232() {
        return this.field19701;
    }
    
    public boolean method13233() {
        return this.field19702;
    }
}
