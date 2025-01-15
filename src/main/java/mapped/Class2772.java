// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;

public abstract class Class2772 extends Class2771
{
    public Class2772(final Class2058 class2058) {
        super(class2058);
    }
    
    @Override
    public void method9804() throws InvalidDataException {
        if (!this.method9808()) {
            throw new Class2322("Control frame cant have fin==false set");
        }
        if (this.method9805()) {
            throw new Class2322("Control frame cant have rsv1==true set");
        }
        if (this.method9806()) {
            throw new Class2322("Control frame cant have rsv2==true set");
        }
        if (!this.method9807()) {
            return;
        }
        throw new Class2322("Control frame cant have rsv3==true set");
    }
}
