// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.HttpURLConnection;
import org.apache.logging.log4j.LogManager;
import java.io.ByteArrayInputStream;
import java.net.Proxy;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class1768 extends Class1767
{
    private static final Logger field9834;
    private final File field9835;
    private final String field9836;
    private final boolean field9837;
    private final Runnable field9838;
    private CompletableFuture<?> field9839;
    private boolean field9840;
    public Boolean field9841;
    public boolean field9842;
    private boolean field9843;
    
    public Class1768(final File field9835, final String field9836, final ResourceLocation class1932, final boolean field9837, final Runnable field9838) {
        super(class1932);
        this.field9841 = null;
        this.field9842 = false;
        this.field9843 = false;
        this.field9835 = field9835;
        this.field9836 = field9836;
        this.field9837 = field9837;
        this.field9838 = field9838;
    }
    
    private void method6300(Class1846 method5610) {
        if (this.field9838 instanceof Class1112) {
            final Class1112 class1112 = (Class1112)this.field9838;
            method5610 = class1112.method5610(method5610);
            class1112.method5611();
        }
        this.method6301(method5610);
    }
    
    private void method6301(final Class1846 class1846) {
        if (this.field9838 != null) {
            this.field9838.run();
        }
        Minecraft.method5277().execute(() -> {
            this.field9840 = true;
            if (RenderSystem.method29984()) {
                this.method6302(class1847);
            }
            else {
                RenderSystem.method29991(() -> this.method6302(class1847));
            }
        });
    }
    
    private void method6302(final Class1846 class1846) {
        Class8995.method32103(this.method5869(), class1846.method6644(), class1846.method6645());
        class1846.method6652(0, 0, 0, true);
        this.field9841 = (class1846 != null);
    }
    
    @Override
    public void method5871(final Class6582 class6582) throws IOException {
        Minecraft.method5277().execute(() -> {
            if (!this.field9840) {
                try {
                    super.method5871(class6583);
                }
                catch (final IOException ex) {
                    Class1768.field9834.warn("Failed to load texture: {}", (Object)this.field9830, (Object)ex);
                }
                this.field9840 = true;
            }
            return;
        });
        if (this.field9839 == null) {
            Class1846 method6303;
            if (this.field9835 != null && this.field9835.isFile()) {
                Class1768.field9834.debug("Loading http texture from local cache ({})", (Object)this.field9835);
                method6303 = this.method6303(new FileInputStream(this.field9835));
            }
            else {
                method6303 = null;
            }
            if (method6303 == null) {
                this.field9839 = CompletableFuture.runAsync(() -> {
                    Class1768.field9834.debug("Downloading http texture from {} to {}", (Object)this.field9836, (Object)this.field9835);
                    if (this.method6304()) {
                        this.method6305();
                    }
                    else {
                        try {
                            final URLConnection urlConnection = new URL(this.field9836).openConnection(Minecraft.method5277().method5289());
                            urlConnection.setDoInput(true);
                            urlConnection.setDoOutput(false);
                            urlConnection.connect();
                            if (((HttpURLConnection)urlConnection).getResponseCode() / 100 != 2) {
                                if (((HttpURLConnection)urlConnection).getErrorStream() != null) {
                                    Config.method28961(((HttpURLConnection)urlConnection).getErrorStream());
                                }
                            }
                            else {
                                if (this.field9835 != null) {
                                    FileUtils.copyInputStreamToFile(urlConnection.getInputStream(), this.field9835);
                                    final InputStream inputStream = new FileInputStream(this.field9835);
                                }
                                else {
                                    final InputStream inputStream = urlConnection.getInputStream();
                                }
                                Minecraft.method5277().execute(() -> {
                                    this.method6303(inputStream2);
                                    final Class1846 class6584;
                                    if (class6584 != null) {
                                        this.method6300(class6584);
                                        this.method6306();
                                    }
                                    return;
                                });
                                this.field9843 = true;
                            }
                        }
                        catch (final Exception ex2) {
                            Class1768.field9834.error("Couldn't download http texture", (Throwable)ex2);
                        }
                        finally {
                            final URLConnection urlConnection;
                            if (urlConnection != null) {
                                ((HttpURLConnection)urlConnection).disconnect();
                            }
                            this.method6306();
                        }
                    }
                }, Util.method27841());
            }
            else {
                this.method6300(method6303);
                this.method6306();
            }
        }
    }
    
    @Nullable
    private Class1846 method6303(final InputStream inputStream) {
        Class1846 class1846 = null;
        try {
            class1846 = Class1846.method6637(inputStream);
            if (this.field9837) {
                class1846 = method6308(class1846);
            }
        }
        catch (final IOException ex) {
            Class1768.field9834.warn("Error while loading the skin texture", (Throwable)ex);
        }
        return class1846;
    }
    
    private boolean method6304() {
        if (this.field9842) {
            final Proxy method5289 = Minecraft.method5277().method5289();
            return (method5289.type() == Proxy.Type.DIRECT || method5289.type() == Proxy.Type.SOCKS) && this.field9836.startsWith("http://");
        }
        return false;
    }
    
    private void method6305() {
        try {
            final Class8215 method19926 = Class6579.method19926(Class6579.method19919(this.field9836, Minecraft.method5277().method5289()));
            if (method19926.method27216() / 100 != 2) {
                return;
            }
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(method19926.method27220());
            Class1846 class1846;
            if (this.field9835 != null) {
                FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, this.field9835);
                class1846 = Class1846.method6637(new FileInputStream(this.field9835));
            }
            else {
                class1846 = Class1846.method6637(byteArrayInputStream);
            }
            this.method6300(class1846);
            this.field9843 = true;
        }
        catch (final Exception ex) {
            Class1768.field9834.error("Couldn't download http texture: " + ex.getClass().getName() + ": " + ex.getMessage());
        }
        finally {
            this.method6306();
        }
    }
    
    private void method6306() {
        if (!this.field9843) {
            if (this.field9838 instanceof Class1112) {
                ((Class1112)this.field9838).method5612();
            }
        }
    }
    
    public Runnable method6307() {
        return this.field9838;
    }
    
    private static Class1846 method6308(Class1846 class1846) {
        final boolean b = class1846.method6645() == 32;
        if (b) {
            final Class1846 class1847 = new Class1846(64, 64, true);
            class1847.method6662(class1846);
            class1846.close();
            class1846 = class1847;
            class1847.method6663(0, 32, 64, 32, 0);
            class1847.method6664(4, 16, 16, 32, 4, 4, true, false);
            class1847.method6664(8, 16, 16, 32, 4, 4, true, false);
            class1847.method6664(0, 20, 24, 32, 4, 12, true, false);
            class1847.method6664(4, 20, 16, 32, 4, 12, true, false);
            class1847.method6664(8, 20, 8, 32, 4, 12, true, false);
            class1847.method6664(12, 20, 16, 32, 4, 12, true, false);
            class1847.method6664(44, 16, -8, 32, 4, 4, true, false);
            class1847.method6664(48, 16, -8, 32, 4, 4, true, false);
            class1847.method6664(40, 20, 0, 32, 4, 12, true, false);
            class1847.method6664(44, 20, -8, 32, 4, 12, true, false);
            class1847.method6664(48, 20, -16, 32, 4, 12, true, false);
            class1847.method6664(52, 20, -8, 32, 4, 12, true, false);
        }
        method6310(class1846, 0, 0, 32, 16);
        if (b) {
            method6309(class1846, 32, 0, 64, 32);
        }
        method6310(class1846, 0, 16, 64, 32);
        method6310(class1846, 16, 48, 48, 64);
        return class1846;
    }
    
    private static void method6309(final Class1846 class1846, final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                if ((class1846.method6647(i, j) >> 24 & 0xFF) < 128) {
                    return;
                }
            }
        }
        for (int k = n; k < n3; ++k) {
            for (int l = n2; l < n4; ++l) {
                class1846.method6648(k, l, class1846.method6647(k, l) & 0xFFFFFF);
            }
        }
    }
    
    private static void method6310(final Class1846 class1846, final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                class1846.method6648(i, j, class1846.method6647(i, j) | 0xFF000000);
            }
        }
    }
    
    static {
        field9834 = LogManager.getLogger();
    }
}
