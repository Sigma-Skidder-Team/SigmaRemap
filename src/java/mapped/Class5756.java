// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.util.List;

public interface Class5756
{
    List<Class1943> method17084(final String p0);
    
    boolean method17091(final File p0);
    
    long method17087();
    
    int method17088();
    
    long method17089();
    
    int method17090();
    
    default long method17106() {
        return this.method17089() - this.method17087();
    }
    
    default int method17098() {
        return this.method17090() - this.method17088();
    }
    
    default String method17107(final String s) {
        return s.replace('\u001e', '.');
    }
}
