// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.LinkOption;
import javax.annotation.Nullable;
import java.io.BufferedReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Reader;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.nio.file.Files;
import java.nio.file.FileVisitOption;
import java.nio.file.Path;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class3688 implements Class3689
{
    private static final Logger field16995;
    private final Class7203 field16996;
    private final List<Class7420> field16997;
    
    public Class3688(final Class7203 field16996) {
        this.field16997 = Lists.newArrayList();
        this.field16996 = field16996;
    }
    
    public Class3688 method11335(final Class7420 class7420) {
        this.field16997.add(class7420);
        return this;
    }
    
    private Class51 method11336(final String s, final Class51 class51) {
        Class51 method22833 = class51;
        final Iterator<Class7420> iterator = this.field16997.iterator();
        while (iterator.hasNext()) {
            method22833 = iterator.next().method22833(s, method22833);
        }
        return method22833;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        this.field16996.method22099();
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Path> iterator = this.field16996.method22098().iterator();
        while (iterator.hasNext()) {
            Files.walk(iterator.next(), new FileVisitOption[0]).filter(path -> path.toString().endsWith(".snbt")).forEach(p2 -> list.add(CompletableFuture.supplyAsync(() -> this.method11340(path2, this.method11339(path3, path2)), Util.method27841())));
        }
        Util.method27853((List<? extends CompletableFuture<?>>)arrayList).join().stream().filter(Objects::nonNull).forEach(class8844 -> this.method11341(class8843, class8844, path4));
    }
    
    @Override
    public String method11338() {
        return "SNBT -> NBT";
    }
    
    private String method11339(final Path path, final Path path2) {
        final String replaceAll = path.relativize(path2).toString().replaceAll("\\\\", "/");
        return replaceAll.substring(0, replaceAll.length() - ".snbt".length());
    }
    
    @Nullable
    private Class7792 method11340(final Path path, final String s) {
        try (final BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            final String string = IOUtils.toString((Reader)bufferedReader);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Class8097.method26591(this.method11336(s, Class5704.method16938(string)), byteArrayOutputStream);
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            return new Class7792(s, byteArray, Class3688.field16998.hashBytes(byteArray).toString());
        }
        catch (final CommandSyntaxException ex) {
            Class3688.field16995.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", (Object)s, (Object)path, (Object)ex);
        }
        catch (final IOException ex2) {
            Class3688.field16995.error("Couldn't convert {} from SNBT to NBT at {}", (Object)s, (Object)path, (Object)ex2);
        }
        return null;
    }
    
    private void method11341(final Class8842 class8842, final Class7792 class8843, final Path path) {
        final Path resolve = path.resolve(Class7792.method25032(class8843) + ".nbt");
        try {
            if (!Objects.equals(class8842.method30884(resolve), Class7792.method25033(class8843)) || !Files.exists(resolve, new LinkOption[0])) {
                Files.createDirectories(resolve.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
                try (final OutputStream outputStream = Files.newOutputStream(resolve, new OpenOption[0])) {
                    outputStream.write(Class7792.method25034(class8843));
                }
            }
            class8842.method30885(resolve, Class7792.method25033(class8843));
        }
        catch (final IOException ex) {
            Class3688.field16995.error("Couldn't write structure {} at {}", (Object)Class7792.method25032(class8843), (Object)resolve, (Object)ex);
        }
    }
    
    static {
        field16995 = LogManager.getLogger();
    }
}
