// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;
import java.util.List;

public class Class7897
{
    private static String[] field32408;
    private final List<Pair<Predicate<BlockState>, Class6313>> field32409;
    
    public Class7897() {
        this.field32409 = Lists.newArrayList();
    }
    
    public void method25563(final Predicate<BlockState> predicate, final Class6313 class6313) {
        this.field32409.add((Pair<Predicate<BlockState>, Class6313>)Pair.of((Object)predicate, (Object)class6313));
    }
    
    public Class6313 method25564() {
        return new Class6318(this.field32409);
    }
}
