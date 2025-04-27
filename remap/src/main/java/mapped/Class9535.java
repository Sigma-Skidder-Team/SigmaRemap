// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class9535
{
    private final List<Class8779> field41036;
    private final LivingEntity field41037;
    private int field41038;
    private int field41039;
    private int field41040;
    private boolean field41041;
    private boolean field41042;
    private String field41043;
    
    public Class9535(final LivingEntity field41037) {
        this.field41036 = Lists.newArrayList();
        this.field41037 = field41037;
    }
    
    public void method35593() {
        this.method35600();
        if (!this.field41037.method2688()) {
            if (this.field41037.method1706()) {
                this.field41043 = "water";
            }
        }
        else {
            final Block method21696 = this.field41037.world.getBlockState(new BlockPos(this.field41037)).method21696();
            if (method21696 != Blocks.field29307) {
                if (method21696 == Blocks.field29388) {
                    this.field41043 = "vines";
                }
            }
            else {
                this.field41043 = "ladder";
            }
        }
    }
    
    public void method35594(final DamageSource class7929, final float n, final float n2) {
        this.method35601();
        this.method35593();
        final Class8779 class7930 = new Class8779(class7929, this.field41037.ticksExisted, n, n2, this.field41043, this.field41037.fallDistance);
        this.field41036.add(class7930);
        this.field41038 = this.field41037.ticksExisted;
        this.field41042 = true;
        if (class7930.method30539()) {
            if (!this.field41041) {
                if (this.field41037.isAlive()) {
                    this.field41041 = true;
                    this.field41039 = this.field41037.ticksExisted;
                    this.field41040 = this.field41039;
                    this.field41037.method2752();
                }
            }
        }
    }
    
    public ITextComponent method35595() {
        if (!this.field41036.isEmpty()) {
            final Class8779 method35597 = this.method35597();
            final Class8779 class8779 = this.field41036.get(this.field41036.size() - 1);
            final ITextComponent method35598 = class8779.method30541();
            final Entity method35599 = class8779.method30537().method25714();
            ITextComponent method35602;
            if (method35597 != null && class8779.method30537() == DamageSource.field32572) {
                final ITextComponent method35600 = method35597.method30541();
                if (method35597.method30537() != DamageSource.field32572 && method35597.method30537() != DamageSource.field32574) {
                    if (method35600 != null && (!method35600.equals(method35598))) {
                        final Entity method35601 = method35597.method30537().method25714();
                        final ItemStack class8780 = (method35601 instanceof LivingEntity) ? ((LivingEntity)method35601).getHeldItemMainhand() : ItemStack.EMPTY;
                        if (!class8780.method27620() && class8780.method27667()) {
                            method35602 = new Class2259("death.fell.assist.item", this.field41037.getDisplayName(), method35600, class8780.method27684());
                        }
                        else {
                            method35602 = new Class2259("death.fell.assist", this.field41037.getDisplayName(), method35600);
                        }
                    }
                    else if (method35598 == null) {
                        method35602 = new Class2259("death.fell.killer", this.field41037.getDisplayName());
                    }
                    else {
                        final ItemStack class8781 = (method35599 instanceof LivingEntity) ? ((LivingEntity)method35599).getHeldItemMainhand() : ItemStack.EMPTY;
                        if (!class8781.method27620() && class8781.method27667()) {
                            method35602 = new Class2259("death.fell.finish.item", this.field41037.getDisplayName(), method35598, class8781.method27684());
                        }
                        else {
                            method35602 = new Class2259("death.fell.finish", this.field41037.getDisplayName(), method35598);
                        }
                    }
                }
                else {
                    method35602 = new Class2259("death.fell.accident." + this.method35598(method35597), this.field41037.getDisplayName());
                }
            }
            else {
                method35602 = class8779.method30537().method25690(this.field41037);
            }
            return method35602;
        }
        return new Class2259("death.attack.generic", this.field41037.getDisplayName());
    }
    
    @Nullable
    public LivingEntity method35596() {
        LivingEntity class511 = null;
        LivingEntity class512 = null;
        float method30538 = 0.0f;
        float method30539 = 0.0f;
        for (final Class8779 class513 : this.field41036) {
            if (class513.method30537().method25714() instanceof PlayerEntity) {
                if (class512 == null || class513.method30538() > method30539) {
                    method30539 = class513.method30538();
                    class512 = (PlayerEntity)class513.method30537().method25714();
                }
            }
            if (!(class513.method30537().method25714() instanceof LivingEntity)) {
                continue;
            }
            if (class511 != null && class513.method30538() <= method30538) {
                continue;
            }
            method30538 = class513.method30538();
            class511 = (LivingEntity)class513.method30537().method25714();
        }
        return (class512 != null && method30539 >= method30538 / 3.0f) ? class512 : class511;
    }
    
    @Nullable
    private Class8779 method35597() {
        Class8779 class8779 = null;
        Class8779 class8780 = null;
        float method30538 = 0.0f;
        float method30539 = 0.0f;
        for (int i = 0; i < this.field41036.size(); ++i) {
            final Class8779 class8781 = this.field41036.get(i);
            final Class8779 class8782 = (i <= 0) ? null : this.field41036.get(i - 1);
            if (class8781.method30537() == DamageSource.field32572 || class8781.method30537() == DamageSource.field32574) {
                if (class8781.method30542() > 0.0f) {
                    if (class8779 == null || class8781.method30542() > method30539) {
                        if (i <= 0) {
                            class8779 = class8781;
                        }
                        else {
                            class8779 = class8782;
                        }
                        method30539 = class8781.method30542();
                    }
                }
            }
            if (class8781.method30540() != null) {
                if (class8780 == null || class8781.method30538() > method30538) {
                    class8780 = class8781;
                    method30538 = class8781.method30538();
                }
            }
        }
        if (method30539 > 5.0f && class8779 != null) {
            return class8779;
        }
        return (method30538 > 5.0f && class8780 != null) ? class8780 : null;
    }
    
    private String method35598(final Class8779 class8779) {
        return (class8779.method30540() != null) ? class8779.method30540() : "generic";
    }
    
    public int method35599() {
        return this.field41041 ? (this.field41037.ticksExisted - this.field41039) : (this.field41040 - this.field41039);
    }
    
    private void method35600() {
        this.field41043 = null;
    }
    
    public void method35601() {
        final int n = this.field41041 ? 300 : 100;
        if (this.field41042) {
            if (!this.field41037.isAlive() || this.field41037.ticksExisted - this.field41038 > n) {
                final boolean field41041 = this.field41041;
                this.field41042 = false;
                this.field41041 = false;
                this.field41040 = this.field41037.ticksExisted;
                if (field41041) {
                    this.field41037.method2753();
                }
                this.field41036.clear();
            }
        }
    }
    
    public LivingEntity method35602() {
        return this.field41037;
    }
}
