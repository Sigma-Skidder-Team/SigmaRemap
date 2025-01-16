// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2235
{
    field13729(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true), 
    field13730(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true), 
    field13731(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true), 
    field13732(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);
    
    private final int field13733;
    private final int field13734;
    private final boolean field13735;
    private final boolean field13736;
    private final boolean field13737;
    private final boolean field13738;
    private final boolean field13739;
    private final int field13740;
    private final int field13741;
    private final int field13742;
    private final int field13743;
    private final int field13744;
    private final boolean field13745;
    
    private Class2235(final int field13733, final int field13734, final boolean field13735, final boolean field13736, final boolean field13737, final boolean field13738, final boolean field13739, final int field13740, final int field13741, final int field13742, final int field13743, final int field13744, final boolean field13745) {
        this.field13733 = field13733;
        this.field13734 = field13734;
        this.field13735 = field13735;
        this.field13736 = field13736;
        this.field13737 = field13737;
        this.field13738 = field13738;
        this.field13739 = field13739;
        this.field13740 = field13740;
        this.field13741 = field13741;
        this.field13742 = field13742;
        this.field13743 = field13743;
        this.field13744 = field13744;
        this.field13745 = field13745;
    }
    
    public int method8430() {
        return this.field13733;
    }
    
    public void method8431() {
        RenderSystem.method29989(RenderSystem::method29984);
        Class8933.method31659(3333, this.method8430());
    }
    
    public void method8432() {
        RenderSystem.method29989(RenderSystem::method29985);
        Class8933.method31659(3317, this.method8430());
    }
    
    public int method8433() {
        return this.field13734;
    }
    
    public boolean method8434() {
        return this.field13739;
    }
    
    public int method8435() {
        return this.field13744;
    }
    
    public boolean method8436() {
        return this.field13738 || this.field13739;
    }
    
    public int method8437() {
        return this.field13738 ? this.field13743 : this.field13744;
    }
    
    public boolean method8438() {
        return this.field13745;
    }
    
    private static Class2235 method8439(final int n) {
        switch (n) {
            case 1: {
                return Class2235.field13732;
            }
            case 2: {
                return Class2235.field13731;
            }
            case 3: {
                return Class2235.field13730;
            }
            default: {
                return Class2235.field13729;
            }
        }
    }
}
