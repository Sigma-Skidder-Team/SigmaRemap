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
    
    public static String method28302(final TileEntity tileEntity) {
        if (tileEntity instanceof INameable) {
            final INameable class437 = (INameable) tileEntity;
            method28303(tileEntity);
            return class437.hasCustomName() ? class437.getCustomName().getUnformattedComponentText() : null;
        }
        return null;
    }
    
    public static void method28303(final TileEntity tileEntity) {
        final BlockPos method2193 = tileEntity.method2193();
        if (method28305(tileEntity) == null) {
            ITextComponent method2194 = method28304(method2193);
            if (method2194 == null) {
                method2194 = new StringTextComponent("");
            }
            method28306(tileEntity, method2194);
        }
    }
    
    public static ITextComponent method28304(final BlockPos class354) {
        final TileEntity method31208 = Class8876.method31208(class354);
        if (method31208 != null) {
            return method28305(method31208);
        }
        return null;
    }
    
    public static ITextComponent method28305(final TileEntity tileEntity) {
        if (!(tileEntity instanceof INameable)) {
            return (tileEntity instanceof Class490) ? ((ITextComponent)Class9570.method35828(tileEntity, Class9570.field41591)) : null;
        }
        return ((INameable) tileEntity).getCustomName();
    }
    
    public static boolean method28306(final TileEntity tileEntity, final ITextComponent class437) {
        if (tileEntity instanceof Class460) {
            ((Class460) tileEntity).method2335(class437);
            return true;
        }
        if (tileEntity instanceof Class465) {
            ((Class465) tileEntity).method2384(class437);
            return true;
        }
        if (tileEntity instanceof Class463) {
            ((Class463) tileEntity).method2344(class437);
            return true;
        }
        if (!(tileEntity instanceof Class490)) {
            return false;
        }
        ((Class490) tileEntity).method2453(class437);
        return true;
    }
}
