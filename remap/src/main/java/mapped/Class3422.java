// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.world.World;

import java.util.List;

public class Class3422 extends Class3418
{
    private static String[] field16169;
    private final Class7318 field16170;
    private final Class6546 field16171;
    private final World field16172;
    private List<Class3686> field16173;
    private ItemStack field16174;
    private long field16175;
    public final Class6601 field16176;
    public final Class6601 field16177;
    private Runnable field16178;
    public final IInventory field16179;
    private final Class470 field16180;
    
    public Class3422(final int n, final Class464 class464) {
        this(n, class464, Class7318.field28308);
    }
    
    public Class3422(final int n, final Class464 class464, final Class7318 field16170) {
        super(Class8471.field34777, n);
        this.field16171 = Class6546.method19836();
        this.field16173 = Lists.newArrayList();
        this.field16174 = ItemStack.EMPTY;
        this.field16178 = (() -> {});
        this.field16179 = new Class479(this, 1);
        this.field16180 = new Class470();
        this.field16170 = field16170;
        this.field16172 = class464.field2744.world;
        this.field16176 = this.method10870(new Class6601(this.field16179, 0, 20, 33));
        this.field16177 = this.method10870(new Class6600(this, this.field16180, 1, 143, 33, field16170));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class464, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class464, k, 8 + k * 18, 142));
        }
        this.method10871(this.field16171);
    }
    
    public int method10904() {
        return this.field16171.method19832();
    }
    
    public List<Class3686> method10905() {
        return this.field16173;
    }
    
    public int method10906() {
        return this.field16173.size();
    }
    
    public boolean method10907() {
        return this.field16176.method20054() && !this.field16173.isEmpty();
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return Class3418.method10866(this.field16170, playerEntity, Blocks.STONECUTTER);
    }
    
    @Override
    public boolean method10877(final PlayerEntity playerEntity, final int n) {
        if (n >= 0) {
            if (n < this.field16173.size()) {
                this.field16171.method19833(n);
                this.method10909();
            }
        }
        return true;
    }
    
    @Override
    public void method10855(final IInventory class446) {
        final ItemStack method20053 = this.field16176.method20053();
        if (method20053.getItem() != this.field16174.getItem()) {
            this.field16174 = method20053.method27641();
            this.method10908(class446, method20053);
        }
    }
    
    private void method10908(final IInventory class446, final ItemStack class447) {
        this.field16173.clear();
        this.field16171.method19833(-1);
        this.field16177.method20055(ItemStack.EMPTY);
        if (!class447.method27620()) {
            this.field16173 = this.field16172.method6792().method6379(IRecipeType.field37848, class446, this.field16172);
        }
    }
    
    private void method10909() {
        if (this.field16173.isEmpty()) {
            this.field16177.method20055(ItemStack.EMPTY);
        }
        else {
            this.field16177.method20055(this.field16173.get(this.field16171.method19832()).getCraftingResult(this.field16179));
        }
        this.method10876();
    }
    
    @Override
    public Class8471<?> method10867() {
        return Class8471.field34777;
    }
    
    public void method10910(final Runnable field16178) {
        this.field16178 = field16178;
    }
    
    @Override
    public boolean method10857(final ItemStack class8321, final Class6601 class8322) {
        return class8322.field26173 != this.field16180 && super.method10857(class8321, class8322);
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.EMPTY;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                final Item method20054 = method20053.getItem();
                class513 = method20053.method27641();
                if (n != 1) {
                    if (n != 0) {
                        if (!this.field16172.method6792().method6378(IRecipeType.field37848, new Class443(new ItemStack[] { method20053 }), this.field16172).isPresent()) {
                            if (n >= 2 && n < 29) {
                                if (!this.method10888(method20053, 29, 38, false)) {
                                    return ItemStack.EMPTY;
                                }
                            }
                            else if (n >= 29) {
                                if (n < 38) {
                                    if (!this.method10888(method20053, 2, 29, false)) {
                                        return ItemStack.EMPTY;
                                    }
                                }
                            }
                        }
                        else if (!this.method10888(method20053, 0, 1, false)) {
                            return ItemStack.EMPTY;
                        }
                    }
                    else if (!this.method10888(method20053, 2, 38, false)) {
                        return ItemStack.EMPTY;
                    }
                }
                else {
                    method20054.method11723(method20053, playerEntity.world, playerEntity);
                    if (!this.method10888(method20053, 2, 38, true)) {
                        return ItemStack.EMPTY;
                    }
                    class514.method20049(method20053, class513);
                }
                if (method20053.method27620()) {
                    class514.method20055(ItemStack.EMPTY);
                }
                class514.method20056();
                if (method20053.method27690() == class513.method27690()) {
                    return ItemStack.EMPTY;
                }
                class514.method20047(playerEntity, method20053);
                this.method10876();
            }
        }
        return class513;
    }
    
    @Override
    public void method10859(final PlayerEntity playerEntity) {
        super.method10859(playerEntity);
        this.field16180.method2159(1);
        this.field16170.method22437((p1, p2) -> this.method10881(class513, class513.field2391, this.field16179));
    }
}
