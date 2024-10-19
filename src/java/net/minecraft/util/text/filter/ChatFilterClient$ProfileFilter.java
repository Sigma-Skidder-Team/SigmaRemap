package net.minecraft.util.text.filter;

import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import mapped.Class322;
import net.minecraft.util.Util;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class ChatFilterClient$ProfileFilter implements IChatFilter {
   private final GameProfile field_244585_b;
   private final Executor field_244586_c;
   public final ChatFilterClient this$0;

   public ChatFilterClient$ProfileFilter(ChatFilterClient this$0, GameProfile p_i244507_2_) {
      this.this$0 = this$0;
      this.field_244585_b = p_i244507_2_;
      Class322 var5 = Class322.method1650(ChatFilterClient.access$200(this$0), "chat stream for " + p_i244507_2_.getName());
      this.field_244586_c = var5::enqueue;
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
      List<CompletableFuture<Optional<String>>> var4 = p_244433_1_.stream().map(p_244589_1_ ->
                      ChatFilterClient.access$700(
                  this.this$0, this.field_244585_b, p_244589_1_, ChatFilterClient.access$600(this.this$0), this.field_244586_c
               )
         )
         .collect(ImmutableList.toImmutableList());

      return Util.gather(var4)
         .thenApply(p_244590_0_ -> Optional.<List<String>>of(
                  p_244590_0_.stream().map(p_244588_0_ -> p_244588_0_.orElse("")).collect(ImmutableList.toImmutableList())
               )
         )
         .exceptionally(p_244587_0_ -> Optional.empty());
   }

   @Override
   public CompletableFuture<Optional<String>> func_244432_a(String p_244432_1_) {
      return ChatFilterClient.access$700(this.this$0, this.field_244585_b, p_244432_1_, ChatFilterClient.access$600(this.this$0), this.field_244586_c);
   }
}
