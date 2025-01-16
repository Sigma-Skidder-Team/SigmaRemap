// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class861 extends Class860
{
    public Class8539 field4601;
    
    public Class861(final EntityType<? extends Class861> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class861(final World class1847, final BlockPos class1848, final Direction class1849) {
        super(EntityType.field29009, class1847, class1848);
        final ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        for (final Class8539 field4601 : Registry.field227) {
            this.field4601 = field4601;
            this.method5186(class1849);
            if (!this.method5189()) {
                continue;
            }
            arrayList.add(field4601);
            final int n2 = field4601.method28647() * field4601.method28648();
            if (n2 <= n) {
                continue;
            }
            n = n2;
        }
        if (!arrayList.isEmpty()) {
            final Iterator iterator2 = arrayList.iterator();
            while (iterator2.hasNext()) {
                final Class8539 class1850 = (Class8539)iterator2.next();
                if (class1850.method28647() * class1850.method28648() >= n) {
                    continue;
                }
                iterator2.remove();
            }
            this.field4601 = (Class8539)arrayList.get(this.rand.nextInt(arrayList.size()));
        }
        this.method5186(class1849);
    }
    
    public Class861(final World class1847, final BlockPos class1848, final Direction class1849, final Class8539 field4601) {
        this(class1847, class1848, class1849);
        this.field4601 = field4601;
        this.method5186(class1849);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method306("Motive", Registry.field227.getKey(this.field4601).toString());
        super.method1761(class51);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field4601 = Registry.field227.getOrDefault(ResourceLocation.method7795(class51.method323("Motive")));
        super.method1760(class51);
    }
    
    @Override
    public int method5190() {
        return (this.field4601 != null) ? this.field4601.method28647() : 1;
    }
    
    @Override
    public int method5191() {
        return (this.field4601 != null) ? this.field4601.method28648() : 1;
    }
    
    @Override
    public void method5192(final Entity class399) {
        if (this.world.method6765().method31216(Class8878.field37321)) {
            this.method1695(Class8520.field35407, 1.0f, 1.0f);
            if (class399 instanceof PlayerEntity && ((PlayerEntity)class399).field3025.field27304) {
                return;
            }
            this.method1764(Items.field31340);
        }
    }
    
    @Override
    public void method5193() {
        this.method1695(Class8520.field35408, 1.0f, 1.0f);
    }
    
    @Override
    public void method1730(final double n, final double n2, final double n3, final float n4, final float n5) {
        this.setPosition(n, n2, n3);
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        final BlockPos method1133 = this.field4599.add(n - this.getPosX(), n2 - this.getPosY(), n3 - this.getPosZ());
        this.setPosition(method1133.getX(), method1133.getY(), method1133.getZ());
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4293(this);
    }
}
