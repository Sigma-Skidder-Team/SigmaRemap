// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class8070 extends Class8071
{
    private boolean field33242;
    private boolean field33243;
    private int field33244;
    private int field33245;
    
    public Class8070(final Class1849 class1849) {
        super(class1849);
    }
    
    @Override
    public void method26476() {
        super.method26476();
        ++this.field33245;
        final long method6754 = this.field33247.method6754();
        final long lng = method6754 / 24000L + 1L;
        if (!this.field33242) {
            if (this.field33245 > 20) {
                this.field33242 = true;
                this.field33248.field3039.method17469(new Class4306(5, 0.0f));
            }
        }
        if (this.field33243 = (method6754 > 120500L)) {
            ++this.field33244;
        }
        if (method6754 % 24000L != 500L) {
            if (lng != 1L) {
                if (lng == 5L) {
                    if (method6754 % 24000L == 22000L) {
                        this.field33248.sendMessage(new Class2259("demo.day.warning", new Object[0]));
                    }
                }
            }
            else if (method6754 != 100L) {
                if (method6754 != 175L) {
                    if (method6754 == 250L) {
                        this.field33248.field3039.method17469(new Class4306(5, 103.0f));
                    }
                }
                else {
                    this.field33248.field3039.method17469(new Class4306(5, 102.0f));
                }
            }
            else {
                this.field33248.field3039.method17469(new Class4306(5, 101.0f));
            }
        }
        else if (lng <= 6L) {
            if (lng != 6L) {
                this.field33248.sendMessage(new Class2259("demo.day." + lng, new Object[0]));
            }
            else {
                this.field33248.field3039.method17469(new Class4306(5, 104.0f));
            }
        }
    }
    
    private void method26477() {
        if (this.field33244 > 100) {
            this.field33248.sendMessage(new Class2259("demo.reminder", new Object[0]));
            this.field33244 = 0;
        }
    }
    
    @Override
    public void method26478(final BlockPos class354, final Class2003 class355, final Direction class356, final int n) {
        if (!this.field33243) {
            super.method26478(class354, class355, class356, n);
        }
        else {
            this.method26477();
        }
    }
    
    @Override
    public Class2201 method26479(final Class512 class512, final World class513, final ItemStack class514, final Class316 class515) {
        if (!this.field33243) {
            return super.method26479(class512, class513, class514, class515);
        }
        this.method26477();
        return Class2201.field13402;
    }
    
    @Override
    public Class2201 method26480(final Class512 class512, final World class513, final ItemStack class514, final Class316 class515, final Class7005 class516) {
        if (!this.field33243) {
            return super.method26480(class512, class513, class514, class515, class516);
        }
        this.method26477();
        return Class2201.field13402;
    }
}
