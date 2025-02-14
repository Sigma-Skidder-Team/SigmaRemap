package net.minecraft.util;

public enum ActionResultType {
    SUCCESS,
   field14819,
   field14820,
    FAIL;

   private static final ActionResultType[] field14822 = new ActionResultType[]{SUCCESS, field14819, field14820, FAIL};

   public boolean isSuccessOrConsume() {
      return this == SUCCESS || this == field14819;
   }

   public boolean isSuccess() {
      return this == SUCCESS;
   }

   public static ActionResultType method9002(boolean var0) {
      return !var0 ? field14819 : SUCCESS;
   }
}
