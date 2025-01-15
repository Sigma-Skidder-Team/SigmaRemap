// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class6467
{
    private static String[] field25698;
    private int field25699;
    private final List<Class1932> field25700;
    private final List<Class1932> field25701;
    private Class1932 field25702;
    
    public Class6467() {
        this.field25700 = Lists.newArrayList();
        this.field25701 = Lists.newArrayList();
    }
    
    public static Class6467 method19353(final int n) {
        return new Class6467().method19354(n);
    }
    
    public Class6467 method19354(final int n) {
        this.field25699 += n;
        return this;
    }
    
    public static Class6467 method19355(final Class1932 class1932) {
        return new Class6467().method19356(class1932);
    }
    
    public Class6467 method19356(final Class1932 class1932) {
        this.field25701.add(class1932);
        return this;
    }
    
    public Class9032 method19357() {
        return new Class9032(this.field25699, this.field25700.toArray(new Class1932[0]), this.field25701.toArray(new Class1932[0]), (this.field25702 != null) ? new Class9360(this.field25702) : Class9360.field40145);
    }
}
