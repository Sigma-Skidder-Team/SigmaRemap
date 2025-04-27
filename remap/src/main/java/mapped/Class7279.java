// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public final class Class7279
{
    private static String[] field28192;
    private static final long field28193 = 1094994246L;
    private long field28194;
    private boolean field28195;
    private final byte[] field28196;
    private boolean field28197;
    private boolean field28198;
    private boolean field28199;
    private int field28200;
    private int field28201;
    private int[] field28202;
    private Class4208[] field28203;
    
    public static boolean method22316(final Class8157 class8157) throws AACException {
        return class8157.method26943(32) == 1094994246L;
    }
    
    private Class7279() {
        this.field28196 = new byte[9];
    }
    
    public static Class7279 method22317(final Class8157 class8157) throws AACException {
        final Class7279 class8158 = new Class7279();
        class8158.method22318(class8157);
        return class8158;
    }
    
    private void method22318(final Class8157 class8157) throws AACException {
        this.field28194 = class8157.method26940(32);
        if (this.field28195 = class8157.method26942()) {
            for (int i = 0; i < 9; ++i) {
                this.field28196[i] = (byte)class8157.method26940(8);
            }
        }
        this.field28197 = class8157.method26942();
        this.field28198 = class8157.method26942();
        this.field28199 = class8157.method26942();
        this.field28200 = class8157.method26940(23);
        this.field28201 = class8157.method26940(4) + 1;
        this.field28203 = new Class4208[this.field28201];
        this.field28202 = new int[this.field28201];
        for (int j = 0; j < this.field28201; ++j) {
            if (!this.field28199) {
                this.field28202[j] = class8157.method26940(20);
            }
            else {
                this.field28202[j] = -1;
            }
            (this.field28203[j] = new Class4208()).method12672(class8157);
        }
    }
    
    public Class4208 method22319() {
        return this.field28203[0];
    }
}
