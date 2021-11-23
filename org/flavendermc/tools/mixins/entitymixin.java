package org.flavendermc.tools.mixins;

import org.flavendermc.*;

public class entitymixin extends mcmixin {
    public static String entity;

    public void entitymixin(String entity) {
        this.entity = this.mc.getInstance().getWolrd().getEntity();
    }
}
