// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.http.Header;
import java.time.Duration;
import java.util.function.Function;
import com.google.gson.JsonElement;
import java.util.Optional;
import com.google.gson.JsonParser;
import org.apache.http.util.EntityUtils;
import java.io.FileNotFoundException;
import org.apache.http.HttpEntity;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpPost;
import java.util.function.Consumer;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.config.RequestConfig;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class7585
{
    private static final Logger field30094;
    private final File field30095;
    private final long field30096;
    private final int field30097;
    private final Class7444 field30098;
    private final String field30099;
    private final String field30100;
    private final String field30101;
    private final Class8908 field30102;
    private final AtomicBoolean field30103;
    private CompletableFuture<Class9435> field30104;
    private final RequestConfig field30105;
    
    public Class7585(final File field30095, final long field30096, final int field30097, final Class7444 field30098, final String field30099, final String field30100, final String field30101, final Class8908 field30102) {
        this.field30103 = new AtomicBoolean(false);
        this.field30105 = RequestConfig.custom().setSocketTimeout((int)TimeUnit.MINUTES.toMillis(10L)).setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L)).build();
        this.field30095 = field30095;
        this.field30096 = field30096;
        this.field30097 = field30097;
        this.field30098 = field30098;
        this.field30099 = field30099;
        this.field30100 = field30100;
        this.field30101 = field30101;
        this.field30102 = field30102;
    }
    
    public void method23862(final Consumer<Class9435> action) {
        if (this.field30104 == null) {
            (this.field30104 = CompletableFuture.supplyAsync(() -> this.method23864(0))).thenAccept(action);
        }
    }
    
    public void method23863() {
        this.field30103.set(true);
        if (this.field30104 != null) {
            this.field30104.cancel(false);
            this.field30104 = null;
        }
    }
    
    private Class9435 method23864(final int n) {
        final Class8612 class8612 = new Class8612();
        if (this.field30103.get()) {
            return class8612.method29207();
        }
        this.field30102.field37452 = this.field30095.length();
        final HttpPost httpPost = new HttpPost("http://" + this.field30098.method22892() + ":" + this.field30098.method22895() + "/upload/" + this.field30096 + "/" + this.field30097);
        final CloseableHttpClient build = HttpClientBuilder.create().setDefaultRequestConfig(this.field30105).build();
        Class9435 method23871;
        try {
            this.method23866(httpPost);
            final CloseableHttpResponse execute = build.execute(httpPost);
            final long method23870 = this.method23870(execute);
            if (!this.method23868(method23870, n)) {
                this.method23867(execute, class8612);
                return class8612.method29207();
            }
            method23871 = this.method23869(method23870, n);
            return method23871;
        }
        catch (final Exception ex) {
            if (!this.field30103.get()) {
                Class7585.field30094.error("Caught exception while uploading: ", ex);
            }
            return class8612.method29207();
        }
        finally {
            this.method23865(httpPost, build);
        }
        return method23871;
    }
    
    private void method23865(final HttpPost httpPost, final CloseableHttpClient closeableHttpClient) {
        httpPost.releaseConnection();
        if (closeableHttpClient != null) {
            try {
                closeableHttpClient.close();
            }
            catch (final IOException ex) {
                Class7585.field30094.error("Failed to close Realms upload client");
            }
        }
    }
    
    private void method23866(final HttpPost httpPost) throws FileNotFoundException {
        httpPost.setHeader("Cookie", "sid=" + this.field30099 + ";token=" + this.field30098.method22891() + ";user=" + this.field30100 + ";version=" + this.field30101);
        final Class9534 entity = new Class9534(new FileInputStream(this.field30095), this.field30095.length(), this.field30102);
        entity.setContentType("application/octet-stream");
        httpPost.setEntity(entity);
    }
    
    private void method23867(final HttpResponse httpResponse, final Class8612 class8612) throws IOException {
        final int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 401) {
            Class7585.field30094.debug("Realms server returned 401: " + httpResponse.getFirstHeader("WWW-Authenticate"));
        }
        class8612.method29205(statusCode);
        if (httpResponse.getEntity() != null) {
            final String string = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            if (string != null) {
                try {
                    class8612.method29206(Optional.ofNullable(new JsonParser().parse(string).getAsJsonObject().get("errorMsg")).map((Function<? super JsonElement, ?>)JsonElement::getAsString).orElse(null));
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    private boolean method23868(final long n, final int n2) {
        return n > 0L && n2 + 1 < 5;
    }
    
    private Class9435 method23869(final long seconds, final int n) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(seconds).toMillis());
        return this.method23864(n + 1);
    }
    
    private long method23870(final HttpResponse httpResponse) {
        return Optional.ofNullable(httpResponse.getFirstHeader("Retry-After")).map((Function<? super Header, ?>)Header::getValue).map((Function<? super Object, ? extends Long>)Long::valueOf).orElse(0L);
    }
    
    public boolean method23871() {
        return this.field30104.isDone() || this.field30104.isCancelled();
    }
    
    static {
        field30094 = LogManager.getLogger();
    }
}
