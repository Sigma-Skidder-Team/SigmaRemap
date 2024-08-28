package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class7248;

public class Class5288 extends Module {
    public Class5288() {
        super(ModuleCategory.COMBAT, "AntiBot", "Avoid the client to focus bots.");
        this.method15972(new Class6005("Mode", "Mode", 0, "Advanced", "Hypixel").method18616(var1 -> this.method16603()));
    }

    @Override
    public void method15953() {
        if (this.method15996()) {
            this.method16603();
        }
    }

    @Override
    public void method15966() {
        this.method16603();
    }

    @Override
    public void method15965() {
        Client.getInstance().getCombatManager().field35946 = null;
        Client.getInstance().getCombatManager().field35947.clear();
    }

    private void method16603() {
        Client.getInstance().getCombatManager().field35947.clear();
        String var3 = this.method15978("Mode");
        switch (var3) {
            case "Advanced":
                Client.getInstance().getCombatManager().field35946 = new Class7248();
                break;
            case "Hypixel":
                Client.getInstance().getCombatManager().field35946 = new Class7250();
        }
    }
}
