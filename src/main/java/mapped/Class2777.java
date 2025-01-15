// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;

public class Class2777 extends Class2770
{
    public Class2777() {
        super(Class2058.field11745);
    }
    
    @Override
    public void method9804() throws InvalidDataException {
        super.method9804();
        if (Class8142.method26841(this.method9811())) {
            return;
        }
        throw new Class2319(1007, "Received text is no valid utf8 string!");
    }
}
