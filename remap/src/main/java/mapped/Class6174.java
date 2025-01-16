// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class6174 extends Class6173
{
    private static String[] field24960;
    private final Class3442 field24961;
    private final Entity field24962;
    private final Entity field24963;
    private int field24964;
    private final Class8551 field24965;
    
    public Class6174(final Class8551 class8551, final Class3442 class8552, final World class8553, final Entity class8554, final Entity class8555) {
        this(class8551, class8552, class8553, class8554, class8555, class8554.getMotion());
    }
    
    private Class6174(final Class8551 field24965, final Class3442 field24966, final World class1847, final Entity field24967, final Entity field24968, final Vec3d class1848) {
        super(class1847, field24967.getPosX(), field24967.getPosY(), field24967.getPosZ(), class1848.x, class1848.y, class1848.z);
        this.field24961 = field24966;
        this.field24962 = field24967;
        this.field24963 = field24968;
        this.field24965 = field24965;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25662;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        Class9023 field39287 = null;
        if (Config.method28955()) {
            field39287 = Class9216.field39287;
            Class9216.method33835(this.field24962);
        }
        final float n2 = (this.field24964 + n) / 3.0f;
        final float n3 = n2 * n2;
        final double method35701 = MathHelper.method35701(n, this.field24963.lastTickPosX, this.field24963.getPosX());
        final double n4 = MathHelper.method35701(n, this.field24963.lastTickPosY, this.field24963.getPosY()) + 0.5;
        final double method35702 = MathHelper.method35701(n, this.field24963.lastTickPosZ, this.field24963.getPosZ());
        final double method35703 = MathHelper.method35701(n3, this.field24962.getPosX(), method35701);
        final double method35704 = MathHelper.method35701(n3, this.field24962.getPosY(), n4);
        final double method35705 = MathHelper.method35701(n3, this.field24962.getPosZ(), method35702);
        final Class7808 method35706 = this.field24961.method11006();
        final Vec3d method35707 = class4151.method18161();
        this.field24965.method28706(this.field24962, method35703 - method35707.getX(), method35704 - method35707.getY(), method35705 - method35707.getZ(), this.field24962.rotationYaw, n, new Class7351(), method35706, this.field24965.method28695(this.field24962, n));
        method35706.method25216();
        if (Config.method28955()) {
            Class9216.method33836(null);
            Class9216.method33776(field39287);
        }
    }
    
    @Override
    public void method18420() {
        ++this.field24964;
        if (this.field24964 == 3) {
            this.method18439();
        }
    }
}
