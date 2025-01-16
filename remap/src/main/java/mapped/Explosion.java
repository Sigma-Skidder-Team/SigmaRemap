// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

import com.mojang.datafixers.util.Pair;

import java.util.*;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Explosion
{
    private final boolean causesFire;
    private final Mode mode;
    private final Random random = new Random();
    private final World world;
    private final double x;
    private final double y;
    private final double z;
    private final Entity exploder;
    private final float size;
    private DamageSource damageSource;
    private final List<BlockPos> affectedBlockPositions = Lists.newArrayList();
    private final Map<PlayerEntity, Vec3d> playerKnockbackMap = Maps.newHashMap();

    public Explosion(World p_i293_1_, @Nullable Entity p_i293_2_, double p_i293_3_, double p_i293_5_, double p_i293_7_, float p_i293_9_, List<BlockPos> p_i293_10_)
    {
        this(p_i293_1_, p_i293_2_, p_i293_3_, p_i293_5_, p_i293_7_, p_i293_9_, false, Explosion.Mode.DESTROY, p_i293_10_);
    }

    public Explosion(World p_i294_1_, @Nullable Entity p_i294_2_, double p_i294_3_, double p_i294_5_, double p_i294_7_, float p_i294_9_, boolean p_i294_10_, Explosion.Mode p_i294_11_, List<BlockPos> p_i294_12_)
    {
        this(p_i294_1_, p_i294_2_, p_i294_3_, p_i294_5_, p_i294_7_, p_i294_9_, p_i294_10_, p_i294_11_);
        this.affectedBlockPositions.addAll(p_i294_12_);
    }

    public Explosion(World p_i295_1_, @Nullable Entity p_i295_2_, double p_i295_3_, double p_i295_5_, double p_i295_7_, float p_i295_9_, boolean p_i295_10_, Explosion.Mode p_i295_11_)
    {
        this.world = p_i295_1_;
        this.exploder = p_i295_2_;
        this.size = p_i295_9_;
        this.x = p_i295_3_;
        this.y = p_i295_5_;
        this.z = p_i295_7_;
        this.causesFire = p_i295_10_;
        this.mode = p_i295_11_;
        this.damageSource = DamageSource.causeExplosionDamage(this);
    }
    
    public static float getBlockDensity(final Vec3d p_222259_0_, final Entity p_222259_1_) {
        final AxisAlignedBB axisalignedbb = p_222259_1_.getBoundingBox();
        final double n = 1.0 / ((axisalignedbb.maxX - axisalignedbb.minX) * 2.0 + 1.0);
        final double n2 = 1.0 / ((axisalignedbb.maxY - axisalignedbb.minY) * 2.0 + 1.0);
        final double n3 = 1.0 / ((axisalignedbb.maxZ - axisalignedbb.minZ) * 2.0 + 1.0);
        final double n4 = (1.0 - Math.floor(1.0 / n) * n) / 2.0;
        final double n5 = (1.0 - Math.floor(1.0 / n3) * n3) / 2.0;
        if (n >= 0.0) {
            if (n2 >= 0.0) {
                if (n3 >= 0.0) {
                    int n6 = 0;
                    int n7 = 0;
                    for (float n8 = 0.0f; n8 <= 1.0f; n8 += (float)n) {
                        for (float n9 = 0.0f; n9 <= 1.0f; n9 += (float)n2) {
                            for (float n10 = 0.0f; n10 <= 1.0f; n10 += (float)n3) {
                                if (p_222259_1_.world.rayTraceBlocks(new RayTraceContext(new Vec3d(MathHelper.lerp(n8, axisalignedbb.minX, axisalignedbb.maxX) + n4, MathHelper.lerp(n9, axisalignedbb.minY, axisalignedbb.maxY), MathHelper.lerp(n10, axisalignedbb.minZ, axisalignedbb.maxZ) + n5), p_222259_0_, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, p_222259_1_)).getType() == RayTraceResult.Type.MISS) {
                                    ++n6;
                                }
                                ++n7;
                            }
                        }
                    }
                    return n6 / (float)n7;
                }
            }
        }
        return 0.0f;
    }
    
    public void doExplosionA() {
        Set<BlockPos> set = Sets.newHashSet();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i != 0) {
                        if (i != 15) {
                            if (j != 0) {
                                if (j != 15) {
                                    if (k != 0) {
                                        if (k != 15) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final double n = i / 15.0f * 2.0f - 1.0f;
                    final double n2 = j / 15.0f * 2.0f - 1.0f;
                    final double n3 = k / 15.0f * 2.0f - 1.0f;
                    final double sqrt = Math.sqrt(n * n + n2 * n2 + n3 * n3);
                    final double n4 = n / sqrt;
                    final double n5 = n2 / sqrt;
                    final double n6 = n3 / sqrt;
                    float n7 = this.size * (0.7f + this.world.rand.nextFloat() * 0.6f);
                    double field24898 = this.x;
                    double field24899 = this.y;
                    double field24900 = this.z;
                    while (n7 > 0.0f) {
                        final BlockPos class354 = new BlockPos(field24898, field24899, field24900);
                        final BlockState method6701 = this.world.getBlockState(class354);
                        final IFluidState method6702 = this.world.getFluidState(class354);
                        if (!method6701.method21706() || !method6702.isEmpty()) {
                            float n8 = Math.max(method6701.getBlock().method11841(), method6702.getExplosionResistance());
                            if (this.exploder != null) {
                                n8 = this.exploder.method1856(this, this.world, class354, method6701, method6702, n8);
                            }
                            n7 -= (n8 + 0.3f) * 0.3f;
                        }
                        if (n7 > 0.0f) {
                            if (this.exploder == null || this.exploder.method1857(this, this.world, class354, method6701, n7)) {
                                set.add(class354);
                            }
                        }
                        field24898 += n4 * 0.30000001192092896;
                        field24899 += n5 * 0.30000001192092896;
                        field24900 += n6 * 0.30000001192092896;
                        n7 -= 0.22500001f;
                    }
                }
            }
        }
        this.affectedBlockPositions.addAll(set);
        final float n9 = this.size * 2.0f;
        final List<Entity> method6703 = this.world.method7127(this.exploder, new AxisAlignedBB(MathHelper.floor(this.x - n9 - 1.0), MathHelper.floor(this.y - n9 - 1.0), MathHelper.floor(this.z - n9 - 1.0), MathHelper.floor(this.x + n9 + 1.0), MathHelper.floor(this.y + n9 + 1.0), MathHelper.floor(this.z + n9 + 1.0)));
        final Vec3d class355 = new Vec3d(this.x, this.y, this.z);
        for (int l = 0; l < method6703.size(); ++l) {
            final Entity class356 = method6703.get(l);
            if (!class356.method1899()) {
                final double n10 = MathHelper.sqrt(class356.method1735(class355)) / n9;
                if (n10 <= 1.0) {
                    final double n11 = class356.getPosX() - this.x;
                    final double n12 = class356.method1944() - this.y;
                    final double n13 = class356.getPosZ() - this.z;
                    final double n14 = MathHelper.sqrt(n11 * n11 + n12 * n12 + n13 * n13);
                    if (n14 != 0.0) {
                        final double n15 = n11 / n14;
                        final double n16 = n12 / n14;
                        final double n17 = n13 / n14;
                        final double n18 = (1.0 - n10) * getBlockDensity(class355, class356);
                        class356.attackEntityFrom(this.method18411(), (float)(int)((n18 * n18 + n18) / 2.0 * 7.0 * n9 + 1.0));
                        double method6704 = n18;
                        if (class356 instanceof LivingEntity) {
                            method6704 = Class6269.method18608((LivingEntity)class356, n18);
                        }
                        class356.method1936(class356.getMotion().add(n15 * method6704, n16 * method6704, n17 * method6704));
                        if (class356 instanceof PlayerEntity) {
                            final PlayerEntity class357 = (PlayerEntity)class356;
                            if (!class357.isSpectator()) {
                                if (!class357.method2889() || !class357.field3025.field27302) {
                                    this.playerKnockbackMap.put(class357, new Vec3d(n15 * n18, n16 * n18, n17 * n18));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method18409(final boolean b) {
        if (this.world.isRemote) {
            this.world.method6708(this.x, this.y, this.z, Class8520.field35218, Class286.field1582, 4.0f, (1.0f + (this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.2f) * 0.7f, false);
        }
        final boolean b2 = this.mode != Mode.field13365;
        if (b) {
            if (this.size >= 2.0f && b2) {
                this.world.method6709(Class8432.field34618, this.x, this.y, this.z, 1.0, 0.0, 0.0);
            }
            else {
                this.world.method6709(Class8432.field34619, this.x, this.y, this.z, 1.0, 0.0, 0.0);
            }
        }
        if (b2) {
            final ObjectArrayList list = new ObjectArrayList();
            Collections.shuffle(this.affectedBlockPositions, this.world.rand);
            for (final BlockPos class354 : this.affectedBlockPositions) {
                final BlockState method6701 = this.world.getBlockState(class354);
                final Block method6702 = method6701.getBlock();
                if (method6701.method21706()) {
                    continue;
                }
                class354.toImmutable();
                this.world.method6796().startSection("explosion_blocks");
                if (method6702.method11872(this)) {
                    if (this.world instanceof Class1849) {
                        final Class9098 method6703 = new Class9098((Class1849)this.world).method32873(this.world.rand).method32877(Class6683.field26367, class354).method32877(Class6683.field26370, ItemStack.EMPTY).method32878(Class6683.field26369, method6702.method11802() ? this.world.getTileEntity(class354) : null).method32878(Class6683.field26362, this.exploder);
                        if (this.mode == Mode.field13367) {
                            method6703.method32877(Class6683.field26371, this.size);
                        }
                        method6701.method21743(method6703).forEach(class357 -> method18410((ObjectArrayList<Pair<ItemStack, BlockPos>>)list2, class357, class356));
                    }
                }
                this.world.setBlockState(class354, Blocks.AIR.getDefaultState(), 3);
                method6702.method11842(this.world, class354, this);
                this.world.method6796().endSection();
            }
            for (final Pair pair : list) {
                Block.method11839(this.world, (BlockPos)pair.getSecond(), (ItemStack)pair.getFirst());
            }
        }
        if (this.causesFire) {
            for (final BlockPos class355 : this.affectedBlockPositions) {
                if (this.random.nextInt(3) != 0) {
                    continue;
                }
                if (!this.world.getBlockState(class355).method21706()) {
                    continue;
                }
                if (!this.world.getBlockState(class355.method1139()).method21722(this.world, class355.method1139())) {
                    continue;
                }
                this.world.method6692(class355, Blocks.FIRE.getDefaultState());
            }
        }
    }
    
    private static void method18410(final ObjectArrayList<Pair<ItemStack, BlockPos>> list, final ItemStack class8321, final BlockPos class8322) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Pair pair = (Pair)list.get(i);
            final ItemStack class8323 = (ItemStack)pair.getFirst();
            if (Class427.method2103(class8323, class8321)) {
                list.set(i, (Object)Pair.of((Object)Class427.method2104(class8323, class8321, 16), pair.getSecond()));
                if (class8321.method27620()) {
                    return;
                }
            }
        }
        list.add((Object)Pair.of((Object)class8321, (Object)class8322));
    }
    
    public DamageSource method18411() {
        return this.damageSource;
    }
    
    public void method18412(final DamageSource field24903) {
        this.damageSource = field24903;
    }
    
    public Map<PlayerEntity, Vec3d> method18413() {
        return this.playerKnockbackMap;
    }
    
    @Nullable
    public LivingEntity method18414() {
        if (this.exploder == null) {
            return null;
        }
        if (this.exploder instanceof Class510) {
            return ((Class510)this.exploder).method2614();
        }
        if (!(this.exploder instanceof LivingEntity)) {
            return (this.exploder instanceof Class419) ? ((Class419)this.exploder).field2527 : null;
        }
        return (LivingEntity)this.exploder;
    }
    
    public void method18415() {
        this.affectedBlockPositions.clear();
    }
    
    public List<BlockPos> method18416() {
        return this.affectedBlockPositions;
    }

    public enum Mode
    {
        field13365,
        field13366,
        field13367;
    }
}
