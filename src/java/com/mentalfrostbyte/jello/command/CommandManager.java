package com.mentalfrostbyte.jello.command;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import mapped.*;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    public static final String field38296 = ".";
    public static final String field38297 = "§f[§6Sigma§f]§7";
    private static final List<Runnable> field38299 = new ArrayList<Runnable>();
    public List<Command> field38295 = new ArrayList<Command>();
    private boolean field38298 = true;

    public static void method30238(Runnable var0) {
        field38299.add(var0);
    }

    public void init() {
        Client.getInstance().getEventManager().register(this);
        this.register(new VClip());
        this.register(new HClip());
        this.register(new Damage());
        this.register(new ClearChat());
        this.register(new EntityDesync());
        this.register(new Peek());
        this.register(new Insult());
        this.register(new Bind());
        this.register(new Help());
        this.register(new Friend());
        this.register(new Enemy());
        this.register(new Toggle());
        this.register(new Config());
        this.register(new Panic());
        this.register(new HighDPI());
        this.register(new KillPotion());
        this.register(new Enchant());
        this.register(new TP());
    }

    public Command method30231(String var1) {
        for (Command var5 : this.field38295) {
            if (var5.method18324().equals(var1)) {
                return var5;
            }
        }

        for (Command var11 : this.field38295) {
            for (String var9 : var11.method18327()) {
                if (var9.equals(var1)) {
                    return var11;
                }
            }
        }

        return null;
    }

    public List<Command> method30232() {
        return this.field38295;
    }

    private void register(Command var1) {
        this.field38295.add(var1);
    }

    public void method30234(String var1) {
        Class5628.method17678(this.method30235() + " Invalid command \"" + "." + var1 + "\"");
        Class5628.method17678(this.method30235() + " Use \"" + "." + "help\" for a list of commands.");
    }

    public String method30235() {
        if (this.field38298) {
            this.field38298 = false;
            return "§f[§6Sigma§f]§7";
        } else {
            String var3 = "";

            for (int var4 = 0; var4 < 8; var4++) {
                var3 = var3 + " ";
            }

            return var3 + "§7";
        }
    }

    public void method30236() {
        this.field38298 = true;
    }

    @EventTarget
    private void method30237(TickEvent var1) {
        for (Runnable var5 : field38299) {
            var5.run();
        }

        field38299.clear();
    }

    @EventTarget
    private void method30239(SendPacketEvent var1) {
        if (Client.getInstance().getClientMode() != ClientMode.NOADDONS) {
            if (var1.method13932() instanceof Class5522) {
                Class5522 var4 = (Class5522) var1.method13932();
                String var5 = var4.method17359();
                if (var5.startsWith(".") && var5.substring(1).startsWith(".")) {
                    var4.field24496 = var5.substring(1);
                    return;
                }

                if (var5.startsWith(".")) {
                    var1.method13900(true);
                    this.method30236();
                    String[] var6 = var5.substring(".".length()).split(" ");
                    Command var7 = this.method30231(var6[0]);
                    if (var7 == null) {
                        this.method30234(var6[0]);
                        return;
                    }

                    ArrayList var8 = new ArrayList();

                    for (int var9 = 1; var9 < var6.length; var9++) {
                        var8.add(new Class8623(var6[var9]));
                    }

                    Class5628.method17678(" ");

                    try {
                        var7.run(var5, (Class8623[]) var8.<Class8623>toArray(new Class8623[0]), var1x -> Class5628.method17678(this.method30235() + " " + var1x));
                    } catch (CommandException var10) {
                        if (var10.field16621.length() > 0) {
                            Class5628.method17678(this.method30235() + " Error: " + var10.field16621);
                        }

                        Class5628.method17678(this.method30235() + " Usage: " + "." + var7.method18324() + " " + var7.method18326());
                    }

                    Class5628.method17678(" ");
                }
            }

            if (var1.method13932() instanceof Class5562) {
                Class5562 var11 = (Class5562) var1.method13932();
                if (var11.method17486().startsWith(".")) {
                    var1.method13900(true);
                }
            }
        }
    }
}
