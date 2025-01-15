// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Random;

public class Class8615
{
    private static String[] field36151;
    private int field36152;
    
    public int method29217(final Class1849 class1849, final boolean b, final boolean b2) {
        if (!b2 || !class1849.method6765().method31216(Class8878.field37318)) {
            return 0;
        }
        --this.field36152;
        if (this.field36152 > 0) {
            return 0;
        }
        this.field36152 = 1200;
        final Class513 method6884 = class1849.method6884();
        if (method6884 == null) {
            return 0;
        }
        final Random field10062 = class1849.field10062;
        final BlockPos method6885 = new BlockPos(method6884).method1134((8 + field10062.nextInt(24)) * (field10062.nextBoolean() ? -1 : 1), 0, (8 + field10062.nextInt(24)) * (field10062.nextBoolean() ? -1 : 1));
        if (class1849.method6973(method6885.getX() - 10, method6885.getY() - 10, method6885.getZ() - 10, method6885.getX() + 10, method6885.getY() + 10, method6885.getZ() + 10)) {
            if (Class8532.method28621(Class2194.field13354, class1849, method6885, Class7499.field28964)) {
                if (class1849.method6924(method6885, 2)) {
                    return this.method29218(class1849, method6885);
                }
                if (Class4535.field19965.method13590(class1849, method6885)) {
                    return this.method29219(class1849, method6885);
                }
            }
            return 0;
        }
        return 0;
    }
    
    private int method29218(final Class1849 class1849, final BlockPos class1850) {
        if (class1849.method6921().method7198(Class8912.field37476.method31396(), class1850, 48, Class2045.field11651) > 4L && class1849.method7128((Class<? extends Entity>)Class800.class, new Class6221(class1850).method18495(48.0, 8.0, 48.0)).size() < 5) {
            return this.method29220(class1850, class1849);
        }
        return 0;
    }
    
    private int method29219(final Class1847 class1847, final BlockPos class1848) {
        return (class1847.method7128((Class<? extends Entity>)Class800.class, new Class6221(class1848).method18495(16.0, 8.0, 16.0)).size() >= 1) ? 0 : this.method29220(class1848, class1847);
    }
    
    private int method29220(final BlockPos class354, final Class1847 class355) {
        final Class800 class356 = Class7499.field28964.method23371(class355);
        if (class356 != null) {
            class356.method4188(class355, class355.method6784(class354), Class2101.field12174, null, null);
            class356.method1729(class354, 0.0f, 0.0f);
            class355.method6886(class356);
            return 1;
        }
        return 0;
    }
}
