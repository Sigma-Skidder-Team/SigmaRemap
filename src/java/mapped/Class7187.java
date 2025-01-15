// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7187
{
    private static final Logger field27871;
    private final Class297 field27872;
    private final Class2078 field27873;
    private final int field27874;
    private final int field27875;
    private final int field27876;
    
    public Class7187(final int field27874, final Class297 field27875, final Class2078 field27876, final int field27877) {
        if (!this.method22047(field27874, field27876)) {
            Class7187.field27871.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.field27873 = Class2078.field12013;
        }
        else {
            this.field27873 = field27876;
        }
        this.field27872 = field27875;
        this.field27874 = field27874;
        this.field27875 = field27877;
        this.field27876 = field27875.method951() * this.field27875;
    }
    
    private boolean method22047(final int n, final Class2078 class2078) {
        return n == 0 || class2078 == Class2078.field12013;
    }
    
    public final Class297 method22048() {
        return this.field27872;
    }
    
    public final Class2078 method22049() {
        return this.field27873;
    }
    
    public final int method22050() {
        return this.field27875;
    }
    
    public final int method22051() {
        return this.field27874;
    }
    
    @Override
    public String toString() {
        return this.field27875 + "," + this.field27873.method8189() + "," + this.field27872.method952();
    }
    
    public final int method22052() {
        return this.field27876;
    }
    
    public final boolean method22053() {
        return this.field27873 == Class2078.field12010;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class7187 class7187 = (Class7187)o;
            return this.field27875 == class7187.field27875 && this.field27874 == class7187.field27874 && this.field27872 == class7187.field27872 && this.field27873 == class7187.field27873;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * this.field27872.hashCode() + this.field27873.hashCode()) + this.field27874) + this.field27875;
    }
    
    public void method22054(final long n, final int n2) {
        Class2078.method8201(this.field27873, this.field27875, this.field27872.method953(), n2, n, this.field27874);
    }
    
    public void method22055() {
        this.field27873.method8188(this.field27874);
    }
    
    static {
        field27871 = LogManager.getLogger();
    }
}
