package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import java.util.Map.Entry;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.command.CommandManager;
import com.mentalfrostbyte.jello.module.Module;
import mapped.*;
import net.minecraft.util.text.StringTextComponent;

public class Bind extends Command {
   public Bind() {
      super("bind", "Bind a module to a key");
      this.registerSubCommands(new String[]{"module"});
      this.registerSubCommands(new String[]{"key/none"});
   }

   @Override
   public void run(String var1, ChatCommandArguments[] var2, Class6669 var3) throws CommandException {
      Object var6 = null;
      if (var2.length == 0) {
         CommandManager.method30238(() -> mc.displayGuiScreen(new Class1144(new StringTextComponent("GuiKeybinds"))));
      }

      if (var2.length < 1) {
         throw new CommandException();
      } else {
         if (var2.length != 1) {
            if (var2.length != 2) {
               if (var2.length > 2) {
                  throw new CommandException("Too many arguments");
               }
            } else {
               var6 = this.method18330(var2[0].method30899());
               if (var6 == null || var2[0].method30895() != Class2193.field14335) {
                  throw new CommandException("Module " + var2[0].method30899() + " not found");
               }

               int var14 = this.method18329(var2[1].method30899().toLowerCase());
               if (var14 == -2) {
                  throw new CommandException("Key " + var2[1].method30899() + " not found");
               }

               if (var14 != -1) {
                  Client.getInstance().getModuleManager().method14668().method13725(var14, (Module)var6);
                  var3.send("Key " + var2[1].method30899() + " was set for module " + ((Module)var6).getSuffix());
               } else {
                  Client.getInstance().getModuleManager().method14668().method13727(var6);
                  var3.send("Keybind was reset for module " + ((Module)var6).getSuffix());
               }
            }
         } else {
            var6 = this.method18330(var2[0].method30899());
            if (var6 == null || var2[0].method30895() != Class2193.field14335) {
               throw new CommandException("Module " + var2[0].method30899() + " not found");
            }

            String var7 = "key.keyboard.";
            int var8 = Client.getInstance().getModuleManager().method14668().method13729((Module)var6);
            String var9 = null;

            for (Entry var11 : InputMappingsInput.REGISTRY.entrySet()) {
               if (((String)var11.getKey()).startsWith(var7) && ((InputMappingsInput)var11.getValue()).keyCode == var8) {
                  var9 = ((String)var11.getKey()).substring(var7.length());
               }
            }

            if (var9 != null) {
               var3.send(((Module)var6).getSuffix() + " is bound to : " + var9);
            } else {
               var3.send("§c[Error] " + ((Module)var6).getSuffix() + " is bound to an unknown key");
            }
         }
      }
   }

   public int method18329(String var1) {
      if (!var1.equals("none") && !var1.equals("none")) {
         String var4 = "key.keyboard.";

         for (Entry var6 : InputMappingsInput.REGISTRY.entrySet()) {
            if (((String)var6.getKey()).startsWith(var4)) {
               String var7 = ((String)var6.getKey()).substring(var4.length());
               var7 = var7.replace("keypad.", "");
               var7 = var7.replace(".", "_");
               if (var1.equals(var7)) {
                  return ((InputMappingsInput)var6.getValue()).keyCode;
               }
            }
         }

         return -2;
      } else {
         return -1;
      }
   }

   public Module method18330(String var1) {
      for (Module var5 : Client.getInstance().getModuleManager().getModuleMap().values()) {
         if (var5.getName().replace(" ", "").equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
