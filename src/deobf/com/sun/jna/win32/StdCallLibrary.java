package com.sun.jna.win32;

import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;

public interface StdCallLibrary extends Library, StdCall {
   int STDCALL_CONVENTION = 63;
   FunctionMapper FUNCTION_MAPPER = new StdCallFunctionMapper();
}
