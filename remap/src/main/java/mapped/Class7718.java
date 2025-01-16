// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.HashSet;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Properties;

public class Class7718 implements Class7712
{
    public String field30681;
    public String field30682;
    private int field30683;
    private Class8802[] field30684;
    private String field30685;
    private int field30686;
    private int field30687;
    private int field30688;
    private int field30689;
    private int field30690;
    private int[] field30691;
    private float[][] field30692;
    private static final int field30693 = -1;
    private static final int field30694 = 0;
    private static final int field30695 = 1;
    private static final int field30696 = 2;
    public static final String field30697 = "vanilla";
    public static final String field30698 = "grid";
    public static final String field30699 = "fixed";
    public static final String[] field30700;
    public static final String field30701 = "format";
    public static final String field30702 = "blocks";
    public static final String field30703 = "source";
    public static final String field30704 = "color";
    public static final String field30705 = "yVariance";
    public static final String field30706 = "yOffset";
    
    public Class7718(final Properties properties, final String s, final int field30689, final int field30690, final String defaultValue) {
        this.field30681 = null;
        this.field30682 = null;
        this.field30683 = -1;
        this.field30684 = null;
        this.field30685 = null;
        this.field30686 = -1;
        this.field30687 = 0;
        this.field30688 = 0;
        this.field30689 = 0;
        this.field30690 = 0;
        this.field30691 = null;
        this.field30692 = null;
        final Class8652 class8652 = new Class8652("Colormap");
        this.field30681 = class8652.method29440(s);
        this.field30682 = class8652.method29441(s);
        this.field30683 = this.method24618(properties.getProperty("format", defaultValue));
        this.field30684 = class8652.method29442(properties.getProperty("blocks"));
        this.field30685 = method24625(properties.getProperty("source"), s, this.field30682);
        this.field30686 = Class8652.method29466(properties.getProperty("color"), -1);
        this.field30687 = class8652.method29456(properties.getProperty("yVariance"), 0);
        this.field30688 = class8652.method29456(properties.getProperty("yOffset"), 0);
        this.field30689 = field30689;
        this.field30690 = field30690;
    }
    
    private int method24618(String trim) {
        if (trim == null) {
            return 0;
        }
        trim = trim.trim();
        if (trim.equals("vanilla")) {
            return 0;
        }
        if (trim.equals("grid")) {
            return 1;
        }
        if (!trim.equals("fixed")) {
            method24624("Unknown format: " + trim);
            return -1;
        }
        return 2;
    }
    
    public boolean method24619(final String str) {
        if (this.field30683 != 0 && this.field30683 != 1) {
            if (this.field30683 != 2) {
                return false;
            }
            if (this.field30686 < 0) {
                this.field30686 = 16777215;
            }
        }
        else {
            if (this.field30685 == null) {
                method24624("Source not defined: " + str);
                return false;
            }
            this.method24622();
            if (this.field30691 == null) {
                return false;
            }
            if (this.field30686 < 0) {
                if (this.field30683 == 0) {
                    this.field30686 = this.method24630(127, 127);
                }
                if (this.field30683 == 1) {
                    this.field30686 = this.method24636(Class7102.field27633, new BlockPos(0, 64, 0));
                }
            }
        }
        return true;
    }
    
    public boolean method24620(final String str) {
        if (this.field30684 == null) {
            this.field30684 = this.method24621();
            if (this.field30684 == null) {
                method24624("Match blocks not defined: " + str);
                return false;
            }
        }
        return true;
    }
    
    private Class8802[] method24621() {
        final ResourceLocation class1932 = new ResourceLocation(this.field30681);
        if (!Registry.BLOCK.method510(class1932)) {
            final Matcher matcher = Pattern.compile("^block([0-9]+).*$").matcher(this.field30681);
            if (matcher.matches()) {
                final int method28933 = Config.method28933(matcher.group(1), -1);
                if (method28933 >= 0) {
                    return new Class8802[] { new Class8802(method28933) };
                }
            }
            final Class8802[] method28934 = new Class8652("Colormap").method29444(this.field30681);
            return (Class8802[])((method28934 == null) ? null : method28934);
        }
        return new Class8802[] { new Class8802(BlockUtils.method20649(Registry.BLOCK.getOrDefault(class1932))) };
    }
    
    private void method24622() {
        try {
            this.field30691 = null;
            if (this.field30685 == null) {
                return;
            }
            final String string = this.field30685 + ".png";
            final InputStream method28897 = Config.method28897(new ResourceLocation(string));
            if (method28897 == null) {
                return;
            }
            final BufferedImage method28898 = Class8969.method31848(method28897);
            if (method28898 == null) {
                return;
            }
            final int width = method28898.getWidth();
            final int height = method28898.getHeight();
            final boolean b = this.field30689 < 0 || this.field30689 == width;
            final boolean b2 = this.field30690 < 0 || this.field30690 == height;
            if (!b || !b2) {
                method24623("Non-standard palette size: " + width + "x" + height + ", should be: " + this.field30689 + "x" + this.field30690 + ", path: " + string);
            }
            this.field30689 = width;
            this.field30690 = height;
            if (this.field30689 <= 0 || this.field30690 <= 0) {
                method24624("Invalid palette size: " + width + "x" + height + ", path: " + string);
                return;
            }
            method28898.getRGB(0, 0, width, height, this.field30691 = new int[width * height], 0, width);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void method24623(final String str) {
        Config.method28847("CustomColors: " + str);
    }
    
    private static void method24624(final String str) {
        Config.warn("CustomColors: " + str);
    }
    
    private static String method24625(String s, final String s2, final String s3) {
        if (s == null) {
            String s4 = s2;
            final int lastIndex = s2.lastIndexOf(47);
            if (lastIndex >= 0) {
                s4 = s2.substring(lastIndex + 1);
            }
            final int lastIndex2 = s4.lastIndexOf(46);
            if (lastIndex2 >= 0) {
                s4 = s4.substring(0, lastIndex2);
            }
            return method24626(s4, s3);
        }
        s = s.trim();
        final String suffix = ".png";
        if (s.endsWith(suffix)) {
            s = s.substring(0, s.length() - suffix.length());
        }
        s = method24626(s, s3);
        return s;
    }
    
    private static String method24626(String str, final String s) {
        str = Class8969.method31832(str, s);
        if (!str.startsWith(s)) {
            if (!str.startsWith("textures/")) {
                if (!str.startsWith("optifine/")) {
                    str = s + "/" + str;
                }
            }
        }
        if (str.endsWith(".png")) {
            str = str.substring(0, str.length() - 4);
        }
        final String prefix = "textures/block/";
        if (str.startsWith(prefix)) {
            str = str.substring(prefix.length());
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str;
    }
    
    public boolean method24627(final BlockState class7096) {
        return Class7980.method26014(class7096, this.field30684);
    }
    
    public int method24628() {
        if (this.field30683 != 2) {
            return this.field30691[Class8763.field36837.nextInt(this.field30691.length)];
        }
        return this.field30686;
    }
    
    public int method24629(int method28865) {
        method28865 = Config.method28865(method28865, 0, this.field30691.length - 1);
        return this.field30691[method28865] & 0xFFFFFF;
    }
    
    public int method24630(int method28865, int method28866) {
        method28865 = Config.method28865(method28865, 0, this.field30689 - 1);
        method28866 = Config.method28865(method28866, 0, this.field30690 - 1);
        return this.field30691[method28866 * this.field30689 + method28865] & 0xFFFFFF;
    }
    
    public float[][] method24631() {
        if (this.field30692 == null) {
            this.field30692 = method24640(this.field30691);
        }
        return this.field30692;
    }
    
    @Override
    public int method24616(final BlockState class7096, final Class1856 class7097, final BlockPos class7098) {
        return this.method24632(class7097, class7098);
    }
    
    public int method24632(final Class1856 class1856, final BlockPos class1857) {
        return this.method24633(Class8763.method30337(class1856, class1857), class1857);
    }
    
    @Override
    public boolean method24617() {
        return this.field30683 == 2;
    }
    
    public int method24633(final Class3090 class3090, final BlockPos class3091) {
        if (this.field30683 != 0) {
            return (this.field30683 != 1) ? this.field30686 : this.method24636(class3090, class3091);
        }
        return this.method24635(class3090, class3091);
    }
    
    public int method24634(final Class1856 class1856, final double n, final double n2, final double n3, final int n4) {
        if (this.field30683 != 2) {
            final int method35644 = MathHelper.floor(n);
            final int method35645 = MathHelper.floor(n2);
            final int method35646 = MathHelper.floor(n3);
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            final Class384 class1857 = new Class384(0, 0, 0);
            for (int i = method35644 - n4; i <= method35644 + n4; ++i) {
                for (int j = method35646 - n4; j <= method35646 + n4; ++j) {
                    class1857.method1279(i, method35645, j);
                    final int method35647 = this.method24632(class1856, class1857);
                    n5 += (method35647 >> 16 & 0xFF);
                    n6 += (method35647 >> 8 & 0xFF);
                    n7 += (method35647 & 0xFF);
                    ++n8;
                }
            }
            return n5 / n8 << 16 | n6 / n8 << 8 | n7 / n8;
        }
        return this.field30686;
    }
    
    private int method24635(final Class3090 class3090, final BlockPos class3091) {
        final double n = MathHelper.clamp(class3090.method9845(class3091), 0.0f, 1.0f);
        return this.method24630((int)((1.0 - n) * (this.field30689 - 1)), (int)((1.0 - MathHelper.clamp(class3090.method9863(), 0.0f, 1.0f) * n) * (this.field30690 - 1)));
    }
    
    private int method24636(final Class3090 class3090, final BlockPos class3091) {
        final int method504 = Registry.field217.getId(class3090);
        int n = class3091.getY() - this.field30688;
        if (this.field30687 > 0) {
            n += (Config.method28967(class3091.getX() << 16 + class3091.getZ()) & 0xFF) % (this.field30687 * 2 + 1) - this.field30687;
        }
        return this.method24630(method504, n);
    }
    
    public int method24637() {
        return (this.field30683 != 2) ? this.field30691.length : 1;
    }
    
    public int method24638() {
        return this.field30689;
    }
    
    public int method24639() {
        return this.field30690;
    }
    
    private static float[][] method24640(final int[] array) {
        final float[][] array2 = new float[array.length][3];
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            final float n2 = (n >> 16 & 0xFF) / 255.0f;
            final float n3 = (n >> 8 & 0xFF) / 255.0f;
            final float n4 = (n & 0xFF) / 255.0f;
            final float[] array3 = array2[i];
            array3[0] = n2;
            array3[1] = n3;
            array3[2] = n4;
        }
        return array2;
    }
    
    public void method24641(final Class8802 class8802) {
        if (this.field30684 == null) {
            this.field30684 = new Class8802[0];
        }
        this.field30684 = (Class8802[]) Config.method28982(this.field30684, class8802);
    }
    
    public void method24642(final int n, final int n2) {
        final Class8802 method24643 = this.method24643(n);
        if (method24643 == null) {
            this.method24641(new Class8802(n, n2));
        }
        else if (n2 >= 0) {
            method24643.method30713(n2);
        }
    }
    
    private Class8802 method24643(final int n) {
        if (this.field30684 != null) {
            for (int i = 0; i < this.field30684.length; ++i) {
                final Class8802 class8802 = this.field30684[i];
                if (class8802.method30709() == n) {
                    return class8802;
                }
            }
            return null;
        }
        return null;
    }
    
    public int[] method24644() {
        if (this.field30684 != null) {
            final HashSet set = new HashSet();
            for (int i = 0; i < this.field30684.length; ++i) {
                final Class8802 class8802 = this.field30684[i];
                if (class8802.method30709() >= 0) {
                    set.add(class8802.method30709());
                }
            }
            final Integer[] array = (Integer[])set.toArray(new Integer[set.size()]);
            final int[] array2 = new int[array.length];
            for (int j = 0; j < array.length; ++j) {
                array2[j] = array[j];
            }
            return array2;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "" + this.field30682 + "/" + this.field30681 + ", blocks: " + Config.method28888(this.field30684) + ", source: " + this.field30685;
    }
    
    static {
        field30700 = new String[] { Class7718.\u9414\ub31c\ucf13\u5afc\ua6ae\u54f3[7], Class7718.\u9414\ub31c\ucf13\u5afc\ua6ae\u54f3[8], Class7718.\u9414\ub31c\ucf13\u5afc\ua6ae\u54f3[9] };
    }
}
