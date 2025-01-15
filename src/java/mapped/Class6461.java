// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class Class6461 implements Class6459
{
    private static String[] field25672;
    private final Class6460 field25673;
    private final Long2ObjectOpenHashMap<Class9312> field25674;
    private Class7859 field25675;
    private final int field25676;
    private final int field25677;
    private final int field25678;
    private boolean field25679;
    
    public Class6461(final int n) {
        this.field25675 = new Class7859(0, 0);
        this.field25673 = new Class6460(n);
        this.field25676 = n * 2 + 1;
        this.field25677 = n + Class9312.method34440();
        this.field25678 = this.field25677 * 2 + 1;
        this.field25674 = (Long2ObjectOpenHashMap<Class9312>)new Long2ObjectOpenHashMap();
    }
    
    @Override
    public void method19317(final Class7859 field25675) {
        if (this.field25679) {
            this.field25673.method19317(field25675);
            this.field25675 = field25675;
        }
    }
    
    @Override
    public void method19318(final Class7859 class7859, final Class9312 class7860) {
        if (this.field25679) {
            this.field25673.method19318(class7859, class7860);
            if (class7860 != null) {
                this.field25674.put(class7859.method25422(), (Object)class7860);
            }
            else {
                this.field25674.remove(class7859.method25422());
            }
        }
    }
    
    public void method19323() {
        this.field25679 = true;
        this.field25674.clear();
    }
    
    @Override
    public void method19319() {
        this.field25679 = false;
        this.field25673.method19319();
    }
    
    public int method19324() {
        return this.field25676;
    }
    
    public int method19325() {
        return this.field25678;
    }
    
    public int method19326() {
        return this.field25673.method19322();
    }
    
    @Nullable
    public Class9312 method19327(final int n, final int n2) {
        return (Class9312)this.field25674.get(Class7859.method25423(n + this.field25675.field32290 - this.field25677, n2 + this.field25675.field32291 - this.field25677));
    }
}
