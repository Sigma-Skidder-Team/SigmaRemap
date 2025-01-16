// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.function.Predicate;
import com.google.common.base.Splitter;

public class Class7412 implements Class7410
{
    private static final Splitter field28548;
    private final String field28549;
    private final String field28550;
    
    public Class7412(final String field28549, final String field28550) {
        this.field28549 = field28549;
        this.field28550 = field28550;
    }
    
    @Override
    public Predicate<BlockState> method22768(final StateContainer<Block, BlockState> class9104) {
        final IProperty<?> method32906 = class9104.getProperty(this.field28549);
        if (method32906 == null) {
            throw new RuntimeException(String.format("Unknown property '%s' on '%s'", this.field28549, class9104.method32904().toString()));
        }
        String s = this.field28550;
        final boolean b = !s.isEmpty() && s.charAt(0) == '!';
        if (b) {
            s = s.substring(1);
        }
        final List list2 = Class7412.field28548.splitToList((CharSequence)s);
        if (!list2.isEmpty()) {
            Predicate<BlockState> method32907;
            if (list2.size() != 1) {
                method32907 = (p1 -> {
                    final List list2;
                    final Object o = list2.stream().map(p2 -> {}).collect(Collectors.toList());
                    return list.stream().anyMatch(predicate -> predicate.test(class9105));
                });
            }
            else {
                method32907 = this.method22776(class9104, method32906, s);
            }
            return b ? method32907.negate() : method32907;
        }
        throw new RuntimeException(String.format("Empty value '%s' for property '%s' on '%s'", this.field28550, this.field28549, class9104.method32904().toString()));
    }
    
    private Predicate<BlockState> method22776(final StateContainer<Block, BlockState> class9104, final IProperty<?> class9105, final String s) {
        if (class9105.parseValue(s).isPresent()) {
            return class9107 -> class9107.get((IProperty<Object>)class9106).equals(optional.get());
        }
        throw new RuntimeException(String.format("Unknown value '%s' for property '%s' on '%s' in '%s'", s, this.field28549, class9104.method32904().toString(), this.field28550));
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("key", (Object)this.field28549).add("value", (Object)this.field28550).toString();
    }
    
    static {
        field28548 = Splitter.on('|').omitEmptyStrings();
    }
}
