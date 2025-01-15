// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7920
{
    private Class7776 field32514;
    private int field32515;
    private int field32516;
    private int field32517;
    private int field32518;
    private int field32519;
    private final int field32520;
    private boolean field32521;
    private boolean field32522;
    private Class226 field32523;
    private Class267 field32524;
    private Class7617 field32525;
    private int field32526;
    private int field32527;
    private Class9572 field32528;
    
    public Class7920(final Class7776 field32514, final int field32515, final int field32516, final int field32517, final Class267 field32518, final int field32519, final int field32520) {
        this.field32522 = true;
        this.field32525 = new Class7617();
        this.field32527 = 1;
        this.field32514 = field32514;
        this.field32516 = field32515;
        this.field32517 = field32516;
        this.field32518 = field32517;
        this.field32524 = field32518;
        this.field32519 = field32519;
        this.field32527 = field32520;
        this.field32528 = new Class9572(field32519, field32519, Class2186.field12965);
        this.field32520 = (int)(field32514.method24922() / (float)field32516);
        this.field32523 = Class226.field797;
    }
    
    public void method25643() {
        this.field32525.method23932();
        this.field32521 = true;
        if (this.field32528.method35857() != Class2186.field12965) {
            this.field32528.method35855(Class2186.field12965);
        }
        else {
            this.field32528.method35855(Class2186.field12964);
        }
    }
    
    public boolean method25644() {
        return this.field32528.method35857() != Class2186.field12965;
    }
    
    public void method25645() {
        this.field32525.method23933();
        this.field32521 = false;
    }
    
    public void method25646() {
        this.field32525.method23934();
    }
    
    public void method25647() {
        this.field32525.method23935();
        if (this.field32521) {
            ++this.field32526;
        }
        int field32527 = 0;
        switch (Class8600.field36112[this.field32524.ordinal()]) {
            case 1: {
                this.field32515 = Math.round((this.field32516 - 1) * this.field32528.method35858());
                break;
            }
            case 2: {
                if (this.field32526 >= this.field32519) {
                    field32527 = this.field32527;
                    this.field32526 = 0;
                }
                if (this.field32523 == Class226.field797) {
                    this.field32515 += field32527;
                    if (!this.field32522 && this.field32515 >= this.field32516 - 1) {
                        this.field32515 = this.field32516 - 1;
                        this.method25645();
                        this.method25646();
                    }
                    else if (this.field32515 > this.field32516) {}
                    this.field32515 %= this.field32516;
                    break;
                }
                this.field32515 -= field32527;
                if (!this.field32522 && this.field32515 <= 0) {
                    this.field32515 = 0;
                    this.method25645();
                    this.method25646();
                    break;
                }
                if (this.field32515 < 0) {
                    this.field32515 = this.field32516 - 1;
                    break;
                }
                break;
            }
        }
    }
    
    public void method25648(final int n, final int n2, final int n3, final int n4, final float n5) {
        Class8154.method26901((float)n, (float)n2, (float)n3, (float)n4, this.field32514, Class6430.method19118(Class265.field1278.field1292, n5), (float)(this.field32515 % this.field32520 * this.field32517), (float)(this.field32515 / this.field32520 * this.field32518), (float)this.field32517, (float)this.field32518);
    }
    
    public Class7776 method25649() {
        return this.field32514;
    }
    
    public int method25650() {
        return this.field32515;
    }
    
    public void method25651(final int n) {
        if (n >= 0 && n <= this.method25654() - 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid frame count");
    }
    
    public int method25652() {
        return this.field32517;
    }
    
    public int method25653() {
        return this.field32518;
    }
    
    public int method25654() {
        return this.field32516;
    }
    
    public int method25655() {
        return this.field32519;
    }
    
    public void method25656(final int field32519) {
        this.field32519 = field32519;
    }
    
    public boolean method25657() {
        return this.field32521;
    }
    
    public boolean method25658() {
        return this.field32522;
    }
    
    public void method25659(final boolean field32522) {
        this.field32522 = field32522;
    }
    
    public Class226 method25660() {
        return this.field32523;
    }
    
    public void method25661(final Class226 field32523) {
        this.field32523 = field32523;
    }
    
    public int method25662() {
        return this.field32527;
    }
    
    public void method25663(final int field32527) {
        this.field32527 = field32527;
    }
}
