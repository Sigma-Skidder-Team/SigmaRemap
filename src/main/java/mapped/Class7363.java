// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7363 implements Class7359
{
    private String field28403;
    private boolean field28404;
    private Class field28405;
    
    public Class7363(final String field28403) {
        this.field28403 = null;
        this.field28404 = false;
        this.field28405 = null;
        this.field28403 = field28403;
        Class7462.method22986(this);
    }
    
    public Class7363(final Class field28405) {
        this.field28403 = null;
        this.field28404 = false;
        this.field28405 = null;
        this.field28405 = field28405;
        this.field28403 = field28405.getName();
        this.field28404 = true;
    }
    
    public Class method22622() {
        if (this.field28404) {
            return this.field28405;
        }
        this.field28404 = true;
        try {
            this.field28405 = Class.forName(this.field28403);
        }
        catch (final ClassNotFoundException ex) {
            Class7497.method23338("(Reflector) Class not present: " + this.field28403);
        }
        catch (final Throwable t) {
            t.printStackTrace();
        }
        return this.field28405;
    }
    
    public boolean method22623() {
        return this.method22622() != null;
    }
    
    public String method22624() {
        return this.field28403;
    }
    
    public boolean method22625(final Object o) {
        return this.method22622() != null && this.method22622().isInstance(o);
    }
    
    public Class7364 method22626(final String s) {
        return new Class7364(this, s);
    }
    
    public Class7361 method22627(final String s) {
        return new Class7361(this, s);
    }
    
    public Class7361 method22628(final String s, final Class[] array) {
        return new Class7361(this, s, array);
    }
    
    @Override
    public void method22603() {
        this.method22622();
    }
}
