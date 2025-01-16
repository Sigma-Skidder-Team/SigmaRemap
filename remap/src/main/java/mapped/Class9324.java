// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Collection;
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.Logger;

public class Class9324
{
    private static String[] field40033;
    private static final Logger field40034;
    
    public static void method34529(final Class1849 class1849, final BlockPos class1850, final String s, final int n, final int n2) {
        final PacketBuffer class1851 = new PacketBuffer(Unpooled.buffer());
        class1851.method29495(class1850);
        class1851.writeInt(n);
        class1851.method29514(s);
        class1851.writeInt(n2);
        method34543(class1849, class1851, Class4376.field19604);
    }
    
    public static void method34530(final Class1849 class1849) {
        method34543(class1849, new PacketBuffer(Unpooled.buffer()), Class4376.field19605);
    }
    
    public static void method34531(final Class1849 class1849, final Class7859 class1850) {
    }
    
    public static void method34532(final Class1849 class1849, final BlockPos class1850) {
    }
    
    public static void method34533(final Class1849 class1849, final BlockPos class1850) {
    }
    
    public static void method34534(final Class1849 class1849, final BlockPos class1850) {
    }
    
    public static void method34535(final World class1847, final Class759 class1848, final Class9468 class1849, final float n) {
    }
    
    public static void method34536(final World class1847, final BlockPos class1848) {
    }
    
    public static void method34537(final Class1851 class1851, final Class5936 class1852) {
    }
    
    public static void method34538(final World class1847, final Class759 class1848, final Class7189 class1849) {
    }
    
    public static void method34539(final Class1849 class1849, final Collection<Class8792> collection) {
    }
    
    public static void method34540(final LivingEntity class511) {
    }
    
    public static void method34541(final Class798 class798) {
    }
    
    public static void method34542(final Class438 class438) {
    }
    
    private static void method34543(final Class1849 class1849, final PacketBuffer class1850, final ResourceLocation class1851) {
        final Class4376 class1852 = new Class4376(class1851, class1850);
        final Iterator<? extends Class512> iterator = class1849.method6744().method6840().iterator();
        while (iterator.hasNext()) {
            ((Class513)iterator.next()).field3039.method17469(class1852);
        }
    }
    
    static {
        field40034 = LogManager.getLogger();
    }
}
