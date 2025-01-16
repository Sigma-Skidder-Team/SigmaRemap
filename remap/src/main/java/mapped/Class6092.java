// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.render.CameraNoClip;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockReader;

public class Class6092
{
    private static String[] field24704;
    private boolean field24705;
    private IBlockReader field24706;
    private Entity field24707;
    private Vec3d field24708;
    private final Mutable field24709;
    private final Vector3f field24710;
    private final Vector3f field24711;
    private final Vector3f field24712;
    private float field24713;
    private float field24714;
    private final Quaternion field24715;
    private boolean field24716;
    private boolean field24717;
    private float field24718;
    private float field24719;
    
    public Class6092() {
        this.field24708 = Vec3d.ZERO;
        this.field24709 = new Mutable();
        this.field24710 = new Vector3f(0.0f, 0.0f, 1.0f);
        this.field24711 = new Vector3f(0.0f, 1.0f, 0.0f);
        this.field24712 = new Vector3f(1.0f, 0.0f, 0.0f);
        this.field24715 = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    }
    
    public void method18154(final IBlockReader field24706, final Entity field24707, final boolean field24708, final boolean field24709, final float n) {
        this.field24705 = true;
        this.field24706 = field24706;
        this.field24707 = field24707;
        this.field24716 = field24708;
        this.field24717 = field24709;
        this.method18158(field24707.getYaw(n), field24707.getPitch(n));
        this.method18159(MathHelper.lerp(n, field24707.prevPosX, field24707.getPosX()), MathHelper.lerp(n, field24707.prevPosY, field24707.getPosY()) + MathHelper.method35700(n, this.field24719, this.field24718), MathHelper.lerp(n, field24707.prevPosZ, field24707.getPosZ()));
        if (!field24708) {
            if (field24707 instanceof LivingEntity) {
                if (((LivingEntity)field24707).method2783()) {
                    final Direction method2788 = ((LivingEntity)field24707).method2788();
                    this.method18158((method2788 == null) ? 0.0f : (method2788.getHorizontalAngle() - 180.0f), 0.0f);
                    this.method18157(0.0, 0.3, 0.0);
                }
            }
        }
        else {
            if (field24709) {
                this.method18158(this.field24714 + 180.0f, -this.field24713);
            }
            this.method18157(-this.method18156(4.0), 0.0, 0.0);
        }
    }
    
    public void method18155() {
        if (this.field24707 != null) {
            this.field24719 = this.field24718;
            this.field24718 += (this.field24707.method1892() - this.field24718) * 0.5f;
        }
    }
    
    private double method18156(double n) {
        for (int i = 0; i < 8; ++i) {
            final float n2 = (float)((i & 0x1) * 2 - 1);
            final float n3 = (float)((i >> 1 & 0x1) * 2 - 1);
            final float n4 = (float)((i >> 2 & 0x1) * 2 - 1);
            final float n5 = n2 * 0.1f;
            final float n6 = n3 * 0.1f;
            final float n7 = n4 * 0.1f;
            final BlockRayTraceResult method6987 = this.field24706.rayTraceBlocks(new RayTraceContext(this.field24708.add(n5, n6, n7), new Vec3d(this.field24708.x - this.field24710.getX() * n + n5 + n7, this.field24708.y - this.field24710.getY() * n + n6, this.field24708.z - this.field24710.getZ() * n + n7), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this.field24707));
            if (method6987.getType() != RayTraceResult.Type.MISS) {
                final double method6988 = method6987.getHitVec().distanceTo(this.field24708);
                if (method6988 < n) {
                    if (!Client.method35173().method35189().method21551(CameraNoClip.class).method9906()) {
                        n = method6988;
                    }
                }
            }
        }
        return n;
    }
    
    public void method18157(final double n, final double n2, final double n3) {
        this.method18160(new Vec3d(this.field24708.x + (this.field24710.getX() * n + this.field24711.getX() * n2 + this.field24712.getX() * n3), this.field24708.y + (this.field24710.getY() * n + this.field24711.getY() * n2 + this.field24712.getY() * n3), this.field24708.z + (this.field24710.getZ() * n + this.field24711.getZ() * n2 + this.field24712.getZ() * n3)));
    }
    
    public void method18158(final float field24714, final float field24715) {
        this.field24713 = field24715;
        this.field24714 = field24714;
        this.field24715.method34906(0.0f, 0.0f, 0.0f, 1.0f);
        this.field24715.multiply(Vector3f.YP.rotationDegrees(-field24714));
        this.field24715.multiply(Vector3f.XP.rotationDegrees(field24715));
        this.field24710.set(0.0f, 0.0f, 1.0f);
        this.field24710.transform(this.field24715);
        this.field24711.set(0.0f, 1.0f, 0.0f);
        this.field24711.transform(this.field24715);
        this.field24712.set(1.0f, 0.0f, 0.0f);
        this.field24712.transform(this.field24715);
    }
    
    public void method18159(final double n, final double n2, final double n3) {
        this.method18160(new Vec3d(n, n2, n3));
    }
    
    public void method18160(final Vec3d field24708) {
        this.field24708 = field24708;
        this.field24709.method1286(field24708.x, field24708.y, field24708.z);
    }
    
    public Vec3d method18161() {
        return this.field24708;
    }
    
    public BlockPos method18162() {
        return this.field24709;
    }
    
    public float method18163() {
        return this.field24713;
    }
    
    public float method18164() {
        return this.field24714;
    }
    
    public Quaternion method18165() {
        return this.field24715;
    }
    
    public Entity method18166() {
        return this.field24707;
    }
    
    public boolean method18167() {
        return this.field24705;
    }
    
    public boolean method18168() {
        return this.field24716;
    }
    
    public IFluidState method18169() {
        if (this.field24705) {
            final IFluidState method6702 = this.field24706.getFluidState(this.field24709);
            return (!method6702.isEmpty() && this.field24708.y >= this.field24709.getY() + method6702.getActualHeight(this.field24706, this.field24709)) ? Class7558.field29974.getDefaultState() : method6702;
        }
        return Class7558.field29974.getDefaultState();
    }
    
    public BlockState method18170() {
        if (this.field24705) {
            return this.field24706.getBlockState(this.field24709);
        }
        return Class7521.field29147.getDefaultState();
    }
    
    public void method18171(final float field24714, final float field24715) {
        this.field24714 = field24714;
        this.field24713 = field24715;
    }
    
    public BlockState method18172() {
        if (this.field24705) {
            BlockState method6701 = this.field24706.getBlockState(this.field24709);
            if (Class9570.field41245.method22605()) {
                method6701 = (BlockState)Class9570.method35826(method6701, Class9570.field41245, this.field24706, this.field24709, this.field24708);
            }
            return method6701;
        }
        return Class7521.field29147.getDefaultState();
    }
    
    public final Vector3f method18173() {
        return this.field24710;
    }
    
    public final Vector3f method18174() {
        return this.field24711;
    }
    
    public void method18175() {
        this.field24706 = null;
        this.field24707 = null;
        this.field24705 = false;
    }
}
