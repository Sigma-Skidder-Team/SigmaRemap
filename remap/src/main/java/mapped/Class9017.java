// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class Class9017
{
    private final ItemStack field38047;
    private final ItemStack field38048;
    private final ItemStack field38049;
    private int field38050;
    private final int field38051;
    private boolean field38052;
    private int field38053;
    private int field38054;
    private float field38055;
    private int field38056;
    
    public Class9017(final CompoundNBT class51) {
        this.field38052 = true;
        this.field38056 = 1;
        this.field38047 = ItemStack.method27619(class51.getCompound("buy"));
        this.field38048 = ItemStack.method27619(class51.getCompound("buyB"));
        this.field38049 = ItemStack.method27619(class51.getCompound("sell"));
        this.field38050 = class51.getInt("uses");
        if (!class51.contains("maxUses", 99)) {
            this.field38051 = 4;
        }
        else {
            this.field38051 = class51.getInt("maxUses");
        }
        if (class51.contains("rewardExp", 1)) {
            this.field38052 = class51.getBoolean("rewardExp");
        }
        if (class51.contains("xp", 3)) {
            this.field38056 = class51.getInt("xp");
        }
        if (class51.contains("priceMultiplier", 5)) {
            this.field38055 = class51.getFloat("priceMultiplier");
        }
        this.field38053 = class51.getInt("specialPrice");
        this.field38054 = class51.getInt("demand");
    }
    
    public Class9017(final ItemStack class8321, final ItemStack class8322, final int n, final int n2, final float n3) {
        this(class8321, ItemStack.field34174, class8322, n, n2, n3);
    }
    
    public Class9017(final ItemStack class8321, final ItemStack class8322, final ItemStack class8323, final int n, final int n2, final float n3) {
        this(class8321, class8322, class8323, 0, n, n2, n3);
    }
    
    public Class9017(final ItemStack class8321, final ItemStack class8322, final ItemStack class8323, final int n, final int n2, final int n3, final float n4) {
        this(class8321, class8322, class8323, n, n2, n3, n4, 0);
    }
    
    public Class9017(final ItemStack field38047, final ItemStack field38048, final ItemStack field38049, final int field38050, final int field38051, final int field38052, final float field38053, final int field38054) {
        this.field38052 = true;
        this.field38056 = 1;
        this.field38047 = field38047;
        this.field38048 = field38048;
        this.field38049 = field38049;
        this.field38050 = field38050;
        this.field38051 = field38051;
        this.field38056 = field38052;
        this.field38055 = field38053;
        this.field38054 = field38054;
    }
    
    public ItemStack method32280() {
        return this.field38047;
    }
    
    public ItemStack method32281() {
        final int method27690 = this.field38047.method27690();
        final ItemStack method27691 = this.field38047.method27641();
        method27691.method27691(MathHelper.method35651(method27690 + Math.max(0, MathHelper.method35642(method27690 * this.field38054 * this.field38055)) + this.field38053, 1, this.field38047.getItem().method11708()));
        return method27691;
    }
    
    public ItemStack method32282() {
        return this.field38048;
    }
    
    public ItemStack method32283() {
        return this.field38049;
    }
    
    public void method32284() {
        this.field38054 = this.field38054 + this.field38050 - (this.field38051 - this.field38050);
    }
    
    public ItemStack method32285() {
        return this.field38049.method27641();
    }
    
    public int method32286() {
        return this.field38050;
    }
    
    public void method32287() {
        this.field38050 = 0;
    }
    
    public int method32288() {
        return this.field38051;
    }
    
    public void method32289() {
        ++this.field38050;
    }
    
    public int method32290() {
        return this.field38054;
    }
    
    public void method32291(final int n) {
        this.field38053 += n;
    }
    
    public void method32292() {
        this.field38053 = 0;
    }
    
    public int method32293() {
        return this.field38053;
    }
    
    public void method32294(final int field38053) {
        this.field38053 = field38053;
    }
    
    public float method32295() {
        return this.field38055;
    }
    
    public int method32296() {
        return this.field38056;
    }
    
    public boolean method32297() {
        return this.field38050 >= this.field38051;
    }
    
    public void method32298() {
        this.field38050 = this.field38051;
    }
    
    public boolean method32299() {
        return this.field38050 > 0;
    }
    
    public boolean method32300() {
        return this.field38052;
    }
    
    public CompoundNBT method32301() {
        final CompoundNBT class51 = new CompoundNBT();
        class51.put("buy", this.field38047.method27627(new CompoundNBT()));
        class51.put("sell", this.field38049.method27627(new CompoundNBT()));
        class51.put("buyB", this.field38048.method27627(new CompoundNBT()));
        class51.putInt("uses", this.field38050);
        class51.putInt("maxUses", this.field38051);
        class51.putBoolean("rewardExp", this.field38052);
        class51.putInt("xp", this.field38056);
        class51.putFloat("priceMultiplier", this.field38055);
        class51.putInt("specialPrice", this.field38053);
        class51.putInt("demand", this.field38054);
        return class51;
    }
    
    public boolean method32302(final ItemStack class8321, final ItemStack class8322) {
        if (this.method32303(class8321, this.method32281())) {
            if (class8321.method27690() >= this.method32281().method27690()) {
                if (this.method32303(class8322, this.field38048)) {
                    if (class8322.method27690() >= this.field38048.method27690()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean method32303(final ItemStack class8321, final ItemStack class8322) {
        if (class8322.method27620() && class8321.method27620()) {
            return true;
        }
        final ItemStack method27641 = class8321.method27641();
        if (method27641.getItem().method11710()) {
            method27641.method27633(method27641.method27632());
        }
        if (ItemStack.method27645(method27641, class8322)) {
            if (class8322.method27656()) {
                if (!method27641.method27656()) {
                    return false;
                }
                if (!Class9346.method34642(class8322.method27657(), method27641.method27657(), false)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method32304(final ItemStack class8321, final ItemStack class8322) {
        if (this.method32302(class8321, class8322)) {
            class8321.method27693(this.method32281().method27690());
            if (!this.method32282().method27620()) {
                class8322.method27693(this.method32282().method27690());
            }
            return true;
        }
        return false;
    }
}
