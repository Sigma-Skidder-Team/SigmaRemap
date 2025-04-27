// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class4317;
import mapped.Class5721;
import mapped.EventListener;

public class ChatFilter extends Module
{
    public ChatFilter() {
        super(Category.MISC, "ChatFilter", "Bypasse chat filters");
    }
    
    @EventListener
    private void method10485(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (class5721.method16990() instanceof Class4317) {
                final Class4317 class5722 = (Class4317)class5721.method16990();
                final String[] split = class5722.field19346.split(" ");
                if (class5722.field19346.length() + split.length <= 100) {
                    final StringBuilder sb = new StringBuilder();
                    int n = 0;
                    for (int i = 0; i < split.length; ++i) {
                        if (!split[i].startsWith("/")) {
                            if (split.length != 0) {
                                sb.append(" ");
                            }
                            sb.append(split[i].charAt(0) + "\uf8ff" + split[i].substring(1));
                        }
                        else {
                            sb.append(split[i]);
                            n = ((!split[i].equals("/r") && !split[i].equals("/msg")) ? 1 : 0);
                        }
                    }
                    if (n == 0) {
                        class5722.field19346 = sb.toString();
                    }
                }
            }
        }
    }
}
