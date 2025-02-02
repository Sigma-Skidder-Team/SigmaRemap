// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;

public class Class8799
{
    public Module field36994;
    public Class<? extends Screen> field36995;
    
    public Class8799(final Module field36994) {
        this.field36994 = field36994;
    }
    
    public Class8799(final Class<? extends Screen> field36995) {
        this.field36995 = field36995;
    }
    
    public String method30702() {
        if (this.field36994 == null) {
            return Class9000.field37983.get(this.field36995);
        }
        return this.field36994.getName();
    }
    
    public String method30703() {
        if (this.field36994 == null) {
            return "Screen";
        }
        return this.field36994.getCategory2().getName();
    }
    
    public void method30704(final int n) {
        if (this.field36994 == null) {
            Client.getInstance().method35189().method21557().method21957(n, this.field36995);
        }
        else {
            Client.getInstance().method35189().method21557().method21956(n, this.field36994);
        }
    }
    
    public int method30705() {
        if (this.field36994 == null) {
            return Client.getInstance().method35189().method21557().method21959(this.field36995);
        }
        return Client.getInstance().method35189().method21557().method21960(this.field36994);
    }
}
