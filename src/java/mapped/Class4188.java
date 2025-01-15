// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;
import java.util.Arrays;

public class Class4188 extends Class4176 implements Class4178
{
    private Class2094 field18730;
    private boolean[] field18731;
    private boolean field18732;
    public Class4192 field18733;
    public Class4192 field18734;
    
    public Class4188(final int n) {
        this.field18731 = new boolean[128];
        this.field18733 = new Class4192(n);
        this.field18734 = new Class4192(n);
    }
    
    public void method12574(final Class8157 class8157, final Class4179 class8158) throws AACException {
        final Class2002 method12531 = class8158.method12531();
        if (!class8158.method12533().equals(Class2077.field12004)) {
            this.method12511(class8157);
            this.field18732 = class8157.method26942();
            final Class4182 method12532 = this.field18733.method12588();
            if (!this.field18732) {
                this.field18730 = Class2094.field12105;
                Arrays.fill(this.field18731, false);
            }
            else {
                method12532.method12547(class8157, class8158, this.field18732);
                this.field18734.method12588().method12566(method12532);
                this.field18730 = Class2094.method8211(class8157.method26940(2));
                if (!this.field18730.equals(Class2094.field12106)) {
                    if (!this.field18730.equals(Class2094.field12107)) {
                        if (!this.field18730.equals(Class2094.field12105)) {
                            throw new Class2348("reserved MS mask type used");
                        }
                        Arrays.fill(this.field18731, false);
                    }
                    else {
                        Arrays.fill(this.field18731, true);
                    }
                }
                else {
                    for (int method12533 = method12532.method12549(), method12534 = method12532.method12554(), i = 0; i < method12534 * method12533; ++i) {
                        this.field18731[i] = class8157.method26942();
                    }
                }
            }
            if (method12531.method8029()) {
                if (method12532.method12561()) {
                    if (method12532.field18676 = class8157.method26942()) {
                        method12532.method12564().method12601(class8157, method12532, method12531);
                    }
                }
            }
            this.field18733.method12582(class8157, this.field18732, class8158);
            this.field18734.method12582(class8157, this.field18732, class8158);
            return;
        }
        throw new Class2348("invalid sample frequency");
    }
    
    public Class4192 method12575() {
        return this.field18733;
    }
    
    public Class4192 method12576() {
        return this.field18734;
    }
    
    public Class2094 method12577() {
        return this.field18730;
    }
    
    public boolean method12578(final int n) {
        return this.field18731[n];
    }
    
    public boolean method12579() {
        return !this.field18730.equals(Class2094.field12105);
    }
    
    public boolean method12580() {
        return this.field18732;
    }
}
