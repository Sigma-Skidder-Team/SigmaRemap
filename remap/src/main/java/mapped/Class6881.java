// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6881 extends Class6880
{
    private static String[] field26963;
    public float field26964;
    public long field26965;
    
    public Class6881(final Class4301 class4301) {
        super(class4301.method12931(), class4301.method12933(), class4301.method12935(), class4301.method12936());
        this.field26964 = class4301.method12934();
        this.field26957 = class4301.method12934();
        this.field26965 = Class8349.method27837();
        this.method21067(class4301.method12937());
        this.method21068(class4301.method12938());
        this.method21069(class4301.method12939());
    }
    
    @Override
    public void method21064(final float field26964) {
        this.field26957 = this.method21077();
        this.field26964 = field26964;
        this.field26965 = Class8349.method27837();
    }
    
    @Override
    public float method21077() {
        return Class9546.method35700(Class9546.method35653((Class8349.method27837() - this.field26965) / 100.0f, 0.0f, 1.0f), this.field26957, this.field26964);
    }
    
    public void method21083(final Class4301 class4301) {
        switch (Class8144.field33548[class4301.method12932().ordinal()]) {
            case 1: {
                this.method21070(class4301.method12933());
                break;
            }
            case 2: {
                this.method21064(class4301.method12934());
                break;
            }
            case 3: {
                this.method21065(class4301.method12935());
                this.method21066(class4301.method12936());
                break;
            }
            case 4: {
                this.method21067(class4301.method12937());
                this.method21068(class4301.method12938());
                break;
            }
        }
    }
}
