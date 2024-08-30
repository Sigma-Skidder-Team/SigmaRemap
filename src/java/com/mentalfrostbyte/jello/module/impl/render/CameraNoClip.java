package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class CameraNoClip extends Module {
    public CameraNoClip() {
        super(ModuleCategory.RENDER, "CameraNoClip", "Camera clips through walls in F5");
    }
}
