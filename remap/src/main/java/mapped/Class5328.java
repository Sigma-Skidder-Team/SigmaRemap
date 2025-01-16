// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Map;

public class Class5328
{
    private final Map<Class8725, Class7919> field22362;
    private final Class2069 field22363;
    private final int field22364;
    private String field22365;
    
    @Nullable
    public static Class5328 method16450(final int n) {
        return Registry.field207.method499(n);
    }
    
    public static int method16451(final Class5328 class5328) {
        return Registry.field207.getId(class5328);
    }
    
    public Class5328(final Class2069 field22363, final int field22364) {
        this.field22362 = Maps.newHashMap();
        this.field22363 = field22363;
        this.field22364 = field22364;
    }
    
    public void method16449(final LivingEntity class511, final int n) {
        if (this != Class9439.field40483) {
            if (this != Class9439.field40492) {
                if (this != Class9439.field40493) {
                    if (this == Class9439.field40490 && class511 instanceof PlayerEntity) {
                        ((PlayerEntity)class511).method2876(0.005f * (n + 1));
                    }
                    else if (this == Class9439.field40496 && class511 instanceof PlayerEntity) {
                        if (!class511.world.isRemote) {
                            ((PlayerEntity)class511).method2877().method33486(n + 1, 1.0f);
                        }
                    }
                    else if ((this != Class9439.field40479 || class511.method2657()) && (this != Class9439.field40480 || !class511.method2657())) {
                        if (this != Class9439.field40480 || class511.method2657()) {
                            if (this != Class9439.field40479) {
                                return;
                            }
                            if (!class511.method2657()) {
                                return;
                            }
                        }
                        class511.attackEntityFrom(DamageSource.field32576, (float)(6 << n));
                    }
                    else {
                        class511.method2663((float)Math.max(4 << n, 0));
                    }
                }
                else {
                    class511.attackEntityFrom(DamageSource.field32577, 1.0f);
                }
            }
            else if (class511.method2664() > 1.0f) {
                class511.attackEntityFrom(DamageSource.field32576, 1.0f);
            }
        }
        else if (class511.method2664() < class511.method2701()) {
            class511.method2663(1.0f);
        }
    }
    
    public void method16452(final Entity class399, final Entity class400, final LivingEntity class401, final int n, final double n2) {
        if ((this != Class9439.field40479 || class401.method2657()) && (this != Class9439.field40480 || !class401.method2657())) {
            if ((this != Class9439.field40480 || class401.method2657()) && (this != Class9439.field40479 || !class401.method2657())) {
                this.method16449(class401, n);
            }
            else {
                final int n3 = (int)(n2 * (6 << n) + 0.5);
                if (class399 != null) {
                    class401.attackEntityFrom(DamageSource.method25700(class399, class400), (float)n3);
                }
                else {
                    class401.attackEntityFrom(DamageSource.field32576, (float)n3);
                }
            }
        }
        else {
            class401.method2663((float)(int)(n2 * (4 << n) + 0.5));
        }
    }
    
    public boolean method16448(final int n, final int n2) {
        if (this == Class9439.field40483) {
            final int n3 = 50 >> n2;
            return n3 <= 0 || n % n3 == 0;
        }
        if (this == Class9439.field40492) {
            final int n4 = 25 >> n2;
            return n4 <= 0 || n % n4 == 0;
        }
        if (this != Class9439.field40493) {
            return this == Class9439.field40490;
        }
        final int n5 = 40 >> n2;
        return n5 <= 0 || n % n5 == 0;
    }
    
    public boolean method16453() {
        return false;
    }
    
    public String method16454() {
        if (this.field22365 == null) {
            this.field22365 = Util.method27836("effect", Registry.field207.getKey(this));
        }
        return this.field22365;
    }
    
    public String method16455() {
        return this.method16454();
    }
    
    public ITextComponent method16456() {
        return new Class2259(this.method16455(), new Object[0]);
    }
    
    public Class2069 method16457() {
        return this.field22363;
    }
    
    public int method16458() {
        return this.field22364;
    }
    
    public Class5328 method16459(final Class8725 class8725, final String name, final double n, final Class2157 class8726) {
        this.field22362.put(class8725, new Class7919(UUID.fromString(name), this::method16455, n, class8726));
        return this;
    }
    
    public Map<Class8725, Class7919> method16460() {
        return this.field22362;
    }
    
    public void method16461(final LivingEntity class511, final Class6821 class512, final int n) {
        for (final Map.Entry<Class8725, V> entry : this.field22362.entrySet()) {
            final Class7619 method20879 = class512.method20879(entry.getKey());
            if (method20879 == null) {
                continue;
            }
            method20879.method23947((Class7919)entry.getValue());
        }
    }
    
    public void method16462(final LivingEntity class511, final Class6821 class512, final int i) {
        for (final Map.Entry<Class8725, V> entry : this.field22362.entrySet()) {
            final Class7619 method20879 = class512.method20879(entry.getKey());
            if (method20879 == null) {
                continue;
            }
            final Class7919 class513 = (Class7919)entry.getValue();
            method20879.method23947(class513);
            method20879.method23946(new Class7919(class513.method25635(), this.method16455() + " " + i, this.method16463(i, class513), class513.method25637()));
        }
    }
    
    public double method16463(final int n, final Class7919 class7919) {
        return class7919.method25638() * (n + 1);
    }
    
    public boolean method16464() {
        return this.field22363 == Class2069.field11843;
    }
}
