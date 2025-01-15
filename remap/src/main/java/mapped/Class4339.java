// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.io.IOException;
import java.util.UUID;

public class Class4339 implements Class4252<Class5800>
{
    private static String[] field19423;
    private int field19424;
    private UUID field19425;
    private double field19426;
    private double field19427;
    private double field19428;
    private int field19429;
    private int field19430;
    private int field19431;
    private int field19432;
    private int field19433;
    private Class7499<?> field19434;
    private int field19435;
    
    public Class4339() {
    }
    
    public Class4339(final int field19424, final UUID field19425, final double field19426, final double field19427, final double field19428, final float n, final float n2, final Class7499<?> field19429, final int field19430, final Vec3d class5487) {
        this.field19424 = field19424;
        this.field19425 = field19425;
        this.field19426 = field19426;
        this.field19427 = field19427;
        this.field19428 = field19428;
        this.field19432 = MathHelper.method35642(n * 256.0f / 360.0f);
        this.field19433 = MathHelper.method35642(n2 * 256.0f / 360.0f);
        this.field19434 = field19429;
        this.field19435 = field19430;
        this.field19429 = (int)(MathHelper.method35654(class5487.x, -3.9, 3.9) * 8000.0);
        this.field19430 = (int)(MathHelper.method35654(class5487.y, -3.9, 3.9) * 8000.0);
        this.field19431 = (int)(MathHelper.method35654(class5487.z, -3.9, 3.9) * 8000.0);
    }
    
    public Class4339(final Entity class399) {
        this(class399, 0);
    }
    
    public Class4339(final Entity class399, final int n) {
        this(class399.method1643(), class399.method1865(), class399.getPosX(), class399.getPosY(), class399.getPosZ(), class399.field2400, class399.field2399, class399.method1642(), n, class399.method1935());
    }
    
    public Class4339(final Entity class399, final Class7499<?> class400, final int n, final BlockPos class401) {
        this(class399.method1643(), class399.method1865(), class401.getX(), class401.getY(), class401.getZ(), class399.field2400, class399.field2399, class400, n, class399.method1935());
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19424 = class8654.method29501();
        this.field19425 = class8654.method29504();
        this.field19434 = Class90.field210.method499(class8654.method29501());
        this.field19426 = class8654.readDouble();
        this.field19427 = class8654.readDouble();
        this.field19428 = class8654.readDouble();
        this.field19432 = class8654.readByte();
        this.field19433 = class8654.readByte();
        this.field19435 = class8654.readInt();
        this.field19429 = class8654.readShort();
        this.field19430 = class8654.readShort();
        this.field19431 = class8654.readShort();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19424);
        class8654.method29503(this.field19425);
        class8654.method29505(Class90.field210.method504(this.field19434));
        class8654.writeDouble(this.field19426);
        class8654.writeDouble(this.field19427);
        class8654.writeDouble(this.field19428);
        class8654.writeByte(this.field19432);
        class8654.writeByte(this.field19433);
        class8654.writeInt(this.field19435);
        class8654.writeShort(this.field19429);
        class8654.writeShort(this.field19430);
        class8654.writeShort(this.field19431);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17273(this);
    }
    
    public int method13023() {
        return this.field19424;
    }
    
    public UUID method13024() {
        return this.field19425;
    }
    
    public double method13025() {
        return this.field19426;
    }
    
    public double method13026() {
        return this.field19427;
    }
    
    public double method13027() {
        return this.field19428;
    }
    
    public double method13028() {
        return this.field19429 / 8000.0;
    }
    
    public double method13029() {
        return this.field19430 / 8000.0;
    }
    
    public double method13030() {
        return this.field19431 / 8000.0;
    }
    
    public int method13031() {
        return this.field19432;
    }
    
    public int method13032() {
        return this.field19433;
    }
    
    public Class7499<?> method13033() {
        return this.field19434;
    }
    
    public int method13034() {
        return this.field19435;
    }
}
