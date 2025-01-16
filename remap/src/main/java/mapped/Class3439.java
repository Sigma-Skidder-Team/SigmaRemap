// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.AbstractList;

public class Class3439 extends Class3418
{
    private final Class7318 field16238;
    private final Class6546 field16239;
    private Runnable field16240;
    private final Class6601 field16241;
    private final Class6601 field16242;
    private final Class6601 field16243;
    private final Class6601 field16244;
    private long field16245;
    private final IInventory field16246;
    private final IInventory field16247;
    
    public Class3439(final int n, final Class464 class464) {
        this(n, class464, Class7318.field28308);
    }
    
    public Class3439(final int n, final Class464 class464, final Class7318 field16238) {
        super(Class8471.field34772, n);
        this.field16239 = Class6546.method19836();
        this.field16240 = (() -> {});
        this.field16246 = new Class445(this, 3);
        this.field16247 = new Class483(this, 1);
        this.field16238 = field16238;
        this.field16241 = this.method10870(new Class6610(this, this.field16246, 0, 13, 26));
        this.field16242 = this.method10870(new Class6612(this, this.field16246, 1, 33, 26));
        this.field16243 = this.method10870(new Class6609(this, this.field16246, 2, 23, 45));
        this.field16244 = this.method10870(new Class6622(this, this.field16247, 0, 143, 58, field16238));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class464, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class464, k, 8 + k * 18, 142));
        }
        this.method10871(this.field16239);
    }
    
    public int method10974() {
        return this.field16239.method19832();
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return Class3418.method10866(this.field16238, playerEntity, Class7521.field29806);
    }
    
    @Override
    public boolean method10877(final PlayerEntity playerEntity, final int n) {
        if (n > 0 && n <= Class230.field853) {
            this.field16239.method19833(n);
            this.method10976();
            return true;
        }
        return false;
    }
    
    @Override
    public void method10855(final IInventory class446) {
        final ItemStack method20053 = this.field16241.method20053();
        final ItemStack method20054 = this.field16242.method20053();
        final ItemStack method20055 = this.field16243.method20053();
        Label_0052: {
            Label_0044: {
                if (!this.field16244.method20053().method27620()) {
                    if (!method20053.method27620()) {
                        if (!method20054.method27620()) {
                            if (this.field16239.method19832() > 0) {
                                if (this.field16239.method19832() < Class230.field852 - 5) {
                                    break Label_0044;
                                }
                                if (!method20055.method27620()) {
                                    break Label_0044;
                                }
                            }
                        }
                    }
                    this.field16244.method20055(ItemStack.EMPTY);
                    this.field16239.method19833(0);
                    break Label_0052;
                }
            }
            if (!method20055.method27620()) {
                if (method20055.getItem() instanceof Class4056) {
                    final CompoundNBT method20056 = method20053.method27659("BlockEntityTag");
                    boolean b = false;
                    Label_0228: {
                        if (method20056.contains("Patterns", 9)) {
                            if (!method20053.method27620()) {
                                if (method20056.getList("Patterns", 10).size() >= 6) {
                                    b = true;
                                    break Label_0228;
                                }
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        this.field16239.method19833(((Class4056)method20055.getItem()).method12260().ordinal());
                    }
                    else {
                        this.field16239.method19833(0);
                    }
                }
            }
        }
        this.method10976();
        this.method10876();
    }
    
    public void method10975(final Runnable field16240) {
        this.field16240 = field16240;
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.EMPTY;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                Label_0090: {
                    if (n != this.field16244.field26174) {
                        if (n != this.field16242.field26174) {
                            if (n != this.field16241.field26174) {
                                if (n != this.field16243.field26174) {
                                    if (!(method20053.getItem() instanceof Class4044)) {
                                        if (!(method20053.getItem() instanceof Class3829)) {
                                            if (!(method20053.getItem() instanceof Class4056)) {
                                                if (n >= 4 && n < 31) {
                                                    if (this.method10888(method20053, 31, 40, false)) {
                                                        break Label_0090;
                                                    }
                                                    return ItemStack.EMPTY;
                                                }
                                                else {
                                                    if (n < 31) {
                                                        break Label_0090;
                                                    }
                                                    if (n >= 40) {
                                                        break Label_0090;
                                                    }
                                                    if (this.method10888(method20053, 4, 31, false)) {
                                                        break Label_0090;
                                                    }
                                                    return ItemStack.EMPTY;
                                                }
                                            }
                                            else {
                                                if (this.method10888(method20053, this.field16243.field26174, this.field16243.field26174 + 1, false)) {
                                                    break Label_0090;
                                                }
                                                return ItemStack.EMPTY;
                                            }
                                        }
                                        else {
                                            if (this.method10888(method20053, this.field16242.field26174, this.field16242.field26174 + 1, false)) {
                                                break Label_0090;
                                            }
                                            return ItemStack.EMPTY;
                                        }
                                    }
                                    else {
                                        if (this.method10888(method20053, this.field16241.field26174, this.field16241.field26174 + 1, false)) {
                                            break Label_0090;
                                        }
                                        return ItemStack.EMPTY;
                                    }
                                }
                            }
                        }
                        if (!this.method10888(method20053, 4, 40, false)) {
                            return ItemStack.EMPTY;
                        }
                    }
                    else {
                        if (!this.method10888(method20053, 4, 40, true)) {
                            return ItemStack.EMPTY;
                        }
                        class514.method20049(method20053, class513);
                    }
                }
                if (!method20053.method27620()) {
                    class514.method20056();
                }
                else {
                    class514.method20055(ItemStack.EMPTY);
                }
                if (method20053.method27690() == class513.method27690()) {
                    return ItemStack.EMPTY;
                }
                class514.method20047(playerEntity, method20053);
            }
        }
        return class513;
    }
    
    @Override
    public void method10859(final PlayerEntity playerEntity) {
        super.method10859(playerEntity);
        this.field16238.method22437((p1, p2) -> this.method10881(class513, class513.field2391, this.field16246));
    }
    
    private void method10976() {
        if (this.field16239.method19832() > 0) {
            final ItemStack method20053 = this.field16241.method20053();
            final ItemStack method20054 = this.field16242.method20053();
            ItemStack class8321 = ItemStack.EMPTY;
            if (!method20053.method27620()) {
                if (!method20054.method27620()) {
                    class8321 = method20053.method27641();
                    class8321.method27691(1);
                    final Class230 class8322 = Class230.values()[this.field16239.method19832()];
                    final Class181 method20055 = ((Class3829)method20054.getItem()).method11767();
                    final CompoundNBT method20056 = class8321.method27659("BlockEntityTag");
                    ListNBT method20057;
                    if (!method20056.contains("Patterns", 9)) {
                        method20057 = new ListNBT();
                        method20056.put("Patterns", method20057);
                    }
                    else {
                        method20057 = method20056.getList("Patterns", 10);
                    }
                    final CompoundNBT e = new CompoundNBT();
                    e.putString("Pattern", class8322.method859());
                    e.putInt("Color", method20055.method813());
                    ((AbstractList<CompoundNBT>)method20057).add(e);
                }
            }
            if (!ItemStack.method27643(class8321, this.field16244.method20053())) {
                this.field16244.method20055(class8321);
            }
        }
    }
    
    public Class6601 method10977() {
        return this.field16241;
    }
    
    public Class6601 method10978() {
        return this.field16242;
    }
    
    public Class6601 method10979() {
        return this.field16243;
    }
    
    public Class6601 method10980() {
        return this.field16244;
    }
}
