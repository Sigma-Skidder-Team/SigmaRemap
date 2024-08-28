package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4410;
import com.mentalfrostbyte.jello.event.impl.Class4411;
import com.mentalfrostbyte.jello.event.impl.Class4433;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5358 extends Module {
    public Class5358() {
        super(ModuleCategory.RENDER, "Streaming", "Useful module when recording or streaming");
        this.method15972(new Class6004("Hide skins", "Spoof all players skin", true));
        this.method15972(new Class6004("Hide server name", "Spoof server name", false));
        this.method15972(new Class6011("Server name", "The server name that you need to hide", "servernamehere"));
        this.method15972(new Class6004("Hide date", "Hide date on scoreboard", false));
    }

    @EventTarget
    public void method16849(Class4411 var1) {
        if (this.method15996()) {
            if (this.method15974("Hide server name") && this.method15978("Server name").length() > 1) {
                var1.method13959(var1.method13958().replaceAll(this.method15978("Server name"), "sigmaclient"));
                var1.method13959(var1.method13958().replaceAll(this.method15978("Server name").toLowerCase(), "sigmaclient"));
                var1.method13959(var1.method13958().replaceAll(this.method15978("Server name").toUpperCase(), "sigmaclient"));
            }
        }
    }

    @EventTarget
    public void method16850(Class4433 var1) {
    }

    @EventTarget
    public void method16851(Class4410 var1) {
        if (this.method15996()) {
            if (this.method15974("Hide skins")) {
                var1.method13955(false);
            }
        }
    }
}
