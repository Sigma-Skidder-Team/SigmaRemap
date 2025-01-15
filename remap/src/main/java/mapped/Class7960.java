// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.util.Random;

public class Class7960 implements Class7954
{
    private static String[] field32702;
    private final Class8321 field32703;
    private final int field32704;
    private final int field32705;
    private final Class8321 field32706;
    private final int field32707;
    private final int field32708;
    private final int field32709;
    private final float field32710;
    
    public Class7960(final Class3832 class3832, final int n, final Class3820 class3833, final int n2, final int n3, final int n4) {
        this(class3832, n, 1, class3833, n2, n3, n4);
    }
    
    public Class7960(final Class3832 class3832, final int field32704, final int field32705, final Class3820 class3833, final int field32706, final int field32707, final int field32708) {
        this.field32703 = new Class8321(class3832);
        this.field32704 = field32704;
        this.field32705 = field32705;
        this.field32706 = new Class8321(class3833);
        this.field32707 = field32706;
        this.field32708 = field32707;
        this.field32709 = field32708;
        this.field32710 = 0.05f;
    }
    
    @Nullable
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        return new Class9017(new Class8321(Class7739.field31514, this.field32705), new Class8321(this.field32703.method27622(), this.field32704), new Class8321(this.field32706.method27622(), this.field32707), this.field32708, this.field32709, this.field32710);
    }
}
