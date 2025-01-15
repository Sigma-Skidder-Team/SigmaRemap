// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class7129
{
    private static String[] field27778;
    public int field27779;
    public int field27780;
    public int field27781;
    
    public Class7129() {
        this.field27781 = 0;
    }
    
    public int method21873() {
        return this.field27781;
    }
    
    public int method21874(final int n) {
        if (n == 0) {
            return 0;
        }
        if (this.field27781 > 32) {
            if (this.field27781 - n >= 32) {
                return this.field27780 >> this.field27781 - n - 32 & -1 >> 32 - n;
            }
            return (this.field27780 & -1 >> 64 - this.field27781) << n - this.field27781 + 32 | this.field27779 >> this.field27781 - n;
        }
        else {
            if (this.field27781 < n) {
                return this.field27779 << n - this.field27781 & -1 >> 32 - n;
            }
            return this.field27779 >> this.field27781 - n & -1 >> 32 - n;
        }
    }
    
    public boolean method21875(final int n) {
        this.field27781 -= n;
        boolean b;
        if (this.field27781 >= 0) {
            b = true;
        }
        else {
            this.field27781 = 0;
            b = false;
        }
        return b;
    }
    
    public int method21876(final int n) {
        int method21874 = this.method21874(n);
        if (!this.method21875(n)) {
            method21874 = -1;
        }
        return method21874;
    }
    
    public int method21877() {
        int method21874 = this.method21874(1);
        if (!this.method21875(1)) {
            method21874 = -1;
        }
        return method21874;
    }
    
    public void method21878() {
        if (this.field27781 != 0) {
            final int[] method12568 = Class4184.method12568(this.field27780, this.field27779, this.field27781);
            this.field27780 = method12568[0];
            this.field27779 = method12568[1];
        }
    }
    
    public void method21879(final Class7129 class7129) {
        if (class7129.field27781 != 0) {
            final int field27779 = class7129.field27779;
            final int field27780 = class7129.field27780;
            int field27781;
            int n;
            int n2;
            int n3;
            if (this.field27781 <= 32) {
                field27781 = (this.field27779 & (1 << this.field27781) - 1);
                n = 0;
                n2 = (field27780 << this.field27781 | field27779 >> 32 - this.field27781);
                n3 = field27779 << this.field27781;
            }
            else {
                field27781 = this.field27779;
                n = (this.field27780 & (1 << this.field27781 - 32) - 1);
                n2 = field27779 << this.field27781 - 32;
                n3 = 0;
            }
            this.field27779 = (field27781 | n3);
            this.field27780 = (n | n2);
            this.field27781 += class7129.field27781;
        }
    }
    
    public void method21880(final int field27781, final Class8157 class8157) throws AACException {
        this.field27781 = field27781;
        if (field27781 <= 32) {
            this.field27779 = class8157.method26940(field27781);
            this.field27780 = 0;
        }
        else {
            this.field27780 = class8157.method26940(field27781 - 32);
            this.field27779 = class8157.method26940(32);
        }
    }
}
