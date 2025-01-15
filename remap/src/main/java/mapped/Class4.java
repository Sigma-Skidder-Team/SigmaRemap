// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class4 implements Serializable, Cloneable
{
    public static final long field6 = -8226727741811898211L;
    public byte field7;
    public byte field8;
    public byte field9;
    public byte field10;
    
    public Class4(final byte field7, final byte field8, final byte field9, final byte field10) {
        this.field7 = field7;
        this.field8 = field8;
        this.field9 = field9;
        this.field10 = field10;
    }
    
    public Class4(final byte[] array) {
        this.field7 = array[0];
        this.field8 = array[1];
        this.field9 = array[2];
        this.field10 = array[3];
    }
    
    public Class4(final Class4 class4) {
        this.field7 = class4.field7;
        this.field8 = class4.field8;
        this.field9 = class4.field9;
        this.field10 = class4.field10;
    }
    
    public Class4() {
        this.field7 = 0;
        this.field8 = 0;
        this.field9 = 0;
        this.field10 = 0;
    }
    
    @Override
    public String toString() {
        return "(" + (this.field7 & 0xFF) + ", " + (this.field8 & 0xFF) + ", " + (this.field9 & 0xFF) + ", " + (this.field10 & 0xFF) + ")";
    }
    
    public final void method2(final byte[] array) {
        array[0] = this.field7;
        array[1] = this.field8;
        array[2] = this.field9;
        array[3] = this.field10;
    }
    
    public final void method3(final Class4 class4) {
        class4.field7 = this.field7;
        class4.field8 = this.field8;
        class4.field9 = this.field9;
        class4.field10 = this.field10;
    }
    
    public final void method4(final Class4 class4) {
        this.field7 = class4.field7;
        this.field8 = class4.field8;
        this.field9 = class4.field9;
        this.field10 = class4.field10;
    }
    
    public final void method5(final byte[] array) {
        this.field7 = array[0];
        this.field8 = array[1];
        this.field9 = array[2];
        this.field10 = array[3];
    }
    
    public boolean equals(final Class4 class4) {
        try {
            return this.field7 == class4.field7 && this.field8 == class4.field8 && this.field9 == class4.field9 && this.field10 == class4.field10;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class4 class4 = (Class4)o;
            return this.field7 == class4.field7 && this.field8 == class4.field8 && this.field9 == class4.field9 && this.field10 == class4.field10;
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
        return (this.field7 & 0xFF) << 0 | (this.field8 & 0xFF) << 8 | (this.field9 & 0xFF) << 16 | (this.field10 & 0xFF) << 24;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final byte method6() {
        return this.field7;
    }
    
    public final void method7(final byte field7) {
        this.field7 = field7;
    }
    
    public final byte method8() {
        return this.field8;
    }
    
    public final void method9(final byte field8) {
        this.field8 = field8;
    }
    
    public final byte method10() {
        return this.field9;
    }
    
    public final void method11(final byte field9) {
        this.field9 = field9;
    }
    
    public final byte method12() {
        return this.field10;
    }
    
    public final void method13(final byte field10) {
        this.field10 = field10;
    }
}
