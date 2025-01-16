// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import javax.annotation.Nullable;

import com.google.common.collect.Queues;
import java.util.Deque;

public class Class690 extends AbstractGui
{
    private static String[] field3804;
    private final Minecraft field3805;
    private final Class7767<?>[] field3806;
    private final Deque<Class6866> field3807;
    
    public Class690(final Minecraft field3805) {
        this.field3806 = new Class7767[5];
        this.field3807 = Queues.newArrayDeque();
        this.field3805 = field3805;
    }
    
    public void method3849() {
        if (!this.field3805.gameSettings.field23464) {
            for (int i = 0; i < this.field3806.length; ++i) {
                final Class7767<?> class7767 = this.field3806[i];
                if (class7767 != null) {
                    if (class7767.method24873(this.field3805.method5332().method7696(), i)) {
                        this.field3806[i] = null;
                    }
                }
                if (this.field3806[i] == null) {
                    if (!this.field3807.isEmpty()) {
                        this.field3806[i] = new Class7767<Object>(this, this.field3807.removeFirst(), null);
                    }
                }
            }
        }
    }
    
    @Nullable
    public <T extends Class6866> T method3850(final Class<? extends T> clazz, final Object o) {
        for (final Class7767<?> class7767 : this.field3806) {
            if (class7767 != null) {
                if (clazz.isAssignableFrom(class7767.method24871().getClass())) {
                    if (((Class6866)class7767.method24871()).method20982().equals(o)) {
                        return (T)class7767.method24871();
                    }
                }
            }
        }
        for (final Class6866 class7768 : this.field3807) {
            if (clazz.isAssignableFrom(class7768.getClass()) && class7768.method20982().equals(o)) {
                return (T)class7768;
            }
        }
        return null;
    }
    
    public void method3851() {
        Arrays.fill(this.field3806, null);
        this.field3807.clear();
    }
    
    public void method3852(final Class6866 class6866) {
        this.field3807.add(class6866);
    }
    
    public Minecraft method3853() {
        return this.field3805;
    }
}
