package com.mentalfrostbyte.jello.command;


import mapped.Class6669;
import mapped.Class8623;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Command {
    public static final Minecraft mc = Minecraft.getInstance();
    private final String name;
    private final String descriptor;
    private final String[] field25701;
    private final List<String> field25702 = new ArrayList<String>();

    public Command(String var1, String var2, String... var3) {
        this.name = var1;
        this.descriptor = var2;
        this.field25701 = var3;
    }

    public String method18324() {
        return this.name;
    }

    public String method18325() {
        return this.descriptor;
    }

    public String method18326() {
        String var3 = "";

        for (String var5 : this.field25702) {
            var3 = var3 + "[" + var5 + "] ";
        }

        return var3;
    }

    public String[] method18327() {
        return this.field25701;
    }

    public void registerSubCommands(String... var1) {
        Collections.addAll(this.field25702, var1);
    }

    public abstract void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException;
}
