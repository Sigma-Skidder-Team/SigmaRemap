// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Iterator;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Map;

public class Class8551
{
    private static final Class6332 field35899;
    private final Map<EntityType<?>, Class4703<?>> field35900;
    private final Map<String, Class4711> field35901;
    private final Class4711 field35902;
    private final Class1844 field35903;
    public final Class1663 field35904;
    private World field35905;
    public Class6092 field35906;
    private Quaternion field35907;
    public Entity field35908;
    public final Class5760 field35909;
    private boolean field35910;
    private boolean field35911;
    public Class4703 field35912;
    
    public <E extends Entity> int method28695(final E e, final float n) {
        int n2 = this.method28699(e).method13953(e, n);
        if (Config.method29002()) {
            n2 = Class8850.method30991(e, n2);
        }
        return n2;
    }
    
    private <T extends Entity> void method28696(final EntityType<T> class7499, final Class4703<? super T> class7500) {
        this.field35900.put(class7499, class7500);
    }
    
    private void method28697(final Class1796 class1796, final Class6580 class1797) {
        this.method28696(EntityType.field28957, new Class4783(this));
        this.method28696(EntityType.field28958, (Class4703<? super Class857>)new Class4779(this));
        this.method28696(EntityType.field28959, new Class4786(this));
        this.method28696(EntityType.field28960, (Class4703<? super Class856>)new Class4742(this));
        this.method28696(EntityType.field28961, (Class4703<? super Class798>)new Class4736(this));
        this.method28696(EntityType.field28962, (Class4703<? super Class849>)new Class4777(this));
        this.method28696(EntityType.field28963, new Class4704(this));
        this.method28696(EntityType.field28964, (Class4703<? super Class800>)new Class4732(this));
        this.method28696(EntityType.field28965, (Class4703<? super Class847>)new Class4769(this));
        this.method28696(EntityType.field29000, new Class4708<Object>(this));
        this.method28696(EntityType.field28966, (Class4703<? super Class818>)new Class4743(this));
        this.method28696(EntityType.field28967, (Class4703<? super Class836>)new Class4735(this));
        this.method28696(EntityType.field29001, new Class4708<Object>(this));
        this.method28696(EntityType.field28968, (Class4703<? super Class804>)new Class4728(this));
        this.method28696(EntityType.field28969, (Class4703<? super Class765>)new Class4774(this));
        this.method28696(EntityType.field28971, (Class4703<? super Class840>)new Class4717(this));
        this.method28696(EntityType.field28970, (Class4703<? super Class814>)new Class4761(this, 0.87f));
        this.method28696(EntityType.field28972, new Class4782(this));
        this.method28696(EntityType.field28973, (Class4703<? super Class830>)new Class4751(this));
        this.method28696(EntityType.field29036, new Class4781<Object>(this, class1796));
        this.method28696(EntityType.field28974, (Class4703<? super Class845>)new Class4765(this));
        this.method28696(EntityType.field28975, new Class4702(this));
        this.method28696(EntityType.field28976, new Class4794(this));
        this.method28696(EntityType.field28977, (Class4703<? super Class850>)new Class4730(this));
        this.method28696(EntityType.field28978, (Class4703<? super Class842>)new Class4763(this));
        this.method28696(EntityType.field29037, new Class4781<Object>(this, class1796));
        this.method28696(EntityType.field28979, new Class4795(this));
        this.method28696(EntityType.field28980, (Class4703<? super Class771>)new Class4726(this));
        this.method28696(EntityType.field29038, new Class4781<Object>(this, class1796));
        this.method28696(EntityType.field28981, new Class4797(this));
        this.method28696(EntityType.field28982, new Class4781<Object>(this, class1796, 1.0f, true));
        this.method28696(EntityType.field28983, new Class4796(this));
        this.method28696(EntityType.field28994, new Class4781<Object>(this, class1796, 3.0f, true));
        this.method28696(EntityType.field28984, new Class4706(this, class1796));
        this.method28696(EntityType.field29059, new Class4789(this));
        this.method28696(EntityType.field28985, (Class4703<? super Class803>)new Class4731(this));
        this.method28696(EntityType.field29002, new Class4708<Object>(this));
        this.method28696(EntityType.field28986, (Class4703<? super Class761>)new Class4758(this));
        this.method28696(EntityType.field28987, (Class4703<? super Class764>)new Class4719(this, 6.0f));
        this.method28696(EntityType.field28988, (Class4703<? super Class844>)new Class4764(this));
        this.method28696(EntityType.field29003, new Class4708<Object>(this));
        this.method28696(EntityType.field28989, (Class4703<? super Class808>)new Class4762(this));
        this.method28696(EntityType.field28990, (Class4703<? super Class829>)new Class4750(this));
        this.method28696(EntityType.field28991, (Class4703<? super Class769>)new Class4727(this));
        this.method28696(EntityType.field29043, (Class4703<? super Class786>)new Class4740(this));
        this.method28696(EntityType.field28993, new Class4791(this, class1796));
        this.method28696(EntityType.field28992, new Class4790(this, class1796));
        this.method28696(EntityType.field28995, new Class4707(this));
        this.method28696(EntityType.field29057, new Class4784(this));
        this.method28696(EntityType.field28996, (Class4703<? super Class815>)new Class4718(this));
        this.method28696(EntityType.field28997, new Class4792(this));
        this.method28696(EntityType.field28998, (Class4703<? super Class854>)new Class4738(this));
        this.method28696(EntityType.field28999, new Class4708<Object>(this));
        this.method28696(EntityType.field29007, (Class4703<? super Class805>)new Class4713(this));
        this.method28696(EntityType.field29006, (Class4703<? super Class813>)new Class4761(this, 0.92f));
        this.method28696(EntityType.field29008, (Class4703<? super Class817>)new Class4776(this));
        this.method28696(EntityType.field29009, new Class4780(this));
        this.method28696(EntityType.field29010, (Class4703<? super Class791>)new Class4771(this));
        this.method28696(EntityType.field29011, (Class4703<? super Class796>)new Class4715(this));
        this.method28696(EntityType.field29055, (Class4703<? super Class851>)new Class4722(this));
        this.method28696(EntityType.field29012, (Class4703<? super Class801>)new Class4775(this));
        this.method28696(EntityType.field29045, (Class4703<? super Class773>)new Class4725(this));
        this.method28696(EntityType.field29015, (Class4703<? super Class790>)new Class4734(this));
        this.method28696(EntityType.field29039, new Class4781<Object>(this, class1796));
        this.method28696(EntityType.field29013, (Class4703<? super Class838>)new Class4741(this));
        this.method28696(EntityType.field29017, (Class4703<? super Class792>)new Class4737(this));
        this.method28696(EntityType.field29056, (Class4703<? super Class779>)new Class4766(this));
        this.method28696(EntityType.field29018, (Class4703<? super Class837>)new Class4720(this));
        this.method28696(EntityType.field29019, (Class4703<? super Class802>)new Class4729(this));
        this.method28696(EntityType.field29021, new Class4798(this));
        this.method28696(EntityType.field29020, (Class4703<? super Class841>)new Class4714(this));
        this.method28696(EntityType.field29022, (Class4703<? super Class848>)new Class4733(this));
        this.method28696(EntityType.field29024, (Class4703<? super Class809>)new Class4760(this));
        this.method28696(EntityType.field29023, (Class4703<? super Class782>)new Class4754(this));
        this.method28696(EntityType.field29025, (Class4703<? super Class853>)new Class4772(this));
        this.method28696(EntityType.field29026, new Class4781<Object>(this, class1796, 0.75f, true));
        this.method28696(EntityType.field29028, new Class4781<Object>(this, class1796));
        this.method28696(EntityType.field29027, (Class4703<? super Class784>)new Class4721(this));
        this.method28696(EntityType.field29004, new Class4708<Object>(this));
        this.method28696(EntityType.field29029, new Class4787(this));
        this.method28696(EntityType.field29030, (Class4703<? super Class846>)new Class4768(this));
        this.method28696(EntityType.field29031, (Class4703<? super Class839>)new Class4745(this));
        this.method28696(EntityType.field29032, (Class4703<? super Class783>)new Class4756(this));
        this.method28696(EntityType.field29005, new Class4709(this));
        this.method28696(EntityType.field29016, new Class4788(this));
        this.method28696(EntityType.field29033, (Class4703<? super Class816>)new Class4718(this));
        this.method28696(EntityType.field29040, new Class4793(this));
        this.method28696(EntityType.field29034, (Class4703<? super Class835>)new Class4773(this));
        this.method28696(EntityType.field29035, (Class4703<? super Class793>)new Class4739(this));
        this.method28696(EntityType.field29041, (Class4703<? super Class843>)new Class4753(this));
        this.method28696(EntityType.field29042, (Class4703<? super Class824>)new Class4757(this, class1797));
        this.method28696(EntityType.field29044, (Class4703<? super Class775>)new Class4724(this));
        this.method28696(EntityType.field29046, (Class4703<? super Class821>)new Class4767(this));
        this.method28696(EntityType.field29047, (Class4703<? super Class778>)new Class4716(this));
        this.method28696(EntityType.field29048, (Class4703<? super Class767>)new Class4770(this));
        this.method28696(EntityType.field29049, (Class4703<? super Class781>)new Class4755(this));
        this.method28696(EntityType.field29050, new Class4705(this));
        this.method28696(EntityType.field29051, (Class4703<? super Class799>)new Class4744(this));
        this.method28696(EntityType.field29053, (Class4703<? super Class811>)new Class4760(this));
        this.method28696(EntityType.field29052, (Class4703<? super Class827>)new Class4749(this));
        this.method28696(EntityType.field29014, (Class4703<? super Class828>)new Class4752(this));
        this.method28696(EntityType.field29054, (Class4703<? super Class826>)new Class4747(this, class1797));
        Class1811.method6572(this.field35901);
    }
    
    public Class8551(final Class1663 field35904, final Class1796 class1796, final Class6580 class1797, final Class1844 field35905, final Class5760 field35906) {
        this.field35900 = Maps.newHashMap();
        this.field35901 = Maps.newHashMap();
        this.field35910 = true;
        this.field35912 = null;
        this.field35904 = field35904;
        this.field35903 = field35905;
        this.field35909 = field35906;
        this.method28697(class1796, class1797);
        this.field35902 = new Class4711(this);
        this.field35901.put("default", this.field35902);
        this.field35901.put("slim", new Class4711(this, true));
    }
    
    public void method28698() {
        for (final EntityType class7499 : Registry.field210) {
            if (class7499 != EntityType.field29058 && !this.field35900.containsKey(class7499)) {
                throw new IllegalStateException("No renderer registered for " + Registry.field210.getKey(class7499));
            }
        }
    }
    
    public <T extends Entity> Class4703<? super T> method28699(final T t) {
        if (!(t instanceof Class754)) {
            return (Class4703)this.field35900.get(t.getType());
        }
        final Class4711 class4711 = this.field35901.get(((Class754)t).method4103());
        return (Class4703<? super T>)((class4711 == null) ? this.field35902 : class4711);
    }
    
    public void method28700(final World field35905, final Class6092 field35906, final Entity field35907) {
        this.field35905 = field35905;
        this.field35906 = field35906;
        this.field35907 = field35906.method18165();
        this.field35908 = field35907;
    }
    
    public void method28701(final Quaternion field35907) {
        this.field35907 = field35907;
    }
    
    public void method28702(final boolean field35910) {
        this.field35910 = field35910;
    }
    
    public void method28703(final boolean field35911) {
        this.field35911 = field35911;
    }
    
    public boolean method28704() {
        return this.field35911;
    }
    
    public <E extends Entity> boolean method28705(final E e, final Class6664 class6664, final double n, final double n2, final double n3) {
        return this.method28699(e).method13952(e, class6664, n, n2, n3);
    }
    
    public <E extends Entity> void method28706(final E e, final double n, final double n2, final double n3, final float f, final float f2, final Class7351 class7351, final Class7807 class7352, final int n4) {
        if (Class3375.field16048 && (e instanceof Class857 || e instanceof Class764 || e instanceof Class862)) {
            return;
        }
        if (this.field35906 != null) {
            final Class4703<? super E> method28699 = this.method28699(e);
            try {
                final Vec3d method28700 = method28699.method13955(e, f2);
                final double n5 = n + method28700.getX();
                final double n6 = n2 + method28700.getY();
                final double n7 = n3 + method28700.getZ();
                class7351.method22567();
                class7351.method22564(n5, n6, n7);
                if (Class8906.method31391()) {
                    this.field35912 = method28699;
                }
                method28699.method13951(e, f, f2, class7351, class7352, n4);
                if (e.method1863()) {
                    this.method28709(class7351, class7352, e);
                }
                class7351.method22564(-method28700.getX(), -method28700.getY(), -method28700.getZ());
                if (this.field35909.field23420 && this.field35910 && method28699.field20284 > 0.0f && !e.method1823()) {
                    final float n8 = (float)((1.0 - this.method28716(e.getPosX(), e.getPosY(), e.getPosZ()) / 256.0) * method28699.field20285);
                    if (n8 > 0.0f) {
                        method28711(class7351, class7352, e, n8, f2, this.field35905, method28699.field20284);
                    }
                }
                if (this.field35911 && !e.method1823() && !Class869.method5277().method5317()) {
                    this.method28707(class7351, class7352.method25214(Class6332.method18791()), e, f2);
                }
                class7351.method22568();
            }
            catch (final Throwable t) {
                final Class7689 method28701 = Class7689.method24421(t, "Rendering entity in world");
                e.method1862(method28701.method24418("Entity being rendered"));
                final Class5204 method28702 = method28701.method24418("Renderer details");
                method28702.method16297("Assigned renderer", method28699);
                method28702.method16297("Location", Class5204.method16293(n, n2, n3));
                method28702.method16297("Rotation", f);
                method28702.method16297("Delta", f2);
                throw new Class2365(method28701);
            }
        }
    }
    
    private void method28707(final Class7351 class7351, final Class4150 class7352, final Entity class7353, final float n) {
        final float n2 = class7353.method1930() / 2.0f;
        this.method28708(class7351, class7352, class7353, 1.0f, 1.0f, 1.0f);
        if (class7353 instanceof Class852) {
            final double n3 = class7353.getPosX() - MathHelper.method35701(n, class7353.lastTickPosX, class7353.getPosX());
            final double n4 = class7353.getPosY() - MathHelper.method35701(n, class7353.lastTickPosY, class7353.getPosY());
            final double n5 = class7353.getPosZ() - MathHelper.method35701(n, class7353.lastTickPosZ, class7353.getPosZ());
            for (final Class859 class7354 : ((Class852)class7353).method5123()) {
                class7351.method22567();
                class7351.method22564(n3 + MathHelper.method35701(n, class7354.lastTickPosX, class7354.getPosX()), n4 + MathHelper.method35701(n, class7354.lastTickPosY, class7354.getPosY()), n5 + MathHelper.method35701(n, class7354.lastTickPosZ, class7354.getPosZ()));
                this.method28708(class7351, class7352, class7354, 0.25f, 1.0f, 0.0f);
                class7351.method22568();
            }
        }
        if (class7353 instanceof LivingEntity) {
            Class1656.method5732(class7351, class7352, -n2, class7353.method1892() - 0.01f, -n2, n2, class7353.method1892() + 0.01f, n2, 1.0f, 0.0f, 0.0f, 1.0f);
        }
        final Vec3d method5124 = class7353.method1741(n);
        final Matrix4f method5125 = class7351.method22569().method32111();
        class7352.method12444(method5125, 0.0f, class7353.method1892(), 0.0f).method12399(0, 0, 255, 255).method12397();
        class7352.method12444(method5125, (float)(method5124.x * 2.0), (float)(class7353.method1892() + method5124.y * 2.0), (float)(method5124.z * 2.0)).method12399(0, 0, 255, 255).method12397();
    }
    
    private void method28708(final Class7351 class7351, final Class4150 class7352, final Entity class7353, final float n, final float n2, final float n3) {
        Class1656.method5731(class7351, class7352, class7353.getBoundingBox().method18499(-class7353.getPosX(), -class7353.getPosY(), -class7353.getPosZ()), n, n2, n3, 1.0f);
    }
    
    private void method28709(final Class7351 class7351, final Class7807 class7352, final Entity class7353) {
        final Class1912 method11332 = Class7637.field30237.method11332();
        final Class1912 method11333 = Class7637.field30238.method11332();
        class7351.method22567();
        final float n = class7353.method1930() * 1.4f;
        class7351.method22565(n, n, n);
        float n2 = 0.5f;
        float n3 = class7353.method1931() / n;
        float n4 = 0.0f;
        class7351.method22566(Vector3f.YP.rotationDegrees(-this.field35906.method18164()));
        class7351.method22564(0.0, 0.0, -0.3f + (int)n3 * 0.02f);
        float n5 = 0.0f;
        int n6 = 0;
        final Class4150 method11334 = class7352.method25214(Class8752.method30264());
        final boolean method11335 = Config.method28928();
        if (method11335) {
            method11334.method12412(Class9484.field40759);
        }
        final Class8996 method11336 = class7351.method22569();
        while (n3 > 0.0f) {
            final Class1912 class7354 = (n6 % 2 != 0) ? method11333 : method11332;
            method11334.method12407(class7354);
            float method11337 = class7354.method7497();
            final float method11338 = class7354.method7500();
            float method11339 = class7354.method7498();
            final float method11340 = class7354.method7501();
            if (n6 / 2 % 2 == 0) {
                final float n7 = method11339;
                method11339 = method11337;
                method11337 = n7;
            }
            method28710(method11336, method11334, n2 - 0.0f, 0.0f - n4, n5, method11339, method11340);
            method28710(method11336, method11334, -n2 - 0.0f, 0.0f - n4, n5, method11337, method11340);
            method28710(method11336, method11334, -n2 - 0.0f, 1.4f - n4, n5, method11337, method11338);
            method28710(method11336, method11334, n2 - 0.0f, 1.4f - n4, n5, method11339, method11338);
            n3 -= 0.45f;
            n4 -= 0.45f;
            n2 *= 0.9f;
            n5 += 0.03f;
            ++n6;
        }
        if (method11335) {
            method11334.method12412(null);
            Class8933.method31666();
        }
        class7351.method22568();
    }
    
    private static void method28710(final Class8996 class8996, final Class4150 class8997, final float n, final float n2, final float n3, final float n4, final float n5) {
        class8997.method12444(class8996.method32111(), n, n2, n3).method12399(255, 255, 255, 255).method12391(n4, n5).method12433(0, 10).method12440(240).method12445(class8996.method32112(), 0.0f, 1.0f, 0.0f).method12397();
    }
    
    private static void method28711(final Class7351 class7351, final Class7807 class7352, final Entity class7353, final float n, final float n2, final Class1852 class7354, final float n3) {
        if (!Config.method28955() || !Class9216.field39233) {
            float n4 = n3;
            if (class7353 instanceof Class759) {
                if (((Class759)class7353).method2625()) {
                    n4 = n3 * 0.5f;
                }
            }
            final double method35701 = MathHelper.method35701(n2, class7353.lastTickPosX, class7353.getPosX());
            final double method35702 = MathHelper.method35701(n2, class7353.lastTickPosY, class7353.getPosY());
            final double method35703 = MathHelper.method35701(n2, class7353.lastTickPosZ, class7353.getPosZ());
            final int method35704 = MathHelper.floor(method35701 - n4);
            final int method35705 = MathHelper.floor(method35701 + n4);
            final int method35706 = MathHelper.floor(method35702 - n4);
            final int method35707 = MathHelper.floor(method35702);
            final int method35708 = MathHelper.floor(method35703 - n4);
            final int method35709 = MathHelper.floor(method35703 + n4);
            final Class8996 method35710 = class7351.method22569();
            final Class4150 method35711 = class7352.method25214(Class8551.field35899);
            final Iterator<BlockPos> iterator = BlockPos.getAllInBoxMutable(new BlockPos(method35704, method35706, method35708), new BlockPos(method35705, method35707, method35709)).iterator();
            while (iterator.hasNext()) {
                method28712(method35710, method35711, class7354, iterator.next(), method35701, method35702, method35703, n4, n);
            }
        }
    }
    
    private static void method28712(final Class8996 class8996, final Class4150 class8997, final Class1852 class8998, final BlockPos class8999, final double n, final double n2, final double n3, final float n4, final float n5) {
        final BlockPos method1139 = class8999.method1139();
        final BlockState method1140 = class8998.getBlockState(method1139);
        if (method1140.method21710() != Class2115.field12305) {
            if (class8998.method6969(class8999) > 3) {
                if (method1140.isCollisionShapeOpaque(class8998, method1139)) {
                    final VoxelShape method1141 = method1140.getShape(class8998, class8999.method1139());
                    if (!method1141.method24540()) {
                        float n6 = (float)((n5 - (n2 - class8999.getY()) / 2.0) * 0.5 * class8998.method6963(class8999));
                        if (n6 >= 0.0f) {
                            if (n6 > 1.0f) {
                                n6 = 1.0f;
                            }
                            final AxisAlignedBB method1142 = method1141.method24537();
                            final double n7 = class8999.getX() + method1142.minX;
                            final double n8 = class8999.getX() + method1142.maxX;
                            final double n9 = class8999.getY() + method1142.minY;
                            final double n10 = class8999.getZ() + method1142.minZ;
                            final double n11 = class8999.getZ() + method1142.maxZ;
                            final float n12 = (float)(n7 - n);
                            final float n13 = (float)(n8 - n);
                            final float n14 = (float)(n9 - n2 + 0.015625);
                            final float n15 = (float)(n10 - n3);
                            final float n16 = (float)(n11 - n3);
                            final float n17 = -n12 / 2.0f / n4 + 0.5f;
                            final float n18 = -n13 / 2.0f / n4 + 0.5f;
                            final float n19 = -n15 / 2.0f / n4 + 0.5f;
                            final float n20 = -n16 / 2.0f / n4 + 0.5f;
                            method28713(class8996, class8997, n6, n12, n14, n15, n17, n19);
                            method28713(class8996, class8997, n6, n12, n14, n16, n17, n20);
                            method28713(class8996, class8997, n6, n13, n14, n16, n18, n20);
                            method28713(class8996, class8997, n6, n13, n14, n15, n18, n19);
                        }
                    }
                }
            }
        }
    }
    
    private static void method28713(final Class8996 class8996, final Class4150 class8997, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        class8997.method12444(class8996.method32111(), n2, n3, n4).method12439(1.0f, 1.0f, 1.0f, n).method12391(n5, n6).method12441(Class1904.field10335).method12440(15728880).method12445(class8996.method32112(), 0.0f, 1.0f, 0.0f).method12397();
    }
    
    public void method28714(final World field35905) {
        this.field35905 = field35905;
        if (field35905 == null) {
            this.field35906 = null;
        }
    }
    
    public double method28715(final Entity class399) {
        return this.field35906.method18161().squareDistanceTo(class399.method1934());
    }
    
    public double method28716(final double n, final double n2, final double n3) {
        return this.field35906.method18161().squareDistanceTo(n, n2, n3);
    }
    
    public Quaternion method28717() {
        return this.field35907;
    }
    
    public Class1844 method28718() {
        return this.field35903;
    }
    
    public Map<EntityType, Class4703> method28719() {
        return (Map)this.field35900;
    }
    
    public Map<String, Class4711> method28720() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends Class4711>)this.field35901);
    }
    
    static {
        field35899 = Class6332.method18777(new ResourceLocation("textures/misc/shadow.png"));
    }
}
