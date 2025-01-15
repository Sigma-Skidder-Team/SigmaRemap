// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2300 implements Serializable, Cloneable
{
    public static final long field13950 = -483782685323607044L;
    public byte field13951;
    public byte field13952;
    public byte field13953;
    
    public Class2300(final byte field13951, final byte field13952, final byte field13953) {
        this.field13951 = field13951;
        this.field13952 = field13952;
        this.field13953 = field13953;
    }
    
    public Class2300(final byte[] array) {
        this.field13951 = array[0];
        this.field13952 = array[1];
        this.field13953 = array[2];
    }
    
    public Class2300(final Class2300 class2300) {
        this.field13951 = class2300.field13951;
        this.field13952 = class2300.field13952;
        this.field13953 = class2300.field13953;
    }
    
    public Class2300() {
        this.field13951 = 0;
        this.field13952 = 0;
        this.field13953 = 0;
    }
    
    @Override
    public String toString() {
        return "(" + (this.field13951 & 0xFF) + ", " + (this.field13952 & 0xFF) + ", " + (this.field13953 & 0xFF) + ")";
    }
    
    public final void method9180(final byte[] array) {
        array[0] = this.field13951;
        array[1] = this.field13952;
        array[2] = this.field13953;
    }
    
    public final void method9181(final Class2300 class2300) {
        class2300.field13951 = this.field13951;
        class2300.field13952 = this.field13952;
        class2300.field13953 = this.field13953;
    }
    
    public final void method9182(final Class2300 class2300) {
        this.field13951 = class2300.field13951;
        this.field13952 = class2300.field13952;
        this.field13953 = class2300.field13953;
    }
    
    public final void method9183(final byte[] array) {
        this.field13951 = array[0];
        this.field13952 = array[1];
        this.field13953 = array[2];
    }
    
    public boolean equals(final Class2300 class2300) {
        try {
            return this.field13951 == class2300.field13951 && this.field13952 == class2300.field13952 && this.field13953 == class2300.field13953;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2300 class2300 = (Class2300)o;
            return this.field13951 == class2300.field13951 && this.field13952 == class2300.field13952 && this.field13953 == class2300.field13953;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return (this.field13951 & 0xFF) << 0 | (this.field13952 & 0xFF) << 8 | (this.field13953 & 0xFF) << 16;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final byte method9184() {
        return this.field13951;
    }
    
    public final void method9185(final byte field13951) {
        this.field13951 = field13951;
    }
    
    public final byte method9186() {
        return this.field13952;
    }
    
    public final void method9187(final byte field13952) {
        this.field13952 = field13952;
    }
    
    public final byte method9188() {
        return this.field13953;
    }
    
    public final void method9189(final byte field13953) {
        this.field13953 = field13953;
    }
}
