// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.HashSet;
import com.google.common.collect.Sets;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Collections;
import java.util.Random;
import java.util.Collection;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.List;
import java.util.function.Predicate;
import org.apache.logging.log4j.Logger;

public class Class8619
{
    private static final Logger field36163;
    private static final Predicate<Entity> field36164;
    private final Class6879 field36165;
    private final Class1849 field36166;
    private final List<Integer> field36167;
    private final Class8691 field36168;
    private int field36169;
    private int field36170;
    private int field36171;
    private int field36172;
    private boolean field36173;
    private boolean field36174;
    private UUID field36175;
    private boolean field36176;
    private BlockPos field36177;
    private Class2242 field36178;
    private int field36179;
    private List<Class858> field36180;
    
    public Class8619(final Class1849 field36166, final CompoundNBT class51) {
        this.field36165 = (Class6879)new Class6879(new Class2259("entity.minecraft.ender_dragon", new Object[0]), Class2200.field13390, Class342.field2105).method21068(true).method21069(true);
        this.field36167 = Lists.newArrayList();
        this.field36176 = true;
        this.field36166 = field36166;
        if (!class51.contains("DragonKilled", 99)) {
            this.field36173 = true;
            this.field36174 = true;
        }
        else {
            if (class51.hasUniqueId("DragonUUID")) {
                this.field36175 = class51.getUniqueId("DragonUUID");
            }
            this.field36173 = class51.getBoolean("DragonKilled");
            this.field36174 = class51.getBoolean("PreviouslyKilled");
            if (class51.getBoolean("IsRespawning")) {
                this.field36178 = Class2242.field13779;
            }
            if (class51.contains("ExitPortalLocation", 10)) {
                this.field36177 = Class9346.method34645(class51.getCompound("ExitPortalLocation"));
            }
        }
        if (!class51.contains("Gateways", 9)) {
            this.field36167.addAll((Collection<? extends Integer>)ContiguousSet.create(Range.closedOpen((Comparable)0, (Comparable)20), DiscreteDomain.integers()));
            Collections.shuffle(this.field36167, new Random(field36166.method6753()));
        }
        else {
            final ListNBT method328 = class51.getList("Gateways", 3);
            for (int i = 0; i < method328.size(); ++i) {
                this.field36167.add(method328.method349(i));
            }
        }
        this.field36168 = Class9512.method35439().method35438("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").method35438("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").method35438("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").method35438("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").method35438("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").method35440('#', Class7990.method26069(Class117.method608(Class7521.field29172))).method35441();
    }
    
    public CompoundNBT method29234() {
        final CompoundNBT class51 = new CompoundNBT();
        if (this.field36175 != null) {
            class51.putUniqueId("DragonUUID", this.field36175);
        }
        class51.putBoolean("DragonKilled", this.field36173);
        class51.putBoolean("PreviouslyKilled", this.field36174);
        if (this.field36177 != null) {
            class51.put("ExitPortalLocation", Class9346.method34646(this.field36177));
        }
        final ListNBT class52 = new ListNBT();
        final Iterator<Integer> iterator = this.field36167.iterator();
        while (iterator.hasNext()) {
            ((AbstractList<IntNBT>)class52).add(IntNBT.valueOf(iterator.next()));
        }
        class51.put("Gateways", class52);
        return class51;
    }
    
    public void method29235() {
        this.field36165.method21073(!this.field36173);
        if (++this.field36172 >= 20) {
            this.method29242();
            this.field36172 = 0;
        }
        if (this.field36165.method21074().isEmpty()) {
            this.field36166.method6904().method7442(Class9105.field38566, new ChunkPos(0, 0), 9, Class315.field1875);
        }
        else {
            this.field36166.method6904().method7441(Class9105.field38566, new ChunkPos(0, 0), 9, Class315.field1875);
            final boolean method29241 = this.method29241();
            if (this.field36176) {
                if (method29241) {
                    this.method29236();
                    this.field36176 = false;
                }
            }
            if (this.field36178 != null) {
                if (this.field36180 == null) {
                    if (method29241) {
                        this.field36178 = null;
                        this.method29253();
                    }
                }
                this.field36178.method8445(this.field36166, this, this.field36180, this.field36179++, this.field36177);
            }
            if (!this.field36173) {
                if (this.field36175 == null || ++this.field36169 >= 1200) {
                    if (method29241) {
                        this.method29237();
                        this.field36169 = 0;
                    }
                }
                if (++this.field36171 >= 100) {
                    if (method29241) {
                        this.method29243();
                        this.field36171 = 0;
                    }
                }
            }
        }
    }
    
    private void method29236() {
        Class8619.field36163.info("Scanning for legacy world dragon fight...");
        final boolean method29239 = this.method29239();
        if (!method29239) {
            Class8619.field36163.info("Found that the dragon has not yet been killed in this world.");
            this.field36174 = false;
            if (this.method29240() == null) {
                this.method29247(false);
            }
        }
        else {
            Class8619.field36163.info("Found that the dragon has been killed in this world already.");
            this.field36174 = true;
        }
        final List<Class852> method29240 = this.field36166.method6882();
        if (!method29240.isEmpty()) {
            final Class852 class852 = method29240.get(0);
            this.field36175 = class852.method1865();
            Class8619.field36163.info("Found that there's a dragon still alive ({})", (Object)class852);
            this.field36173 = false;
            if (!method29239) {
                Class8619.field36163.info("But we didn't have a portal, let's remove it.");
                class852.method1652();
                this.field36175 = null;
            }
        }
        else {
            this.field36173 = true;
        }
        if (!this.field36174) {
            if (this.field36173) {
                this.field36173 = false;
            }
        }
    }
    
    private void method29237() {
        final List<Class852> method6882 = this.field36166.method6882();
        if (!method6882.isEmpty()) {
            Class8619.field36163.debug("Haven't seen our dragon, but found another one to use.");
            this.field36175 = ((Class852)method6882.get(0)).method1865();
        }
        else {
            Class8619.field36163.debug("Haven't seen the dragon, respawning it");
            this.method29248();
        }
    }
    
    public void method29238(final Class2242 field36178) {
        if (this.field36178 != null) {
            this.field36179 = 0;
            if (field36178 != Class2242.field13783) {
                this.field36178 = field36178;
            }
            else {
                this.field36178 = null;
                this.field36173 = false;
                final Class852 method29248 = this.method29248();
                final Iterator<Class513> iterator = this.field36165.method21074().iterator();
                while (iterator.hasNext()) {
                    Class7770.field31788.method13788(iterator.next(), method29248);
                }
            }
            return;
        }
        throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
    }
    
    private boolean method29239() {
        for (int i = -8; i <= 8; ++i) {
            for (int j = -8; j <= 8; ++j) {
                final Iterator<TileEntity> iterator = this.field36166.method6686(i, j).method7066().values().iterator();
                while (iterator.hasNext()) {
                    if (!(iterator.next() instanceof Class489)) {
                        continue;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Nullable
    private Class7820 method29240() {
        for (int i = -8; i <= 8; ++i) {
            for (int j = -8; j <= 8; ++j) {
                for (final TileEntity tileEntity : this.field36166.method6686(i, j).method7066().values()) {
                    if (!(tileEntity instanceof Class489)) {
                        continue;
                    }
                    final Class7820 method29796 = this.field36168.method29796(this.field36166, tileEntity.getPos());
                    if (method29796 == null) {
                        continue;
                    }
                    final BlockPos method29797 = method29796.method25270(3, 3, 3).method26068();
                    if (this.field36177 == null) {
                        if (method29797.getX() == 0) {
                            if (method29797.getZ() == 0) {
                                this.field36177 = method29797;
                            }
                        }
                    }
                    return method29796;
                }
            }
        }
        for (int k = this.field36166.method6958(HeightmapType.field11525, Class4551.field20031).getY(); k >= 0; --k) {
            final Class7820 method29798 = this.field36168.method29796(this.field36166, new BlockPos(Class4551.field20031.getX(), k, Class4551.field20031.getZ()));
            if (method29798 != null) {
                if (this.field36177 == null) {
                    this.field36177 = method29798.method25270(3, 3, 3).method26068();
                }
                return method29798;
            }
        }
        return null;
    }
    
    private boolean method29241() {
        for (int i = -8; i <= 8; ++i) {
            for (int j = 8; j <= 8; ++j) {
                final IChunk method6687 = this.field36166.getChunk(i, j, ChunkStatus.FULL, false);
                if (!(method6687 instanceof Chunk)) {
                    return false;
                }
                if (!((Chunk)method6687).method7073().method8321(Class2152.field12788)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private void method29242() {
        final HashSet hashSet = Sets.newHashSet();
        for (final Class513 class513 : this.field36166.method6883(Class8619.field36164)) {
            this.field36165.method21049(class513);
            hashSet.add(class513);
        }
        final HashSet hashSet2 = Sets.newHashSet((Iterable)this.field36165.method21074());
        hashSet2.removeAll(hashSet);
        final Iterator iterator2 = hashSet2.iterator();
        while (iterator2.hasNext()) {
            this.field36165.method21051((Class513)iterator2.next());
        }
    }
    
    private void method29243() {
        this.field36171 = 0;
        this.field36170 = 0;
        final Iterator<Class9341> iterator = Class4550.method13560(this.field36166).iterator();
        while (iterator.hasNext()) {
            this.field36170 += this.field36166.method7128((Class<? extends Entity>)Class858.class, iterator.next().method34624()).size();
        }
        Class8619.field36163.debug("Found {} end crystals still alive", (Object)this.field36170);
    }
    
    public void method29244(final Class852 class852) {
        if (class852.method1865().equals(this.field36175)) {
            this.field36165.method21064(0.0f);
            this.field36165.method21073(false);
            this.method29247(true);
            this.method29245();
            if (!this.field36174) {
                this.field36166.method6692(this.field36166.method6958(HeightmapType.field11525, Class4551.field20031), Class7521.field29404.getDefaultState());
            }
            this.field36174 = true;
            this.field36173 = true;
        }
    }
    
    private void method29245() {
        if (!this.field36167.isEmpty()) {
            final int intValue = this.field36167.remove(this.field36167.size() - 1);
            this.method29246(new BlockPos(MathHelper.floor(96.0 * Math.cos(2.0 * (-3.141592653589793 + 0.15707963267948966 * intValue))), 75, MathHelper.floor(96.0 * Math.sin(2.0 * (-3.141592653589793 + 0.15707963267948966 * intValue)))));
        }
    }
    
    private void method29246(final BlockPos class354) {
        this.field36166.method6955(3000, class354, 0);
        Class4535.field20006.method13527(Class5116.method16015()).method28613(this.field36166, (Class6346<? extends Class7065>)this.field36166.method6904().method7438(), new Random(), class354);
    }
    
    private void method29247(final boolean b) {
        final Class4551 class4551 = new Class4551(b);
        if (this.field36177 == null) {
            this.field36177 = this.field36166.method6958(HeightmapType.field11526, Class4551.field20031).method1139();
            while (this.field36166.getBlockState(this.field36177).method21696() == Class7521.field29172) {
                if (this.field36177.getY() <= this.field36166.method6743()) {
                    break;
                }
                this.field36177 = this.field36177.method1139();
            }
        }
        class4551.method13527(Class5113.field22059).method28613(this.field36166, (Class6346<? extends Class7065>)this.field36166.method6904().method7438(), new Random(), this.field36177);
    }
    
    private Class852 method29248() {
        this.field36166.method6685(new BlockPos(0, 128, 0));
        final Class852 class852 = EntityType.field28976.method23371(this.field36166);
        class852.method5127().method33696(Class7193.field27948);
        class852.method1730(0.0, 128.0, 0.0, this.field36166.rand.nextFloat() * 360.0f, 0.0f);
        this.field36166.method6886(class852);
        this.field36175 = class852.method1865();
        return class852;
    }
    
    public void method29249(final Class852 class852) {
        if (class852.method1865().equals(this.field36175)) {
            this.field36165.method21064(class852.method2664() / class852.method2701());
            this.field36169 = 0;
            if (class852.hasCustomName()) {
                this.field36165.method21070(class852.getDisplayName());
            }
        }
    }
    
    public int method29250() {
        return this.field36170;
    }
    
    public void method29251(final Class858 class858, final DamageSource class859) {
        if (this.field36178 != null && this.field36180.contains(class858)) {
            Class8619.field36163.debug("Aborting respawn sequence");
            this.field36178 = null;
            this.field36179 = 0;
            this.method29255();
            this.method29247(true);
        }
        else {
            this.method29243();
            final Entity method6914 = this.field36166.method6914(this.field36175);
            if (method6914 instanceof Class852) {
                ((Class852)method6914).method5126(class858, new BlockPos(class858), class859);
            }
        }
    }
    
    public boolean method29252() {
        return this.field36174;
    }
    
    public void method29253() {
        if (this.field36173) {
            if (this.field36178 == null) {
                BlockPos class354 = this.field36177;
                if (class354 == null) {
                    Class8619.field36163.debug("Tried to respawn, but need to find the portal first.");
                    if (this.method29240() != null) {
                        Class8619.field36163.debug("Found the exit portal & temporarily using it.");
                    }
                    else {
                        Class8619.field36163.debug("Couldn't find a portal, so we made one.");
                        this.method29247(true);
                    }
                    class354 = this.field36177;
                }
                final ArrayList arrayList = Lists.newArrayList();
                final BlockPos method1138 = class354.method1138(1);
                final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
                while (iterator.hasNext()) {
                    final List<Entity> method1139 = this.field36166.method7128((Class<? extends Entity>)Class858.class, new AxisAlignedBB(method1138.method1150(iterator.next(), 2)));
                    if (method1139.isEmpty()) {
                        return;
                    }
                    arrayList.addAll(method1139);
                }
                Class8619.field36163.debug("Found all crystals, respawning dragon.");
                this.method29254(arrayList);
            }
        }
    }
    
    private void method29254(final List<Class858> field36180) {
        if (this.field36173) {
            if (this.field36178 == null) {
                for (Class7820 class7820 = this.method29240(); class7820 != null; class7820 = this.method29240()) {
                    for (int i = 0; i < this.field36168.method29794(); ++i) {
                        for (int j = 0; j < this.field36168.method29793(); ++j) {
                            for (int k = 0; k < this.field36168.method29792(); ++k) {
                                final Class7990 method25270 = class7820.method25270(i, j, k);
                                if (method25270.method26065().getBlock() == Class7521.field29172 || method25270.method26065().getBlock() == Class7521.field29401) {
                                    this.field36166.method6692(method25270.method26068(), Class7521.field29403.getDefaultState());
                                }
                            }
                        }
                    }
                }
                this.field36178 = Class2242.field13779;
                this.field36179 = 0;
                this.method29247(false);
                this.field36180 = field36180;
            }
        }
    }
    
    public void method29255() {
        final Iterator<Class9341> iterator = Class4550.method13560(this.field36166).iterator();
        while (iterator.hasNext()) {
            for (final Class858 class858 : this.field36166.method7128((Class<? extends Class858>)Class858.class, iterator.next().method34624())) {
                class858.method1851(false);
                class858.method5182(null);
            }
        }
    }
    
    static {
        field36163 = LogManager.getLogger();
        field36164 = Class9170.field38845.and(Class9170.method33473(0.0, 128.0, 0.0, 192.0));
    }
}
