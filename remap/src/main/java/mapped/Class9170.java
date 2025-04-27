// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicates;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public final class Class9170
{
    private static String[] field38844;
    public static final Predicate<Entity> field38845;
    public static final Predicate<LivingEntity> field38846;
    public static final Predicate<Entity> field38847;
    public static final Predicate<Entity> field38848;
    public static final Predicate<Entity> field38849;
    public static final Predicate<Entity> field38850;
    
    public static Predicate<Entity> method33473(final double n, final double n2, final double n3, final double n4) {
        return class399 -> class399 != null && class399.method1733(n5, n6, n7) <= n8;
    }
    
    public static Predicate<Entity> method33474(final Entity class399) {
        final Team method1825 = class399.getTeam();
        return (Predicate<Entity>)((((method1825 != null) ? method1825.method20558() : Class343.field2112) != Class343.field2113) ? Class9170.field38850.and(class403 -> {
            if (class403.method1750()) {
                if (class400.field2391.field10067 && (class403 instanceof PlayerEntity && ((PlayerEntity)class403).method2843())) {
                    return false;
                }
                else {
                    class403.getTeam();
                    final Team class405;
                    final Class343 class404 = (class405 != null) ? class405.method20558() : Class343.field2112;
                    if (class404 != Class343.field2113) {
                        final boolean b = class401 != null && class401.method20565(class405);
                        if (class402 == Class343.field2115 || class404 == Class343.field2115) {
                            if (!(!b)) {
                                return false;
                            }
                        }
                        return (class402 != Class343.field2114 && class404 != Class343.field2114) || b;
                    }
                    else {
                        return false;
                    }
                }
            }
            else {
                return false;
            }
        }) : Predicates.alwaysFalse());
    }
    
    public static Predicate<Entity> method33475(final Entity class399) {
        return method1920 -> {
            while (method1920.isPassenger()) {
                method1920 = method1920.method1920();
                if (method1920 == class400) {
                    return false;
                }
            }
            return true;
        };
    }
    
    static {
        field38845 = Entity::isAlive;
        field38846 = LivingEntity::isAlive;
        field38847 = (class399 -> {
            final boolean b;
            if (!(!class399.isAlive())) {
                if (!class399.isBeingRidden()) {
                    if (!class399.isPassenger()) {
                        return b;
                    }
                }
            }
            return b;
        });
        field38848 = (class400 -> class400 instanceof IInventory && class400.isAlive());
        field38849 = (class401 -> !(class401 instanceof PlayerEntity) || (!class401.isSpectator() && !((PlayerEntity)class401).method2889()));
        field38850 = (class402 -> !class402.isSpectator());
    }
}
