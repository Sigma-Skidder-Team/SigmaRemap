// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4375 implements Class4252<Class5800>
{
    private static String[] field19584;
    private int field19585;
    private double field19586;
    private double field19587;
    private double field19588;
    private int field19589;
    
    public Class4375() {
    }
    
    public Class4375(final Class508 class508) {
        this.field19585 = class508.method1643();
        this.field19586 = class508.method1938();
        this.field19587 = class508.method1941();
        this.field19588 = class508.method1945();
        this.field19589 = class508.method2607();
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19585 = class8654.method29501();
        this.field19586 = class8654.readDouble();
        this.field19587 = class8654.readDouble();
        this.field19588 = class8654.readDouble();
        this.field19589 = class8654.readShort();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19585);
        class8654.writeDouble(this.field19586);
        class8654.writeDouble(this.field19587);
        class8654.writeDouble(this.field19588);
        class8654.writeShort(this.field19589);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17274(this);
    }
    
    public int method13153() {
        return this.field19585;
    }
    
    public double method13154() {
        return this.field19586;
    }
    
    public double method13155() {
        return this.field19587;
    }
    
    public double method13156() {
        return this.field19588;
    }
    
    public int method13157() {
        return this.field19589;
    }
}
