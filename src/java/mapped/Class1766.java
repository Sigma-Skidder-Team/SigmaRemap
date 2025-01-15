// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.FileNotFoundException;

public class Class1766 extends Class1666
{
    private String field9827;
    
    public Class1766(final String field9827) {
        this.field9827 = field9827;
    }
    
    @Override
    public void method5871(final Class6582 class6582) throws IOException {
        this.method5870();
        final InputStream method33892 = Class9216.method33892(this.field9827);
        if (method33892 == null) {
            throw new FileNotFoundException("Shader texture not found: " + this.field9827);
        }
        try {
            final Class1846 method33893 = Class1846.method6637(method33892);
            final Class9413 method33894 = this.method6295();
            Class8995.method32103(this.method5869(), method33893.method6644(), method33893.method6645());
            method33893.method6654(0, 0, 0, 0, 0, method33893.method6644(), method33893.method6645(), method33894.method35009(), method33894.method35010(), false, true);
        }
        finally {
            IOUtils.closeQuietly(method33892);
        }
    }
    
    private Class9413 method6295() {
        final String string = this.field9827 + ".mcmeta";
        final String s = "texture";
        final InputStream method33892 = Class9216.method33892(string);
        if (method33892 != null) {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(method33892));
            Class9413 class9413;
            try {
                final JsonObject asJsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject().getAsJsonObject(s);
                if (asJsonObject == null) {
                    return new Class9413(false, false);
                }
                final Class9413 method33893 = Class9413.field40388.method15972(asJsonObject);
                if (method33893 == null) {
                    return new Class9413(false, false);
                }
                class9413 = method33893;
                return class9413;
            }
            catch (final RuntimeException ex) {
                Class8885.method31271("Error reading metadata: " + string);
                Class8885.method31271("" + ex.getClass().getName() + ": " + ex.getMessage());
                return new Class9413(false, false);
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
                IOUtils.closeQuietly(method33892);
            }
            return class9413;
        }
        return new Class9413(false, false);
    }
}
