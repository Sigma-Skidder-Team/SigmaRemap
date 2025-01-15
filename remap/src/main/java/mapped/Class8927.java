// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8927
{
    private Class8314<?> field37518;
    private Class2145 field37519;
    private Class2140 field37520;
    private Float field37521;
    private Float field37522;
    private Float field37523;
    private Float field37524;
    private Integer field37525;
    private Integer field37526;
    private String field37527;
    
    public <SC extends Class4407> Class8927 method31462(final Class6032<SC> class6032, final SC sc) {
        this.field37518 = new Class8314<Object>(class6032, sc);
        return this;
    }
    
    public Class8927 method31463(final Class8314<?> field37518) {
        this.field37518 = field37518;
        return this;
    }
    
    public Class8927 method31464(final Class2145 field37519) {
        this.field37519 = field37519;
        return this;
    }
    
    public Class8927 method31465(final Class2140 field37520) {
        this.field37520 = field37520;
        return this;
    }
    
    public Class8927 method31466(final float f) {
        this.field37521 = f;
        return this;
    }
    
    public Class8927 method31467(final float f) {
        this.field37522 = f;
        return this;
    }
    
    public Class8927 method31468(final float f) {
        this.field37523 = f;
        return this;
    }
    
    public Class8927 method31469(final float f) {
        this.field37524 = f;
        return this;
    }
    
    public Class8927 method31470(final int i) {
        this.field37525 = i;
        return this;
    }
    
    public Class8927 method31471(final int i) {
        this.field37526 = i;
        return this;
    }
    
    public Class8927 method31472(final String field37527) {
        this.field37527 = field37527;
        return this;
    }
    
    @Override
    public String toString() {
        return "BiomeBuilder{\nsurfaceBuilder=" + this.field37518 + ",\nprecipitation=" + this.field37519 + ",\nbiomeCategory=" + this.field37520 + ",\ndepth=" + this.field37521 + ",\nscale=" + this.field37522 + ",\ntemperature=" + this.field37523 + ",\ndownfall=" + this.field37524 + ",\nwaterColor=" + this.field37525 + ",\nwaterFogColor=" + this.field37526 + ",\nparent='" + this.field37527 + '\'' + "\n" + '}';
    }
}
