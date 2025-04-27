// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;

import java.nio.file.Path;
import com.google.common.collect.Multimap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.io.IOException;
import java.util.Set;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class3690 implements Class3689
{
    private static final Logger field16999;
    private static final Gson field17000;
    private final Class7203 field17001;
    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Class4947>>>, Class8212>> field17002;
    
    public Class3690(final Class7203 field17001) {
        this.field17002 = (List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Class4947>>>, Class8212>>)ImmutableList.of(Pair.of((Object)Class5915::new, (Object)Class7104.field27714), Pair.of((Object)Class5907::new, (Object)Class7104.field27711), Pair.of((Object)Class5913::new, (Object)Class7104.field27715), Pair.of((Object)Class5906::new, (Object)Class7104.field27719), (Object)Pair.of((Object)Class5912::new, (Object)Class7104.field27716));
        this.field17001 = field17001;
    }
    
    @Override
    public void method11337(final Class8842 class8842) {
        this.field17001.method22099();
        throw new IllegalStateException("Failed to validate loot tables, see logs");
    }
    
    private static Path method11347(final Path path, final ResourceLocation class1932) {
        return path.resolve("data/" + class1932.method7798() + "/loot_tables/" + class1932.method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "LootTables";
    }
    
    static {
        field16999 = LogManager.getLogger();
        field17000 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    }
}
