// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Iterator;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.newdawn.slick.SlickException;
import java.util.ArrayList;
import java.util.List;

public class Class8552
{
    private int field35913;
    private boolean field35914;
    private boolean field35915;
    private int field35916;
    private int field35917;
    private int field35918;
    private int field35919;
    private int field35920;
    private int field35921;
    private int field35922;
    private int field35923;
    private final List field35924;
    
    public Class8552() {
        this.field35913 = 12;
        this.field35914 = false;
        this.field35915 = false;
        this.field35922 = 512;
        this.field35923 = 512;
        this.field35924 = new ArrayList();
    }
    
    public Class8552(final String s) throws SlickException {
        this(Class8834.method30851(s));
    }
    
    public Class8552(final InputStream in) throws SlickException {
        this.field35913 = 12;
        this.field35914 = false;
        this.field35915 = false;
        this.field35922 = 512;
        this.field35923 = 512;
        this.field35924 = new ArrayList();
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                final String trim = line.trim();
                if (trim.length() == 0) {
                    continue;
                }
                final String[] split = trim.split("=", 2);
                final String trim2 = split[0].trim();
                final String str = split[1];
                if (trim2.equals("font.size")) {
                    this.field35913 = Integer.parseInt(str);
                }
                else if (trim2.equals("font.bold")) {
                    this.field35914 = Boolean.valueOf(str);
                }
                else if (trim2.equals("font.italic")) {
                    this.field35915 = Boolean.valueOf(str);
                }
                else if (trim2.equals("pad.top")) {
                    this.field35916 = Integer.parseInt(str);
                }
                else if (trim2.equals("pad.right")) {
                    this.field35919 = Integer.parseInt(str);
                }
                else if (trim2.equals("pad.bottom")) {
                    this.field35918 = Integer.parseInt(str);
                }
                else if (trim2.equals("pad.left")) {
                    this.field35917 = Integer.parseInt(str);
                }
                else if (trim2.equals("pad.advance.x")) {
                    this.field35920 = Integer.parseInt(str);
                }
                else if (trim2.equals("pad.advance.y")) {
                    this.field35921 = Integer.parseInt(str);
                }
                else if (trim2.equals("glyph.page.width")) {
                    this.field35922 = Integer.parseInt(str);
                }
                else if (trim2.equals("glyph.page.height")) {
                    this.field35923 = Integer.parseInt(str);
                }
                else {
                    if (trim2.equals("effect.class")) {
                        try {
                            this.field35924.add(Class.forName(str).newInstance());
                            continue;
                        }
                        catch (final Exception ex) {
                            throw new Class2324("Unable to create effect instance: " + str, ex);
                        }
                    }
                    if (!trim2.startsWith("effect.")) {
                        continue;
                    }
                    final String substring = trim2.substring(7);
                    final Class6894 class6894 = this.field35924.get(this.field35924.size() - 1);
                    final List method21204 = class6894.method21204();
                    for (final Class5484 class6895 : method21204) {
                        if (class6895.method16731().equals(substring)) {
                            class6895.method16729(str);
                            break;
                        }
                    }
                    class6894.method21205(method21204);
                }
            }
            bufferedReader.close();
        }
        catch (final Exception ex2) {
            throw new Class2324("Unable to load Hiero font file", ex2);
        }
    }
    
    public int method28721() {
        return this.field35916;
    }
    
    public void method28722(final int field35916) {
        this.field35916 = field35916;
    }
    
    public int method28723() {
        return this.field35917;
    }
    
    public void method28724(final int field35917) {
        this.field35917 = field35917;
    }
    
    public int method28725() {
        return this.field35918;
    }
    
    public void method28726(final int field35918) {
        this.field35918 = field35918;
    }
    
    public int method28727() {
        return this.field35919;
    }
    
    public void method28728(final int field35919) {
        this.field35919 = field35919;
    }
    
    public int method28729() {
        return this.field35920;
    }
    
    public void method28730(final int field35920) {
        this.field35920 = field35920;
    }
    
    public int method28731() {
        return this.field35921;
    }
    
    public void method28732(final int field35921) {
        this.field35921 = field35921;
    }
    
    public int method28733() {
        return this.field35922;
    }
    
    public void method28734(final int field35922) {
        this.field35922 = field35922;
    }
    
    public int method28735() {
        return this.field35923;
    }
    
    public void method28736(final int field35923) {
        this.field35923 = field35923;
    }
    
    public int method28737() {
        return this.field35913;
    }
    
    public void method28738(final int field35913) {
        this.field35913 = field35913;
    }
    
    public boolean method28739() {
        return this.field35914;
    }
    
    public void method28740(final boolean field35914) {
        this.field35914 = field35914;
    }
    
    public boolean method28741() {
        return this.field35915;
    }
    
    public void method28742(final boolean field35915) {
        this.field35915 = field35915;
    }
    
    public List method28743() {
        return this.field35924;
    }
    
    public void method28744(final File file) throws IOException {
        final PrintStream printStream = new PrintStream(new FileOutputStream(file));
        printStream.println("font.size=" + this.field35913);
        printStream.println("font.bold=" + this.field35914);
        printStream.println("font.italic=" + this.field35915);
        printStream.println();
        printStream.println("pad.top=" + this.field35916);
        printStream.println("pad.right=" + this.field35919);
        printStream.println("pad.bottom=" + this.field35918);
        printStream.println("pad.left=" + this.field35917);
        printStream.println("pad.advance.x=" + this.field35920);
        printStream.println("pad.advance.y=" + this.field35921);
        printStream.println();
        printStream.println("glyph.page.width=" + this.field35922);
        printStream.println("glyph.page.height=" + this.field35923);
        printStream.println();
        for (final Class6894 class6894 : this.field35924) {
            printStream.println("effect.class=" + class6894.getClass().getName());
            for (final Class5484 class6895 : class6894.method21204()) {
                printStream.println("effect." + class6895.method16731() + "=" + class6895.method16730());
            }
            printStream.println();
        }
        printStream.close();
    }
}
