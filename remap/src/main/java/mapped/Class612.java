// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.Logger;

public class Class612 extends Class608<Class633>
{
    private static final Logger field3566;
    private static final ThreadPoolExecutor field3567;
    private static final ResourceLocation field3568;
    private static final ResourceLocation field3569;
    private final Class720 field3570;
    private final List<Class634> field3571;
    private final Class633 field3572;
    private final List<Class635> field3573;
    
    public Class612(final Class720 field3570, final Class869 class869, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class869, n, n2, n3, n4, n5);
        this.field3571 = Lists.newArrayList();
        this.field3572 = new Class636();
        this.field3573 = Lists.newArrayList();
        this.field3570 = field3570;
    }
    
    private void method3574() {
        this.method3533();
        this.field3571.forEach(this::method3536);
        this.method3536(this.field3572);
        this.field3573.forEach(this::method3536);
    }
    
    public void method3575(final Class633 class633) {
        super.method3531(class633);
        if (this.method3530() instanceof Class634) {
            Class7895.field32404.method25556(new Class2259("narrator.select", new Object[] { Class634.method3660(((Class604<Class634>)this).method3530()).field41612 }).getString());
        }
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        final Class633 class633 = this.method3530();
        return (class633 != null && class633.method2972(n, n2, n3)) || super.method2972(n, n2, n3);
    }
    
    @Override
    public void method3556(final int n) {
        final int method35651 = MathHelper.method35651(this.method3040().indexOf(((Class604<Object>)this).method3530()) + n, 0, this.method3537() - 1);
        Class633 class633 = this.method3040().get(method35651);
        if (class633 instanceof Class636) {
            class633 = this.method3040().get(MathHelper.method35651(method35651 + ((n <= 0) ? -1 : 1), 0, this.method3537() - 1));
        }
        super.method3531(class633);
        this.method3548(class633);
        this.field3570.method3951();
    }
    
    public void method3576(final Class9295 class9295) {
        this.field3571.clear();
        for (int i = 0; i < class9295.method34336(); ++i) {
            this.field3571.add(new Class634(this, this.field3570, class9295.method34333(i)));
        }
        this.method3574();
    }
    
    public void method3577(final List<Class9506> list) {
        this.field3573.clear();
        final Iterator<Class9506> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.field3573.add(new Class635(this.field3570, iterator.next()));
        }
        this.method3574();
    }
    
    @Override
    public int method3555() {
        return super.method3555() + 30;
    }
    
    @Override
    public int method3529() {
        return super.method3529() + 85;
    }
    
    @Override
    public boolean method3561() {
        return this.field3570.method3471() == this;
    }
    
    static {
        field3566 = LogManager.getLogger();
        field3567 = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class612.field3566)).build());
        field3568 = new ResourceLocation("textures/misc/unknown_server.png");
        field3569 = new ResourceLocation("textures/gui/server_selection.png");
    }
}
