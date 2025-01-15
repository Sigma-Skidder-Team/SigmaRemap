// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Class6701 extends Class6693
{
    public Class6701() {
        super("enemy", "Manage enemies", new String[] { "enemies", "target" });
        this.method20351("add/remove/list/clear");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length == 0) {
            throw new Class2332();
        }
        if (array[0].method26310() == Class1954.field10636) {
            final String lowerCase = array[0].method26314().toLowerCase();
            switch (lowerCase) {
                case "add": {
                    if (array.length != 2) {
                        class6428.method19104("Usage : .enemy add <name>");
                        break;
                    }
                    if (Pattern.compile("[a-zA-Z0-9_]{2,16}").matcher(array[1].method26314()).matches()) {
                        if (!Class9463.method35173().method35190().method29883(array[1].method26314())) {
                            class6428.method19104("\"" + array[1].method26314() + "\" is already your enemy.");
                        }
                        else {
                            class6428.method19104("\"" + array[1].method26314() + "\" is now your enemy.");
                        }
                    }
                    else {
                        class6428.method19104("Invalid name \"" + array[1].method26314() + "\"");
                    }
                    break;
                }
                case "remove": {
                    if (array.length != 2) {
                        class6428.method19104("Usage : .enemy remove <name>");
                        break;
                    }
                    if (!Class9463.method35173().method35190().method29887(array[1].method26314())) {
                        class6428.method19104("\"" + array[1].method26314() + "\" is not your enemy.");
                    }
                    else {
                        class6428.method19104("\"" + array[1].method26314() + "\" is no longer your enemy.");
                    }
                    break;
                }
                case "list": {
                    final List<String> method29885 = Class9463.method35173().method35190().method29885();
                    if (method29885.isEmpty()) {
                        class6428.method19104("You have no enemies");
                        break;
                    }
                    class6428.method19104("Enemies : (" + method29885.size() + ")");
                    String s2 = "";
                    for (final String s3 : method29885) {
                        if (s3.equals(method29885.get(method29885.size() - 1))) {
                            s2 = s2.concat(s3 + ".");
                        }
                        else {
                            s2 = s2.concat(s3 + ", ");
                        }
                    }
                    class6428.method19104(s2);
                    break;
                }
                case "clear": {
                    if (Class9463.method35173().method35190().method29889()) {
                        class6428.method19104("Cleared all your enemies.");
                        break;
                    }
                    class6428.method19104("You have no enemies.");
                    break;
                }
                default: {
                    throw new Class2332();
                }
            }
            return;
        }
        throw new Class2332();
    }
}
