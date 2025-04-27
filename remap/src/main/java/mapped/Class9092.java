// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.Random;

public class Class9092
{
    private static String[] field38500;
    private Class2181 field38501;
    private Class2052 field38502;
    private BlockPos field38503;
    private boolean field38504;
    private ChunkPos field38505;
    private MutableBoundingBox field38506;
    private boolean field38507;
    private Random field38508;
    private int field38509;
    private final List<Class4107> field38510;
    private boolean field38511;
    
    public Class9092() {
        this.field38501 = Class2181.field12917;
        this.field38502 = Class2052.field11707;
        this.field38503 = BlockPos.ZERO;
        this.field38507 = true;
        this.field38510 = Lists.newArrayList();
    }
    
    public Class9092 method32843() {
        final Class9092 class9092 = new Class9092();
        class9092.field38501 = this.field38501;
        class9092.field38502 = this.field38502;
        class9092.field38503 = this.field38503;
        class9092.field38504 = this.field38504;
        class9092.field38505 = this.field38505;
        class9092.field38506 = this.field38506;
        class9092.field38507 = this.field38507;
        class9092.field38508 = this.field38508;
        class9092.field38509 = this.field38509;
        class9092.field38510.addAll(this.field38510);
        class9092.field38511 = this.field38511;
        return class9092;
    }
    
    public Class9092 method32844(final Class2181 field38501) {
        this.field38501 = field38501;
        return this;
    }
    
    public Class9092 method32845(final Class2052 field38502) {
        this.field38502 = field38502;
        return this;
    }
    
    public Class9092 method32846(final BlockPos field38503) {
        this.field38503 = field38503;
        return this;
    }
    
    public Class9092 method32847(final boolean field38504) {
        this.field38504 = field38504;
        return this;
    }
    
    public Class9092 method32848(final ChunkPos field38505) {
        this.field38505 = field38505;
        return this;
    }
    
    public Class9092 method32849(final MutableBoundingBox field38506) {
        this.field38506 = field38506;
        return this;
    }
    
    public Class9092 method32850(final Random field38508) {
        this.field38508 = field38508;
        return this;
    }
    
    public Class9092 method32851(final boolean field38511) {
        this.field38511 = field38511;
        return this;
    }
    
    public Class9092 method32852() {
        this.field38510.clear();
        return this;
    }
    
    public Class9092 method32853(final Class4107 class4107) {
        this.field38510.add(class4107);
        return this;
    }
    
    public Class9092 method32854(final Class4107 class4107) {
        this.field38510.remove(class4107);
        return this;
    }
    
    public Class2181 method32855() {
        return this.field38501;
    }
    
    public Class2052 method32856() {
        return this.field38502;
    }
    
    public BlockPos method32857() {
        return this.field38503;
    }
    
    public Random method32858(final BlockPos class354) {
        if (this.field38508 == null) {
            return (class354 != null) ? new Random(MathHelper.method35688(class354)) : new Random(Util.method27837());
        }
        return this.field38508;
    }
    
    public boolean method32859() {
        return this.field38504;
    }
    
    @Nullable
    public MutableBoundingBox method32860() {
        if (this.field38506 == null) {
            if (this.field38505 != null) {
                this.method32863();
            }
        }
        return this.field38506;
    }
    
    public boolean method32861() {
        return this.field38511;
    }
    
    public List<Class4107> method32862() {
        return this.field38510;
    }
    
    public void method32863() {
        if (this.field38505 != null) {
            this.field38506 = this.method32866(this.field38505);
        }
    }
    
    public boolean method32864() {
        return this.field38507;
    }
    
    public List<Class9038> method32865(final List<List<Class9038>> list, final BlockPos class354) {
        final int size = list.size();
        return (size <= 0) ? Collections.emptyList() : list.get(this.method32858(class354).nextInt(size));
    }
    
    @Nullable
    private MutableBoundingBox method32866(final ChunkPos class7859) {
        if (class7859 != null) {
            final int n = class7859.field32290 * 16;
            final int n2 = class7859.field32291 * 16;
            return new MutableBoundingBox(n, 0, n2, n + 16 - 1, 255, n2 + 16 - 1);
        }
        return this.field38506;
    }
}
