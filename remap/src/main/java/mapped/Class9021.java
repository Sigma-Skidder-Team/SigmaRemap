// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9021
{
    private static String[] field38134;
    private Block field38135;
    private Class7909<Block> field38136;
    private final Class9357 field38137;
    private final Class7103 field38138;
    
    private Class9021() {
        this.field38137 = Class9357.field40141;
        this.field38138 = Class7103.field27707;
    }
    
    public static Class9021 method32318() {
        return new Class9021();
    }
    
    public Class9021 method32319(final Class7909<Block> field38136) {
        this.field38136 = field38136;
        return this;
    }
    
    public Class7854 method32320() {
        return new Class7854(this.field38136, this.field38135, this.field38137, this.field38138);
    }
}
