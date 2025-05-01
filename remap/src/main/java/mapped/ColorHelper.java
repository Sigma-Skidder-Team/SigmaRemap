// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class ColorHelper
{
    private static String[] field25963;
    public static final ColorHelper field25964;
    public int field25965;
    public int field25966;
    public int field25967;
    public int field25968;
    public Class2056 field25969;
    public Class2056 field25970;
    
    public ColorHelper(final int n) {
        this(n, AllUtils.method19121(n, 0.05f));
    }
    
    public ColorHelper(final int n, final int n2) {
        this(n, n2, ClientColors.DEEP_TEAL.color);
    }
    
    public ColorHelper(final int n, final int n2, final int n3) {
        this(n, n2, n3, ClientColors.LIGHT_GREYISH_BLUE.color);
    }
    
    public ColorHelper(final int n, final int n2, final int n3, final int n4) {
        this(n, n2, n3, n4, Class2056.field11738, Class2056.field11738);
    }
    
    public ColorHelper(final int field25965, final int field25966, final int field25967, final int field25968, final Class2056 field25969, final Class2056 field25970) {
        this.field25965 = field25965;
        this.field25966 = field25966;
        this.field25967 = field25967;
        this.field25968 = field25968;
        this.field25969 = field25969;
        this.field25970 = field25970;
    }
    
    public ColorHelper(final ColorHelper colorHelper) {
        this(colorHelper.field25965, colorHelper.field25966, colorHelper.field25967, colorHelper.field25968, colorHelper.field25969, colorHelper.field25970);
    }
    
    public int method19727() {
        return this.field25966;
    }
    
    public ColorHelper method19728(final int field25966) {
        this.field25966 = field25966;
        return this;
    }
    
    public int method19729() {
        return this.field25965;
    }
    
    public ColorHelper method19730(final int field25965) {
        this.field25965 = field25965;
        return this;
    }
    
    public int method19731() {
        return this.field25967;
    }
    
    public ColorHelper method19732(final int field25967) {
        this.field25967 = field25967;
        return this;
    }
    
    public int method19733() {
        return this.field25968;
    }
    
    public ColorHelper method19734(final int field25968) {
        this.field25968 = field25968;
        return this;
    }
    
    public Class2056 method19735() {
        return this.field25969;
    }
    
    public ColorHelper method19736(final Class2056 field25969) {
        this.field25969 = field25969;
        return this;
    }
    
    public Class2056 method19737() {
        return this.field25970;
    }
    
    public ColorHelper method19738(final Class2056 field25970) {
        this.field25970 = field25970;
        return this;
    }
    
    public ColorHelper method19739() {
        return new ColorHelper(this.field25965, this.field25966, this.field25967, this.field25968, this.field25969, this.field25970);
    }
    
    static {
        field25964 = new ColorHelper(-12871171);
    }
}
