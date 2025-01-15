// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public interface Callback
{
    public static final String METHOD_NAME = "callback";
    public static final List<String> FORBIDDEN_NAMES = Collections.unmodifiableList((List<? extends String>)Arrays.asList("hashCode", "equals", "toString"));
}
