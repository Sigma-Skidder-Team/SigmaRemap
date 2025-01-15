// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4263 implements Class4252<Class5800>
{
    private static String[] field19125;
    private double field19126;
    private double field19127;
    private double field19128;
    private float field19129;
    private float field19130;
    
    public Class4263() {
    }
    
    public Class4263(final Class399 class399) {
        this.field19126 = class399.method1938();
        this.field19127 = class399.method1941();
        this.field19128 = class399.method1945();
        this.field19129 = class399.field2399;
        this.field19130 = class399.field2400;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19126 = class8654.readDouble();
        this.field19127 = class8654.readDouble();
        this.field19128 = class8654.readDouble();
        this.field19129 = class8654.readFloat();
        this.field19130 = class8654.readFloat();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeDouble(this.field19126);
        class8654.writeDouble(this.field19127);
        class8654.writeDouble(this.field19128);
        class8654.writeFloat(this.field19129);
        class8654.writeFloat(this.field19130);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17353(this);
    }
    
    public double method12794() {
        return this.field19126;
    }
    
    public double method12795() {
        return this.field19127;
    }
    
    public double method12796() {
        return this.field19128;
    }
    
    public float method12797() {
        return this.field19129;
    }
    
    public float method12798() {
        return this.field19130;
    }
}
