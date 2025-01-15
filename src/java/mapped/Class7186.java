// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.io.IOException;
import java.util.Deque;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Arrays;
import net.optifine.expr.ParseException;

public class Class7186
{
    private Class5106 field27870;
    
    public Class7186(final Class5106 field27870) {
        this.field27870 = field27870;
    }
    
    public Class328 method22030(final String s) throws ParseException {
        final Class327 method22032 = this.method22032(s);
        if (method22032 instanceof Class328) {
            return (Class328)method22032;
        }
        throw new Class2327("Not a float expression: " + method22032.method1008());
    }
    
    public Class326 method22031(final String s) throws ParseException {
        final Class327 method22032 = this.method22032(s);
        if (method22032 instanceof Class326) {
            return (Class326)method22032;
        }
        throw new Class2327("Not a boolean expression: " + method22032.method1008());
    }
    
    public Class327 method22032(final String s) throws ParseException {
        try {
            final Class7124[] method26584 = Class8092.method26584(s);
            if (method26584 == null) {
                return null;
            }
            return this.method22033(new ArrayDeque<Class7124>(Arrays.asList(method26584)));
        }
        catch (final IOException ex) {
            throw new Class2327(ex.getMessage(), ex);
        }
    }
    
    private Class327 method22033(final Deque<Class7124> deque) throws ParseException {
        if (deque.isEmpty()) {
            return null;
        }
        final LinkedList list = new LinkedList();
        final LinkedList list2 = new LinkedList();
        final Class327 method22037 = this.method22037(deque);
        method22046(method22037, "Missing expression");
        list.add(method22037);
        while (true) {
            final Class7124 obj = deque.poll();
            if (obj == null) {
                return this.method22034(list, list2);
            }
            if (obj.method21864() != Class2011.field11431) {
                throw new Class2327("Invalid operator: " + obj);
            }
            final Class327 method22038 = this.method22037(deque);
            method22046(method22038, "Missing expression");
            list2.add(obj);
            list.add(method22038);
        }
    }
    
    private Class327 method22034(final List<Class327> list, final List<Class7124> list2) throws ParseException {
        final LinkedList list3 = new LinkedList();
        for (final Class7124 obj : list2) {
            final Class305 method975 = Class305.method975(obj.method21865());
            method22046(method975, "Invalid operator: " + obj);
            list3.add(method975);
        }
        return this.method22035(list, list3);
    }
    
    private Class327 method22035(final List<Class327> list, final List<Class305> list2) throws ParseException {
        if (list.size() != list2.size() + 1) {
            throw new Class2327("Invalid infix expression, expressions: " + list.size() + ", operators: " + list2.size());
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (final Class305 class305 : list2) {
            min = Math.min(class305.method963(), min);
            max = Math.max(class305.method963(), max);
        }
        if (max < min || max - min > 10) {
            throw new Class2327("Invalid infix precedence, min: " + min + ", max: " + max);
        }
        for (int i = max; i >= min; --i) {
            this.method22036(list, list2, i);
        }
        if (list.size() == 1 && list2.size() == 0) {
            return list.get(0);
        }
        throw new Class2327("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
    }
    
    private void method22036(final List<Class327> list, final List<Class305> list2, final int n) throws ParseException {
        for (int i = 0; i < list2.size(); ++i) {
            final Class305 class305 = list2.get(i);
            if (class305.method963() == n) {
                list2.remove(i);
                list.add(i, method22042(class305, new Class327[] { list.remove(i), list.remove(i) }));
                --i;
            }
        }
    }
    
    private Class327 method22037(final Deque<Class7124> deque) throws ParseException {
        final Class7124 class7124 = deque.poll();
        method22046(class7124, "Missing expression");
        switch (Class7999.field32949[class7124.method21864().ordinal()]) {
            case 1: {
                return method22038(class7124);
            }
            case 2: {
                final Class305 method22039 = this.method22039(class7124, deque);
                if (method22039 != null) {
                    return this.method22040(method22039, deque);
                }
                return this.method22043(class7124);
            }
            case 3: {
                return this.method22044(class7124, deque);
            }
            case 4: {
                final Class305 method22040 = Class305.method975(class7124.method21865());
                method22046(method22040, "Invalid operator: " + class7124);
                if (method22040 == Class305.field1773) {
                    return this.method22037(deque);
                }
                if (method22040 == Class305.field1774) {
                    return method22042(Class305.field1778, new Class327[] { this.method22037(deque) });
                }
                if (method22040 == Class305.field1806) {
                    return method22042(Class305.field1806, new Class327[] { this.method22037(deque) });
                }
                break;
            }
        }
        throw new Class2327("Invalid expression: " + class7124);
    }
    
    private static Class327 method22038(final Class7124 obj) throws ParseException {
        final float method28934 = Class8571.method28934(obj.method21865(), Float.NaN);
        if (method28934 != Float.NaN) {
            return new Class337(method28934);
        }
        throw new Class2327("Invalid float value: " + obj);
    }
    
    private Class305 method22039(final Class7124 obj, final Deque<Class7124> deque) throws ParseException {
        final Class7124 class7124 = deque.peek();
        if (class7124 != null && class7124.method21864() == Class2011.field11433) {
            final Class305 method975 = Class305.method975(obj.method21865());
            method22046(method975, "Unknown function: " + obj);
            return method975;
        }
        final Class305 method976 = Class305.method975(obj.method21865());
        if (method976 == null) {
            return null;
        }
        if (method976.method966(new Class327[0]) <= 0) {
            return method976;
        }
        throw new Class2327("Missing arguments: " + method976);
    }
    
    private Class327 method22040(final Class305 class305, final Deque<Class7124> deque) throws ParseException {
        if (class305.method966(new Class327[0]) == 0) {
            final Class7124 class306 = deque.peek();
            if (class306 == null || class306.method21864() != Class2011.field11433) {
                return method22042(class305, new Class327[0]);
            }
        }
        final Class7124 class307 = deque.poll();
        return method22042(class305, this.method22041(method22045(deque, Class2011.field11434, true)));
    }
    
    private Class327[] method22041(final Deque<Class7124> deque) throws ParseException {
        final ArrayList list = new ArrayList();
        while (true) {
            final Class327 method22033 = this.method22033(method22045(deque, Class2011.field11432, false));
            if (method22033 == null) {
                break;
            }
            list.add(method22033);
        }
        return (Class327[])list.toArray(new Class327[list.size()]);
    }
    
    private static Class327 method22042(final Class305 class305, final Class327[] array) throws ParseException {
        final Class2212[] method967 = class305.method967(array);
        if (array.length != method967.length) {
            throw new Class2327("Invalid number of arguments, function: \"" + class305.method962() + "\", count arguments: " + array.length + ", should be: " + method967.length);
        }
        for (int i = 0; i < array.length; ++i) {
            final Class2212 method968 = array[i].method1008();
            final Class2212 obj = method967[i];
            if (method968 != obj) {
                throw new Class2327("Invalid argument type, function: \"" + class305.method962() + "\", index: " + i + ", type: " + method968 + ", should be: " + obj);
            }
        }
        if (class305.method964() == Class2212.field13483) {
            return new Class329(class305, array);
        }
        if (class305.method964() == Class2212.field13485) {
            return new Class341(class305, array);
        }
        if (class305.method964() != Class2212.field13484) {
            throw new Class2327("Unknown function type: " + class305.method964() + ", function: " + class305.method962());
        }
        return new Class336(class305, array);
    }
    
    private Class327 method22043(final Class7124 class7124) throws ParseException {
        if (this.field27870 == null) {
            throw new Class2327("Model variable not found: " + class7124);
        }
        final Class327 method16001 = this.field27870.method16001(class7124.method21865());
        if (method16001 != null) {
            return method16001;
        }
        throw new Class2327("Model variable not found: " + class7124);
    }
    
    private Class327 method22044(final Class7124 class7124, final Deque<Class7124> deque) throws ParseException {
        return this.method22033(method22045(deque, Class2011.field11434, true));
    }
    
    private static Deque<Class7124> method22045(final Deque<Class7124> deque, final Class2011 obj, final boolean b) throws ParseException {
        final ArrayDeque arrayDeque = new ArrayDeque();
        int n = 0;
        final Iterator<Class7124> iterator = deque.iterator();
        while (iterator.hasNext()) {
            final Class7124 class7124 = iterator.next();
            iterator.remove();
            if (n == 0 && class7124.method21864() == obj) {
                return arrayDeque;
            }
            arrayDeque.add(class7124);
            if (class7124.method21864() == Class2011.field11433) {
                ++n;
            }
            if (class7124.method21864() != Class2011.field11434) {
                continue;
            }
            --n;
        }
        if (!b) {
            return arrayDeque;
        }
        throw new Class2327("Missing end token: " + obj);
    }
    
    private static void method22046(final Object o, final String s) throws ParseException {
        if (o != null) {
            return;
        }
        throw new Class2327(s);
    }
}
