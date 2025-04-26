// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class CacheInterceptor implements Class6814
{
    public final Class8674 field26758;
    
    public CacheInterceptor(final Class8674 field26758) {
        this.field26758 = field26758;
    }
    
    @Override
    public Response method20856(final Class8711 class8711) throws IOException {
        final Response class8712 = (this.field26758 != null) ? this.field26758.method29705(class8711.method29905()) : null;
        final Class8016 method32937 = new Class9108(System.currentTimeMillis(), class8711.method29905(), class8712).method32937();
        final Request field33021 = method32937.field33021;
        final Response field33022 = method32937.field33022;
        if (this.field26758 != null) {
            this.field26758.method29710(method32937);
        }
        if (class8712 != null && field33022 == null) {
            Class7690.method24432(class8712.method6197());
        }
        if (field33021 == null && field33022 == null) {
            return new Class9189().method33595(class8711.method29905()).method33596(Class190.field623).method33597(504).method33598("Unsatisfiable Request (only-if-cached)").method33604(Class7690.field30542).method33610(-1L).method33611(System.currentTimeMillis()).method33612();
        }
        if (field33021 == null) {
            return field33022.method6198().method33606(method20858(field33022)).method33612();
        }
        Response method32938 = null;
        try {
            method32938 = class8711.proceed(field33021);
        }
        finally {
            if (method32938 == null && class8712 != null) {
                Class7690.method24432(class8712.method6197());
            }
        }
        if (field33022 != null) {
            if (method32938.method6188() == 304) {
                final Response method32939 = field33022.method6198().method33603(method20860(field33022.method6195(), method32938.method6195())).method33610(method32938.method6205()).method33611(method32938.method6206()).method33606(method20858(field33022)).method33605(method20858(method32938)).method33612();
                method32938.method6197().close();
                this.field26758.method29709();
                this.field26758.method29708(field33022, method32939);
                return method32939;
            }
            Class7690.method24432(field33022.method6197());
        }
        final Response method32940 = method32938.method6198().method33606(method20858(field33022)).method33605(method20858(method32938)).method33612();
        if (this.field26758 != null) {
            if (Class9558.method35763(method32940) && Class8016.method26271(method32940, field33021)) {
                return this.method20859(this.field26758.method29706(method32940), method32940);
            }
            if (Class8196.method27142(field33021.method29110())) {
                try {
                    this.field26758.method29707(field33021);
                }
                catch (final IOException ex) {}
            }
        }
        return method32940;
    }
    
    private static Response method20858(final Response class1753) {
        return (class1753 != null && class1753.method6197() != null) ? class1753.method6198().method33604(null).method33612() : class1753;
    }
    
    private Response method20859(final Class6050 class6050, final Response class6051) throws IOException {
        if (class6050 == null) {
            return class6051;
        }
        final Class1676 method17979 = class6050.method17979();
        if (method17979 != null) {
            return class6051.method6198().method33604(new Class1761(class6051.method6195(), Class8753.method30275(new Class1691(this, class6051.method6197().method6285(), class6050, Class8753.method30276(method17979))))).method33612();
        }
        return class6051;
    }
    
    private static Class6957 method20860(final Class6957 class6957, final Class6957 class6958) {
        final Class8640 class6959 = new Class8640();
        for (int i = 0; i < class6957.method21362(); ++i) {
            final String method21363 = class6957.method21363(i);
            final String method21364 = class6957.method21364(i);
            if (!"Warning".equalsIgnoreCase(method21363) || !method21364.startsWith("1")) {
                if (!method20861(method21363) || class6958.method21360(method21363) == null) {
                    Class9013.field38043.method32265(class6959, method21363, method21364);
                }
            }
        }
        for (int j = 0; j < class6958.method21362(); ++j) {
            final String method21365 = class6958.method21363(j);
            if (!"Content-Length".equalsIgnoreCase(method21365)) {
                if (method20861(method21365)) {
                    Class9013.field38043.method32265(class6959, method21365, class6958.method21364(j));
                }
            }
        }
        return class6959.method29384();
    }
    
    public static boolean method20861(final String s) {
        if (!"Connection".equalsIgnoreCase(s)) {
            if (!"Keep-Alive".equalsIgnoreCase(s)) {
                if (!"Proxy-Authenticate".equalsIgnoreCase(s)) {
                    if (!"Proxy-Authorization".equalsIgnoreCase(s)) {
                        if (!"TE".equalsIgnoreCase(s)) {
                            if (!"Trailers".equalsIgnoreCase(s)) {
                                if (!"Transfer-Encoding".equalsIgnoreCase(s)) {
                                    if (!"Upgrade".equalsIgnoreCase(s)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
