package net.minecraft.scoreboard;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public abstract class Team {
   public boolean method28592(Team var1) {
      return var1 != null ? this == var1 : false;
   }

   public abstract String method28567();

   public abstract IFormattableTextComponent method28576(ITextComponent var1);

   public abstract boolean method28580();

   public abstract boolean method28578();

   public abstract Visible method28582();

   public abstract TextFormatting getColor();

   public abstract Collection<String> method28575();

   public abstract Visible method28583();

   public abstract CollisionRule method28586();

   public enum Visible {
      ALWAYS("always", 0),
      NEVER("never", 1),
      HIDE_FOR_OTHER_TEAMS("hideForOtherTeams", 2),
      HIDE_FOR_OWN_TEAM("hideForOwnTeam", 3);

      private static final Map<String, Visible> nameMap = Arrays.stream(values())
         .collect(Collectors.toMap(var0 -> var0.internalName, var0 -> var0));
      public final String internalName;
      public final int id;

       @Nullable
      public static Visible getByName(String var0) {
         return nameMap.get(var0);
      }

      Visible(String var3, int var4) {
         this.internalName = var3;
         this.id = var4;
      }

      public ITextComponent getDisplayName() {
         return new TranslationTextComponent("team.visibility." + this.internalName);
      }
   }

   public enum CollisionRule {
      ALWAYS("always", 0),
      NEVER("never", 1),
      PUSH_OTHER_TEAMS("pushOtherTeams", 2),
      PUSH_OWN_TEAM("pushOwnTeam", 3);

      private static final Map<String, CollisionRule> nameMap = Arrays.stream(values())
         .collect(Collectors.toMap(var0 -> var0.name, var0 -> var0));
      public final String name;
      public final int id;

       @Nullable
      public static CollisionRule getByName(String var0) {
         return nameMap.get(var0);
      }

      CollisionRule(String var3, int var4) {
         this.name = var3;
         this.id = var4;
      }

      public ITextComponent getDisplayName() {
         return new TranslationTextComponent("team.collision." + this.name);
      }
   }
}
