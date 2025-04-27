// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Set;
import java.nio.file.Path;
import java.util.Iterator;
import java.io.IOException;
import com.google.gson.JsonElement;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList;
import java.util.function.Consumer;
import java.util.List;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class3700 implements Class3689
{
    private static final Logger field17018;
    private static final Gson field17019;
    private final Class7203 field17020;
    private final List<Consumer<Consumer<Class8863>>> field17021;
    
    public Class3700(final Class7203 field17020) {
        this.field17021 = (List<Consumer<Consumer<Class8863>>>)ImmutableList.of(new Class5909(), new Class5914(), new Class5908(), new Class5910(), (Object)new Class5911());
        this.field17020 = field17020;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        final Consumer consumer = class8844 -> {
            Sets.newHashSet();
            this.field17020.method22099();
            if (!set.add(class8844.method31042())) {
                new IllegalStateException("Duplicate advancement " + class8844.method31042());
                throw
            }
            else {
                method11375(path, class8844);
                try {
                    final Path path2;
                    Class3689.method11346(Class3700.field17019, class8843, (JsonElement)class8844.method31034().method18015(), path2);
                }
                catch (final IOException ex2) {
                    final Path path2;
                    Class3700.field17018.error("Couldn't save advancement {}", path2, ex2);
                }
            }
        };
        final Iterator<Consumer<Consumer<Class8863>>> iterator = this.field17021.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(consumer);
        }
    }
    
    private static Path method11375(final Path path, final Class8863 class8863) {
        return path.resolve("data/" + class8863.method31042().method7798() + "/advancements/" + class8863.method31042().method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "Advancements";
    }
    
    static {
        field17018 = LogManager.getLogger();
        field17019 = new GsonBuilder().setPrettyPrinting().create();
    }
}
