// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.StringEscapeUtils;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.List;
import java.io.Writer;

public class Class8308
{
    private final Writer field34141;
    private final int field34142;
    
    private Class8308(final Writer field34141, final List<String> list) throws IOException {
        this.field34141 = field34141;
        this.field34142 = list.size();
        this.method27596(list.stream());
    }
    
    public static Class7309 method27594() {
        return new Class7309();
    }
    
    public void method27595(final Object... values) throws IOException {
        if (values.length == this.field34142) {
            this.method27596(Stream.of(values));
            return;
        }
        throw new IllegalArgumentException("Invalid number of columns, expected " + this.field34142 + ", but got " + values.length);
    }
    
    private void method27596(final Stream<?> stream) throws IOException {
        this.field34141.write(stream.map((Function<?, ?>)Class8308::method27597).collect((Collector<? super Object, ?, String>)Collectors.joining(",")) + "\r\n");
    }
    
    private static String method27597(final Object o) {
        return StringEscapeUtils.escapeCsv((o == null) ? "[null]" : o.toString());
    }
}
