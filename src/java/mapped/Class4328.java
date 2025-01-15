// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Set;

public class Class4328 implements Class4252<Class5800>
{
    private static String[] field19376;
    public double field19377;
    public double field19378;
    public double field19379;
    public float field19380;
    public float field19381;
    private Set<Class2143> field19382;
    private int field19383;
    
    public Class4328() {
    }
    
    public Class4328(final double field19377, final double field19378, final double field19379, final float field19380, final float field19381, final Set<Class2143> field19382, final int field19383) {
        this.field19377 = field19377;
        this.field19378 = field19378;
        this.field19379 = field19379;
        this.field19380 = field19380;
        this.field19381 = field19381;
        this.field19382 = field19382;
        this.field19383 = field19383;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19377 = class8654.readDouble();
        this.field19378 = class8654.readDouble();
        this.field19379 = class8654.readDouble();
        this.field19380 = class8654.readFloat();
        this.field19381 = class8654.readFloat();
        this.field19382 = Class2143.method8307(class8654.readUnsignedByte());
        this.field19383 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeDouble(this.field19377);
        class8654.writeDouble(this.field19378);
        class8654.writeDouble(this.field19379);
        class8654.writeFloat(this.field19380);
        class8654.writeFloat(this.field19381);
        class8654.writeByte(Class2143.method8308(this.field19382));
        class8654.method29505(this.field19383);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17285(this);
    }
    
    public double method12992() {
        return this.field19377;
    }
    
    public double method12993() {
        return this.field19378;
    }
    
    public double method12994() {
        return this.field19379;
    }
    
    public float method12995() {
        return this.field19380;
    }
    
    public float method12996() {
        return this.field19381;
    }
    
    public int method12997() {
        return this.field19383;
    }
    
    public Set<Class2143> method12998() {
        return this.field19382;
    }
}
