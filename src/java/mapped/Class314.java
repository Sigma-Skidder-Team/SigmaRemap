// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.Map;

public enum Class314
{
    field1846('0'), 
    field1847('1'), 
    field1848('2'), 
    field1849('3'), 
    field1850('4'), 
    field1851('5'), 
    field1852('6'), 
    field1853('7'), 
    field1854('8'), 
    field1855('9'), 
    field1856('a'), 
    field1857('b'), 
    field1858('c'), 
    field1859('d'), 
    field1860('e'), 
    field1861('f'), 
    field1862('k', true), 
    field1863('l', true), 
    field1864('m', true), 
    field1865('n', true), 
    field1866('o', true), 
    field1867('r');
    
    private static final Map<Character, Class314> field1868;
    private static final Map<String, Class314> field1869;
    private static final Pattern field1870;
    private final char field1871;
    private final boolean field1872;
    private final String field1873;
    
    private Class314(final char c) {
        this(c, false);
    }
    
    private Class314(final char c, final boolean field1872) {
        this.field1871 = c;
        this.field1872 = field1872;
        this.field1873 = "§" + c;
    }
    
    public char method986() {
        return this.field1871;
    }
    
    public String method987() {
        return this.name().toLowerCase(Locale.ROOT);
    }
    
    @Override
    public String toString() {
        return this.field1873;
    }
    
    static {
        field1868 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class314, ? extends Character>)Class314::method986, class314 -> class314));
        field1869 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class314, ? extends String>)Class314::method987, class315 -> class315));
        field1870 = Pattern.compile("(?i)§[0-9A-FK-OR]");
    }
}
