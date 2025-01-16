// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;

import java.util.Map;

public class Class6707 extends Class6693
{
    public Class6707() {
        super("bind", "Bind a module to a key", new String[0]);
        this.method20351("module");
        this.method20351("key/none");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length == 0) {
            Class9070.method32674(() -> {
                final Minecraft field26420 = Class6707.field26420;
                new Class531(new StringTextComponent("GuiKeybinds"));
                final Class531 class6429;
                field26420.method5244(class6429);
                return;
            });
        }
        if (array.length >= 1) {
            if (array.length != 1) {
                if (array.length != 2) {
                    if (array.length > 2) {
                        throw new Class2332("Too many arguments");
                    }
                }
                else {
                    final Class3167 method20363 = this.method20363(array[0].method26314());
                    if (method20363 == null || array[0].method26310() != Class1954.field10636) {
                        throw new Class2332("Module " + array[0].method26314() + " not found");
                    }
                    final int method20364 = this.method20362(array[1].method26314());
                    if (method20364 == -2) {
                        throw new Class2332("Key " + array[1].method26314() + " not found");
                    }
                    if (method20364 != -1) {
                        class6428.method19104("Key " + array[1].method26314() + " was set for module " + method20363.method9900());
                        Class9463.method35173().method35189().method21557().method21956(method20364, method20363);
                    }
                    else {
                        class6428.method19104("Keybind was reset for module " + method20363.method9900());
                    }
                }
            }
            else {
                final Class3167 method20365 = this.method20363(array[0].method26314());
                if (method20365 == null || array[0].method26310() != Class1954.field10636) {
                    throw new Class2332("Module " + array[0].method26314() + " not found");
                }
                final String prefix = "key.keyboard.";
                final int method20366 = Class9463.method35173().method35189().method21557().method21960(method20365);
                String substring = null;
                for (final Map.Entry<String, V> entry : Class7985.field32861.entrySet()) {
                    if (!entry.getKey().startsWith(prefix)) {
                        continue;
                    }
                    if (((Class7985)entry.getValue()).field32860 != method20366) {
                        continue;
                    }
                    substring = entry.getKey().substring(prefix.length());
                }
                if (substring != null) {
                    class6428.method19104(method20365.method9900() + " is bound to : " + substring);
                }
                else {
                    class6428.method19104("§c[Error] " + method20365.method9900() + " is bound to an unknown key");
                }
            }
            return;
        }
        throw new Class2332();
    }
    
    public int method20362(final String s) {
        if (!s.equals("none")) {
            final String prefix = "key.keyboard.";
            for (final Map.Entry<String, V> entry : Class7985.field32861.entrySet()) {
                if (entry.getKey().startsWith(prefix) && s.equals(entry.getKey().substring(prefix.length()).replace("keypad.", "").replace(".", "_"))) {
                    return ((Class7985)entry.getValue()).field32860;
                }
            }
            return -2;
        }
        return -1;
    }
    
    public Class3167 method20363(final String anotherString) {
        for (final Class3167 class3167 : Class9463.method35173().method35189().method21553().values()) {
            if (!class3167.method9901().replace(" ", "").equalsIgnoreCase(anotherString)) {
                continue;
            }
            return class3167;
        }
        return null;
    }
}
