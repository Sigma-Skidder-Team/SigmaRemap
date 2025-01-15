// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5875<T extends Class853> extends Class5846<T>
{
    private static String[] field24081;
    private final Class6300[] field24082;
    private final Class6300 field24083;
    private final ImmutableList<Class6300> field24084;
    
    public Class5875() {
        this.field24082 = new Class6300[8];
        for (int i = 0; i < this.field24082.length; ++i) {
            int n = 0;
            int n2;
            if ((n2 = i) != 2) {
                if (i == 3) {
                    n = 24;
                    n2 = 19;
                }
            }
            else {
                n = 24;
                n2 = 10;
            }
            (this.field24082[i] = new Class6300(this, n, n2)).method18636(-4.0f, (float)(16 + i), -4.0f, 8.0f, 1.0f, 8.0f);
        }
        (this.field24083 = new Class6300(this, 0, 16)).method18636(-2.0f, 18.0f, -2.0f, 4.0f, 4.0f, 4.0f);
        final ImmutableList$Builder builder = ImmutableList.builder();
        builder.add((Object)this.field24083);
        builder.addAll((Iterable)Arrays.asList(this.field24082));
        this.field24084 = (ImmutableList<Class6300>)builder.build();
    }
    
    public void method17619(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
    }
    
    public void method17620(final T t, final float n, final float n2, final float n3) {
        float method35700 = MathHelper.method35700(n3, t.field4559, t.field4558);
        if (method35700 < 0.0f) {
            method35700 = 0.0f;
        }
        for (int i = 0; i < this.field24082.length; ++i) {
            this.field24082[i].field25181 = -(4 - i) * method35700 * 1.7f;
        }
    }
    
    public ImmutableList<Class6300> method17611() {
        return this.field24084;
    }
}
