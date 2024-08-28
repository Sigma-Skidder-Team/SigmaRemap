package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5177 extends Module {
    public Class5177() {
        super(ModuleCategory.MISC, "ChatCleaner", "Cleans chat in atempt to avoid spam on anarchy servers");
    }

    @EventTarget
    private void method16119(Class4396 var1) {
        if (this.method15996()) {
            if (var1.method13898() instanceof Class5616) {
                Class5616 var4 = (Class5616) var1.method13898();
                if (this.method16121(this.method16120(var4.method17648().getString()))) {
                    var1.method13900(true);
                }
            }
        }
    }

    private String method16120(String var1) {
        if (!var1.startsWith("<")) {
            var1 = var1.replaceAll("^(.*?): ", "");
        } else {
            var1 = var1.replaceAll("^(.*?)> ", "");
        }

        return var1.toLowerCase();
    }

    private boolean method16121(String var1) {
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
                                                                    return var1.startsWith("Bye, Bye ") || var1.startsWith("I just ") && var1.endsWith("!");
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
