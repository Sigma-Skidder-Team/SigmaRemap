// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Class8871
{
    private Class6332 field37289;
    private int field37290;
    private int field37291;
    private int field37292;
    private int field37293;
    private Class8081<Class9009> field37294;
    private Class9009 field37295;
    private IntBuffer field37296;
    private IntBuffer field37297;
    private final int field37298;
    private int field37299;
    
    public Class8871(final Class6332 field37289) {
        this.field37289 = null;
        this.field37290 = Class8933.method31550();
        this.field37291 = 4096;
        this.field37292 = 0;
        this.field37294 = new Class8081<Class9009>();
        this.field37295 = null;
        this.field37296 = Config.method29016(this.field37291);
        this.field37297 = Config.method29016(this.field37291);
        this.field37298 = Class9237.field39607.method34194();
        this.field37299 = 7;
        this.field37289 = field37289;
        this.method31173();
        Class8933.method31683(Class8933.field37580, this.method31177(this.field37291), Class8933.field37581);
        this.method31175();
    }
    
    public void method31167(final ByteBuffer byteBuffer, final Class9009 class9009) {
        final int method32252 = class9009.method32252();
        final int method32253 = class9009.method32253();
        final int method32254 = this.method31178(byteBuffer.limit());
        if (method32254 > 0) {
            if (method32254 > method32253) {
                class9009.method32255(this.field37292);
                class9009.method32256(method32254);
                this.field37292 += method32254;
                if (method32252 >= 0) {
                    this.field37294.method26506(class9009.method32257());
                }
                this.field37294.method26504(class9009.method32257());
            }
            class9009.method32256(method32254);
            this.field37293 += method32254 - method32253;
            this.method31170(class9009.method32254());
            final long method32255 = this.method31177(class9009.method32252());
            this.method31173();
            Class8933.method31684(Class8933.field37580, method32255, byteBuffer);
            this.method31175();
            if (this.field37292 > this.field37293 * 11 / 10) {
                this.method31168(1);
            }
        }
        else if (method32252 >= 0) {
            class9009.method32255(-1);
            class9009.method32256(0);
            this.field37294.method26506(class9009.method32257());
            this.field37293 -= method32253;
        }
    }
    
    private void method31168(final int n) {
        if (!this.field37294.method26516()) {
            Class9009 field37295 = this.field37295;
            if (field37295 == null || !this.field37294.method26511(field37295.method32257())) {
                field37295 = this.field37294.method26513().method17537();
            }
            field37295.method32252();
            final Class9009 method32258 = field37295.method32258();
            int method32259;
            if (method32258 != null) {
                method32259 = method32258.method32254();
            }
            else {
                method32259 = 0;
            }
            int n2 = 0;
            while (field37295 != null && n2 < n) {
                ++n2;
                if (field37295.method32252() != method32259) {
                    if (field37295.method32253() > field37295.method32252() - method32259) {
                        this.method31170(this.field37292 + field37295.method32253());
                        this.method31171(field37295.method32252(), this.field37292, field37295.method32253());
                        field37295.method32255(this.field37292);
                        this.field37292 += field37295.method32253();
                        final Class9009 method32260 = field37295.method32259();
                        this.field37294.method26506(field37295.method32257());
                        this.field37294.method26504(field37295.method32257());
                        field37295 = method32260;
                    }
                    else {
                        this.method31171(field37295.method32252(), method32259, field37295.method32253());
                        field37295.method32255(method32259);
                        method32259 += field37295.method32253();
                        field37295 = field37295.method32259();
                    }
                }
                else {
                    method32259 += field37295.method32253();
                    field37295 = field37295.method32259();
                }
            }
            if (field37295 == null) {
                this.field37292 = this.field37294.method26514().method17537().method32254();
            }
            this.field37295 = field37295;
        }
    }
    
    private void method31169() {
        int i = 0;
        int j = 0;
        Class9009 method32259 = this.field37294.method26513().method17537();
        while (method32259 != null) {
            ++i;
            j += method32259.method32253();
            if (method32259.method32252() >= 0) {
                if (method32259.method32253() > 0) {
                    if (method32259.method32254() <= this.field37292) {
                        final Class9009 method32260 = method32259.method32258();
                        if (method32260 != null && method32259.method32252() < method32260.method32254()) {
                            throw new RuntimeException("Invalid range: " + method32259);
                        }
                        final Class9009 method32261 = method32259.method32259();
                        if (method32261 != null && method32259.method32254() > method32261.method32252()) {
                            throw new RuntimeException("Invalid range: " + method32259);
                        }
                        method32259 = method32259.method32259();
                        continue;
                    }
                }
            }
            throw new RuntimeException("Invalid range: " + method32259);
        }
        if (i != this.field37294.method26515()) {
            throw new RuntimeException("Invalid count: " + i + " <> " + this.field37294.method26515());
        }
        if (j == this.field37293) {
            return;
        }
        throw new RuntimeException("Invalid size: " + j + " <> " + this.field37293);
    }
    
    private void method31170(final int n) {
        if (this.field37291 < n) {
            this.method31172(n);
        }
    }
    
    private void method31171(final int n, final int n2, final int n3) {
        final long method31177 = this.method31177(n);
        final long method31178 = this.method31177(n2);
        final long method31179 = this.method31177(n3);
        Class8933.method31551(Class8933.field37578, this.field37290);
        Class8933.method31551(Class8933.field37579, this.field37290);
        Class8933.method31685(Class8933.field37578, Class8933.field37579, method31177, method31178, method31179);
        Config.method28942("Copy VBO range");
        Class8933.method31551(Class8933.field37578, 0);
        Class8933.method31551(Class8933.field37579, 0);
    }
    
    private void method31172(final int n) {
        int i;
        for (i = this.field37291 * 6 / 4; i < n; i = i * 6 / 4) {}
        final long method31177 = this.method31177(this.field37291);
        final long method31178 = this.method31177(i);
        final int method31179 = Class8933.method31550();
        Class8933.method31551(Class8933.field37580, method31179);
        Class8933.method31683(Class8933.field37580, method31178, Class8933.field37581);
        Config.method28942("Expand VBO");
        Class8933.method31551(Class8933.field37580, 0);
        Class8933.method31551(Class8933.field37578, this.field37290);
        Class8933.method31551(Class8933.field37579, method31179);
        Class8933.method31685(Class8933.field37578, Class8933.field37579, 0L, 0L, method31177);
        Config.method28942("Copy VBO: " + method31178);
        Class8933.method31551(Class8933.field37578, 0);
        Class8933.method31551(Class8933.field37579, 0);
        Class8933.method31553(this.field37290);
        this.field37296 = Config.method29016(i);
        this.field37297 = Config.method29016(i);
        this.field37290 = method31179;
        this.field37291 = i;
    }
    
    public void method31173() {
        Class8933.method31551(Class8933.field37580, this.field37290);
    }
    
    public void method31174(final int n, final Class9009 class9009) {
        if (this.field37299 != n) {
            if (this.field37296.position() > 0) {
                throw new IllegalArgumentException("Mixed region draw modes: " + this.field37299 + " != " + n);
            }
            this.field37299 = n;
        }
        this.field37296.put(class9009.method32252());
        this.field37297.put(class9009.method32253());
    }
    
    public void method31175() {
        Class8933.method31551(Class8933.field37580, 0);
    }
    
    public void method31176() {
        if (this.field37290 >= 0) {
            Class8933.method31553(this.field37290);
            this.field37290 = -1;
        }
    }
    
    private long method31177(final int n) {
        return n * (long)this.field37298;
    }
    
    private int method31178(final long n) {
        return (int)(n / this.field37298);
    }
    
    public int method31179() {
        return this.field37292;
    }
}
