// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;

public class Class8477
{
    public static String method28301(final Class1855 class1855, final BlockPos class1856) {
        return method28302(class1855.method6727(class1856));
    }
    
    public static String method28302(final Class436 class436) {
        if (class436 instanceof INameable) {
            final INameable class437 = (INameable)class436;
            method28303(class436);
            return class437.hasCustomName() ? class437.getCustomName().getUnformattedComponentText() : null;
        }
        return null;
    }
    
    public static void method28303(final Class436 class436) {
        final BlockPos method2193 = class436.method2193();
        if (method28305(class436) == null) {
            ITextComponent method2194 = method28304(method2193);
            if (method2194 == null) {
                method2194 = new StringTextComponent("");
            }
            method28306(class436, method2194);
        }
    }
    
    public static ITextComponent method28304(final BlockPos class354) {
        final Class436 method31208 = Class8876.method31208(class354);
        if (method31208 != null) {
            return method28305(method31208);
        }
        return null;
    }
    
    public static ITextComponent method28305(final Class436 class436) {
        if (!(class436 instanceof INameable)) {
            return (class436 instanceof Class490) ? ((ITextComponent)Class9570.method35828(class436, Class9570.field41591)) : null;
        }
        return ((INameable)class436).getCustomName();
    }
    
    public static boolean method28306(final Class436 class436, final ITextComponent class437) {
        if (class436 instanceof Class460) {
            ((Class460)class436).method2335(class437);
            return true;
        }
        if (class436 instanceof Class465) {
            ((Class465)class436).method2384(class437);
            return true;
        }
        if (class436 instanceof Class463) {
            ((Class463)class436).method2344(class437);
            return true;
        }
        if (!(class436 instanceof Class490)) {
            return false;
        }
        ((Class490)class436).method2453(class437);
        return true;
    }
}
