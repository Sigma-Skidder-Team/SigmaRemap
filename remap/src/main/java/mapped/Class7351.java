// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Queues;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayDeque;
import java.util.Deque;

public class Class7351
{
    private static String[] field28369;
    public Deque<Class8996> field28370;
    private final Deque<Class8996> field28371;
    
    public Class7351() {
        this.field28370 = new ArrayDeque<Class8996>();
        this.field28371 = Class8349.method27851(Queues.newArrayDeque(), arrayDeque -> {
            final Class6789 class6789 = new Class6789();
            class6789.method20748();
            final Class9429 class6790 = new Class9429();
            class6790.method35039();
            arrayDeque.add(new Class8996(class6789, class6790, null));
        });
    }
    
    public void method22564(final double n, final double n2, final double n3) {
        Class8996.method32113(this.field28371.getLast()).method20765((float)n, (float)n2, (float)n3);
    }
    
    public void method22565(final float n, final float n2, final float n3) {
        final Class8996 class8996 = this.field28371.getLast();
        Class8996.method32113(class8996).method20766(n, n2, n3);
        if (n == n2) {
            if (n2 == n3) {
                if (n > 0.0f) {
                    return;
                }
                Class8996.method32114(class8996).method35044(-1.0f);
            }
        }
        final float n4 = 1.0f / n;
        final float n5 = 1.0f / n2;
        final float n6 = 1.0f / n3;
        final float method35696 = MathHelper.method35696(n4 * n5 * n6);
        Class8996.method32114(class8996).method35042(Class9429.method35032(method35696 * n4, method35696 * n5, method35696 * n6));
    }
    
    public void method22566(final Quaternion class9389) {
        final Class8996 class9390 = this.field28371.getLast();
        Class8996.method32113(class9390).method20753(class9389);
        Class8996.method32114(class9390).method35043(class9389);
    }
    
    public void method22567() {
        final Class8996 class8996 = this.field28371.getLast();
        Class8996 class8997 = this.field28370.pollLast();
        if (class8997 != null) {
            Class8996.method32113(class8997).method20769(Class8996.method32113(class8996));
            Class8996.method32114(class8997).method35038(Class8996.method32114(class8996));
        }
        else {
            class8997 = new Class8996(Class8996.method32113(class8996).method20758(), Class8996.method32114(class8996).method35045(), null);
        }
        this.field28371.addLast(class8997);
    }
    
    public void method22568() {
        final Class8996 class8996 = this.field28371.removeLast();
        if (class8996 != null) {
            this.field28370.add(class8996);
        }
    }
    
    public Class8996 method22569() {
        return this.field28371.getLast();
    }
    
    public boolean method22570() {
        return this.field28371.size() == 1;
    }
    
    @Override
    public String toString() {
        return this.method22569().toString();
    }
}
