// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import java.nio.file.OpenOption;
import java.io.Reader;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.Style;
import org.apache.commons.io.IOUtils;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.Collection;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import java.util.Collections;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class7321
{
    public static void method22439(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("test").then(Class7788.method25001("runthis").executes(commandContext -> method22442((Class7492)commandContext.getSource())))).then(Class7788.method25001("runthese").executes(commandContext -> method22443((Class7492)commandContext.getSource())))).then(Class7788.method25001("run").then(Class7788.method25002("testName", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8487.method28341()).executes(commandContext -> method22447((Class7492)commandContext.getSource(), Class8487.method28342((CommandContext<Class7492>)commandContext, "testName")))))).then(((LiteralArgumentBuilder)Class7788.method25001("runall").executes(commandContext -> method22449((Class7492)commandContext.getSource()))).then(Class7788.method25002("testClassName", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8894.method31306()).executes(commandContext -> method22450((Class7492)commandContext.getSource(), Class8894.method31307((CommandContext<Class7492>)commandContext, "testClassName")))))).then(Class7788.method25001("export").then(Class7788.method25002("testName", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method22453((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "testName")))))).then(Class7788.method25001("import").then(Class7788.method25002("testName", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method22454((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "testName")))))).then(((LiteralArgumentBuilder)Class7788.method25001("pos").executes(commandContext -> method22441((Class7492)commandContext.getSource(), "pos"))).then(Class7788.method25002("var", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method22441((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "var")))))).then(Class7788.method25001("create").then(((RequiredArgumentBuilder)Class7788.method25002("testName", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method22440((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "testName"), 5, 5, 5))).then(((RequiredArgumentBuilder)Class7788.method25002("width", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method22440((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "testName"), IntegerArgumentType.getInteger(commandContext, "width"), IntegerArgumentType.getInteger(commandContext, "width"), IntegerArgumentType.getInteger(commandContext, "width")))).then(Class7788.method25002("height", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).then(Class7788.method25002("depth", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method22440((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "testName"), IntegerArgumentType.getInteger(commandContext, "width"), IntegerArgumentType.getInteger(commandContext, "height"), IntegerArgumentType.getInteger(commandContext, "depth"))))))))).then(((LiteralArgumentBuilder)Class7788.method25001("clearall").executes(commandContext -> method22446((Class7492)commandContext.getSource(), 200))).then(Class7788.method25002("radius", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method22446((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "radius"))))));
    }
    
    private static int method22440(final Class7492 class7492, final String s, final int n, final int n2, final int n3) {
        if (n <= 32) {
            if (n2 <= 32) {
                if (n3 <= 32) {
                    final Class1849 method23250 = class7492.method23250();
                    final BlockPos class7493 = new BlockPos(class7492.method23249());
                    final BlockPos class7494 = new BlockPos(class7493.getX(), class7492.method23250().method6958(Class2020.field11522, class7493).getY(), class7493.getZ() + 3);
                    Class8787.method30575(s.toLowerCase(), class7494, new BlockPos(n, n2, n3), 2, method23250);
                    for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < n3; ++j) {
                            new Class118(Class7521.field29154.getDefaultState(), Collections.EMPTY_SET, null).method610(method23250, new BlockPos(class7494.getX() + i, class7494.getY() + 1, class7494.getZ() + j), 2);
                        }
                    }
                    Class8787.method30574(class7494.add(1, 0, -1), method23250);
                    return 0;
                }
            }
        }
        throw new IllegalArgumentException("The structure must be less than 32 blocks big in each axis");
    }
    
    private static int method22441(final Class7492 class7492, final String str) throws CommandSyntaxException {
        final BlockPos method21447 = ((BlockRayTraceResult)class7492.method23253().method1748(10.0, 1.0f, false)).method21447();
        final Class1849 method21448 = class7492.method23250();
        Optional<BlockPos> optional = Class8787.method30580(method21447, 15, method21448);
        if (!optional.isPresent()) {
            optional = Class8787.method30580(method21447, 200, method21448);
        }
        if (optional.isPresent()) {
            final Class501 class7493 = (Class501)method21448.getTileEntity(optional.get());
            final BlockPos method21449 = method21447.method1136(optional.get());
            final String string = method21449.getX() + ", " + method21449.getY() + ", " + method21449.getZ();
            class7492.method23257(new StringTextComponent("Position relative to " + class7493.method2555() + ": ").appendSibling(new StringTextComponent(string).setStyle(new Style().setBold(true).setColor(TextFormatting.GREEN).method30420(new Class9390(Class1961.field10697, new StringTextComponent("Click to copy to clipboard"))).method30419(new Class9485(Class2075.field11976, "final BlockPos " + str + " = new BlockPos(" + string + ");")))), false);
            Class9324.method34529(method21448, new BlockPos(method21447), string, -2147418368, 10000);
            return 1;
        }
        class7492.method23259(new StringTextComponent("Can't find a structure block that contains the targeted pos " + method21447));
        return 0;
    }
    
    private static int method22442(final Class7492 class7492) {
        final BlockPos class7493 = new BlockPos(class7492.method23249());
        final Class1849 method23250 = class7492.method23250();
        final BlockPos method23251 = Class8787.method30581(class7493, 15, method23250);
        if (method23251 != null) {
            Class6445.method19231(method23250);
            method22444(method23250, method23251, null);
            return 1;
        }
        method22455(method23250, "Couldn't find any structure block within 15 radius", TextFormatting.RED);
        return 0;
    }
    
    private static int method22443(final Class7492 class7492) {
        final BlockPos class7493 = new BlockPos(class7492.method23249());
        final Class1849 method23250 = class7492.method23250();
        final Collection<BlockPos> method23251 = Class8787.method30582(class7493, 200, method23250);
        if (!method23251.isEmpty()) {
            Class6445.method19231(method23250);
            method22452(class7492, "Running " + method23251.size() + " tests...");
            method23251.forEach(class7496 -> {
                final Object o = new Class7333();
                method22444(class7494, class7496, class7495);
                return;
            });
            return 1;
        }
        method22455(method23250, "Couldn't find any structure blocks within 200 block radius", TextFormatting.RED);
        return 1;
    }
    
    private static void method22444(final Class1849 class1849, final BlockPos class1850, final Class7333 class1851) {
        final Class6812 method31859 = Class8972.method31859(((Class501)class1849.getTileEntity(class1850)).method2555());
        final Class9083 class1852 = new Class9083(method31859, class1850, class1849);
        if (class1851 != null) {
            class1851.method22485(class1852);
            class1852.method32766(new Class7375(class1849, class1851));
        }
        method22448(method31859, class1849);
        Class6445.method19222(class1852, Class8564.field35990);
    }
    
    private static void method22445(final Class1849 class1849, final Class7333 class1850) {
        if (class1850.method22493()) {
            method22455(class1849, "GameTest done! " + class1850.method22492() + " tests were run", TextFormatting.WHITE);
            if (!class1850.method22490()) {
                method22455(class1849, "All required tests passed :)", TextFormatting.GREEN);
            }
            else {
                method22455(class1849, "" + class1850.method22487() + " required tests failed :(", TextFormatting.RED);
            }
            if (class1850.method22491()) {
                method22455(class1849, "" + class1850.method22488() + " optional tests failed", TextFormatting.GRAY);
            }
        }
    }
    
    private static int method22446(final Class7492 class7492, final int n) {
        final Class1849 method23250 = class7492.method23250();
        Class6445.method19231(method23250);
        Class6445.method19233(method23250, new BlockPos(class7492.method23249().x, class7492.method23250().method6958(Class2020.field11522, new BlockPos(class7492.method23249())).getY(), class7492.method23249().z), Class8564.field35990, MathHelper.method35651(n, 0, 1024));
        return 1;
    }
    
    private static int method22447(final Class7492 class7492, final Class6812 class7493) {
        final Class1849 method23250 = class7492.method23250();
        final BlockPos class7494 = new BlockPos(class7492.method23249());
        final BlockPos class7495 = new BlockPos(class7494.getX(), class7492.method23250().method6958(Class2020.field11522, class7494).getY(), class7494.getZ() + 3);
        Class6445.method19231(method23250);
        method22448(class7493, method23250);
        Class6445.method19222(new Class9083(class7493, class7495, method23250), Class8564.field35990);
        return 1;
    }
    
    private static void method22448(final Class6812 class6812, final Class1849 class6813) {
        final Consumer<Class1849> method31857 = Class8972.method31857(class6812.method20853());
        if (method31857 != null) {
            method31857.accept(class6813);
        }
    }
    
    private static int method22449(final Class7492 class7492) {
        Class6445.method19231(class7492.method23250());
        method22451(class7492, Class8972.method31854());
        return 1;
    }
    
    private static int method22450(final Class7492 class7492, final String s) {
        final Collection<Class6812> method31853 = Class8972.method31853(s);
        Class6445.method19231(class7492.method23250());
        method22451(class7492, method31853);
        return 1;
    }
    
    private static void method22451(final Class7492 class7492, final Collection<Class6812> collection) {
        final BlockPos class7493 = new BlockPos(class7492.method23249());
        final BlockPos class7494 = new BlockPos(class7493.getX(), class7492.method23250().method6958(Class2020.field11522, class7493).getY(), class7493.getZ() + 3);
        final Class1849 method23250 = class7492.method23250();
        method22452(class7492, "Running " + collection.size() + " tests...");
        final Class7333 class7495 = new Class7333(Class6445.method19224(collection, class7494, method23250, Class8564.field35990));
        class7495.method22486(new Class7375(method23250, class7495));
    }
    
    private static void method22452(final Class7492 class7492, final String s) {
        class7492.method23257(new StringTextComponent(s), false);
    }
    
    private static int method22453(final Class7492 class7492, final String s) {
        final Path value = Paths.get(Class8787.field36936, new String[0]);
        final Path method6525 = class7492.method23250().method6910().method6525(new ResourceLocation("minecraft", s), ".nbt");
        final Path method6526 = Class3701.method11378(method6525, s, value);
        if (method6526 == null) {
            method22452(class7492, "Failed to export " + method6525);
            return 1;
        }
        try {
            Files.createDirectories(method6526.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
        }
        catch (final IOException ex) {
            method22452(class7492, "Could not create folder " + method6526.getParent());
            ex.printStackTrace();
            return 1;
        }
        method22452(class7492, "Exported to " + method6526.toAbsolutePath());
        return 0;
    }
    
    private static int method22454(final Class7492 class7492, final String s) {
        final Path value = Paths.get(Class8787.field36936, s + ".snbt");
        final Path method6525 = class7492.method23250().method6910().method6525(new ResourceLocation("minecraft", s), ".nbt");
        try {
            final String string = IOUtils.toString((Reader)Files.newBufferedReader(value));
            Files.createDirectories(method6525.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
            Class8097.method26591(Class5704.method16938(string), Files.newOutputStream(method6525, new OpenOption[0]));
            method22452(class7492, "Imported to " + method6525.toAbsolutePath());
            return 0;
        }
        catch (final CommandSyntaxException | IOException ex) {
            System.err.println("Failed to load structure " + s);
            ((Throwable)ex).printStackTrace();
            return 1;
        }
    }
    
    private static void method22455(final Class1849 class1849, final String s, final TextFormatting class1850) {
        class1849.method6883(p0 -> true).forEach(class1851 -> {
            new StringTextComponent(obj + str);
            final StringTextComponent class1852;
            class1851.sendMessage(class1852);
        });
    }
}
