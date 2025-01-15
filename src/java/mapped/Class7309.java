// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Writer;
import com.google.common.collect.Lists;
import java.util.List;

public class Class7309
{
    private static String[] field28291;
    private final List<String> field28292;
    
    public Class7309() {
        this.field28292 = Lists.newArrayList();
    }
    
    public Class7309 method22417(final String s) {
        this.field28292.add(s);
        return this;
    }
    
    public Class8308 method22418(final Writer writer) throws IOException {
        return new Class8308(writer, this.field28292, null);
    }
}
