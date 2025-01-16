// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class Class4437 implements Comparator<RealmsServer>
{
    private static String[] field19772;
    private final String field19773;
    
    public Class4437(final String field19773) {
        this.field19773 = field19773;
    }
    
    @Override
    public int compare(final RealmsServer class7437, final RealmsServer class7438) {
        return ComparisonChain.start().compareTrueFirst(class7437.state.equals(RealmsServer.Status.field12793), class7438.state.equals(RealmsServer.Status.field12793)).compareTrueFirst(class7437.field28685, class7438.field28685).compareTrueFirst(class7437.field28680.equals(this.field19773), class7438.field28680.equals(this.field19773)).compareFalseFirst(class7437.field28684, class7438.field28684).compareTrueFirst(class7437.state.equals(RealmsServer.Status.OPEN), class7438.state.equals(RealmsServer.Status.OPEN)).compare(class7437.id, class7438.id).result();
    }
}
