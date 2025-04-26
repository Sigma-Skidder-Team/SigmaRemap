// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.Collections;
import java.awt.font.GlyphVector;
import java.awt.FontMetrics;
import java.util.Map;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.Font;
import org.newdawn.slick.opengl.renderer.Renderer;
import slick2d.Texture;

import java.io.IOException;
import java.awt.FontFormatException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Comparator;

public class Class7522 implements Font
{
    private static final int field29827 = 200;
    private static final int field29828 = 1114111;
    private static final int field29829 = 512;
    private static final int field29830 = 2175;
    private static final SGL field29831;
    private static final Class8941 field29832;
    private static final Comparator field29833;
    private java.awt.Font field29834;
    private String field29835;
    private int field29836;
    private int field29837;
    private int field29838;
    private int field29839;
    private final Class8274[][] field29840;
    private final List field29841;
    private final List field29842;
    private final List field29843;
    private int field29844;
    private int field29845;
    private int field29846;
    private int field29847;
    private int field29848;
    private int field29849;
    private Class8274 field29850;
    private int field29851;
    private int field29852;
    private boolean field29853;
    private int field29854;
    private int field29855;
    private Class8941 field29856;
    private final LinkedHashMap field29857;
    
    private static java.awt.Font method23487(final String s) throws SlickException {
        try {
            return java.awt.Font.createFont(0, Class8834.method30851(s));
        }
        catch (final FontFormatException ex) {
            throw new Class2324("Invalid font: " + s, ex);
        }
        catch (final IOException ex2) {
            throw new Class2324("Error reading font: " + s, ex2);
        }
    }
    
    public Class7522(final String s, final String s2) throws SlickException {
        this(s, new Class8552(s2));
    }
    
    public Class7522(final String field29835, final Class8552 class8552) throws SlickException {
        this.field29840 = new Class8274[2175][];
        this.field29841 = new ArrayList();
        this.field29842 = new ArrayList(256);
        this.field29843 = new ArrayList();
        this.field29851 = 512;
        this.field29852 = 512;
        this.field29853 = true;
        this.field29854 = -1;
        this.field29857 = new Class33(this, 200, 1.0f, true);
        this.field29835 = field29835;
        this.method23488(method23487(field29835), class8552.method28737(), class8552.method28739(), class8552.method28741());
        this.method23489(class8552);
    }
    
    public Class7522(final String field29835, final int n, final boolean b, final boolean b2) throws SlickException {
        this.field29840 = new Class8274[2175][];
        this.field29841 = new ArrayList();
        this.field29842 = new ArrayList(256);
        this.field29843 = new ArrayList();
        this.field29851 = 512;
        this.field29852 = 512;
        this.field29853 = true;
        this.field29854 = -1;
        this.field29857 = new Class33(this, 200, 1.0f, true);
        this.field29835 = field29835;
        this.method23488(method23487(field29835), n, b, b2);
    }
    
    public Class7522(final java.awt.Font font, final String s) throws SlickException {
        this(font, new Class8552(s));
    }
    
    public Class7522(final java.awt.Font font, final Class8552 class8552) {
        this.field29840 = new Class8274[2175][];
        this.field29841 = new ArrayList();
        this.field29842 = new ArrayList(256);
        this.field29843 = new ArrayList();
        this.field29851 = 512;
        this.field29852 = 512;
        this.field29853 = true;
        this.field29854 = -1;
        this.field29857 = new Class33(this, 200, 1.0f, true);
        this.method23488(font, class8552.method28737(), class8552.method28739(), class8552.method28741());
        this.method23489(class8552);
    }
    
    public Class7522(final java.awt.Font font) {
        this.field29840 = new Class8274[2175][];
        this.field29841 = new ArrayList();
        this.field29842 = new ArrayList(256);
        this.field29843 = new ArrayList();
        this.field29851 = 512;
        this.field29852 = 512;
        this.field29853 = true;
        this.field29854 = -1;
        this.field29857 = new Class33(this, 200, 1.0f, true);
        this.method23488(font, font.getSize(), font.isBold(), font.isItalic());
    }
    
    public Class7522(final java.awt.Font font, final int n, final boolean b, final boolean b2) {
        this.field29840 = new Class8274[2175][];
        this.field29841 = new ArrayList();
        this.field29842 = new ArrayList(256);
        this.field29843 = new ArrayList();
        this.field29851 = 512;
        this.field29852 = 512;
        this.field29853 = true;
        this.field29854 = -1;
        this.field29857 = new Class33(this, 200, 1.0f, true);
        this.method23488(font, n, b, b2);
    }
    
    private void method23488(final java.awt.Font font, final int n, final boolean b, final boolean b2) {
        final Map<TextAttribute, ?> attributes = font.getAttributes();
        attributes.put(TextAttribute.SIZE, new Float((float)n));
        attributes.put(TextAttribute.WEIGHT, b ? TextAttribute.WEIGHT_BOLD : TextAttribute.WEIGHT_REGULAR);
        attributes.put(TextAttribute.POSTURE, b2 ? TextAttribute.POSTURE_OBLIQUE : TextAttribute.POSTURE_REGULAR);
        try {
            attributes.put((TextAttribute)TextAttribute.class.getDeclaredField("KERNING").get(null), TextAttribute.class.getDeclaredField("KERNING_ON").get(null));
        }
        catch (final Exception ex) {}
        this.field29834 = font.deriveFont(attributes);
        final FontMetrics fontMetrics = Class9498.method35362().getFontMetrics(this.field29834);
        this.field29836 = fontMetrics.getAscent();
        this.field29837 = fontMetrics.getDescent();
        this.field29838 = fontMetrics.getLeading();
        final char[] charArray = " ".toCharArray();
        this.field29839 = this.field29834.layoutGlyphVector(Class9498.field40860, charArray, 0, charArray.length, 0).getGlyphLogicalBounds(0).getBounds().width;
    }
    
    private void method23489(final Class8552 class8552) {
        this.field29844 = class8552.method28721();
        this.field29845 = class8552.method28723();
        this.field29846 = class8552.method28725();
        this.field29847 = class8552.method28727();
        this.field29848 = class8552.method28729();
        this.field29849 = class8552.method28731();
        this.field29851 = class8552.method28733();
        this.field29852 = class8552.method28735();
        this.field29843.addAll(class8552.method28743());
    }
    
    public void method23490(final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            this.method23491(new String(Character.toChars(i)));
        }
    }
    
    public void method23491(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final GlyphVector layoutGlyphVector = this.field29834.layoutGlyphVector(Class9498.field40860, charArray, 0, charArray.length, 0);
            for (int i = 0; i < layoutGlyphVector.getNumGlyphs(); ++i) {
                final int codePoint = s.codePointAt(layoutGlyphVector.getGlyphCharIndex(i));
                this.method23502(layoutGlyphVector.getGlyphCode(i), codePoint, this.method23503(layoutGlyphVector, i, codePoint), layoutGlyphVector, i);
            }
            return;
        }
        throw new IllegalArgumentException("text cannot be null.");
    }
    
    public void method23492() {
        this.method23490(32, 255);
    }
    
    public void method23493() {
        this.method23490(32, 128);
    }
    
    public boolean method23494() throws SlickException {
        return this.method23495(-1);
    }
    
    public boolean method23495(int n) throws SlickException {
        if (this.field29842.isEmpty()) {
            return false;
        }
        if (!this.field29843.isEmpty()) {
            final Iterator iterator = this.field29842.iterator();
            while (iterator.hasNext()) {
                final Class8274 field29850 = (Class8274)iterator.next();
                final int method27501 = field29850.method27501();
                if (field29850.method27503() != 0 && method27501 != 32) {
                    if (!field29850.method27502()) {
                        continue;
                    }
                    if (this.field29850 == null) {
                        this.field29850 = field29850;
                    }
                    else {
                        if (field29850 == this.field29850) {
                            continue;
                        }
                        iterator.remove();
                    }
                }
                else {
                    iterator.remove();
                }
            }
            Collections.sort((List<Object>)this.field29842, Class7522.field29833);
            final Iterator iterator2 = this.field29841.iterator();
            while (iterator2.hasNext()) {
                n -= ((Class9498)iterator2.next()).method35363(this.field29842, n);
                if (n != 0 && !this.field29842.isEmpty()) {
                    continue;
                }
                return true;
            }
            while (!this.field29842.isEmpty()) {
                final Class9498 class9498 = new Class9498(this, this.field29851, this.field29852);
                this.field29841.add(class9498);
                n -= class9498.method35363(this.field29842, n);
                if (n != 0) {
                    continue;
                }
                return true;
            }
            return true;
        }
        throw new IllegalStateException("The UnicodeFont must have at least one effect before any glyphs can be loaded.");
    }
    
    public void method23496() {
        for (int i = 0; i < 2175; ++i) {
            this.field29840[i] = null;
        }
        for (final Class9498 class9498 : this.field29841) {
            try {
                class9498.method35367().method24857();
            }
            catch (final Class2324 class9499) {}
        }
        this.field29841.clear();
        if (this.field29854 != -1) {
            Class7522.field29831.glDeleteLists(this.field29854, this.field29857.size());
            this.field29854 = -1;
        }
        this.field29842.clear();
        this.field29850 = null;
    }
    
    public void method23497() {
        this.method23496();
    }
    
    public Class8941 method23498(float n, float n2, final String s, final Color color, final int beginIndex, final int n3) {
        if (s == null) {
            throw new IllegalArgumentException("text cannot be null.");
        }
        if (s.length() == 0) {
            return Class7522.field29832;
        }
        if (color != null) {
            n -= this.field29845;
            n2 -= this.field29844;
            final String substring = s.substring(beginIndex, n3);
            color.bind();
            Class7777.method24930();
            Class8941 class2428 = null;
            if (this.field29853) {
                if (this.field29842.isEmpty()) {
                    if (this.field29854 == -1) {
                        this.field29854 = Class7522.field29831.glGenLists(200);
                        if (this.field29854 == 0) {
                            this.field29854 = -1;
                            this.field29853 = false;
                            return new Class8941();
                        }
                    }
                    class2428 = this.field29857.get(substring);
                    if (class2428 == null) {
                        if (class2428 == null) {
                            class2428 = new Class8941();
                            final int size = this.field29857.size();
                            this.field29857.put(substring, class2428);
                            if (size >= 200) {
                                class2428.field37622 = this.field29855;
                            }
                            else {
                                class2428.field37622 = this.field29854 + size;
                            }
                        }
                    }
                    else {
                        if (!class2428.field37621) {
                            Class7522.field29831.glTranslatef(n, n2, 0.0f);
                            Class7522.field29831.glCallList(class2428.field37622);
                            Class7522.field29831.glTranslatef(-n, -n2, 0.0f);
                            return class2428;
                        }
                        class2428.field37621 = false;
                    }
                    this.field29857.put(substring, class2428);
                }
            }
            Class7522.field29831.glTranslatef(n, n2, 0.0f);
            if (class2428 != null) {
                Class7522.field29831.glNewList(class2428.field37622, 4865);
            }
            final char[] charArray = s.substring(0, n3).toCharArray();
            final GlyphVector layoutGlyphVector = this.field29834.layoutGlyphVector(Class9498.field40860, charArray, 0, charArray.length, 0);
            int max = 0;
            int max2 = 0;
            int n4 = 0;
            int n5 = 0;
            int field29836 = this.field29836;
            int n6 = 0;
            Texture class2429 = null;
            for (int i = 0; i < layoutGlyphVector.getNumGlyphs(); ++i) {
                final int glyphCharIndex = layoutGlyphVector.getGlyphCharIndex(i);
                if (glyphCharIndex >= beginIndex) {
                    if (glyphCharIndex > n3) {
                        break;
                    }
                    final int codePoint = s.codePointAt(glyphCharIndex);
                    final Rectangle method23503 = this.method23503(layoutGlyphVector, i, codePoint);
                    final Class8274 method23504 = this.method23502(layoutGlyphVector.getGlyphCode(i), codePoint, method23503, layoutGlyphVector, i);
                    if (n6 != 0) {
                        if (codePoint != 10) {
                            n5 = -method23503.x;
                            n6 = 0;
                        }
                    }
                    Class7764 class2430 = method23504.method27507();
                    if (class2430 == null) {
                        if (this.field29850 != null) {
                            if (method23504.method27502()) {
                                class2430 = this.field29850.method27507();
                            }
                        }
                    }
                    if (class2430 != null) {
                        final Texture method23505 = class2430.method24852();
                        if (class2429 != null) {
                            if (class2429 != method23505) {
                                Class7522.field29831.glEnd();
                                class2429 = null;
                            }
                        }
                        if (class2429 == null) {
                            method23505.bind();
                            Class7522.field29831.glBegin(7);
                            class2429 = method23505;
                        }
                        class2430.method24816((float)(method23503.x + n5), (float)(method23503.y + field29836), (float)class2430.method24843(), (float)class2430.method24844());
                    }
                    if (i >= 0) {
                        n5 += this.field29847 + this.field29845 + this.field29848;
                    }
                    max = Math.max(max, method23503.x + n5 + method23503.width);
                    max2 = Math.max(max2, this.field29836 + method23503.y + method23503.height);
                    if (codePoint == 10) {
                        n6 = 1;
                        field29836 += this.getLineHeight();
                        ++n4;
                        max2 = 0;
                    }
                }
            }
            if (class2429 != null) {
                Class7522.field29831.glEnd();
            }
            if (class2428 != null) {
                Class7522.field29831.glEndList();
                if (!this.field29842.isEmpty()) {
                    class2428.field37621 = true;
                }
            }
            Class7522.field29831.glTranslatef(-n, -n2, 0.0f);
            if (class2428 == null) {
                class2428 = new Class8941();
            }
            class2428.field37624 = (short)max;
            class2428.field37625 = (short)(n4 * this.getLineHeight() + max2);
            return class2428;
        }
        throw new IllegalArgumentException("color cannot be null.");
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color, final int startIndex, final int endIndex) {
        this.method23498(x, y, text, color, startIndex, endIndex);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text) {
        this.drawString(x, y, text, Color.white);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color) {
        this.drawString(x, y, text, color, 0, text.length());
    }
    
    private Class8274 method23502(final int n, final int n2, final Rectangle rectangle, final GlyphVector glyphVector, final int n3) {
        if (n >= 0 && n < 1114111) {
            final int n4 = n / 512;
            final int n5 = n & 0x1FF;
            Class8274[] array = this.field29840[n4];
            if (array == null) {
                final Class8274[][] field29840 = this.field29840;
                final int n6 = n4;
                final Class8274[] array2 = new Class8274[512];
                field29840[n6] = array2;
                array = array2;
            }
            else {
                final Class8274 class8274 = array[n5];
                if (class8274 != null) {
                    return class8274;
                }
            }
            final Class8274[] array3 = array;
            final int n7 = n5;
            final Class8274 class8275 = new Class8274(n2, rectangle, glyphVector, n3, this);
            array3[n7] = class8275;
            final Class8274 class8276 = class8275;
            this.field29842.add(class8276);
            return class8276;
        }
        return new Class8275(this, n2, rectangle, glyphVector, n3, this);
    }
    
    private Rectangle method23503(final GlyphVector glyphVector, final int index, final int n) {
        final Rectangle glyphPixelBounds = glyphVector.getGlyphPixelBounds(index, Class9498.field40860, 0.0f, 0.0f);
        if (n == 32) {
            glyphPixelBounds.width = this.field29839;
        }
        return glyphPixelBounds;
    }
    
    public int method23504() {
        return this.field29839;
    }
    
    @Override
    public int getWidth(final String str) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null.");
        }
        if (str.length() != 0) {
            if (this.field29853) {
                final Class8941 class8941 = this.field29857.get(str);
                if (class8941 != null) {
                    return class8941.field37624;
                }
            }
            final char[] charArray = str.toCharArray();
            final GlyphVector layoutGlyphVector = this.field29834.layoutGlyphVector(Class9498.field40860, charArray, 0, charArray.length, 0);
            int max = 0;
            int n = 0;
            int n2 = 0;
            for (int i = 0; i < layoutGlyphVector.getNumGlyphs(); ++i) {
                final int codePoint = str.codePointAt(layoutGlyphVector.getGlyphCharIndex(i));
                final Rectangle method23503 = this.method23503(layoutGlyphVector, i, codePoint);
                if (n2 != 0) {
                    if (codePoint != 10) {
                        n = -method23503.x;
                    }
                }
                if (i > 0) {
                    n += this.field29845 + this.field29847 + this.field29848;
                }
                max = Math.max(max, method23503.x + n + method23503.width);
                if (codePoint == 10) {
                    n2 = 1;
                }
            }
            return max;
        }
        return 0;
    }
    
    @Override
    public int getHeight(final String str) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null.");
        }
        if (str.length() != 0) {
            if (this.field29853) {
                final Class8941 class8941 = this.field29857.get(str);
                if (class8941 != null) {
                    return class8941.field37625;
                }
            }
            final char[] charArray = str.toCharArray();
            final GlyphVector layoutGlyphVector = this.field29834.layoutGlyphVector(Class9498.field40860, charArray, 0, charArray.length, 0);
            int n = 0;
            int max = 0;
            for (int i = 0; i < layoutGlyphVector.getNumGlyphs(); ++i) {
                final int codePoint = str.codePointAt(layoutGlyphVector.getGlyphCharIndex(i));
                if (codePoint != 32) {
                    final Rectangle method23503 = this.method23503(layoutGlyphVector, i, codePoint);
                    max = Math.max(max, this.field29836 + method23503.y + method23503.height);
                    if (codePoint == 10) {
                        ++n;
                        max = 0;
                    }
                }
            }
            return n * this.getLineHeight() + max;
        }
        return 0;
    }
    
    public int method23507(String substring) {
        if (substring != null) {
            Class8941 class8941 = null;
            if (this.field29853) {
                class8941 = this.field29857.get(substring);
                if (class8941 != null) {
                    if (class8941.field37623 != null) {
                        return class8941.field37623;
                    }
                }
            }
            final int index = substring.indexOf(10);
            if (index != -1) {
                substring = substring.substring(0, index);
            }
            final char[] charArray = substring.toCharArray();
            final int n = this.field29836 + this.field29834.layoutGlyphVector(Class9498.field40860, charArray, 0, charArray.length, 0).getPixelBounds(null, 0.0f, 0.0f).y;
            if (class8941 != null) {
                class8941.field37623 = new Short((short)n);
            }
            return n;
        }
        throw new IllegalArgumentException("text cannot be null.");
    }
    
    public java.awt.Font method23508() {
        return this.field29834;
    }
    
    public int method23509() {
        return this.field29844;
    }
    
    public void method23510(final int field29844) {
        this.field29844 = field29844;
    }
    
    public int method23511() {
        return this.field29845;
    }
    
    public void method23512(final int field29845) {
        this.field29845 = field29845;
    }
    
    public int method23513() {
        return this.field29846;
    }
    
    public void method23514(final int field29846) {
        this.field29846 = field29846;
    }
    
    public int method23515() {
        return this.field29847;
    }
    
    public void method23516(final int field29847) {
        this.field29847 = field29847;
    }
    
    public int method23517() {
        return this.field29848;
    }
    
    public void method23518(final int field29848) {
        this.field29848 = field29848;
    }
    
    public int method23519() {
        return this.field29849;
    }
    
    public void method23520(final int field29849) {
        this.field29849 = field29849;
    }
    
    @Override
    public int getLineHeight() {
        return this.field29837 + this.field29836 + this.field29838 + this.field29844 + this.field29846 + this.field29849;
    }
    
    public int method23522() {
        return this.field29836;
    }
    
    public int method23523() {
        return this.field29837;
    }
    
    public int method23524() {
        return this.field29838;
    }
    
    public int method23525() {
        return this.field29851;
    }
    
    public void method23526(final int field29851) {
        this.field29851 = field29851;
    }
    
    public int method23527() {
        return this.field29852;
    }
    
    public void method23528(final int field29852) {
        this.field29852 = field29852;
    }
    
    public List method23529() {
        return this.field29841;
    }
    
    public List method23530() {
        return this.field29843;
    }
    
    public boolean method23531() {
        return this.field29853;
    }
    
    public void method23532(final boolean field29853) {
        this.field29853 = field29853;
    }
    
    public String method23533() {
        if (this.field29835 == null) {
            try {
                final Object invoke = Class.forName("sun.font.FontManager").getDeclaredMethod("getFont2D", java.awt.Font.class).invoke(null, this.field29834);
                final Field declaredField = Class.forName("sun.font.PhysicalFont").getDeclaredField("platName");
                declaredField.setAccessible(true);
                this.field29835 = (String)declaredField.get(invoke);
            }
            catch (final Throwable t) {}
            if (this.field29835 == null) {
                this.field29835 = "";
            }
        }
        if (this.field29835.length() == 0) {
            return null;
        }
        return this.field29835;
    }
    
    static {
        field29831 = Renderer.get();
        field29832 = new Class8941();
        field29833 = new Class4433();
    }
}
