// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class Class4437 implements Comparator<Class7437>
{
    private static String[] field19772;
    private final String field19773;
    
    public Class4437(final String field19773) {
        this.field19773 = field19773;
    }
    
    @Override
    public int compare(final Class7437 class7437, final Class7437 class7438) {
        return ComparisonChain.start().compareTrueFirst(class7437.field28679.equals(Class2153.field12793), class7438.field28679.equals(Class2153.field12793)).compareTrueFirst(class7437.field28685, class7438.field28685).compareTrueFirst(class7437.field28680.equals(this.field19773), class7438.field28680.equals(this.field19773)).compareFalseFirst(class7437.field28684, class7438.field28684).compareTrueFirst(class7437.field28679.equals(Class2153.field12792), class7438.field28679.equals(Class2153.field12792)).compare(class7437.field28675, class7438.field28675).result();
    }
}
