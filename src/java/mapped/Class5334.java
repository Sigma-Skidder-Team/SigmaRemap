package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5334 extends Class5325 {
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
    public String method15990() {
        return Client.getInstance().method19954() != ClientMode.CLASSIC ? super.method15990() : "AntiVelocity";
    }
}
