// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import org.xml.sax.EntityResolver;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import org.newdawn.slick.SlickException;
import java.util.ArrayList;
import java.util.Properties;

public class Class5025
{
    private static boolean field21534;
    public int field21535;
    public int field21536;
    public int field21537;
    public int field21538;
    public String field21539;
    public Properties field21540;
    public ArrayList field21541;
    public ArrayList field21542;
    public ArrayList field21543;
    public static final int field21544 = 1;
    public static final int field21545 = 2;
    public int field21546;
    private boolean field21547;
    
    private static void method15258(final boolean field21534) {
        Class5025.field21534 = field21534;
    }
    
    public Class5025(final String s) throws SlickException {
        this(s, true);
    }
    
    public Class5025(String replace, final boolean field21547) throws SlickException {
        this.field21541 = new ArrayList();
        this.field21542 = new ArrayList();
        this.field21543 = new ArrayList();
        this.field21547 = true;
        this.field21547 = field21547;
        replace = replace.replace('\\', '/');
        this.method15279(Class8834.method30851(replace), replace.substring(0, replace.lastIndexOf("/")));
    }
    
    public Class5025(final String s, final String s2) throws SlickException {
        this.field21541 = new ArrayList();
        this.field21542 = new ArrayList();
        this.field21543 = new ArrayList();
        this.field21547 = true;
        this.method15279(Class8834.method30851(s), s2);
    }
    
    public Class5025(final InputStream inputStream) throws SlickException {
        this.field21541 = new ArrayList();
        this.field21542 = new ArrayList();
        this.field21543 = new ArrayList();
        this.field21547 = true;
        this.method15279(inputStream, "");
    }
    
    public Class5025(final InputStream inputStream, final String s) throws SlickException {
        this.field21541 = new ArrayList();
        this.field21542 = new ArrayList();
        this.field21543 = new ArrayList();
        this.field21547 = true;
        this.method15279(inputStream, s);
    }
    
    public String method15259() {
        return this.field21539;
    }
    
    public int method15260(final String anObject) {
        for (int i = 0; i < this.field21542.size(); ++i) {
            if (((Class7516)this.field21542.get(i)).field29120.equals(anObject)) {
                return i;
            }
        }
        return -1;
    }
    
    public Class7764 method15261(final int n, final int n2, final int index) {
        final Class7516 class7516 = this.field21542.get(index);
        final int index2 = class7516.field29121[n][n2][0];
        if (index2 >= 0 && index2 < this.field21541.size()) {
            final Class9029 class7517 = this.field21541.get(index2);
            return class7517.field38178.method24860(class7517.method32360(class7516.field29121[n][n2][1]), class7517.method32361(class7516.field29121[n][n2][1]));
        }
        return null;
    }
    
    public int method15262() {
        return this.field21535;
    }
    
    public int method15263() {
        return this.field21536;
    }
    
    public int method15264() {
        return this.field21538;
    }
    
    public int method15265() {
        return this.field21537;
    }
    
    public int method15266(final int n, final int n2, final int index) {
        return this.field21542.get(index).method23443(n, n2);
    }
    
    public void method15267(final int n, final int n2, final int index, final int n3) {
        this.field21542.get(index).method23444(n, n2, n3);
    }
    
    public String method15268(final String key, final String defaultValue) {
        if (this.field21540 != null) {
            return this.field21540.getProperty(key, defaultValue);
        }
        return defaultValue;
    }
    
    public String method15269(final int index, final String key, final String defaultValue) {
        final Class7516 class7516 = this.field21542.get(index);
        if (class7516 != null && class7516.field29124 != null) {
            return class7516.field29124.getProperty(key, defaultValue);
        }
        return defaultValue;
    }
    
    public String method15270(final int n, final String key, final String defaultValue) {
        if (n == 0) {
            return defaultValue;
        }
        final Properties method32359 = this.method15283(n).method32359(n);
        if (method32359 != null) {
            return method32359.getProperty(key, defaultValue);
        }
        return defaultValue;
    }
    
    public void method15271(final int n, final int n2) {
        this.method15275(n, n2, 0, 0, this.field21535, this.field21536, false);
    }
    
    public void method15272(final int n, final int n2, final int n3) {
        this.method15274(n, n2, 0, 0, this.method15262(), this.method15263(), n3, false);
    }
    
    public void method15273(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.method15275(n, n2, n3, n4, n5, n6, false);
    }
    
    public void method15274(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int index, final boolean b) {
        final Class7516 class7516 = this.field21542.get(index);
        switch (this.field21546) {
            case 1: {
                for (int i = 0; i < n6; ++i) {
                    class7516.method23445(n, n2, n3, n4, n5, i, b, this.field21537, this.field21538);
                }
                break;
            }
            case 2: {
                this.method15276(n, n2, n3, n4, n5, n6, class7516, b);
                break;
            }
        }
    }
    
    public void method15275(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        switch (this.field21546) {
            case 1: {
                for (int i = 0; i < n6; ++i) {
                    for (int j = 0; j < this.field21542.size(); ++j) {
                        ((Class7516)this.field21542.get(j)).method23445(n, n2, n3, n4, n5, i, b, this.field21537, this.field21538);
                    }
                }
                break;
            }
            case 2: {
                this.method15276(n, n2, n3, n4, n5, n6, null, b);
                break;
            }
        }
    }
    
    public void method15276(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Class7516 e, final boolean b) {
        ArrayList field21542 = this.field21542;
        if (e != null) {
            field21542 = new ArrayList();
            field21542.add(e);
        }
        final int n7 = n5 * n6;
        int n8 = 0;
        int i = 0;
        int n9 = n;
        int n10 = n2;
        int n11 = 0;
        int n12 = 0;
        while (i == 0) {
            int n13 = n11;
            int n14 = n12;
            int n15 = n9;
            int n16;
            if (n6 <= n5) {
                n16 = ((n12 >= n6 - 1) ? ((n5 - n13 >= n6) ? (n6 - 1) : (n5 - n13 - 1)) : n12);
            }
            else {
                n16 = ((n12 >= n5 - 1) ? ((n5 - n13 >= n6) ? (n5 - 1) : (n5 - n13 - 1)) : n12);
            }
            for (int j = 0; j <= n16; ++j) {
                for (int k = 0; k < field21542.size(); ++k) {
                    ((Class7516)field21542.get(k)).method23445(n15, n10, n13, n14, 1, 0, b, this.field21537, this.field21538);
                }
                n15 += this.field21537;
                ++n8;
                ++n13;
                --n14;
            }
            if (n12 >= n6 - 1) {
                ++n11;
                n9 += this.field21537 / 2;
                n10 += this.field21538 / 2;
            }
            else {
                ++n12;
                n9 -= this.field21537 / 2;
                n10 += this.field21538 / 2;
            }
            if (n8 < n7) {
                continue;
            }
            i = 1;
        }
    }
    
    public int method15277() {
        return this.field21542.size();
    }
    
    private int method15278(final String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (final NumberFormatException ex) {
            return 0;
        }
    }
    
    private void method15279(final InputStream is, final String field21539) throws SlickException {
        this.field21539 = field21539;
        try {
            final DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
            instance.setValidating(false);
            final DocumentBuilder documentBuilder = instance.newDocumentBuilder();
            documentBuilder.setEntityResolver(new Class6872(this));
            final Element documentElement = documentBuilder.parse(is).getDocumentElement();
            if (documentElement.getAttribute("orientation").equals("orthogonal")) {
                this.field21546 = 1;
            }
            else {
                this.field21546 = 2;
            }
            this.field21535 = this.method15278(documentElement.getAttribute("width"));
            this.field21536 = this.method15278(documentElement.getAttribute("height"));
            this.field21537 = this.method15278(documentElement.getAttribute("tilewidth"));
            this.field21538 = this.method15278(documentElement.getAttribute("tileheight"));
            final Element element = (Element)documentElement.getElementsByTagName("properties").item(0);
            if (element != null) {
                final NodeList elementsByTagName = element.getElementsByTagName("property");
                if (elementsByTagName != null) {
                    this.field21540 = new Properties();
                    for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                        final Element element2 = (Element)elementsByTagName.item(i);
                        this.field21540.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                    }
                }
            }
            if (this.field21547) {
                Class9029 class9029 = null;
                final NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
                for (int j = 0; j < elementsByTagName2.getLength(); ++j) {
                    final Class9029 e = new Class9029(this, (Element)elementsByTagName2.item(j), !Class5025.field21534);
                    e.field38172 = j;
                    if (class9029 != null) {
                        class9029.method32362(e.field38174 - 1);
                    }
                    class9029 = e;
                    this.field21541.add(e);
                }
            }
            final NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int k = 0; k < elementsByTagName3.getLength(); ++k) {
                final Class7516 e2 = new Class7516(this, (Element)elementsByTagName3.item(k));
                e2.field29119 = k;
                this.field21542.add(e2);
            }
            final NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
            for (int l = 0; l < elementsByTagName4.getLength(); ++l) {
                final Class8315 e3 = new Class8315(this, (Element)elementsByTagName4.item(l));
                e3.field34156 = l;
                this.field21543.add(e3);
            }
        }
        catch (final Exception ex) {
            Class8452.method28203(ex);
            throw new Class2324("Failed to parse tilemap", ex);
        }
    }
    
    public int method15280() {
        return this.field21541.size();
    }
    
    public Class9029 method15281(final int index) {
        return this.field21541.get(index);
    }
    
    public Class9029 method15282(final int n) {
        for (int i = 0; i < this.field21541.size(); ++i) {
            final Class9029 class9029 = this.field21541.get(i);
            if (class9029.method32363(n)) {
                return class9029;
            }
        }
        return null;
    }
    
    public Class9029 method15283(final int n) {
        for (int i = 0; i < this.field21541.size(); ++i) {
            final Class9029 class9029 = this.field21541.get(i);
            if (class9029.method32363(n)) {
                return class9029;
            }
        }
        return null;
    }
    
    public void method15284(final int n, final int n2, final int n3) {
    }
    
    public int method15285() {
        return this.field21543.size();
    }
    
    public int method15286(final int index) {
        if (index >= 0 && index < this.field21543.size()) {
            return this.field21543.get(index).field34158.size();
        }
        return -1;
    }
    
    public String method15287(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        return ((Class9385)class8315.field34158.get(index2)).field40268;
                    }
                }
            }
        }
        return null;
    }
    
    public String method15288(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        return ((Class9385)class8315.field34158.get(index2)).field40269;
                    }
                }
            }
        }
        return null;
    }
    
    public int method15289(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        return ((Class9385)class8315.field34158.get(index2)).field40270;
                    }
                }
            }
        }
        return -1;
    }
    
    public int method15290(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        return ((Class9385)class8315.field34158.get(index2)).field40271;
                    }
                }
            }
        }
        return -1;
    }
    
    public int method15291(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        return ((Class9385)class8315.field34158.get(index2)).field40272;
                    }
                }
            }
        }
        return -1;
    }
    
    public int method15292(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        return ((Class9385)class8315.field34158.get(index2)).field40273;
                    }
                }
            }
        }
        return -1;
    }
    
    public String method15293(final int index, final int index2) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        final Class9385 class8316 = class8315.field34158.get(index2);
                        if (class8316 != null) {
                            return Class9385.method34890(class8316);
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }
    
    public String method15294(final int index, final int index2, final String key, final String defaultValue) {
        if (index >= 0) {
            if (index < this.field21543.size()) {
                final Class8315 class8315 = this.field21543.get(index);
                if (index2 >= 0) {
                    if (index2 < class8315.field34158.size()) {
                        final Class9385 class8316 = class8315.field34158.get(index2);
                        if (class8316 == null) {
                            return defaultValue;
                        }
                        if (class8316.field40275 != null) {
                            return class8316.field40275.getProperty(key, defaultValue);
                        }
                        return defaultValue;
                    }
                }
            }
        }
        return defaultValue;
    }
}
