// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.security.cert.CertificateParsingException;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import javax.net.ssl.SSLException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;
import javax.net.ssl.HostnameVerifier;

public final class Class9314 implements HostnameVerifier
{
    public static final Class9314 field40001;
    private static final int field40002 = 2;
    private static final int field40003 = 7;
    
    private Class9314() {
    }
    
    @Override
    public boolean verify(final String s, final SSLSession sslSession) {
        try {
            return this.verify(s, (X509Certificate)sslSession.getPeerCertificates()[0]);
        }
        catch (final SSLException ex) {
            return false;
        }
    }
    
    public boolean verify(final String s, final X509Certificate x509Certificate) {
        return Class7690.method24455(s) ? this.method34470(s, x509Certificate) : this.method34471(s, x509Certificate);
    }
    
    private boolean method34470(final String s, final X509Certificate x509Certificate) {
        final List<String> method34473 = method34473(x509Certificate, 7);
        for (int i = 0; i < method34473.size(); ++i) {
            if (s.equalsIgnoreCase((String)method34473.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    private boolean method34471(String lowerCase, final X509Certificate x509Certificate) {
        lowerCase = lowerCase.toLowerCase(Locale.US);
        int n = 0;
        final List<String> method34473 = method34473(x509Certificate, 2);
        for (int i = 0; i < method34473.size(); ++i) {
            n = 1;
            if (this.method34474(lowerCase, (String)method34473.get(i))) {
                return true;
            }
        }
        if (n == 0) {
            final String method34474 = new Class8394(x509Certificate.getSubjectX500Principal()).method27991("cn");
            if (method34474 != null) {
                return this.method34474(lowerCase, method34474);
            }
        }
        return false;
    }
    
    public static List<String> method34472(final X509Certificate x509Certificate) {
        final List<String> method34473 = method34473(x509Certificate, 7);
        final List<String> method34474 = method34473(x509Certificate, 2);
        final ArrayList list = new ArrayList(method34473.size() + method34474.size());
        list.addAll((Collection)method34473);
        list.addAll((Collection)method34474);
        return (List<String>)list;
    }
    
    private static List<String> method34473(final X509Certificate x509Certificate, final int n) {
        final ArrayList list = new ArrayList();
        try {
            final Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (final List list2 : subjectAlternativeNames) {
                if (list2 != null) {
                    if (list2.size() < 2) {
                        continue;
                    }
                    final Integer n2 = (Integer)list2.get(0);
                    if (n2 == null) {
                        continue;
                    }
                    if (n2 != n) {
                        continue;
                    }
                    final String s = (String)list2.get(1);
                    if (s == null) {
                        continue;
                    }
                    list.add(s);
                }
            }
            return list;
        }
        catch (final CertificateParsingException ex) {
            return Collections.emptyList();
        }
    }
    
    public boolean method34474(String string, String anObject) {
        if (string != null) {
            if (string.length() != 0) {
                if (!string.startsWith(".")) {
                    if (!string.endsWith("..")) {
                        if (anObject != null) {
                            if (anObject.length() != 0) {
                                if (!anObject.startsWith(".")) {
                                    if (!anObject.endsWith("..")) {
                                        if (!string.endsWith(".")) {
                                            string += '.';
                                        }
                                        if (!anObject.endsWith(".")) {
                                            anObject += '.';
                                        }
                                        anObject = anObject.toLowerCase(Locale.US);
                                        if (!anObject.contains("*")) {
                                            return string.equals(anObject);
                                        }
                                        if (!anObject.startsWith("*.") || anObject.indexOf(42, 1) != -1) {
                                            return false;
                                        }
                                        if (string.length() < anObject.length()) {
                                            return false;
                                        }
                                        if ("*.".equals(anObject)) {
                                            return false;
                                        }
                                        final String substring = anObject.substring(1);
                                        if (string.endsWith(substring)) {
                                            final int n = string.length() - substring.length();
                                            return n <= 0 || string.lastIndexOf(46, n - 1) == -1;
                                        }
                                        return false;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    static {
        field40001 = new Class9314();
    }
}
