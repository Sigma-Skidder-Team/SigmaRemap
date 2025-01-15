// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public final class Class3096 extends Class3090
{
    private static String[] field15465;
    public static final Class8575 field15466;
    
    public Class3096() {
        super(new Class8927().method31462(Class6032.field24561, Class6032.field24541).method31464(Class2145.field12630).method31465(Class2140.field12596).method31466(-1.0f).method31467(0.1f).method31468(0.0f).method31469(0.5f).method31470(3750089).method31471(329011).method31472(null));
        this.method9852(Class4535.field19968.method13527(new Class5130(Class1957.field10667, 0.3f, 0.9f)));
        this.method9852(Class4535.field19959.method13527(new Class5132(0.004, Class1964.field10718)));
        this.method9852(Class4535.field19964.method13527(new Class5125(false)));
        Class9218.method33933(this);
        Class9218.method33934(this);
        Class9218.method33935(this);
        Class9218.method33997(this);
        Class9218.method33937(this);
        Class9218.method33998(this);
        Class9218.method33938(this);
        Class9218.method33939(this);
        Class9218.method33943(this);
        Class9218.method33952(this);
        Class9218.method33978(this);
        Class9218.method33980(this);
        Class9218.method33983(this);
        Class9218.method33984(this);
        Class9218.method33996(this);
        Class9218.method33999(this);
        this.method9839(Class1976.field10951, new Class6828(EntityType.field29031, 1, 1, 4));
        this.method9839(Class1976.field10951, new Class6828(EntityType.field29018, 15, 1, 5));
        this.method9839(Class1976.field10949, new Class6828(EntityType.field29015, 1, 1, 2));
        this.method9839(Class1976.field10950, new Class6828(EntityType.field28960, 10, 8, 8));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29030, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29052, 95, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field28973, 5, 1, 1));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29054, 5, 1, 1));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29023, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field28969, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29025, 100, 4, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field28977, 10, 1, 4));
        this.method9839(Class1976.field10948, new Class6828(EntityType.field29047, 5, 1, 1));
    }
    
    @Override
    public float method9844(final BlockPos class354) {
        float method9867 = this.method9867();
        if (Class3096.field15466.method29027(class354.getX() * 0.05, class354.getZ() * 0.05, false) * 7.0 + Class3096.field15442.method29027(class354.getX() * 0.2, class354.getZ() * 0.2, false) < 0.3) {
            if (Class3096.field15442.method29027(class354.getX() * 0.09, class354.getZ() * 0.09, false) < 0.8) {
                method9867 = 0.2f;
            }
        }
        if (class354.getY() <= 64) {
            return method9867;
        }
        return method9867 - ((float)(Class3096.field15441.method29027(class354.getX() / 8.0f, class354.getZ() / 8.0f, false) * 4.0) + class354.getY() - 64.0f) * 0.05f / 30.0f;
    }
    
    static {
        field15466 = new Class8575(new Class2317(3456L), 2, 0);
    }
}
