// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8263
{
    private final Class6782[] field33931;
    private final Class1932 field33932;
    
    public Class8263(final Class1932 field33932, final Class6782[] field33933) {
        this.field33932 = field33932;
        this.field33931 = field33933;
    }
    
    public Class1932 method27443() {
        return this.field33932;
    }
    
    public Class6782[] method27444() {
        return this.field33931;
    }
    
    public static Class8263 method27445(final Class1932 class1932, final Class1794 class1933, final List<String> list) {
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
        for (int i = 0; i < list.size(); ++i) {
            final int j = i + 1;
            final String trim = list.get(i).trim();
            final StringReader stringReader = new StringReader(trim);
            if (stringReader.canRead() && stringReader.peek() != '#') {
                if (stringReader.peek() == '/') {
                    stringReader.skip();
                    if (stringReader.peek() == '/') {
                        throw new IllegalArgumentException("Unknown or invalid command '" + trim + "' on line " + j + " (if you intended to make a comment, use '#' not '//')");
                    }
                    throw new IllegalArgumentException("Unknown or invalid command '" + trim + "' on line " + j + " (did you mean '" + stringReader.readUnquotedString() + "'? Do not use a preceding forwards slash.)");
                }
                else {
                    try {
                        final ParseResults parse = class1933.method6503().method1573().method25004().parse(stringReader, (Object)class1933.method6512());
                        if (parse.getReader().canRead()) {
                            throw Class7788.method25005((com.mojang.brigadier.ParseResults<Object>)parse);
                        }
                        arrayListWithCapacity.add(new Class6781((ParseResults<Class7492>)parse));
                    }
                    catch (final CommandSyntaxException ex) {
                        throw new IllegalArgumentException("Whilst parsing command on line " + j + ": " + ex.getMessage());
                    }
                }
            }
        }
        return new Class8263(class1932, (Class6782[])arrayListWithCapacity.toArray(new Class6782[0]));
    }
}
