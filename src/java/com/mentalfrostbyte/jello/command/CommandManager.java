package com.mentalfrostbyte.jello.command;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.command.impl.*;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.network.play.client.CChatMessagePacket;
import net.minecraft.network.play.client.CTabCompletePacket;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    public static final String CHAT_COMMAND_CHAR = ".";
    public static final String CHAT_PREFIX = "§f[§6Sigma§f]§7";
    private static final List<Runnable> field38299 = new ArrayList<Runnable>();
    public List<Command> commands = new ArrayList<Command>();
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
        for (Command var5 : this.commands) {
            if (var5.getName().equals(var1)) {
                return var5;
            }
        }

        for (Command command : this.commands) {
            for (String var9 : command.getAlias()) {
                if (var9.equals(var1)) {
                    return command;
                }
            }
        }

        return null;
    }

    public List<Command> getCommands() {
        return this.commands;
    }

    private void register(Command var1) {
        this.commands.add(var1);
    }

    public void method30234(String var1) {
        MultiUtilities.addChatMessage(this.getPrefix() + " Invalid command \"" + "." + var1 + "\"");
        MultiUtilities.addChatMessage(this.getPrefix() + " Use \"" + "." + "help\" for a list of commands.");
    }

    public String getPrefix() {
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
    private void onSendPacket(SendPacketEvent var1) {
        if (Client.getInstance().getClientMode() != ClientMode.NOADDONS) {
            if (var1.getPacket() instanceof CChatMessagePacket) {
                CChatMessagePacket var4 = (CChatMessagePacket) var1.getPacket();
                String var5 = var4.getMessage();
                if (var5.startsWith(".") && var5.substring(1).startsWith(".")) {
                    var4.message = var5.substring(1);
                    return;
                }

                if (var5.startsWith(".")) {
                    var1.setCancelled(true);
                    this.method30236();
                    String[] var6 = var5.substring(".".length()).split(" ");
                    Command var7 = this.method30231(var6[0]);
                    if (var7 == null) {
                        this.method30234(var6[0]);
                        return;
                    }

                    ArrayList var8 = new ArrayList();

                    for (int var9 = 1; var9 < var6.length; var9++) {
                        var8.add(new ChatCommandArguments(var6[var9]));
                    }

                    MultiUtilities.addChatMessage(" ");

                    try {
                        var7.run(var5, (ChatCommandArguments[]) var8.<ChatCommandArguments>toArray(new ChatCommandArguments[0]), var1x -> MultiUtilities.addChatMessage(this.getPrefix() + " " + var1x));
                    } catch (CommandException var10) {
                        if (var10.field16621.length() > 0) {
                            MultiUtilities.addChatMessage(this.getPrefix() + " Error: " + var10.field16621);
                        }

                        MultiUtilities.addChatMessage(this.getPrefix() + " Usage: " + "." + var7.getName() + " " + var7.method18326());
                    }

                    MultiUtilities.addChatMessage(" ");
                }
            }

            if (var1.getPacket() instanceof CTabCompletePacket) {
                CTabCompletePacket var11 = (CTabCompletePacket) var1.getPacket();
                if (var11.getCommand().startsWith(".")) {
                    var1.setCancelled(true);
                }
            }
        }
    }
}
