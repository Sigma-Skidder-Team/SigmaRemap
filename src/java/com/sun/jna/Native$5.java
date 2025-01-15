// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;

public final class Native$5 implements FilenameFilter
{
    @Override
    public boolean accept(final File dir, final String name) {
        return name.endsWith(".x") && name.startsWith("jna");
    }
}
