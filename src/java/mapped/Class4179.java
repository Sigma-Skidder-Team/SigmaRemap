// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4179 implements Class4178
{
    private Class2002 field18638;
    private Class2002 field18639;
    private Class2077 field18640;
    private Class2001 field18641;
    private boolean field18642;
    private boolean field18643;
    private int field18644;
    private boolean field18645;
    private boolean field18646;
    private boolean field18647;
    private boolean field18648;
    private boolean field18649;
    private boolean field18650;
    private boolean field18651;
    
    private Class4179() {
        this.field18638 = Class2002.field11220;
        this.field18639 = Class2002.field11219;
        this.field18640 = Class2077.field12004;
        this.field18641 = Class2001.field11207;
        this.field18642 = false;
        this.field18646 = false;
        this.field18647 = false;
        this.field18648 = true;
        this.field18649 = false;
        this.field18650 = false;
        this.field18651 = false;
    }
    
    public Class2001 method12520() {
        return this.field18641;
    }
    
    public void method12521(final Class2001 field18641) {
        this.field18641 = field18641;
    }
    
    public int method12522() {
        return this.field18644;
    }
    
    public void method12523(final int field18644) {
        this.field18644 = field18644;
    }
    
    public boolean method12524() {
        return this.field18643;
    }
    
    public void method12525(final boolean field18643) {
        this.field18643 = field18643;
    }
    
    public Class2002 method12526() {
        return this.field18639;
    }
    
    public void method12527(final Class2002 field18639) {
        this.field18639 = field18639;
    }
    
    public int method12528() {
        return this.field18642 ? 960 : 1024;
    }
    
    public boolean method12529() {
        return this.field18642;
    }
    
    public void method12530(final boolean field18642) {
        this.field18642 = field18642;
    }
    
    public Class2002 method12531() {
        return this.field18638;
    }
    
    public void method12532(final Class2002 field18638) {
        this.field18638 = field18638;
    }
    
    public Class2077 method12533() {
        return this.field18640;
    }
    
    public void method12534(final Class2077 field18640) {
        this.field18640 = field18640;
    }
    
    public boolean method12535() {
        return this.field18646;
    }
    
    public boolean method12536() {
        return this.field18647;
    }
    
    public boolean method12537() {
        return this.field18648;
    }
    
    public void method12538(final boolean field18648) {
        this.field18648 = field18648;
    }
    
    public boolean method12539() {
        return this.field18650;
    }
    
    public boolean method12540() {
        return this.field18649;
    }
    
    public boolean method12541() {
        return this.field18651;
    }
    
    public static Class4179 method12542(final byte[] array) throws AACException {
        final Class8157 class8157 = new Class8157(array);
        final Class4179 class8158 = new Class4179();
        try {
            class8158.field18638 = method12543(class8157);
            final int method26940 = class8157.method26940(4);
            if (method26940 == 15) {
                class8158.field18640 = Class2077.method8181(class8157.method26940(24));
            }
            else {
                class8158.field18640 = Class2077.method8180(method26940);
            }
            class8158.field18641 = Class2001.method8022(class8157.method26940(4));
            switch (Class9393.field40299[class8158.field18638.ordinal()]) {
                case 1: {
                    class8158.field18639 = class8158.field18638;
                    class8158.field18646 = true;
                    final int method26941 = class8157.method26940(4);
                    class8158.field18647 = (class8158.field18640.method8182() == method26941);
                    class8158.field18640 = Class2077.method8180(method26941);
                    class8158.field18638 = method12543(class8157);
                    break;
                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8: {
                    class8158.field18642 = class8157.method26942();
                    if (class8158.field18642) {
                        throw new Class2348("config uses 960-sample frames, not yet supported");
                    }
                    class8158.field18643 = class8157.method26942();
                    if (class8158.field18643) {
                        class8158.field18644 = class8157.method26940(14);
                    }
                    else {
                        class8158.field18644 = 0;
                    }
                    class8158.field18645 = class8157.method26942();
                    if (class8158.field18645) {
                        if (class8158.field18638.method8029()) {
                            class8158.field18649 = class8157.method26942();
                            class8158.field18650 = class8157.method26942();
                            class8158.field18651 = class8157.method26942();
                        }
                        class8157.method26946();
                    }
                    if (class8158.field18641 == Class2001.field11208) {
                        class8157.method26945(3);
                        final Class4208 class8159 = new Class4208();
                        class8159.method12672(class8157);
                        class8158.field18638 = class8159.method12674();
                        class8158.field18640 = class8159.method12675();
                        class8158.field18641 = Class2001.method8022(class8159.method12676());
                    }
                    if (class8157.method26938() > 10) {
                        method12544(class8157, class8158);
                        break;
                    }
                    break;
                }
                default: {
                    throw new Class2348("profile not supported: " + class8158.field18638.method8026());
                }
            }
            return class8158;
        }
        finally {
            class8157.method26933();
        }
    }
    
    private static Class2002 method12543(final Class8157 class8157) throws AACException {
        int method26940 = class8157.method26940(5);
        if (method26940 == 31) {
            method26940 = 32 + class8157.method26940(6);
        }
        return Class2002.method8025(method26940);
    }
    
    private static void method12544(final Class8157 class8157, final Class4179 class8158) throws AACException {
        switch (class8157.method26940(11)) {
            case 695: {
                final Class2002 method8025 = Class2002.method8025(class8157.method26940(5));
                if (!method8025.equals(Class2002.field11224)) {
                    break;
                }
                class8158.field18646 = class8157.method26942();
                if (!class8158.field18646) {
                    break;
                }
                class8158.field18638 = method8025;
                final int method8026 = class8157.method26940(4);
                if (method8026 == class8158.field18640.method8182()) {
                    class8158.field18647 = true;
                }
                if (method8026 == 15) {
                    throw new Class2348("sample rate specified explicitly, not supported yet!");
                }
                break;
            }
        }
    }
}
