// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import java.util.Date;

public class Class552 extends Class551
{
    public static Date field3323;
    
    public Class552() {
        super(true);
        if (Class552.field3323.before(new Date(System.currentTimeMillis() - 3000L))) {
            Class552.field3323 = new Date();
            Class9463.method35173().method35187().method20240("Saving profiles...");
            try {
                Class9463.method35173().method35189().method21556().method32706();
                Class9463.method35173().method35179();
            }
            catch (final IOException ex) {
                ex.printStackTrace();
                Class9463.method35173().method35187().method20241("Unable to save mod profiles...");
            }
        }
    }
    
    @Override
    public void method2969() {
        if (Class9463.method35173().method35209() == Class2209.field13464) {
            this.method3029(new Class654(this.field3152 / 2 - 102, this.field3153 - 45, 204, 20, "Jello for Sigma Options", class654 -> this.field3150.method5244(new Class555())));
        }
        super.method2969();
        final Iterator<Class573> iterator = this.field3154.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().field3427 != this.field3153 / 4 + 72 - 16) {
                continue;
            }
            iterator.remove();
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        super.method2975(n, n2, n3);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    static {
        Class552.field3323 = new Date(0L);
    }
}