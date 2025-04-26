// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.Font;
import org.newdawn.slick.opengl.renderer.Renderer;

import java.util.LinkedHashMap;

public class Class7526 implements Font
{
    private static SGL field29872;
    private static final int field29873 = 200;
    private static final int field29874 = 255;
    private boolean field29875;
    private Class7764 field29876;
    private Class8935[] field29877;
    private int field29878;
    private int field29879;
    private int field29880;
    private Class7560 field29881;
    private final LinkedHashMap field29882;
    
    public Class7526(final String s, final Class7764 field29876) throws SlickException {
        this.field29875 = true;
        this.field29879 = -1;
        this.field29882 = new Class34(this, 200, 1.0f, true);
        this.field29876 = field29876;
        this.method23540(Class8834.method30851(s));
    }
    
    public Class7526(final String s, final String s2) throws SlickException {
        this.field29875 = true;
        this.field29879 = -1;
        this.field29882 = new Class34(this, 200, 1.0f, true);
        this.field29876 = new Class7764(s2);
        this.method23540(Class8834.method30851(s));
    }
    
    public Class7526(final String s, final Class7764 field29876, final boolean field29877) throws SlickException {
        this.field29875 = true;
        this.field29879 = -1;
        this.field29882 = new Class34(this, 200, 1.0f, true);
        this.field29876 = field29876;
        this.field29875 = field29877;
        this.method23540(Class8834.method30851(s));
    }
    
    public Class7526(final String s, final String s2, final boolean field29875) throws SlickException {
        this.field29875 = true;
        this.field29879 = -1;
        this.field29882 = new Class34(this, 200, 1.0f, true);
        this.field29876 = new Class7764(s2);
        this.field29875 = field29875;
        this.method23540(Class8834.method30851(s));
    }
    
    public Class7526(final String s, final InputStream inputStream, final InputStream inputStream2) throws SlickException {
        this.field29875 = true;
        this.field29879 = -1;
        this.field29882 = new Class34(this, 200, 1.0f, true);
        this.field29876 = new Class7764(inputStream2, s, false);
        this.method23540(inputStream);
    }
    
    public Class7526(final String s, final InputStream inputStream, final InputStream inputStream2, final boolean field29875) throws SlickException {
        this.field29875 = true;
        this.field29879 = -1;
        this.field29882 = new Class34(this, 200, 1.0f, true);
        this.field29876 = new Class7764(inputStream2, s, false);
        this.field29875 = field29875;
        this.method23540(inputStream);
    }
    
    private void method23540(final InputStream inputStream) throws SlickException {
        if (this.field29875) {
            this.field29879 = Class7526.field29872.glGenLists(200);
            if (this.field29879 == 0) {
                this.field29875 = false;
            }
        }
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            bufferedReader.readLine();
            bufferedReader.readLine();
            bufferedReader.readLine();
            final HashMap hashMap = new HashMap(64);
            final ArrayList list = new ArrayList(255);
            int max = 0;
            int i = 0;
            while (i == 0) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    i = 1;
                }
                else {
                    if (!line.startsWith("chars c")) {
                        if (line.startsWith("char")) {
                            final Class8935 method23541 = this.method23541(line);
                            if (method23541 != null) {
                                max = Math.max(max, method23541.field37588);
                                list.add(method23541);
                            }
                        }
                    }
                    if (line.startsWith("kernings c")) {
                        continue;
                    }
                    if (!line.startsWith("kerning")) {
                        continue;
                    }
                    final StringTokenizer stringTokenizer = new StringTokenizer(line, " =");
                    stringTokenizer.nextToken();
                    stringTokenizer.nextToken();
                    final short short1 = Short.parseShort(stringTokenizer.nextToken());
                    stringTokenizer.nextToken();
                    final int int1 = Integer.parseInt(stringTokenizer.nextToken());
                    stringTokenizer.nextToken();
                    final int int2 = Integer.parseInt(stringTokenizer.nextToken());
                    Object o = hashMap.get(new Short(short1));
                    if (o == null) {
                        o = new ArrayList<Short>();
                        hashMap.put(new Short(short1), o);
                    }
                    ((List<Short>)o).add(new Short((short)(int2 << 8 | int1)));
                }
            }
            this.field29877 = new Class8935[max + 1];
            for (final Class8935 class8935 : list) {
                this.field29877[class8935.field37588] = class8935;
            }
            for (final Map.Entry<Short, V> entry : hashMap.entrySet()) {
                final short shortValue = entry.getKey();
                final List list2 = (List)entry.getValue();
                final short[] field37598 = new short[list2.size()];
                int n = 0;
                final Iterator iterator3 = list2.iterator();
                while (iterator3.hasNext()) {
                    field37598[n] = (short)iterator3.next();
                    ++n;
                }
                this.field29877[shortValue].field37598 = field37598;
            }
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
            throw new Class2324("Failed to parse font file: " + inputStream);
        }
    }
    
    private Class8935 method23541(final String str) throws SlickException {
        final Class8935 class8935 = new Class8935(this, null);
        final StringTokenizer stringTokenizer = new StringTokenizer(str, " =");
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        class8935.field37588 = Short.parseShort(stringTokenizer.nextToken());
        if (class8935.field37588 < 0) {
            return null;
        }
        if (class8935.field37588 <= 255) {
            stringTokenizer.nextToken();
            class8935.field37589 = Short.parseShort(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            class8935.field37590 = Short.parseShort(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            class8935.field37591 = Short.parseShort(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            class8935.field37592 = Short.parseShort(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            class8935.field37593 = Short.parseShort(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            class8935.field37594 = Short.parseShort(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            class8935.field37595 = Short.parseShort(stringTokenizer.nextToken());
            class8935.method31693();
            if (class8935.field37588 != 32) {
                this.field29878 = Math.max(class8935.field37592 + class8935.field37594, this.field29878);
            }
            return class8935;
        }
        throw new Class2324("Invalid character '" + class8935.field37588 + "': AngelCodeFont does not support characters above " + 255);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text) {
        this.drawString(x, y, text, Color.white);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color) {
        this.drawString(x, y, text, color, 0, text.length() - 1);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color, final int startIndex, final int endIndex) {
        this.field29876.method24811();
        color.bind();
        Class7526.field29872.glTranslatef(x, y, 0.0f);
        Label_0219: {
            if (this.field29875) {
                if (startIndex == 0) {
                    if (endIndex == text.length() - 1) {
                        final Class7560 class2428 = this.field29882.get(text);
                        if (class2428 == null) {
                            final Class7560 value = new Class7560(null);
                            value.field29985 = text;
                            final int size = this.field29882.size();
                            if (size >= 200) {
                                value.field29981 = this.field29880;
                                this.field29882.remove(this.field29881.field29985);
                            }
                            else {
                                value.field29981 = this.field29879 + size;
                            }
                            this.field29882.put(text, value);
                            Class7526.field29872.glNewList(value.field29981, 4865);
                            this.method23542(text, startIndex, endIndex);
                            Class7526.field29872.glEndList();
                            break Label_0219;
                        }
                        Class7526.field29872.glCallList(class2428.field29981);
                        break Label_0219;
                    }
                }
            }
            this.method23542(text, startIndex, endIndex);
        }
        Class7526.field29872.glTranslatef(-x, -y, 0.0f);
    }
    
    private void method23542(final String s, final int n, final int n2) {
        Class7526.field29872.glBegin(7);
        int n3 = 0;
        int n4 = 0;
        Class8935 class8935 = null;
        final char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            final char c = charArray[i];
            if (c != '\n') {
                if (c < this.field29877.length) {
                    final Class8935 class8936 = this.field29877[c];
                    if (class8936 != null) {
                        if (class8935 != null) {
                            n3 += class8935.method31695(c);
                        }
                        class8935 = class8936;
                        if (i >= n) {
                            if (i <= n2) {
                                class8936.method31694((float)n3, (float)n4);
                            }
                        }
                        n3 += class8936.field37595;
                    }
                }
            }
            else {
                n3 = 0;
                n4 += this.getLineHeight();
            }
        }
        Class7526.field29872.glEnd();
    }
    
    public int method23543(final String key) {
        Class7560 class7560 = null;
        if (this.field29875) {
            class7560 = this.field29882.get(key);
            if (class7560 != null) {
                if (class7560.field29982 != null) {
                    return class7560.field29982;
                }
            }
        }
        int n = key.indexOf(10);
        if (n == -1) {
            n = key.length();
        }
        int min = 10000;
        for (int i = 0; i < n; ++i) {
            final Class8935 class7561 = this.field29877[key.charAt(i)];
            if (class7561 != null) {
                min = Math.min(class7561.field37594, min);
            }
        }
        if (class7560 != null) {
            class7560.field29982 = new Short((short)min);
        }
        return min;
    }
    
    @Override
    public int getHeight(final String str) {
        Class7560 class7560 = null;
        if (this.field29875) {
            class7560 = this.field29882.get(str);
            if (class7560 != null) {
                if (class7560.field29984 != null) {
                    return class7560.field29984;
                }
            }
        }
        int n = 0;
        int max = 0;
        for (int i = 0; i < str.length(); ++i) {
            final char char1 = str.charAt(i);
            if (char1 != '\n') {
                if (char1 != ' ') {
                    final Class8935 class7561 = this.field29877[char1];
                    if (class7561 != null) {
                        max = Math.max(class7561.field37592 + class7561.field37594, max);
                    }
                }
            }
            else {
                ++n;
                max = 0;
            }
        }
        final int n2 = max + n * this.getLineHeight();
        if (class7560 != null) {
            class7560.field29984 = new Short((short)n2);
        }
        return n2;
    }
    
    @Override
    public int getWidth(final String str) {
        Class7560 class7560 = null;
        if (this.field29875) {
            class7560 = this.field29882.get(str);
            if (class7560 != null) {
                if (class7560.field29983 != null) {
                    return class7560.field29983;
                }
            }
        }
        int max = 0;
        int b = 0;
        Class8935 class7561 = null;
        for (int i = 0, length = str.length(); i < length; ++i) {
            final char char1 = str.charAt(i);
            if (char1 != '\n') {
                if (char1 < this.field29877.length) {
                    final Class8935 class7562 = this.field29877[char1];
                    if (class7562 != null) {
                        if (class7561 != null) {
                            b += class7561.method31695(char1);
                        }
                        class7561 = class7562;
                        if (i >= length - 1) {
                            b += class7562.field37591;
                        }
                        else {
                            b += class7562.field37595;
                        }
                        max = Math.max(max, b);
                    }
                }
            }
            else {
                b = 0;
            }
        }
        if (class7560 != null) {
            class7560.field29983 = new Short((short)max);
        }
        return max;
    }
    
    @Override
    public int getLineHeight() {
        return this.field29878;
    }
    
    static {
        Class7526.field29872 = Renderer.get();
    }
}
