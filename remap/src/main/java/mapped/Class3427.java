// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3427 extends Class3426<Class473>
{
    public static final Class1932 field16192;
    public static final Class1932 field16193;
    public static final Class1932 field16194;
    public static final Class1932 field16195;
    public static final Class1932 field16196;
    public static final Class1932 field16197;
    private static final Class1932[] field16198;
    private static final Class2215[] field16199;
    private final Class473 field16200;
    private final Class470 field16201;
    public final boolean field16202;
    private final Class512 field16203;
    
    public Class3427(final Class464 class464, final boolean field16202, final Class512 field16203) {
        super(null, 0);
        this.field16200 = new Class473(this, 2, 2);
        this.field16201 = new Class470();
        this.field16202 = field16202;
        this.field16203 = field16203;
        this.method10870(new Class6623(class464.field2744, this.field16200, this.field16201, 0, 154, 28));
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.method10870(new Class6601(this.field16200, j + i * 2, 98 + j * 18, 18 + i * 18));
            }
        }
        for (int k = 0; k < 4; ++k) {
            this.method10870(new Class6617(this, class464, 39 - k, 8, 8 + k * 18, Class3427.field16199[k]));
        }
        for (int l = 0; l < 3; ++l) {
            for (int n = 0; n < 9; ++n) {
                this.method10870(new Class6601(class464, n + (l + 1) * 9, 8 + n * 18, 84 + l * 18));
            }
        }
        for (int n2 = 0; n2 < 9; ++n2) {
            this.method10870(new Class6601(class464, n2, 8 + n2 * 18, 142));
        }
        this.method10870(new Class6621(this, class464, 40, 77, 62));
    }
    
    @Override
    public void method10934(final Class5024 class5024) {
        this.field16200.method2259(class5024);
    }
    
    @Override
    public void method10935() {
        this.field16201.method2164();
        this.field16200.method2164();
    }
    
    @Override
    public boolean method10936(final Class3662<? super Class473> class3662) {
        return class3662.method11289(this.field16200, this.field16203.world);
    }
    
    @Override
    public void method10855(final Class446 class446) {
        Class3428.method10942(this.field16154, this.field16203.world, this.field16203, this.field16200, this.field16201);
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        this.field16201.method2164();
        if (!class512.world.isRemote) {
            this.method10881(class512, class512.world, this.field16200);
        }
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return true;
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                final Class2215 method20054 = Class759.method4185(class513);
                if (n != 0) {
                    if (n >= 1 && n < 5) {
                        if (!this.method10888(method20053, 9, 45, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (n >= 5 && n < 9) {
                        if (!this.method10888(method20053, 9, 45, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (method20054.method8401() == Class295.field1682 && !this.field16151.get(8 - method20054.method8402()).method20054()) {
                        final int n2 = 8 - method20054.method8402();
                        if (!this.method10888(method20053, n2, n2 + 1, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (method20054 == Class2215.field13601 && !this.field16151.get(45).method20054()) {
                        if (!this.method10888(method20053, 45, 46, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (n >= 9 && n < 36) {
                        if (!this.method10888(method20053, 36, 45, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (n >= 36 && n < 45) {
                        if (!this.method10888(method20053, 9, 36, false)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (!this.method10888(method20053, 9, 45, false)) {
                        return ItemStack.field34174;
                    }
                }
                else {
                    if (!this.method10888(method20053, 9, 45, true)) {
                        return ItemStack.field34174;
                    }
                    class514.method20049(method20053, class513);
                }
                if (!method20053.method27620()) {
                    class514.method20056();
                }
                else {
                    class514.method20055(ItemStack.field34174);
                }
                if (method20053.method27690() == class513.method27690()) {
                    return ItemStack.field34174;
                }
                final ItemStack method20055 = class514.method20047(class512, method20053);
                if (n == 0) {
                    class512.method2822(method20055, false);
                }
            }
        }
        return class513;
    }
    
    @Override
    public boolean method10857(final ItemStack class8321, final Class6601 class8322) {
        return class8322.field26173 != this.field16201 && super.method10857(class8321, class8322);
    }
    
    @Override
    public int method10937() {
        return 0;
    }
    
    @Override
    public int method10938() {
        return this.field16200.method2418();
    }
    
    @Override
    public int method10939() {
        return this.field16200.method2417();
    }
    
    @Override
    public int method10940() {
        return 5;
    }
    
    static {
        field16192 = new Class1932("textures/atlas/blocks.png");
        field16193 = new Class1932("item/empty_armor_slot_helmet");
        field16194 = new Class1932("item/empty_armor_slot_chestplate");
        field16195 = new Class1932("item/empty_armor_slot_leggings");
        field16196 = new Class1932("item/empty_armor_slot_boots");
        field16197 = new Class1932("item/empty_armor_slot_shield");
        field16198 = new Class1932[] { Class3427.field16196, Class3427.field16195, Class3427.field16194, Class3427.field16193 };
        field16199 = new Class2215[] { Class2215.field13605, Class2215.field13604, Class2215.field13603, Class2215.field13602 };
    }
}
