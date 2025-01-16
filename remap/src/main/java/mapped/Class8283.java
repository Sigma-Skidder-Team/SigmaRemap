// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.SimpleDateFormat;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import java.util.Date;
import java.util.function.Consumer;
import java.io.File;
import java.text.DateFormat;
import org.apache.logging.log4j.Logger;

public class Class8283
{
    private static final Logger field34072;
    private static final DateFormat field34073;
    
    public static void method27524(final File file, final int n, final int n2, final Class6153 class6153, final Consumer<ITextComponent> consumer) {
        method27525(file, null, n, n2, class6153, consumer);
    }
    
    public static void method27525(final File file, final String s, final int n, final int n2, final Class6153 class6153, final Consumer<ITextComponent> consumer) {
        if (Class8726.method29984()) {
            method27526(file, s, n, n2, class6153, consumer);
        }
        else {
            Class8726.method29991(() -> method27526(file, s, n, n2, class6153, consumer));
        }
    }
    
    private static void method27526(final File parent, final String child, final int n, final int n2, final Class6153 class6153, final Consumer<ITextComponent> consumer) {
        final Class869 method28894 = Config.method28894();
        final Class1925 method28895 = method28894.method5332();
        final Class5760 method28896 = Config.method28962();
        final int method28897 = method28895.method7692();
        final int method28898 = method28895.method7693();
        final int field23473 = method28896.field23473;
        final int method28899 = method28895.method7687(method28894.field4648.field23473, method28894.field4648.field23421);
        final int method28900 = Config.method29007();
        final boolean b = Class8543.method28676() && method28900 > 1;
        if (b) {
            method28896.field23473 = method28899 * method28900;
            method28895.method7703(method28897 * method28900, method28898 * method28900);
            Class8933.method31635();
            Class8933.method31681(16640);
            method28894.method5234().method18395(true);
            Class8933.method31609();
            method28894.field4644.method5817(method28894.method5314(), System.nanoTime(), true);
        }
        final Class1846 method28901 = method27527(n, n2, class6153);
        if (b) {
            method28894.method5234().method18397();
            Class8933.method31636();
            Config.method28962().field23473 = field23473;
            method28895.method7703(method28897, method28898);
        }
        final File parent2 = new File(parent, "screenshots");
        parent2.mkdir();
        File method28902;
        if (child != null) {
            method28902 = new File(parent2, child);
        }
        else {
            method28902 = method27528(parent2);
        }
        Object method28903 = null;
        if (Class9570.field41306.method22605()) {
            method28903 = Class9570.method35818(Class9570.field41306, method28901, method28902);
            if (Class9570.method35820(method28903, Class9570.field41225, new Object[0])) {
                consumer.accept((ITextComponent)Class9570.method35826(method28903, Class9570.field41420, new Object[0]));
                return;
            }
            method28902 = (File)Class9570.method35826(method28903, Class9570.field41421, new Object[0]);
        }
        Class1673.field9460.execute(() -> {
            try {
                class6154.method6657(file);
                new StringTextComponent(file.getName()).applyTextStyle(TextFormatting.UNDERLINE).applyTextStyle(class6158 -> class6158.method30419(new Class9485(Class2075.field11972, file2.getAbsolutePath())));
                if (o != null && Class9570.method35826(o, Class9570.field41422, new Object[0]) != null) {
                    consumer2.accept(Class9570.method35826(o, Class9570.field41422, new Object[0]));
                }
                else {
                    final ITextComponent class6156;
                    new Class2259("screenshot.success", new Object[] { class6156 });
                    final Class2259 class6155;
                    consumer2.accept(class6155);
                }
            }
            catch (final Exception ex) {
                Class8283.field34072.warn("Couldn't save screenshot", (Throwable)ex);
                new Class2259("screenshot.failure", new Object[] { ex.getMessage() });
                final Class2259 class6157;
                consumer2.accept(class6157);
            }
            finally {
                class6154.close();
            }
        });
    }
    
    public static Class1846 method27527(int field24884, int field24885, final Class6153 class6153) {
        field24884 = class6153.field24884;
        field24885 = class6153.field24885;
        final Class1846 class6154 = new Class1846(field24884, field24885, false);
        Class8726.method30044(class6153.field24890);
        class6154.method6656(0, true);
        class6154.method6665();
        return class6154;
    }
    
    private static File method27528(final File parent) {
        final String format = Class8283.field34073.format(new Date());
        int i = 1;
        File file;
        while (true) {
            file = new File(parent, format + ((i != 1) ? ("_" + i) : "") + ".png");
            if (!file.exists()) {
                break;
            }
            ++i;
        }
        return file;
    }
    
    static {
        field34072 = LogManager.getLogger();
        field34073 = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    }
}
