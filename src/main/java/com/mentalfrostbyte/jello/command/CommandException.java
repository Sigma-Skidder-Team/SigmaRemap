package com.mentalfrostbyte.jello.command;

public class CommandException extends Exception {
    public String field16621;

    public CommandException() {
        this.field16621 = "";
    }

    public CommandException(String var1) {
        this.field16621 = var1;
    }
}
