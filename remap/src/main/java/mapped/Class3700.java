// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.file.Path;
import java.io.IOException;
import com.google.common.collect.Sets;
import java.util.function.Consumer;

public class Class3700 implements Class3689
{
    private final Class7203 field17020;
    
    public Class3700(final Class7203 field17020) {
        this.field17020 = field17020;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        final Consumer consumer = class8844 -> {
            Sets.newHashSet();
            this.field17020.method22099();
        };
    }
    
    private static Path method11375(final Path path, final Class8863 class8863) {
        return path.resolve("data/" + class8863.method31042().method7798() + "/advancements/" + class8863.method31042().method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "Advancements";
    }
}
