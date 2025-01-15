// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

public class Class715 extends Class698
{
    private Class527 field3904;
    private String field3905;
    private String field3906;
    private final List<String> field3907;
    public String field3908;
    private int field3909;
    
    public Class715(final Class527 field3904, final String field3905, final String field3906) {
        super(new Class2259("of.options.detailsTitle", new Object[0]));
        this.field3907 = Lists.newArrayList();
        this.field3904 = field3904;
        this.field3905 = field3905;
        this.field3906 = field3906;
        this.field3908 = Class8822.method30773("gui.done", new Object[0]);
    }
    
    @Override
    public void method2969() {
        this.method3029(new Class673(0, this.field3152 / 2 - 100, this.field3153 / 6 + 96, this.field3908));
        this.field3907.clear();
        this.field3907.addAll(this.field3150.field4643.method6626(this.field3906, this.field3152 - 50));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        Class8571.method28894().method5244(this.field3904);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3843, this.field3905, this.field3152 / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.field3907.iterator();
        while (iterator.hasNext()) {
            this.method3295(this.field3843, iterator.next(), this.field3152 / 2, n4, 16777215);
            n4 += 9;
        }
        super.method2975(n, n2, n3);
    }
    
    public void method3933(final int field3909) {
        this.field3909 = field3909;
        final Iterator<Class573> iterator = this.field3842.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3431 = false;
        }
    }
    
    @Override
    public void method2992() {
        super.method2992();
        final int field3909 = this.field3909 - 1;
        this.field3909 = field3909;
        if (field3909 == 0) {
            final Iterator<Class573> iterator = this.field3842.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
}
