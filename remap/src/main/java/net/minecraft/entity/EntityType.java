// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.entity;

import mapped.*;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.UUID;
import java.util.Collections;
import javax.annotation.Nullable;
import java.util.Optional;
import org.apache.logging.log4j.Logger;

public class EntityType<T extends Entity>
{
    private static final Logger field28956;
    public static final EntityType<Class426> field28957;
    public static final EntityType<Class857> field28958;
    public static final EntityType<Class405> field28959;
    public static final EntityType<Class856> field28960;
    public static final EntityType<Class798> field28961;
    public static final EntityType<Class849> field28962;
    public static final EntityType<Class423> field28963;
    public static final EntityType<Class800> field28964;
    public static final EntityType<Class847> field28965;
    public static final EntityType<Class818> field28966;
    public static final EntityType<Class836> field28967;
    public static final EntityType<Class804> field28968;
    public static final EntityType<Class765> field28969;
    public static final EntityType<Class814> field28970;
    public static final EntityType<Class840> field28971;
    public static final EntityType<Class420> field28972;
    public static final EntityType<Class830> field28973;
    public static final EntityType<Class845> field28974;
    public static final EntityType<Class858> field28975;
    public static final EntityType<Class852> field28976;
    public static final EntityType<Class850> field28977;
    public static final EntityType<Class842> field28978;
    public static final EntityType<Class507> field28979;
    public static final EntityType<Class771> field28980;
    public static final EntityType<Class508> field28981;
    public static final EntityType<Class408> field28982;
    public static final EntityType<Class424> field28983;
    public static final EntityType<Class406> field28984;
    public static final EntityType<Class803> field28985;
    public static final EntityType<GhastEntity> field28986;
    public static final EntityType<Class764> field28987;
    public static final EntityType<Class844> field28988;
    public static final EntityType<Class808> field28989;
    public static final EntityType<Class829> field28990;
    public static final EntityType<Class769> field28991;
    public static final EntityType<Class427> field28992;
    public static final EntityType<Class862> field28993;
    public static final EntityType<Class417> field28994;
    public static final EntityType<Class863> field28995;
    public static final EntityType<Class815> field28996;
    public static final EntityType<Class400> field28997;
    public static final EntityType<Class854> field28998;
    public static final EntityType<Class430> field28999;
    public static final EntityType<Class505> field29000;
    public static final EntityType<Class429> field29001;
    public static final EntityType<Class506> field29002;
    public static final EntityType<Class454> field29003;
    public static final EntityType<Class431> field29004;
    public static final EntityType<Class432> field29005;
    public static final EntityType<Class813> field29006;
    public static final EntityType<Class805> field29007;
    public static final EntityType<Class817> field29008;
    public static final EntityType<Class861> field29009;
    public static final EntityType<Class791> field29010;
    public static final EntityType<Class796> field29011;
    public static final EntityType<Class801> field29012;
    public static final EntityType<Class838> field29013;
    public static final EntityType<Class828> field29014;
    public static final EntityType<Class790> field29015;
    public static final EntityType<Class510> field29016;
    public static final EntityType<Class792> field29017;
    public static final EntityType<Class837> field29018;
    public static final EntityType<Class802> field29019;
    public static final EntityType<Class841> field29020;
    public static final EntityType<Class509> field29021;
    public static final EntityType<Class848> field29022;
    public static final EntityType<Class782> field29023;
    public static final EntityType<Class809> field29024;
    public static final EntityType<Class853> field29025;
    public static final EntityType<Class418> field29026;
    public static final EntityType<Class784> field29027;
    public static final EntityType<Class411> field29028;
    public static final EntityType<Class404> field29029;
    public static final EntityType<Class846> field29030;
    public static final EntityType<Class839> field29031;
    public static final EntityType<Class783> field29032;
    public static final EntityType<Class816> field29033;
    public static final EntityType<Class835> field29034;
    public static final EntityType<Class793> field29035;
    public static final EntityType<Class410> field29036;
    public static final EntityType<Class412> field29037;
    public static final EntityType<Class413> field29038;
    public static final EntityType<Class415> field29039;
    public static final EntityType<Class403> field29040;
    public static final EntityType<Class843> field29041;
    public static final EntityType<Class824> field29042;
    public static final EntityType<Class786> field29043;
    public static final EntityType<Class775> field29044;
    public static final EntityType<Class773> field29045;
    public static final EntityType<Class821> field29046;
    public static final EntityType<Class778> field29047;
    public static final EntityType<Class767> field29048;
    public static final EntityType<Class781> field29049;
    public static final EntityType<Class421> field29050;
    public static final EntityType<Class799> field29051;
    public static final EntityType<Class827> field29052;
    public static final EntityType<Class811> field29053;
    public static final EntityType<Class826> field29054;
    public static final EntityType<Class851> field29055;
    public static final EntityType<Class779> field29056;
    public static final EntityType<LightningBoltEntity> field29057;
    public static final EntityType<PlayerEntity> field29058;
    public static final EntityType<Class425> field29059;
    private final Class8962<T> field29060;
    private final Class1976 field29061;
    private final boolean field29062;
    private final boolean field29063;
    private final boolean field29064;
    private final boolean field29065;
    private String field29066;
    private ITextComponent field29067;
    private ResourceLocation field29068;
    private final EntitySize field29069;
    
    private static <T extends Entity> EntityType<T> method23353(final String s, final Builder<T> builder) {
        return Registry.register(Registry.field210, s, builder.method31162(s));
    }
    
    public static ResourceLocation method23354(final EntityType<?> class7499) {
        return Registry.field210.getKey(class7499);
    }
    
    public static Optional<EntityType<?>> method23355(final String s) {
        return Registry.field210.method506(ResourceLocation.method7795(s));
    }
    
    public EntityType(final Class8962<T> field29060, final Class1976 field29061, final boolean field29062, final boolean field29063, final boolean field29064, final boolean field29065, final EntitySize field29066) {
        this.field29060 = field29060;
        this.field29061 = field29061;
        this.field29065 = field29065;
        this.field29062 = field29062;
        this.field29063 = field29063;
        this.field29064 = field29064;
        this.field29069 = field29066;
    }
    
    @Nullable
    public Entity method23356(final World class1847, final ItemStack class1848, final PlayerEntity class1849, final BlockPos class1850, final Class2101 class1851, final boolean b, final boolean b2) {
        return this.method23357(class1847, (class1848 != null) ? class1848.method27657() : null, (class1848 != null && class1848.method27667()) ? class1848.method27664() : null, class1849, class1850, class1851, b, b2);
    }
    
    @Nullable
    public T method23357(final World class1847, final CompoundNBT class1848, final ITextComponent class1849, final PlayerEntity class1850, final BlockPos class1851, final Class2101 class1852, final boolean b, final boolean b2) {
        final Entity method23358 = this.method23358(class1847, class1848, class1849, class1850, class1851, class1852, b, b2);
        class1847.method6886(method23358);
        return (T)method23358;
    }
    
    @Nullable
    public T method23358(final World class1847, final CompoundNBT class1848, final ITextComponent class1849, final PlayerEntity class1850, final BlockPos class1851, final Class2101 class1852, final boolean b, final boolean b2) {
        final Class759 method23371 = (Class759)this.method23371(class1847);
        if (method23371 != null) {
            double method23372;
            if (!b) {
                method23372 = 0.0;
            }
            else {
                method23371.setPosition(class1851.getX() + 0.5, class1851.getY() + 1, class1851.getZ() + 0.5);
                method23372 = method23359(class1847, class1851, b2, method23371.getBoundingBox());
            }
            method23371.method1730(class1851.getX() + 0.5, class1851.getY() + method23372, class1851.getZ() + 0.5, MathHelper.method35668(class1847.rand.nextFloat() * 360.0f), 0.0f);
            if (method23371 instanceof Class759) {
                final Class759 class1853 = method23371;
                class1853.field2953 = class1853.rotationYaw;
                class1853.field2951 = class1853.rotationYaw;
                class1853.method4188(class1847, class1847.method6784(new BlockPos(class1853)), class1852, null, class1848);
                class1853.method4156();
            }
            if (class1849 != null) {
                if (method23371 instanceof LivingEntity) {
                    method23371.method1872(class1849);
                }
            }
            method23360(class1847, class1850, method23371, class1848);
            return (T)method23371;
        }
        return null;
    }
    
    public static double method23359(final Class1852 class1852, final BlockPos class1853, final boolean b, final AxisAlignedBB class1854) {
        AxisAlignedBB method18494 = new AxisAlignedBB(class1853);
        if (b) {
            method18494 = method18494.expand(0.0, -1.0, 0.0);
        }
        return 1.0 + VoxelShapes.method24498(Direction.Axis.Y, class1854, class1852.method6980(null, method18494, Collections.emptySet()), b ? -2.0 : -1.0);
    }
    
    public static void method23360(final World class1847, final PlayerEntity class1848, final Entity class1849, final CompoundNBT class1850) {
        if (class1850 != null) {
            if (class1850.contains("EntityTag", 10)) {
                final MinecraftServer method6679 = class1847.getServer();
                if (method6679 != null) {
                    if (class1849 != null) {
                        if (!class1847.isRemote) {
                            if (class1849.method1905()) {
                                if (class1848 == null) {
                                    return;
                                }
                                if (!method6679.method1537().method20597(class1848.method2844())) {
                                    return;
                                }
                            }
                        }
                        final CompoundNBT method6680 = class1849.method1756(new CompoundNBT());
                        final UUID method6681 = class1849.method1865();
                        method6680.merge(class1850.getCompound("EntityTag"));
                        class1849.method1864(method6681);
                        class1849.method1757(method6680);
                    }
                }
            }
        }
    }
    
    public boolean method23361() {
        return this.field29062;
    }
    
    public boolean method23362() {
        return this.field29063;
    }
    
    public boolean method23363() {
        return this.field29064;
    }
    
    public boolean method23364() {
        return this.field29065;
    }
    
    public Class1976 method23365() {
        return this.field29061;
    }
    
    public String method23366() {
        if (this.field29066 == null) {
            this.field29066 = Util.method27836("entity", Registry.field210.getKey(this));
        }
        return this.field29066;
    }
    
    public ITextComponent method23367() {
        if (this.field29067 == null) {
            this.field29067 = new Class2259(this.method23366());
        }
        return this.field29067;
    }
    
    public ResourceLocation method23368() {
        if (this.field29068 == null) {
            final ResourceLocation method503 = Registry.field210.getKey(this);
            this.field29068 = new ResourceLocation(method503.method7798(), "entities/" + method503.method7797());
        }
        return this.field29068;
    }
    
    public float method23369() {
        return this.field29069.field34097;
    }
    
    public float method23370() {
        return this.field29069.field34098;
    }
    
    @Nullable
    public T method23371(final World class1847) {
        return this.field29060.method31798(this, class1847);
    }
    
    @Nullable
    public static Entity method23372(final int n, final World class1847) {
        return method23374(class1847, Registry.field210.method499(n));
    }
    
    public static Optional<Entity> method23373(final CompoundNBT class51, final World class52) {
        return Util.method27855(method23377(class51).map(class54 -> class54.method23371(class53)), class56 -> class56.method1757(class55), () -> EntityType.field28956.warn("Skipping Entity with id {}", (Object)class57.method323("id")));
    }
    
    @Nullable
    private static Entity method23374(final World class1847, final EntityType<?> class1848) {
        return (class1848 != null) ? class1848.method23371(class1847) : null;
    }
    
    public AxisAlignedBB method23375(final double n, final double n2, final double n3) {
        final float n4 = this.method23369() / 2.0f;
        return new AxisAlignedBB(n - n4, n2, n3 - n4, n + n4, n2 + this.method23370(), n3 + n4);
    }
    
    public EntitySize getSize() {
        return this.field29069;
    }
    
    public static Optional<EntityType<?>> method23377(final CompoundNBT class51) {
        return Registry.field210.method506(new ResourceLocation(class51.getString("id")));
    }
    
    @Nullable
    public static Entity method23378(final CompoundNBT class51, final World class52, final Function<Entity, Entity> mapper) {
        return method23379(class51, class52).map((Function<? super Entity, ?>)mapper).map(class55 -> {
            if (class53.method316("Passengers", 9)) {
                class53.method328("Passengers", 10);
                int i = 0;
                final ListNBT class56;
                while (i < class56.size()) {
                    method23378(class56.method346(i), class54, function);
                    final Entity class57;
                    if (class57 != null) {
                        class57.method1780(class55, true);
                    }
                    ++i;
                }
            }
            return class55;
        }).orElse(null);
    }
    
    private static Optional<Entity> method23379(final CompoundNBT class51, final World class52) {
        try {
            return method23373(class51, class52);
        }
        catch (final RuntimeException ex) {
            EntityType.field28956.warn("Exception loading entity: ", ex);
            return Optional.empty();
        }
    }
    
    public int method23380() {
        if (this == EntityType.field29058) {
            return 32;
        }
        if (this != EntityType.field28975) {
            if (this != EntityType.field28976) {
                if (this != EntityType.field29016) {
                    if (this != EntityType.field28983) {
                        if (this != EntityType.field28993) {
                            if (this != EntityType.field28995) {
                                if (this != EntityType.field29009) {
                                    if (this != EntityType.field28958) {
                                        if (this != EntityType.field28981) {
                                            if (this != EntityType.field28957) {
                                                if (this != EntityType.field28979) {
                                                    if (this != EntityType.field29059) {
                                                        if (this != EntityType.field28959) {
                                                            if (this != EntityType.field29029) {
                                                                if (this != EntityType.field29040) {
                                                                    if (this != EntityType.field29026) {
                                                                        if (this != EntityType.field28972) {
                                                                            if (this != EntityType.field28994) {
                                                                                if (this != EntityType.field29050) {
                                                                                    if (this != EntityType.field29028) {
                                                                                        if (this != EntityType.field28997) {
                                                                                            if (this != EntityType.field29037) {
                                                                                                if (this != EntityType.field28982) {
                                                                                                    if (this != EntityType.field29036) {
                                                                                                        if (this != EntityType.field29039) {
                                                                                                            if (this != EntityType.field29038) {
                                                                                                                if (this != EntityType.field28984) {
                                                                                                                    if (this != EntityType.field28992) {
                                                                                                                        return 5;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return 4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 10;
        }
        return 16;
    }
    
    public int method23381() {
        if (this == EntityType.field29058 || this == EntityType.field28979) {
            return 2;
        }
        if (this == EntityType.field28982) {
            return 4;
        }
        if (this != EntityType.field29059) {
            if (this != EntityType.field29026) {
                if (this != EntityType.field28972) {
                    if (this != EntityType.field28994) {
                        if (this != EntityType.field29050) {
                            if (this != EntityType.field29028) {
                                if (this != EntityType.field28997) {
                                    if (this != EntityType.field29037) {
                                        if (this != EntityType.field29036) {
                                            if (this != EntityType.field29039) {
                                                if (this != EntityType.field29038) {
                                                    if (this != EntityType.field28984) {
                                                        if (this != EntityType.field29016) {
                                                            if (this != EntityType.field28959) {
                                                                if (this != EntityType.field29029) {
                                                                    if (this != EntityType.field29040) {
                                                                        if (this != EntityType.field28992) {
                                                                            if (this != EntityType.field28983) {
                                                                                if (this != EntityType.field28981) {
                                                                                    if (this != EntityType.field28993) {
                                                                                        if (this != EntityType.field28995) {
                                                                                            if (this != EntityType.field29009) {
                                                                                                if (this != EntityType.field28957) {
                                                                                                    if (this != EntityType.field28975) {
                                                                                                        return 3;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    return Integer.MAX_VALUE;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            return 20;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 10;
        }
        return 5;
    }
    
    public boolean method23382() {
        if (this != EntityType.field29058) {
            if (this != EntityType.field28997) {
                if (this != EntityType.field29048) {
                    if (this != EntityType.field28960) {
                        if (this != EntityType.field28993) {
                            if (this != EntityType.field28995) {
                                if (this != EntityType.field29009) {
                                    if (this != EntityType.field28975) {
                                        return this != EntityType.field28979;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method23383(final Class7909<EntityType<?>> class7909) {
        return class7909.method25618(this);
    }
    
    static {
        field28956 = LogManager.getLogger();
        field28957 = method23353("area_effect_cloud", (Builder<Class426>) Builder.method31155((Class8962<T>)Class426::new, Class1976.field10952).method31160().method31157(6.0f, 0.5f));
        field28958 = method23353("armor_stand", (Builder<Class857>) Builder.method31155((Class8962<T>)Class857::new, Class1976.field10952).method31157(0.5f, 1.975f));
        field28959 = method23353("arrow", (Builder<Class405>) Builder.method31155((Class8962<T>)Class405::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field28960 = method23353("bat", (Builder<Class856>) Builder.method31155((Class8962<T>)Class856::new, Class1976.field10950).method31157(0.5f, 0.9f));
        field28961 = method23353("bee", (Builder<Class798>) Builder.method31155((Class8962<T>)Class798::new, Class1976.field10949).method31157(0.7f, 0.6f));
        field28962 = method23353("blaze", (Builder<Class849>) Builder.method31155((Class8962<T>)Class849::new, Class1976.field10948).method31160().method31157(0.6f, 1.8f));
        field28963 = method23353("boat", (Builder<Class423>) Builder.method31155((Class8962<T>)Class423::new, Class1976.field10952).method31157(1.375f, 0.5625f));
        field28964 = method23353("cat", (Builder<Class800>) Builder.method31155((Class8962<T>)Class800::new, Class1976.field10949).method31157(0.6f, 0.7f));
        field28965 = method23353("cave_spider", (Builder<Class847>) Builder.method31155((Class8962<T>)Class847::new, Class1976.field10948).method31157(0.7f, 0.5f));
        field28966 = method23353("chicken", (Builder<Class818>) Builder.method31155((Class8962<T>)Class818::new, Class1976.field10949).method31157(0.4f, 0.7f));
        field28967 = method23353("cod", (Builder<Class836>) Builder.method31155((Class8962<T>)Class836::new, Class1976.field10951).method31157(0.5f, 0.3f));
        field28968 = method23353("cow", (Builder<Class804>) Builder.method31155((Class8962<T>)Class804::new, Class1976.field10949).method31157(0.9f, 1.4f));
        field28969 = method23353("creeper", (Builder<Class765>) Builder.method31155((Class8962<T>)Class765::new, Class1976.field10948).method31157(0.6f, 1.7f));
        field28970 = method23353("donkey", (Builder<Class814>) Builder.method31155((Class8962<T>)Class814::new, Class1976.field10949).method31157(1.3964844f, 1.5f));
        field28971 = method23353("dolphin", (Builder<Class840>) Builder.method31155((Class8962<T>)Class840::new, Class1976.field10951).method31157(0.9f, 0.6f));
        field28972 = method23353("dragon_fireball", (Builder<Class420>) Builder.method31155((Class8962<T>)Class420::new, Class1976.field10952).method31157(1.0f, 1.0f));
        field28973 = method23353("drowned", (Builder<Class830>) Builder.method31155((Class8962<T>)Class830::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28974 = method23353("elder_guardian", (Builder<Class845>) Builder.method31155((Class8962<T>)Class845::new, Class1976.field10948).method31157(1.9975f, 1.9975f));
        field28975 = method23353("end_crystal", (Builder<Class858>) Builder.method31155((Class8962<T>)Class858::new, Class1976.field10952).method31157(2.0f, 2.0f));
        field28976 = method23353("ender_dragon", (Builder<Class852>) Builder.method31155((Class8962<T>)Class852::new, Class1976.field10948).method31160().method31157(16.0f, 8.0f));
        field28977 = method23353("enderman", (Builder<Class850>) Builder.method31155((Class8962<T>)Class850::new, Class1976.field10948).method31157(0.6f, 2.9f));
        field28978 = method23353("endermite", (Builder<Class842>) Builder.method31155((Class8962<T>)Class842::new, Class1976.field10948).method31157(0.4f, 0.3f));
        field28979 = method23353("evoker_fangs", (Builder<Class507>) Builder.method31155((Class8962<T>)Class507::new, Class1976.field10952).method31157(0.5f, 0.8f));
        field28980 = method23353("evoker", (Builder<Class771>) Builder.method31155((Class8962<T>)Class771::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28981 = method23353("experience_orb", (Builder<Class508>) Builder.method31155((Class8962<T>)Class508::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field28982 = method23353("eye_of_ender", (Builder<Class408>) Builder.method31155((Class8962<T>)Class408::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28983 = method23353("falling_block", (Builder<Class424>) Builder.method31155((Class8962<T>)Class424::new, Class1976.field10952).method31157(0.98f, 0.98f));
        field28984 = method23353("firework_rocket", (Builder<Class406>) Builder.method31155((Class8962<T>)Class406::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28985 = method23353("fox", (Builder<Class803>) Builder.method31155((Class8962<T>)Class803::new, Class1976.field10949).method31157(0.6f, 0.7f));
        field28986 = method23353("ghast", (Builder<GhastEntity>) Builder.method31155((Class8962<T>) GhastEntity::new, Class1976.field10948).method31160().method31157(4.0f, 4.0f));
        field28987 = method23353("giant", (Builder<Class764>) Builder.method31155((Class8962<T>)Class764::new, Class1976.field10948).method31157(3.6f, 12.0f));
        field28988 = method23353("guardian", (Builder<Class844>) Builder.method31155((Class8962<T>)Class844::new, Class1976.field10948).method31157(0.85f, 0.85f));
        field28989 = method23353("horse", (Builder<Class808>) Builder.method31155((Class8962<T>)Class808::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field28990 = method23353("husk", (Builder<Class829>) Builder.method31155((Class8962<T>)Class829::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28991 = method23353("illusioner", (Builder<Class769>) Builder.method31155((Class8962<T>)Class769::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28992 = method23353("item", (Builder<Class427>) Builder.method31155((Class8962<T>)Class427::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28993 = method23353("item_frame", (Builder<Class862>) Builder.method31155((Class8962<T>)Class862::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field28994 = method23353("fireball", (Builder<Class417>) Builder.method31155((Class8962<T>)Class417::new, Class1976.field10952).method31157(1.0f, 1.0f));
        field28995 = method23353("leash_knot", (Builder<Class863>) Builder.method31155((Class8962<T>)Class863::new, Class1976.field10952).method31159().method31157(0.5f, 0.5f));
        field28996 = method23353("llama", (Builder<Class815>) Builder.method31155((Class8962<T>)Class815::new, Class1976.field10949).method31157(0.9f, 1.87f));
        field28997 = method23353("llama_spit", (Builder<Class400>) Builder.method31155((Class8962<T>)Class400::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28998 = method23353("magma_cube", (Builder<Class854>) Builder.method31155((Class8962<T>)Class854::new, Class1976.field10948).method31160().method31157(2.04f, 2.04f));
        field28999 = method23353("minecart", (Builder<Class430>) Builder.method31155((Class8962<T>)Class430::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29000 = method23353("chest_minecart", (Builder<Class505>) Builder.method31155((Class8962<T>)Class505::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29001 = method23353("command_block_minecart", (Builder<Class429>) Builder.method31155((Class8962<T>)Class429::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29002 = method23353("furnace_minecart", (Builder<Class506>) Builder.method31155((Class8962<T>)Class506::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29003 = method23353("hopper_minecart", (Builder<Class454>) Builder.method31155((Class8962<T>)Class454::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29004 = method23353("spawner_minecart", (Builder<Class431>) Builder.method31155((Class8962<T>)Class431::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29005 = method23353("tnt_minecart", (Builder<Class432>) Builder.method31155((Class8962<T>)Class432::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29006 = method23353("mule", (Builder<Class813>) Builder.method31155((Class8962<T>)Class813::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field29007 = method23353("mooshroom", (Builder<Class805>) Builder.method31155((Class8962<T>)Class805::new, Class1976.field10949).method31157(0.9f, 1.4f));
        field29008 = method23353("ocelot", (Builder<Class817>) Builder.method31155((Class8962<T>)Class817::new, Class1976.field10949).method31157(0.6f, 0.7f));
        field29009 = method23353("painting", (Builder<Class861>) Builder.method31155((Class8962<T>)Class861::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field29010 = method23353("panda", (Builder<Class791>) Builder.method31155((Class8962<T>)Class791::new, Class1976.field10949).method31157(1.3f, 1.25f));
        field29011 = method23353("parrot", (Builder<Class796>) Builder.method31155((Class8962<T>)Class796::new, Class1976.field10949).method31157(0.5f, 0.9f));
        field29012 = method23353("pig", (Builder<Class801>) Builder.method31155((Class8962<T>)Class801::new, Class1976.field10949).method31157(0.9f, 0.9f));
        field29013 = method23353("pufferfish", (Builder<Class838>) Builder.method31155((Class8962<T>)Class838::new, Class1976.field10951).method31157(0.7f, 0.7f));
        field29014 = method23353("zombie_pigman", (Builder<Class828>) Builder.method31155((Class8962<T>)Class828::new, Class1976.field10948).method31160().method31157(0.6f, 1.95f));
        field29015 = method23353("polar_bear", (Builder<Class790>) Builder.method31155((Class8962<T>)Class790::new, Class1976.field10949).method31157(1.4f, 1.4f));
        field29016 = method23353("tnt", (Builder<Class510>) Builder.method31155((Class8962<T>)Class510::new, Class1976.field10952).method31160().method31157(0.98f, 0.98f));
        field29017 = method23353("rabbit", (Builder<Class792>) Builder.method31155((Class8962<T>)Class792::new, Class1976.field10949).method31157(0.4f, 0.5f));
        field29018 = method23353("salmon", (Builder<Class837>) Builder.method31155((Class8962<T>)Class837::new, Class1976.field10951).method31157(0.7f, 0.4f));
        field29019 = method23353("sheep", (Builder<Class802>) Builder.method31155((Class8962<T>)Class802::new, Class1976.field10949).method31157(0.9f, 1.3f));
        field29020 = method23353("shulker", (Builder<Class841>) Builder.method31155((Class8962<T>)Class841::new, Class1976.field10948).method31160().method31161().method31157(1.0f, 1.0f));
        field29021 = method23353("shulker_bullet", (Builder<Class509>) Builder.method31155((Class8962<T>)Class509::new, Class1976.field10952).method31157(0.3125f, 0.3125f));
        field29022 = method23353("silverfish", (Builder<Class848>) Builder.method31155((Class8962<T>)Class848::new, Class1976.field10948).method31157(0.4f, 0.3f));
        field29023 = method23353("skeleton", (Builder<Class782>) Builder.method31155((Class8962<T>)Class782::new, Class1976.field10948).method31157(0.6f, 1.99f));
        field29024 = method23353("skeleton_horse", (Builder<Class809>) Builder.method31155((Class8962<T>)Class809::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field29025 = method23353("slime", (Builder<Class853>) Builder.method31155((Class8962<T>)Class853::new, Class1976.field10948).method31157(2.04f, 2.04f));
        field29026 = method23353("small_fireball", (Builder<Class418>) Builder.method31155((Class8962<T>)Class418::new, Class1976.field10952).method31157(0.3125f, 0.3125f));
        field29027 = method23353("snow_golem", (Builder<Class784>) Builder.method31155((Class8962<T>)Class784::new, Class1976.field10952).method31157(0.7f, 1.9f));
        field29028 = method23353("snowball", (Builder<Class411>) Builder.method31155((Class8962<T>)Class411::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29029 = method23353("spectral_arrow", (Builder<Class404>) Builder.method31155((Class8962<T>)Class404::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field29030 = method23353("spider", (Builder<Class846>) Builder.method31155((Class8962<T>)Class846::new, Class1976.field10948).method31157(1.4f, 0.9f));
        field29031 = method23353("squid", (Builder<Class839>) Builder.method31155((Class8962<T>)Class839::new, Class1976.field10951).method31157(0.8f, 0.8f));
        field29032 = method23353("stray", (Builder<Class783>) Builder.method31155((Class8962<T>)Class783::new, Class1976.field10948).method31157(0.6f, 1.99f));
        field29033 = method23353("trader_llama", (Builder<Class816>) Builder.method31155((Class8962<T>)Class816::new, Class1976.field10949).method31157(0.9f, 1.87f));
        field29034 = method23353("tropical_fish", (Builder<Class835>) Builder.method31155((Class8962<T>)Class835::new, Class1976.field10951).method31157(0.5f, 0.4f));
        field29035 = method23353("turtle", (Builder<Class793>) Builder.method31155((Class8962<T>)Class793::new, Class1976.field10949).method31157(1.2f, 0.4f));
        field29036 = method23353("egg", (Builder<Class410>) Builder.method31155((Class8962<T>)Class410::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29037 = method23353("ender_pearl", (Builder<Class412>) Builder.method31155((Class8962<T>)Class412::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29038 = method23353("experience_bottle", (Builder<Class413>) Builder.method31155((Class8962<T>)Class413::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29039 = method23353("potion", (Builder<Class415>) Builder.method31155((Class8962<T>)Class415::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29040 = method23353("trident", (Builder<Class403>) Builder.method31155((Class8962<T>)Class403::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field29041 = method23353("vex", (Builder<Class843>) Builder.method31155((Class8962<T>)Class843::new, Class1976.field10948).method31160().method31157(0.4f, 0.8f));
        field29042 = method23353("villager", (Builder<Class824>) Builder.method31155((Class8962<T>)Class824::new, Class1976.field10952).method31157(0.6f, 1.95f));
        field29043 = method23353("iron_golem", (Builder<Class786>) Builder.method31155((Class8962<T>)Class786::new, Class1976.field10952).method31157(1.4f, 2.7f));
        field29044 = method23353("vindicator", (Builder<Class775>) Builder.method31155((Class8962<T>)Class775::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29045 = method23353("pillager", (Builder<Class773>) Builder.method31155((Class8962<T>)Class773::new, Class1976.field10948).method31161().method31157(0.6f, 1.95f));
        field29046 = method23353("wandering_trader", (Builder<Class821>) Builder.method31155((Class8962<T>)Class821::new, Class1976.field10949).method31157(0.6f, 1.95f));
        field29047 = method23353("witch", (Builder<Class778>) Builder.method31155((Class8962<T>)Class778::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29048 = method23353("wither", (Builder<Class767>) Builder.method31155((Class8962<T>)Class767::new, Class1976.field10948).method31160().method31157(0.9f, 3.5f));
        field29049 = method23353("wither_skeleton", (Builder<Class781>) Builder.method31155((Class8962<T>)Class781::new, Class1976.field10948).method31160().method31157(0.7f, 2.4f));
        field29050 = method23353("wither_skull", (Builder<Class421>) Builder.method31155((Class8962<T>)Class421::new, Class1976.field10952).method31157(0.3125f, 0.3125f));
        field29051 = method23353("wolf", (Builder<Class799>) Builder.method31155((Class8962<T>)Class799::new, Class1976.field10949).method31157(0.6f, 0.85f));
        field29052 = method23353("zombie", (Builder<Class827>) Builder.method31155((Class8962<T>)Class827::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29053 = method23353("zombie_horse", (Builder<Class811>) Builder.method31155((Class8962<T>)Class811::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field29054 = method23353("zombie_villager", (Builder<Class826>) Builder.method31155((Class8962<T>)Class826::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29055 = method23353("phantom", (Builder<Class851>) Builder.method31155((Class8962<T>)Class851::new, Class1976.field10948).method31157(0.9f, 0.5f));
        field29056 = method23353("ravager", (Builder<Class779>) Builder.method31155((Class8962<T>)Class779::new, Class1976.field10948).method31157(1.95f, 2.2f));
        field29057 = method23353("lightning_bolt", (Builder<LightningBoltEntity>) Builder.method31156(Class1976.field10952).method31159().method31157(0.0f, 0.0f));
        field29058 = method23353("player", (Builder<PlayerEntity>) Builder.method31156(Class1976.field10952).method31159().method31158().method31157(0.6f, 1.8f));
        field29059 = method23353("fishing_bobber", (Builder<Class425>) Builder.method31156(Class1976.field10952).method31159().method31158().method31157(0.25f, 0.25f));
    }
}
