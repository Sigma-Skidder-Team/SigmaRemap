// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class8157
{
    private static final int field33595 = 32;
    private static final int field33596 = 4;
    private static final int field33597 = 255;
    private byte[] field33598;
    private int field33599;
    private int field33600;
    public int field33601;
    public int field33602;
    
    public Class8157() {
    }
    
    public Class8157(final byte[] array) {
        this.method26934(array);
    }
    
    public void method26933() {
        this.method26936();
        this.field33598 = null;
    }
    
    public final void method26934(final byte[] array) {
        final int n = 4 * ((array.length + 4 - 1) / 4);
        if (this.field33598 == null || this.field33598.length != n) {
            this.field33598 = new byte[n];
        }
        System.arraycopy(array, 0, this.field33598, 0, array.length);
        this.method26936();
    }
    
    public void method26935() throws AACException {
        final int n = this.field33601 & 0x7;
        if (n > 0) {
            this.method26945(n);
        }
    }
    
    public final void method26936() {
        this.field33599 = 0;
        this.field33601 = 0;
        this.field33600 = 0;
        this.field33602 = 0;
    }
    
    public int method26937() {
        return this.field33602;
    }
    
    public int method26938() {
        return 8 * (this.field33598.length - this.field33599) + this.field33601;
    }
    
    public int method26939(final boolean b) throws AACException {
        if (this.field33599 <= this.field33598.length - 4) {
            final int n = (this.field33598[this.field33599] & 0xFF) << 24 | (this.field33598[this.field33599 + 1] & 0xFF) << 16 | (this.field33598[this.field33599 + 2] & 0xFF) << 8 | (this.field33598[this.field33599 + 3] & 0xFF);
            if (!b) {
                this.field33599 += 4;
            }
            return n;
        }
        throw new Class2348("end of stream", true);
    }
    
    public int method26940(final int n) throws AACException {
        int n4;
        if (this.field33601 < n) {
            this.field33602 += n;
            final int n2 = this.field33600 & this.method26947(this.field33601);
            final int n3 = n - this.field33601;
            this.field33600 = this.method26939(false);
            this.field33601 = 32 - n3;
            n4 = ((this.field33600 >> this.field33601 & this.method26947(n3)) | n2 << n3);
        }
        else {
            this.field33601 -= n;
            n4 = (this.field33600 >> this.field33601 & this.method26947(n));
            this.field33602 += n;
        }
        return n4;
    }
    
    public int method26941() throws AACException {
        int n;
        if (this.field33601 <= 0) {
            this.field33600 = this.method26939(false);
            this.field33601 = 31;
            ++this.field33602;
            n = (this.field33600 >> this.field33601 & 0x1);
        }
        else {
            --this.field33601;
            n = (this.field33600 >> this.field33601 & 0x1);
            ++this.field33602;
        }
        return n;
    }
    
    public boolean method26942() throws AACException {
        return (this.method26941() & 0x1) != 0x0;
    }
    
    public int method26943(int n) throws AACException {
        int n3;
        if (this.field33601 < n) {
            final int n2 = this.field33600 & this.method26947(this.field33601);
            n -= this.field33601;
            n3 = ((this.method26939(true) >> 32 - n & this.method26947(n)) | n2 << n);
        }
        else {
            n3 = (this.field33600 >> this.field33601 - n & this.method26947(n));
        }
        return n3;
    }
    
    public int method26944() throws AACException {
        int n;
        if (this.field33601 <= 0) {
            n = (this.method26939(true) >> 31 & 0x1);
        }
        else {
            n = (this.field33600 >> this.field33601 - 1 & 0x1);
        }
        return n;
    }
    
    public void method26945(int i) throws AACException {
        this.field33602 += i;
        if (i > this.field33601) {
            i -= this.field33601;
            while (i >= 32) {
                i -= 32;
                this.method26939(false);
            }
            if (i <= 0) {
                this.field33600 = 0;
                this.field33601 = 0;
            }
            else {
                this.field33600 = this.method26939(false);
                this.field33601 = 32 - i;
            }
        }
        else {
            this.field33601 -= i;
        }
    }
    
    public void method26946() throws AACException {
        ++this.field33602;
        if (this.field33601 <= 0) {
            this.field33600 = this.method26939(false);
            this.field33601 = 31;
        }
        else {
            --this.field33601;
        }
    }
    
    public int method26947(final int n) {
        int n2;
        if (n != 32) {
            n2 = (1 << n) - 1;
        }
        else {
            n2 = -1;
        }
        return n2;
    }
}
