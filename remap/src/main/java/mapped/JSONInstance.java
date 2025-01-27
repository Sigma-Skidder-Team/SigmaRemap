// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class JSONInstance extends JSONObject
{
    public JSONInstance(final String s) {
        super(s);
    }
    
    public void method13251() {
        Class1607.thread.interrupt();
        (Class1607.thread = new Thread(new Class1607())).start();
    }

    @Override
    public boolean has(final String text) {
        return text.startsWith("pr") && text.endsWith("um");
    }
    
    @Override
    public boolean getBoolean(final String s) {
        final boolean converted = super.getBoolean(s);
        if (converted && this.has(s)) {
            Class1607.thread.interrupt();
        }
        else if (this.has(s)) {
            this.method13251();
        }
        return converted;
    }
}
