// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class Class3423 extends Class3418
{
    private static String[] field16181;
    private final Class822 field16182;
    private final Class450 field16183;
    private int field16184;
    private boolean field16185;
    private boolean field16186;
    
    public Class3423(final int n, final Class464 class464) {
        this(n, class464, new Class823(class464.field2744));
    }
    
    public Class3423(final int n, final Class464 class464, final Class822 field16182) {
        super(Class8471.field34773, n);
        this.field16182 = field16182;
        this.field16183 = new Class450(field16182);
        this.method10870(new Class6601(this.field16183, 0, 136, 37));
        this.method10870(new Class6601(this.field16183, 1, 162, 37));
        this.method10870(new Class6602(class464.field2744, field16182, this.field16183, 2, 220, 37));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class464, j + i * 9 + 9, 108 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class464, k, 108 + k * 18, 142));
        }
    }
    
    public void method10917(final boolean field16185) {
        this.field16185 = field16185;
    }
    
    @Override
    public void method10855(final IInventory class446) {
        this.field16183.method2280();
        super.method10855(class446);
    }
    
    public void method10918(final int n) {
        this.field16183.method2282(n);
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return this.field16182.method4823() == playerEntity;
    }
    
    public int method10919() {
        return this.field16182.method4821();
    }
    
    public int method10920() {
        return this.field16183.method2283();
    }
    
    public void method10921(final int n) {
        this.field16182.method4827(n);
    }
    
    public int method10922() {
        return this.field16184;
    }
    
    public void method10923(final int field16184) {
        this.field16184 = field16184;
    }
    
    public void method10924(final boolean field16186) {
        this.field16186 = field16186;
    }
    
    public boolean method10925() {
        return this.field16186;
    }
    
    @Override
    public boolean method10857(final ItemStack class8321, final Class6601 class8322) {
        return false;
    }
    
    @Override
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        ItemStack class513 = ItemStack.EMPTY;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n != 2) {
                    if (n != 0 && n != 1) {
                        if (n >= 3 && n < 30) {
                            if (!this.method10888(method20053, 30, 39, false)) {
                                return ItemStack.EMPTY;
                            }
                        }
                        else if (n >= 30) {
                            if (n < 39) {
                                if (!this.method10888(method20053, 3, 30, false)) {
                                    return ItemStack.EMPTY;
                                }
                            }
                        }
                    }
                    else if (!this.method10888(method20053, 3, 39, false)) {
                        return ItemStack.EMPTY;
                    }
                }
                else {
                    if (!this.method10888(method20053, 3, 39, true)) {
                        return ItemStack.EMPTY;
                    }
                    class514.method20049(method20053, class513);
                    this.method10926();
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
    
    private void method10926() {
        if (!this.field16182.method4838().isRemote) {
            final Entity class399 = (Entity)this.field16182;
            this.field16182.method4838().method6708(class399.getPosX(), class399.getPosY(), class399.getPosZ(), this.field16182.method4832(), Class286.field1584, 1.0f, 1.0f, false);
        }
    }
    
    @Override
    public void method10859(final PlayerEntity playerEntity) {
        super.method10859(playerEntity);
        this.field16182.method4822(null);
        if (!this.field16182.method4838().isRemote) {
            if (playerEntity.isAlive() && (playerEntity instanceof Class513 && ((Class513) playerEntity).method2936())) {
                playerEntity.inventory.method2364(playerEntity.world, this.field16183.method2159(0));
                playerEntity.inventory.method2364(playerEntity.world, this.field16183.method2159(1));
            }
            else {
                final ItemStack method2159 = this.field16183.method2159(0);
                if (!method2159.method27620()) {
                    playerEntity.method2822(method2159, false);
                }
                final ItemStack method2160 = this.field16183.method2159(1);
                if (!method2160.method27620()) {
                    playerEntity.method2822(method2160, false);
                }
            }
        }
    }
    
    public void method10927(final int n) {
        if (this.method10931().size() > n) {
            final ItemStack method2157 = this.field16183.getStackInSlot(0);
            if (!method2157.method27620()) {
                if (!this.method10888(method2157, 3, 39, true)) {
                    return;
                }
                this.field16183.method2160(0, method2157);
            }
            final ItemStack method2158 = this.field16183.getStackInSlot(1);
            if (!method2158.method27620()) {
                if (!this.method10888(method2158, 3, 39, true)) {
                    return;
                }
                this.field16183.method2160(1, method2158);
            }
            if (this.field16183.getStackInSlot(0).method27620()) {
                if (this.field16183.getStackInSlot(1).method27620()) {
                    this.method10928(0, this.method10931().get(n).method32281());
                    this.method10928(1, this.method10931().get(n).method32282());
                }
            }
        }
    }
    
    private void method10928(final int n, final ItemStack class8321) {
        if (!class8321.method27620()) {
            for (int i = 3; i < 39; ++i) {
                final ItemStack method20053 = this.field16151.get(i).method20053();
                if (!method20053.method27620()) {
                    if (this.method10929(class8321, method20053)) {
                        final ItemStack method20054 = this.field16183.getStackInSlot(n);
                        final int n2 = method20054.method27620() ? 0 : method20054.method27690();
                        final int min = Math.min(class8321.method27628() - n2, method20053.method27690());
                        final ItemStack method20055 = method20053.method27641();
                        final int n3 = n2 + min;
                        method20053.method27693(min);
                        method20055.method27691(n3);
                        this.field16183.method2160(n, method20055);
                        if (n3 >= class8321.method27628()) {
                            break;
                        }
                    }
                }
            }
        }
    }
    
    private boolean method10929(final ItemStack class8321, final ItemStack class8322) {
        return class8321.getItem() == class8322.getItem() && ItemStack.method27642(class8321, class8322);
    }
    
    public void method10930(final Class57 class57) {
        this.field16182.method4826(class57);
    }
    
    public Class57 method10931() {
        return this.field16182.method4825();
    }
    
    public boolean method10932() {
        return this.field16185;
    }
}
