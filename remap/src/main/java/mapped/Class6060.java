// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.function.Function;

public class Class6060<T> implements Class6058<T>
{
    private static String[] field24631;
    private final Class94<T> field24632;
    private final Class95<T> field24633;
    private final Class7876<T> field24634;
    private final Function<Class51, T> field24635;
    private final Function<T, Class51> field24636;
    private final int field24637;
    
    public Class6060(final Class94<T> field24632, final int field24633, final Class7876<T> field24634, final Function<Class51, T> field24635, final Function<T, Class51> field24636) {
        this.field24632 = field24632;
        this.field24637 = field24633;
        this.field24634 = field24634;
        this.field24635 = field24635;
        this.field24636 = field24636;
        this.field24633 = new Class95<T>(1 << field24633);
    }
    
    @Override
    public int method18026(final T t) {
        int n = this.field24633.method565(t);
        if (n == -1) {
            n = this.field24633.method567(t);
            if (n >= 1 << this.field24637) {
                n = this.field24634.method25502(this.field24637 + 1, t);
            }
        }
        return n;
    }
    
    @Override
    public boolean method18027(final T t) {
        return this.field24633.method565(t) != -1;
    }
    
    @Nullable
    @Override
    public T method18028(final int n) {
        return this.field24633.method499(n);
    }
    
    @Override
    public void method18029(final Class8654 class8654) {
        this.field24633.method574();
        for (int method29501 = class8654.method29501(), i = 0; i < method29501; ++i) {
            this.field24633.method567(this.field24632.method499(class8654.method29501()));
        }
    }
    
    @Override
    public void method18030(final Class8654 class8654) {
        final int method18034 = this.method18034();
        class8654.method29505(method18034);
        for (int i = 0; i < method18034; ++i) {
            class8654.method29505(this.field24632.method563(this.field24633.method499(i)));
        }
    }
    
    @Override
    public int method18031() {
        int method29484 = Class8654.method29484(this.method18034());
        for (int i = 0; i < this.method18034(); ++i) {
            method29484 += Class8654.method29484(this.field24632.method563(this.field24633.method499(i)));
        }
        return method29484;
    }
    
    public int method18034() {
        return this.field24633.method575();
    }
    
    @Override
    public void method18032(final Class52 class52) {
        this.field24633.method574();
        for (int i = 0; i < class52.size(); ++i) {
            this.field24633.method567(this.field24635.apply(class52.method346(i)));
        }
    }
    
    public void method18035(final Class52 class52) {
        for (int i = 0; i < this.method18034(); ++i) {
            ((AbstractList<Class51>)class52).add(this.field24636.apply(this.field24633.method499(i)));
        }
    }
}
