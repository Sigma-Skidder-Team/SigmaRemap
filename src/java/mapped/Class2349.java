// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.io.FileNotFoundException;

public class Class2349 extends FileNotFoundException
{
    public Class2349(final File file, final String s) {
        super(String.format("'%s' in ResourcePack '%s'", s, file));
    }
}
