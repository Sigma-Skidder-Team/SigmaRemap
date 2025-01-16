// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.List;

public class Class438 extends TileEntity implements Class439
{
    private final List<Class7829> field2663;
    private BlockPos field2664;
    
    public Class438() {
        super(Class5412.field22573);
        this.field2663 = Lists.newArrayList();
        this.field2664 = null;
    }
    
    @Override
    public void method2161() {
        if (this.method2215()) {
            this.method2218(null, this.field2656.getBlockState(this.getPos()), Class2144.field12626);
        }
        super.method2161();
    }
    
    public boolean method2215() {
        if (this.field2656 != null) {
            final Iterator<BlockPos> iterator = BlockPos.getAllInBoxMutable(this.field2657.add(-1, -1, -1), this.field2657.add(1, 1, 1)).iterator();
            while (iterator.hasNext()) {
                if (!(this.field2656.getBlockState(iterator.next()).method21696() instanceof Class4011)) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return false;
    }
    
    public boolean method2216() {
        return this.field2663.isEmpty();
    }
    
    public boolean method2217() {
        return this.field2663.size() == 3;
    }
    
    public void method2218(final PlayerEntity playerEntity, final Class7096 class513, final Class2144 class514) {
        final List<Entity> method2219 = this.method2219(class513, class514);
        if (playerEntity != null) {
            for (final Entity class515 : method2219) {
                if (!(class515 instanceof Class798)) {
                    continue;
                }
                final Class798 class516 = (Class798)class515;
                if (playerEntity.method1934().squareDistanceTo(class515.method1934()) > 16.0) {
                    continue;
                }
                if (this.method2223()) {
                    class516.method4514(400);
                }
                else {
                    class516.method4541(playerEntity);
                }
            }
        }
    }
    
    private List<Entity> method2219(final Class7096 class7096, final Class2144 class7097) {
        final ArrayList arrayList = Lists.newArrayList();
        this.field2663.removeIf(class7100 -> this.method2226(class7098, Class7829.method25298(class7100), list, class7099));
        return arrayList;
    }
    
    public void method2220(final Entity class399, final boolean b) {
        this.method2225(class399, b, 0);
    }
    
    public int method2221() {
        return this.field2663.size();
    }
    
    public static int method2222(final Class7096 class7096) {
        return class7096.method21772((IProperty<Integer>)Class3961.field17902);
    }
    
    public boolean method2223() {
        return Class3918.method12033(this.field2656, this.getPos(), 5);
    }
    
    public void method2224() {
        Class9324.method34542(this);
    }
    
    public void method2225(final Entity class399, final boolean b, final int n) {
        if (this.field2663.size() < 3) {
            class399.stopRiding();
            class399.removePassengers();
            final CompoundNBT class400 = new CompoundNBT();
            class399.method1755(class400);
            this.field2663.add(new Class7829(class400, n, b ? 2400 : 600, null));
            if (this.field2656 != null) {
                if (class399 instanceof Class798) {
                    final Class798 class401 = (Class798)class399;
                    if (class401.method4510()) {
                        if (!this.method2227() || this.field2656.rand.nextBoolean()) {
                            this.field2664 = class401.method4509();
                        }
                    }
                }
                final BlockPos method2193 = this.getPos();
                this.field2656.method6706(null, method2193.getX(), method2193.getY(), method2193.getZ(), Class8520.field35021, Class286.field1582, 1.0f, 1.0f);
            }
            class399.method1652();
        }
    }
    
    private boolean method2226(final Class7096 class7096, final CompoundNBT class7097, final List<Entity> list, final Class2144 class7098) {
        final BlockPos method2193 = this.getPos();
        if (this.field2656.method6704() || this.field2656.method6771()) {
            if (class7098 != Class2144.field12626) {
                return false;
            }
        }
        class7097.remove("Passengers");
        class7097.remove("Leash");
        class7097.removeUniqueId("UUID");
        final Direction class7099 = class7096.method21772((IProperty<Direction>)Class3961.field17901);
        final BlockPos method2194 = method2193.method1149(class7099);
        final boolean b = !this.field2656.getBlockState(method2194).method21727(this.field2656, method2194).method24540();
        if (b && class7098 != Class2144.field12626) {
            return false;
        }
        final Entity method2195 = EntityType.method23378(class7097, this.field2656, class7101 -> class7101);
        if (method2195 == null) {
            return false;
        }
        final float method2196 = method2195.method1930();
        final double n = b ? 0.0 : (0.55 + method2196 / 2.0f);
        method2195.method1730(method2193.getX() + 0.5 + n * class7099.getXOffset(), method2193.getY() + 0.5 - method2195.method1931() / 2.0f, method2193.getZ() + 0.5 + n * class7099.getZOffset(), method2195.rotationYaw, method2195.rotationPitch);
        if (method2195.getType().method23383(Class8039.field33101)) {
            if (method2195 instanceof Class798) {
                final Class798 class7100 = (Class798)method2195;
                if (this.method2227()) {
                    if (!class7100.method4510()) {
                        if (this.field2656.rand.nextFloat() < 0.9f) {
                            class7100.method4511(this.field2664);
                        }
                    }
                }
                if (class7098 == Class2144.field12624) {
                    class7100.method4540();
                    if (class7096.method21696().method11785(Class7188.field27931)) {
                        final int method2197 = method2222(class7096);
                        if (method2197 < 5) {
                            int n2 = (this.field2656.rand.nextInt(100) != 0) ? 1 : 2;
                            if (method2197 + n2 > 5) {
                                --n2;
                            }
                            this.field2656.method6692(this.getPos(), (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3961.field17902, method2197 + n2));
                        }
                    }
                }
                class7100.method4517();
                if (list != null) {
                    list.add(class7100);
                }
            }
            final BlockPos method2198 = this.getPos();
            this.field2656.method6706(null, method2198.getX(), method2198.getY(), method2198.getZ(), Class8520.field35022, Class286.field1582, 1.0f, 1.0f);
            return this.field2656.method6886(method2195);
        }
        return false;
    }
    
    private boolean method2227() {
        return this.field2664 != null;
    }
    
    private void method2228() {
        final Iterator<Class7829> iterator = this.field2663.iterator();
        final Class7096 method2194 = this.method2194();
        while (iterator.hasNext()) {
            final Class7829 class7829 = iterator.next();
            if (Class7829.method25296(class7829) <= Class7829.method25297(class7829)) {
                Class7829.method25299(class7829);
            }
            else {
                final CompoundNBT method2195 = Class7829.method25298(class7829);
                if (!this.method2226(method2194, method2195, null, method2195.getBoolean("HasNectar") ? Class2144.field12624 : Class2144.field12625)) {
                    continue;
                }
                iterator.remove();
            }
        }
    }
    
    @Override
    public void method2229() {
        if (!this.field2656.isRemote) {
            this.method2228();
            final BlockPos method2193 = this.getPos();
            if (this.field2663.size() > 0) {
                if (this.field2656.method6790().nextDouble() < 0.005) {
                    this.field2656.method6706(null, method2193.getX() + 0.5, method2193.getY(), method2193.getZ() + 0.5, Class8520.field35024, Class286.field1582, 1.0f, 1.0f);
                }
            }
            this.method2224();
        }
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2663.clear();
        final ListNBT method328 = class51.getList("Bees", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final CompoundNBT method329 = method328.method346(i);
            this.field2663.add(new Class7829(method329.getCompound("EntityData"), method329.getInt("TicksInHive"), method329.getInt("MinOccupationTicks"), null));
        }
        this.field2664 = null;
        if (class51.contains("FlowerPos")) {
            this.field2664 = Class9346.method34645(class51.getCompound("FlowerPos"));
        }
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        class51.put("Bees", this.method2230());
        if (this.method2227()) {
            class51.put("FlowerPos", Class9346.method34646(this.field2664));
        }
        return class51;
    }
    
    public ListNBT method2230() {
        final ListNBT class52 = new ListNBT();
        for (final Class7829 class53 : this.field2663) {
            Class7829.method25298(class53).method303("UUID");
            final CompoundNBT e = new CompoundNBT();
            e.put("EntityData", Class7829.method25298(class53));
            e.putInt("TicksInHive", Class7829.method25296(class53));
            e.putInt("MinOccupationTicks", Class7829.method25297(class53));
            ((AbstractList<CompoundNBT>)class52).add(e);
        }
        return class52;
    }
}
