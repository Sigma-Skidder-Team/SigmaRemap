// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util2.Direction;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.Collection;

public class Class7115 extends Class7114<Direction>
{
    private static String[] field27745;
    
    public Class7115(final String s, final Collection<Direction> collection) {
        super(s, Direction.class, collection);
    }
    
    public static Class7115 method21841(final String s, final Predicate<Direction> predicate) {
        return method21843(s, (Collection<Direction>)Arrays.stream(Direction.values()).filter(predicate).collect((Collector<? super Direction, ?, List<? super Direction>>)Collectors.toList()));
    }
    
    public static Class7115 method21842(final String s, final Direction... array) {
        return method21843(s, Lists.newArrayList((Object[])array));
    }
    
    public static Class7115 method21843(final String s, final Collection<Direction> collection) {
        return new Class7115(s, collection);
    }
}
