// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8353
{
    private static String[] field34279;
    private static Minecraft field34280;
    
    public static boolean method27875(final Class8733 class8733) {
        boolean b = true;
        final Iterator<Long> iterator = class8733.field36693.iterator();
        while (iterator.hasNext()) {
            if (Class8353.field34280.world.getBlockState(BlockPos.fromLong(iterator.next())).method21706()) {
                continue;
            }
            b = false;
            break;
        }
        return b;
    }
    
    public static boolean method27876() {
        return Class8353.field34280.field4684.onGround && Class8353.field34280.world.method6981(Class8353.field34280.field4684, Class8353.field34280.field4684.getBoundingBox().offset(0.0, 1.0, 0.0)).count() == 0L;
    }
    
    static {
        Class8353.field34280 = Minecraft.method5277();
    }
}
