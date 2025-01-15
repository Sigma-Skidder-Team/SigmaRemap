// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Class8035
{
    private static String[] field33087;
    private long field33088;
    private long field33089;
    private int field33090;
    private double field33091;
    private int field33092;
    
    public Class8035() {
        this.field33088 = 100L;
        this.field33089 = 10000L;
        this.field33090 = 2;
    }
    
    public long method26358() {
        BigInteger multiply = BigInteger.valueOf(this.field33088).multiply(BigInteger.valueOf(this.field33090).pow(this.field33092++));
        if (this.field33091 != 0.0) {
            final double random = Math.random();
            final BigInteger bigInteger = BigDecimal.valueOf(random).multiply(BigDecimal.valueOf(this.field33091)).multiply(new BigDecimal(multiply)).toBigInteger();
            multiply = ((((int)Math.floor(random * 10.0) & 0x1) != 0x0) ? multiply.add(bigInteger) : multiply.subtract(bigInteger));
        }
        return multiply.min(BigInteger.valueOf(this.field33089)).longValue();
    }
    
    public void method26359() {
        this.field33092 = 0;
    }
    
    public Class8035 method26360(final long field33088) {
        this.field33088 = field33088;
        return this;
    }
    
    public Class8035 method26361(final long field33089) {
        this.field33089 = field33089;
        return this;
    }
    
    public Class8035 method26362(final int field33090) {
        this.field33090 = field33090;
        return this;
    }
    
    public Class8035 method26363(final double field33091) {
        this.field33091 = field33091;
        return this;
    }
    
    public int method26364() {
        return this.field33092;
    }
}
