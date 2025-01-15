// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2192
{
    field13330(Class179.field511), 
    field13331(Class179.field512), 
    field13332(Class179.field513), 
    field13333(Class179.field514), 
    field13334(Class179.field515), 
    field13335(Class179.field516), 
    field13336(Class179.field513, Class179.field515), 
    field13337(Class179.field513, Class179.field516), 
    field13338(Class179.field514, Class179.field515), 
    field13339(Class179.field514, Class179.field516), 
    field13340(Class179.field511, Class179.field513), 
    field13341(Class179.field511, Class179.field514), 
    field13342(Class179.field512, Class179.field513), 
    field13343(Class179.field512, Class179.field514), 
    field13344(Class179.field511, Class179.field515), 
    field13345(Class179.field511, Class179.field516), 
    field13346(Class179.field512, Class179.field515), 
    field13347(Class179.field512, Class179.field516);
    
    private Class179 field13348;
    private Class179 field13349;
    
    private Class2192(final Class179 field13348) {
        this.field13348 = field13348;
    }
    
    private Class2192(final Class179 field13348, final Class179 field13349) {
        this.field13348 = field13348;
        this.field13349 = field13349;
    }
    
    public Class179 method8362() {
        return this.field13348;
    }
    
    public Class179 method8363() {
        return this.field13349;
    }
    
    public Class354 method8364(Class354 class354) {
        class354 = class354.method1150(this.field13348, 1);
        if (this.field13349 != null) {
            class354 = class354.method1150(this.field13349, 1);
        }
        return class354;
    }
    
    public int method8365() {
        int method785 = this.field13348.method785();
        if (this.field13349 != null) {
            method785 += this.field13349.method785();
        }
        return method785;
    }
    
    public int method8366() {
        int method786 = this.field13348.method786();
        if (this.field13349 != null) {
            method786 += this.field13349.method786();
        }
        return method786;
    }
    
    public int method8367() {
        int method787 = this.field13348.method787();
        if (this.field13349 != null) {
            method787 += this.field13349.method787();
        }
        return method787;
    }
    
    public boolean method8368() {
        return this.field13349 != null;
    }
}
