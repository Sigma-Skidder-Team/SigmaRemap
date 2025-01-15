// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Arrays;

public class Class5059 extends Class5056<Class625>
{
    public final /* synthetic */ Class5073 field21708;
    
    public Class5059(final Class5073 field21708) {
        this.field21708 = field21708;
        super(field21708.method15421(), field21708.method15422(), 32, field21708.method15422() - 40, 36);
    }
    
    public void method15542(final int n) {
        this.method15512(n);
    }
    
    @Override
    public int method15523() {
        return this.method15521() * 36;
    }
    
    @Override
    public int method15531() {
        return 260;
    }
    
    @Override
    public boolean method15532() {
        return this.field21708.method15447(this);
    }
    
    @Override
    public void method15522() {
        this.field21708.method15413();
    }
    
    @Override
    public void method15533(final int n) {
        this.method15519(n);
        if (n != -1) {
            final List<Class625> method15535 = Class5073.method15664(this.field21708).method15535();
            final Class7442 field3604 = method15535.get(n).field3604;
            Class7847.method25381(Class5046.method15439("narrator.select", Class7847.method25385(Arrays.asList(field3604.field28704, field3604.field28705, Class5073.method15661(field3604), Class5046.method15439("narrator.select.list.position", n + 1, method15535.size())))));
        }
        this.method15543(n);
    }
    
    public void method15543(final int n) {
        Class5073.method15667(this.field21708, n);
        Class5073.method15668(this.field21708);
    }
}
