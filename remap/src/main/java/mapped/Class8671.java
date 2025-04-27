// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class8671
{
    private static String[] field36452;
    private boolean field36453;
    private Class2073 field36454;
    private int field36455;
    private int field36456;
    private int field36457;
    private int field36458;
    private int field36459;
    
    public Class8671() {
        this.field36454 = Class2073.field11961;
    }
    
    public int method29680(final Class1849 class1849, final boolean b, final boolean b2) {
        if (class1849.method6703() || !b) {
            this.field36454 = Class2073.field11961;
            this.field36453 = false;
            return 0;
        }
        if (class1849.method6952(0.0f) == 0.5) {
            this.field36454 = ((class1849.rand.nextInt(10) != 0) ? Class2073.field11961 : Class2073.field11960);
        }
        if (this.field36454 == Class2073.field11961) {
            return 0;
        }
        if (!this.field36453) {
            if (!this.method29681(class1849)) {
                return 0;
            }
            this.field36453 = true;
        }
        if (this.field36456 <= 0) {
            this.field36456 = 2;
            if (this.field36455 <= 0) {
                this.field36454 = Class2073.field11961;
            }
            else {
                this.method29682(class1849);
                --this.field36455;
            }
            return 1;
        }
        --this.field36456;
        return 0;
    }
    
    private boolean method29681(final Class1849 class1849) {
        for (final PlayerEntity class1850 : class1849.getPlayers()) {
            if (class1850.isSpectator()) {
                continue;
            }
            final BlockPos method1894 = class1850.method1894();
            if (!class1849.method6922(method1894)) {
                continue;
            }
            if (class1849.method6959(method1894).method9870() == Class2140.field12600) {
                continue;
            }
            for (int i = 0; i < 10; ++i) {
                final float n = class1849.rand.nextFloat() * 6.2831855f;
                this.field36457 = method1894.getX() + MathHelper.method35642(MathHelper.cos(n) * 32.0f);
                this.field36458 = method1894.getY();
                this.field36459 = method1894.getZ() + MathHelper.method35642(MathHelper.sin(n) * 32.0f);
                if (this.method29683(class1849, new BlockPos(this.field36457, this.field36458, this.field36459)) != null) {
                    this.field36456 = 0;
                    this.field36455 = 20;
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    private void method29682(final Class1849 class1849) {
        final Vec3d method29683 = this.method29683(class1849, new BlockPos(this.field36457, this.field36458, this.field36459));
        if (method29683 != null) {
            Class827 class1850;
            try {
                class1850 = new Class827(class1849);
                class1850.method4188(class1849, class1849.method6784(new BlockPos(class1850)), Class2101.field12181, null, null);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
                return;
            }
            class1850.method1730(method29683.x, method29683.y, method29683.z, class1849.rand.nextFloat() * 360.0f, 0.0f);
            class1849.method6886(class1850);
        }
    }
    
    @Nullable
    private Vec3d method29683(final Class1849 class1849, final BlockPos class1850) {
        for (int i = 0; i < 10; ++i) {
            final int n = class1850.getX() + class1849.rand.nextInt(16) - 8;
            final int n2 = class1850.getZ() + class1849.rand.nextInt(16) - 8;
            final BlockPos class1851 = new BlockPos(n, class1849.method6699(HeightmapType.field11522, n, n2), n2);
            if (class1849.method6922(class1851) && Class763.method4230(EntityType.field29052, class1849, Class2101.field12181, class1851, class1849.rand)) {
                return new Vec3d(class1851.getX() + 0.5, class1851.getY(), class1851.getZ() + 0.5);
            }
        }
        return null;
    }
}
