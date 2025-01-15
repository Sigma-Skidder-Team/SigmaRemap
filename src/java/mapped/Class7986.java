// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.Deque;

public class Class7986
{
    private boolean field32862;
    private Deque<Boolean> field32863;
    private Deque<Boolean> field32864;
    private Map<String, String> field32865;
    private static final Pattern field32866;
    private static final Pattern field32867;
    private static final Pattern field32868;
    private static final Pattern field32869;
    private static final String field32870 = "define";
    private static final String field32871 = "undef";
    private static final String field32872 = "ifdef";
    private static final String field32873 = "ifndef";
    private static final String field32874 = "if";
    private static final String field32875 = "else";
    private static final String field32876 = "elif";
    private static final String field32877 = "endif";
    private static final List<String> field32878;
    
    public Class7986() {
        this.field32862 = true;
        this.field32863 = new ArrayDeque<Boolean>();
        this.field32864 = new ArrayDeque<Boolean>();
        this.field32865 = new HashMap<String, String>();
    }
    
    public boolean method26049(final String input) {
        final Matcher matcher = Class7986.field32866.matcher(input);
        if (matcher.matches()) {
            final String group = matcher.group(1);
            String s = matcher.group(2);
            final int index = s.indexOf("//");
            if (index >= 0) {
                s = s.substring(0, index);
            }
            final boolean field32862 = this.field32862;
            this.method26051(group, s);
            this.field32862 = !this.field32863.contains(Boolean.FALSE);
            return this.field32862 || field32862;
        }
        return this.field32862;
    }
    
    public static boolean method26050(final String input) {
        final Matcher matcher = Class7986.field32866.matcher(input);
        return matcher.matches() && Class7986.field32878.contains(matcher.group(1));
    }
    
    private void method26051(final String s, final String str) {
        final StringTokenizer stringTokenizer = new StringTokenizer(str, " \t");
        final String s2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
        final String s3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken("").trim() : "";
        if (!s.equals("define")) {
            if (!s.equals("undef")) {
                if (!s.equals("ifdef")) {
                    if (!s.equals("ifndef")) {
                        if (!s.equals("if")) {
                            if (!this.field32863.isEmpty()) {
                                if (!s.equals("elif")) {
                                    if (!s.equals("else")) {
                                        if (s.equals("endif")) {
                                            this.field32863.removeLast();
                                            this.field32864.removeLast();
                                        }
                                    }
                                    else {
                                        this.field32863.removeLast().booleanValue();
                                        this.field32863.add(!this.field32864.removeLast());
                                        this.field32864.add(true);
                                    }
                                }
                                else {
                                    this.field32863.removeLast().booleanValue();
                                    final boolean booleanValue = this.field32864.removeLast();
                                    if (!booleanValue) {
                                        final boolean method26052 = this.method26052(str);
                                        this.field32863.add(method26052);
                                        this.field32864.add(method26052);
                                    }
                                    else {
                                        this.field32863.add(false);
                                        this.field32864.add(booleanValue);
                                    }
                                }
                            }
                        }
                        else {
                            final boolean method26053 = this.method26052(str);
                            this.field32863.add(method26053);
                            this.field32864.add(method26053);
                        }
                    }
                    else {
                        final boolean b = !this.field32865.containsKey(s2);
                        this.field32863.add(b);
                        this.field32864.add(b);
                    }
                }
                else {
                    final boolean containsKey = this.field32865.containsKey(s2);
                    this.field32863.add(containsKey);
                    this.field32864.add(containsKey);
                }
            }
            else {
                this.field32865.remove(s2);
            }
        }
        else {
            this.field32865.put(s2, s3);
        }
    }
    
    private boolean method26052(String str) {
        str = Class7986.field32867.matcher(str).replaceAll("defined_$1");
        str = Class7986.field32868.matcher(str).replaceAll("defined_$1");
        int i = 0;
        while (true) {
            boolean b = false;
            final Matcher matcher = Class7986.field32869.matcher(str);
            while (matcher.find()) {
                final String group = matcher.group();
                if (group.length() > 0) {
                    final char char1 = group.charAt(0);
                    if ((Character.isLetter(char1) || char1 == '_') && this.field32865.containsKey(group)) {
                        String str2 = this.field32865.get(group);
                        if (str2 == null) {
                            str2 = "1";
                        }
                        str = str.substring(0, matcher.start()) + " " + str2 + " " + str.substring(matcher.end());
                        b = true;
                        ++i;
                        break;
                    }
                    continue;
                }
            }
            if (b && i < 100) {
                continue;
            }
            break;
        }
        if (i >= 100) {
            Class8571.method28848("Too many iterations: " + i + ", when resolving: " + str);
            return true;
        }
        try {
            final Class327 method22032 = new Class7186(new Class5110(this.field32865)).method22032(str);
            if (method22032.method1008() == Class2212.field13485) {
                return ((Class326)method22032).method1006();
            }
            if (method22032.method1008() == Class2212.field13483) {
                return ((Class328)method22032).method1009() != 0.0f;
            }
            throw new Class2327("Not a boolean or float expression: " + method22032.method1008());
        }
        catch (final Class2327 class2327) {
            Class8571.method28848("Invalid macro expression: " + str);
            Class8571.method28848("Error: " + class2327.getMessage());
            return false;
        }
    }
    
    static {
        field32866 = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
        field32867 = Pattern.compile("defined\\s+(\\w+)");
        field32868 = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
        field32869 = Pattern.compile("(\\w+)");
        field32878 = Arrays.asList(Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[3], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[4], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[5], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[6], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[7], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[9], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[8], Class7986.\u9b1f\u3069\u9388\u533b\u8e6f\u7270[10]);
    }
}
