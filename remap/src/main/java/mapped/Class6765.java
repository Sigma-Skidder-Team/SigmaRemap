// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import java.util.ArrayList;
import java.net.SocketAddress;
import javax.annotation.Nullable;
import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.Map;
import java.util.List;
import java.text.SimpleDateFormat;
import org.apache.logging.log4j.Logger;
import java.io.File;

public abstract class Class6765
{
    public static final File field26556;
    public static final File field26557;
    public static final File field26558;
    public static final File field26559;
    private static final Logger field26560;
    private static final SimpleDateFormat field26561;
    private final MinecraftServer field26562;
    private final List<Class513> field26563;
    private final Map<UUID, Class513> field26564;
    private final Class8007 field26565;
    private final Class8009 field26566;
    private final Class8008 field26567;
    private final Class8010 field26568;
    private final Map<UUID, Class7473> field26569;
    private final Map<UUID, Class7012> field26570;
    private Class8643 field26571;
    private boolean field26572;
    public final int field26573;
    private int field26574;
    private Class101 field26575;
    private boolean field26576;
    private int field26577;
    
    public Class6765(final MinecraftServer field26562, final int field26563) {
        this.field26563 = Lists.newArrayList();
        this.field26564 = Maps.newHashMap();
        this.field26565 = new Class8007(Class6765.field26556);
        this.field26566 = new Class8009(Class6765.field26557);
        this.field26567 = new Class8008(Class6765.field26558);
        this.field26568 = new Class8010(Class6765.field26559);
        this.field26569 = Maps.newHashMap();
        this.field26570 = Maps.newHashMap();
        this.field26562 = field26562;
        this.field26573 = field26563;
        this.method20591().method26204(true);
        this.method20592().method26204(true);
    }
    
    public void method20577(final NetworkManager class3641, final Class513 class3642) {
        final GameProfile method2844 = class3642.method2844();
        final Class8608 method2845 = this.field26562.method1556();
        final GameProfile method2846 = method2845.method29196(method2844.getId());
        final String anotherString = (method2846 != null) ? method2846.getName() : method2844.getName();
        method2845.method29193(method2844);
        final Class51 method2847 = this.method20580(class3642);
        final Class1849 method2848 = this.field26562.method1481(class3642.dimension);
        class3642.method1727(method2848);
        class3642.field3041.method26489((Class1849)class3642.world);
        String string = "local";
        if (class3641.method11180() != null) {
            string = class3641.method11180().toString();
        }
        Class6765.field26560.info("{}[{}] logged in with entity id {} at ({}, {}, {})", (Object)class3642.getName().getString(), (Object)string, (Object)class3642.getEntityId(), (Object)class3642.getPosX(), (Object)class3642.getPosY(), (Object)class3642.getPosZ());
        final WorldInfo method2849 = method2848.method6764();
        this.method20615(class3642, null, method2848);
        final Class5814 class3643 = new Class5814(this.field26562, class3641, class3642);
        final Class8878 method2850 = method2848.method6765();
        class3643.method17469(new Class4383(class3642.getEntityId(), class3642.field3041.method26482(), WorldInfo.byHashing(method2849.getSeed()), method2849.method29568(), method2848.dimension.getType(), this.method20609(), method2849.method29570(), this.field26574, method2850.method31216(Class8878.field37329), !method2850.method31216(Class8878.field37340)));
        class3643.method17469(new Class4376(Class4376.field19590, new PacketBuffer(Unpooled.buffer()).method29514(this.method20576().method1490())));
        class3643.method17469(new Class4315(method2849.method29597(), method2849.method29599()));
        class3643.method17469(new Class4300(class3642.field3025));
        class3643.method17469(new Class4388(class3642.field3006.field2743));
        class3643.method17469(new Class4281(this.field26562.method1577().method6383()));
        class3643.method17469(new Class4297(this.field26562.method1578()));
        this.method20584(class3642);
        class3642.method2947().method23082();
        class3642.method2948().method19726(class3642);
        this.method20578(method2848.method6868(), class3642);
        this.field26562.method1558();
        Class2259 class3644;
        if (!class3642.method2844().getName().equalsIgnoreCase(anotherString)) {
            class3644 = new Class2259("multiplayer.player.joined.renamed", new Object[] { class3642.getDisplayName(), anotherString });
        }
        else {
            class3644 = new Class2259("multiplayer.player.joined", new Object[] { class3642.getDisplayName() });
        }
        this.method20619(class3644.applyTextStyle(TextFormatting.YELLOW));
        class3643.method17467(class3642.getPosX(), class3642.getPosY(), class3642.getPosZ(), class3642.rotationYaw, class3642.rotationPitch);
        this.field26563.add(class3642);
        this.field26564.put(class3642.method1865(), class3642);
        this.method20586(new Class4330(Class2156.field12803, new Class513[] { class3642 }));
        for (int i = 0; i < this.field26563.size(); ++i) {
            class3642.field3039.method17469(new Class4330(Class2156.field12803, new Class513[] { this.field26563.get(i) }));
        }
        method2848.method6891(class3642);
        this.field26562.method1584().method28267(class3642);
        this.method20606(class3642, method2848);
        if (!this.field26562.method1513().isEmpty()) {
            class3642.method2945(this.field26562.method1513(), this.field26562.method1514());
        }
        final Iterator<Class1948> iterator = class3642.method2651().iterator();
        while (iterator.hasNext()) {
            class3643.method17469(new Class4384(class3642.getEntityId(), iterator.next()));
        }
        if (method2847 != null) {
            if (method2847.method316("RootVehicle", 10)) {
                final Class51 method2851 = method2847.method327("RootVehicle");
                final Entity method2852 = EntityType.method23378(method2851.method327("Entity"), (World)method2848, class3648 -> class3646.method6887(class3648) ? class3648 : null);
                if (method2852 != null) {
                    final UUID method2853 = method2851.method301("Attach");
                    if (!method2852.method1865().equals(method2853)) {
                        for (final Entity class3645 : method2852.method1911()) {
                            if (!class3645.method1865().equals(method2853)) {
                                continue;
                            }
                            class3642.method1780(class3645, true);
                            break;
                        }
                    }
                    else {
                        class3642.method1780(method2852, true);
                    }
                    if (!class3642.isPassenger()) {
                        Class6765.field26560.warn("Couldn't reattach entity to player");
                        method2848.method6900(method2852);
                        final Iterator<Entity> iterator3 = method2852.method1911().iterator();
                        while (iterator3.hasNext()) {
                            method2848.method6900(iterator3.next());
                        }
                    }
                }
            }
        }
        class3642.method2919();
    }
    
    public void method20578(final Class6515 class6515, final Class513 class6516) {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<Class6749> iterator = class6515.method19650().iterator();
        while (iterator.hasNext()) {
            class6516.field3039.method17469(new Class4290(iterator.next(), 0));
        }
        for (int i = 0; i < 19; ++i) {
            final Class9290 method19644 = class6515.method19644(i);
            if (method19644 != null) {
                if (!hashSet.contains(method19644)) {
                    final Iterator<IPacket<?>> iterator2 = class6515.method19625(method19644).iterator();
                    while (iterator2.hasNext()) {
                        class6516.field3039.method17469(iterator2.next());
                    }
                    hashSet.add(method19644);
                }
            }
        }
    }
    
    public void method20579(final Class1849 class1849) {
        this.field26571 = class1849.method6917();
        class1849.getWorldBorder().method34797(new Class7487(this));
    }
    
    @Nullable
    public Class51 method20580(final Class513 class513) {
        final Class51 method29542 = this.field26562.method1481(DimensionType.field2223).method6764().method29542();
        Class51 method29543;
        if (class513.getName().getString().equals(this.field26562.method1498()) && method29542 != null) {
            method29543 = method29542;
            class513.method1757(method29542);
            Class6765.field26560.debug("loading single player");
        }
        else {
            method29543 = this.field26571.method29397(class513);
        }
        return method29543;
    }
    
    public void method20572(final Class513 class513) {
        this.field26571.method29396(class513);
        final Class7473 class514 = this.field26569.get(class513.method1865());
        if (class514 != null) {
            class514.method23074();
        }
        final Class7012 class515 = this.field26570.get(class513.method1865());
        if (class515 != null) {
            class515.method21463();
        }
    }
    
    public void method20581(final Class513 class513) {
        final Class1849 method2940 = class513.method2940();
        class513.method2857(Class8276.field33988);
        this.method20572(class513);
        if (class513.isPassenger()) {
            final Entity method2941 = class513.method1915();
            if (method2941.method1913()) {
                Class6765.field26560.debug("Removing player mount");
                class513.stopRiding();
                method2940.method6900(method2941);
                final Iterator<Entity> iterator = method2941.method1911().iterator();
                while (iterator.hasNext()) {
                    method2940.method6900(iterator.next());
                }
                method2940.method6686(class513.chunkCoordX, class513.chunkCoordZ).method7058();
            }
        }
        class513.detach();
        method2940.method6902(class513);
        class513.method2957().method21457();
        this.field26563.remove(class513);
        this.field26562.method1584().method28268(class513);
        final UUID method2942 = class513.method1865();
        if (this.field26564.get(method2942) == class513) {
            this.field26564.remove(method2942);
            this.field26569.remove(method2942);
            this.field26570.remove(method2942);
        }
        this.method20586(new Class4330(Class2156.field12807, new Class513[] { class513 }));
    }
    
    @Nullable
    public ITextComponent method20573(final SocketAddress socketAddress, final GameProfile gameProfile) {
        if (this.field26565.method26219(gameProfile)) {
            final Class6025 class6025 = this.field26565.method26207(gameProfile);
            final Class2259 class6026 = new Class2259("multiplayer.disconnect.banned.reason", new Object[] { class6025.method17950() });
            if (class6025.method17949() != null) {
                class6026.appendSibling(new Class2259("multiplayer.disconnect.banned.expiration", new Object[] { Class6765.field26561.format(class6025.method17949()) }));
            }
            return class6026;
        }
        if (!this.method20596(gameProfile)) {
            return new Class2259("multiplayer.disconnect.not_whitelisted", new Object[0]);
        }
        if (!this.field26566.method26222(socketAddress)) {
            return (this.field26563.size() >= this.field26573 && !this.method20625(gameProfile)) ? new Class2259("multiplayer.disconnect.server_full", new Object[0]) : null;
        }
        final Class6026 method26224 = this.field26566.method26224(socketAddress);
        final Class2259 class6027 = new Class2259("multiplayer.disconnect.banned_ip.reason", new Object[] { method26224.method17950() });
        if (method26224.method17949() != null) {
            class6027.appendSibling(new Class2259("multiplayer.disconnect.banned_ip.expiration", new Object[] { Class6765.field26561.format(method26224.method17949()) }));
        }
        return class6027;
    }
    
    public Class513 method20582(final GameProfile gameProfile) {
        final UUID method2893 = Class512.method2893(gameProfile);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.field26563.size(); ++i) {
            final Class513 class513 = this.field26563.get(i);
            if (class513.method1865().equals(method2893)) {
                arrayList.add(class513);
            }
        }
        final Class513 class514 = this.field26564.get(gameProfile.getId());
        if (class514 != null) {
            if (!arrayList.contains(class514)) {
                arrayList.add(class514);
            }
        }
        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            ((Class513)iterator.next()).field3039.method17463(new Class2259("multiplayer.disconnect.duplicate_login", new Object[0]));
        }
        Class8071 class515;
        if (!this.field26562.method1509()) {
            class515 = new Class8071(this.field26562.method1481(DimensionType.field2223));
        }
        else {
            class515 = new Class8070(this.field26562.method1481(DimensionType.field2223));
        }
        return new Class513(this.field26562, this.field26562.method1481(DimensionType.field2223), gameProfile, class515);
    }
    
    public Class513 method20583(final Class513 class513, final DimensionType field2452, final boolean b) {
        this.field26563.remove(class513);
        class513.method2940().method6902(class513);
        final BlockPos method2854 = class513.method2854();
        final boolean method2855 = class513.method2855();
        class513.dimension = field2452;
        Class8071 class514;
        if (!this.field26562.method1509()) {
            class514 = new Class8071(this.field26562.method1481(class513.dimension));
        }
        else {
            class514 = new Class8070(this.field26562.method1481(class513.dimension));
        }
        final Class513 class515 = new Class513(this.field26562, this.field26562.method1481(class513.dimension), class513.method2844(), class514);
        class515.field3039 = class513.field3039;
        class515.method2939(class513, b);
        class515.method1644(class513.getEntityId());
        class515.method2898(class513.method2755());
        final Iterator<String> iterator = class513.method1645().iterator();
        while (iterator.hasNext()) {
            class515.method1646(iterator.next());
        }
        final Class1849 method2856 = this.field26562.method1481(class513.dimension);
        this.method20615(class515, class513, method2856);
        if (method2854 != null) {
            final Optional<Vec3d> method2857 = Class512.method2850(this.field26562.method1481(class513.dimension), method2854, method2855);
            if (!method2857.isPresent()) {
                class515.field3039.method17469(new Class4306(0, 0.0f));
            }
            else {
                final Vec3d class516 = method2857.get();
                class515.method1730(class516.x, class516.y, class516.z, 0.0f, 0.0f);
                class515.method2856(method2854, method2855, false);
            }
        }
        while (!method2856.method6977(class515) && class515.getPosY() < 256.0) {
            class515.setPosition(class515.getPosX(), class515.getPosY() + 1.0, class515.getPosZ());
        }
        final WorldInfo method2858 = class515.world.method6764();
        class515.field3039.method17469(new Class4359(class515.dimension, WorldInfo.byHashing(method2858.getSeed()), method2858.method29570(), class515.field3041.method26482()));
        final BlockPos method2859 = method2856.method6758();
        class515.field3039.method17467(class515.getPosX(), class515.getPosY(), class515.getPosZ(), class515.rotationYaw, class515.rotationPitch);
        class515.field3039.method17469(new Class4335(method2859));
        class515.field3039.method17469(new Class4315(method2858.method29597(), method2858.method29599()));
        class515.field3039.method17469(new Class4313(class515.field3028, class515.field3027, class515.field3026));
        this.method20606(class515, method2856);
        this.method20584(class515);
        method2856.method6892(class515);
        this.field26563.add(class515);
        this.field26564.put(class515.method1865(), class515);
        class515.method2919();
        class515.method2665(class515.method2664());
        return class515;
    }
    
    public void method20584(final Class513 class513) {
        this.method20595(class513, this.field26562.method1588(class513.method2844()));
    }
    
    public void method20585() {
        if (++this.field26577 > 600) {
            this.method20586(new Class4330(Class2156.field12805, this.field26563));
            this.field26577 = 0;
        }
    }
    
    public void method20586(final IPacket<?> class4252) {
        for (int i = 0; i < this.field26563.size(); ++i) {
            this.field26563.get(i).field3039.method17469(class4252);
        }
    }
    
    public void method20587(final IPacket<?> class4252, final DimensionType class4253) {
        for (int i = 0; i < this.field26563.size(); ++i) {
            final Class513 class4254 = this.field26563.get(i);
            if (class4254.dimension == class4253) {
                class4254.field3039.method17469(class4252);
            }
        }
    }
    
    public void method20588(final Class512 class512, final ITextComponent class513) {
        final Team method1825 = class512.getTeam();
        if (method1825 != null) {
            final Iterator<String> iterator = method1825.method20547().iterator();
            while (iterator.hasNext()) {
                final Class513 method1826 = this.method20598(iterator.next());
                if (method1826 == null) {
                    continue;
                }
                if (method1826 == class512) {
                    continue;
                }
                method1826.sendMessage(class513);
            }
        }
    }
    
    public void method20589(final Class512 class512, final ITextComponent class513) {
        final Team method1825 = class512.getTeam();
        if (method1825 != null) {
            for (int i = 0; i < this.field26563.size(); ++i) {
                final Class513 class514 = this.field26563.get(i);
                if (class514.getTeam() != method1825) {
                    class514.sendMessage(class513);
                }
            }
        }
        else {
            this.method20619(class513);
        }
    }
    
    public String[] method20590() {
        final String[] array = new String[this.field26563.size()];
        for (int i = 0; i < this.field26563.size(); ++i) {
            array[i] = this.field26563.get(i).method2844().getName();
        }
        return array;
    }
    
    public Class8007 method20591() {
        return this.field26565;
    }
    
    public Class8009 method20592() {
        return this.field26566;
    }
    
    public void method20593(final GameProfile gameProfile) {
        ((Class8006<K, Class6023>)this.field26567).method26206(new Class6023(gameProfile, this.field26562.method1448(), this.field26567.method26221(gameProfile)));
        final Class513 method20624 = this.method20624(gameProfile.getId());
        if (method20624 != null) {
            this.method20584(method20624);
        }
    }
    
    public void method20594(final GameProfile gameProfile) {
        ((Class8006<GameProfile, V>)this.field26567).method26208(gameProfile);
        final Class513 method20624 = this.method20624(gameProfile.getId());
        if (method20624 != null) {
            this.method20584(method20624);
        }
    }
    
    private void method20595(final Class513 class513, final int n) {
        if (class513.field3039 != null) {
            byte b;
            if (n > 0) {
                if (n < 4) {
                    b = (byte)(24 + n);
                }
                else {
                    b = 28;
                }
            }
            else {
                b = 24;
            }
            class513.field3039.method17469(new Class4264(class513, b));
        }
        this.field26562.method1573().method24999(class513);
    }
    
    public boolean method20596(final GameProfile gameProfile) {
        if (this.field26572) {
            if (!((Class8006<GameProfile, V>)this.field26567).method26213(gameProfile)) {
                if (!((Class8006<GameProfile, V>)this.field26568).method26213(gameProfile)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method20597(final GameProfile gameProfile) {
        if (!((Class8006<GameProfile, V>)this.field26567).method26213(gameProfile)) {
            if (!this.field26562.method1592(gameProfile) || !this.field26562.method1481(DimensionType.field2223).method6764().method29574()) {
                if (!this.field26576) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Nullable
    public Class513 method20598(final String anotherString) {
        for (final Class513 class513 : this.field26563) {
            if (!class513.method2844().getName().equalsIgnoreCase(anotherString)) {
                continue;
            }
            return class513;
        }
        return null;
    }
    
    public void method20599(final Class512 class512, final double n, final double n2, final double n3, final double n4, final DimensionType class513, final IPacket<?> class514) {
        for (int i = 0; i < this.field26563.size(); ++i) {
            final Class513 class515 = this.field26563.get(i);
            if (class515 != class512) {
                if (class515.dimension == class513) {
                    final double n5 = n - class515.getPosX();
                    final double n6 = n2 - class515.getPosY();
                    final double n7 = n3 - class515.getPosZ();
                    if (n5 * n5 + n6 * n6 + n7 * n7 < n4 * n4) {
                        class515.field3039.method17469(class514);
                    }
                }
            }
        }
    }
    
    public void method20600() {
        for (int i = 0; i < this.field26563.size(); ++i) {
            this.method20572(this.field26563.get(i));
        }
    }
    
    public Class8010 method20601() {
        return this.field26568;
    }
    
    public String[] method20602() {
        return this.field26568.method26210();
    }
    
    public Class8008 method20603() {
        return this.field26567;
    }
    
    public String[] method20604() {
        return this.field26567.method26210();
    }
    
    public void method20605() {
    }
    
    public void method20606(final Class513 class513, final Class1849 class514) {
        class513.field3039.method17469(new Class4340(this.field26562.method1481(DimensionType.field2223).getWorldBorder(), Class2217.field13617));
        class513.field3039.method17469(new Class4345(class514.method6754(), class514.method6755(), class514.method6765().method31216(Class8878.field37324)));
        class513.field3039.method17469(new Class4335(class514.method6758()));
        if (class514.method6771()) {
            class513.field3039.method17469(new Class4306(1, 0.0f));
            class513.field3039.method17469(new Class4306(7, class514.method6768(1.0f)));
            class513.field3039.method17469(new Class4306(8, class514.method6766(1.0f)));
        }
    }
    
    public void method20607(final Class513 class513) {
        class513.method2929(class513.field3008);
        class513.method2937();
        class513.field3039.method17469(new Class4388(class513.field3006.field2743));
    }
    
    public int method20608() {
        return this.field26563.size();
    }
    
    public int method20609() {
        return this.field26573;
    }
    
    public boolean method20610() {
        return this.field26572;
    }
    
    public void method20611(final boolean field26572) {
        this.field26572 = field26572;
    }
    
    public List<Class513> method20612(final String anObject) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class513 class513 : this.field26563) {
            if (!class513.method2942().equals(anObject)) {
                continue;
            }
            arrayList.add(class513);
        }
        return arrayList;
    }
    
    public int method20613() {
        return this.field26574;
    }
    
    public MinecraftServer method20576() {
        return this.field26562;
    }
    
    public Class51 method20575() {
        return null;
    }
    
    public void method20614(final Class101 field26575) {
        this.field26575 = field26575;
    }
    
    private void method20615(final Class513 class513, final Class513 class514, final Class1851 class515) {
        if (class514 == null) {
            if (this.field26575 != null) {
                class513.field3041.method26481(this.field26575);
            }
        }
        else {
            class513.field3041.method26481(class514.field3041.method26482());
        }
        class513.field3041.method26485(class515.method6764().method29564());
    }
    
    public void method20616(final boolean field26576) {
        this.field26576 = field26576;
    }
    
    public void method20617() {
        for (int i = 0; i < this.field26563.size(); ++i) {
            this.field26563.get(i).field3039.method17463(new Class2259("multiplayer.disconnect.server_shutdown", new Object[0]));
        }
    }
    
    public void method20618(final ITextComponent class2250, final boolean b) {
        this.field26562.sendMessage(class2250);
        this.method20586(new Class4378(class2250, b ? Class285.field1573 : Class285.field1572));
    }
    
    public void method20619(final ITextComponent class2250) {
        this.method20618(class2250, true);
    }
    
    public Class7473 method20620(final Class512 class512) {
        final UUID method1865 = class512.method1865();
        Class7473 class513 = (method1865 != null) ? this.field26569.get(method1865) : null;
        if (class513 == null) {
            final File file = new File(this.field26562.method1481(DimensionType.field2223).method6917().method29392(), "stats");
            final File dest = new File(file, method1865 + ".json");
            if (!dest.exists()) {
                final File file2 = new File(file, class512.getName().getString() + ".json");
                if (file2.exists()) {
                    if (file2.isFile()) {
                        file2.renameTo(dest);
                    }
                }
            }
            class513 = new Class7473(this.field26562, dest);
            this.field26569.put(method1865, class513);
        }
        return class513;
    }
    
    public Class7012 method20621(final Class513 class513) {
        final UUID method1865 = class513.method1865();
        Class7012 class514 = this.field26570.get(method1865);
        if (class514 == null) {
            class514 = new Class7012(this.field26562, new File(new File(this.field26562.method1481(DimensionType.field2223).method6917().method29392(), "advancements"), method1865 + ".json"), class513);
            this.field26570.put(method1865, class514);
        }
        class514.method21456(class513);
        return class514;
    }
    
    public void method20622(final int field26574) {
        this.field26574 = field26574;
        this.method20586(new Class4332(field26574));
        for (final Class1849 class1849 : this.field26562.method1482()) {
            if (class1849 == null) {
                continue;
            }
            class1849.method6904().method7448(field26574);
        }
    }
    
    public List<Class513> method20623() {
        return this.field26563;
    }
    
    @Nullable
    public Class513 method20624(final UUID uuid) {
        return this.field26564.get(uuid);
    }
    
    public boolean method20625(final GameProfile gameProfile) {
        return false;
    }
    
    public void method20626() {
        final Iterator<Class7012> iterator = this.field26570.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method21458();
        }
        this.method20586(new Class4297(this.field26562.method1578()));
        final Class4281 class4281 = new Class4281(this.field26562.method1577().method6383());
        for (final Class513 class4282 : this.field26563) {
            class4282.field3039.method17469(class4281);
            class4282.method2948().method19726(class4282);
        }
    }
    
    public boolean method20627() {
        return this.field26576;
    }
    
    static {
        field26556 = new File("banned-players.json");
        field26557 = new File("banned-ips.json");
        field26558 = new File("ops.json");
        field26559 = new File("whitelist.json");
        field26560 = LogManager.getLogger();
        field26561 = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    }
}
