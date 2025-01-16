// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.Iterator;
import java.util.Optional;
import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public abstract class Class4648
{
    private static final Logger field20119;
    private int field20120;
    private final List<Class6829> field20121;
    private Class6829 field20122;
    private double field20123;
    private double field20124;
    private int field20125;
    private int field20126;
    private int field20127;
    private Entity field20128;
    private int field20129;
    private int field20130;
    private int field20131;
    
    public Class4648() {
        this.field20120 = 20;
        this.field20121 = Lists.newArrayList();
        this.field20122 = new Class6829();
        this.field20125 = 200;
        this.field20126 = 800;
        this.field20127 = 4;
        this.field20129 = 6;
        this.field20130 = 16;
        this.field20131 = 4;
    }
    
    @Nullable
    private ResourceLocation method13883() {
        final String method323 = this.field20122.method20916().method323("id");
        try {
            return Class8272.method27500(method323) ? null : new ResourceLocation(method323);
        }
        catch (final Class2357 class2357) {
            final BlockPos method324 = this.method13896();
            Class4648.field20119.warn("Invalid entity id '{}' at spawner {}:[{},{},{}]", (Object)method323, (Object)this.method13895().dimension.getType(), (Object)method324.getX(), (Object)method324.getY(), (Object)method324.getZ());
            return null;
        }
    }
    
    public void method13884(final EntityType<?> class7499) {
        this.field20122.method20916().method306("id", Registry.field210.getKey(class7499).toString());
    }
    
    private boolean method13885() {
        final BlockPos method13896 = this.method13896();
        return this.method13895().method7134(method13896.getX() + 0.5, method13896.getY() + 0.5, method13896.getZ() + 0.5, this.field20130);
    }
    
    public void method13886() {
        if (this.method13885()) {
            final World method13895 = this.method13895();
            final BlockPos method13896 = this.method13896();
            if (!method13895.isRemote) {
                if (this.field20120 == -1) {
                    this.method13888();
                }
                if (this.field20120 > 0) {
                    --this.field20120;
                    return;
                }
                int n = 0;
                for (int i = 0; i < this.field20127; ++i) {
                    final Class51 method13897 = this.field20122.method20916();
                    final Optional<EntityType<?>> method13898 = EntityType.method23377(method13897);
                    if (!method13898.isPresent()) {
                        this.method13888();
                        return;
                    }
                    final Class52 method13899 = method13897.method328("Pos", 6);
                    final int size = method13899.size();
                    final double n2 = (size < 1) ? (method13896.getX() + (method13895.rand.nextDouble() - method13895.rand.nextDouble()) * this.field20131 + 0.5) : method13899.method351(0);
                    final double n3 = (size < 2) ? (method13896.getY() + method13895.rand.nextInt(3) - 1) : method13899.method351(1);
                    final double n4 = (size < 3) ? (method13896.getZ() + (method13895.rand.nextDouble() - method13895.rand.nextDouble()) * this.field20131 + 0.5) : method13899.method351(2);
                    if (method13895.method6976(method13898.get().method23375(n2, n3, n4))) {
                        if (Class8897.method31330(method13898.get(), method13895.method6744(), Class2101.field12176, new BlockPos(n2, n3, n4), method13895.method6790())) {
                            final Entity method13900 = EntityType.method23378(method13897, method13895, class761 -> {
                                class761.method1730(n8, n9, n10, class761.rotationYaw, class761.rotationPitch);
                                return class761;
                            });
                            if (method13900 == null) {
                                this.method13888();
                                return;
                            }
                            if (method13895.method7128((Class<? extends Entity>)((Class759)method13900).getClass(), new AxisAlignedBB(method13896.getX(), method13896.getY(), method13896.getZ(), method13896.getX() + 1, method13896.getY() + 1, method13896.getZ() + 1).method18496(this.field20131)).size() >= this.field20129) {
                                this.method13888();
                                return;
                            }
                            method13900.method1730(method13900.getPosX(), method13900.getPosY(), method13900.getPosZ(), method13895.rand.nextFloat() * 360.0f, 0.0f);
                            if (method13900 instanceof Class759) {
                                final Class759 class759 = (Class759)method13900;
                                if (!class759.method4179(method13895, Class2101.field12176)) {
                                    continue;
                                }
                                if (!class759.method4180(method13895)) {
                                    continue;
                                }
                                if (this.field20122.method20916().method294() == 1) {
                                    if (this.field20122.method20916().method316("id", 8)) {
                                        ((Class759)method13900).method4188(method13895, method13895.method6784(new BlockPos(method13900)), Class2101.field12176, null, null);
                                    }
                                }
                            }
                            this.method13887(method13900);
                            method13895.method6955(2004, method13896, 0);
                            if (method13900 instanceof Class759) {
                                ((Class759)method13900).method4158();
                            }
                            n = 1;
                        }
                    }
                }
                if (n != 0) {
                    this.method13888();
                }
            }
            else {
                final double n5 = method13896.getX() + (double)method13895.rand.nextFloat();
                final double n6 = method13896.getY() + (double)method13895.rand.nextFloat();
                final double n7 = method13896.getZ() + (double)method13895.rand.nextFloat();
                method13895.method6709(Class8432.field34639, n5, n6, n7, 0.0, 0.0, 0.0);
                method13895.method6709(Class8432.field34623, n5, n6, n7, 0.0, 0.0, 0.0);
                if (this.field20120 > 0) {
                    --this.field20120;
                }
                this.field20124 = this.field20123;
                this.field20123 = (this.field20123 + 1000.0f / (this.field20120 + 200.0f)) % 360.0;
            }
        }
        else {
            this.field20124 = this.field20123;
        }
    }
    
    private void method13887(final Entity class399) {
        if (this.method13895().method6886(class399)) {
            final Iterator<Entity> iterator = class399.method1908().iterator();
            while (iterator.hasNext()) {
                this.method13887(iterator.next());
            }
        }
    }
    
    private void method13888() {
        if (this.field20126 > this.field20125) {
            this.field20120 = this.field20125 + this.method13895().rand.nextInt(this.field20126 - this.field20125);
        }
        else {
            this.field20120 = this.field20125;
        }
        if (!this.field20121.isEmpty()) {
            this.method13893(Class8223.method27251(this.method13895().rand, this.field20121));
        }
        this.method13894(1);
    }
    
    public void method13889(final Class51 class51) {
        this.field20120 = class51.method318("Delay");
        this.field20121.clear();
        if (class51.method316("SpawnPotentials", 9)) {
            final Class52 method328 = class51.method328("SpawnPotentials", 10);
            for (int i = 0; i < method328.size(); ++i) {
                this.field20121.add(new Class6829(method328.method346(i)));
            }
        }
        if (!class51.method316("SpawnData", 10)) {
            if (!this.field20121.isEmpty()) {
                this.method13893(Class8223.method27251(this.method13895().rand, this.field20121));
            }
        }
        else {
            this.method13893(new Class6829(1, class51.method327("SpawnData")));
        }
        if (class51.method316("MinSpawnDelay", 99)) {
            this.field20125 = class51.method318("MinSpawnDelay");
            this.field20126 = class51.method318("MaxSpawnDelay");
            this.field20127 = class51.method318("SpawnCount");
        }
        if (class51.method316("MaxNearbyEntities", 99)) {
            this.field20129 = class51.method318("MaxNearbyEntities");
            this.field20130 = class51.method318("RequiredPlayerRange");
        }
        if (class51.method316("SpawnRange", 99)) {
            this.field20131 = class51.method318("SpawnRange");
        }
        if (this.method13895() != null) {
            this.field20128 = null;
        }
    }
    
    public Class51 method13890(final Class51 class51) {
        if (this.method13883() != null) {
            class51.method297("Delay", (short)this.field20120);
            class51.method297("MinSpawnDelay", (short)this.field20125);
            class51.method297("MaxSpawnDelay", (short)this.field20126);
            class51.method297("SpawnCount", (short)this.field20127);
            class51.method297("MaxNearbyEntities", (short)this.field20129);
            class51.method297("RequiredPlayerRange", (short)this.field20130);
            class51.method297("SpawnRange", (short)this.field20131);
            class51.method295("SpawnData", this.field20122.method20916().method333());
            final Class52 class52 = new Class52();
            if (!this.field20121.isEmpty()) {
                final Iterator<Class6829> iterator = this.field20121.iterator();
                while (iterator.hasNext()) {
                    ((AbstractList<Class51>)class52).add(iterator.next().method20915());
                }
            }
            else {
                ((AbstractList<Class51>)class52).add(this.field20122.method20915());
            }
            class51.method295("SpawnPotentials", class52);
            return class51;
        }
        return class51;
    }
    
    @Nullable
    public Entity method13891() {
        if (this.field20128 == null) {
            this.field20128 = EntityType.method23378(this.field20122.method20916(), this.method13895(), Function.identity());
            if (this.field20122.method20916().method294() == 1) {
                if (this.field20122.method20916().method316("id", 8)) {
                    if (this.field20128 instanceof Class759) {
                        ((Class759)this.field20128).method4188(this.method13895(), this.method13895().method6784(new BlockPos(this.field20128)), Class2101.field12176, null, null);
                    }
                }
            }
        }
        return this.field20128;
    }
    
    public boolean method13892(final int n) {
        if (n == 1 && this.method13895().isRemote) {
            this.field20120 = this.field20125;
            return true;
        }
        return false;
    }
    
    public void method13893(final Class6829 field20122) {
        this.field20122 = field20122;
    }
    
    public abstract void method13894(final int p0);
    
    public abstract World method13895();
    
    public abstract BlockPos method13896();
    
    public double method13897() {
        return this.field20123;
    }
    
    public double method13898() {
        return this.field20124;
    }
    
    static {
        field20119 = LogManager.getLogger();
    }
}
