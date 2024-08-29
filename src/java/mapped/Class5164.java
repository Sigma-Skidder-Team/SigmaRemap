package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5164 extends Module {
    private int field23438;

    public Class5164() {
        super(ModuleCategory.MISC, "Spammer", "Spam a message");
        this.registerSetting(new Class6011("Message", "The message sent.", "Use Sigma Client, it's free ! %r"));
        this.registerSetting(new NumberSetting<Float>("Messages delay", "Delay between messages", 3.0F, Float.class, 0.1F, 10.0F, 0.1F));
    }

    @EventTarget
    public void method16066(TickEvent var1) {
        if (this.isEnabled()) {
            this.field23438++;
            if ((float) this.field23438 > this.getNumberValueBySettingName("Messages delay") * 20.0F) {
                this.field23438 = 0;
                String var4 = this.getStringSettingValueByName("Message").replaceAll("%r", Integer.toString(Math.round(10.0F + (float) Math.random() * 89.0F)));
                Class5628.method17679(var4);
            }
        }
    }
}
