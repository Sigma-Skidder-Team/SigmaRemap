// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public interface Callback
{
    String METHOD_NAME = "callback";
    List<String> FORBIDDEN_NAMES = Collections.unmodifiableList(Arrays.asList("hashCode", "equals", "toString"));
}
