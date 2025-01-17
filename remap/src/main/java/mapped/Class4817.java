// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.TrueTypeFont;

import java.util.Iterator;

public class Class4817 extends Class4815
{
    private boolean field20607;
    private boolean field20608;
    private boolean field20609;
    public Class4803 field20610;
    public Class4827 field20611;
    private boolean field20612;
    public int field20613;
    public boolean field20614;
    
    public Class4817(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    public Class4817(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804) {
        super(class4803, s, n, n2, n3, n4, class4804, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    public Class4817(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    public Class4817(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final TrueTypeFont class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20609 = false;
        this.field20612 = true;
        this.field20613 = 35;
        this.field20614 = false;
        this.method14390();
    }
    
    private final void method14390() {
        this.method14250().add(this.field20610 = new Class4803(this, "content", 0, 0, this.field20480, this.field20481));
        this.field20610.method14270(new Class6509());
        this.method14250().add(this.field20611 = new Class4827(this, 11));
        this.field20611.method14301(true);
    }
    
    public void method14391(final int field20650) {
        this.field20611.field20650 = field20650;
    }
    
    public int method14392() {
        if (this.field20611 != null) {
            return this.field20611.field20650;
        }
        return 0;
    }
    
    public void method14393(final boolean field20609) {
        this.field20609 = field20609;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (this.field20609 && !this.method14296()) {
            return;
        }
        super.method14200(n, n2);
        this.field20610.method14275(-1 * this.field20611.method14456());
        for (final Class4803 class4803 : this.method14396().method14250()) {
            final Iterator<Class6507> iterator2 = class4803.method14269().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().method19597(class4803, this);
            }
        }
    }
    
    public void method14394(final boolean field20612) {
        this.field20612 = field20612;
    }
    
    public boolean method14395() {
        return this.field20612;
    }
    
    @Override
    public void method14205(final float n) {
        this.method14227();
        if (this.field20609 && !this.method14296()) {
            return;
        }
        if (this.field20612) {
            Class8154.method26865(this);
        }
        super.method14205(n);
        if (this.field20612) {
            Class8154.method26872();
        }
    }
    
    @Override
    public void method14239(final Class4803 class4803) {
        this.field20610.method14239(class4803);
    }
    
    @Override
    public boolean method14248(final Class4803 class4803) {
        return this.field20610.method14248(class4803);
    }
    
    @Override
    public boolean method14240(final String s) {
        return this.field20610.method14240(s);
    }
    
    public Class4803 method14396() {
        return this.field20610;
    }
    
    public void method14397(final boolean field20614) {
        this.field20614 = field20614;
    }
}
