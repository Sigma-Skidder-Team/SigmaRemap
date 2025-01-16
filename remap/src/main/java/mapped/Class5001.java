// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Class5001 extends Class4997<String>
{
    private List<String> field21518;
    private List<String> field21519;
    
    public Class5001(final String s, final String s2, final int n, final String... a) {
        super(s, s2, Class2076.field11984, a[n]);
        this.field21518 = new ArrayList<String>();
        this.field21519 = new ArrayList<String>();
        this.field21518 = Arrays.asList(a);
    }
    
    public Class5001(final String s, final String s2, final String s3, final String... a) {
        super(s, s2, Class2076.field11984, s3);
        this.field21518 = new ArrayList<String>();
        this.field21519 = new ArrayList<String>();
        this.field21518 = Arrays.asList(a);
    }
    
    public Class5001 method15211(final String... array) {
        return this;
    }
    
    @Override
    public boolean method15202() {
        return this.field21519.size() > 0;
    }
    
    @Override
    public void method15201() {
        this.field21519.clear();
    }
    
    public String method15212() {
        if (!this.field21519.contains(this.field21511)) {
            return super.method15198();
        }
        return (String)this.field21512;
    }
    
    public int method15213() {
        int n = 0;
        final Iterator<String> iterator = this.field21518.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(this.field21511)) {
                return n;
            }
            ++n;
        }
        return 0;
    }
    
    public void method15214(final int n) {
        if (n > this.field21518.size()) {
            return;
        }
        if (this.field21519.contains(this.field21518.get(n)) && Minecraft.method5277() != null) {
            Class9463.method35173().method35197().method25776(new Class6224("Premium", "Not yet available for free version"));
            return;
        }
        this.method15199(this.field21518.get(n));
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.field21511 = (T)Class8105.method26636(class4405, "value", this.method15203());
        int n = 0;
        final Iterator<String> iterator = this.field21518.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(this.field21511)) {
                continue;
            }
            n = 1;
        }
        if (n == 0) {
            this.field21511 = (T)this.method15203();
        }
        return class4405;
    }
    
    public List<String> method15215() {
        return this.field21518;
    }
}
