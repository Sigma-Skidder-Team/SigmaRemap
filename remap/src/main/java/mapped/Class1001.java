// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.emitter.Emitter;

public class Class1001 implements Runnable
{
    public final /* synthetic */ Class4968 field5342;
    
    public Class1001(final Class4968 field5342) {
        this.field5342 = field5342;
    }
    
    @Override
    public void run() {
        if (Class4968.method15146(this.field5342) == Class224.field786 || Class4968.method15146(this.field5342) == Class224.field787) {
            Class4968.method15136(this.field5342, Class224.field788);
            final Class4968 field5342 = this.field5342;
            final Class1110 class1110 = new Class1110(this, field5342);
            final Emitter.Listener[] array = { null };
            array[0] = new Class4665(this, field5342, array, class1110);
            final Class1505 class1111 = new Class1505(this, field5342, array);
            if (this.field5342.field21421.size() <= 0) {
                if (!Class4968.method15153(this.field5342)) {
                    class1110.run();
                }
                else {
                    class1111.run();
                }
            }
            else {
                this.field5342.method14977("drain", new Class4689(this, class1111, class1110));
            }
        }
    }
}
