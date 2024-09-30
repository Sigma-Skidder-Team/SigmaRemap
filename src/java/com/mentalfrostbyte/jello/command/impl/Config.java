package com.mentalfrostbyte.jello.command.impl;

import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.command.ChatCommandExecutor;
import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.command.CommandType;
import mapped.Configuration;
import mapped.ChatCommandArguments;
import org.apache.commons.io.IOUtils;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class Config extends Command {
   private String configFolder;
   private String configFileExtension;
   private final ArrayList<String> saveCommands = new ArrayList<String>(Arrays.asList("add", "create", "new", "save"));
   private final ArrayList<String> deleteCommands = new ArrayList<String>(Arrays.asList("remove", "delete", "del", "rem"));

   public Config() {
      super("config", "Manage configs", "configs", "profiles", "profile");
      this.registerSubCommands("load", "save", "remove", "list");

      if (Client.getInstance().getClientMode().equals(ClientMode.CLASSIC)) {
         configFolder = "/Configs/";
         configFileExtension = ".config";
      } else {
         configFolder = "/profiles/";
         configFileExtension = ".profile";
      }
   }

   @Override
   public void run(String var1, ChatCommandArguments[] args, ChatCommandExecutor user) throws CommandException {
      if (args.length == 0) {
         throw new CommandException();
      } else if (args.length <= 2) {
         if (args[0].getCommandType() != CommandType.TEXT) {
            throw new CommandException();
         } else {
            String action = args[0].getArguments().toLowerCase();

            if (!action.equalsIgnoreCase("load")) {
               if (!this.saveCommands.contains(action)) {
                  if (!this.deleteCommands.contains(action)) {
                     if (!action.equalsIgnoreCase("list")) {
                        throw new CommandException();
                     }

                     user.send("§l" + Client.getInstance().getModuleManager().getConfigurationManager().getAllConfigs().size() + " " + this.getConfigOrProfileName() + " :");

                     for (Configuration config : Client.getInstance().getModuleManager().getConfigurationManager().getAllConfigs()) {
                        boolean isCurrentConfig = Client.getInstance().getModuleManager().getConfigurationManager().getCurrentConfig() == config;
                        if (Client.getInstance().getClientMode() != ClientMode.CLASSIC || !isCurrentConfig) {
                           user.send((!isCurrentConfig ? "" : "§n") + config.getName);
                        }
                     }
                  } else if (args.length != 1) {
                     String name = args[1].getArguments().toLowerCase();
                     if (!Client.getInstance().getModuleManager().getConfigurationManager().removeConfig(name)) {
                        user.send(this.getConfigOrProfileName() + " not found!");
                     } else {
                        user.send("Removed " + this.getConfigOrProfileName());
                     }
                  } else {
                     user.send("Usage : .config remove <name>");
                  }
               } else if (args.length != 1) {
                  String name = args[1].getArguments().toLowerCase();
                  String ogName = args[1].getArguments();
                  Configuration currentConfig = Client.getInstance().getModuleManager().getConfigurationManager().getCurrentConfig();
                  currentConfig.serializedConfigData = Client.getInstance().getModuleManager().saveCurrentConfigToJSON(new JSONObject());
                  Client.getInstance().getModuleManager().getConfigurationManager().removeConfig(name);
                  Client.getInstance().getModuleManager().getConfigurationManager().saveConfig(new Configuration(name, currentConfig.serializedConfigData));
                  saveConfigToFile(ogName);
                  user.send("Saved " + this.getConfigOrProfileName());
               } else {
                  user.send("Usage : .config save <name>");
               }
            } else if (args.length != 1) {
               String name = args[1].getArguments().toLowerCase();
               Configuration config = Client.getInstance().getModuleManager().getConfigurationManager().getConfigByName(name);
               if (config == null) {
                  user.send(this.getConfigOrProfileName() + " not found!");
               } else {
                  Client.getInstance().getModuleManager().getConfigurationManager().loadConfig(config);
                  user.send(this.getConfigOrProfileName() + " was loaded!");
               }
            } else {
               user.send("Usage : .config load <name>");
            }
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }

   public String getConfigOrProfileName() {
      return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? "Profile" : "Config";
   }

   public void saveConfigToFile(String configName) {
      JSONObject jsonConfig  = Client.getInstance().getModuleManager().saveCurrentConfigToJSON(new JSONObject());
      File configFolder = new File(Client.getInstance().getFile() + this.configFolder);
      if (!configFolder.exists()) {
         configFolder.mkdirs();
      }

      File configFile = new File(Client.getInstance().getFile() + this.configFolder + configName + this.configFileExtension);
      if (!configFile.exists()) {
         try {
            configFile.createNewFile();
         } catch (IOException e) {
            throw new RuntimeException(e);
         }
      }

      try {
         IOUtils.write(jsonConfig.toString(0), new FileOutputStream(configFile));
      } catch (IOException | JSONException2 e) {
         throw new RuntimeException(e);
      }
   }
}
