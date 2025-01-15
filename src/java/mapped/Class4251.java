// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4251 implements Class4252<Class5813>
{
    private static String[] field19076;
    private double field19077;
    private double field19078;
    private double field19079;
    private float field19080;
    private float field19081;
    
    public Class4251() {
    }
    
    public Class4251(final Class399 class399) {
        this.field19077 = class399.method1938();
        this.field19078 = class399.method1941();
        this.field19079 = class399.method1945();
        this.field19080 = class399.field2399;
        this.field19081 = class399.field2400;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19077 = class8654.readDouble();
        this.field19078 = class8654.readDouble();
        this.field19079 = class8654.readDouble();
        this.field19080 = class8654.readFloat();
        this.field19081 = class8654.readFloat();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeDouble(this.field19077);
        class8654.writeDouble(this.field19078);
        class8654.writeDouble(this.field19079);
        class8654.writeFloat(this.field19080);
        class8654.writeFloat(this.field19081);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17442(this);
    }
    
    public double method12757() {
        return this.field19077;
    }
    
    public double method12758() {
        return this.field19078;
    }
    
    public double method12759() {
        return this.field19079;
    }
    
    public float method12760() {
        return this.field19080;
    }
    
    public float method12761() {
        return this.field19081;
    }
}
