// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Optional;

public class Class3428 extends Class3426<Class473>
{
    private static String[] field16204;
    private final Class473 field16205;
    private final Class470 field16206;
    private final Class7318 field16207;
    private final Class512 field16208;
    
    public Class3428(final int n, final Class464 class464) {
        this(n, class464, Class7318.field28308);
    }
    
    public Class3428(final int n, final Class464 class464, final Class7318 field16207) {
        super(Class8471.field34766, n);
        this.field16205 = new Class473(this, 3, 3);
        this.field16206 = new Class470();
        this.field16207 = field16207;
        this.field16208 = class464.field2744;
        this.method10870(new Class6623(class464.field2744, this.field16205, this.field16206, 0, 124, 35));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.method10870(new Class6601(this.field16205, j + i * 3, 30 + j * 18, 17 + i * 18));
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.method10870(new Class6601(class464, l + k * 9 + 9, 8 + l * 18, 84 + k * 18));
            }
        }
        for (int n2 = 0; n2 < 9; ++n2) {
            this.method10870(new Class6601(class464, n2, 8 + n2 * 18, 142));
        }
    }
    
    public static void method10942(final int n, final World class1847, final Class512 class1848, final Class473 class1849, final Class470 class1850) {
        if (!class1847.isRemote) {
            final Class513 class1851 = (Class513)class1848;
            ItemStack class1852 = ItemStack.field34174;
            final Optional<Class3663> method6378 = class1847.getServer().method1577().method6378(Class8976.field37843, class1849, class1847);
            if (method6378.isPresent()) {
                final Class3663 class1853 = method6378.get();
                if (class1850.method2416(class1847, class1851, class1853)) {
                    class1852 = class1853.method11290(class1849);
                }
            }
            class1850.method2160(0, class1852);
            class1851.field3039.method17469(new Class4272(n, 0, class1852));
        }
    }
    
    @Override
    public void method10855(final Class446 class446) {
        this.field16207.method22437((class447, p1) -> method10942(this.field16154, class447, this.field16208, this.field16205, this.field16206));
    }
    
    @Override
    public void method10934(final Class5024 class5024) {
        this.field16205.method2259(class5024);
    }
    
    @Override
    public void method10935() {
        this.field16205.method2164();
        this.field16206.method2164();
    }
    
    @Override
    public boolean method10936(final Class3662<? super Class473> class3662) {
        return class3662.method11289(this.field16205, this.field16208.world);
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        this.field16207.method22437((class514, p2) -> this.method10881(class513, class514, this.field16205));
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return Class3418.method10866(this.field16207, class512, Class7521.field29296);
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n != 0) {
                    if (n >= 10 && n < 46) {
                        if (!this.method10888(method20053, 1, 10, false)) {
                            if (n >= 37) {
                                if (!this.method10888(method20053, 10, 37, false)) {
                                    return ItemStack.field34174;
                                }
                            }
                            else if (!this.method10888(method20053, 37, 46, false)) {
                                return ItemStack.field34174;
                            }
                        }
                    }
                    else if (!this.method10888(method20053, 10, 46, false)) {
                        return ItemStack.field34174;
                    }
                }
                else {
                    this.field16207.method22437((class517, p3) -> class515.method27622().method11723(class515, class517, class516));
                    if (!this.method10888(method20053, 10, 46, true)) {
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
                final ItemStack method20054 = class514.method20047(class512, method20053);
                if (n == 0) {
                    class512.method2822(method20054, false);
                }
            }
        }
        return class513;
    }
    
    @Override
    public boolean method10857(final ItemStack class8321, final Class6601 class8322) {
        return class8322.field26173 != this.field16206 && super.method10857(class8321, class8322);
    }
    
    @Override
    public int method10937() {
        return 0;
    }
    
    @Override
    public int method10938() {
        return this.field16205.method2418();
    }
    
    @Override
    public int method10939() {
        return this.field16205.method2417();
    }
    
    @Override
    public int method10940() {
        return 10;
    }
}
