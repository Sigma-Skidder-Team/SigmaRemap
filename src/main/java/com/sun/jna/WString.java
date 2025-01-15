// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

public final class WString implements CharSequence, Comparable
{
    private String string;
    
    public WString(final String s) {
        if (s == null) {
            throw new NullPointerException("String initializer must be non-null");
        }
        this.string = s;
    }
    
    @Override
    public String toString() {
        return this.string;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof WString && this.toString().equals(o.toString());
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.toString().compareTo(o.toString());
    }
    
    @Override
    public int length() {
        return this.toString().length();
    }
    
    @Override
    public char charAt(final int index) {
        return this.toString().charAt(index);
    }
    
    @Override
    public CharSequence subSequence(final int start, final int end) {
        return this.toString().subSequence(start, end);
    }
}
