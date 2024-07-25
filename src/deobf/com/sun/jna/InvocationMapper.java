package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public interface InvocationMapper {
   InvocationHandler getInvocationHandler(NativeLibrary var1, Method var2);
}
