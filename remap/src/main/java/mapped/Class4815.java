// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.TrueTypeFont;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4815 extends Class4803 implements Class4816
{
    private static String[] field20591;
    public boolean field20592;
    public boolean field20593;
    public int field20594;
    public int field20595;
    public int field20596;
    public int field20597;
    public boolean field20598;
    public boolean field20599;
    public boolean field20600;
    public boolean field20601;
    public boolean field20602;
    public final Class7617 field20603;
    public int field20604;
    public int field20605;
    private final List<Class9073> field20606;
    
    public Class4815(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final boolean field20592) {
        super(class4803, s, n, n2, n3, n4);
        this.field20598 = true;
        this.field20599 = false;
        this.field20600 = true;
        this.field20601 = true;
        this.field20602 = false;
        this.field20603 = new Class7617();
        this.field20604 = 300;
        this.field20605 = 2;
        this.field20606 = new ArrayList<Class9073>();
        this.field20592 = field20592;
    }
    
    public Class4815(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final boolean field20592) {
        super(class4803, s, n, n2, n3, n4, class4804);
        this.field20598 = true;
        this.field20599 = false;
        this.field20600 = true;
        this.field20601 = true;
        this.field20602 = false;
        this.field20603 = new Class7617();
        this.field20604 = 300;
        this.field20605 = 2;
        this.field20606 = new ArrayList<Class9073>();
        this.field20592 = field20592;
    }
    
    public Class4815(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final boolean field20592) {
        super(class4803, s, n, n2, n3, n4, class4804, s2);
        this.field20598 = true;
        this.field20599 = false;
        this.field20600 = true;
        this.field20601 = true;
        this.field20602 = false;
        this.field20603 = new Class7617();
        this.field20604 = 300;
        this.field20605 = 2;
        this.field20606 = new ArrayList<Class9073>();
        this.field20592 = field20592;
    }
    
    public Class4815(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final TrueTypeFont class4805, final boolean field20592) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805);
        this.field20598 = true;
        this.field20599 = false;
        this.field20600 = true;
        this.field20601 = true;
        this.field20602 = false;
        this.field20603 = new Class7617();
        this.field20604 = 300;
        this.field20605 = 2;
        this.field20606 = new ArrayList<Class9073>();
        this.field20592 = field20592;
    }
    
    @Override
    public boolean method14309() {
        return this.field20492 && !this.method14386();
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.method14384()) {
            if (!this.field20492) {
                if (!this.field20593) {
                    this.field20596 = this.method14276() / 2;
                    this.field20597 = this.method14278() / 2;
                }
            }
            this.method14383(n, n2);
        }
    }
    
    @Override
    public boolean method14211(final int field20594, final int field20595, final int n) {
        if (!super.method14211(field20594, field20595, n)) {
            if (this.method14384()) {
                this.field20603.method23932();
                this.field20594 = field20594;
                this.field20595 = field20595;
                this.field20596 = this.field20594 - this.method14280();
                this.field20597 = this.field20595 - this.method14281();
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        super.method14233(n, n2, n3);
        if (this.method14384()) {
            this.field20603.method23933();
            this.field20603.method23934();
        }
        this.method14387(false);
    }
    
    @Override
    public void method14383(final int n, final int n2) {
        final boolean field20593 = this.field20593;
        if (!this.method14386() && this.method14384()) {
            final boolean b = this.field20600 && this.field20603.method23935() >= this.field20604;
            boolean b2 = false;
            Label_0143: {
                if (this.field20601) {
                    if (this.field20492) {
                        if (Math.abs(this.field20594 - n) > this.field20605 || Math.abs(this.field20595 - n2) > this.field20605) {
                            b2 = true;
                            break Label_0143;
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = b2;
            final boolean b4 = this.field20602 && this.field20492;
            Label_0199: {
                if (!b) {
                    if (!b3) {
                        if (!b4) {
                            break Label_0199;
                        }
                    }
                }
                this.method14387(true);
            }
        }
        else if (this.method14386()) {
            this.method14273(n - this.field20596 - ((this.field20475 == null) ? 0 : this.field20475.method14280()));
            this.method14275(n2 - this.field20597 - ((this.field20475 == null) ? 0 : this.field20475.method14281()));
            if (this.field20598) {
                if (this.field20475 == null) {
                    if (this.method14272() < 0) {
                        this.method14273(0);
                    }
                    if (this.method14272() + this.method14276() > Minecraft.method5277().field4632.method7694()) {
                        this.method14273(Minecraft.method5277().field4632.method7694() - this.method14276());
                    }
                    if (this.method14274() < 0) {
                        this.method14275(0);
                    }
                    if (this.method14274() + this.method14278() > Minecraft.method5277().field4632.method7695()) {
                        this.method14275(Minecraft.method5277().field4632.method7695() - this.method14278());
                    }
                }
                else {
                    if (this.method14272() < 0) {
                        this.method14273(0);
                    }
                    if (this.method14272() + this.method14276() > this.field20475.method14276()) {
                        this.method14273(this.field20475.method14276() - this.method14276());
                    }
                    if (this.method14274() < 0) {
                        this.method14275(0);
                    }
                    if (this.method14274() + this.method14278() > this.field20475.method14278()) {
                        if (!this.field20599) {
                            this.method14275(this.field20475.method14278() - this.method14278());
                        }
                    }
                }
            }
        }
        if (this.method14386()) {
            if (!field20593) {
                this.field20603.method23933();
                this.field20603.method23934();
            }
        }
    }
    
    @Override
    public boolean method14384() {
        return this.field20592;
    }
    
    @Override
    public void method14385(final boolean field20592) {
        this.field20592 = field20592;
    }
    
    @Override
    public boolean method14386() {
        return this.field20593;
    }
    
    @Override
    public void method14387(final boolean field20593) {
        if (this.field20593 = field20593) {
            this.method14385(true);
            this.method14389();
        }
    }
    
    public Class4815 method14388(final Class9073 class9073) {
        this.field20606.add(class9073);
        return this;
    }
    
    public void method14389() {
        final Iterator<Class9073> iterator = this.field20606.iterator();
        while (iterator.hasNext()) {
            iterator.next().method32686(this);
        }
    }
}
