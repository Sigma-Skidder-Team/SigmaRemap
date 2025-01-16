// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap$Entry;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import com.google.common.collect.Lists;
import com.google.common.base.Stopwatch;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import net.minecraft.util.math.BlockPos;

import java.util.Collection;

public class Class9083
{
    private final Class6812 field38456;
    private BlockPos field38457;
    private final Class1849 field38458;
    private final Collection<Class7373> field38459;
    private final int field38460;
    private final Collection<Class7059> field38461;
    private Object2LongMap<Runnable> field38462;
    private long field38463;
    private long field38464;
    private boolean field38465;
    private final Stopwatch field38466;
    private boolean field38467;
    private Throwable field38468;
    
    public Class9083(final Class6812 field38456, final Class1849 field38457) {
        this.field38459 = Lists.newArrayList();
        this.field38461 = Lists.newCopyOnWriteArrayList();
        this.field38462 = (Object2LongMap<Runnable>)new Object2LongOpenHashMap();
        this.field38465 = false;
        this.field38466 = Stopwatch.createUnstarted();
        this.field38467 = false;
        this.field38456 = field38456;
        this.field38458 = field38457;
        this.field38460 = field38456.method20851();
    }
    
    public Class9083(final Class6812 class6812, final BlockPos class6813, final Class1849 class6814) {
        this(class6812, class6814);
        this.method32750(class6813);
    }
    
    public void method32750(final BlockPos field38457) {
        this.field38457 = field38457;
    }
    
    public void method32751() {
        this.field38463 = this.field38458.method6754() + 1L + this.field38456.method20854();
        this.field38466.start();
    }
    
    public void method32752() {
        if (!this.method32762()) {
            this.field38464 = this.field38458.method6754() - this.field38463;
            if (this.field38464 >= 0L) {
                if (this.field38464 == 0L) {
                    this.method32753();
                }
                final ObjectIterator iterator = this.field38462.object2LongEntrySet().iterator();
                while (iterator.hasNext()) {
                    final Object2LongMap$Entry object2LongMap$Entry = (Object2LongMap$Entry)iterator.next();
                    if (object2LongMap$Entry.getLongValue() <= this.field38464) {
                        try {
                            ((Runnable)object2LongMap$Entry.getKey()).run();
                        }
                        catch (final Exception ex) {
                            this.method32764(ex);
                        }
                        iterator.remove();
                    }
                }
                if (this.field38464 > this.field38460) {
                    if (this.field38461.isEmpty()) {
                        this.method32764(new Class2397("Didn't succeed or fail within " + this.field38456.method20851() + " ticks"));
                    }
                    else {
                        this.field38461.forEach(class7059 -> class7059.method21538(this.field38464));
                        if (this.field38468 == null) {
                            this.method32764(new Class2397("No sequences finished"));
                        }
                    }
                }
                else {
                    this.field38461.forEach(class7060 -> class7060.method21537(this.field38464));
                }
            }
        }
    }
    
    private void method32753() {
        if (this.field38465) {
            throw new IllegalStateException("Test already started");
        }
        this.field38465 = true;
        try {
            this.field38456.method20848(new Class9152(this));
        }
        catch (final Exception ex) {
            this.method32764(ex);
        }
    }
    
    public String method32754() {
        return this.field38456.method20849();
    }
    
    public BlockPos method32755() {
        return this.field38457;
    }
    
    @Nullable
    public BlockPos method32756() {
        final Class501 method32757 = this.method32757();
        return (method32757 != null) ? method32757.method2562() : null;
    }
    
    @Nullable
    private Class501 method32757() {
        return (Class501)this.field38458.getTileEntity(this.field38457);
    }
    
    public Class1849 method32758() {
        return this.field38458;
    }
    
    public boolean method32759() {
        return this.field38467 && this.field38468 == null;
    }
    
    public boolean method32760() {
        return this.field38468 != null;
    }
    
    public boolean method32761() {
        return this.field38465;
    }
    
    public boolean method32762() {
        return this.field38467;
    }
    
    private void method32763() {
        if (!this.field38467) {
            this.field38467 = true;
            this.field38466.stop();
        }
    }
    
    public void method32764(final Throwable field38468) {
        this.method32763();
        this.field38468 = field38468;
        this.field38459.forEach(class7373 -> class7373.method22641(this));
    }
    
    @Nullable
    public Throwable method32765() {
        return this.field38468;
    }
    
    @Override
    public String toString() {
        return this.method32754();
    }
    
    public void method32766(final Class7373 class7373) {
        this.field38459.add(class7373);
    }
    
    public void method32767(final int n) {
        Class8787.method30576(this.field38456.method20850(), this.field38457, n, this.field38458, false).method2557(this.method32754());
        Class8787.method30574(this.field38457.add(1, 0, -1), this.field38458);
        this.field38459.forEach(class7373 -> class7373.method22640(this));
    }
    
    public boolean method32768() {
        return this.field38456.method20852();
    }
    
    public boolean method32769() {
        return !this.field38456.method20852();
    }
    
    public String method32770() {
        return this.field38456.method20850();
    }
}
