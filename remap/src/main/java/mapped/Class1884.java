// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileNotFoundException;
import net.minecraft.client.util.JSONException;
import java.util.Iterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.Closeable;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonElement;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;

public class Class1884 implements AutoCloseable
{
    private final Class6153 field10252;
    private final Class6582 field10253;
    private final String field10254;
    public final List<Class1919> field10255;
    private final Map<String, Class6153> field10256;
    private final List<Class6153> field10257;
    private Class6789 field10258;
    private int field10259;
    private int field10260;
    private float field10261;
    private float field10262;
    
    public Class1884(final Class1663 class1663, final Class6582 field10253, final Class6153 field10254, final Class1932 class1664) throws IOException, JsonSyntaxException {
        this.field10255 = Lists.newArrayList();
        this.field10256 = Maps.newHashMap();
        this.field10257 = Lists.newArrayList();
        this.field10253 = field10253;
        this.field10252 = field10254;
        this.field10261 = 0.0f;
        this.field10262 = 0.0f;
        this.field10259 = field10254.field24886;
        this.field10260 = field10254.field24887;
        this.field10254 = class1664.toString();
        this.method7245();
        this.method7238(class1663, class1664);
    }
    
    private void method7238(final Class1663 class1663, final Class1932 class1664) throws IOException, JsonSyntaxException {
        Class1671 method19933 = null;
        try {
            method19933 = this.field10253.method19933(class1664);
            final JsonObject method19934 = Class9583.method35933(new InputStreamReader(method19933.method5887(), StandardCharsets.UTF_8));
            if (Class9583.method35891(method19934, "targets")) {
                final JsonArray asJsonArray = method19934.getAsJsonArray("targets");
                int i = 0;
                for (final JsonElement jsonElement : asJsonArray) {
                    try {
                        this.method7239(jsonElement);
                    }
                    catch (final Exception ex) {
                        final Class2355 method19935 = Class2355.method9495(ex);
                        method19935.method9493("targets[" + i + "]");
                        throw method19935;
                    }
                    ++i;
                }
            }
            if (Class9583.method35891(method19934, "passes")) {
                final JsonArray asJsonArray2 = method19934.getAsJsonArray("passes");
                int j = 0;
                for (final JsonElement jsonElement2 : asJsonArray2) {
                    try {
                        this.method7240(class1663, jsonElement2);
                    }
                    catch (final Exception ex2) {
                        final Class2355 method19936 = Class2355.method9495(ex2);
                        method19936.method9493("passes[" + j + "]");
                        throw method19936;
                    }
                    ++j;
                }
            }
        }
        catch (final Exception ex3) {
            final Class2355 method19937 = Class2355.method9495(ex3);
            method19937.method9494(class1664.method7797());
            throw method19937;
        }
        finally {
            IOUtils.closeQuietly((Closeable)method19933);
        }
    }
    
    private void method7239(final JsonElement jsonElement) throws JSONException {
        if (!Class9583.method35888(jsonElement)) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "target");
            final String method35914 = Class9583.method35895(method35913, "name");
            final int method35915 = Class9583.method35910(method35913, "width", this.field10259);
            final int method35916 = Class9583.method35910(method35913, "height", this.field10260);
            if (this.field10256.containsKey(method35914)) {
                throw new Class2355(method35914 + " is already defined");
            }
            this.method7243(method35914, method35915, method35916);
        }
        else {
            this.method7243(jsonElement.getAsString(), this.field10259, this.field10260);
        }
    }
    
    private void method7240(final Class1663 class1663, final JsonElement jsonElement) throws IOException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "pass");
        final String method35914 = Class9583.method35895(method35913, "name");
        final String method35915 = Class9583.method35895(method35913, "intarget");
        final String method35916 = Class9583.method35895(method35913, "outtarget");
        final Class6153 method35917 = this.method7249(method35915);
        final Class6153 method35918 = this.method7249(method35916);
        if (method35917 == null) {
            throw new Class2355("Input target '" + method35915 + "' does not exist");
        }
        if (method35918 == null) {
            throw new Class2355("Output target '" + method35916 + "' does not exist");
        }
        final Class1919 method35919 = this.method7244(method35914, method35917, method35918);
        final JsonArray method35920 = Class9583.method35918(method35913, "auxtargets", null);
        if (method35920 != null) {
            int i = 0;
            for (final JsonElement jsonElement2 : method35920) {
                try {
                    final JsonObject method35921 = Class9583.method35913(jsonElement2, "auxtarget");
                    final String method35922 = Class9583.method35895(method35921, "name");
                    final String method35923 = Class9583.method35895(method35921, "id");
                    final Class6153 method35924 = this.method7249(method35923);
                    if (method35924 == null) {
                        final Class1932 class1664 = new Class1932("textures/effect/" + method35923 + ".png");
                        Closeable method35925 = null;
                        try {
                            method35925 = this.field10253.method19933(class1664);
                        }
                        catch (final FileNotFoundException ex) {
                            throw new Class2355("Render target or texture '" + method35923 + "' does not exist");
                        }
                        finally {
                            IOUtils.closeQuietly(method35925);
                        }
                        class1663.method5849(class1664);
                        final Class1666 method35926 = class1663.method5853(class1664);
                        final int method35927 = Class9583.method35909(method35921, "width");
                        final int method35928 = Class9583.method35909(method35921, "height");
                        if (Class9583.method35900(method35921, "bilinear")) {
                            Class8726.method30042(3553, 10241, 9729);
                            Class8726.method30042(3553, 10240, 9729);
                        }
                        else {
                            Class8726.method30042(3553, 10241, 9728);
                            Class8726.method30042(3553, 10240, 9728);
                        }
                        method35919.method7602(method35922, method35926.method5869(), method35927, method35928);
                    }
                    else {
                        method35919.method7602(method35922, method35924, method35924.field24884, method35924.field24885);
                    }
                }
                catch (final Exception ex2) {
                    final Class2355 method35929 = Class2355.method9495(ex2);
                    method35929.method9493("auxtargets[" + i + "]");
                    throw method35929;
                }
                ++i;
            }
        }
        final JsonArray method35930 = Class9583.method35918(method35913, "uniforms", null);
        if (method35930 != null) {
            int j = 0;
            for (final JsonElement jsonElement3 : method35930) {
                try {
                    this.method7241(jsonElement3);
                }
                catch (final Exception ex3) {
                    final Class2355 method35931 = Class2355.method9495(ex3);
                    method35931.method9493("uniforms[" + j + "]");
                    throw method35931;
                }
                ++j;
            }
        }
    }
    
    private void method7241(final JsonElement jsonElement) throws JSONException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "uniform");
        final String method35914 = Class9583.method35895(method35913, "name");
        final Class1879 method35915 = this.field10255.get(this.field10255.size() - 1).method7605().method7714(method35914);
        if (method35915 == null) {
            throw new Class2355("Uniform '" + method35914 + "' does not exist");
        }
        final float[] array = new float[4];
        int i = 0;
        for (final JsonElement jsonElement2 : Class9583.method35917(method35913, "values")) {
            try {
                array[i] = Class9583.method35902(jsonElement2, "value");
            }
            catch (final Exception ex) {
                final Class2355 method35916 = Class2355.method9495(ex);
                method35916.method9493("values[" + i + "]");
                throw method35916;
            }
            ++i;
        }
        switch (i) {
            case 1: {
                method35915.method7163(array[0]);
                break;
            }
            case 2: {
                method35915.method7164(array[0], array[1]);
                break;
            }
            case 3: {
                method35915.method7165(array[0], array[1], array[2]);
                break;
            }
            case 4: {
                method35915.method7166(array[0], array[1], array[2], array[3]);
                break;
            }
        }
    }
    
    public Class6153 method7242(final String s) {
        return this.field10256.get(s);
    }
    
    public void method7243(final String s, final int n, final int n2) {
        final Class6153 class6153 = new Class6153(n, n2, true, Class869.field4623);
        class6153.method18398(0.0f, 0.0f, 0.0f, 0.0f);
        this.field10256.put(s, class6153);
        if (n == this.field10259) {
            if (n2 == this.field10260) {
                this.field10257.add(class6153);
            }
        }
    }
    
    @Override
    public void close() {
        final Iterator<Class6153> iterator = this.field10256.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method18389();
        }
        final Iterator<Class1919> iterator2 = this.field10255.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().close();
        }
        this.field10255.clear();
    }
    
    public Class1919 method7244(final String s, final Class6153 class6153, final Class6153 class6154) throws IOException {
        final Class1919 class6155 = new Class1919(this.field10253, s, class6153, class6154);
        this.field10255.add(this.field10255.size(), class6155);
        return class6155;
    }
    
    private void method7245() {
        this.field10258 = Class6789.method20756((float)this.field10252.field24884, (float)this.field10252.field24885, 0.1f, 1000.0f);
    }
    
    public void method7246(final int n, final int n2) {
        this.field10259 = this.field10252.field24884;
        this.field10260 = this.field10252.field24885;
        this.method7245();
        final Iterator<Class1919> iterator = this.field10255.iterator();
        while (iterator.hasNext()) {
            iterator.next().method7603(this.field10258);
        }
        final Iterator<Class6153> iterator2 = this.field10257.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().method18387(n, n2, Class869.field4623);
        }
    }
    
    public void method7247(final float field10262) {
        if (field10262 >= this.field10262) {
            this.field10261 += field10262 - this.field10262;
        }
        else {
            this.field10261 += 1.0f - this.field10262;
            this.field10261 += field10262;
        }
        this.field10262 = field10262;
        while (this.field10261 > 20.0f) {
            this.field10261 -= 20.0f;
        }
        final Iterator<Class1919> iterator = this.field10255.iterator();
        while (iterator.hasNext()) {
            iterator.next().method7604(this.field10261 / 20.0f);
        }
    }
    
    public final String method7248() {
        return this.field10254;
    }
    
    public Class6153 method7249(final String s) {
        if (s != null) {
            return s.equals("minecraft:main") ? this.field10252 : this.field10256.get(s);
        }
        return null;
    }
}
