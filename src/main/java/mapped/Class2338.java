// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.PrintStream;

public class Class2338 extends Exception
{
    private static String[] field14081;
    private Throwable field14082;
    
    public Class2338() {
    }
    
    public Class2338(final String message) {
        super(message);
    }
    
    public Class2338(final String message, final Throwable field14082) {
        super(message);
        this.field14082 = field14082;
    }
    
    public Throwable method9452() {
        return this.field14082;
    }
    
    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public void printStackTrace(final PrintStream s) {
        if (this.field14082 != null) {
            this.field14082.printStackTrace();
        }
        else {
            super.printStackTrace(s);
        }
    }
}
