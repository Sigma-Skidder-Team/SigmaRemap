// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import java.io.PrintStream;

public class Class6302 implements Class6301
{
    public static PrintStream field25199;
    
    @Override
    public void method18659(final String s, final Throwable t) {
        this.method18661(s);
        this.method18660(t);
    }
    
    @Override
    public void method18660(final Throwable t) {
        Class6302.field25199.println(new Date() + " ERROR:" + t.getMessage());
        t.printStackTrace(Class6302.field25199);
    }
    
    @Override
    public void method18661(final String str) {
        Class6302.field25199.println(new Date() + " ERROR:" + str);
    }
    
    @Override
    public void method18662(final String str) {
        Class6302.field25199.println(new Date() + " WARN:" + str);
    }
    
    @Override
    public void method18664(final String str) {
        Class6302.field25199.println(new Date() + " INFO:" + str);
    }
    
    @Override
    public void method18665(final String str) {
        Class6302.field25199.println(new Date() + " DEBUG:" + str);
    }
    
    @Override
    public void method18663(final String s, final Throwable t) {
        this.method18662(s);
        t.printStackTrace(Class6302.field25199);
    }
    
    static {
        Class6302.field25199 = System.out;
    }
}
