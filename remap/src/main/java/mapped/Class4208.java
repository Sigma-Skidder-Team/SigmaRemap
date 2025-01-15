// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4208 extends Class4176
{
    private static final int field18971 = 16;
    private static final int field18972 = 16;
    private static final int field18973 = 16;
    private static final int field18974 = 4;
    private static final int field18975 = 8;
    private static final int field18976 = 16;
    private Class2002 field18977;
    private Class2077 field18978;
    private int field18979;
    private int field18980;
    private int field18981;
    private int field18982;
    private int field18983;
    private int field18984;
    private boolean field18985;
    private boolean field18986;
    private boolean field18987;
    private int field18988;
    private int field18989;
    private int field18990;
    private boolean field18991;
    private final Class8884[] field18992;
    private final Class8884[] field18993;
    private final Class8884[] field18994;
    private final int[] field18995;
    private final int[] field18996;
    private final Class7204[] field18997;
    private byte[] field18998;
    
    public Class4208() {
        this.field18992 = new Class8884[16];
        this.field18993 = new Class8884[16];
        this.field18994 = new Class8884[16];
        this.field18995 = new int[4];
        this.field18996 = new int[8];
        this.field18997 = new Class7204[16];
        this.field18978 = Class2077.field12004;
    }
    
    public void method12672(final Class8157 class8157) throws AACException {
        this.method12511(class8157);
        this.field18977 = Class2002.method8025(class8157.method26940(2));
        this.field18978 = Class2077.method8180(class8157.method26940(4));
        this.field18979 = class8157.method26940(4);
        this.field18980 = class8157.method26940(4);
        this.field18981 = class8157.method26940(4);
        this.field18982 = class8157.method26940(2);
        this.field18983 = class8157.method26940(3);
        this.field18984 = class8157.method26940(4);
        if (this.field18985 = class8157.method26942()) {
            Class4178.field18616.warning("mono mixdown present, but not yet supported");
            this.field18988 = class8157.method26940(4);
        }
        if (this.field18986 = class8157.method26942()) {
            Class4178.field18616.warning("stereo mixdown present, but not yet supported");
            this.field18989 = class8157.method26940(4);
        }
        if (this.field18987 = class8157.method26942()) {
            Class4178.field18616.warning("matrix mixdown present, but not yet supported");
            this.field18990 = class8157.method26940(2);
            this.field18991 = class8157.method26942();
        }
        this.method12673(this.field18992, class8157, this.field18979);
        this.method12673(this.field18993, class8157, this.field18980);
        this.method12673(this.field18994, class8157, this.field18981);
        for (int i = 0; i < this.field18982; ++i) {
            this.field18995[i] = class8157.method26940(4);
        }
        for (int j = 0; j < this.field18983; ++j) {
            this.field18996[j] = class8157.method26940(4);
        }
        for (int k = 0; k < this.field18984; ++k) {
            this.field18997[k] = new Class7204(class8157.method26942(), class8157.method26940(4));
        }
        class8157.method26935();
        final int method26940 = class8157.method26940(8);
        this.field18998 = new byte[method26940];
        for (int l = 0; l < method26940; ++l) {
            this.field18998[l] = (byte)class8157.method26940(8);
        }
    }
    
    private void method12673(final Class8884[] array, final Class8157 class8157, final int n) throws AACException {
        for (int i = 0; i < n; ++i) {
            array[i] = new Class8884(class8157.method26942(), class8157.method26940(4));
        }
    }
    
    public Class2002 method12674() {
        return this.field18977;
    }
    
    public Class2077 method12675() {
        return this.field18978;
    }
    
    public int method12676() {
        return this.field18979 + this.field18980 + this.field18981 + this.field18982 + this.field18983;
    }
}
