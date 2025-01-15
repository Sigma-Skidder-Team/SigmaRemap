// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.EnumSet;

public class Class3587 extends Class3446
{
    private static String[] field16717;
    private static final Class7843 field16718;
    public final Class789 field16719;
    private final Class<? extends Class789> field16720;
    public final World field16721;
    public Class789 field16722;
    private int field16723;
    private final double field16724;
    
    public Class3587(final Class789 class789, final double n) {
        this(class789, n, class789.getClass());
    }
    
    public Class3587(final Class789 field16719, final double field16720, final Class<? extends Class789> field16721) {
        this.field16719 = field16719;
        this.field16721 = field16719.world;
        this.field16720 = field16721;
        this.field16724 = field16720;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16719.method4363()) {
            this.field16722 = this.method11118();
            return this.field16722 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16722.method1768()) {
            if (this.field16722.method4363()) {
                if (this.field16723 < 60) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11018() {
        this.field16722 = null;
        this.field16723 = 0;
    }
    
    @Override
    public void method11016() {
        this.field16719.method4147().method24667(this.field16722, 10.0f, (float)this.field16719.method4173());
        this.field16719.method4150().method24725(this.field16722, this.field16724);
        ++this.field16723;
        if (this.field16723 >= 60) {
            if (this.field16719.method1734(this.field16722) < 9.0) {
                this.method11119();
            }
        }
    }
    
    @Nullable
    private Class789 method11118() {
        final List<Class789> method7142 = this.field16721.method7142(this.field16720, Class3587.field16718, (LivingEntity)this.field16719, this.field16719.method1886().method18496(8.0));
        double method7143 = Double.MAX_VALUE;
        Class789 class789 = null;
        for (final Class789 class790 : method7142) {
            if (!this.field16719.method4365(class790)) {
                continue;
            }
            if (this.field16719.method1734(class790) >= method7143) {
                continue;
            }
            class789 = class790;
            method7143 = this.field16719.method1734(class790);
        }
        return class789;
    }
    
    public void method11119() {
        final Class788 method4349 = this.field16719.method4349(this.field16722);
        if (method4349 != null) {
            Class513 class513 = this.field16719.method4362();
            if (class513 == null) {
                if (this.field16722.method4362() != null) {
                    class513 = this.field16722.method4362();
                }
            }
            if (class513 != null) {
                class513.method2857(Class8276.field34018);
                Class7770.field31789.method13804(class513, this.field16719, this.field16722, method4349);
            }
            this.field16719.method4354(6000);
            this.field16722.method4354(6000);
            this.field16719.method4364();
            this.field16722.method4364();
            method4349.method4354(-24000);
            method4349.method1730(this.field16719.getPosX(), this.field16719.getPosY(), this.field16719.getPosZ(), 0.0f, 0.0f);
            this.field16721.method6886(method4349);
            this.field16721.method6761(this.field16719, (byte)18);
            if (this.field16721.method6765().method31216(Class8878.field37319)) {
                this.field16721.method6886(new Class508(this.field16721, this.field16719.getPosX(), this.field16719.getPosY(), this.field16719.getPosZ(), this.field16719.method2633().nextInt(7) + 1));
            }
        }
    }
    
    static {
        field16718 = new Class7843().method25337(8.0).method25338().method25339().method25340();
    }
}
