// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.common.collect.Lists;
import java.net.URISyntaxException;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.CompletableFuture;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.io.File;

import com.mojang.brigadier.tree.RootCommandNode;
import java.util.Iterator;
import io.netty.buffer.Unpooled;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import java.util.Random;
import java.util.UUID;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import org.apache.logging.log4j.Logger;

public class Class5799 implements IClientPlayNetHandler
{
    private static final Logger field23804;
    private final NetworkManager field23805;
    private final GameProfile field23806;
    private final Class527 field23807;
    private Class869 field23808;
    private Class1848 field23809;
    private boolean field23810;
    private final Map<UUID, Class9081> field23811;
    private final Class8840 field23812;
    private final Class7490 field23813;
    private Class1792 field23814;
    private final Class8108 field23815;
    private int field23816;
    private final Random field23817;
    private CommandDispatcher<Class7491> field23818;
    private final Class1780 field23819;
    private final UUID field23820;
    
    public Class5799(final Class869 field23808, final Class527 field23809, final NetworkManager field23810, final GameProfile field23811) {
        this.field23811 = Maps.newHashMap();
        this.field23814 = new Class1792();
        this.field23815 = new Class8108(this);
        this.field23816 = 3;
        this.field23817 = new Random();
        this.field23818 = (CommandDispatcher<Class7491>)new CommandDispatcher();
        this.field23819 = new Class1780();
        this.field23820 = UUID.randomUUID();
        this.field23808 = field23808;
        this.field23807 = field23809;
        this.field23805 = field23810;
        this.field23806 = field23811;
        this.field23812 = new Class8840(field23808);
        this.field23813 = new Class7490(this, field23808);
    }
    
    public Class7490 method17269() {
        return this.field23813;
    }
    
    public void method17270() {
        this.field23809 = null;
    }
    
    public Class1780 method17271() {
        return this.field23819;
    }
    
    @Override
    public void method17272(final Class4383 class4383) {
        Class8663.method29632((IPacket<Class5799>)class4383, this, this.field23808);
        this.field23808.field4682 = new Class8244(this.field23808, this);
        this.field23816 = class4383.method13182();
        this.field23809 = new Class1848(this, new Class8511(class4383.method13177(), class4383.method13179(), false, class4383.method13178(), class4383.method13181()), class4383.method13180(), this.field23816, this.field23808.method5327(), this.field23808.field4636);
        this.field23808.method5263(this.field23809);
        if (this.field23808.field4684 == null) {
            this.field23808.field4684 = this.field23808.field4682.method27306(this.field23809, new Class7474(), new Class6520(this.field23809.method6792()));
            this.field23808.field4684.rotationYaw = -180.0f;
            if (this.field23808.method5285() != null) {
                this.field23808.method5285().method5680(this.field23808.field4684.method1865());
            }
        }
        this.field23808.field4645.method22330();
        this.field23808.field4684.method1651();
        final int method13176 = class4383.method13176();
        this.field23809.method6818(method13176, this.field23808.field4684);
        this.field23808.field4684.field4085 = new Class6094(this.field23808.field4648);
        this.field23808.field4682.method27308(this.field23808.field4684);
        this.field23808.field4689 = this.field23808.field4684;
        this.field23808.field4684.dimension = class4383.method13180();
        this.field23808.method5244(new Class556());
        this.field23808.field4684.method1644(method13176);
        this.field23808.field4684.method2897(class4383.method13183());
        this.field23808.field4684.method4127(class4383.method13184());
        this.field23808.field4682.method27309(class4383.method13179());
        this.field23808.field4648.method17124();
        this.field23805.method11174(new Class4326(Class4326.field19371, new PacketBuffer(Unpooled.buffer()).method29514(Class7932.method25729())));
        this.field23808.method5328().method25567();
    }
    
    @Override
    public void method17273(final Class4339 class4339) {
        Class8663.method29632((IPacket<Class5799>)class4339, this, this.field23808);
        final double method13025 = class4339.method13025();
        final double method13026 = class4339.method13026();
        final double method13027 = class4339.method13027();
        final EntityType<?> method13028 = class4339.method13033();
        Entity class4340;
        if (method13028 != EntityType.field29000) {
            if (method13028 != EntityType.field29002) {
                if (method13028 != EntityType.field29005) {
                    if (method13028 != EntityType.field29004) {
                        if (method13028 != EntityType.field29003) {
                            if (method13028 != EntityType.field29001) {
                                if (method13028 != EntityType.field28999) {
                                    if (method13028 != EntityType.field29059) {
                                        if (method13028 != EntityType.field28959) {
                                            if (method13028 != EntityType.field29029) {
                                                if (method13028 != EntityType.field29040) {
                                                    if (method13028 != EntityType.field29028) {
                                                        if (method13028 != EntityType.field28997) {
                                                            if (method13028 != EntityType.field28993) {
                                                                if (method13028 != EntityType.field28995) {
                                                                    if (method13028 != EntityType.field29037) {
                                                                        if (method13028 != EntityType.field28982) {
                                                                            if (method13028 != EntityType.field28984) {
                                                                                if (method13028 != EntityType.field28994) {
                                                                                    if (method13028 != EntityType.field28972) {
                                                                                        if (method13028 != EntityType.field29026) {
                                                                                            if (method13028 != EntityType.field29050) {
                                                                                                if (method13028 != EntityType.field29021) {
                                                                                                    if (method13028 != EntityType.field29036) {
                                                                                                        if (method13028 != EntityType.field28979) {
                                                                                                            if (method13028 != EntityType.field29039) {
                                                                                                                if (method13028 != EntityType.field29038) {
                                                                                                                    if (method13028 != EntityType.field28963) {
                                                                                                                        if (method13028 != EntityType.field29016) {
                                                                                                                            if (method13028 != EntityType.field28958) {
                                                                                                                                if (method13028 != EntityType.field28975) {
                                                                                                                                    if (method13028 != EntityType.field28992) {
                                                                                                                                        if (method13028 != EntityType.field28983) {
                                                                                                                                            if (method13028 != EntityType.field28957) {
                                                                                                                                                class4340 = null;
                                                                                                                                            }
                                                                                                                                            else {
                                                                                                                                                class4340 = new Class426(this.field23809, method13025, method13026, method13027);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        else {
                                                                                                                                            class4340 = new Class424(this.field23809, method13025, method13026, method13027, Block.method11775(class4339.method13034()));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    else {
                                                                                                                                        class4340 = new Class427(this.field23809, method13025, method13026, method13027);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                else {
                                                                                                                                    class4340 = new Class858(this.field23809, method13025, method13026, method13027);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            else {
                                                                                                                                class4340 = new Class857(this.field23809, method13025, method13026, method13027);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            class4340 = new Class510(this.field23809, method13025, method13026, method13027, null);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        class4340 = new Class423(this.field23809, method13025, method13026, method13027);
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    class4340 = new Class413(this.field23809, method13025, method13026, method13027);
                                                                                                                }
                                                                                                            }
                                                                                                            else {
                                                                                                                class4340 = new Class415(this.field23809, method13025, method13026, method13027);
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            class4340 = new Class507(this.field23809, method13025, method13026, method13027, 0.0f, 0, null);
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        class4340 = new Class410(this.field23809, method13025, method13026, method13027);
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    class4340 = new Class509(this.field23809, method13025, method13026, method13027, class4339.method13028(), class4339.method13029(), class4339.method13030());
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                class4340 = new Class421(this.field23809, method13025, method13026, method13027, class4339.method13028(), class4339.method13029(), class4339.method13030());
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            class4340 = new Class418(this.field23809, method13025, method13026, method13027, class4339.method13028(), class4339.method13029(), class4339.method13030());
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        class4340 = new Class420(this.field23809, method13025, method13026, method13027, class4339.method13028(), class4339.method13029(), class4339.method13030());
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    class4340 = new Class417(this.field23809, method13025, method13026, method13027, class4339.method13028(), class4339.method13029(), class4339.method13030());
                                                                                }
                                                                            }
                                                                            else {
                                                                                class4340 = new Class406(this.field23809, method13025, method13026, method13027, ItemStack.field34174);
                                                                            }
                                                                        }
                                                                        else {
                                                                            class4340 = new Class408(this.field23809, method13025, method13026, method13027);
                                                                        }
                                                                    }
                                                                    else {
                                                                        class4340 = new Class412(this.field23809, method13025, method13026, method13027);
                                                                    }
                                                                }
                                                                else {
                                                                    class4340 = new Class863(this.field23809, new BlockPos(method13025, method13026, method13027));
                                                                }
                                                            }
                                                            else {
                                                                class4340 = new Class862(this.field23809, new BlockPos(method13025, method13026, method13027), Direction.byIndex(class4339.method13034()));
                                                            }
                                                        }
                                                        else {
                                                            class4340 = new Class400(this.field23809, method13025, method13026, method13027, class4339.method13028(), class4339.method13029(), class4339.method13030());
                                                        }
                                                    }
                                                    else {
                                                        class4340 = new Class411(this.field23809, method13025, method13026, method13027);
                                                    }
                                                }
                                                else {
                                                    class4340 = new Class403(this.field23809, method13025, method13026, method13027);
                                                    final Entity method13029 = this.field23809.getEntityByID(class4339.method13034());
                                                    if (method13029 != null) {
                                                        ((Class402)class4340).method1972(method13029);
                                                    }
                                                }
                                            }
                                            else {
                                                class4340 = new Class404(this.field23809, method13025, method13026, method13027);
                                                final Entity method13030 = this.field23809.getEntityByID(class4339.method13034());
                                                if (method13030 != null) {
                                                    ((Class402)class4340).method1972(method13030);
                                                }
                                            }
                                        }
                                        else {
                                            class4340 = new Class405(this.field23809, method13025, method13026, method13027);
                                            final Entity method13031 = this.field23809.getEntityByID(class4339.method13034());
                                            if (method13031 != null) {
                                                ((Class402)class4340).method1972(method13031);
                                            }
                                        }
                                    }
                                    else {
                                        final Entity method13032 = this.field23809.getEntityByID(class4339.method13034());
                                        if (!(method13032 instanceof PlayerEntity)) {
                                            class4340 = null;
                                        }
                                        else {
                                            class4340 = new Class425(this.field23809, (PlayerEntity)method13032, method13025, method13026, method13027);
                                        }
                                    }
                                }
                                else {
                                    class4340 = new Class430(this.field23809, method13025, method13026, method13027);
                                }
                            }
                            else {
                                class4340 = new Class429(this.field23809, method13025, method13026, method13027);
                            }
                        }
                        else {
                            class4340 = new Class454(this.field23809, method13025, method13026, method13027);
                        }
                    }
                    else {
                        class4340 = new Class431(this.field23809, method13025, method13026, method13027);
                    }
                }
                else {
                    class4340 = new Class432(this.field23809, method13025, method13026, method13027);
                }
            }
            else {
                class4340 = new Class506(this.field23809, method13025, method13026, method13027);
            }
        }
        else {
            class4340 = new Class505(this.field23809, method13025, method13026, method13027);
        }
        if (class4340 != null) {
            final int method13033 = class4339.method13023();
            class4340.setPacketCoordinates(method13025, method13026, method13027);
            class4340.rotationPitch = class4339.method13031() * 360 / 256.0f;
            class4340.rotationYaw = class4339.method13032() * 360 / 256.0f;
            class4340.method1644(method13033);
            class4340.method1864(class4339.method13024());
            this.field23809.method6819(method13033, class4340);
            if (class4340 instanceof Class428) {
                this.field23808.method5299().method6422(new Class6839((Class428)class4340));
            }
        }
    }
    
    @Override
    public void method17274(final Class4375 class4375) {
        Class8663.method29632((IPacket<Class5799>)class4375, this, this.field23808);
        final double method13154 = class4375.method13154();
        final double method13155 = class4375.method13155();
        final double method13156 = class4375.method13156();
        final Class508 class4376 = new Class508(this.field23809, method13154, method13155, method13156, class4375.method13157());
        class4376.setPacketCoordinates(method13154, method13155, method13156);
        class4376.rotationYaw = 0.0f;
        class4376.rotationPitch = 0.0f;
        class4376.method1644(class4375.method13153());
        this.field23809.method6819(class4375.method13153(), class4376);
    }
    
    @Override
    public void method17275(final Class4318 class4318) {
        Class8663.method29632((IPacket<Class5799>)class4318, this, this.field23808);
        final double method12975 = class4318.method12975();
        final double method12976 = class4318.method12976();
        final double method12977 = class4318.method12977();
        if (class4318.method12978() == 1) {
            final LightningBoltEntity class4319 = new LightningBoltEntity(this.field23809, method12975, method12976, method12977, false);
            class4319.setPacketCoordinates(method12975, method12976, method12977);
            class4319.rotationYaw = 0.0f;
            class4319.rotationPitch = 0.0f;
            class4319.method1644(class4318.method12974());
            this.field23809.method6817(class4319);
        }
    }
    
    @Override
    public void method17276(final Class4293 class4293) {
        Class8663.method29632((IPacket<Class5799>)class4293, this, this.field23808);
        final Class861 class4294 = new Class861(this.field23809, class4293.method12896(), class4293.method12897(), class4293.method12898());
        class4294.method1644(class4293.method12894());
        class4294.method1864(class4293.method12895());
        this.field23809.method6819(class4293.method12894(), class4294);
    }
    
    @Override
    public void method17277(final Class4273 class4273) {
        Class8663.method29632((IPacket<Class5799>)class4273, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4273.method12822());
        if (method6741 != null) {
            method6741.method1797(class4273.method12823() / 8000.0, class4273.method12824() / 8000.0, class4273.method12825() / 8000.0);
        }
    }
    
    @Override
    public void method17278(final Class4268 class4268) {
        Class8663.method29632((IPacket<Class5799>)class4268, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4268.method12811());
        if (method6741 != null) {
            if (class4268.method12810() != null) {
                method6741.method1650().method33577(class4268.method12810());
            }
        }
    }
    
    @Override
    public void method17279(final Class4361 class4361) {
        Class8663.method29632((IPacket<Class5799>)class4361, this, this.field23808);
        final double method13117 = class4361.method13117();
        final double method13118 = class4361.method13118();
        final double method13119 = class4361.method13119();
        final float n = class4361.method13120() * 360 / 256.0f;
        final float n2 = class4361.method13121() * 360 / 256.0f;
        if (this.method17371(class4361.method13116()) != null) {
            final int method13120 = class4361.method13115();
            final Class755 class4362 = new Class755(this.field23808.field4683, this.method17371(class4361.method13116()).method32719());
            class4362.method1644(method13120);
            class4362.method1731(method13117, method13118, method13119);
            class4362.setPacketCoordinates(method13117, method13118, method13119);
            class4362.method1728(method13117, method13118, method13119, n, n2);
            this.field23809.method6818(method13120, class4362);
        }
    }
    
    @Override
    public void method17280(final Class4258 class4258) {
        Class8663.method29632((IPacket<Class5799>)class4258, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4258.method12781());
        if (method6741 != null) {
            final double method6742 = class4258.method12782();
            final double method6743 = class4258.method12783();
            final double method6744 = class4258.method12784();
            method6741.setPacketCoordinates(method6742, method6743, method6744);
            if (!method6741.method1919()) {
                final float n = class4258.method12785() * 360 / 256.0f;
                final float n2 = class4258.method12786() * 360 / 256.0f;
                Label_0209: {
                    if (Math.abs(method6741.getPosX() - method6742) < 0.03125) {
                        if (Math.abs(method6741.getPosY() - method6743) < 0.015625) {
                            if (Math.abs(method6741.getPosZ() - method6744) < 0.03125) {
                                method6741.method1788(method6741.getPosX(), method6741.getPosY(), method6741.getPosZ(), n, n2, 3, true);
                                break Label_0209;
                            }
                        }
                    }
                    method6741.method1788(method6742, method6743, method6744, n, n2, 3, true);
                }
                method6741.onGround = class4258.method12787();
            }
        }
    }
    
    @Override
    public void method17281(final Class4388 class4388) {
        Class8663.method29632((IPacket<Class5799>)class4388, this, this.field23808);
        if (Class464.method2352(class4388.method13205())) {
            this.field23808.field4684.field3006.field2743 = class4388.method13205();
        }
    }
    
    @Override
    public void handleEntityMovement(final SEntityPacket class4370) {
        Class8663.method29632((IPacket<Class5799>)class4370, this, this.field23808);
        final Entity method13142 = class4370.getEntity(this.field23809);
        if (method13142 != null) {
            if (!method13142.method1919()) {
                if (!class4370.getIsMovePacket()) {
                    if (class4370.isRotating()) {
                        method13142.method1788(method13142.getPosX(), method13142.getPosY(), method13142.getPosZ(), class4370.getYaw() * 360 / 256.0f, class4370.getPitch() * 360 / 256.0f, 3, false);
                    }
                }
                else {
                    final Entity class4371 = method13142;
                    class4371.serverPosX += class4370.getX();
                    final Entity class4372 = method13142;
                    class4372.serverPosY += class4370.getY();
                    final Entity class4373 = method13142;
                    class4373.serverPosZ += class4370.getZ();
                    final Vec3d method13143 = SEntityPacket.func_218744_a(method13142.serverPosX, method13142.serverPosY, method13142.serverPosZ);
                    method13142.method1788(method13143.x, method13143.y, method13143.z, class4370.isRotating() ? (class4370.getYaw() * 360 / 256.0f) : method13142.rotationYaw, class4370.isRotating() ? (class4370.getPitch() * 360 / 256.0f) : method13142.rotationPitch, 3, false);
                }
                method13142.onGround = class4370.getOnGround();
            }
        }
    }
    
    @Override
    public void method17283(final Class4364 class4364) {
        Class8663.method29632((IPacket<Class5799>)class4364, this, this.field23808);
        final Entity method13127 = class4364.method13127(this.field23809);
        if (method13127 != null) {
            method13127.method1789(class4364.method13128() * 360 / 256.0f, 3);
        }
    }
    
    @Override
    public void method17284(final Class4325 class4325) {
        Class8663.method29632((IPacket<Class5799>)class4325, this, this.field23808);
        for (int i = 0; i < class4325.method12989().length; ++i) {
            this.field23809.method6821(class4325.method12989()[i]);
        }
    }
    
    @Override
    public void method17285(final Class4328 class4328) {
        Class8663.method29632((IPacket<Class5799>)class4328, this, this.field23808);
        final Class756 field4684 = this.field23808.field4684;
        final Vec3d method1935 = field4684.getMotion();
        final boolean contains = class4328.method12998().contains(Class2143.field12617);
        final boolean contains2 = class4328.method12998().contains(Class2143.field12618);
        final boolean contains3 = class4328.method12998().contains(Class2143.field12619);
        double method1936;
        double method1937;
        if (!contains) {
            method1936 = 0.0;
            method1937 = class4328.method12992();
            field4684.lastTickPosX = method1937;
        }
        else {
            method1936 = method1935.getX();
            method1937 = field4684.getPosX() + class4328.method12992();
            final Class756 class4329 = field4684;
            class4329.lastTickPosX += class4328.method12992();
        }
        double method1938;
        double method1939;
        if (!contains2) {
            method1938 = 0.0;
            method1939 = class4328.method12993();
            field4684.lastTickPosY = method1939;
        }
        else {
            method1938 = method1935.getY();
            method1939 = field4684.getPosY() + class4328.method12993();
            final Class756 class4330 = field4684;
            class4330.lastTickPosY += class4328.method12993();
        }
        double method1940;
        double method1941;
        if (!contains3) {
            method1940 = 0.0;
            method1941 = class4328.method12994();
            field4684.lastTickPosZ = method1941;
        }
        else {
            method1940 = method1935.getZ();
            method1941 = field4684.getPosZ() + class4328.method12994();
            final Class756 class4331 = field4684;
            class4331.lastTickPosZ += class4328.method12994();
        }
        field4684.method1948(method1937, method1939, method1941);
        field4684.prevPosX = method1937;
        field4684.prevPosY = method1939;
        field4684.prevPosZ = method1941;
        field4684.setMotion(method1936, method1938, method1940);
        float method1942 = class4328.method12995();
        float method1943 = class4328.method12996();
        if (class4328.method12998().contains(Class2143.field12621)) {
            method1943 += field4684.rotationPitch;
        }
        if (class4328.method12998().contains(Class2143.field12620)) {
            method1942 += field4684.rotationYaw;
        }
        field4684.method1728(method1937, method1939, method1941, method1942, method1943);
        this.field23805.method11174(new Class4348(class4328.method12997()));
        this.field23805.method11174(new Class4355(field4684.getPosX(), field4684.getPosY(), field4684.getPosZ(), field4684.rotationYaw, field4684.rotationPitch, false));
        if (!this.field23810) {
            this.field23810 = true;
            this.field23808.method5244(null);
        }
    }
    
    @Override
    public void method17286(final Class4312 class4312) {
        Class8663.method29632((IPacket<Class5799>)class4312, this, this.field23808);
        for (final Class7870 class4313 : class4312.method12963()) {
            this.field23809.method6824(class4313.method25489(), class4313.method25491());
        }
    }
    
    @Override
    public void method17287(final Class4298 class4298) {
        Class8663.method29632((IPacket<Class5799>)class4298, this, this.field23808);
        final int method12909 = class4298.method12909();
        final int method12910 = class4298.method12910();
        final Class1862 method12911 = this.field23809.method6835().method7415(method12909, method12910, class4298.method12915(), class4298.method12905(), class4298.method12913(), class4298.method12911());
        if (method12911 != null) {
            if (class4298.method12912()) {
                this.field23809.method6823(method12911);
            }
        }
        for (int i = 0; i < 16; ++i) {
            this.field23809.method6838(method12909, i, method12910);
        }
        for (final CompoundNBT class4299 : class4298.method12914()) {
            final TileEntity method12912 = this.field23809.getTileEntity(new BlockPos(class4299.getInt("x"), class4299.getInt("y"), class4299.getInt("z")));
            if (method12912 == null) {
                continue;
            }
            method12912.method2179(class4299);
        }
    }
    
    @Override
    public void method17288(final Class4288 class4288) {
        Class8663.method29632((IPacket<Class5799>)class4288, this, this.field23808);
        final int method12876 = class4288.method12876();
        final int method12877 = class4288.method12877();
        final Class1907 method12878 = this.field23809.method6835();
        method12878.method7412(method12876, method12877);
        final Class1886 method12879 = method12878.getLightManager();
        for (int i = 0; i < 16; ++i) {
            this.field23809.method6838(method12876, i, method12877);
            method12879.method7254(Class353.method1088(method12876, i, method12877), true);
        }
        method12879.method7255(new Class7859(method12876, method12877), false);
    }
    
    @Override
    public void method17289(final Class4271 class4271) {
        Class8663.method29632((IPacket<Class5799>)class4271, this, this.field23808);
        this.field23809.method6824(class4271.method12818(), class4271.method12817());
    }
    
    @Override
    public void method17290(final Class4262 class4262) {
        this.field23805.method11181(class4262.method12793());
    }
    
    @Override
    public void onDisconnect(final ITextComponent class2250) {
        this.field23808.method5264();
        if (this.field23807 == null) {
            this.field23808.method5244(new Class735(new Class720(new Class548()), "disconnect.lost", class2250));
        }
        else if (!(this.field23807 instanceof Class545)) {
            this.field23808.method5244(new Class735(this.field23807, "disconnect.lost", class2250));
        }
        else {
            this.field23808.method5244(new Class5070(((Class545)this.field23807).method3183(), "disconnect.lost", class2250).method15403());
        }
    }
    
    public void method17292(final IPacket<?> class4252) {
        this.field23805.method11174(class4252);
    }
    
    @Override
    public void method17293(final Class4304 class4304) {
        Class8663.method29632((IPacket<Class5799>)class4304, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4304.method12943());
        LivingEntity field4684 = (LivingEntity)this.field23809.getEntityByID(class4304.method12944());
        if (field4684 == null) {
            field4684 = this.field23808.field4684;
        }
        if (method6741 != null) {
            if (!(method6741 instanceof Class508)) {
                this.field23809.method6708(method6741.getPosX(), method6741.getPosY(), method6741.getPosZ(), Class8520.field35327, Class286.field1585, 0.2f, (this.field23817.nextFloat() - this.field23817.nextFloat()) * 1.4f + 2.0f, false);
            }
            else {
                this.field23809.method6708(method6741.getPosX(), method6741.getPosY(), method6741.getPosZ(), Class8520.field35186, Class286.field1585, 0.1f, (this.field23817.nextFloat() - this.field23817.nextFloat()) * 0.35f + 0.9f, false);
            }
            if (method6741 instanceof Class427) {
                ((Class427)method6741).method2107().method27691(class4304.method12945());
            }
            this.field23808.field4640.method6480(new Class6174(this.field23808.method5306(), this.field23808.method5333(), this.field23809, method6741, field4684));
            this.field23809.method6821(class4304.method12943());
        }
    }
    
    @Override
    public void method17294(final Class4378 class4378) {
        Class8663.method29632((IPacket<Class5799>)class4378, this, this.field23808);
        this.field23808.field4647.method3806(class4378.method13166(), class4378.method13164());
    }
    
    @Override
    public void method17295(final Class4289 class4289) {
        Class8663.method29632((IPacket<Class5799>)class4289, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4289.method12878());
        if (method6741 != null) {
            if (class4289.method12879() != 0) {
                if (class4289.method12879() != 3) {
                    if (class4289.method12879() != 1) {
                        if (class4289.method12879() != 2) {
                            if (class4289.method12879() != 4) {
                                if (class4289.method12879() == 5) {
                                    this.field23808.field4640.method6476(method6741, Class8432.field34614);
                                }
                            }
                            else {
                                this.field23808.field4640.method6476(method6741, Class8432.field34603);
                            }
                        }
                        else {
                            ((PlayerEntity)method6741).method2849(false, false);
                        }
                    }
                    else {
                        method6741.method1799();
                    }
                }
                else {
                    ((LivingEntity)method6741).method2707(Class316.field1878);
                }
            }
            else {
                ((LivingEntity)method6741).method2707(Class316.field1877);
            }
        }
    }
    
    @Override
    public void method17296(final Class4276 class4276) {
        Class8663.method29632((IPacket<Class5799>)class4276, this, this.field23808);
        final double method12832 = class4276.method12832();
        final double method12833 = class4276.method12833();
        final double method12834 = class4276.method12834();
        final float n = class4276.method12838() * 360 / 256.0f;
        final float n2 = class4276.method12839() * 360 / 256.0f;
        final LivingEntity class4277 = (LivingEntity) EntityType.method23372(class4276.method12831(), this.field23808.field4683);
        if (class4277 == null) {
            Class5799.field23804.warn("Skipping Entity with id {}", (Object)class4276.method12831());
        }
        else {
            class4277.setPacketCoordinates(method12832, method12833, method12834);
            class4277.field2951 = class4276.method12840() * 360 / 256.0f;
            class4277.field2953 = class4276.method12840() * 360 / 256.0f;
            if (class4277 instanceof Class852) {
                final Class859[] method12835 = ((Class852)class4277).method5123();
                for (int i = 0; i < method12835.length; ++i) {
                    method12835[i].method1644(i + class4276.method12829());
                }
            }
            class4277.method1644(class4276.method12829());
            class4277.method1864(class4276.method12830());
            class4277.method1728(method12832, method12833, method12834, n, n2);
            class4277.setMotion(class4276.method12835() / 8000.0f, class4276.method12836() / 8000.0f, class4276.method12837() / 8000.0f);
            this.field23809.method6819(class4276.method12829(), class4277);
            if (class4277 instanceof Class798) {
                Class6842 class4278;
                if (!((Class798)class4277).method4519()) {
                    class4278 = new Class6843((Class798)class4277);
                }
                else {
                    class4278 = new Class6844((Class798)class4277);
                }
                this.field23808.method5299().method6422(class4278);
            }
        }
    }
    
    @Override
    public void method17297(final Class4345 class4345) {
        Class8663.method29632((IPacket<Class5799>)class4345, this, this.field23808);
        this.field23808.field4683.method6752(class4345.method13048());
        this.field23808.field4683.method6756(class4345.method13049());
    }
    
    @Override
    public void method17298(final Class4335 class4335) {
        Class8663.method29632((IPacket<Class5799>)class4335, this, this.field23808);
        this.field23808.field4684.method2856(class4335.method13017(), true, false);
        this.field23808.field4683.method6764().method29548(class4335.method13017());
    }
    
    @Override
    public void method17299(final Class4286 class4286) {
        Class8663.method29632((IPacket<Class5799>)class4286, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4286.method12873());
        if (method6741 != null) {
            final boolean method6742 = method6741.method1917(this.field23808.field4684);
            method6741.removePassengers();
            final int[] method6743 = class4286.method12872();
            for (int length = method6743.length, i = 0; i < length; ++i) {
                final Entity method6744 = this.field23809.getEntityByID(method6743[i]);
                if (method6744 != null) {
                    method6744.method1780(method6741, true);
                    if (method6744 == this.field23808.field4684) {
                        if (!method6742) {
                            this.field23808.field4647.method3803(Class8822.method30773("mount.onboard", this.field23808.field4648.field23440.method1068()), false);
                        }
                    }
                }
            }
        }
        else {
            Class5799.field23804.warn("Received passengers for unknown entity");
        }
    }
    
    @Override
    public void method17300(final Class4305 class4305) {
        Class8663.method29632((IPacket<Class5799>)class4305, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4305.method12946());
        if (method6741 instanceof Class759) {
            ((Class759)method6741).method4208(class4305.method12947());
        }
    }
    
    private static ItemStack method17301(final PlayerEntity playerEntity) {
        final Class316[] values = Class316.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final ItemStack method2715 = playerEntity.method2715(values[i]);
            if (method2715.getItem() == Items.field31590) {
                return method2715;
            }
        }
        return new ItemStack(Items.field31590);
    }
    
    @Override
    public void method17302(final Class4264 class4264) {
        Class8663.method29632((IPacket<Class5799>)class4264, this, this.field23808);
        final Entity method12799 = class4264.method12799(this.field23809);
        if (method12799 != null) {
            if (class4264.method12800() != 21) {
                if (class4264.method12800() != 35) {
                    method12799.method1798(class4264.method12800());
                }
                else {
                    this.field23808.field4640.method6477(method12799, Class8432.field34644, 30);
                    this.field23809.method6708(method12799.getPosX(), method12799.getPosY(), method12799.getPosZ(), Class8520.field35633, method12799.method1922(), 1.0f, 1.0f, false);
                    if (method12799 == this.field23808.field4684) {
                        this.field23808.field4644.method5829(method17301(this.field23808.field4684));
                    }
                }
            }
            else {
                this.field23808.method5299().method6422(new Class6841((Class844)method12799));
            }
        }
    }
    
    @Override
    public void method17303(final Class4292 class4292) {
        Class8663.method29632((IPacket<Class5799>)class4292, this, this.field23808);
        this.field23808.field4684.method4116(class4292.method12891());
        this.field23808.field4684.method2877().method33495(class4292.method12892());
        this.field23808.field4684.method2877().method33496(class4292.method12893());
    }
    
    @Override
    public void method17304(final Class4313 class4313) {
        Class8663.method29632((IPacket<Class5799>)class4313, this, this.field23808);
        this.field23808.field4684.method4126(class4313.method12964(), class4313.method12965(), class4313.method12966());
    }
    
    @Override
    public void method17305(final Class4359 class4359) {
        Class8663.method29632((IPacket<Class5799>)class4359, this, this.field23808);
        final DimensionType method13097 = class4359.method13097();
        final Class756 field4684 = this.field23808.field4684;
        final int method13098 = field4684.getEntityId();
        if (method13097 != field4684.dimension) {
            this.field23810 = false;
            (this.field23809 = new Class1848(this, new Class8511(class4359.method13098(), class4359.method13099(), false, this.field23808.field4683.method6764().method29568(), class4359.method13100()), class4359.method13097(), this.field23816, this.field23808.method5327(), this.field23808.field4636)).method6832(this.field23809.method6782());
            this.field23808.method5263(this.field23809);
            this.field23808.method5244(new Class556());
        }
        this.field23809.setInitialSpawnLocation();
        this.field23809.method6830();
        final String method13099 = field4684.method4120();
        this.field23808.field4689 = null;
        final Class756 method13100 = this.field23808.field4682.method27306(this.field23809, field4684.method4121(), field4684.method4122());
        method13100.method1644(method13098);
        method13100.dimension = method13097;
        this.field23808.field4684 = method13100;
        this.field23808.field4689 = method13100;
        method13100.method1650().method33577(field4684.method1650().method33573());
        method13100.method2711().method20883(field4684.method2711());
        method13100.method1651();
        method13100.method4119(method13099);
        this.field23809.method6818(method13098, method13100);
        method13100.rotationYaw = -180.0f;
        method13100.field4085 = new Class6094(this.field23808.field4648);
        this.field23808.field4682.method27308(method13100);
        method13100.method2897(field4684.method2896());
        method13100.method4127(field4684.method4128());
        if (this.field23808.field4700 instanceof Class533) {
            this.field23808.method5244(null);
        }
        this.field23808.field4682.method27309(class4359.method13099());
    }
    
    @Override
    public void method17306(final Class4394 class4394) {
        Class8663.method29632((IPacket<Class5799>)class4394, this, this.field23808);
        new Explosion(this.field23808.field4683, null, class4394.method13214(), class4394.method13215(), class4394.method13216(), class4394.method13217(), class4394.method13218()).method18409(true);
        this.field23808.field4684.method1936(this.field23808.field4684.getMotion().add(class4394.method13211(), class4394.method13212(), class4394.method13213()));
    }
    
    @Override
    public void method17307(final Class4259 class4259) {
        Class8663.method29632((IPacket<Class5799>)class4259, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4259.method12790());
        if (method6741 instanceof Class806) {
            final Class756 field4684 = this.field23808.field4684;
            final Class806 class4260 = (Class806)method6741;
            final Class3425 field4685 = new Class3425(class4259.method12788(), field4684.field3006, new Class443(class4259.method12789()), class4260);
            field4684.field3009 = field4685;
            this.field23808.method5244(new Class742(field4685, field4684.field3006, class4260));
        }
    }
    
    @Override
    public void method17308(final Class4308 class4308) {
        Class8663.method29632((IPacket<Class5799>)class4308, this, this.field23808);
        Class4970.method15154(class4308.method12952(), this.field23808, class4308.method12951(), class4308.method12953());
    }
    
    @Override
    public void method17309(final Class4272 class4272) {
        Class8663.method29632((IPacket<Class5799>)class4272, this, this.field23808);
        final Class756 field4684 = this.field23808.field4684;
        final ItemStack method12821 = class4272.method12821();
        final int method12822 = class4272.method12820();
        this.field23808.method5319().method32922(method12821);
        if (class4272.method12819() != -1) {
            if (class4272.method12819() != -2) {
                boolean b = false;
                if (this.field23808.field4700 instanceof Class525) {
                    b = (((Class525)this.field23808.field4700).method3018() != Class7207.field28005.method22108());
                }
                if (class4272.method12819() == 0) {
                    if (class4272.method12820() >= 36) {
                        if (method12822 < 45) {
                            if (!method12821.method27620()) {
                                final ItemStack method12823 = field4684.field3008.method10878(method12822).method20053();
                                if (method12823.method27620() || method12823.method27690() < method12821.method27690()) {
                                    method12821.method27689(5);
                                }
                            }
                            field4684.field3008.method10882(method12822, method12821);
                            return;
                        }
                    }
                }
                if (class4272.method12819() == field4684.field3009.field16154) {
                    if (class4272.method12819() != 0 || !b) {
                        field4684.field3009.method10882(method12822, method12821);
                    }
                }
            }
            else {
                field4684.field3006.method2160(method12822, method12821);
            }
        }
        else if (!(this.field23808.field4700 instanceof Class525)) {
            field4684.field3006.method2374(method12821);
        }
    }
    
    @Override
    public void method17310(final Class4393 class4393) {
        Class8663.method29632((IPacket<Class5799>)class4393, this, this.field23808);
        Class3418 class4394 = null;
        final Class756 field4684 = this.field23808.field4684;
        if (class4393.method13208() != 0) {
            if (class4393.method13208() == field4684.field3009.field16154) {
                class4394 = field4684.field3009;
            }
        }
        else {
            class4394 = field4684.field3008;
        }
        if (class4394 != null) {
            if (!class4393.method13210()) {
                this.method17292(new Class4255(class4393.method13208(), class4393.method13209(), true));
            }
        }
    }
    
    @Override
    public void method17311(final Class4365 class4365) {
        Class8663.method29632((IPacket<Class5799>)class4365, this, this.field23808);
        final Class756 field4684 = this.field23808.field4684;
        if (class4365.method13129() != 0) {
            if (class4365.method13129() == field4684.field3009.field16154) {
                field4684.field3009.method10883(class4365.method13130());
            }
        }
        else {
            field4684.field3008.method10883(class4365.method13130());
        }
    }
    
    @Override
    public void method17312(final Class4350 class4350) {
        Class8663.method29632((IPacket<Class5799>)class4350, this, this.field23808);
        TileEntity method6727 = this.field23809.getTileEntity(class4350.method13067());
        if (!(method6727 instanceof Class497)) {
            method6727 = new Class497();
            method6727.method2187(this.field23809, class4350.method13067());
        }
        this.field23808.field4684.method2827((Class497)method6727);
    }
    
    @Override
    public void method17313(final Class4357 class4357) {
        Class8663.method29632((IPacket<Class5799>)class4357, this, this.field23808);
        if (this.field23808.field4683.method6971(class4357.method13084())) {
            final TileEntity method6727 = this.field23808.field4683.getTileEntity(class4357.method13084());
            final int method6728 = class4357.method13085();
            final boolean b = method6728 == 2 && method6727 instanceof Class500;
            Label_0190: {
                if (method6728 != 1 || !(method6727 instanceof Class494)) {
                    if (!b) {
                        if (method6728 != 3 || !(method6727 instanceof Class490)) {
                            if (method6728 != 4 || !(method6727 instanceof Class493)) {
                                if (method6728 != 6 || !(method6727 instanceof Class465)) {
                                    if (method6728 != 7 || !(method6727 instanceof Class501)) {
                                        if (method6728 != 8 || !(method6727 instanceof Class488)) {
                                            if (method6728 != 9 || !(method6727 instanceof Class497)) {
                                                if (method6728 != 11 || !(method6727 instanceof Class437)) {
                                                    if (method6728 != 5 || !(method6727 instanceof Class492)) {
                                                        if (method6728 != 12 || !(method6727 instanceof Class498)) {
                                                            if (method6728 != 13 || !(method6727 instanceof Class448)) {
                                                                if (method6728 != 14) {
                                                                    break Label_0190;
                                                                }
                                                                if (!(method6727 instanceof Class438)) {
                                                                    break Label_0190;
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
                method6727.method2179(class4357.method13086());
            }
            if (b) {
                if (this.field23808.field4700 instanceof Class542) {
                    ((Class542)this.field23808.field4700).method3167();
                }
            }
        }
    }
    
    @Override
    public void method17314(final Class4311 class4311) {
        Class8663.method29632((IPacket<Class5799>)class4311, this, this.field23808);
        final Class756 field4684 = this.field23808.field4684;
        if (field4684.field3009 != null) {
            if (field4684.field3009.field16154 == class4311.method12960()) {
                field4684.field3009.method10884(class4311.method12961(), class4311.method12962());
            }
        }
    }
    
    @Override
    public void method17315(final Class4402 class4402) {
        Class8663.method29632((IPacket<Class5799>)class4402, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4402.method13248());
        if (method6741 != null) {
            method6741.method1803(class4402.method13249(), class4402.method13247());
        }
    }
    
    @Override
    public void method17316(final Class4284 class4284) {
        Class8663.method29632((IPacket<Class5799>)class4284, this, this.field23808);
        this.field23808.field4684.method4115();
    }
    
    @Override
    public void method17317(final Class4363 class4363) {
        Class8663.method29632((IPacket<Class5799>)class4363, this, this.field23808);
        this.field23808.field4683.method6763(class4363.method13123(), class4363.method13126(), class4363.method13124(), class4363.method13125());
    }
    
    @Override
    public void method17318(final Class4310 class4310) {
        Class8663.method29632((IPacket<Class5799>)class4310, this, this.field23808);
        this.field23808.field4683.method6780(class4310.method12957(), class4310.method12958(), class4310.method12959());
    }
    
    @Override
    public void method17319(final Class4306 class4306) {
        Class8663.method29632((IPacket<Class5799>)class4306, this, this.field23808);
        final Class756 field4684 = this.field23808.field4684;
        final int method12948 = class4306.method12948();
        final float method12949 = class4306.method12949();
        final int method12950 = MathHelper.method35642(method12949 + 0.5f);
        if (method12948 >= 0) {
            if (method12948 < Class4306.field19308.length) {
                if (Class4306.field19308[method12948] != null) {
                    field4684.method2853(new Class2259(Class4306.field19308[method12948], new Object[0]), false);
                }
            }
        }
        if (method12948 != 1) {
            if (method12948 != 2) {
                if (method12948 != 3) {
                    if (method12948 != 4) {
                        if (method12948 != 5) {
                            if (method12948 != 6) {
                                if (method12948 != 7) {
                                    if (method12948 != 8) {
                                        if (method12948 != 9) {
                                            if (method12948 != 10) {
                                                if (method12948 == 11) {
                                                    this.field23808.field4684.method4127(method12949 == 0.0f);
                                                }
                                            }
                                            else {
                                                this.field23809.method6709(Class8432.field34613, field4684.getPosX(), field4684.getPosY(), field4684.getPosZ(), 0.0, 0.0, 0.0);
                                                this.field23809.method6706(field4684, field4684.getPosX(), field4684.getPosY(), field4684.getPosZ(), Class8520.field35143, Class286.field1583, 1.0f, 1.0f);
                                            }
                                        }
                                        else {
                                            this.field23809.method6706(field4684, field4684.getPosX(), field4684.getPosY(), field4684.getPosZ(), Class8520.field35505, Class286.field1584, 1.0f, 1.0f);
                                        }
                                    }
                                    else {
                                        this.field23809.method6767(method12949);
                                    }
                                }
                                else {
                                    this.field23809.method6769(method12949);
                                }
                            }
                            else {
                                this.field23809.method6706(field4684, field4684.getPosX(), field4684.method1944(), field4684.getPosZ(), Class8520.field34992, Class286.field1585, 0.18f, 0.45f);
                            }
                        }
                        else {
                            final Class5760 field4685 = this.field23808.field4648;
                            if (method12949 != 0.0f) {
                                if (method12949 != 101.0f) {
                                    if (method12949 != 102.0f) {
                                        if (method12949 != 103.0f) {
                                            if (method12949 == 104.0f) {
                                                this.field23808.field4647.method3807().method3761(new Class2259("demo.day.6", new Object[] { field4685.field23451.method1068() }));
                                            }
                                        }
                                        else {
                                            this.field23808.field4647.method3807().method3761(new Class2259("demo.help.inventory", new Object[] { field4685.field23442.method1068() }));
                                        }
                                    }
                                    else {
                                        this.field23808.field4647.method3807().method3761(new Class2259("demo.help.jump", new Object[] { field4685.field23439.method1068() }));
                                    }
                                }
                                else {
                                    this.field23808.field4647.method3807().method3761(new Class2259("demo.help.movement", new Object[] { field4685.field23435.method1068(), field4685.field23436.method1068(), field4685.field23437.method1068(), field4685.field23438.method1068() }));
                                }
                            }
                            else {
                                this.field23808.method5244(new Class562());
                            }
                        }
                    }
                    else if (method12950 != 0) {
                        if (method12950 == 1) {
                            this.field23808.method5244(new Class697(true, () -> this.field23808.field4684.field4069.method17292(new Class4323(Class2218.field13621))));
                        }
                    }
                    else {
                        this.field23808.field4684.field4069.method17292(new Class4323(Class2218.field13621));
                        this.field23808.method5244(new Class556());
                    }
                }
                else {
                    this.field23808.field4682.method27309(Class101.method592(method12950));
                }
            }
            else {
                this.field23809.method6764().method29561(false);
                this.field23809.method6769(1.0f);
            }
        }
        else {
            this.field23809.method6764().method29561(true);
            this.field23809.method6769(0.0f);
        }
    }
    
    @Override
    public void method17320(final Class4333 class4333) {
        Class8663.method29632((IPacket<Class5799>)class4333, this, this.field23808);
        final Class1905 method5822 = this.field23808.field4644.method5822();
        final String method5823 = Class4094.method12331(class4333.method13011());
        Class6356 method5824 = this.field23808.field4683.method6774(method5823);
        if (method5824 == null) {
            method5824 = new Class6356(method5823);
            if (method5822.method7393(method5823) != null) {
                final Class6356 method5825 = method5822.method7395(method5822.method7393(method5823));
                if (method5825 != null) {
                    method5824 = method5825;
                }
            }
            this.field23808.field4683.method6775(method5824);
        }
        class4333.method13012(method5824);
        method5822.method7390(method5824);
    }
    
    @Override
    public void method17321(final Class4395 class4395) {
        Class8663.method29632((IPacket<Class5799>)class4395, this, this.field23808);
        if (!class4395.method13219()) {
            this.field23808.field4683.method6955(class4395.method13220(), class4395.method13222(), class4395.method13221());
        }
        else {
            this.field23808.field4683.method6777(class4395.method13220(), class4395.method13222(), class4395.method13221());
        }
    }
    
    @Override
    public void method17322(final Class4385 class4385) {
        Class8663.method29632((IPacket<Class5799>)class4385, this, this.field23808);
        this.field23812.method30867(class4385);
    }
    
    @Override
    public void method17323(final Class4269 class4269) {
        Class8663.method29632((IPacket<Class5799>)class4269, this, this.field23808);
        final ResourceLocation method12812 = class4269.method12812();
        if (method12812 != null) {
            this.field23812.method30869(this.field23812.method30868().method19675(method12812), false);
        }
        else {
            this.field23812.method30869(null, false);
        }
    }
    
    @Override
    public void method17324(final Class4369 class4369) {
        Class8663.method29632((IPacket<Class5799>)class4369, this, this.field23808);
        this.field23818 = (CommandDispatcher<Class7491>)new CommandDispatcher((RootCommandNode)class4369.method13139());
    }
    
    @Override
    public void method17325(final Class4382 class4382) {
        Class8663.method29632((IPacket<Class5799>)class4382, this, this.field23808);
        this.field23808.method5299().method6435(class4382.method13174(), class4382.method13175());
    }
    
    @Override
    public void method17326(final Class4337 class4337) {
        Class8663.method29632((IPacket<Class5799>)class4337, this, this.field23808);
        this.field23813.method23216(class4337.method13020(), class4337.method13021());
    }
    
    @Override
    public void method17327(final Class4281 class4281) {
        Class8663.method29632((IPacket<Class5799>)class4281, this, this.field23808);
        this.field23819.method6386(class4281.method12859());
        final Class8924<Class9586> method5309 = this.field23808.method5309(Class1659.field9377);
        method5309.method31459();
        final Class6520 method5310 = this.field23808.field4684.method4122();
        method5310.method19683();
        method5310.method19688().forEach(method5309::method31458);
        method5309.method31454();
    }
    
    @Override
    public void method17328(final Class4280 class4280) {
        Class8663.method29632((IPacket<Class5799>)class4280, this, this.field23808);
        final Vec3d method12858 = class4280.method12858(this.field23809);
        if (method12858 != null) {
            this.field23808.field4684.method1927(class4280.method12857(), method12858);
        }
    }
    
    @Override
    public void method17329(final Class4296 class4296) {
        Class8663.method29632((IPacket<Class5799>)class4296, this, this.field23808);
        if (!this.field23815.method26645(class4296.method12902(), class4296.method12903())) {
            Class5799.field23804.debug("Got unhandled response to tag query {}", (Object)class4296.method12902());
        }
    }
    
    @Override
    public void method17330(final Class4279 class4279) {
        Class8663.method29632((IPacket<Class5799>)class4279, this, this.field23808);
        for (final Map.Entry<Class9455, V> entry : class4279.method12856().entrySet()) {
            this.field23808.field4684.method4121().method23075(this.field23808.field4684, entry.getKey(), (int)entry.getValue());
        }
        if (this.field23808.field4700 instanceof Class692) {
            ((Class692)this.field23808.field4700).method3857();
        }
    }
    
    @Override
    public void method17331(final Class4331 class4331) {
        Class8663.method29632((IPacket<Class5799>)class4331, this, this.field23808);
        final Class6520 method4122 = this.field23808.field4684.method4122();
        method4122.method19704(class4331.method13005());
        method4122.method19707(class4331.method13006());
        method4122.method19709(class4331.method13007());
        method4122.method19711(class4331.method13008());
        switch (Class8379.field34355[class4331.method13009().ordinal()]) {
            case 1: {
                final Iterator<ResourceLocation> iterator = class4331.method13003().iterator();
                while (iterator.hasNext()) {
                    this.field23819.method6382(iterator.next()).ifPresent(method4122::method19697);
                }
                break;
            }
            case 2: {
                final Iterator<ResourceLocation> iterator2 = class4331.method13003().iterator();
                while (iterator2.hasNext()) {
                    this.field23819.method6382(iterator2.next()).ifPresent(method4122::method19693);
                }
                final Iterator<ResourceLocation> iterator3 = class4331.method13004().iterator();
                while (iterator3.hasNext()) {
                    this.field23819.method6382(iterator3.next()).ifPresent(method4122::method19701);
                }
                break;
            }
            case 3: {
                final Iterator<ResourceLocation> iterator4 = class4331.method13003().iterator();
                while (iterator4.hasNext()) {
                    this.field23819.method6382(iterator4.next()).ifPresent(class4333 -> {
                        class4332.method19693(class4333);
                        class4332.method19701(class4333);
                        Class6867.method20984(this.field23808.method5318(), class4333);
                        return;
                    });
                }
                break;
            }
        }
        method4122.method19688().forEach(class4335 -> class4335.method35940(class4334));
        if (this.field23808.field4700 instanceof Class519) {
            ((Class519)this.field23808.field4700).method3000();
        }
    }
    
    @Override
    public void method17332(final Class4384 class4384) {
        Class8663.method29632((IPacket<Class5799>)class4384, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4384.method13186());
        if (method6741 instanceof LivingEntity) {
            final Class5328 method6742 = Class5328.method16450(class4384.method13187());
            if (method6742 != null) {
                final Class1948 class4385 = new Class1948(method6742, class4384.method13189(), class4384.method13188(), class4384.method13191(), class4384.method13190(), class4384.method13192());
                class4385.method7920(class4384.method13185());
                ((LivingEntity)method6741).method2655(class4385);
            }
        }
    }
    
    @Override
    public void method17333(final Class4297 class4297) {
        Class8663.method29632((IPacket<Class5799>)class4297, this, this.field23808);
        this.field23814 = class4297.method12904();
        if (!this.field23805.method11182()) {
            Class7188.method22056(this.field23814.method6463());
            Class7855.method25401(this.field23814.method6464());
            Class7324.method22477(this.field23814.method6465());
            Class8039.method26370(this.field23814.method6466());
        }
        this.field23808.method5309(Class1659.field9376).method31454();
    }
    
    @Override
    public void method17334(final Class4260 class4260) {
        Class8663.method29632((IPacket<Class5799>)class4260, this, this.field23808);
        if (class4260.field19115 == Class344.field2122) {
            if (this.field23809.getEntityByID(class4260.field19116) == this.field23808.field4684) {
                if (!this.field23808.field4684.method4128()) {
                    this.field23808.field4684.method2842();
                }
                else {
                    this.field23808.method5244(new Class533(class4260.field19119, this.field23809.method6764().method29568()));
                }
            }
        }
    }
    
    @Override
    public void method17335(final Class4315 class4315) {
        Class8663.method29632((IPacket<Class5799>)class4315, this, this.field23808);
        this.field23808.field4683.method6764().method29598(class4315.method12971());
        this.field23808.field4683.method6764().method29600(class4315.method12970());
    }
    
    @Override
    public void method17336(final Class4343 class4343) {
        Class8663.method29632((IPacket<Class5799>)class4343, this, this.field23808);
        final Entity method13045 = class4343.method13045(this.field23809);
        if (method13045 != null) {
            this.field23808.method5304(method13045);
        }
    }
    
    @Override
    public void method17337(final Class4340 class4340) {
        Class8663.method29632((IPacket<Class5799>)class4340, this, this.field23808);
        class4340.method13035(this.field23809.getWorldBorder());
    }
    
    @Override
    public void method17338(final Class4352 class4352) {
        Class8663.method29632((IPacket<Class5799>)class4352, this, this.field23808);
        final Class2019 method13073 = class4352.method13073();
        String s = null;
        String s2 = null;
        final String s3 = (class4352.method13074() != null) ? class4352.method13074().getFormattedText() : "";
        switch (Class8379.field34356[method13073.ordinal()]) {
            case 1: {
                s = s3;
                break;
            }
            case 2: {
                s2 = s3;
                break;
            }
            case 3: {
                this.field23808.field4647.method3803(s3, false);
                return;
            }
            case 4: {
                this.field23808.field4647.method3804("", "", -1, -1, -1);
                this.field23808.field4647.method3778();
                return;
            }
        }
        this.field23808.field4647.method3804(s, s2, class4352.method13075(), class4352.method13076(), class4352.method13077());
    }
    
    @Override
    public void method17339(final Class4374 class4374) {
        this.field23808.field4647.method3811().method3825(class4374.method13151().getFormattedText().isEmpty() ? null : class4374.method13151());
        this.field23808.field4647.method3811().method3824(class4374.method13152().getFormattedText().isEmpty() ? null : class4374.method13152());
    }
    
    @Override
    public void method17340(final Class4295 class4295) {
        Class8663.method29632((IPacket<Class5799>)class4295, this, this.field23808);
        final Entity method12900 = class4295.method12900(this.field23809);
        if (method12900 instanceof LivingEntity) {
            ((LivingEntity)method12900).method2658(class4295.method12901());
        }
    }
    
    @Override
    public void method17341(final Class4330 class4330) {
        Class8663.method29632((IPacket<Class5799>)class4330, this, this.field23808);
        for (final Class4646 class4331 : class4330.method13001()) {
            if (class4330.method13002() == Class2156.field12807) {
                this.field23811.remove(class4331.method13869().getId());
            }
            else {
                Class9081 class4332 = this.field23811.get(class4331.method13869().getId());
                if (class4330.method13002() == Class2156.field12803) {
                    class4332 = new Class9081(class4331);
                    this.field23811.put(class4332.method32719().getId(), class4332);
                }
                if (class4332 == null) {
                    continue;
                }
                switch (Class8379.field34357[class4330.method13002().ordinal()]) {
                    case 1: {
                        class4332.method32721(class4331.method13871());
                        class4332.method32723(class4331.method13870());
                        class4332.method32731(class4331.method13872());
                        continue;
                    }
                    case 2: {
                        class4332.method32721(class4331.method13871());
                        continue;
                    }
                    case 3: {
                        class4332.method32723(class4331.method13870());
                        continue;
                    }
                    case 4: {
                        class4332.method32731(class4331.method13872());
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public void method17342(final Class4396 class4396) {
        this.method17292(new Class4303(class4396.method13223()));
    }
    
    @Override
    public void method17343(final Class4300 class4300) {
        Class8663.method29632((IPacket<Class5799>)class4300, this, this.field23808);
        final Class756 field4684 = this.field23808.field4684;
        field4684.field3025.field27302 = class4300.method12919();
        field4684.field3025.field27304 = class4300.method12923();
        field4684.field3025.field27301 = class4300.method12917();
        field4684.field3025.field27303 = class4300.method12921();
        field4684.field3025.method21426(class4300.method12925());
        field4684.field3025.method21428(class4300.method12927());
    }
    
    @Override
    public void method17344(final Class4282 class4282) {
        Class8663.method29632((IPacket<Class5799>)class4282, this, this.field23808);
        this.field23808.field4683.method6706(this.field23808.field4684, class4282.method12865(), class4282.method12866(), class4282.method12867(), class4282.method12863(), class4282.method12864(), class4282.method12868(), class4282.method12869());
    }
    
    @Override
    public void method17345(final Class4351 class4351) {
        Class8663.method29632((IPacket<Class5799>)class4351, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4351.method13070());
        if (method6741 != null) {
            this.field23808.field4683.method6707(this.field23808.field4684, method6741, class4351.method13068(), class4351.method13069(), class4351.method13071(), class4351.method13072());
        }
    }
    
    @Override
    public void method17346(final Class4342 class4342) {
        Class8663.method29632((IPacket<Class5799>)class4342, this, this.field23808);
        this.field23808.method5299().method6422(new Class6836(class4342.method13038(), class4342.method13039(), class4342.method13043(), class4342.method13044(), false, 0, Class229.field810, (float)class4342.method13040(), (float)class4342.method13041(), (float)class4342.method13042(), false));
    }
    
    @Override
    public void method17347(final Class4283 class4283) {
        final String method12870 = class4283.method12870();
        final String method12871 = class4283.method12871();
        if (this.method17348(method12870)) {
            if (method12870.startsWith("level://")) {
                try {
                    final File file = new File(new File(this.field23808.field4652, "saves"), URLDecoder.decode(method12870.substring("level://".length()), StandardCharsets.UTF_8.toString()));
                    if (file.isFile()) {
                        this.method17350(Class2061.field11785);
                        this.method17349(this.field23808.method5293().method25747(file));
                        return;
                    }
                }
                catch (final UnsupportedEncodingException ex) {}
                this.method17350(Class2061.field11784);
            }
            else {
                final Class9575 method12872 = this.field23808.method5282();
                if (method12872 != null && method12872.method35866() == Class2203.field13412) {
                    this.method17350(Class2061.field11785);
                    this.method17349(this.field23808.method5293().method25742(method12870, method12871));
                }
                else if (method12872 != null && method12872.method35866() != Class2203.field13414) {
                    this.method17350(Class2061.field11783);
                }
                else {
                    this.field23808.execute(() -> {
                        final Class869 field23808 = this.field23808;
                        new Class546(b -> {
                            this.field23808 = Class869.method5277();
                            final Class9575 method5282 = this.field23808.method5282();
                            if (!b) {
                                if (method5282 != null) {
                                    method5282.method35867(Class2203.field13413);
                                }
                                this.method17350(Class2061.field11783);
                            }
                            else {
                                if (method5282 != null) {
                                    method5282.method35867(Class2203.field13412);
                                }
                                this.method17350(Class2061.field11785);
                                this.method17349(this.field23808.method5293().method25742(s, s2));
                            }
                            Class9295.method34339(method5282);
                            this.field23808.method5244(null);
                        }, new Class2259("multiplayer.texturePrompt.line1", new Object[0]), new Class2259("multiplayer.texturePrompt.line2", new Object[0]));
                        final Class546 class4284;
                        field23808.method5244(class4284);
                    });
                }
            }
        }
    }
    
    private boolean method17348(final String input) {
        try {
            final String scheme = new URI(input).getScheme();
            final boolean equals = "level".equals(scheme);
            if (!"http".equals(scheme) && !"https".equals(scheme) && !equals) {
                throw new URISyntaxException(input, "Wrong protocol");
            }
            if (!equals || (!input.contains("..") && input.endsWith("/resources.zip"))) {
                return true;
            }
            throw new URISyntaxException(input, "Invalid levelstorage resourcepack path");
        }
        catch (final URISyntaxException ex) {
            this.method17350(Class2061.field11784);
            return false;
        }
    }
    
    private void method17349(final CompletableFuture<?> completableFuture) {
        completableFuture.thenRun(() -> this.method17350(Class2061.field11782)).exceptionally(p0 -> {
            this.method17350(Class2061.field11784);
            return null;
        });
    }
    
    private void method17350(final Class2061 class2061) {
        this.field23805.method11174(new Class4285(class2061));
    }
    
    @Override
    public void method17351(final Class4301 class4301) {
        Class8663.method29632((IPacket<Class5799>)class4301, this, this.field23808);
        this.field23808.field4647.method3813().method3332(class4301);
    }
    
    @Override
    public void method17352(final Class4391 class4391) {
        Class8663.method29632((IPacket<Class5799>)class4391, this, this.field23808);
        if (class4391.method13207() != 0) {
            this.field23808.field4684.method2906().method25772(class4391.method13206(), class4391.method13207());
        }
        else {
            this.field23808.field4684.method2906().method25773(class4391.method13206());
        }
    }
    
    @Override
    public void method17353(final Class4263 class4263) {
        Class8663.method29632((IPacket<Class5799>)class4263, this, this.field23808);
        final Entity method1915 = this.field23808.field4684.method1915();
        if (method1915 != this.field23808.field4684) {
            if (method1915.method1919()) {
                method1915.method1728(class4263.method12794(), class4263.method12795(), class4263.method12796(), class4263.method12797(), class4263.method12798());
                this.field23805.method11174(new Class4251(method1915));
            }
        }
    }
    
    @Override
    public void method17354(final Class4316 class4316) {
        Class8663.method29632((IPacket<Class5799>)class4316, this, this.field23808);
        final ItemStack method2715 = this.field23808.field4684.method2715(class4316.method12972());
        if (method2715.getItem() == Items.field31513) {
            this.field23808.method5244(new Class723(new Class7738(method2715)));
        }
    }
    
    @Override
    public void method17355(final Class4376 class4376) {
        Class8663.method29632((IPacket<Class5799>)class4376, this, this.field23808);
        final ResourceLocation method13158 = class4376.method13158();
        PacketBuffer method13159 = null;
        try {
            method13159 = class4376.method13159();
            if (Class4376.field19590.equals(method13158)) {
                this.field23808.field4684.method4119(method13159.method29513(32767));
            }
            else if (Class4376.field19591.equals(method13158)) {
                this.field23808.field4645.field28207.method18271(method13159.readInt(), Class9468.method35231(method13159), method13159.readFloat());
            }
            else if (Class4376.field19592.equals(method13158)) {
                ((Class6125)this.field23808.field4645.field28212).method18346(method13159.method29502(), method13159.method29494());
            }
            else if (Class4376.field19593.equals(method13158)) {
                final BlockPos method13160 = method13159.method29494();
                final int int1 = method13159.readInt();
                final ArrayList arrayList = Lists.newArrayList();
                final ArrayList arrayList2 = Lists.newArrayList();
                for (int i = 0; i < int1; ++i) {
                    arrayList.add(method13159.method29494());
                    arrayList2.add(method13159.readFloat());
                }
                this.field23808.field4645.field28213.method18312(method13160, arrayList, arrayList2);
            }
            else if (Class4376.field19594.equals(method13158)) {
                final DimensionType method13161 = DimensionType.method1274(method13159.readInt());
                final MutableBoundingBox class4377 = new MutableBoundingBox(method13159.readInt(), method13159.readInt(), method13159.readInt(), method13159.readInt(), method13159.readInt(), method13159.readInt());
                final int int2 = method13159.readInt();
                final ArrayList arrayList3 = Lists.newArrayList();
                final ArrayList arrayList4 = Lists.newArrayList();
                for (int j = 0; j < int2; ++j) {
                    arrayList3.add(new MutableBoundingBox(method13159.readInt(), method13159.readInt(), method13159.readInt(), method13159.readInt(), method13159.readInt(), method13159.readInt()));
                    arrayList4.add(method13159.readBoolean());
                }
                this.field23808.field4645.field28214.method18345(class4377, arrayList3, arrayList4, method13161);
            }
            else if (Class4376.field19595.equals(method13158)) {
                ((Class6120)this.field23808.field4645.field28216).method18315(method13159.method29494(), method13159.readFloat(), method13159.readFloat(), method13159.readFloat(), method13159.readFloat(), method13159.readFloat());
            }
            else if (Class4376.field19599.equals(method13158)) {
                for (int int3 = method13159.readInt(), k = 0; k < int3; ++k) {
                    this.field23808.field4645.field28219.method18320(method13159.method29496());
                }
                for (int int4 = method13159.readInt(), l = 0; l < int4; ++l) {
                    this.field23808.field4645.field28219.method18321(method13159.method29496());
                }
            }
            else if (Class4376.field19597.equals(method13158)) {
                this.field23808.field4645.field28219.method18317(new Class7018(method13159.method29494(), method13159.method29512(), method13159.readInt()));
            }
            else if (Class4376.field19598.equals(method13158)) {
                this.field23808.field4645.field28219.method18318(method13159.method29494());
            }
            else if (Class4376.field19596.equals(method13158)) {
                this.field23808.field4645.field28219.method18319(method13159.method29494(), method13159.readInt());
            }
            else if (Class4376.field19600.equals(method13158)) {
                final BlockPos method13162 = method13159.method29494();
                final int int5 = method13159.readInt();
                final int int6 = method13159.readInt();
                final ArrayList arrayList5 = Lists.newArrayList();
                for (int n = 0; n < int6; ++n) {
                    arrayList5.add(new Class7472(method13162, method13159.readInt(), method13159.method29513(255), method13159.readBoolean()));
                }
                this.field23808.field4645.field28222.method18313(int5, arrayList5);
            }
            else if (Class4376.field19606.equals(method13158)) {
                final int int7 = method13159.readInt();
                final ArrayList arrayList6 = Lists.newArrayList();
                for (int n2 = 0; n2 < int7; ++n2) {
                    arrayList6.add(method13159.method29494());
                }
                this.field23808.field4645.field28221.method18347(arrayList6);
            }
            else if (Class4376.field19601.equals(method13158)) {
                final Class5493 class4378 = new Class5493(method13159.readDouble(), method13159.readDouble(), method13159.readDouble());
                final UUID method13163 = method13159.method29504();
                final int int8 = method13159.readInt();
                final String method13164 = method13159.method29512();
                final String method13165 = method13159.method29512();
                final int int9 = method13159.readInt();
                final String method13166 = method13159.method29512();
                Class9468 method13167;
                if (method13159.readBoolean()) {
                    method13167 = Class9468.method35231(method13159);
                }
                else {
                    method13167 = null;
                }
                final Class9307 class4379 = new Class9307(method13163, int8, method13164, method13165, int9, class4378, method13166, method13167, method13159.readBoolean());
                for (int int10 = method13159.readInt(), n3 = 0; n3 < int10; ++n3) {
                    class4379.field39942.add(method13159.method29512());
                }
                for (int int11 = method13159.readInt(), n4 = 0; n4 < int11; ++n4) {
                    class4379.field39943.add(method13159.method29512());
                }
                for (int int12 = method13159.readInt(), n5 = 0; n5 < int12; ++n5) {
                    class4379.field39944.add(method13159.method29512());
                }
                for (int int13 = method13159.readInt(), n6 = 0; n6 < int13; ++n6) {
                    class4379.field39946.add(method13159.method29494());
                }
                for (int int14 = method13159.readInt(), n7 = 0; n7 < int14; ++n7) {
                    class4379.field39945.add(method13159.method29512());
                }
                this.field23808.field4645.field28219.method18322(class4379);
            }
            else if (Class4376.field19602.equals(method13158)) {
                final Class5493 class4380 = new Class5493(method13159.readDouble(), method13159.readDouble(), method13159.readDouble());
                final UUID method13168 = method13159.method29504();
                final int int15 = method13159.readInt();
                final boolean boolean1 = method13159.readBoolean();
                BlockPos method13169 = null;
                if (boolean1) {
                    method13169 = method13159.method29494();
                }
                final boolean boolean2 = method13159.readBoolean();
                BlockPos method13170 = null;
                if (boolean2) {
                    method13170 = method13159.method29494();
                }
                final int int16 = method13159.readInt();
                final boolean boolean3 = method13159.readBoolean();
                Class9468 method13171 = null;
                if (boolean3) {
                    method13171 = Class9468.method35231(method13159);
                }
                final Class8665 class4381 = new Class8665(method13168, int15, class4380, method13171, method13169, method13170, int16);
                for (int int17 = method13159.readInt(), n8 = 0; n8 < int17; ++n8) {
                    class4381.field36439.add(method13159.method29512());
                }
                for (int int18 = method13159.readInt(), n9 = 0; n9 < int18; ++n9) {
                    class4381.field36440.add(method13159.method29494());
                }
                this.field23808.field4645.field28220.method18277(class4381);
            }
            else if (Class4376.field19603.equals(method13158)) {
                this.field23808.field4645.field28220.method18276(new Class7850(method13159.method29494(), method13159.method29512(), method13159.readInt(), method13159.readInt(), method13159.readBoolean(), this.field23809.method6754()));
            }
            else if (Class4376.field19605.equals(method13158)) {
                this.field23808.field4645.field28223.method18270();
            }
            else if (Class4376.field19604.equals(method13158)) {
                this.field23808.field4645.field28223.method18351(method13159.method29494(), method13159.readInt(), method13159.method29512(), method13159.readInt());
            }
            else {
                Class5799.field23804.warn("Unknown custom packed identifier: {}", (Object)method13158);
            }
        }
        finally {
            if (method13159 != null) {
                method13159.release();
            }
        }
    }
    
    @Override
    public void method17356(final Class4400 class4400) {
        Class8663.method29632((IPacket<Class5799>)class4400, this, this.field23808);
        final Class6516 method6782 = this.field23809.method6782();
        final String method6783 = class4400.method13240();
        if (class4400.method13242() != 0) {
            if (method6782.method19630(method6783)) {
                final Class9290 method6784 = method6782.method19632(method6783);
                if (class4400.method13242() != 1) {
                    if (class4400.method13242() == 2) {
                        method6784.method34318(class4400.method13243());
                        method6784.method34316(class4400.method13241());
                    }
                }
                else {
                    method6782.method19643(method6784);
                }
            }
        }
        else {
            method6782.method19633(method6783, Class9456.field40640, class4400.method13241(), class4400.method13243());
        }
    }
    
    @Override
    public void method17357(final Class4377 class4377) {
        Class8663.method29632((IPacket<Class5799>)class4377, this, this.field23808);
        final Class6516 method6782 = this.field23809.method6782();
        final String method6783 = class4377.method13161();
        switch (Class8379.field34358[class4377.method13163().ordinal()]) {
            case 1: {
                method6782.method19636(class4377.method13160(), method6782.method19631(method6783)).method23971(class4377.method13162());
                break;
            }
            case 2: {
                method6782.method19641(class4377.method13160(), method6782.method19632(method6783));
                break;
            }
        }
    }
    
    @Override
    public void method17358(final Class4253 class4253) {
        Class8663.method29632((IPacket<Class5799>)class4253, this, this.field23808);
        final Class6516 method6782 = this.field23809.method6782();
        final String method6783 = class4253.method12766();
        method6782.method19614(class4253.method12765(), (method6783 != null) ? method6782.method19631(method6783) : null);
    }
    
    @Override
    public void method17359(final Class4290 class4290) {
        Class8663.method29632((IPacket<Class5799>)class4290, this, this.field23808);
        final Class6516 method6782 = this.field23809.method6782();
        Class6749 class4291;
        if (class4290.method12883() != 0) {
            class4291 = method6782.method19645(class4290.method12880());
        }
        else {
            class4291 = method6782.method19646(class4290.method12880());
        }
        if (class4290.method12883() == 0 || class4290.method12883() == 2) {
            class4291.method20542(class4290.method12881());
            class4291.method20562(class4290.method12885());
            class4291.method20561(class4290.method12884());
            final Class2097 method6783 = Class2097.method8218(class4290.method12886());
            if (method6783 != null) {
                class4291.method20556(method6783);
            }
            final Class343 method6784 = Class343.method1021(class4290.method12887());
            if (method6784 != null) {
                class4291.method20559(method6784);
            }
            class4291.method20543(class4290.method12888());
            class4291.method20545(class4290.method12889());
        }
        if (class4290.method12883() == 0 || class4290.method12883() == 3) {
            final Iterator<String> iterator = class4290.method12882().iterator();
            while (iterator.hasNext()) {
                method6782.method19615(iterator.next(), class4291);
            }
        }
        if (class4290.method12883() == 4) {
            final Iterator<String> iterator2 = class4290.method12882().iterator();
            while (iterator2.hasNext()) {
                method6782.method19616(iterator2.next(), class4291);
            }
        }
        if (class4290.method12883() == 1) {
            method6782.method19647(class4291);
        }
    }
    
    @Override
    public void method17360(final Class4278 class4278) {
        Class8663.method29632((IPacket<Class5799>)class4278, this, this.field23808);
        if (class4278.method12852() == 0) {
            final double n = class4278.method12851() * class4278.method12848();
            final double n2 = class4278.method12851() * class4278.method12849();
            final double n3 = class4278.method12851() * class4278.method12850();
            try {
                this.field23809.method6710(class4278.method12853(), class4278.method12844(), class4278.method12845(), class4278.method12846(), class4278.method12847(), n, n2, n3);
            }
            catch (final Throwable t) {
                Class5799.field23804.warn("Could not spawn particle effect {}", (Object)class4278.method12853());
            }
        }
        else {
            for (int i = 0; i < class4278.method12852(); ++i) {
                final double n4 = this.field23817.nextGaussian() * class4278.method12848();
                final double n5 = this.field23817.nextGaussian() * class4278.method12849();
                final double n6 = this.field23817.nextGaussian() * class4278.method12850();
                final double n7 = this.field23817.nextGaussian() * class4278.method12851();
                final double n8 = this.field23817.nextGaussian() * class4278.method12851();
                final double n9 = this.field23817.nextGaussian() * class4278.method12851();
                try {
                    this.field23809.method6710(class4278.method12853(), class4278.method12844(), class4278.method12845() + n4, class4278.method12846() + n5, class4278.method12847() + n6, n7, n8, n9);
                }
                catch (final Throwable t2) {
                    Class5799.field23804.warn("Could not spawn particle effect {}", (Object)class4278.method12853());
                    return;
                }
            }
        }
    }
    
    @Override
    public void method17361(final Class4347 class4347) {
        Class8663.method29632((IPacket<Class5799>)class4347, this, this.field23808);
        final Entity method6741 = this.field23809.getEntityByID(class4347.method13056());
        if (method6741 != null) {
            if (!(method6741 instanceof LivingEntity)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + method6741 + ")");
            }
            final Class6821 method6742 = ((LivingEntity)method6741).method2711();
            for (final Class8494 class4348 : class4347.method13057()) {
                Class7619 class4349 = method6742.method20878(class4348.method28383());
                if (class4349 == null) {
                    class4349 = method6742.method20873(new Class8723(null, class4348.method28383(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                }
                class4349.method23941(class4348.method28384());
                class4349.method23949();
                final Iterator<Class7919> iterator2 = class4348.method28385().iterator();
                while (iterator2.hasNext()) {
                    class4349.method23946(iterator2.next());
                }
            }
        }
    }
    
    @Override
    public void method17362(final Class4257 class4257) {
        Class8663.method29632((IPacket<Class5799>)class4257, this, this.field23808);
        final Class3418 field3009 = this.field23808.field4684.field3009;
        if (field3009.field16154 == class4257.method12780()) {
            if (field3009.method10886(this.field23808.field4684)) {
                this.field23819.method6382(class4257.method12779()).ifPresent(class4259 -> {
                    if (!(!(this.field23808.field4700 instanceof Class519))) {
                        ((Class519)this.field23808.field4700).method3001().method3439(class4259, class4258.field16151);
                    }
                });
            }
        }
    }
    
    @Override
    public void method17363(final Class4349 class4349) {
        Class8663.method29632((IPacket<Class5799>)class4349, this, this.field23808);
        final int method13059 = class4349.method13059();
        final int method13060 = class4349.method13060();
        final Class1886 method13061 = this.field23809.method6835().getLightManager();
        this.method17368(method13059, method13060, method13061, Class237.field911, class4349.method13061(), class4349.method13062(), class4349.method13063().iterator());
        this.method17368(method13059, method13060, method13061, Class237.field912, class4349.method13064(), class4349.method13065(), class4349.method13066().iterator());
    }
    
    @Override
    public void method17364(final Class4346 class4346) {
        Class8663.method29632((IPacket<Class5799>)class4346, this, this.field23808);
        final Class3418 field3009 = this.field23808.field4684.field3009;
        if (class4346.method13050() == field3009.field16154) {
            if (field3009 instanceof Class3423) {
                ((Class3423)field3009).method10930(new Class57(class4346.method13051().method362()));
                ((Class3423)field3009).method10921(class4346.method13053());
                ((Class3423)field3009).method10923(class4346.method13052());
                ((Class3423)field3009).method10917(class4346.method13054());
                ((Class3423)field3009).method10924(class4346.method13055());
            }
        }
    }
    
    @Override
    public void method17365(final Class4332 class4332) {
        Class8663.method29632((IPacket<Class5799>)class4332, this, this.field23808);
        this.field23816 = class4332.method13010();
        this.field23809.method6835().method7417(class4332.method13010());
    }
    
    @Override
    public void method17366(final Class4379 class4379) {
        Class8663.method29632((IPacket<Class5799>)class4379, this, this.field23808);
        this.field23809.method6835().method7416(class4379.method13167(), class4379.method13168());
    }
    
    @Override
    public void method17367(final Class4320 class4320) {
        Class8663.method29632((IPacket<Class5799>)class4320, this, this.field23808);
        this.field23808.field4682.method27340(this.field23809, class4320.method12982(), class4320.method12981(), class4320.method12984(), class4320.method12983());
    }
    
    private void method17368(final int n, final int n2, final Class1886 class1886, final Class237 class1887, final int n3, final int n4, final Iterator<byte[]> iterator) {
        for (int i = 0; i < 18; ++i) {
            final int n5 = -1 + i;
            final boolean b = (n3 & 1 << i) != 0x0;
            final boolean b2 = (n4 & 1 << i) != 0x0;
            if (b || b2) {
                class1886.method7256(class1887, Class353.method1088(n, n5, n2), b ? new Class7281(iterator.next().clone()) : new Class7281());
                this.field23809.method6838(n, n5, n2);
            }
        }
    }
    
    @Override
    public NetworkManager getNetworkManager() {
        return this.field23805;
    }
    
    public Collection<Class9081> method17370() {
        return this.field23811.values();
    }
    
    @Nullable
    public Class9081 method17371(final UUID uuid) {
        return this.field23811.get(uuid);
    }
    
    @Nullable
    public Class9081 method17372(final String anObject) {
        for (final Class9081 class9081 : this.field23811.values()) {
            if (!class9081.method32719().getName().equals(anObject)) {
                continue;
            }
            return class9081;
        }
        return null;
    }
    
    public GameProfile method17373() {
        return this.field23806;
    }
    
    public Class8840 method17374() {
        return this.field23812;
    }
    
    public CommandDispatcher<Class7491> method17375() {
        return this.field23818;
    }
    
    public Class1848 method17376() {
        return this.field23809;
    }
    
    public Class1792 method17377() {
        return this.field23814;
    }
    
    public Class8108 method17378() {
        return this.field23815;
    }
    
    public UUID method17379() {
        return this.field23820;
    }
    
    static {
        field23804 = LogManager.getLogger();
    }
}
