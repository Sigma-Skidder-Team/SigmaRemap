package com.sun.jna.win32;

import java.util.Collections;
import java.util.Map;

public interface W32APIOptions extends StdCallLibrary {
   Map<String, Object> UNICODE_OPTIONS = Collections.<String, Object>unmodifiableMap(new W32APIOptions$1());
   Map<String, Object> ASCII_OPTIONS = Collections.<String, Object>unmodifiableMap(new W32APIOptions$2());
   Map<String, Object> DEFAULT_OPTIONS = Boolean.getBoolean("w32.ascii") ? ASCII_OPTIONS : UNICODE_OPTIONS;
}
