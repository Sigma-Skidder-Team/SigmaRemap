// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;

public abstract class Class4475 extends Class4473
{
    public final int field19857;
    public final int field19858;
    public final int field19859;
    public int field19860;
    
    public Class4475(final Class9520 class9520, final Random random, final int n, final int n2, final int n3, final int field19857, final int field19858, final int field19859) {
        super(class9520, 0);
        this.field19860 = -1;
        this.field19857 = field19857;
        this.field19858 = field19858;
        this.field19859 = field19859;
        this.method13456(Plane.HORIZONTAL.method576(random));
        if (this.method13455().getAxis() != Direction.Axis.Z) {
            this.field19849 = new MutableBoundingBox(n, n2, n3, n + field19859 - 1, n2 + field19858 - 1, n3 + field19857 - 1);
        }
        else {
            this.field19849 = new MutableBoundingBox(n, n2, n3, n + field19857 - 1, n2 + field19858 - 1, n3 + field19859 - 1);
        }
    }
    
    public Class4475(final Class9520 class9520, final Class51 class9521) {
        super(class9520, class9521);
        this.field19860 = -1;
        this.field19857 = class9521.method319("Width");
        this.field19858 = class9521.method319("Height");
        this.field19859 = class9521.method319("Depth");
        this.field19860 = class9521.method319("HPos");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        class51.method298("Width", this.field19857);
        class51.method298("Height", this.field19858);
        class51.method298("Depth", this.field19859);
        class51.method298("HPos", this.field19860);
    }
    
    public boolean method13460(final Class1851 class1851, final MutableBoundingBox class1852, final int n) {
        if (this.field19860 >= 0) {
            return true;
        }
        int n2 = 0;
        int n3 = 0;
        final Mutable class1853 = new Mutable();
        for (int i = this.field19849.minZ; i <= this.field19849.maxZ; ++i) {
            for (int j = this.field19849.minX; j <= this.field19849.maxX; ++j) {
                class1853.setPos(j, 64, i);
                if (class1852.isVecInside(class1853)) {
                    n2 += class1851.method6958(Class2020.field11526, class1853).getY();
                    ++n3;
                }
            }
        }
        if (n3 != 0) {
            this.field19860 = n2 / n3;
            this.field19849.offset(0, this.field19860 - this.field19849.minY + n, 0);
            return true;
        }
        return false;
    }
}
