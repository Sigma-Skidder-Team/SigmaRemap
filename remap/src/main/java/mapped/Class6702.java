// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.OutputStream;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.IOUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import com.mentalfrostbyte.jello.commands.CommandException;

import java.util.Arrays;
import java.util.ArrayList;

public class Class6702 extends Class6693
{
    private final String field26426 = "/configs/";
    private final String field26427 = ".config";
    private final ArrayList<String> field26428;
    private final ArrayList<String> field26429;
    
    public Class6702() {
        super("config", "Manage configs", new String[] { "configs", "profiles", "profile" });
        this.field26428 = new ArrayList<String>(Arrays.asList("add", "create", "new", "save"));
        this.field26429 = new ArrayList<String>(Arrays.asList("remove", "delete", "del", "rem"));
        this.method20351("load/save/remove/list");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length == 0) {
            throw new Class2332();
        }
        if (array.length > 2) {
            throw new Class2332("Too many arguments");
        }
        if (array[0].method26310() != Class1954.field10636) {
            throw new Class2332();
        }
        final String lowerCase = array[0].method26314().toLowerCase();
        if (!lowerCase.equalsIgnoreCase("load")) {
            if (!this.field26428.contains(lowerCase)) {
                if (!this.field26429.contains(lowerCase)) {
                    if (!lowerCase.equalsIgnoreCase("list")) {
                        throw new Class2332();
                    }
                    class6428.method19104("§l" + Client.getInstance().method35189().getProfile().method32709().size() + " " + this.method20356() + " :");
                    for (final Class8241 class6429 : Client.getInstance().method35189().getProfile().method32709()) {
                        final boolean b = Client.getInstance().method35189().getProfile().method32707() == class6429;
                        if (Client.getInstance().getClientMode() == ClientMode.CLASSIC && b) {
                            continue;
                        }
                        class6428.method19104((b ? "§n" : "") + class6429.field33839);
                    }
                }
                else if (array.length != 1) {
                    if (!Client.getInstance().method35189().getProfile().method32702(array[1].method26314().toLowerCase())) {
                        class6428.method19104(this.method20356() + " not found!");
                    }
                    else {
                        class6428.method19104("Removed " + this.method20356());
                    }
                }
                else {
                    class6428.method19104("Usage : .config remove <name>");
                }
            }
            else if (array.length != 1) {
                final String lowerCase2 = array[1].method26314().toLowerCase();
                final Class8241 method32707 = Client.getInstance().method35189().getProfile().method32707();
                method32707.field33838 = Client.getInstance().method35189().saveCurrentConfigToJSON(new JSONObject());
                Client.getInstance().method35189().getProfile().method32702(lowerCase2);
                Client.getInstance().method35189().getProfile().method32700(new Class8241(lowerCase2, method32707.field33838));
                class6428.method19104("Saved " + this.method20356());
            }
            else {
                class6428.method19104("Usage : .config save <name>");
            }
        }
        else if (array.length != 1) {
            final Class8241 method32708 = Client.getInstance().method35189().getProfile().method32703(array[1].method26314().toLowerCase());
            if (method32708 == null) {
                class6428.method19104(this.method20356() + " not found!");
            }
            else {
                Client.getInstance().method35189().getProfile().method32708(method32708);
                class6428.method19104(this.method20356() + " was loaded!");
            }
        }
        else {
            class6428.method19104("Usage : .config load <name>");
        }
    }
    
    public String method20356() {
        if (Client.getInstance().getClientMode() != ClientMode.CLASSIC) {
            return "Profile";
        }
        return "Config";
    }
    
    public void method20357(final String str) {
        Client.getInstance().method35189().saveCurrentConfigToJSON(new JSONObject());
        final File file = new File(Client.getInstance().method35208() + "/configs/");
        if (!file.exists()) {
            file.mkdirs();
        }
        final File file2 = new File(Client.getInstance().method35208() + "/configs/" + str + ".config");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        try {
            IOUtils.write(new JSONObject().toString(0), (OutputStream)new FileOutputStream(file2));
        }
        catch (final JSONException | IOException ex2) {
            ((Throwable)ex2).printStackTrace();
        }
    }
}
