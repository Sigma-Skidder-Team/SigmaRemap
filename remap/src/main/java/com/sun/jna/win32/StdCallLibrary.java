// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna.win32;

import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;

public interface StdCallLibrary extends Library, StdCall
{
    public static final int STDCALL_CONVENTION = 63;
    public static final FunctionMapper FUNCTION_MAPPER = new StdCallFunctionMapper();
}
