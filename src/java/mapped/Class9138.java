// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class Class9138
{
    public static Class9138 field38715;
    public static Class9138 field38716;
    public static Class9138 field38717;
    public static Class9138 field38718;
    public static Class9138 field38719;
    public static Class9138 field38720;
    private float field38721;
    private float field38722;
    private float field38723;
    
    public Class9138() {
    }
    
    public Class9138(final float field38721, final float field38722, final float field38723) {
        this.field38721 = field38721;
        this.field38722 = field38722;
        this.field38723 = field38723;
    }
    
    public Class9138(final Class5487 class5487) {
        this((float)class5487.field22770, (float)class5487.field22771, (float)class5487.field22772);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class9138 class9138 = (Class9138)o;
            return Float.compare(class9138.field38721, this.field38721) == 0 && Float.compare(class9138.field38722, this.field38722) == 0 && Float.compare(class9138.field38723, this.field38723) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * Float.floatToIntBits(this.field38721) + Float.floatToIntBits(this.field38722)) + Float.floatToIntBits(this.field38723);
    }
    
    public float method33311() {
        return this.field38721;
    }
    
    public float method33312() {
        return this.field38722;
    }
    
    public float method33313() {
        return this.field38723;
    }
    
    public void method33314(final float n) {
        this.field38721 *= n;
        this.field38722 *= n;
        this.field38723 *= n;
    }
    
    public void method33315(final float n, final float n2, final float n3) {
        this.field38721 *= n;
        this.field38722 *= n2;
        this.field38723 *= n3;
    }
    
    public void method33316(final float n, final float n2) {
        this.field38721 = Class9546.method35653(this.field38721, n, n2);
        this.field38722 = Class9546.method35653(this.field38722, n, n2);
        this.field38723 = Class9546.method35653(this.field38723, n, n2);
    }
    
    public void method33317(final float field38721, final float field38722, final float field38723) {
        this.field38721 = field38721;
        this.field38722 = field38722;
        this.field38723 = field38723;
    }
    
    public void method33318(final float n, final float n2, final float n3) {
        this.field38721 += n;
        this.field38722 += n2;
        this.field38723 += n3;
    }
    
    public void method33319(final Class9138 class9138) {
        this.field38721 += class9138.field38721;
        this.field38722 += class9138.field38722;
        this.field38723 += class9138.field38723;
    }
    
    public void method33320(final Class9138 class9138) {
        this.field38721 -= class9138.field38721;
        this.field38722 -= class9138.field38722;
        this.field38723 -= class9138.field38723;
    }
    
    public float method33321(final Class9138 class9138) {
        return this.field38721 * class9138.field38721 + this.field38722 * class9138.field38722 + this.field38723 * class9138.field38723;
    }
    
    public boolean method33322() {
        final float n = this.field38721 * this.field38721 + this.field38722 * this.field38722 + this.field38723 * this.field38723;
        if (n >= 1.0E-5) {
            final float method35694 = Class9546.method35694(n);
            this.field38721 *= method35694;
            this.field38722 *= method35694;
            this.field38723 *= method35694;
            return true;
        }
        return false;
    }
    
    public void method33323(final Class9138 class9138) {
        final float field38721 = this.field38721;
        final float field38722 = this.field38722;
        final float field38723 = this.field38723;
        final float method33311 = class9138.method33311();
        final float method33312 = class9138.method33312();
        final float method33313 = class9138.method33313();
        this.field38721 = field38722 * method33313 - field38723 * method33312;
        this.field38722 = field38723 * method33311 - field38721 * method33313;
        this.field38723 = field38721 * method33312 - field38722 * method33311;
    }
    
    public void method33324(final Class9429 class9429) {
        final float field38721 = this.field38721;
        final float field38722 = this.field38722;
        final float field38723 = this.field38723;
        this.field38721 = class9429.field40442 * field38721 + class9429.field40443 * field38722 + class9429.field40444 * field38723;
        this.field38722 = class9429.field40445 * field38721 + class9429.field40446 * field38722 + class9429.field40447 * field38723;
        this.field38723 = class9429.field40448 * field38721 + class9429.field40449 * field38722 + class9429.field40450 * field38723;
    }
    
    public void method33325(final Class9389 class9389) {
        final Class9389 class9390 = new Class9389(class9389);
        class9390.method34903(new Class9389(this.method33311(), this.method33312(), this.method33313(), 0.0f));
        final Class9389 class9391 = new Class9389(class9389);
        class9391.method34905();
        class9390.method34903(class9391);
        this.method33317(class9390.method34899(), class9390.method34900(), class9390.method34901());
    }
    
    public void method33326(final Class9138 class9138, final float n) {
        final float n2 = 1.0f - n;
        this.field38721 = this.field38721 * n2 + class9138.field38721 * n;
        this.field38722 = this.field38722 * n2 + class9138.field38722 * n;
        this.field38723 = this.field38723 * n2 + class9138.field38723 * n;
    }
    
    public Class9389 method33327(final float n) {
        return new Class9389(this, n, false);
    }
    
    public Class9389 method33328(final float n) {
        return new Class9389(this, n, true);
    }
    
    public Class9138 method33329() {
        return new Class9138(this.field38721, this.field38722, this.field38723);
    }
    
    public void method33330(final Float2FloatFunction float2FloatFunction) {
        this.field38721 = float2FloatFunction.get(this.field38721);
        this.field38722 = float2FloatFunction.get(this.field38722);
        this.field38723 = float2FloatFunction.get(this.field38723);
    }
    
    @Override
    public String toString() {
        return "[" + this.field38721 + ", " + this.field38722 + ", " + this.field38723 + "]";
    }
    
    static {
        Class9138.field38715 = new Class9138(-1.0f, 0.0f, 0.0f);
        Class9138.field38716 = new Class9138(1.0f, 0.0f, 0.0f);
        Class9138.field38717 = new Class9138(0.0f, -1.0f, 0.0f);
        Class9138.field38718 = new Class9138(0.0f, 1.0f, 0.0f);
        Class9138.field38719 = new Class9138(0.0f, 0.0f, -1.0f);
        Class9138.field38720 = new Class9138(0.0f, 0.0f, 1.0f);
    }
}
