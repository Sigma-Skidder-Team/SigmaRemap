// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4117 implements Class4114
{
    private int field18232;
    private String field18233;
    private Class1666 field18234;
    
    public Class4117(final int field18232, final String field18233, final Class1666 field18234) {
        this.field18232 = -1;
        this.field18233 = null;
        this.field18234 = null;
        this.field18232 = field18232;
        this.field18233 = field18233;
        this.field18234 = field18234;
    }
    
    @Override
    public int method12363() {
        return this.field18232;
    }
    
    public String method12366() {
        return this.field18233;
    }
    
    public Class1666 method12367() {
        return this.field18234;
    }
    
    @Override
    public int method12362() {
        return this.field18234.method5869();
    }
    
    @Override
    public void method12358() {
        Class8995.method32102(this.field18234.method5869());
    }
    
    @Override
    public String toString() {
        return "textureUnit: " + this.field18232 + ", path: " + this.field18233 + ", glTextureId: " + this.method12362();
    }
}
