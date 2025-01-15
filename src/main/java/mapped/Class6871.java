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

public class Class6871 implements EntityResolver
{
    private static String[] field26920;
    public final /* synthetic */ Class8812 field26921;
    
    public Class6871(final Class8812 field26921) {
        this.field26921 = field26921;
    }
    
    @Override
    public InputSource resolveEntity(final String s, final String s2) throws SAXException, IOException {
        return new InputSource(new ByteArrayInputStream(new byte[0]));
    }
}
