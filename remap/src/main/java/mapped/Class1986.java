// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public enum Class1986
{
    field10996("RUN_ONE", 0) {
        @Override
        public <E extends LivingEntity> void method7999(final Class8841<Class5419<? super E>> class8841, final Class1849 class8842, final E e, final long n) {
            class8841.method30875().filter(class8843 -> class8843.method16543() == Class232.field867).filter(class8846 -> class8846.method16544(class8844, class8845, n2)).findFirst();
        }
    }, 
    field10997("TRY_ALL", 1) {
        @Override
        public <E extends LivingEntity> void method7999(final Class8841<Class5419<? super E>> class8841, final Class1849 class8842, final E e, final long n) {
            class8841.method30875().filter(class8843 -> class8843.method16543() == Class232.field867).forEach(class8846 -> class8846.method16544(class8844, class8845, n2));
        }
    };
    
    public abstract <E extends LivingEntity> void method7999(final Class8841<Class5419<? super E>> p0, final Class1849 p1, final E p2, final long p3);
}
