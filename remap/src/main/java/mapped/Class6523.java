// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6523
{
    private static String[] field25963;
    public static final Class6523 field25964;
    public int field25965;
    public int field25966;
    public int field25967;
    public int field25968;
    public Class2056 field25969;
    public Class2056 field25970;
    
    public Class6523(final int n) {
        this(n, Class6430.method19121(n, 0.05f));
    }
    
    public Class6523(final int n, final int n2) {
        this(n, n2, Class265.field1273.field1292);
    }
    
    public Class6523(final int n, final int n2, final int n3) {
        this(n, n2, n3, Class265.field1278.field1292);
    }
    
    public Class6523(final int n, final int n2, final int n3, final int n4) {
        this(n, n2, n3, n4, Class2056.field11738, Class2056.field11738);
    }
    
    public Class6523(final int field25965, final int field25966, final int field25967, final int field25968, final Class2056 field25969, final Class2056 field25970) {
        this.field25965 = field25965;
        this.field25966 = field25966;
        this.field25967 = field25967;
        this.field25968 = field25968;
        this.field25969 = field25969;
        this.field25970 = field25970;
    }
    
    public Class6523(final Class6523 class6523) {
        this(class6523.field25965, class6523.field25966, class6523.field25967, class6523.field25968, class6523.field25969, class6523.field25970);
    }
    
    public int method19727() {
        return this.field25966;
    }
    
    public Class6523 method19728(final int field25966) {
        this.field25966 = field25966;
        return this;
    }
    
    public int method19729() {
        return this.field25965;
    }
    
    public Class6523 method19730(final int field25965) {
        this.field25965 = field25965;
        return this;
    }
    
    public int method19731() {
        return this.field25967;
    }
    
    public Class6523 method19732(final int field25967) {
        this.field25967 = field25967;
        return this;
    }
    
    public int method19733() {
        return this.field25968;
    }
    
    public Class6523 method19734(final int field25968) {
        this.field25968 = field25968;
        return this;
    }
    
    public Class2056 method19735() {
        return this.field25969;
    }
    
    public Class6523 method19736(final Class2056 field25969) {
        this.field25969 = field25969;
        return this;
    }
    
    public Class2056 method19737() {
        return this.field25970;
    }
    
    public Class6523 method19738(final Class2056 field25970) {
        this.field25970 = field25970;
        return this;
    }
    
    public Class6523 method19739() {
        return new Class6523(this.field25965, this.field25966, this.field25967, this.field25968, this.field25969, this.field25970);
    }
    
    static {
        field25964 = new Class6523(-12871171);
    }
}
