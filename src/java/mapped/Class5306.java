package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5306 extends Module {
    public Class5306() {
        super(ModuleCategory.MISC, "ChatFilter", "Bypasse chat filters");
    }

    @EventTarget
    private void method16679(SendPacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.method13932() instanceof Class5522) {
                Class5522 var4 = (Class5522) var1.method13932();
                String[] var5 = var4.field24496.split(" ");
                if (var4.field24496.length() + var5.length <= 100) {
                    StringBuilder var6 = new StringBuilder();
                    boolean var7 = false;

                    for (int var8 = 0; var8 < var5.length; var8++) {
                        if (!var5[var8].startsWith("/")) {
                            if (var5.length != 0) {
                                var6.append(" ");
                            }

                            String var9 = var5[var8].substring(0, 1);
                            String var10 = var5[var8].substring(1);
                            var6.append(var9 + "\uf8ff" + var10);
                        } else {
                            var6.append(var5[var8]);
                            var7 = !var5[var8].equals("/r") && !var5[var8].equals("/msg");
                        }
                    }

                    if (!var7) {
                        var4.field24496 = var6.toString();
                    }
                }
            }
        }
    }
}
