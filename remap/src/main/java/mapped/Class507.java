// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.UUID;

public class Class507 extends Entity
{
    private int field2891;
    private boolean field2892;
    private int field2893;
    private boolean field2894;
    private Class511 field2895;
    private UUID field2896;
    
    public Class507(final Class7499<? extends Class507> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2893 = 22;
    }
    
    public Class507(final Class1847 class1847, final double n, final double n2, final double n3, final float n4, final int field2891, final Class511 class1848) {
        this(Class7499.field28979, class1847);
        this.field2891 = field2891;
        this.method2600(class1848);
        this.field2399 = n4 * 57.295776f;
        this.method1656(n, n2, n3);
    }
    
    @Override
    public void method1649() {
    }
    
    public void method2600(final Class511 field2895) {
        this.field2895 = field2895;
        this.field2896 = ((field2895 != null) ? field2895.method1865() : null);
    }
    
    @Nullable
    public Class511 method2601() {
        if (this.field2895 == null) {
            if (this.field2896 != null) {
                if (this.field2391 instanceof Class1849) {
                    final Entity method6914 = ((Class1849)this.field2391).method6914(this.field2896);
                    if (method6914 instanceof Class511) {
                        this.field2895 = (Class511)method6914;
                    }
                }
            }
        }
        return this.field2895;
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2891 = class51.method319("Warmup");
        if (class51.method302("OwnerUUID")) {
            this.field2896 = class51.method301("OwnerUUID");
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method298("Warmup", this.field2891);
        if (this.field2896 != null) {
            class51.method300("OwnerUUID", this.field2896);
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.field2391.field10067) {
            if (--this.field2891 < 0) {
                if (this.field2891 == -8) {
                    final Iterator<Class511> iterator = this.field2391.method7128((Class<? extends Class511>)Class511.class, this.method1886().method18495(0.2, 0.0, 0.2)).iterator();
                    while (iterator.hasNext()) {
                        this.method2602(iterator.next());
                    }
                }
                if (!this.field2892) {
                    this.field2391.method6761(this, (byte)4);
                    this.field2892 = true;
                }
                if (--this.field2893 < 0) {
                    this.method1652();
                }
            }
        }
        else if (this.field2894) {
            --this.field2893;
            if (this.field2893 == 14) {
                for (int i = 0; i < 12; ++i) {
                    this.field2391.method6709(Class8432.field34603, this.getPosX() + (this.field2423.nextDouble() * 2.0 - 1.0) * this.method1930() * 0.5, this.getPosY() + 0.05 + this.field2423.nextDouble() + 1.0, this.getPosZ() + (this.field2423.nextDouble() * 2.0 - 1.0) * this.method1930() * 0.5, (this.field2423.nextDouble() * 2.0 - 1.0) * 0.3, 0.3 + this.field2423.nextDouble() * 0.3, (this.field2423.nextDouble() * 2.0 - 1.0) * 0.3);
                }
            }
        }
    }
    
    private void method2602(final Class511 class511) {
        final Class511 method2601 = this.method2601();
        if (class511.method1768()) {
            if (!class511.method1850()) {
                if (class511 != method2601) {
                    if (method2601 != null) {
                        if (method2601.method1826(class511)) {
                            return;
                        }
                        class511.method1740(Class7929.method25700(this, method2601), 6.0f);
                    }
                    else {
                        class511.method1740(Class7929.field32576, 6.0f);
                    }
                }
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        super.method1798(b);
        if (b == 4) {
            this.field2894 = true;
            if (!this.method1696()) {
                this.field2391.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35180, this.method1922(), 1.0f, this.field2423.nextFloat() * 0.2f + 0.85f, false);
            }
        }
    }
    
    public float method2603(final float n) {
        if (this.field2894) {
            final int n2 = this.field2893 - 2;
            return (n2 > 0) ? (1.0f - (n2 - n) / 20.0f) : 1.0f;
        }
        return 0.0f;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
}
