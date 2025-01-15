// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.io.BufferedWriter;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.OpenOption;
import java.io.IOException;
import java.util.Iterator;
import java.nio.file.Files;
import java.nio.file.FileVisitOption;
import java.nio.file.Path;
import org.apache.logging.log4j.Logger;

public class Class3701 implements Class3689
{
    private static final Logger field17022;
    private final Class7203 field17023;
    
    public Class3701(final Class7203 field17023) {
        this.field17023 = field17023;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        this.field17023.method22099();
        final Iterator<Path> iterator = this.field17023.method22098().iterator();
        while (iterator.hasNext()) {
            Files.walk(iterator.next(), new FileVisitOption[0]).filter(path -> path.toString().endsWith(".nbt")).forEach(path4 -> method11378(path4, this.method11377(path2, path4), path3));
        }
    }
    
    @Override
    public String method11338() {
        return "NBT to SNBT";
    }
    
    private String method11377(final Path path, final Path path2) {
        final String replaceAll = path.relativize(path2).toString().replaceAll("\\\\", "/");
        return replaceAll.substring(0, replaceAll.length() - ".nbt".length());
    }
    
    @Nullable
    public static Path method11378(final Path path, final String str, final Path path2) {
        try {
            final String string = Class8097.method26590(Files.newInputStream(path, new OpenOption[0])).method263("    ", 0).getString() + "\n";
            final Path resolve = path2.resolve(str + ".snbt");
            Files.createDirectories(resolve.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
            try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(resolve, new OpenOption[0])) {
                bufferedWriter.write(string);
            }
            Class3701.field17022.info("Converted {} from NBT to SNBT", (Object)str);
            return resolve;
        }
        catch (final IOException ex) {
            Class3701.field17022.error("Couldn't convert {} from NBT to SNBT at {}", (Object)str, (Object)path, (Object)ex);
            return null;
        }
    }
    
    static {
        field17022 = LogManager.getLogger();
    }
}
