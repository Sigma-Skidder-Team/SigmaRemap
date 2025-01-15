// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class Class4182 implements Class4178, Class4183
{
    public static final int field18665 = 0;
    public static final int field18666 = 1;
    public static final int field18667 = 0;
    public static final int field18668 = 1;
    private final int field18669;
    private Class303 field18670;
    private int[] field18671;
    private int field18672;
    private boolean field18673;
    private Class9335 field18674;
    public boolean field18675;
    public boolean field18676;
    private Class4196 field18677;
    private Class4196 field18678;
    private int field18679;
    private int field18680;
    private int[] field18681;
    private int field18682;
    private int[] field18683;
    
    public Class4182(final int field18669) {
        this.field18669 = field18669;
        this.field18671 = new int[2];
        this.field18670 = Class303.field1764;
        this.field18681 = new int[8];
        this.field18675 = false;
        this.field18676 = false;
    }
    
    public void method12547(final Class8157 class8157, final Class4179 class8158, final boolean b) throws AACException {
        final Class2077 method12533 = class8158.method12533();
        if (!method12533.equals(Class2077.field12004)) {
            class8157.method26946();
            this.field18670 = Class303.method961(class8157.method26940(2));
            this.field18671[0] = this.field18671[1];
            this.field18671[1] = class8157.method26941();
            this.field18680 = 1;
            this.field18681[0] = 1;
            if (!this.field18670.equals(Class303.field1766)) {
                this.field18672 = class8157.method26940(6);
                this.field18679 = 1;
                this.field18683 = Class4182.field18692[method12533.method8182()];
                this.field18682 = Class4182.field18684[method12533.method8182()];
                if (this.field18673 = class8157.method26942()) {
                    this.method12548(class8157, class8158.method12531(), method12533, b);
                }
            }
            else {
                this.field18672 = class8157.method26940(4);
                for (int i = 0; i < 7; ++i) {
                    if (!class8157.method26942()) {
                        ++this.field18680;
                        this.field18681[this.field18680 - 1] = 1;
                    }
                    else {
                        final int[] field18681 = this.field18681;
                        final int n = this.field18680 - 1;
                        ++field18681[n];
                    }
                }
                this.field18679 = 8;
                this.field18683 = Class4182.field18700[method12533.method8182()];
                this.field18682 = Class4182.field18693[method12533.method8182()];
                this.field18673 = false;
            }
            return;
        }
        throw new Class2348("invalid sample frequency");
    }
    
    private void method12548(final Class8157 class8157, final Class2002 obj, final Class2077 class8158, final boolean b) throws AACException {
        switch (Class6028.field24520[obj.ordinal()]) {
            case 1: {
                if (this.field18674 == null) {
                    this.field18674 = new Class9335();
                }
                this.field18674.method34581(class8157, this.field18672, class8158);
                break;
            }
            case 2: {
                final boolean method26942 = class8157.method26942();
                this.field18675 = method26942;
                if (method26942) {
                    if (this.field18677 == null) {
                        this.field18677 = new Class4196(this.field18669);
                    }
                    this.field18677.method12601(class8157, this, obj);
                }
                if (b && (this.field18676 = class8157.method26942())) {
                    if (this.field18678 == null) {
                        this.field18678 = new Class4196(this.field18669);
                    }
                    this.field18678.method12601(class8157, this, obj);
                    break;
                }
                break;
            }
            case 3: {
                if (!b && (this.field18675 = class8157.method26942())) {
                    if (this.field18677 == null) {
                        this.field18677 = new Class4196(this.field18669);
                    }
                    this.field18677.method12601(class8157, this, obj);
                    break;
                }
                break;
            }
            default: {
                throw new Class2348("unexpected profile for LTP: " + obj);
            }
        }
    }
    
    public int method12549() {
        return this.field18672;
    }
    
    public int method12550() {
        return this.field18682;
    }
    
    public int[] method12551() {
        return this.field18683;
    }
    
    public int method12552() {
        return this.field18683[this.field18682];
    }
    
    public int method12553() {
        return this.field18679;
    }
    
    public int method12554() {
        return this.field18680;
    }
    
    public int method12555(final int n) {
        return this.field18681[n];
    }
    
    public Class303 method12556() {
        return this.field18670;
    }
    
    public boolean method12557() {
        return this.field18670.equals(Class303.field1766);
    }
    
    public int method12558(final int n) {
        return this.field18671[n];
    }
    
    public boolean method12559() {
        return this.field18673;
    }
    
    public Class9335 method12560() {
        return this.field18674;
    }
    
    public boolean method12561() {
        return this.field18675;
    }
    
    public Class4196 method12562() {
        return this.field18677;
    }
    
    public boolean method12563() {
        return this.field18676;
    }
    
    public Class4196 method12564() {
        return this.field18678;
    }
    
    public void method12565(final int n) {
        if (this.field18673) {
            this.field18674.method34582(n);
        }
        if (this.field18675) {
            this.field18677.method12602(n);
        }
        if (this.field18676) {
            this.field18678.method12602(n);
        }
    }
    
    public void method12566(final Class4182 class4182) {
        this.field18670 = class4182.field18670;
        this.field18671[0] = this.field18671[1];
        this.field18671[1] = class4182.field18671[1];
        this.field18672 = class4182.field18672;
        if (this.field18673 = class4182.field18673) {
            this.field18674 = class4182.field18674;
        }
        if (this.field18675 = class4182.field18675) {
            this.field18677.method12606(class4182.field18677);
            this.field18678.method12606(class4182.field18678);
        }
        this.field18679 = class4182.field18679;
        this.field18680 = class4182.field18680;
        this.field18681 = Arrays.copyOf(class4182.field18681, class4182.field18681.length);
        this.field18682 = class4182.field18682;
        this.field18683 = Arrays.copyOf(class4182.field18683, class4182.field18683.length);
    }
}
