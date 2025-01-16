// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import net.minecraft.client.util.JSONException;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.io.Closeable;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1926 implements Class1927, AutoCloseable
{
    private static final Logger field10502;
    private static final Class1880 field10503;
    private static Class1926 field10504;
    private static int field10505;
    private final Map<String, Object> field10506;
    private final List<String> field10507;
    private final List<Integer> field10508;
    private final List<Class1879> field10509;
    private final List<Integer> field10510;
    private final Map<String, Class1879> field10511;
    private final int field10512;
    private final String field10513;
    private final boolean field10514;
    private boolean field10515;
    private final Class9210 field10516;
    private final List<Integer> field10517;
    private final List<String> field10518;
    private final Class9331 field10519;
    private final Class9331 field10520;
    
    public Class1926(final Class6582 class6582, final String s) throws IOException {
        this.field10506 = Maps.newHashMap();
        this.field10507 = Lists.newArrayList();
        this.field10508 = Lists.newArrayList();
        this.field10509 = Lists.newArrayList();
        this.field10510 = Lists.newArrayList();
        this.field10511 = Maps.newHashMap();
        final ResourceLocation class6583 = new ResourceLocation("shaders/program/" + s + ".json");
        this.field10513 = s;
        Class1671 method19933 = null;
        try {
            method19933 = class6582.method19933(class6583);
            final JsonObject method19934 = Class9583.method35933(new InputStreamReader(method19933.method5887(), StandardCharsets.UTF_8));
            final String method19935 = Class9583.method35895(method19934, "vertex");
            final String method19936 = Class9583.method35895(method19934, "fragment");
            final JsonArray method19937 = Class9583.method35918(method19934, "samplers", null);
            if (method19937 != null) {
                int i = 0;
                for (final JsonElement jsonElement : method19937) {
                    try {
                        this.method7717(jsonElement);
                    }
                    catch (final Exception ex) {
                        final Class2355 method19938 = Class2355.method9495(ex);
                        method19938.method9493("samplers[" + i + "]");
                        throw method19938;
                    }
                    ++i;
                }
            }
            final JsonArray method19939 = Class9583.method35918(method19934, "attributes", null);
            if (method19939 != null) {
                int j = 0;
                this.field10517 = Lists.newArrayListWithCapacity(method19939.size());
                this.field10518 = Lists.newArrayListWithCapacity(method19939.size());
                for (final JsonElement jsonElement2 : method19939) {
                    try {
                        this.field10518.add(Class9583.method35894(jsonElement2, "attribute"));
                    }
                    catch (final Exception ex2) {
                        final Class2355 method19940 = Class2355.method9495(ex2);
                        method19940.method9493("attributes[" + j + "]");
                        throw method19940;
                    }
                    ++j;
                }
            }
            else {
                this.field10517 = null;
                this.field10518 = null;
            }
            final JsonArray method19941 = Class9583.method35918(method19934, "uniforms", null);
            if (method19941 != null) {
                int k = 0;
                for (final JsonElement jsonElement3 : method19941) {
                    try {
                        this.method7719(jsonElement3);
                    }
                    catch (final Exception ex3) {
                        final Class2355 method19942 = Class2355.method9495(ex3);
                        method19942.method9493("uniforms[" + k + "]");
                        throw method19942;
                    }
                    ++k;
                }
            }
            this.field10516 = method7710(Class9583.method35915(method19934, "blend", null));
            this.field10514 = Class9583.method35901(method19934, "cull", true);
            this.field10519 = method7709(class6582, Class2032.field11582, method19935);
            this.field10520 = method7709(class6582, Class2032.field11583, method19936);
            this.field10512 = Class7844.method25347();
            Class7844.method25348(this);
            this.method7716();
            if (this.field10518 != null) {
                final Iterator<String> iterator4 = this.field10518.iterator();
                while (iterator4.hasNext()) {
                    this.field10517.add(Class1879.method7158(this.field10512, iterator4.next()));
                }
            }
        }
        catch (final Exception ex4) {
            final Class2355 method19943 = Class2355.method9495(ex4);
            method19943.method9494(class6583.method7797());
            throw method19943;
        }
        finally {
            IOUtils.closeQuietly((Closeable)method19933);
        }
        this.method7713();
    }
    
    public static Class9331 method7709(final Class6582 class6582, final Class2032 class6583, final String str) throws IOException {
        Class9331 method34572 = class6583.method8094().get(str);
        if (method34572 == null) {
            final Class1671 method34573 = class6582.method19933(new ResourceLocation("shaders/program/" + str + class6583.method8092()));
            try {
                method34572 = Class9331.method34572(class6583, str, method34573.method5887());
            }
            finally {
                IOUtils.closeQuietly((Closeable)method34573);
            }
        }
        return method34572;
    }
    
    public static Class9210 method7710(final JsonObject jsonObject) {
        if (jsonObject == null) {
            return new Class9210();
        }
        int method33687 = 32774;
        int method33688 = 1;
        int method33689 = 0;
        int method33690 = 1;
        int method33691 = 0;
        int n = 1;
        boolean b = false;
        if (Class9583.method35887(jsonObject, "func")) {
            method33687 = Class9210.method33687(jsonObject.get("func").getAsString());
            if (method33687 != 32774) {
                n = 0;
            }
        }
        if (Class9583.method35887(jsonObject, "srcrgb")) {
            method33688 = Class9210.method33688(jsonObject.get("srcrgb").getAsString());
            if (method33688 != 1) {
                n = 0;
            }
        }
        if (Class9583.method35887(jsonObject, "dstrgb")) {
            method33689 = Class9210.method33688(jsonObject.get("dstrgb").getAsString());
            if (method33689 != 0) {
                n = 0;
            }
        }
        if (Class9583.method35887(jsonObject, "srcalpha")) {
            method33690 = Class9210.method33688(jsonObject.get("srcalpha").getAsString());
            if (method33690 != 1) {
                n = 0;
            }
            b = true;
        }
        if (Class9583.method35887(jsonObject, "dstalpha")) {
            method33691 = Class9210.method33688(jsonObject.get("dstalpha").getAsString());
            if (method33691 != 0) {
                n = 0;
            }
            b = true;
        }
        if (n == 0) {
            return (!b) ? new Class9210(method33688, method33689, method33687) : new Class9210(method33688, method33689, method33690, method33691, method33687);
        }
        return new Class9210();
    }
    
    @Override
    public void close() {
        final Iterator<Class1879> iterator = this.field10509.iterator();
        while (iterator.hasNext()) {
            iterator.next().close();
        }
        Class7844.method25346(this);
    }
    
    public void method7711() {
        RenderSystem.method29989(RenderSystem::method29984);
        Class7844.method25345(0);
        Class1926.field10505 = -1;
        Class1926.field10504 = null;
        for (int i = 0; i < this.field10508.size(); ++i) {
            if (this.field10506.get(this.field10507.get(i)) != null) {
                Class8933.method31608(33984 + i);
                Class8933.method31617(0);
            }
        }
    }
    
    public void method7712() {
        RenderSystem.method29989(RenderSystem::method29987);
        this.field10515 = false;
        Class1926.field10504 = this;
        this.field10516.method33685();
        if (this.field10512 != Class1926.field10505) {
            Class7844.method25345(this.field10512);
            Class1926.field10505 = this.field10512;
        }
        if (!this.field10514) {
            RenderSystem.method30029();
        }
        else {
            RenderSystem.method30028();
        }
        for (int i = 0; i < this.field10508.size(); ++i) {
            if (this.field10506.get(this.field10507.get(i)) != null) {
                RenderSystem.method30039(33984 + i);
                RenderSystem.enableTexture();
                final Object value = this.field10506.get(this.field10507.get(i));
                int n = -1;
                if (!(value instanceof Class6153)) {
                    if (!(value instanceof Class1666)) {
                        if (value instanceof Integer) {
                            n = (int)value;
                        }
                    }
                    else {
                        n = ((Class1666)value).method5869();
                    }
                }
                else {
                    n = ((Class6153)value).field24890;
                }
                if (n != -1) {
                    RenderSystem.method30044(n);
                    Class1879.method7157(Class1879.method7156(this.field10512, this.field10507.get(i)), i);
                }
            }
        }
        final Iterator<Class1879> iterator = this.field10509.iterator();
        while (iterator.hasNext()) {
            iterator.next().method7171();
        }
    }
    
    @Override
    public void method7713() {
        this.field10515 = true;
    }
    
    @Nullable
    public Class1879 method7714(final String s) {
        RenderSystem.method29989(RenderSystem::method29984);
        return this.field10511.get(s);
    }
    
    public Class1880 method7715(final String s) {
        RenderSystem.method29989(RenderSystem::method29987);
        final Class1879 method7714 = this.method7714(s);
        return (method7714 != null) ? method7714 : Class1926.field10503;
    }
    
    private void method7716() {
        RenderSystem.method29989(RenderSystem::method29984);
        for (int i = 0, n = 0; i < this.field10507.size(); ++i, ++n) {
            final String s = this.field10507.get(i);
            final int method7156 = Class1879.method7156(this.field10512, s);
            if (method7156 != -1) {
                this.field10508.add(method7156);
            }
            else {
                Class1926.field10502.warn("Shader {}could not find sampler named {} in the specified shader program.", (Object)this.field10513, (Object)s);
                this.field10506.remove(s);
                this.field10507.remove(n);
                --n;
            }
        }
        for (final Class1879 class1879 : this.field10509) {
            final String method7157 = class1879.method7162();
            final int method7158 = Class1879.method7156(this.field10512, method7157);
            if (method7158 != -1) {
                this.field10510.add(method7158);
                class1879.method7161(method7158);
                this.field10511.put(method7157, class1879);
            }
            else {
                Class1926.field10502.warn("Could not find uniform named {} in the specified shader program.", (Object)method7157);
            }
        }
    }
    
    private void method7717(final JsonElement jsonElement) {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "sampler");
        final String method35914 = Class9583.method35895(method35913, "name");
        if (Class9583.method35887(method35913, "file")) {
            this.field10507.add(method35914);
        }
        else {
            this.field10506.put(method35914, null);
            this.field10507.add(method35914);
        }
    }
    
    public void method7718(final String s, final Object o) {
        if (this.field10506.containsKey(s)) {
            this.field10506.remove(s);
        }
        this.field10506.put(s, o);
        this.method7713();
    }
    
    private void method7719(final JsonElement jsonElement) throws JSONException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "uniform");
        final String method35914 = Class9583.method35895(method35913, "name");
        final int method35915 = Class1879.method7160(Class9583.method35895(method35913, "type"));
        final int method35916 = Class9583.method35909(method35913, "count");
        final float[] array = new float[Math.max(method35916, 16)];
        final JsonArray method35917 = Class9583.method35917(method35913, "values");
        if (method35917.size() != method35916 && method35917.size() > 1) {
            throw new Class2355("Invalid amount of values specified (expected " + method35916 + ", found " + method35917.size() + ")");
        }
        int i = 0;
        for (final JsonElement jsonElement2 : method35917) {
            try {
                array[i] = Class9583.method35902(jsonElement2, "value");
            }
            catch (final Exception ex) {
                final Class2355 method35918 = Class2355.method9495(ex);
                method35918.method9493("values[" + i + "]");
                throw method35918;
            }
            ++i;
        }
        if (method35916 > 1 && method35917.size() == 1) {
            while (i < method35916) {
                array[i] = array[0];
                ++i;
            }
        }
        final Class1879 class1879 = new Class1879(method35914, method35915 + ((method35916 > 1 && method35916 <= 4 && method35915 < 8) ? (method35916 - 1) : 0), method35916, this);
        if (method35915 <= 3) {
            class1879.method7168((int)array[0], (int)array[1], (int)array[2], (int)array[3]);
        }
        else if (method35915 <= 7) {
            class1879.method7167(array[0], array[1], array[2], array[3]);
        }
        else {
            class1879.method7169(array);
        }
        this.field10509.add(class1879);
    }
    
    @Override
    public Class9331 method7720() {
        return this.field10519;
    }
    
    @Override
    public Class9331 method7721() {
        return this.field10520;
    }
    
    @Override
    public int method7722() {
        return this.field10512;
    }
    
    static {
        field10502 = LogManager.getLogger();
        field10503 = new Class1880();
        Class1926.field10505 = -1;
    }
}
