package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.SocialInteractionsService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class class_9186 {
   private static String[] field_47000;
   private final MinecraftClient field_47003;
   private final Set<UUID> field_47001 = Sets.newHashSet();
   private final SocialInteractionsService field_46999;
   private final Map<String, UUID> field_47002 = Maps.newHashMap();

   public class_9186(MinecraftClient var1, SocialInteractionsService var2) {
      this.field_47003 = var1;
      this.field_46999 = var2;
   }

   public void method_42338(UUID var1) {
      this.field_47001.add(var1);
   }

   public void method_42340(UUID var1) {
      this.field_47001.remove(var1);
   }

   public boolean method_42337(UUID var1) {
      return this.method_42339(var1) || this.method_42336(var1);
   }

   public boolean method_42339(UUID var1) {
      return this.field_47001.contains(var1);
   }

   public boolean method_42336(UUID var1) {
      return this.field_46999.isBlockedPlayer(var1);
   }

   public Set<UUID> method_42334() {
      return this.field_47001;
   }

   public UUID method_42342(String var1) {
      return this.field_47002.getOrDefault(var1, class_9665.field_49232);
   }

   public void method_42343(class_753 var1) {
      GameProfile var4 = var1.method_3392();
      if (var4.isComplete()) {
         this.field_47002.put(var4.getName(), var4.getId());
      }

      Screen var5 = this.field_47003.field_9623;
      if (var5 instanceof class_1840) {
         class_1840 var6 = (class_1840)var5;
         var6.method_8133(var1);
      }
   }

   public void method_42341(UUID var1) {
      Screen var4 = this.field_47003.field_9623;
      if (var4 instanceof class_1840) {
         class_1840 var5 = (class_1840)var4;
         var5.method_8134(var1);
      }
   }
}
