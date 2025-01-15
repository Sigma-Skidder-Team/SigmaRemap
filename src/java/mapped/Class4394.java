// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.util.List;

public class Class4394 implements Class4252<Class5800>
{
    private static String[] field19676;
    private double field19677;
    private double field19678;
    private double field19679;
    private float field19680;
    private List<Class354> field19681;
    public float field19682;
    public float field19683;
    public float field19684;
    
    public Class4394() {
    }
    
    public Class4394(final double field19677, final double field19678, final double field19679, final float field19680, final List<Class354> list, final Class5487 class5487) {
        this.field19677 = field19677;
        this.field19678 = field19678;
        this.field19679 = field19679;
        this.field19680 = field19680;
        this.field19681 = Lists.newArrayList((Iterable)list);
        if (class5487 != null) {
            this.field19682 = (float)class5487.field22770;
            this.field19683 = (float)class5487.field22771;
            this.field19684 = (float)class5487.field22772;
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19677 = class8654.readFloat();
        this.field19678 = class8654.readFloat();
        this.field19679 = class8654.readFloat();
        this.field19680 = class8654.readFloat();
        final int int1 = class8654.readInt();
        this.field19681 = Lists.newArrayListWithCapacity(int1);
        final int method35644 = Class9546.method35644(this.field19677);
        final int method35645 = Class9546.method35644(this.field19678);
        final int method35646 = Class9546.method35644(this.field19679);
        for (int i = 0; i < int1; ++i) {
            this.field19681.add(new Class354(class8654.readByte() + method35644, class8654.readByte() + method35645, class8654.readByte() + method35646));
        }
        this.field19682 = class8654.readFloat();
        this.field19683 = class8654.readFloat();
        this.field19684 = class8654.readFloat();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeFloat((float)this.field19677);
        class8654.writeFloat((float)this.field19678);
        class8654.writeFloat((float)this.field19679);
        class8654.writeFloat(this.field19680);
        class8654.writeInt(this.field19681.size());
        final int method35644 = Class9546.method35644(this.field19677);
        final int method35645 = Class9546.method35644(this.field19678);
        final int method35646 = Class9546.method35644(this.field19679);
        for (final Class354 class8655 : this.field19681) {
            final int n = class8655.method1074() - method35644;
            final int n2 = class8655.method1075() - method35645;
            final int n3 = class8655.method1076() - method35646;
            class8654.writeByte(n);
            class8654.writeByte(n2);
            class8654.writeByte(n3);
        }
        class8654.writeFloat(this.field19682);
        class8654.writeFloat(this.field19683);
        class8654.writeFloat(this.field19684);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17306(this);
    }
    
    public float method13211() {
        return this.field19682;
    }
    
    public float method13212() {
        return this.field19683;
    }
    
    public float method13213() {
        return this.field19684;
    }
    
    public double method13214() {
        return this.field19677;
    }
    
    public double method13215() {
        return this.field19678;
    }
    
    public double method13216() {
        return this.field19679;
    }
    
    public float method13217() {
        return this.field19680;
    }
    
    public List<Class354> method13218() {
        return this.field19681;
    }
}
