// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;

public final class NativeLibrary$2 implements FilenameFilter
{
    public final /* synthetic */ String val$libName;
    
    public NativeLibrary$2(final String val$libName) {
        this.val$libName = val$libName;
    }
    
    @Override
    public boolean accept(final File dir, final String filename) {
        return (filename.startsWith("lib" + this.val$libName + ".so") || (filename.startsWith(this.val$libName + ".so") && this.val$libName.startsWith("lib"))) && NativeLibrary.access$000(filename);
    }
}
