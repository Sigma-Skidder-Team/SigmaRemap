// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.commands.CommandException;

import java.util.List;
import java.util.regex.Pattern;

public class Class6706 extends Class6693
{
    public Class6706() {
        super("friend", "Manage friends", "friends", "f");
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
                        class6428.method19104("Usage : .friend add <name>");
                        break;
                    }
                    if (Pattern.compile("[a-zA-Z0-9_]{2,16}").matcher(array[1].method26314()).matches()) {
                        if (!Client.getInstance().getFriendManager().method29882(array[1].method26314())) {
                            class6428.method19104("\"" + array[1].method26314() + "\" is already your friend.");
                        }
                        else {
                            class6428.method19104("\"" + array[1].method26314() + "\" is now your friend.");
                        }
                    }
                    else {
                        class6428.method19104("Invalid name \"" + array[1].method26314() + "\"");
                    }
                    break;
                }
                case "remove": {
                    if (array.length != 2) {
                        class6428.method19104("Usage : .friend remove <name>");
                        break;
                    }
                    if (!Client.getInstance().getFriendManager().method29886(array[1].method26314())) {
                        class6428.method19104("\"" + array[1].method26314() + "\" is not your friend :(.");
                    }
                    else {
                        class6428.method19104("\"" + array[1].method26314() + "\" is no longer your friend.");
                    }
                    break;
                }
                case "list": {
                    final List<String> method29884 = Client.getInstance().getFriendManager().method29884();
                    if (method29884.isEmpty()) {
                        class6428.method19104("You have no friends :(");
                        break;
                    }
                    class6428.method19104("Friends : (" + method29884.size() + ")");
                    String s2 = "";
                    for (final String s3 : method29884) {
                        if (s3.equals(method29884.get(method29884.size() - 1))) {
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
                    if (Client.getInstance().getFriendManager().method29888()) {
                        class6428.method19104("Cleared all your friends.");
                        break;
                    }
                    class6428.method19104("You have no friends :(.");
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
