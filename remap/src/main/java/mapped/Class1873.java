// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1873 implements Class1867
{
    private static final Logger field10207;
    private static final int field10208;
    private static final int field10209;
    public static final int field10210;
    public static final int field10211;
    public static final int field10212;
    private final Class3090[] field10213;
    
    public Class1873(final Class3090[] field10213) {
        this.field10213 = field10213;
    }
    
    private Class1873() {
        this(new Class3090[Class1873.field10210]);
    }
    
    public Class1873(final PacketBuffer class8654) {
        this();
        for (int i = 0; i < this.field10213.length; ++i) {
            final int int1 = class8654.readInt();
            final Class3090 class8655 = Registry.field217.method499(int1);
            if (class8655 != null) {
                this.field10213[i] = class8655;
            }
            else {
                Class1873.field10207.warn("Received invalid biome id: " + int1);
                this.field10213[i] = Class7102.field27633;
            }
        }
    }
    
    public Class1873(final Class7859 class7859, final Class1868 class7860) {
        this();
        final int n = class7859.method25426() >> 2;
        final int n2 = class7859.method25427() >> 2;
        for (int i = 0; i < this.field10213.length; ++i) {
            this.field10213[i] = class7860.method6960(n + (i & Class1873.field10211), i >> Class1873.field10208 + Class1873.field10208 & Class1873.field10212, n2 + (i >> Class1873.field10208 & Class1873.field10211));
        }
    }
    
    public Class1873(final Class7859 class7859, final Class1868 class7860, final int[] array) {
        this();
        final int n = class7859.method25426() >> 2;
        final int n2 = class7859.method25427() >> 2;
        if (array == null) {
            for (int i = 0; i < this.field10213.length; ++i) {
                this.field10213[i] = class7860.method6960(n + (i & Class1873.field10211), i >> Class1873.field10208 + Class1873.field10208 & Class1873.field10212, n2 + (i >> Class1873.field10208 & Class1873.field10211));
            }
        }
        else {
            for (int j = 0; j < array.length; ++j) {
                this.field10213[j] = (Class3090) Registry.field217.method499(array[j]);
                if (this.field10213[j] == null) {
                    this.field10213[j] = class7860.method6960(n + (j & Class1873.field10211), j >> Class1873.field10208 + Class1873.field10208 & Class1873.field10212, n2 + (j >> Class1873.field10208 & Class1873.field10211));
                }
            }
        }
    }
    
    public int[] method7125() {
        final int[] array = new int[this.field10213.length];
        for (int i = 0; i < this.field10213.length; ++i) {
            array[i] = Registry.field217.getId(this.field10213[i]);
        }
        return array;
    }
    
    public void method7126(final PacketBuffer class8654) {
        final Class3090[] field10213 = this.field10213;
        for (int length = field10213.length, i = 0; i < length; ++i) {
            class8654.writeInt(Registry.field217.getId(field10213[i]));
        }
    }
    
    public Class1873 clone() {
        return new Class1873(this.field10213.clone());
    }
    
    @Override
    public Class3090 method6960(final int n, final int n2, final int n3) {
        return this.field10213[MathHelper.method35651(n2, 0, Class1873.field10212) << Class1873.field10208 + Class1873.field10208 | (n3 & Class1873.field10211) << Class1873.field10208 | (n & Class1873.field10211)];
    }
    
    static {
        field10207 = LogManager.getLogger();
        field10208 = (int)Math.round(Math.log(16.0) / Math.log(2.0)) - 2;
        field10209 = (int)Math.round(Math.log(256.0) / Math.log(2.0)) - 2;
        field10210 = 1 << Class1873.field10208 + Class1873.field10208 + Class1873.field10209;
        field10211 = (1 << Class1873.field10208) - 1;
        field10212 = (1 << Class1873.field10209) - 1;
    }
}
