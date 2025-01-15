// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.function.Predicate;

public class Class3901 extends Class3892
{
    public static final Class7115 field17611;
    private Class8691 field17612;
    private Class8691 field17613;
    private Class8691 field17614;
    private Class8691 field17615;
    private static final Predicate<Class7096> field17616;
    
    public Class3901(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3901.field17611, Direction.NORTH));
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7099.method21696() != class7096.method21696()) {
            this.method11996(class7097, class7098);
        }
    }
    
    public boolean method11995(final Class1852 class1852, final BlockPos class1853) {
        return this.method11997().method29796(class1852, class1853) != null || this.method11999().method29796(class1852, class1853) != null;
    }
    
    private void method11996(final World class1847, final BlockPos class1848) {
        final Class7820 method29796 = this.method11998().method29796(class1847, class1848);
        if (method29796 == null) {
            final Class7820 method29797 = this.method12000().method29796(class1847, class1848);
            if (method29797 != null) {
                for (int i = 0; i < this.method12000().method29794(); ++i) {
                    for (int j = 0; j < this.method12000().method29793(); ++j) {
                        final Class7990 method29798 = method29797.method25270(i, j, 0);
                        class1847.method6688(method29798.method26068(), Class7521.field29147.method11878(), 2);
                        class1847.method6955(2001, method29798.method26068(), Class3833.method11774(method29798.method26065()));
                    }
                }
                final BlockPos method29799 = method29797.method25270(1, 2, 0).method26068();
                final Class786 class1849 = EntityType.field29043.method23371(class1847);
                class1849.method4342(true);
                class1849.method1730(method29799.getX() + 0.5, method29799.getY() + 0.05, method29799.getZ() + 0.5, 0.0f, 0.0f);
                class1847.method6886(class1849);
                final Iterator<Entity> iterator = (Iterator<Entity>)class1847.method7128((Class<? extends Class513>)Class513.class, class1849.method1886().method18496(5.0)).iterator();
                while (iterator.hasNext()) {
                    Class7770.field31788.method13788(iterator.next(), class1849);
                }
                for (int k = 0; k < this.method12000().method29794(); ++k) {
                    for (int l = 0; l < this.method12000().method29793(); ++l) {
                        class1847.method6694(method29797.method25270(k, l, 0).method26068(), Class7521.field29147);
                    }
                }
            }
        }
        else {
            for (int n = 0; n < this.method11998().method29793(); ++n) {
                final Class7990 method29800 = method29796.method25270(0, n, 0);
                class1847.method6688(method29800.method26068(), Class7521.field29147.method11878(), 2);
                class1847.method6955(2001, method29800.method26068(), Class3833.method11774(method29800.method26065()));
            }
            final Class784 class1850 = EntityType.field29027.method23371(class1847);
            final BlockPos method29801 = method29796.method25270(0, 2, 0).method26068();
            class1850.method1730(method29801.getX() + 0.5, method29801.getY() + 0.05, method29801.getZ() + 0.5, 0.0f, 0.0f);
            class1847.method6886(class1850);
            final Iterator<Entity> iterator2 = (Iterator<Entity>)class1847.method7128((Class<? extends Class513>)Class513.class, class1850.method1886().method18496(5.0)).iterator();
            while (iterator2.hasNext()) {
                Class7770.field31788.method13788(iterator2.next(), class1850);
            }
            for (int n2 = 0; n2 < this.method11998().method29793(); ++n2) {
                class1847.method6694(method29796.method25270(0, n2, 0).method26068(), Class7521.field29147);
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3901.field17611, class7074.method21644().getOpposite());
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3901.field17611);
    }
    
    private Class8691 method11997() {
        if (this.field17612 == null) {
            this.field17612 = Class9512.method35439().method35438(" ", "#", "#").method35440('#', Class7990.method26069(Class169.method766(Class7521.field29331))).method35441();
        }
        return this.field17612;
    }
    
    private Class8691 method11998() {
        if (this.field17613 == null) {
            this.field17613 = Class9512.method35439().method35438("^", "#", "#").method35440('^', Class7990.method26069(Class3901.field17616)).method35440('#', Class7990.method26069(Class169.method766(Class7521.field29331))).method35441();
        }
        return this.field17613;
    }
    
    private Class8691 method11999() {
        if (this.field17614 == null) {
            this.field17614 = Class9512.method35439().method35438("~ ~", "###", "~#~").method35440('#', Class7990.method26069(Class169.method766(Class7521.field29281))).method35440('~', Class7990.method26069(Class114.method607(Class8059.field33153))).method35441();
        }
        return this.field17614;
    }
    
    private Class8691 method12000() {
        if (this.field17615 == null) {
            this.field17615 = Class9512.method35439().method35438("~^~", "###", "~#~").method35440('^', Class7990.method26069(Class3901.field17616)).method35440('#', Class7990.method26069(Class169.method766(Class7521.field29281))).method35440('~', Class7990.method26069(Class114.method607(Class8059.field33153))).method35441();
        }
        return this.field17615;
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return true;
    }
    
    static {
        field17611 = Class3892.field17564;
        field17616 = (class7096 -> class7096 != null && (class7096.method21696() == Class7521.field29342 || class7096.method21696() == Class7521.field29343));
    }
}
