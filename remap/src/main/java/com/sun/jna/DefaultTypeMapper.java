// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class DefaultTypeMapper implements TypeMapper
{
    private final List<DefaultTypeMapper$Entry> toNativeConverters;
    private final List<DefaultTypeMapper$Entry> fromNativeConverters;
    
    public DefaultTypeMapper() {
        this.toNativeConverters = new ArrayList<DefaultTypeMapper$Entry>();
        this.fromNativeConverters = new ArrayList<DefaultTypeMapper$Entry>();
    }
    
    private Class<?> getAltClass(final Class<?> cls) {
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        return null;
    }
    
    public void addToNativeConverter(final Class<?> cls, final ToNativeConverter converter) {
        this.toNativeConverters.add(new DefaultTypeMapper$Entry(cls, converter));
        final Class<?> altClass = this.getAltClass(cls);
        if (altClass != null) {
            this.toNativeConverters.add(new DefaultTypeMapper$Entry(altClass, converter));
        }
    }
    
    public void addFromNativeConverter(final Class<?> cls, final FromNativeConverter converter) {
        this.fromNativeConverters.add(new DefaultTypeMapper$Entry(cls, converter));
        final Class<?> altClass = this.getAltClass(cls);
        if (altClass != null) {
            this.fromNativeConverters.add(new DefaultTypeMapper$Entry(altClass, converter));
        }
    }
    
    public void addTypeConverter(final Class<?> cls, final TypeConverter converter) {
        this.addFromNativeConverter(cls, converter);
        this.addToNativeConverter(cls, converter);
    }
    
    private Object lookupConverter(final Class<?> javaClass, final Collection<? extends DefaultTypeMapper$Entry> converters) {
        for (final DefaultTypeMapper$Entry defaultTypeMapper$Entry : converters) {
            if (defaultTypeMapper$Entry.type.isAssignableFrom(javaClass)) {
                return defaultTypeMapper$Entry.converter;
            }
        }
        return null;
    }
    
    @Override
    public FromNativeConverter getFromNativeConverter(final Class<?> javaType) {
        return (FromNativeConverter)this.lookupConverter(javaType, this.fromNativeConverters);
    }
    
    @Override
    public ToNativeConverter getToNativeConverter(final Class<?> javaType) {
        return (ToNativeConverter)this.lookupConverter(javaType, this.toNativeConverters);
    }
}
