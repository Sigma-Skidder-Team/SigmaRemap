package com.sun.jna;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Callback {
   String METHOD_NAME = "callback";
   List<String> FORBIDDEN_NAMES = Collections.<String>unmodifiableList(Arrays.asList("hashCode", "equals", "toString"));
}
