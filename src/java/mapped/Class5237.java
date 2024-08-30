package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mojang.brigadier.suggestion.Suggestion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class5237 extends Module {
    public String field23591 = null;
    public List<String> field23592 = new ArrayList<String>();
    public List<String> field23593 = new ArrayList<String>();

    public Class5237() {
        super(ModuleCategory.EXPLOIT, "Dumper", "Dumps the plugins/commands from the server");
    }

    @Override
    public void onEnable() {
        this.field23591 = null;
        this.field23592.clear();
        this.field23593.clear();
        ColorUtils.method17678("Dumping...");
        this.method16328("");
    }

    @Override
    public void onDisable() {
        ColorUtils.method17678("Done.");
        ColorUtils.method17678("§aPlugins:");
        StringBuilder var3 = new StringBuilder();

        for (String var5 : this.field23593) {
            var3.append(var5).append(", ");
        }

        String var10 = var3.substring(0, var3.length() - 2);
        ColorUtils.method17678(var10);
        ColorUtils.method17678("§aCommands:");
        var3 = new StringBuilder();

        for (String var6 : this.field23592) {
            var3.append(var6).append(", ");
        }

        String var12 = var3.substring(0, var3.length() - 2);
        ColorUtils.method17678(var12);

        try {
            File var13 = new File(Client.getInstance().getFile() + "/plugin_and_command_dump.txt");
            if (!var13.exists()) {
                var13.createNewFile();
            }

            FileWriter var7 = new FileWriter(var13);
            var7.write("Plugins: " + var10 + "\n\n");
            var7.write("Commands: " + var12 + "\n");
            var7.close();
            ColorUtils.method17678("§bDumped to: " + var13.getAbsolutePath());
        } catch (IOException var8) {
            var8.printStackTrace();
            ColorUtils.method17678("§cCould not save dump file.");
        }
    }

    private String method16326() {
        return !this.field23591.equals("") ? (!this.field23591.equals("z") ? Character.toString((char) (this.field23591.charAt(0) + 1)) : null) : "a";
    }

    @EventTarget
    private void method16327(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof Class5543) {
                for (Suggestion var6 : ((Class5543) var1.getPacket()).method17425().getList()) {
                    String[] var7 = var6.getText().split(":");
                    if (var7.length > 1) {
                        String var8 = var7[0].substring(1);
                        if (!var8.equals("minecraft") && !var8.equals("bukkit") && !this.field23593.contains(var8)) {
                            this.field23593.add(var8);
                        }
                    }

                    if (!this.field23592.contains(var6.getText())) {
                        this.field23592.add(var6.getText());
                    }
                }

                String var9 = this.method16326();
                if (var9 == null) {
                    this.method16000();
                } else {
                    this.method16328(var9);
                }
            }
        }
    }

    private void method16328(String var1) {
        this.field23591 = var1;
        mc.getConnection().sendPacket(new Class5562(0, "/" + var1));
    }
}
