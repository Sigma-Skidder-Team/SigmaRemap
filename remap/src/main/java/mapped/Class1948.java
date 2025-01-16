// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.Logger;

public class Class1948 implements Comparable<Class1948>
{
    private static final Logger field10606;
    private final Class5328 field10607;
    private int field10608;
    private int field10609;
    private boolean field10610;
    private boolean field10611;
    private boolean field10612;
    private boolean field10613;
    private boolean field10614;
    private Class1948 field10615;
    
    public Class1948(final Class5328 class5328) {
        this(class5328, 0, 0);
    }
    
    public Class1948(final Class5328 class5328, final int n) {
        this(class5328, n, 0);
    }
    
    public Class1948(final Class5328 class5328, final int n, final int n2) {
        this(class5328, n, n2, false, true);
    }
    
    public Class1948(final Class5328 class5328, final int n, final int n2, final boolean b, final boolean b2) {
        this(class5328, n, n2, b, b2, b2);
    }
    
    public Class1948(final Class5328 class5328, final int n, final int n2, final boolean b, final boolean b2, final boolean b3) {
        this(class5328, n, n2, b, b2, b3, null);
    }
    
    public Class1948(final Class5328 field10607, final int field10608, final int field10609, final boolean field10610, final boolean field10611, final boolean field10612, final Class1948 field10613) {
        this.field10607 = field10607;
        this.field10608 = field10608;
        this.field10609 = field10609;
        this.field10611 = field10610;
        this.field10613 = field10611;
        this.field10614 = field10612;
        this.field10615 = field10613;
    }
    
    public Class1948(final Class1948 class1948) {
        this.field10607 = class1948.field10607;
        this.method7904(class1948);
    }
    
    public void method7904(final Class1948 class1948) {
        this.field10608 = class1948.field10608;
        this.field10609 = class1948.field10609;
        this.field10611 = class1948.field10611;
        this.field10613 = class1948.field10613;
        this.field10614 = class1948.field10614;
    }
    
    public boolean method7905(final Class1948 class1948) {
        if (this.field10607 != class1948.field10607) {
            Class1948.field10606.warn("This method should only be called for matching effects!");
        }
        boolean b = false;
        if (class1948.field10609 <= this.field10609) {
            if (class1948.field10608 > this.field10608) {
                if (class1948.field10609 != this.field10609) {
                    if (this.field10615 != null) {
                        this.field10615.method7905(class1948);
                    }
                    else {
                        this.field10615 = new Class1948(class1948);
                    }
                }
                else {
                    this.field10608 = class1948.field10608;
                    b = true;
                }
            }
        }
        else {
            if (class1948.field10608 < this.field10608) {
                final Class1948 field10615 = this.field10615;
                this.field10615 = new Class1948(this);
                this.field10615.field10615 = field10615;
            }
            this.field10609 = class1948.field10609;
            this.field10608 = class1948.field10608;
            b = true;
        }
        if ((!class1948.field10611 && this.field10611) || b) {
            this.field10611 = class1948.field10611;
            b = true;
        }
        if (class1948.field10613 != this.field10613) {
            this.field10613 = class1948.field10613;
            b = true;
        }
        if (class1948.field10614 != this.field10614) {
            this.field10614 = class1948.field10614;
            b = true;
        }
        return b;
    }
    
    public Class5328 method7906() {
        return this.field10607;
    }
    
    public int method7907() {
        return this.field10608;
    }
    
    public int method7908() {
        return this.field10609;
    }
    
    public boolean method7909() {
        return this.field10611;
    }
    
    public boolean method7910() {
        return this.field10613;
    }
    
    public boolean method7911() {
        return this.field10614;
    }
    
    public boolean method7912(final LivingEntity class511, final Runnable runnable) {
        if (this.field10608 > 0) {
            if (this.field10607.method16448(this.field10608, this.field10609)) {
                this.method7914(class511);
            }
            this.method7913();
            if (this.field10608 == 0) {
                if (this.field10615 != null) {
                    this.method7904(this.field10615);
                    this.field10615 = this.field10615.field10615;
                    runnable.run();
                }
            }
        }
        return this.field10608 > 0;
    }
    
    private int method7913() {
        if (this.field10615 != null) {
            this.field10615.method7913();
        }
        return --this.field10608;
    }
    
    public void method7914(final LivingEntity class511) {
        if (this.field10608 > 0) {
            this.field10607.method16449(class511, this.field10609);
        }
    }
    
    public String method7915() {
        return this.field10607.method16455();
    }
    
    @Override
    public String toString() {
        String str;
        if (this.field10609 <= 0) {
            str = this.method7915() + ", Duration: " + this.field10608;
        }
        else {
            str = this.method7915() + " x " + (this.field10609 + 1) + ", Duration: " + this.field10608;
        }
        if (this.field10610) {
            str += ", Splash: true";
        }
        if (!this.field10613) {
            str += ", Particles: false";
        }
        if (!this.field10614) {
            str += ", Show Icon: false";
        }
        return str;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class1948) {
            final Class1948 class1948 = (Class1948)o;
            if (this.field10608 == class1948.field10608) {
                if (this.field10609 == class1948.field10609) {
                    if (this.field10610 == class1948.field10610) {
                        if (this.field10611 == class1948.field10611) {
                            if (this.field10607.equals(class1948.field10607)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * this.field10607.hashCode() + this.field10608) + this.field10609) + (this.field10610 ? 1 : 0)) + (this.field10611 ? 1 : 0);
    }
    
    public CompoundNBT method7916(final CompoundNBT class51) {
        class51.putByte("Id", (byte)Class5328.method16451(this.method7906()));
        this.method7917(class51);
        return class51;
    }
    
    private void method7917(final CompoundNBT class51) {
        class51.putByte("Amplifier", (byte)this.method7908());
        class51.putInt("Duration", this.method7907());
        class51.putBoolean("Ambient", this.method7909());
        class51.putBoolean("ShowParticles", this.method7910());
        class51.putBoolean("ShowIcon", this.method7911());
        if (this.field10615 != null) {
            final CompoundNBT class52 = new CompoundNBT();
            this.field10615.method7916(class52);
            class51.put("HiddenEffect", class52);
        }
    }
    
    public static Class1948 method7918(final CompoundNBT class51) {
        final Class5328 method16450 = Class5328.method16450(class51.getByte("Id"));
        return (method16450 != null) ? method7919(method16450, class51) : null;
    }
    
    private static Class1948 method7919(final Class5328 class5328, final CompoundNBT class5329) {
        final byte method317 = class5329.getByte("Amplifier");
        final int method318 = class5329.getInt("Duration");
        final boolean method319 = class5329.getBoolean("Ambient");
        int method320 = 1;
        if (class5329.contains("ShowParticles", 1)) {
            method320 = (class5329.getBoolean("ShowParticles") ? 1 : 0);
        }
        int method321 = method320;
        if (class5329.contains("ShowIcon", 1)) {
            method321 = (class5329.getBoolean("ShowIcon") ? 1 : 0);
        }
        Class1948 method322 = null;
        if (class5329.contains("HiddenEffect", 10)) {
            method322 = method7919(class5328, class5329.getCompound("HiddenEffect"));
        }
        return new Class1948(class5328, method318, (method317 >= 0) ? method317 : 0, method319, (boolean)(method320 != 0), (boolean)(method321 != 0), method322);
    }
    
    public void method7920(final boolean field10612) {
        this.field10612 = field10612;
    }
    
    public boolean method7921() {
        return this.field10612;
    }
    
    @Override
    public int compareTo(final Class1948 class1948) {
        return ((this.method7907() <= 32147 || class1948.method7907() <= 32147) && (!this.method7909() || !class1948.method7909())) ? ComparisonChain.start().compare(Boolean.valueOf(this.method7909()), Boolean.valueOf(class1948.method7909())).compare(this.method7907(), class1948.method7907()).compare(this.method7906().method16458(), class1948.method7906().method16458()).result() : ComparisonChain.start().compare(Boolean.valueOf(this.method7909()), Boolean.valueOf(class1948.method7909())).compare(this.method7906().method16458(), class1948.method7906().method16458()).result();
    }
    
    static {
        field10606 = LogManager.getLogger();
    }
}
