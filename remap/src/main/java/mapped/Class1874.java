// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.function.Function;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Set;
import java.util.List;
import java.util.function.Predicate;

public interface Class1874
{
    List<Entity> method6737(final Entity p0, final AxisAlignedBB p1, final Predicate<? super Entity> p2);
    
     <T extends Entity> List<T> method6739(final Class<? extends T> p0, final AxisAlignedBB p1, final Predicate<? super T> p2);
    
    default <T extends Entity> List<T> method6740(final Class<? extends T> clazz, final AxisAlignedBB class6221, final Predicate<? super T> predicate) {
        return (List<T>)this.method6739((Class<? extends Entity>)clazz, class6221, (Predicate<? super Entity>)predicate);
    }
    
    List<? extends PlayerEntity> method6840();
    
    default List<Entity> method7127(final Entity class399, final AxisAlignedBB class400) {
        return this.method6737(class399, class400, Class9170.field38850);
    }
    
    default boolean method6957(final Entity class399, final VoxelShape class400) {
        return class400.isEmpty() || this.method7127(class399, class400.getBoundingBox()).stream().filter(class402 -> {
            final boolean b;
            if (!class402.removed) {
                if (class402.preventEntitySpawning) {
                    if (class401 == null || !class402.method1916(class401)) {
                        return b;
                    }
                }
            }
            return b;
        }).noneMatch(class404 -> VoxelShapes.method24496(class403, VoxelShapes.method24489(class404.getBoundingBox()), IBooleanFunction.AND));
    }
    
    default <T extends Entity> List<T> method7128(final Class<? extends T> clazz, final AxisAlignedBB class6221) {
        return this.method6739(clazz, class6221, Class9170.field38850);
    }
    
    default <T extends Entity> List<T> method7129(final Class<? extends T> clazz, final AxisAlignedBB class6221) {
        return this.method6740(clazz, class6221, Class9170.field38850);
    }
    
    default Stream<VoxelShape> method6956(final Entity class399, final AxisAlignedBB class400, final Set<Entity> set) {
        if (class400.getAverageEdgeLength() >= 1.0E-7) {
            final AxisAlignedBB method18496 = class400.intersect(1.0E-7);
            return (Stream<VoxelShape>)this.method7127(class399, method18496).stream().filter(class401 -> !set2.contains(class401)).filter(class403 -> class402 == null || !class402.method1916(class403)).flatMap(class405 -> Stream.of(new AxisAlignedBB[] { class405.method1702(), (class404 != null) ? class404.method1771(class405) : null })).filter(Objects::nonNull).filter((Predicate<? super Object>)method18496::intersects).map((Function<? super Object, ?>) VoxelShapes::method24489);
        }
        return Stream.empty();
    }
    
    @Nullable
    default PlayerEntity method7130(final double n, final double n2, final double n3, final double n4, final Predicate<Entity> predicate) {
        double n5 = -1.0;
        PlayerEntity playerEntity = null;
        for (final PlayerEntity class513 : this.method6840()) {
            if (predicate != null && !predicate.test(class513)) {
                continue;
            }
            final double method1733 = class513.method1733(n, n2, n3);
            if (n4 >= 0.0 && method1733 >= n4 * n4) {
                continue;
            }
            if (n5 != -1.0 && method1733 >= n5) {
                continue;
            }
            n5 = method1733;
            playerEntity = class513;
        }
        return playerEntity;
    }
    
    @Nullable
    default PlayerEntity method7131(final Entity class399, final double n) {
        return this.method7132(class399.getPosX(), class399.getPosY(), class399.getPosZ(), n, false);
    }
    
    @Nullable
    default PlayerEntity method7132(final double n, final double n2, final double n3, final double n4, final boolean b) {
        return this.method7130(n, n2, n3, n4, b ? Class9170.field38849 : Class9170.field38850);
    }
    
    @Nullable
    default PlayerEntity method7133(final double n, final double n2, final double n3) {
        double n4 = -1.0;
        PlayerEntity playerEntity = null;
        for (final PlayerEntity class513 : this.method6840()) {
            if (!Class9170.field38850.test(class513)) {
                continue;
            }
            final double method1733 = class513.method1733(n, class513.getPosY(), n2);
            if (n3 >= 0.0 && method1733 >= n3 * n3) {
                continue;
            }
            if (n4 != -1.0 && method1733 >= n4) {
                continue;
            }
            n4 = method1733;
            playerEntity = class513;
        }
        return playerEntity;
    }
    
    default boolean method7134(final double n, final double n2, final double n3, final double n4) {
        for (final PlayerEntity playerEntity : this.method6840()) {
            if (!Class9170.field38850.test(playerEntity)) {
                continue;
            }
            if (!Class9170.field38846.test(playerEntity)) {
                continue;
            }
            final double method1733 = playerEntity.method1733(n, n2, n3);
            if (n4 >= 0.0 && method1733 >= n4 * n4) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    @Nullable
    default PlayerEntity method7135(final Class7843 class7843, final LivingEntity class7844) {
        return this.method7140(this.method6840(), class7843, class7844, class7844.getPosX(), class7844.getPosY(), class7844.getPosZ());
    }
    
    @Nullable
    default PlayerEntity method7136(final Class7843 class7843, final LivingEntity class7844, final double n, final double n2, final double n3) {
        return this.method7140(this.method6840(), class7843, class7844, n, n2, n3);
    }
    
    @Nullable
    default PlayerEntity method7137(final Class7843 class7843, final double n, final double n2, final double n3) {
        return this.method7140(this.method6840(), class7843, null, n, n2, n3);
    }
    
    @Nullable
    default <T extends LivingEntity> T method7138(final Class<? extends T> clazz, final Class7843 class7843, final LivingEntity class7844, final double n, final double n2, final double n3, final AxisAlignedBB class7845) {
        return this.method7140(this.method6739(clazz, class7845, null), class7843, class7844, n, n2, n3);
    }
    
    @Nullable
    default <T extends LivingEntity> T method7139(final Class<? extends T> clazz, final Class7843 class7843, final LivingEntity class7844, final double n, final double n2, final double n3, final AxisAlignedBB class7845) {
        return this.method7140(this.method6740(clazz, class7845, null), class7843, class7844, n, n2, n3);
    }
    
    @Nullable
    default <T extends LivingEntity> T method7140(final List<? extends T> list, final Class7843 class7843, final LivingEntity class7844, final double n, final double n2, final double n3) {
        double n4 = -1.0;
        LivingEntity class7845 = null;
        for (final LivingEntity class7846 : list) {
            if (!class7843.method25344(class7844, class7846)) {
                continue;
            }
            final double method1733 = class7846.method1733(n, n2, n3);
            if (n4 != -1.0 && method1733 >= n4) {
                continue;
            }
            n4 = method1733;
            class7845 = class7846;
        }
        return (T)class7845;
    }
    
    default List<PlayerEntity> method7141(final Class7843 class7843, final LivingEntity class7844, final AxisAlignedBB class7845) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final PlayerEntity class7846 : this.method6840()) {
            if (!class7845.contains(class7846.getPosX(), class7846.getPosY(), class7846.getPosZ())) {
                continue;
            }
            if (!class7843.method25344(class7844, class7846)) {
                continue;
            }
            arrayList.add(class7846);
        }
        return arrayList;
    }
    
    default <T extends LivingEntity> List<T> method7142(final Class<? extends T> clazz, final Class7843 class7843, final LivingEntity class7844, final AxisAlignedBB class7845) {
        final List<Entity> method6739 = (List<Entity>)this.method6739((Class<? extends LivingEntity>)clazz, class7845, (Predicate<? super LivingEntity>)null);
        final ArrayList arrayList = Lists.newArrayList();
        for (final LivingEntity class7846 : method6739) {
            if (!class7843.method25344(class7844, class7846)) {
                continue;
            }
            arrayList.add(class7846);
        }
        return arrayList;
    }
    
    @Nullable
    default PlayerEntity method7143(final UUID uuid) {
        for (int i = 0; i < this.method6840().size(); ++i) {
            final PlayerEntity playerEntity = this.method6840().get(i);
            if (uuid.equals(playerEntity.getUniqueID())) {
                return playerEntity;
            }
        }
        return null;
    }
}
