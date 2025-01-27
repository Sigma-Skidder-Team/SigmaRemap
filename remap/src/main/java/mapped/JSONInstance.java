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
    
    public boolean isPremium(final String text) {
        return text.startsWith("pr") && text.endsWith("um");
    }
    
    @Override
    public boolean getBoolean(final String s) {
        final boolean converted = super.getBoolean(s);
        if (converted && this.isPremium(s)) {
            Class1607.thread.interrupt();
        }
        else if (this.isPremium(s)) {
            this.method13251();
        }
        return converted;
    }
}
