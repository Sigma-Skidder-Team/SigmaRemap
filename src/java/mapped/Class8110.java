// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class8110
{
    private final byte[] field33421;
    
    public Class8110(final int n) {
        if (n != 0 && n % 2 == 0) {
            this.field33421 = new byte[n / 2];
            return;
        }
        throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
    }
    
    public Class8110(final byte[] field33421) {
        if (field33421.length != 0 && field33421.length % 2 == 0) {
            this.field33421 = field33421;
            return;
        }
        throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
    }
    
    public byte method26654(final int n, final int n2, final int n3) {
        return this.method26655(Class7668.method24342(n, n2, n3));
    }
    
    public byte method26655(final int n) {
        final byte b = this.field33421[n / 2];
        if (n % 2 != 0) {
            return (byte)(b >> 4 & 0xF);
        }
        return (byte)(b & 0xF);
    }
    
    public void method26656(final int n, final int n2, final int n3, final int n4) {
        this.method26657(Class7668.method24342(n, n2, n3), n4);
    }
    
    public void method26657(int n, final int n2) {
        if (n % 2 != 0) {
            n /= 2;
            this.field33421[n] = (byte)((this.field33421[n] & 0xF) | (n2 & 0xF) << 4);
        }
        else {
            n /= 2;
            this.field33421[n] = (byte)((this.field33421[n] & 0xF0) | (n2 & 0xF));
        }
    }
    
    public int method26658() {
        return this.field33421.length * 2;
    }
    
    public int method26659() {
        return this.field33421.length;
    }
    
    public void method26660(final byte b) {
        final byte b2 = (byte)(b & 0xF);
        Arrays.fill(this.field33421, (byte)(b2 << 4 | b2));
    }
    
    public byte[] method26661() {
        return this.field33421;
    }
    
    public void method26662(final byte[] array) {
        if (array.length == this.field33421.length) {
            System.arraycopy(array, 0, this.field33421, 0, array.length);
            return;
        }
        throw new IllegalArgumentException("Length of handle must equal to size of nibble array!");
    }
}
