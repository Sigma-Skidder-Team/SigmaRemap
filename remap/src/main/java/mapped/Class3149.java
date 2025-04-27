// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public final class Class3149 extends Biome
{
    public Class3149() {
        super(new Class8927().method31462(Class6032.field24557, Class6032.field24541).method31464(Class2145.field12629).method31465(Class2140.field12599).method31466(-0.1f).method31467(0.3f).method31468(0.8f).method31469(0.9f).method31470(6388580).method31471(2302743).method31472("swamp"));
        this.method9852(Class4535.field19959.method13527(new Class5132(0.004, Class1964.field10718)));
        Class9218.method33932(this);
        Class9218.method33934(this);
        Class9218.method33935(this);
        Class9218.method33937(this);
        Class9218.method33938(this);
        Class9218.method33939(this);
        Class9218.method33944(this);
        Class9218.method33973(this);
        Class9218.method33983(this);
        Class9218.method33988(this);
        Class9218.method33996(this);
        Class9218.method33990(this);
        Class9218.method33999(this);
        this.method9839(Class1976.field10949, new Class6828(EntityType.field29019, 12, 4, 4));
        this.method9839(Class1976.field10949, new Class6828(EntityType.field29012, 10, 4, 4));
        this.method9839(Class1976.field10949, new Class6828(EntityType.field28966, 10, 4, 4));
        this.method9839(Class1976.field10949, new Class6828(EntityType.field28968, 8, 4, 4));
        this.method9839(Class1976.field10950, new Class6828(EntityType.field28960, 10, 8, 8));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29030, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29052, 95, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29054, 5, 1, 1));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29023, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field28969, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29025, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field28977, 10, 1, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29047, 5, 1, 1));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29025, 1, 1, 1));
    }
    
    @Override
    public int method9858(final double n, final double n2) {
        return (Class3149.field15442.method29027(n * 0.0225, n2 * 0.0225, false) >= -0.1) ? 6975545 : 5011004;
    }
    
    @Override
    public int method9859() {
        return 6975545;
    }
}
