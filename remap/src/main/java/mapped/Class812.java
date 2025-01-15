// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import java.util.AbstractList;

public abstract class Class812 extends Class806
{
    private static final DataParameter<Boolean> field4366;
    
    public Class812(final EntityType<? extends Class812> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4352 = false;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class812.field4366, false);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(this.method4763());
        this.method2710(Class8107.field33408).method23941(0.17499999701976776);
        this.method2710(Class812.field4333).method23941(0.5);
    }
    
    public boolean method4780() {
        return this.dataManager.get(Class812.field4366);
    }
    
    public void method4781(final boolean b) {
        this.dataManager.set(Class812.field4366, b);
    }
    
    @Override
    public int method4730() {
        return this.method4780() ? 17 : super.method4730();
    }
    
    @Override
    public double method1777() {
        return super.method1777() - 0.25;
    }
    
    @Override
    public Class7795 method4737() {
        super.method4737();
        return Class8520.field35127;
    }
    
    @Override
    public void method2676() {
        super.method2676();
        if (this.method4780()) {
            if (!this.world.isRemote) {
                this.method1764(Class7521.field29292);
            }
            this.method4781(false);
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("ChestedHorse", this.method4780());
        if (this.method4780()) {
            final Class52 class52 = new Class52();
            for (int i = 2; i < this.field4342.method2239(); ++i) {
                final ItemStack method2157 = this.field4342.method2157(i);
                if (!method2157.method27620()) {
                    final Class51 e = new Class51();
                    e.method296("Slot", (byte)i);
                    method2157.method27627(e);
                    ((AbstractList<Class51>)class52).add(e);
                }
            }
            class51.method295("Items", class52);
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4781(class51.method329("ChestedHorse"));
        if (this.method4780()) {
            final Class52 method328 = class51.method328("Items", 10);
            this.method4731();
            for (int i = 0; i < method328.size(); ++i) {
                final Class51 method329 = method328.method346(i);
                final int n = method329.method317("Slot") & 0xFF;
                if (n >= 2) {
                    if (n < this.field4342.method2239()) {
                        this.field4342.method2160(n, ItemStack.method27619(method329));
                    }
                }
            }
        }
        this.method4732();
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        if (n == 499) {
            if (this.method4780() && class8321.method27620()) {
                this.method4781(false);
                this.method4731();
                return true;
            }
            if (!this.method4780()) {
                if (class8321.getItem() == Class7521.field29292.method11704()) {
                    this.method4781(true);
                    this.method4731();
                    return true;
                }
            }
        }
        return super.method1893(n, class8321);
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final ItemStack method2715 = class512.method2715(class513);
        if (method2715.getItem() instanceof Class3831) {
            return super.method4195(class512, class513);
        }
        if (!this.method2625()) {
            if (this.method4715() && class512.method2804()) {
                this.method4740(class512);
                return true;
            }
            if (this.isBeingRidden()) {
                return super.method4195(class512, class513);
            }
        }
        if (!method2715.method27620()) {
            int method2716 = this.method4741(class512, method2715) ? 1 : 0;
            if (method2716 == 0) {
                if (this.method4715() && method2715.getItem() != Items.field31552) {
                    if (!this.method4780()) {
                        if (method2715.getItem() == Class7521.field29292.method11704()) {
                            this.method4781(true);
                            this.method4782();
                            method2716 = 1;
                            this.method4731();
                        }
                    }
                    if (!this.method2625()) {
                        if (!this.method4736()) {
                            if (method2715.getItem() == Items.field31353) {
                                this.method4740(class512);
                                return true;
                            }
                        }
                    }
                }
                else {
                    if (!method2715.method27640(class512, this, class513)) {
                        this.method4750();
                        return true;
                    }
                    return true;
                }
            }
            if (method2716 != 0) {
                if (!class512.field3025.field27304) {
                    method2715.method27693(1);
                }
                return true;
            }
        }
        if (!this.method2625()) {
            this.method4742(class512);
            return true;
        }
        return super.method4195(class512, class513);
    }
    
    public void method4782() {
        this.method1695(Class8520.field35128, 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
    }
    
    public int method4783() {
        return 5;
    }
    
    static {
        field4366 = EntityDataManager.method33564(Class812.class, Class7709.field30661);
    }
}
