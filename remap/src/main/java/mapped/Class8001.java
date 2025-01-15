// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Locale;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.spi.FileSystemProvider;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import org.apache.logging.log4j.Logger;

public class Class8001
{
    private static final Logger field32952;
    private static final SimpleCommandExceptionType field32953;
    private static final SimpleCommandExceptionType field32954;
    private static final FileSystemProvider field32955;
    
    public static void method26175(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("debug").requires(class7492 -> class7492.method23210(3))).then(Class7788.method25001("start").executes(commandContext -> method26176((Class7492)commandContext.getSource())))).then(Class7788.method25001("stop").executes(commandContext -> method26177((Class7492)commandContext.getSource())))).then(Class7788.method25001("report").executes(commandContext -> method26178((Class7492)commandContext.getSource()))));
    }
    
    private static int method26176(final Class7492 class7492) throws CommandSyntaxException {
        final MinecraftServer method23255 = class7492.method23255();
        if (!method23255.method1590().method15305().method19593()) {
            method23255.method1546();
            class7492.method23257(new Class2259("commands.debug.started", new Object[] { "Started the debug profiler. Type '/debug stop' to stop it." }), true);
            return 0;
        }
        throw Class8001.field32954.create();
    }
    
    private static int method26177(final Class7492 class7492) throws CommandSyntaxException {
        final MinecraftServer method23255 = class7492.method23255();
        final Class5029 method23256 = method23255.method1590();
        if (method23256.method15305().method19593()) {
            final Class5756 method23257 = method23256.method15305().method19594();
            method23257.method17091(new File(method23255.method1478("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt"));
            final float f = method23257.method17106() / 1.0E9f;
            final float f2 = method23257.method17098() / f;
            class7492.method23257(new Class2259("commands.debug.stopped", new Object[] { String.format(Locale.ROOT, "%.2f", f), method23257.method17098(), String.format("%.2f", f2) }), true);
            return MathHelper.method35642(f2);
        }
        throw Class8001.field32953.create();
    }
    
    private static int method26178(final Class7492 class7492) {
        final MinecraftServer method23255 = class7492.method23255();
        final String string = "debug-report-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());
        try {
            final Path path = method23255.method1478("debug").toPath();
            Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
            if (!Class9528.field41021 && Class8001.field32955 != null) {
                try (final FileSystem fileSystem = Class8001.field32955.newFileSystem(path.resolve(string + ".zip"), (Map<String, ?>)ImmutableMap.of((Object)"create", (Object)"true"))) {
                    method23255.method1593(fileSystem.getPath("/", new String[0]));
                }
            }
            else {
                method23255.method1593(path.resolve(string));
            }
            class7492.method23257(new Class2259("commands.debug.reportSaved", new Object[] { string }), false);
            return 1;
        }
        catch (final IOException ex) {
            Class8001.field32952.error("Failed to save debug dump", (Throwable)ex);
            class7492.method23259(new Class2259("commands.debug.reportFailed", new Object[0]));
            return 0;
        }
    }
    
    static {
        field32952 = LogManager.getLogger();
        field32953 = new SimpleCommandExceptionType((Message)new Class2259("commands.debug.notRunning", new Object[0]));
        field32954 = new SimpleCommandExceptionType((Message)new Class2259("commands.debug.alreadyRunning", new Object[0]));
        field32955 = FileSystemProvider.installedProviders().stream().filter(fileSystemProvider -> fileSystemProvider.getScheme().equalsIgnoreCase("jar")).findFirst().orElse(null);
    }
}
