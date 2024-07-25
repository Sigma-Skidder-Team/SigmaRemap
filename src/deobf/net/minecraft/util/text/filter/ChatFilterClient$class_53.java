package net.minecraft.util.text.filter;

import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import remapped.class_2696;
import remapped.class_9665;

public class ChatFilterClient$class_53 implements IChatFilter {
   private final GameProfile field_244585_b;
   private final Executor field_244586_c;

   private ChatFilterClient$class_53(ChatFilterClient this$0, GameProfile p_i244507_2_) {
      this.this$0 = this$0;
      this.field_244585_b = p_i244507_2_;
      class_2696 var5 = class_2696.method_12148(ChatFilterClient.access$200(this$0), "chat stream for " + p_i244507_2_.getName());
      this.field_244586_c = var5::method_40495;
   }

   @Override
   public void func_244800_a() {
      ChatFilterClient.access$400(this.this$0, this.field_244585_b, ChatFilterClient.access$300(this.this$0), this.field_244586_c);
   }

   @Override
   public void func_244434_b() {
      ChatFilterClient.access$400(this.this$0, this.field_244585_b, ChatFilterClient.access$500(this.this$0), this.field_244586_c);
   }

   @Override
   public CompletableFuture<Optional<List<String>>> func_244433_a(List<String> p_244433_1_) {
      List var4 = p_244433_1_.stream()
         .<CompletableFuture>map(
            p_244589_1_ -> ChatFilterClient.access$700(
                  this.this$0, this.field_244585_b, p_244589_1_, ChatFilterClient.access$600(this.this$0), this.field_244586_c
               )
         )
         .collect(ImmutableList.toImmutableList());
      return class_9665.method_44680(var4)
         .<Optional<List<String>>>thenApply(
            p_244590_0_ -> Optional.<List<String>>of(
                  p_244590_0_.stream().<String>map(p_244588_0_ -> p_244588_0_.orElse("")).collect(ImmutableList.toImmutableList())
               )
         )
         .exceptionally(p_244587_0_ -> Optional.<List<String>>empty());
   }

   @Override
   public CompletableFuture<Optional<String>> func_244432_a(String p_244432_1_) {
      return ChatFilterClient.access$700(this.this$0, this.field_244585_b, p_244432_1_, ChatFilterClient.access$600(this.this$0), this.field_244586_c);
   }
}
