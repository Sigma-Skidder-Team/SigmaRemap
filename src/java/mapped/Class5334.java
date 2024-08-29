package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5334 extends ModuleWithModuleSettings {
    public Class5334() {
        super(
                ModuleCategory.COMBAT,
                "AntiKnockBack",
                "Prevents you from taking knockback",
                new Class5166(),
                new Class5351(),
                new Class5203(),
                new Class5247(),
                new Class5245()
        );
    }

    @Override
    public String getSuffix() {
        return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? super.getSuffix() : "AntiVelocity";
    }
}
