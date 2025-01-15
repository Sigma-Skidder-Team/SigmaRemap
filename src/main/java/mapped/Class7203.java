// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import java.util.List;
import java.nio.file.Path;
import java.util.Collection;
import org.apache.logging.log4j.Logger;

public class Class7203
{
    private static final Logger field27984;
    private final Collection<Path> field27985;
    private final Path field27986;
    private final List<Class3689> field27987;
    
    public Class7203(final Path field27986, final Collection<Path> field27987) {
        this.field27987 = Lists.newArrayList();
        this.field27986 = field27986;
        this.field27985 = field27987;
    }
    
    public Collection<Path> method22098() {
        return this.field27985;
    }
    
    public Path method22099() {
        return this.field27986;
    }
    
    public void run() throws IOException {
        final Class8842 class8842 = new Class8842(this.field27986, "cache");
        class8842.method30887(this.method22099().resolve("version.json"));
        final Stopwatch started = Stopwatch.createStarted();
        final Stopwatch unstarted = Stopwatch.createUnstarted();
        for (final Class3689 class8843 : this.field27987) {
            Class7203.field27984.info("Starting provider: {}", (Object)class8843.method11338());
            unstarted.start();
            class8843.method11337(class8842);
            unstarted.stop();
            Class7203.field27984.info("{} finished after {} ms", (Object)class8843.method11338(), (Object)unstarted.elapsed(TimeUnit.MILLISECONDS));
            unstarted.reset();
        }
        Class7203.field27984.info("All providers took: {} ms", (Object)started.elapsed(TimeUnit.MILLISECONDS));
        class8842.method30883();
    }
    
    public void method22100(final Class3689 class3689) {
        this.field27987.add(class3689);
    }
    
    static {
        field27984 = LogManager.getLogger();
        Class9280.method34254();
    }
}
