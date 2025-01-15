// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.datafixers.types.constant.NamespacedStringType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import com.mojang.bridge.game.GameVersion;
import io.netty.util.ResourceLeakDetector$Level;

public class Class9528
{
    private static String[] field41019;
    public static final ResourceLeakDetector$Level field41020;
    public static boolean field41021;
    public static final char[] field41022;
    private static GameVersion field41023;
    
    public static boolean method35576(final char c) {
        if (c != '§') {
            if (c >= ' ') {
                if (c != '\u007f') {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String method35577(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray()) {
            if (method35576(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String method35578(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i = s.offsetByCodePoints(i, 1)) {
            final int codePoint = s.codePointAt(i);
            if (Character.isSupplementaryCodePoint(codePoint)) {
                sb.append('\ufffd');
            }
            else {
                sb.appendCodePoint(codePoint);
            }
        }
        return sb.toString();
    }
    
    public static GameVersion method35579() {
        if (Class9528.field41023 == null) {
            Class9528.field41023 = Class8164.method26992();
        }
        return Class9528.field41023;
    }
    
    static {
        field41020 = ResourceLeakDetector$Level.DISABLED;
        field41022 = new char[] { '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':' };
        ResourceLeakDetector.setLevel(Class9528.field41020);
        CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
        CommandSyntaxException.BUILT_IN_EXCEPTIONS = (BuiltInExceptionProvider)new Class8099();
        NamespacedStringType.ENSURE_NAMESPACE = Class5174::method16141;
    }
}
