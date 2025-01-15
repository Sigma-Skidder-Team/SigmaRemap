// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.xml.sax.SAXException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.xml.sax.InputSource;
import org.xml.sax.EntityResolver;

public class Class6872 implements EntityResolver
{
    private static String[] field26922;
    public final /* synthetic */ Class5025 field26923;
    
    public Class6872(final Class5025 field26923) {
        this.field26923 = field26923;
    }
    
    @Override
    public InputSource resolveEntity(final String s, final String s2) throws SAXException, IOException {
        return new InputSource(new ByteArrayInputStream(new byte[0]));
    }
}
