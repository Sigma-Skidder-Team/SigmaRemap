// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumMap;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

import java.util.Map;
import javax.annotation.Nullable;

public abstract class Class6257
{
    private final Class2215[] field25116;
    private final Class2233 field25117;
    public Class242 field25118;
    public String field25119;
    
    @Nullable
    public static Class6257 method18590(final int n) {
        return Class90.field209.method499(n);
    }
    
    public Class6257(final Class2233 field25117, final Class242 field25118, final Class2215[] field25119) {
        this.field25117 = field25117;
        this.field25118 = field25118;
        this.field25116 = field25119;
    }
    
    public Map<Class2215, ItemStack> method18591(final LivingEntity class511) {
        final EnumMap enumMap = Maps.newEnumMap((Class)Class2215.class);
        for (final Class2215 class512 : this.field25116) {
            final ItemStack method2718 = class511.method2718(class512);
            if (!method2718.method27620()) {
                enumMap.put((Object)class512, method2718);
            }
        }
        return enumMap;
    }
    
    public Class2233 method18592() {
        return this.field25117;
    }
    
    public int method18593() {
        return 1;
    }
    
    public int method18588() {
        return 1;
    }
    
    public int method18586(final int n) {
        return 1 + n * 10;
    }
    
    public int method18587(final int n) {
        return this.method18586(n) + 5;
    }
    
    public int method18594(final int n, final DamageSource class7929) {
        return 0;
    }
    
    public float method18595(final int n, final Class6363 class6363) {
        return 0.0f;
    }
    
    public final boolean method18596(final Class6257 class6257) {
        return this.method18589(class6257) && class6257.method18589(this);
    }
    
    public boolean method18589(final Class6257 class6257) {
        return this != class6257;
    }
    
    public String method18597() {
        if (this.field25119 == null) {
            this.field25119 = Class8349.method27836("enchantment", Class90.field209.method503(this));
        }
        return this.field25119;
    }
    
    public String method18598() {
        return this.method18597();
    }
    
    public ITextComponent method18599(final int i) {
        final Class2259 class2259 = new Class2259(this.method18598(), new Object[0]);
        if (!this.method18604()) {
            class2259.applyTextStyle(TextFormatting.GRAY);
        }
        else {
            class2259.applyTextStyle(TextFormatting.RED);
        }
        if (i != 1 || this.method18588() != 1) {
            class2259.appendText(" ").appendSibling(new Class2259("enchantment.level." + i, new Object[0]));
        }
        return class2259;
    }
    
    public boolean method18600(final ItemStack class8321) {
        return this.field25118.method894(class8321.method27622());
    }
    
    public void method18601(final LivingEntity class511, final Entity class512, final int n) {
    }
    
    public void method18602(final LivingEntity class511, final Entity class512, final int n) {
    }
    
    public boolean method18603() {
        return false;
    }
    
    public boolean method18604() {
        return false;
    }
}
