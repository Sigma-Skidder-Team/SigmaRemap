// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;

import java.io.BufferedWriter;
import java.nio.file.Path;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Optional;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public abstract class Class3693<T> implements Class3689
{
    private static final Logger field17008;
    private static final Gson field17009;
    public final Class7203 field17010;
    public final Registry<T> field17011;
    public final Map<Class7909<T>, Class8162<T>> field17012;
    
    public Class3693(final Class7203 field17010, final Registry<T> field17011) {
        this.field17012 = Maps.newLinkedHashMap();
        this.field17010 = field17010;
        this.field17011 = field17011;
    }
    
    public abstract void method11365();
    
    @Override
    public void method11337(final Class8842 class8842) {
        this.field17012.clear();
        this.method11365();
        final Class6208 class8843 = new Class6208(p0 -> Optional.empty(), "", false, "generated");
        class8843.method18465(this.field17012.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey().method25621(), (Function<? super Object, ?>)Map.Entry::getValue)));
        class8843.method18467().forEach((class8846, class8847) -> {
            class8847.method25619(this.field17011::getKey);
            this.method11367(class8846);
            try {
                final JsonElement jsonElement;
                Class3693.field17009.toJson(jsonElement);
                final String str;
                Class3693.field16998.hashUnencodedChars((CharSequence)str).toString();
                final Path path;
                final String b;
                if (!Objects.equals(class8845.method30884(path), b) || !Files.exists(path, new LinkOption[0])) {
                    Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
                    Files.newBufferedWriter(path, new OpenOption[0]);
                    try {
                        final BufferedWriter bufferedWriter;
                        bufferedWriter.write(str);
                    }
                    catch (final Throwable t2) {
                        throw t2;
                    }
                    finally {
                        final BufferedWriter bufferedWriter;
                        if (bufferedWriter != null) {
                            final Throwable t3;
                            if (t3 != null) {
                                try {
                                    bufferedWriter.close();
                                }
                                catch (final Throwable exception) {
                                    t3.addSuppressed(exception);
                                }
                            }
                            else {
                                bufferedWriter.close();
                            }
                        }
                    }
                }
                class8845.method30885(path, b);
            }
            catch (final IOException ex) {
                final Path path;
                Class3693.field17008.error("Couldn't save tags to {}", (Object)path, (Object)ex);
            }
            return;
        });
        this.method11366(class8843);
    }
    
    public abstract void method11366(final Class6208<T> p0);
    
    public abstract Path method11367(final ResourceLocation p0);
    
    public Class8162<T> method11368(final Class7909<T> key) {
        return this.field17012.computeIfAbsent(key, p0 -> Class8162.method26975());
    }
    
    static {
        field17008 = LogManager.getLogger();
        field17009 = new GsonBuilder().setPrettyPrinting().create();
    }
}
