// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3288 extends Class3167
{
    public Class3288() {
        super(Class8013.field32984, "Streaming", "Useful module when recording or streaming");
        this.method9881(new Class4999("Hide server name", "Spoof server name", false));
        this.method9881(new Class4998("Server name", "The server name that you need to hide", "ServerNameHere"));
    }
    
    @Class6753
    public void method10401(final Class5727 class5727) {
        if (this.method9906()) {
            if (this.method9883("Hide server name")) {
                if (this.method9887("Server name").length() > 1) {
                    class5727.method17002(class5727.method17001().replaceAll(this.method9887("Server name"), "sigmaclient"));
                    class5727.method17002(class5727.method17001().replaceAll(this.method9887("Server name").toLowerCase(), "sigmaclient"));
                    class5727.method17002(class5727.method17001().replaceAll(this.method9887("Server name").toUpperCase(), "sigmaclient"));
                }
            }
        }
    }
    
    @Class6753
    public void method10402(final Class5749 class5749) {
    }
    
    @Class6753
    public void method10403(final Class5729 class5729) {
        if (this.method9906()) {
            return;
        }
    }
}
