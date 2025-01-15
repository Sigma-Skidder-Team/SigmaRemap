// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.security.cert.CertificateFactory;
import java.util.Collections;
import java.security.cert.Certificate;
import java.util.List;
import java.io.IOException;

public final class Class7722
{
    private static final String field30713;
    private static final String field30714;
    private final String field30715;
    private final Class6957 field30716;
    private final String field30717;
    private final Class190 field30718;
    private final int field30719;
    private final String field30720;
    private final Class6957 field30721;
    private final Class8772 field30722;
    private final long field30723;
    private final long field30724;
    
    public Class7722(final Class1682 class1682) throws IOException {
        try {
            final Class1681 method30275 = Class8753.method30275(class1682);
            this.field30715 = method30275.method5985();
            this.field30717 = method30275.method5985();
            final Class8640 class1683 = new Class8640();
            for (int method30276 = Class1726.method6095(method30275), i = 0; i < method30276; ++i) {
                class1683.method29376(method30275.method5985());
            }
            this.field30716 = class1683.method29384();
            final Class8482 method30277 = Class8482.method28317(method30275.method5985());
            this.field30718 = method30277.field34806;
            this.field30719 = method30277.field34807;
            this.field30720 = method30277.field34808;
            final Class8640 class1684 = new Class8640();
            for (int method30278 = Class1726.method6095(method30275), j = 0; j < method30278; ++j) {
                class1684.method29376(method30275.method5985());
            }
            final String method30279 = class1684.method29383(Class7722.field30713);
            final String method30280 = class1684.method29383(Class7722.field30714);
            class1684.method29380(Class7722.field30713);
            class1684.method29380(Class7722.field30714);
            this.field30723 = ((method30279 != null) ? Long.parseLong(method30279) : 0L);
            this.field30724 = ((method30280 != null) ? Long.parseLong(method30280) : 0L);
            this.field30721 = class1684.method29384();
            if (this.method24653()) {
                final String method30281 = method30275.method5985();
                if (method30281.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + method30281 + "\"");
                }
                this.field30722 = Class8772.method30463(method30275.method5951() ? Class272.field1481 : Class272.method919(method30275.method5985()), Class9578.method35877(method30275.method5985()), this.method24654(method30275), this.method24654(method30275));
            }
            else {
                this.field30722 = null;
            }
        }
        finally {
            class1682.close();
        }
    }
    
    public Class7722(final Class1753 class1753) {
        this.field30715 = class1753.method6186().method29109().toString();
        this.field30716 = Class9558.method35759(class1753);
        this.field30717 = class1753.method6186().method29110();
        this.field30718 = class1753.method6187();
        this.field30719 = class1753.method6188();
        this.field30720 = class1753.method6190();
        this.field30721 = class1753.method6195();
        this.field30722 = class1753.method6191();
        this.field30723 = class1753.method6205();
        this.field30724 = class1753.method6206();
    }
    
    public void method24652(final Class9541 class9541) throws IOException {
        final Class1679 method30276 = Class8753.method30276(class9541.method35620(0));
        method30276.method5932(this.field30715).method5937(10);
        method30276.method5932(this.field30717).method5937(10);
        method30276.method5944(this.field30716.method21362()).method5937(10);
        for (int i = 0; i < this.field30716.method21362(); ++i) {
            method30276.method5932(this.field30716.method21363(i)).method5932(": ").method5932(this.field30716.method21364(i)).method5937(10);
        }
        method30276.method5932(new Class8482(this.field30718, this.field30719, this.field30720).toString()).method5937(10);
        method30276.method5944(this.field30721.method21362() + 2).method5937(10);
        for (int j = 0; j < this.field30721.method21362(); ++j) {
            method30276.method5932(this.field30721.method21363(j)).method5932(": ").method5932(this.field30721.method21364(j)).method5937(10);
        }
        method30276.method5932(Class7722.field30713).method5932(": ").method5944(this.field30723).method5937(10);
        method30276.method5932(Class7722.field30714).method5932(": ").method5944(this.field30724).method5937(10);
        if (this.method24653()) {
            method30276.method5937(10);
            method30276.method5932(this.field30722.method30465().method35880()).method5937(10);
            this.method24655(method30276, this.field30722.method30466());
            this.method24655(method30276, this.field30722.method30468());
            method30276.method5932(this.field30722.method30464().method921()).method5937(10);
        }
        method30276.close();
    }
    
    private boolean method24653() {
        return this.field30715.startsWith("https://");
    }
    
    private List<Certificate> method24654(final Class1681 class1681) throws IOException {
        final int method6095 = Class1726.method6095(class1681);
        if (method6095 == -1) {
            return Collections.emptyList();
        }
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            final ArrayList list = new ArrayList(method6095);
            for (int i = 0; i < method6095; ++i) {
                final String method6096 = class1681.method5985();
                final Class1680 class1682 = new Class1680();
                class1682.method5996(Class1929.method7756(method6096));
                list.add((Object)instance.generateCertificate(class1682.method5954()));
            }
            return (List<Certificate>)list;
        }
        catch (final CertificateException ex) {
            throw new IOException(ex.getMessage());
        }
    }
    
    private void method24655(final Class1679 class1679, final List<Certificate> list) throws IOException {
        try {
            class1679.method5944(list.size()).method5937(10);
            for (int i = 0; i < list.size(); ++i) {
                class1679.method5932(Class1929.method7738(((Certificate)list.get(i)).getEncoded()).method7745()).method5937(10);
            }
        }
        catch (final CertificateEncodingException ex) {
            throw new IOException(ex.getMessage());
        }
    }
    
    public boolean method24656(final Class8596 class8596, final Class1753 class8597) {
        if (this.field30715.equals(class8596.method29109().toString())) {
            if (this.field30717.equals(class8596.method29110())) {
                if (Class9558.method35754(class8597, this.field30716, class8596)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Class1753 method24657(final Class1668 class1668) {
        return new Class9189().method33595(new Class8896().method31310(this.field30715).method31324(this.field30717, null).method31315(this.field30716).method31326()).method33596(this.field30718).method33597(this.field30719).method33598(this.field30720).method33603(this.field30721).method33604(new Class1763(class1668, this.field30721.method21360("Content-Type"), this.field30721.method21360("Content-Length"))).method33599(this.field30722).method33610(this.field30723).method33611(this.field30724).method33612();
    }
    
    static {
        field30713 = Class6550.method19842().method19843() + "-Sent-Millis";
        field30714 = Class6550.method19842().method19843() + "-Received-Millis";
    }
}
