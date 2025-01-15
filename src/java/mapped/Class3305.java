// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3305 extends Class3167
{
    private int field15877;
    
    public Class3305() {
        super(Class8013.field32988, "Spammer", "Spam a message");
        this.method9881(new Class4998("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
        this.method9881(new Class4996("Messages delay", "Delay between messages", 3.0f, Float.class, 0.1f, 10.0f, 0.1f));
    }
    
    @Class6753
    public void method10465(final Class5743 class5743) {
        if (this.method9906()) {
            ++this.field15877;
            if (this.field15877 > this.method9886("Messages delay") * 20.0f) {
                this.field15877 = 0;
                Class6430.method19107(this.method9887("Message").replaceAll("%r", Integer.toString(Math.round(10.0f + (float)Math.random() * 89.0f))));
            }
        }
    }
}
