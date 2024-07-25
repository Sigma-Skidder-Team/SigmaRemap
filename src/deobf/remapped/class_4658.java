package remapped;

public class class_4658 extends class_9128 {
   public class_4658() {
      super(class_5664.field_28711, "ChatCleaner", "Cleans chat in atempt to avoid spam on anarchy servers");
   }

   @class_9148
   private void method_21556(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_5182) {
            class_5182 var4 = (class_5182)var1.method_557();
            if (this.method_21555(this.method_21554(var4.method_23768().getString()))) {
               var1.method_29715(true);
            }
         }
      }
   }

   private String method_21554(String var1) {
      if (!var1.startsWith("<")) {
         var1 = var1.replaceAll("^(.*?): ", "");
      } else {
         var1 = var1.replaceAll("^(.*?)> ", "");
      }

      return var1.toLowerCase();
   }

   private boolean method_21555(String var1) {
      if (!var1.startsWith("> ")) {
         if (!var1.contains("http://")) {
            if (!var1.contains("https://")) {
               if (!var1.contains("discord.gg")) {
                  if (!var1.contains("www.")) {
                     if (!var1.contains("ʳᵘˢʰᵉʳʰᵃᶜᵏ")) {
                        if (!var1.contains("♿")) {
                           if (!var1.contains("/ignore")) {
                              if (!var1.contains("#TeamRusher")) {
                                 if (!var1.contains("Default Message")) {
                                    if (!var1.contains("wwe")) {
                                       if (!var1.contains("future")) {
                                          if (!var1.contains("iknowimez")) {
                                             if (!var1.contains("lol get gud")) {
                                                if (var1.contains(": [") || var1.contains("] [")) {
                                                   return true;
                                                } else if (var1.startsWith("!")) {
                                                   return true;
                                                } else if (var1.startsWith("TPS: ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Hey, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Hello, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Farewell, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Howdy, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Good evening, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Good bye, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Bye, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Later, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("See you next time, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("See you later, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Welcome to 2b2t.org, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Greetings, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Catch ya later, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Good to see you, ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Hope you had a good time, ")) {
                                                   return true;
                                                } else if (var1.startsWith("Aww, it's you ") && var1.endsWith(".")) {
                                                   return true;
                                                } else if (var1.startsWith("Well, It was nice to have you here, ")) {
                                                   return true;
                                                } else {
                                                   return var1.startsWith("Bye, Bye ") ? true : var1.startsWith("I just ") && var1.endsWith("!");
                                                }
                                             } else {
                                                return true;
                                             }
                                          } else {
                                             return true;
                                          }
                                       } else {
                                          return true;
                                       }
                                    } else {
                                       return true;
                                    }
                                 } else {
                                    return true;
                                 }
                              } else {
                                 return true;
                              }
                           } else {
                              return true;
                           }
                        } else {
                           return true;
                        }
                     } else {
                        return true;
                     }
                  } else {
                     return true;
                  }
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }
}
