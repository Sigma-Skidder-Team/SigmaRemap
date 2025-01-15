// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import java.util.Collections;
import java.util.Map;

public interface W32APIOptions extends StdCallLibrary
{
    public static final Map<String, Object> UNICODE_OPTIONS = Collections.unmodifiableMap((Map<? extends String, ?>)new W32APIOptions$1());
    public static final Map<String, Object> ASCII_OPTIONS = Collections.unmodifiableMap((Map<? extends String, ?>)new W32APIOptions$2());
    public static final Map<String, Object> DEFAULT_OPTIONS = Boolean.getBoolean("w32.ascii") ? W32APIOptions.ASCII_OPTIONS : W32APIOptions.UNICODE_OPTIONS;
}
