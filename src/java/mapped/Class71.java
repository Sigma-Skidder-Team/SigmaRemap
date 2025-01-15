// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class71 extends Class61
{
    private String field161;
    
    public Class71(final String s) {
        this(s, "");
    }
    
    public Class71(final String s, final String field161) {
        super(s);
        this.field161 = field161;
    }
    
    public String method406() {
        return this.field161;
    }
    
    public void method407(final String field161) {
        this.field161 = field161;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field161 = dataInput.readUTF();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.field161);
    }
    
    @Override
    public Class71 clone() {
        return new Class71(this.method375(), this.method406());
    }
}
