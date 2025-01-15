// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileNotFoundException;
import com.google.common.collect.Lists;
import java.util.List;
import java.io.IOException;

public class Class2355 extends IOException
{
    private final List<Class8418> field14139;
    private final String field14140;
    
    public Class2355(final String field14140) {
        (this.field14139 = Lists.newArrayList()).add(new Class8418(null));
        this.field14140 = field14140;
    }
    
    public Class2355(final String field14140, final Throwable cause) {
        super(cause);
        (this.field14139 = Lists.newArrayList()).add(new Class8418(null));
        this.field14140 = field14140;
    }
    
    public void method9493(final String s) {
        Class8418.method28109(this.field14139.get(0), s);
    }
    
    public void method9494(final String s) {
        Class8418.method28110(this.field14139.get(0), s);
        this.field14139.add(0, new Class8418(null));
    }
    
    @Override
    public String getMessage() {
        return "Invalid " + this.field14139.get(this.field14139.size() - 1) + ": " + this.field14140;
    }
    
    public static Class2355 method9495(final Exception ex) {
        if (!(ex instanceof Class2355)) {
            String message = ex.getMessage();
            if (ex instanceof FileNotFoundException) {
                message = "File not found";
            }
            return new Class2355(message, ex);
        }
        return (Class2355)ex;
    }
}
