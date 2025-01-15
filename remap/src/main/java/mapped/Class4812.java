// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.http.HttpResponse;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import java.util.Iterator;

public class Class4812 extends Class4803
{
    public Class9572 field20581;
    public Class4817 field20582;
    private static Class88 field20583;
    
    public Class4812(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        this.field20581 = new Class9572(380, 200, Class2186.field12965);
        this.method14311(false);
        (this.field20582 = new Class4817(this, "scroll", 100, 200, n3 - 200, n4 - 200)).method14397(true);
        this.method14242(this.field20582);
        new Thread(() -> this.method14363(this.method14364())).start();
    }
    
    public void method14363(final Class88 class88) {
        if (class88 != null) {
            this.method14267().method14225(new Class998(this, class88));
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20582 == null) {
            return;
        }
        if (this.method14304() && this.method14296()) {
            for (final Class4805 class4805 : this.field20582.method14396().method14250()) {
                class4805.field20522.method35855(Class2186.field12964);
                if (class4805.field20522.method35858() >= 0.5) {
                    continue;
                }
                break;
            }
            return;
        }
        final Iterator<Class4803> iterator2 = this.field20582.method14396().method14250().iterator();
        while (iterator2.hasNext()) {
            ((Class4805)iterator2.next()).field20522.method35855(Class2186.field12965);
        }
    }
    
    @Override
    public void method14205(float n) {
        this.field20581.method35855(this.method14304() ? Class2186.field12964 : Class2186.field12965);
        n *= this.field20581.method35858();
        float method31033 = Class8862.method31033(this.field20581.method35858(), 0.17, 1.0, 0.51, 1.0);
        if (this.field20581.method35857() == Class2186.field12965) {
            method31033 = 1.0f;
        }
        this.method14294((int)(150.0f * (1.0f - method31033)));
        this.method14228();
        Class8154.method26889(Class9400.field40319, 100.0f, 100.0f, "Changelog", Class6430.method19118(Class265.field1278.field1292, n));
        Class8154.method26889(Class9400.field40314, 100.0f, 150.0f, "You're currently using Sigma 5.0.0", Class6430.method19118(Class265.field1278.field1292, 0.6f * n));
        super.method14205(n);
    }
    
    public Class88 method14364() {
        if (Class4812.field20583 != null) {
            return Class4812.field20583;
        }
        try {
            final HttpEntity entity = ((HttpResponse)HttpClients.createDefault().execute((HttpUriRequest)new HttpGet("https://jelloconnect.sigmaclient.info/changelog.php?v=5.0.0b6"))).getEntity();
            if (entity != null) {
                try (final InputStream content = entity.getContent()) {
                    return Class4812.field20583 = new Class88(IOUtils.toString(content, "UTF-8"));
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
