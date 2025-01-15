// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public final class Class5771 implements Class5770
{
    private static String[] field23606;
    private final int field23607;
    
    public Class5771(final int field23607) {
        this.field23607 = field23607;
    }
    
    @Override
    public int method17159(final Random random) {
        return this.field23607;
    }
    
    @Override
    public Class1932 method17161() {
        return Class5771.field23603;
    }
    
    public static Class5771 method17164(final int n) {
        return new Class5771(n);
    }
}
