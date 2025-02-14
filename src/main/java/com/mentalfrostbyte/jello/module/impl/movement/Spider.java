package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.spider.JumpSpider;
import com.mentalfrostbyte.jello.module.impl.movement.spider.MinemenSpider;
import com.mentalfrostbyte.jello.module.impl.movement.spider.VanillaSpider;

public class Spider extends ModuleWithModuleSettings {
    public Spider() {
        super(ModuleCategory.MOVEMENT,
                "Spider",
                "Climp walls like spiders",
                new VanillaSpider(),
                new JumpSpider(),
                new MinemenSpider());
    }
}
