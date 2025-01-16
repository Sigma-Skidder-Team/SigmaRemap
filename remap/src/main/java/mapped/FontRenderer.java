// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.ArabicShaping;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class FontRenderer implements AutoCloseable
{
    public final int field10028 = 9;
    public final Random field10029;
    private final Class1663 field10030;
    public final Class1923 field10031;
    private boolean field10032;
    private boolean field10033;
    private Class9075 field10034;
    private Class2023 field10035;
    
    public FontRenderer(final Class1663 field10030, final Class1923 field10031) {
        this.field10029 = new Random();
        this.field10033 = false;
        this.field10034 = new Class9075();
        this.field10035 = new Class2024(4.0f);
        this.field10030 = field10030;
        this.field10031 = field10031;
    }
    
    public void method6608(final List<Class1737> list) {
        this.field10031.method7627(list);
        this.field10033 = false;
        this.field10035 = new Class2024(4.0f);
        for (final Class1737 class1737 : list) {
            if (!(class1737 instanceof Class1738)) {
                continue;
            }
            final Class1738 class1738 = (Class1738)class1737;
            if (class1738.method6151()) {
                this.field10033 = true;
            }
            if (class1738.method6152() < 0.0f) {
                continue;
            }
            this.field10035 = new Class2024(class1738.method6152());
        }
    }
    
    @Override
    public void close() {
        this.field10031.close();
    }
    
    public int drawStringWithShadow(final String s, final float n, final float n2, final int n3) {
        RenderSystem.enableAlphaTest();
        return this.method6612(s, n, n2, n3, TransformationMatrix.identity().getMatrix(), true);
    }
    
    public int method6610(final String s, final float n, final float n2, final int n3) {
        RenderSystem.enableAlphaTest();
        return this.method6612(s, n, n2, n3, TransformationMatrix.identity().getMatrix(), false);
    }
    
    public String method6611(final String s) {
        try {
            final Bidi bidi = new Bidi(new ArabicShaping(8).shape(s), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (final ArabicShapingException ex) {
            return s;
        }
    }
    
    private int method6612(final String s, final float n, final float n2, final int n3, final Matrix4f class6789, final boolean b) {
        if (s != null) {
            final IRenderTypeBuffer.Impl method25212 = IRenderTypeBuffer.getImpl(Tessellator.getInstance().getBuffer());
            final int method25213 = this.renderString(s, n, n2, n3, b, class6789, method25212, false, 0, 15728880);
            method25212.finish();
            return method25213;
        }
        return 0;
    }
    
    public int renderString(final String s, final float n, final float n2, final int n3, final boolean b, final Matrix4f class6789, final IRenderTypeBuffer class6790, final boolean b2, final int n4, final int n5) {
        return this.method6614(s, n, n2, n3, b, class6789, class6790, b2, n4, n5);
    }
    
    private int method6614(String method6611, float method6612, final float n, int n2, final boolean b, final Matrix4f class6789, final IRenderTypeBuffer class6790, final boolean b2, final int n3, final int n4) {
        if (this.field10032) {
            method6611 = this.method6611(method6611);
        }
        if ((n2 & 0xFC000000) == 0x0) {
            n2 |= 0xFF000000;
        }
        if (this.field10033) {
            Class8933.method31678(this.field10034);
            Class8933.method31519();
            RenderSystem.method30013(Class2050.field11693, Class2135.field12460);
        }
        if (b) {
            this.method6615(method6611, method6612, n, n2, true, class6789, class6790, b2, n3, n4);
        }
        final Matrix4f method6613 = class6789.method20758();
        method6613.method20757(new Vector3f(0.0f, 0.0f, 0.001f));
        method6612 = this.method6615(method6611, method6612, n, n2, false, method6613, class6790, b2, n3, n4);
        if (this.field10033) {
            Class8933.method31679(this.field10034);
        }
        return (int)method6612 + (b ? 1 : 0);
    }
    
    private float method6615(String method17001, final float n, final float n2, final int n3, final boolean b, final Matrix4f class6789, final IRenderTypeBuffer class6790, final boolean b2, final int n4, final int n5) {
        final Class5727 class6791 = new Class5727(method17001);
        Class9463.method35173().method35188().method21097(class6791);
        method17001 = class6791.method17001();
        final float n6 = b ? 0.25f : 1.0f;
        final float n7 = (n3 >> 16 & 0xFF) / 255.0f * n6;
        final float n8 = (n3 >> 8 & 0xFF) / 255.0f * n6;
        final float n9 = (n3 & 0xFF) / 255.0f * n6;
        float n10 = n;
        float n11 = n7;
        float n12 = n8;
        float n13 = n9;
        final float n14 = (n3 >> 24 & 0xFF) / 255.0f;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = false;
        boolean b7 = false;
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < method17001.length(); ++i) {
            char char1 = method17001.charAt(i);
            if (char1 == ' ') {
                char1 = ' ';
            }
            if (char1 == '§' && i + 1 < method17001.length()) {
                final TextFormatting method17002 = TextFormatting.fromFormattingCode(method17001.charAt(i + 1));
                if (method17002 != null) {
                    if (method17002.isNormalStyle()) {
                        b3 = false;
                        b4 = false;
                        b7 = false;
                        b6 = false;
                        b5 = false;
                        n11 = n7;
                        n12 = n8;
                        n13 = n9;
                    }
                    if (method17002.getColor() == null) {
                        if (method17002 != TextFormatting.OBFUSCATED) {
                            if (method17002 != TextFormatting.BOLD) {
                                if (method17002 != TextFormatting.STRIKETHROUGH) {
                                    if (method17002 != TextFormatting.UNDERLINE) {
                                        if (method17002 == TextFormatting.ITALIC) {
                                            b5 = true;
                                        }
                                    }
                                    else {
                                        b6 = true;
                                    }
                                }
                                else {
                                    b7 = true;
                                }
                            }
                            else {
                                b4 = true;
                            }
                        }
                        else {
                            b3 = true;
                        }
                    }
                    else {
                        int n15 = method17002.getColor();
                        if (Config.method28945()) {
                            n15 = Class8763.method30372(method17002.getColorIndex(), n15);
                        }
                        n11 = (n15 >> 16 & 0xFF) / 255.0f * n6;
                        n12 = (n15 >> 8 & 0xFF) / 255.0f * n6;
                        n13 = (n15 & 0xFF) / 255.0f * n6;
                    }
                }
                ++i;
            }
            else {
                final Class2023 method17003 = this.method6631(char1);
                final Class8048 class6792 = (b3 && char1 != ' ') ? this.field10031.method7634(method17003) : this.field10031.method7632(char1);
                if (!(class6792 instanceof Class8049)) {
                    final float n16 = b4 ? method17003.method8082() : 0.0f;
                    final float n17 = b ? method17003.method8083() : 0.0f;
                    this.method6616(class6792, b4, b5, n16, n10 + n17, n2 + n17, class6789, class6790.method25214(class6792.method26395(b2)), n11, n12, n13, n14, n5);
                }
                final float method17004 = method17003.method8080(b4);
                final float n18 = b ? 1.0f : 0.0f;
                if (b7) {
                    arrayList.add(new Class7469(n10 + n18 - 1.0f, n2 + n18 + 4.5f, n10 + n18 + method17004, n2 + n18 + 4.5f - 1.0f, -0.01f, n11, n12, n13, n14));
                }
                if (b6) {
                    arrayList.add(new Class7469(n10 + n18 - 1.0f, n2 + n18 + 9.0f, n10 + n18 + method17004, n2 + n18 + 9.0f - 1.0f, -0.01f, n11, n12, n13, n14));
                }
                n10 += method17004;
            }
        }
        if (n4 != 0) {
            arrayList.add(new Class7469(n - 1.0f, n2 + 9.0f, n10 + 1.0f, n2 - 1.0f, 0.01f, (n4 >> 16 & 0xFF) / 255.0f, (n4 >> 8 & 0xFF) / 255.0f, (n4 & 0xFF) / 255.0f, (n4 >> 24 & 0xFF) / 255.0f));
        }
        if (!arrayList.isEmpty()) {
            final Class8048 method17005 = this.field10031.method7635();
            final Class4150 method17006 = class6790.method25214(method17005.method26395(b2));
            final Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                method17005.method26394((Class7469)iterator.next(), class6789, method17006, n5);
            }
        }
        return n10;
    }
    
    private void method6616(final Class8048 class8048, final boolean b, final boolean b2, final float n, final float n2, final float n3, final Matrix4f class8049, final Class4150 class8050, final float n4, final float n5, final float n6, final float n7, final int n8) {
        class8048.method26393(b2, n2, n3, class8049, class8050, n4, n5, n6, n7, n8);
        if (b) {
            class8048.method26393(b2, n2 + n, n3, class8049, class8050, n4, n5, n6, n7, n8);
        }
    }
    
    public int getStringWidth(final String s) {
        if (s != null) {
            float n = 0.0f;
            boolean b = false;
            for (int i = 0; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                if (char1 == '§' && i < s.length() - 1) {
                    ++i;
                    final TextFormatting method8262 = TextFormatting.fromFormattingCode(s.charAt(i));
                    if (method8262 != TextFormatting.BOLD) {
                        if (method8262 != null) {
                            if (method8262.isNormalStyle()) {
                                b = false;
                            }
                        }
                    }
                    else {
                        b = true;
                    }
                }
                else {
                    n += this.method6631(char1).method8080(b);
                }
            }
            return MathHelper.ceil(n);
        }
        return 0;
    }
    
    public float method6618(final char c) {
        return (c != '§') ? this.method6631(c).method8080(false) : 0.0f;
    }
    
    public String method6619(final String s, final int n) {
        return this.method6620(s, n, false);
    }
    
    public String method6620(final String s, final int n, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        float n2 = 0.0f;
        final int n3 = b ? (s.length() - 1) : 0;
        final int n4 = b ? -1 : 1;
        int n5 = 0;
        int n6 = 0;
        for (int i = n3; i >= 0; i += n4) {
            if (i >= s.length()) {
                break;
            }
            if (n2 >= n) {
                break;
            }
            final char char1 = s.charAt(i);
            if (n5 == 0) {
                if (char1 != '§') {
                    n2 += this.method6618(char1);
                    if (n6 != 0) {
                        ++n2;
                    }
                }
                else {
                    n5 = 1;
                }
            }
            else {
                n5 = 0;
                final TextFormatting method8262 = TextFormatting.fromFormattingCode(char1);
                if (method8262 != TextFormatting.BOLD) {
                    if (method8262 != null) {
                        if (method8262.isNormalStyle()) {
                            n6 = 0;
                        }
                    }
                }
                else {
                    n6 = 1;
                }
            }
            if (n2 > n) {
                break;
            }
            if (!b) {
                sb.append(char1);
            }
            else {
                sb.insert(0, char1);
            }
        }
        return sb.toString();
    }
    
    private String method6621(String substring) {
        while (substring != null && substring.endsWith("\n")) {
            substring = substring.substring(0, substring.length() - 1);
        }
        return substring;
    }
    
    public void method6622(String method6621, final int n, final int n2, final int n3, final int n4) {
        method6621 = this.method6621(method6621);
        this.method6623(method6621, n, n2, n3, n4);
    }
    
    private void method6623(final String s, final int n, int n2, final int n3, final int n4) {
        final List<String> method6626 = this.method6626(s, n3);
        final Matrix4f method6627 = TransformationMatrix.identity().getMatrix();
        for (final String s2 : method6626) {
            float n5 = (float)n;
            if (this.field10032) {
                n5 += n3 - this.getStringWidth(this.method6611(s2));
            }
            this.method6612(s2, n5, (float)n2, n4, method6627, false);
            n2 += 9;
        }
    }
    
    public int method6624(final String s, final int n) {
        return 9 * this.method6626(s, n).size();
    }
    
    public void method6625(final boolean field10032) {
        this.field10032 = field10032;
    }
    
    public List<String> method6626(final String s, final int n) {
        return Arrays.asList(this.method6627(s, n).split("\n"));
    }
    
    public String method6627(String string, final int n) {
        String string2;
        int method6628;
        String substring;
        char char1;
        for (string2 = ""; !string.isEmpty(); string = TextFormatting.getFormatString(substring) + string.substring(method6628 + ((char1 == ' ' || char1 == '\n') ? 1 : 0)), string2 = string2 + substring + "\n") {
            method6628 = this.method6628(string, n);
            if (string.length() <= method6628) {
                return string2 + string;
            }
            substring = string.substring(0, method6628);
            char1 = string.charAt(method6628);
        }
        return string2;
    }
    
    public int method6628(final String s, final int b) {
        final int max = Math.max(1, b);
        final int length = s.length();
        float n = 0.0f;
        int i = 0;
        int n2 = -1;
        int n3 = 0;
        boolean b2 = true;
        while (i < length) {
            final char char1 = s.charAt(i);
            Label_0182: {
                switch (char1) {
                    case 10: {
                        --i;
                        break Label_0182;
                    }
                    case 32: {
                        n2 = i;
                        break;
                    }
                    case 167: {
                        if (i >= length - 1) {
                            break Label_0182;
                        }
                        ++i;
                        final TextFormatting method8262 = TextFormatting.fromFormattingCode(s.charAt(i));
                        if (method8262 == TextFormatting.BOLD) {
                            n3 = 1;
                            break Label_0182;
                        }
                        if (method8262 != null && method8262.isNormalStyle()) {
                            n3 = 0;
                        }
                        break Label_0182;
                    }
                }
                if (n != 0.0f) {
                    b2 = false;
                }
                n += this.method6618(char1);
                if (n3 != 0) {
                    ++n;
                }
            }
            if (char1 == '\n') {
                n2 = ++i;
                break;
            }
            if (n > max) {
                if (b2) {
                    ++i;
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
        return (i != length && n2 != -1 && n2 < i) ? n2 : i;
    }
    
    public int method6629(final String s, final int a, final int n, final boolean b) {
        int i = n;
        final boolean b2 = a < 0;
        for (int abs = Math.abs(a), j = 0; j < abs; ++j) {
            if (!b2) {
                final int length = s.length();
                final int index = s.indexOf(32, i);
                final int index2 = s.indexOf(10, i);
                if (index == -1 && index2 == -1) {
                    i = -1;
                }
                else if (index != -1 && index2 != -1) {
                    i = Math.min(index, index2);
                }
                else if (index == -1) {
                    i = index2;
                }
                else {
                    i = index;
                }
                if (i != -1) {
                    while (b) {
                        if (i >= length) {
                            break;
                        }
                        if (s.charAt(i) != ' ' && s.charAt(i) != '\n') {
                            break;
                        }
                        ++i;
                    }
                }
                else {
                    i = length;
                }
            }
            else {
                while (b) {
                    if (i <= 0) {
                        break;
                    }
                    if (s.charAt(i - 1) != ' ' && s.charAt(i - 1) != '\n') {
                        break;
                    }
                    --i;
                }
                while (i > 0) {
                    if (s.charAt(i - 1) == ' ') {
                        break;
                    }
                    if (s.charAt(i - 1) == '\n') {
                        break;
                    }
                    --i;
                }
            }
        }
        return i;
    }
    
    public boolean method6630() {
        return this.field10032;
    }
    
    private Class2023 method6631(final char c) {
        return (c != ' ') ? this.field10031.method7630(c) : this.field10035;
    }
}
