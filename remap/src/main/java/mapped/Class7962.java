// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Random;

public class Class7962 implements Class7954
{
    private final int field32718;
    private final String field32719;
    private final Class2095 field32720;
    private final int field32721;
    private final int field32722;
    
    public Class7962(final int field32718, final String field32719, final Class2095 field32720, final int field32721, final int field32722) {
        this.field32718 = field32718;
        this.field32719 = field32719;
        this.field32720 = field32720;
        this.field32721 = field32721;
        this.field32722 = field32722;
    }
    
    @Nullable
    @Override
    public Class9017 method25804(final Entity class399, final Random random) {
        if (!(class399.field2391 instanceof Class1849)) {
            return null;
        }
        final Class1849 class400 = (Class1849)class399.field2391;
        final BlockPos method6915 = class400.method6915(this.field32719, new BlockPos(class399), 100, true);
        if (method6915 == null) {
            return null;
        }
        final Class8321 method6916 = Class4094.method12326(class400, method6915.getX(), method6915.getZ(), (byte)2, true, true);
        Class4094.method12335(class400, method6916);
        Class6356.method18917(method6916, method6915, "+", this.field32720);
        method6916.method27665(new Class2259("filled_map." + this.field32719.toLowerCase(Locale.ROOT), new Object[0]));
        return new Class9017(new Class8321(Class7739.field31514, this.field32718), new Class8321(Class7739.field31375), method6916, this.field32721, this.field32722, 0.2f);
    }
}
