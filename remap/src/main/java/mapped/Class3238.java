// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;

public class Class3238 extends Class3167
{
    private int field15721;
    private int field15722;
    private int field15723;
    private int field15724;
    private boolean field15725;
    private boolean field15726;
    
    public Class3238() {
        super(Class8013.field32992, "AutoSoup", "Automatically eats soup when low life");
        this.method9881(new Class4996("Health", "Minimum health before eating soup", 13.0f, Float.class, 1.0f, 19.0f, 1.0f));
        this.method9881(new Class4996("Refill delay", "Refill delay", 4.0f, Float.class, 0.0f, 8.0f, 1.0f));
        this.method9881(new Class4996("Refill accuracy", "Refill accuracy", 100.0f, Float.class, 30.0f, 100.0f, 1.0f));
        this.method9881(new Class5001("Refill mode", "Refill mode", 0, new String[] { "Basic", "FakeInv", "OpenInv" }));
        this.method9881(new Class5001("Soup mode", "Soup Mode", 0, new String[] { "Instant", "Legit" }));
        this.method9881(new Class5001("Bowls", "Bowls managing", 0, new String[] { "Drop", "Stack" }));
    }
    
    @Override
    public void method9879() {
        this.field15721 = (int)this.method9886("Refill delay");
        this.field15724 = (int)this.method9886("Refill delay");
        this.field15725 = false;
        this.field15726 = false;
        this.field15723 = -1;
    }
    
    @Class6753
    private void method10219(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15721;
            ++this.field15724;
            final String method9887 = this.method9887("Refill mode");
            if (!this.field15725) {
                if (this.method10225(Items.field31301) == 0) {
                    if (method9887.equals("OpenInv") && !(Class3238.field15514.field4700 instanceof Class518)) {
                        return;
                    }
                    if (this.method10226(Items.field31301) > 0) {
                        if (this.field15721 > 3) {
                            this.method10221();
                        }
                    }
                    return;
                }
            }
            else if (method9887.equals("OpenInv") && !(Class3238.field15514.field4700 instanceof Class518)) {
                this.field15725 = false;
            }
            else if (this.method10225(Items.AIR) != 0) {
                this.method10222();
            }
            else {
                this.field15725 = false;
                this.field15726 = false;
            }
            this.method10223();
        }
    }
    
    @Class6753
    private void method10220(final Class5721 class5721) {
        if (this.method9906()) {
            if (this.field15726) {
                if (class5721.method16990() instanceof Class4323) {
                    if (((Class4323)class5721.method16990()).method12987() == Class2218.field13623) {
                        class5721.method16961(true);
                    }
                }
            }
        }
    }
    
    private void method10221() {
        this.field15725 = true;
        if (this.method9887("Refill mode").equals("FakeInv")) {
            if (!(Class3238.field15514.field4700 instanceof Class518)) {
                Class3238.field15514.method5269().method17292(new Class4323(Class2218.field13623));
                this.field15726 = true;
            }
        }
        if (this.method9887("Bowls").equals("Stack")) {
            final int method10225 = this.method10225(Items.field31300);
            if (method10225 > 0) {
                final int method10226 = this.method10224(method10225);
                if (method10226 > 0) {
                    Class8639.method29367(Class3238.field15514.field4684.field3008.field16154, method10226, 0, Class2133.field12437, Class3238.field15514.field4684, true);
                    Class8639.method29367(Class3238.field15514.field4684.field3008.field16154, method10226, 0, Class2133.field12443, Class3238.field15514.field4684, true);
                    Class8639.method29367(Class3238.field15514.field4684.field3008.field16154, method10226, 0, Class2133.field12437, Class3238.field15514.field4684, true);
                    this.field15724 = -5;
                }
            }
        }
        this.field15722 = 9;
    }
    
    private void method10222() {
        final int n = (int)this.method9886("Refill delay");
        if (this.field15724 >= n) {
            while (this.field15722 < 36) {
                boolean b = false;
                if (Class8639.method29363(this.field15722).getItem() == Items.field31301) {
                    if (Math.random() * 100.0 > this.method9886("Refill accuracy")) {
                        Class8639.method29367(Class3238.field15514.field4684.field3008.field16154, this.field15722, 0, Class2133.field12438, Class3238.field15514.field4684, true);
                        this.field15724 = 0;
                        b = true;
                    }
                }
                ++this.field15722;
                if (this.method10225(Items.AIR) == 0) {
                    this.field15725 = false;
                    this.field15726 = false;
                    break;
                }
                if (b && n > 0) {
                    break;
                }
            }
            if (this.field15722 > 35) {
                this.field15725 = false;
            }
        }
    }
    
    private void method10223() {
        int field2743 = -1;
        for (int i = 36; i < 45; ++i) {
            if (Class3238.field15514.field4684.field3008.method10878(i).method20053().getItem() == Items.field31301 && Class9463.method35173().method35195().method28162(i) > 100L) {
                field2743 = i - 36;
                break;
            }
        }
        final boolean equals = this.method9887("Bowls").equals("Drop");
        if (this.method9887("Soup mode").equals("Instant")) {
            if (field2743 >= 0) {
                if (this.field15721 > 3) {
                    if (Class3238.field15514.field4684.method2664() <= this.method9886("Health")) {
                        Class3238.field15514.method5269().method17292(new Class4321(field2743));
                        Class3238.field15514.method5269().method17292(new Class4307(Class316.field1878));
                        Class3238.field15514.method5269().method17292(new Class4307(Class316.field1877));
                        if (equals) {
                            Class3238.field15514.method5269().method17292(new Class4399(Class2003.field11244, BlockPos.ZERO, Direction.DOWN));
                        }
                        Class3238.field15514.method5269().method17292(new Class4321(Class3238.field15514.field4684.field3006.field2743));
                        this.field15721 = 0;
                    }
                }
            }
            return;
        }
        if (this.field15723 < 0) {
            if (field2743 >= 0) {
                if (this.field15721 > 3) {
                    if (Class3238.field15514.field4684.method2664() <= this.method9886("Health")) {
                        this.field15723 = Class3238.field15514.field4684.field3006.field2743;
                        Class3238.field15514.field4684.field3006.field2743 = field2743;
                        Class3238.field15514.field4682.method27318();
                        Class3238.field15514.method5269().method17292(new Class4307(Class316.field1878));
                        Class3238.field15514.method5269().method17292(new Class4307(Class316.field1877));
                    }
                }
            }
            return;
        }
        if (equals) {
            Class3238.field15514.method5269().method17292(new Class4399(Class2003.field11244, BlockPos.ZERO, Direction.DOWN));
        }
        Class3238.field15514.field4684.field3006.field2743 = this.field15723;
        Class3238.field15514.field4682.method27318();
        this.field15721 = 0;
        this.field15723 = -1;
    }
    
    private int method10224(final int n) {
        final ItemStack method29363 = Class8639.method29363(13);
        if (method29363.getItem() == Items.field31300 && method29363.method27690() <= 64 - n) {
            return 13;
        }
        for (int i = 9; i < 36; ++i) {
            final ItemStack method29364 = Class8639.method29363(i);
            if (method29364.getItem() == Items.field31300 && method29364.method27690() <= 64 - n) {
                return i;
            }
        }
        final ItemStack method29365 = Class8639.method29363(13);
        if (method29365.getItem() == Items.field31300 && method29365.method27690() < 64) {
            return 13;
        }
        for (int j = 9; j < 36; ++j) {
            final ItemStack method29366 = Class8639.method29363(j);
            if (method29366.getItem() == Items.field31300 && method29366.method27690() < 64) {
                return j;
            }
        }
        if (Class8639.method29363(13).getItem() == Items.AIR) {
            for (int k = 36; k < 45; ++k) {
                if (Class3238.field15514.field4684.field3008.method10878(k).method20053().getItem() == Items.field31300) {
                    Class8639.method29370(13, k - 36);
                    return 13;
                }
            }
        }
        for (int l = 9; l < 36; ++l) {
            if (Class8639.method29363(l).getItem() == Items.AIR) {
                for (int n2 = 36; n2 < 45; ++n2) {
                    if (Class3238.field15514.field4684.field3008.method10878(n2).method20053().getItem() == Items.field31300) {
                        Class8639.method29370(l, n2 - 36);
                        return -1;
                    }
                }
            }
        }
        for (int n3 = 36; n3 < 45; ++n3) {
            if (Class3238.field15514.field4684.field3008.method10878(n3).method20053().getItem() == Items.field31300) {
                Class8639.method29370(13, n3 - 36);
                return -1;
            }
        }
        return -1;
    }
    
    private int method10225(final Item class3820) {
        int n = 0;
        for (int i = 36; i < 45; ++i) {
            if (Class3238.field15514.field4684.field3008.method10878(i).method20053().getItem() == class3820) {
                ++n;
            }
        }
        return n;
    }
    
    private int method10226(final Item class3820) {
        int n = 0;
        for (int i = 9; i < 36; ++i) {
            if (Class3238.field15514.field4684.field3008.method10878(i).method20053().getItem() == class3820) {
                ++n;
            }
        }
        return n;
    }
}
