// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;

public class Class4827 extends Class4825 implements Class4828
{
    public int field20650;
    public float field20651;
    public boolean field20652;
    public final Class4921 field20653;
    public Class7617 field20654;
    
    public Class4827(final Class4803 class4803, final int n) {
        super(class4803, "verticalScrollBar", class4803.method14276() - n - 5, 5, n, class4803.method14278() - 10, false);
        this.field20654 = new Class7617();
        this.method14270((class4803, class4804) -> {
            class4803.method14273(class4804.method14276() - n - 5);
            class4803.method14275(5);
            class4803.method14277(n);
            class4803.method14279(class4804.method14278() - 10);
        });
        this.addVisualThing(this.field20653 = new Class4921(this, this, n));
    }
    
    @Override
    public void method14235(final float n) {
        super.method14235(n);
        if ((this.field20475 != null && this.field20475.method14237(this.method14320(), this.method14321(), false)) || ((Class4817)this.field20475).field20614) {
            final float n2 = (float)((Class4817)this.method14267()).method14396().method14278();
            final float n3 = (float)this.method14267().method14278();
            final float n4 = (float)this.method14278();
            if (n2 == 0.0f) {
                return;
            }
            if (n3 / n2 >= 1.0f) {
                return;
            }
            this.field20650 -= Math.round((n >= 0.0f) ? (((Class4817)this.field20475).field20613 * n) : (1.0f * ((Class4817)this.field20475).field20613 * n));
            this.field20654.method23934();
            this.field20654.method23932();
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20491 = this.method14237(n, n2, false);
        final float field20651 = this.field20651;
        float n3 = 0.0f;
        Label_0107: {
            if (this.field20653.method14278() >= this.method14278()) {
                n3 = -1.0f;
            }
            else {
                if (!this.method14308()) {
                    if (!this.field20653.method14386()) {
                        if (!this.field20654.method23937() || this.field20654.method23935() >= 500L) {
                            n3 = -0.05f;
                            break Label_0107;
                        }
                    }
                }
                n3 = 0.05f;
            }
        }
        this.field20651 = field20651 + n3;
        this.field20651 = Math.min(Math.max(0.0f, this.field20651), 1.0f);
        final float n4 = (float)((Class4817)this.method14267()).method14396().method14278();
        final float n5 = (float)this.method14267().method14278();
        final float n6 = (float)this.method14278();
        boolean b = false;
        Label_0204: {
            if (n5 / n4 < 1.0f) {
                if (n4 > 0.0f) {
                    if (this.field20651 >= 0.0f) {
                        b = true;
                        break Label_0204;
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        this.method14297(b2);
        this.method14305(b2);
    }
    
    @Override
    public void method14205(float n) {
        n *= this.field20651;
        final int n2 = 5;
        final int method19118 = Class6430.method19118(Class265.field1273.field1292, 0.2f * n);
        int field20478 = this.field20478;
        int field20479 = this.field20480;
        if (Client.method35173().method35209() != Class2209.field13464) {
            final int n3 = 0;
            field20479 -= 8;
            field20478 += 8;
            Class8154.method26876((float)field20478, (float)(this.field20479 + n3), (float)(field20478 + field20479), (float)(this.field20479 + this.field20481 - n3), Class6430.method19118(Class265.field1281.field1292, 0.1f * n));
        }
        else {
            Class8154.method26904((float)field20478, (float)this.field20479, (float)field20479, 5.0f, ClientAssets.verticalscrollbartop, 0.45f * n);
            Class8154.method26904((float)field20478, (float)(this.field20479 + this.field20481 - n2), (float)field20479, 5.0f, ClientAssets.verticalscrollbarbottom, 0.45f * n);
            Class8154.method26876((float)field20478, (float)(this.field20479 + n2), (float)(field20478 + field20479), (float)(this.field20479 + this.field20481 - n2), method19118);
        }
        super.method14205(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (!super.method14211(n, n2, n3)) {
            this.field20491 = this.method14237(n, n2, false);
            if (this.method14308()) {
                final int n4 = n2 - this.method14281();
                if (n4 <= this.field20653.method14274() + this.field20653.method14278()) {
                    if (n4 < this.field20653.method14274()) {
                        this.field20650 -= (int)(((Class4817)this.field20475).method14396().method14278() / 4.0f);
                    }
                }
                else {
                    this.field20650 += (int)(((Class4817)this.field20475).method14396().method14278() / 4.0f);
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public Class4405 method14202(final Class4405 class4405) {
        class4405.method13298("offset", this.field20650);
        return super.method14202(class4405);
    }
    
    @Override
    public void method14203(final Class4405 class4405) {
        super.method14203(class4405);
        this.field20650 = Class8105.method26632(class4405, "offset", this.field20650);
    }
    
    @Override
    public int method14456() {
        return this.field20650;
    }
    
    @Override
    public void method14457(final int field20650) {
        this.field20650 = field20650;
    }
    
    @Override
    public boolean method14458() {
        return this.field20652;
    }
}
