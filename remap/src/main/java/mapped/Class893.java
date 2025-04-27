// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class893 implements Runnable
{
    public final /* synthetic */ Class4968 field4832;
    
    public Class893(final Class4968 field4832) {
        this.field4832 = field4832;
    }
    
    @Override
    public void run() {
        String s = null;
        Label_0106: {
            if (Class4968.method15133(this.field4832)) {
                if (Class4968.method15134()) {
                    if (Class4968.method15135(this.field4832).contains("websocket")) {
                        s = "websocket";
                        break Label_0106;
                    }
                }
            }
            if (0 == Class4968.method15135(this.field4832).size()) {
                EventThread.method5436(new Class1170(this, this.field4832));
                return;
            }
            s = Class4968.method15135(this.field4832).get(0);
        }
        Class4968.method15136(this.field4832, Class224.field786);
        final Class4963 method15137 = Class4968.method15137(this.field4832, s);
        Class4968.method15138(this.field4832, method15137);
        method15137.method14997();
    }
}
