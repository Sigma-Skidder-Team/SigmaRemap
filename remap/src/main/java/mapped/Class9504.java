// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9504
{
    private static String[] field40885;
    private final Class8683 field40886;
    private final Class8683 field40887;
    private final Class8172 field40888;
    private Boolean field40889;
    private Class9089 field40890;
    
    public Class9504() {
        this.field40886 = Class8683.field36492;
        this.field40887 = Class8683.field36492;
        this.field40888 = Class8172.field33663;
        this.field40890 = Class9089.field38484;
    }
    
    public static Class9504 method35394() {
        return new Class9504();
    }
    
    public Class9504 method35395(final Boolean field40889) {
        this.field40889 = field40889;
        return this;
    }
    
    public Class9504 method35396(final Class8135 class8135) {
        this.field40890 = class8135.method26815();
        return this;
    }
    
    public Class8439 method35397() {
        return new Class8439(this.field40886, this.field40887, this.field40888, this.field40889, this.field40890);
    }
}
